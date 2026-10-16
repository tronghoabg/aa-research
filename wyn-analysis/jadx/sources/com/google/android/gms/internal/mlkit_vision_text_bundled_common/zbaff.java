package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaff extends zbuf implements zbvn {
    private static final zbaff zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbaff zbaffVar = new zbaff();
        zbb = zbaffVar;
        zbuf.zbD(zbaff.class, zbaffVar);
    }

    private zbaff() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbafd.class});
        }
        if (i10 == 3) {
            return new zbaff();
        }
        zbafb zbafbVar = null;
        if (i10 == 4) {
            return new zbafe(zbafbVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
