package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaap extends zbuf implements zbvn {
    private static final zbaap zbb;
    private int zbd;
    private float zbe;
    private float zbf;

    static {
        zbaap zbaapVar = new zbaap();
        zbb = zbaapVar;
        zbuf.zbD(zbaap.class, zbaapVar);
    }

    private zbaap() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbaap();
        }
        zbaad zbaadVar = null;
        if (i10 == 4) {
            return new zbaao(zbaadVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
