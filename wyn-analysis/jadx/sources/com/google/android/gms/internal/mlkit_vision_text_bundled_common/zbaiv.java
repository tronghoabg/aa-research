package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaiv extends zbuf implements zbvn {
    private static final zbaiv zbb;
    private int zbd;
    private String zbe = "visionkit-pa.googleapis.com";
    private String zbf = "";
    private zbun zbg = zbuf.zby();

    static {
        zbaiv zbaivVar = new zbaiv();
        zbb = zbaivVar;
        zbuf.zbD(zbaiv.class, zbaivVar);
    }

    private zbaiv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", zbaiu.class});
        }
        if (i10 == 3) {
            return new zbaiv();
        }
        zbair zbairVar = null;
        if (i10 == 4) {
            return new zbais(zbairVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
