package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaid extends zbuf implements zbvn {
    private static final zbaid zbb;
    private float zbd;
    private float zbe;

    static {
        zbaid zbaidVar = new zbaid();
        zbb = zbaidVar;
        zbuf.zbD(zbaid.class, zbaidVar);
    }

    private zbaid() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"zbd", "zbe"});
        }
        if (i10 == 3) {
            return new zbaid();
        }
        zbaib zbaibVar = null;
        if (i10 == 4) {
            return new zbaic(zbaibVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
