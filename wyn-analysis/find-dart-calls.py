from pathlib import Path
import struct

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM


path = Path(r"D:\AA\wyn-analysis\arm64\lib\arm64-v8a\libapp.so")
data = path.read_bytes()

# The snapshot instruction segment uses equal file and virtual offsets in this ELF.
targets = {0xAF0358: "AllocateProbeParam", 0xAF0314: "AllocateStreetSignConfig", 0xAF0750: "AllocateSpeedLimitProbeParam"}
md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
md.detail = True

for instruction in md.disasm(data[0x2E6880:], 0x2E6880):
    if instruction.mnemonic != "bl" or not instruction.operands:
        continue
    target = instruction.operands[0].imm
    if target in targets:
        print(f"0x{instruction.address:x} -> {targets[target]}")
