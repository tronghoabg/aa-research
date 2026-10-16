package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbek extends zbuf implements zbvn {
    private static final zbek zbb;
    private int zbd;
    private long zbe;
    private float zbf;

    static {
        zbek zbekVar = new zbek();
        zbb = zbekVar;
        zbuf.zbD(zbek.class, zbekVar);
    }

    private zbek() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbek();
        }
        zbei zbeiVar = null;
        if (i10 == 4) {
            return new zbej(zbeiVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
