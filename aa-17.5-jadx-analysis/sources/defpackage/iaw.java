package defpackage;

/* loaded from: classes2.dex */
public abstract class iaw {
    public static final iaw b;
    public static final iaw c;
    public static final iaw d;
    public static final iaw e;
    public static final iaw f;
    public static final hul g;
    static final boolean h;

    static {
        int i = iap.a;
        int i2 = iaq.a;
        b = new iau();
        c = new iar();
        d = new ias();
        e = new iav();
        iat iatVar = new iat();
        f = iatVar;
        g = new hul("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", iatVar, hul.a);
        h = true;
    }

    public abstract float a(int i, int i2, int i3, int i4);

    public abstract int b(int i, int i2, int i3, int i4);
}
