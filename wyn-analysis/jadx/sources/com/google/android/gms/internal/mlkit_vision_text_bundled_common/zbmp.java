package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbmp extends zbub implements zbvn {
    private static final zbmp zbd;
    private byte zbe = 2;

    static {
        zbmp zbmpVar = new zbmp();
        zbd = zbmpVar;
        zbuf.zbD(zbmp.class, zbmpVar);
    }

    private zbmp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbe);
        }
        zbml zbmlVar = null;
        if (i10 == 2) {
            return zbuf.zbA(zbd, "\u0001\u0000", null);
        }
        if (i10 == 3) {
            return new zbmp();
        }
        if (i10 == 4) {
            return new zbmo(zbmlVar);
        }
        if (i10 == 5) {
            return zbd;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
