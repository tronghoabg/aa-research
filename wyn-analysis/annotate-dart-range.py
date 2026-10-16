from pathlib import Path
import re
import sys

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

start = int(sys.argv[1], 0)
end = int(sys.argv[2], 0)
root = Path(r"D:\AA\wyn-analysis")
data = (root / "arm64/lib/arm64-v8a/libapp.so").read_bytes()
pool = {}
for line in (root / "blutter-linux-out/pp.txt").read_text(encoding="utf-8").splitlines():
    match = re.match(r"\[pp\+0x([0-9a-f]+)\] (.*)", line)
    if match:
        pool[int(match.group(1), 16)] = match.group(2)

md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
instructions = list(md.disasm(data[start:end], start))
for index, ins in enumerate(instructions):
    annotation = ""
    match = re.match(r"x(\d+), x27, #(0x[0-9a-f]+|\d+), lsl #12", ins.op_str)
    if match:
        register = f"x{match.group(1)}"
        base = int(match.group(2), 0) << 12
        for nxt in instructions[index + 1:index + 4]:
            load = re.match(rf"x\d+, \[{register}, #(0x[0-9a-f]+|\d+)\]", nxt.op_str)
            if nxt.mnemonic == "ldr" and load:
                offset = base + int(load.group(1), 0)
                annotation = f" ; [pp+0x{offset:x}] {pool.get(offset, '')}"
                break
    print(f"0x{ins.address:x}: {ins.mnemonic:8} {ins.op_str}{annotation}")
