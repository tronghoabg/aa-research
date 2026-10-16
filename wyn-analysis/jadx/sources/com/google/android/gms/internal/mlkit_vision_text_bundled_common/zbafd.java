package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbafd extends zbuf implements zbvn {
    private static final zbafd zbb;
    private int zbd;
    private int zbf;
    private String zbe = "";
    private zbuk zbg = zbuf.zbv();
    private String zbh = "";
    private zbun zbi = zbuf.zby();

    static {
        zbafd zbafdVar = new zbafd();
        zbb = zbafdVar;
        zbuf.zbD(zbafd.class, zbafdVar);
    }

    private zbafd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003$\u0004ဈ\u0002\u0005\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i10 == 3) {
            return new zbafd();
        }
        zbafb zbafbVar = null;
        if (i10 == 4) {
            return new zbafc(zbafbVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
