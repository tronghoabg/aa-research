package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbly extends zbuf implements zbvn {
    private static final zbly zbb;
    private String zbd = "";
    private boolean zbe;

    static {
        zbly zblyVar = new zbly();
        zbb = zblyVar;
        zbuf.zbD(zbly.class, zblyVar);
    }

    private zbly() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"zbd", "zbe"});
        }
        if (i10 == 3) {
            return new zbly();
        }
        zblq zblqVar = null;
        if (i10 == 4) {
            return new zblx(zblqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
