package v9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f47105a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f47106b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f47107c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f47108d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f47109e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f47110f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r[] f47111g;

    static {
        r rVar = new r("Initial", 0);
        f47105a = rVar;
        r rVar2 = new r("Starting", 1);
        f47106b = rVar2;
        r rVar3 = new r("Open", 2);
        f47107c = rVar3;
        r rVar4 = new r("Healthy", 3);
        f47108d = rVar4;
        r rVar5 = new r("Error", 4);
        f47109e = rVar5;
        r rVar6 = new r("Backoff", 5);
        f47110f = rVar6;
        f47111g = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f47111g.clone();
    }
}
