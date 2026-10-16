from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

data = Path(r"D:\AA\wyn-analysis\arm64\lib\arm64-v8a\libapp.so").read_bytes()
targets = {0x17030, 0x17060, 0x17088, 0x172C8, 0x172D8, 0x172E8, 0x17300, 0x17308, 0x17310, 0x17320, 0x17328, 0x17378}
md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)

for address in range(0x2D0000, 0xB30600 - 8, 4):
    first = next(md.disasm(data[address:address + 4], address), None)
    if not first or first.mnemonic != "add" or "x27" not in first.op_str or "lsl #12" not in first.op_str:
        continue
    parts = first.op_str.replace("#", "").split(", ")
    if len(parts) != 4:
        continue
    base_offset = int(parts[2], 0) << 12
    for offset in (4, 8, 12):
        second = next(md.disasm(data[address + offset:address + offset + 4], address + offset), None)
        if not second or second.mnemonic != "ldr" or f"[{parts[0]}, " not in second.op_str or "#" not in second.op_str:
            continue
        displacement = int(second.op_str.rsplit("#", 1)[1].rstrip("]"), 0)
        pp_offset = base_offset + displacement
        if pp_offset in targets:
            print(f"pp+0x{pp_offset:x} at 0x{address:x}/0x{address + offset:x}")
