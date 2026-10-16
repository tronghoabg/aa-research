package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbot extends zbuf implements zbvn {
    private static final zbot zbb;
    private int zbd;
    private double zbe;
    private double zbf;

    static {
        zbot zbotVar = new zbot();
        zbb = zbotVar;
        zbuf.zbD(zbot.class, zbotVar);
    }

    private zbot() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbot();
        }
        zboq zboqVar = null;
        if (i10 == 4) {
            return new zbos(zboqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
