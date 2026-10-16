package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbjg extends zbuf implements zbvn {
    private static final zbjg zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private String zbf = "";

    static {
        zbjg zbjgVar = new zbjg();
        zbb = zbjgVar;
        zbuf.zbD(zbjg.class, zbjgVar);
    }

    private zbjg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zbd", "zbe", zbjd.class, "zbf"});
        }
        if (i10 == 3) {
            return new zbjg();
        }
        zbje zbjeVar = null;
        if (i10 == 4) {
            return new zbjf(zbjeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
