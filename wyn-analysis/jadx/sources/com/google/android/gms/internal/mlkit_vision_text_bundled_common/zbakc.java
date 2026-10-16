package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbakc extends zbuf implements zbvn {
    private static final zbakc zbb;

    static {
        zbakc zbakcVar = new zbakc();
        zbb = zbakcVar;
        zbuf.zbD(zbakc.class, zbakcVar);
    }

    private zbakc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zbaka zbakaVar = null;
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0000", null);
        }
        if (i10 == 3) {
            return new zbakc();
        }
        if (i10 == 4) {
            return new zbakb(zbakaVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
