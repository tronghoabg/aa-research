package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbafw extends zbuf implements zbvn {
    private static final zbafw zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        zbafw zbafwVar = new zbafw();
        zbb = zbafwVar;
        zbuf.zbD(zbafw.class, zbafwVar);
    }

    private zbafw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002=\u0000", new Object[]{"zbe", "zbd"});
        }
        if (i10 == 3) {
            return new zbafw();
        }
        zbafu zbafuVar = null;
        if (i10 == 4) {
            return new zbafv(zbafuVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
