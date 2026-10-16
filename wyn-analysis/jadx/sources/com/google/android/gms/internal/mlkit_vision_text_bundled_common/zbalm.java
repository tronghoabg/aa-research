package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbalm extends zbuf implements zbvn {
    private static final zbalm zbb;

    static {
        zbalm zbalmVar = new zbalm();
        zbb = zbalmVar;
        zbuf.zbD(zbalm.class, zbalmVar);
    }

    private zbalm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zbalk zbalkVar = null;
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0000", null);
        }
        if (i10 == 3) {
            return new zbalm();
        }
        if (i10 == 4) {
            return new zball(zbalkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
