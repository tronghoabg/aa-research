package defpackage;

/* loaded from: classes.dex */
public final class blc {
    public static final long b;
    public static final aft c;
    public static final aef a = new aef(Float.NaN, Float.NaN);
    public static final bii d = new bii(new bes(13), new bes(14), (byte[]) null);

    static {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        b = jFloatToRawIntBits;
        c = new aft(1.0f, 1500.0f, new cja(jFloatToRawIntBits));
    }

    public static final long a(bym bymVar) {
        return ((cja) bymVar.a()).a;
    }
}
