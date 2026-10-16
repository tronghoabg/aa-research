from pathlib import Path

from capstone import CS_ARCH_ARM64, CS_MODE_ARM, Cs
from elftools.elf.elffile import ELFFile


LIB = Path(__file__).parent / "arm64/lib/arm64-v8a/libwynlib.so"
NAMES = {
    "frbgen_wyn_wire__crate__api__api__wyn_database_create",
    "frbgen_wyn_wire__crate__api__api__probe_sl",
    "frbgen_wyn_wire__crate__api__api__probe_ss_list",
}

with LIB.open("rb") as stream:
    elf = ELFFile(stream)
    dynsym = elf.get_section_by_name(".dynsym")
    text = elf.get_section_by_name(".text")
    text_addr = text["sh_addr"]
    text_data = text.data()
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)

    for symbol in dynsym.iter_symbols():
        if symbol.name not in NAMES:
            continue
        address = symbol["st_value"]
        size = symbol["st_size"] or 0x180
        offset = address - text_addr
        code = text_data[offset : offset + min(size, 0x300)]
        print(f"\n=== {symbol.name} address=0x{address:x} size=0x{size:x} ===")
        for instruction in md.disasm(code, address):
            print(f"0x{instruction.address:08x}: {instruction.mnemonic:8} {instruction.op_str}")
