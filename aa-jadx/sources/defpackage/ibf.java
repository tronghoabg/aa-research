package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ibf {
    public static final defpackage.ibf b;
    public static final defpackage.ibf c;
    public static final defpackage.ibf d;
    public static final defpackage.ibf e;
    public static final defpackage.ibf f;
    public static final defpackage.huv g;
    static final boolean h;

    static {
        int i = defpackage.iay.a;
        int i2 = defpackage.iaz.a;
        b = new defpackage.ibd();
        c = new defpackage.iba();
        d = new defpackage.ibb();
        e = new defpackage.ibe();
        defpackage.ibc ibcVar = new defpackage.ibc();
        f = ibcVar;
        g = new defpackage.huv("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", ibcVar, defpackage.huv.a);
        h = true;
    }

    public abstract float a(int i, int i2, int i3, int i4);

    public abstract int b(int i, int i2, int i3, int i4);
}
