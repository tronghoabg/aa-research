package nb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f41005a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f41006b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f41007c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f41008d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f41009e;

    static {
        d dVar = new d("UNSPECIFIED", 0);
        f41005a = dVar;
        d dVar2 = new d("INTERSTITIAL", 1);
        f41006b = dVar2;
        d dVar3 = new d("REWARDED", 2);
        f41007c = dVar3;
        d dVar4 = new d("BANNER", 3);
        f41008d = dVar4;
        f41009e = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f41009e.clone();
    }
}
