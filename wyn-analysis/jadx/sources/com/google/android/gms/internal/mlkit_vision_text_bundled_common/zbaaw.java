package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaaw extends zbuf implements zbvn {
    private static final zbaaw zbb;
    private int zbd;
    private byte zbg = 2;
    private String zbe = "";
    private float zbf = 1.0f;

    static {
        zbaaw zbaawVar = new zbaaw();
        zbb = zbaawVar;
        zbuf.zbD(zbaaw.class, zbaawVar);
    }

    private zbaaw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new zbaaw();
        }
        zbaad zbaadVar = null;
        if (i10 == 4) {
            return new zbaav(zbaadVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final float zbc() {
        return this.zbf;
    }

    public final String zbf() {
        return this.zbe;
    }
}
