
def byte_xor(ba1, ba2):
    return bytes([_a ^ _b for _a, _b in zip(ba1, ba2)])


key = b'LOREMIPSUMDOLORSI'
c = b"\x04\x04\x1c>7~}'\x18`\x17\x01\x0b6\x06!4"

a = byte_xor(key, c)

print(a)


