package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaam extends zbuf implements zbvn {
    private static final zbaam zbb;
    private int zbd;
    private zbpb zbf;
    private float zbg;
    private byte zbh = 2;
    private int zbe = 2;

    static {
        zbaam zbaamVar = new zbaam();
        zbb = zbaamVar;
        zbuf.zbD(zbaam.class, zbaamVar);
    }

    private zbaam() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001\u0007ခ\u0002", new Object[]{"zbd", "zbe", zbaak.zba, "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbaam();
        }
        zbaad zbaadVar = null;
        if (i10 == 4) {
            return new zbaal(zbaadVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
