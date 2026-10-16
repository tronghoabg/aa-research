from pathlib import Path
import sys

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN


data = Path(r"D:\AA\wyn-analysis\arm64\lib\arm64-v8a\libapp.so").read_bytes()
targets = {int(value, 0) for value in sys.argv[1:]}
md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)

for insn in md.disasm(data[0x2D0000:0xB30600], 0x2D0000):
    if insn.mnemonic not in {"bl", "b"} or not insn.op_str.startswith("#0x"):
        continue
    if int(insn.op_str[1:], 0) in targets:
        print(f"0x{insn.address:x}: {insn.mnemonic} {insn.op_str}")
