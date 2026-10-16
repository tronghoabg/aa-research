package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbnm extends zbuf implements zbvn {
    private static final zbnm zbb;
    private int zbd;
    private zbnt zbe;
    private float zbf;
    private int zbg;
    private boolean zbh;

    static {
        zbnm zbnmVar = new zbnm();
        zbb = zbnmVar;
        zbuf.zbD(zbnm.class, zbnmVar);
    }

    private zbnm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", zbnl.zba, "zbh"});
        }
        if (i10 == 3) {
            return new zbnm();
        }
        zbnj zbnjVar = null;
        if (i10 == 4) {
            return new zbnk(zbnjVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
