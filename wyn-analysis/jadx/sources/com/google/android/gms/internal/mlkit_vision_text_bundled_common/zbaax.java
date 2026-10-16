package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* loaded from: classes4.dex */
public final class zbaax extends zbuf implements zbvn {
    private static final zbaax zbb;
    private byte zbe = 2;
    private zbun zbd = zbuf.zby();

    static {
        zbaax zbaaxVar = new zbaax();
        zbb = zbaaxVar;
        zbuf.zbD(zbaax.class, zbaaxVar);
    }

    private zbaax() {
    }

    public static zbaax zbe() {
        return zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", zbaaw.class});
        }
        if (i10 == 3) {
            return new zbaax();
        }
        zbaad zbaadVar = null;
        if (i10 == 4) {
            return new zbaau(zbaadVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zbf() {
        return this.zbd;
    }
}
