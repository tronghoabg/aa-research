package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaeh extends zbuf implements zbvn {
    private static final zbaeh zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;

    static {
        zbaeh zbaehVar = new zbaeh();
        zbb = zbaehVar;
        zbuf.zbD(zbaeh.class, zbaehVar);
    }

    private zbaeh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new zbaeh();
        }
        zbaef zbaefVar = null;
        if (i10 == 4) {
            return new zbaeg(zbaefVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
