package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbajt extends zbuf implements zbvn {
    private static final zbajt zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private String zbg = "";

    static {
        zbajt zbajtVar = new zbajt();
        zbb = zbajtVar;
        zbuf.zbD(zbajt.class, zbajtVar);
    }

    private zbajt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbajt();
        }
        zbajr zbajrVar = null;
        if (i10 == 4) {
            return new zbajs(zbajrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
