package Ef;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f3663a;

    /* renamed from: b, reason: collision with root package name */
    public static final F f3664b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f3665c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f3666d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ F[] f3667e;

    static {
        F f10 = new F("DEFAULT", 0);
        f3663a = f10;
        F f11 = new F("LAZY", 1);
        f3664b = f11;
        F f12 = new F("ATOMIC", 2);
        f3665c = f12;
        F f13 = new F("UNDISPATCHED", 3);
        f3666d = f13;
        F[] fArr = {f10, f11, f12, f13};
        f3667e = fArr;
        ic.d.t(fArr);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f3667e.clone();
    }
}
