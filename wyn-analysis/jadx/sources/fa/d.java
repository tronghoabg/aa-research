package fa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f35276a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f35277b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f35278c;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        f35276a = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        f35277b = dVar2;
        f35278c = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f35278c.clone();
    }
}
