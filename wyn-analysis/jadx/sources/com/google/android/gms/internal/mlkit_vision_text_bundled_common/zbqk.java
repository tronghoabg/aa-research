package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbqk extends zbuf implements zbvn {
    private static final zbqk zbb;
    private int zbd;
    private zbqm zbe;
    private float zbf;
    private byte zbh = 2;
    private zbuk zbg = zbuf.zbv();

    static {
        zbqk zbqkVar = new zbqk();
        zbb = zbqkVar;
        zbuf.zbD(zbqk.class, zbqkVar);
    }

    private zbqk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new zbqk();
        }
        zbpu zbpuVar = null;
        if (i10 == 4) {
            return new zbqj(zbpuVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
