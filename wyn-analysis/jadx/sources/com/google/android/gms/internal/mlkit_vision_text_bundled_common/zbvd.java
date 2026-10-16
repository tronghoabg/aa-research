package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
final class zbvd implements zbvy {
    private static final zbvk zba = new zbvb();
    private final zbvk zbb;

    public zbvd() {
        zbty zbtyVarZba = zbty.zba();
        int i5 = zbvu.zba;
        zbvc zbvcVar = new zbvc(zbtyVarZba, zba);
        byte[] bArr = zbuo.zbb;
        this.zbb = zbvcVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvy
    public final zbvx zba(Class cls) {
        int i5 = zbvz.zba;
        if (!zbuf.class.isAssignableFrom(cls)) {
            int i10 = zbvu.zba;
        }
        zbvj zbvjVarZbb = this.zbb.zbb(cls);
        if (zbvjVarZbb.zbb()) {
            int i11 = zbvu.zba;
            return zbvq.zbc(zbvz.zbm(), zbts.zba(), zbvjVarZbb.zba());
        }
        int i12 = zbvu.zba;
        return zbvp.zbl(cls, zbvjVarZbb, zbvt.zba(), zbuz.zba(), zbvz.zbm(), zbvjVarZbb.zbc() + (-1) != 1 ? zbts.zba() : null, zbvi.zba());
    }
}
