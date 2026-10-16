package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbafz extends zbuf implements zbvn {
    private static final zbafz zbb;
    private zbuk zbd = zbuf.zbv();

    static {
        zbafz zbafzVar = new zbafz();
        zbb = zbafzVar;
        zbuf.zbD(zbafz.class, zbafzVar);
    }

    private zbafz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i10 == 3) {
            return new zbafz();
        }
        zbafx zbafxVar = null;
        if (i10 == 4) {
            return new zbafy(zbafxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
