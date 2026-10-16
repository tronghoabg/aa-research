package defpackage;

/* loaded from: classes.dex */
public final class bcr {
    public static final bcm a = d();

    public static final bcm a(float f, float f2, float f3, float f4) {
        return new bcm(new bcq(f), new bcq(f2), new bcq(f3), new bcq(f4));
    }

    public static final bcm b(float f) {
        bco bcoVar = new bco(f);
        return new bcm(bcoVar, bcoVar, bcoVar, bcoVar);
    }

    public static final bcm c(float f, float f2, float f3, float f4) {
        return new bcm(new bco(f), new bco(f2), new bco(f3), new bco(f4));
    }

    public static final bcm d() {
        bcp bcpVar = new bcp(50.0f);
        return new bcm(bcpVar, bcpVar, bcpVar, bcpVar);
    }
}
