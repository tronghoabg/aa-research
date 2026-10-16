package x6;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4471b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f47731a;

    EnumC4471b(int i5) {
        this.f47731a = i5;
    }

    public static EnumC4471b a(int i5) {
        for (EnumC4471b enumC4471b : values()) {
            if (enumC4471b.f47731a == i5) {
                return enumC4471b;
            }
        }
        return null;
    }
}
