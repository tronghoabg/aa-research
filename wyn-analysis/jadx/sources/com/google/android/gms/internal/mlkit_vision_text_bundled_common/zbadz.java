package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbadz extends zbub implements zbvn {
    private static final zbadz zbd;
    private byte zbf = 2;
    private zbun zbe = zbuf.zby();

    static {
        zbadz zbadzVar = new zbadz();
        zbd = zbadzVar;
        zbuf.zbD(zbadz.class, zbadzVar);
    }

    private zbadz() {
    }

    public static zbadz zbe() {
        return zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbf);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbd, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"zbe", zbady.class});
        }
        if (i10 == 3) {
            return new zbadz();
        }
        zbadn zbadnVar = null;
        if (i10 == 4) {
            return new zbadw(zbadnVar);
        }
        if (i10 == 5) {
            return zbd;
        }
        this.zbf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
