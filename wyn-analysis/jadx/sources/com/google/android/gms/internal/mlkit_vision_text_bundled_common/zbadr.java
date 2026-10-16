package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbadr extends zbuf implements zbvn {
    private static final zbadr zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private String zbf = "";

    static {
        zbadr zbadrVar = new zbadr();
        zbb = zbadrVar;
        zbuf.zbD(zbadr.class, zbadrVar);
    }

    private zbadr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbadr();
        }
        zbadn zbadnVar = null;
        if (i10 == 4) {
            return new zbadq(zbadnVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
