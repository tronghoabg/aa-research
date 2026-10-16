package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbez extends zbuf implements zbvn {
    private static final zbez zbb;
    private int zbd;
    private String zbe = "";
    private float zbf;

    static {
        zbez zbezVar = new zbez();
        zbb = zbezVar;
        zbuf.zbD(zbez.class, zbezVar);
    }

    private zbez() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbez();
        }
        zbex zbexVar = null;
        if (i10 == 4) {
            return new zbey(zbexVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
