package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbim extends zbuf implements zbvn {
    private static final zbim zbb;
    private int zbd;
    private zbafq zbe;
    private float zbf;
    private byte zbg = 2;

    static {
        zbim zbimVar = new zbim();
        zbb = zbimVar;
        zbuf.zbD(zbim.class, zbimVar);
    }

    private zbim() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbim();
        }
        zbik zbikVar = null;
        if (i10 == 4) {
            return new zbil(zbikVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
