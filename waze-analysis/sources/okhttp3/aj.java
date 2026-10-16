package okhttp3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    public static final aj f55873a;

    /* renamed from: b, reason: collision with root package name */
    public static final aj f55874b;

    /* renamed from: c, reason: collision with root package name */
    public static final aj f55875c;

    /* renamed from: d, reason: collision with root package name */
    public static final aj f55876d;

    /* renamed from: e, reason: collision with root package name */
    public static final aj f55877e;

    /* renamed from: f, reason: collision with root package name */
    public static final aj f55878f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ aj[] f55879g;

    /* renamed from: h, reason: collision with root package name */
    private final String f55880h;

    static {
        aj ajVar = new aj("HTTP_1_0", 0, "http/1.0");
        f55873a = ajVar;
        aj ajVar2 = new aj("HTTP_1_1", 1, "http/1.1");
        f55874b = ajVar2;
        aj ajVar3 = new aj("SPDY_3", 2, "spdy/3.1");
        f55875c = ajVar3;
        aj ajVar4 = new aj("HTTP_2", 3, "h2");
        f55876d = ajVar4;
        aj ajVar5 = new aj("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f55877e = ajVar5;
        aj ajVar6 = new aj("QUIC", 5, "quic");
        f55878f = ajVar6;
        aj[] ajVarArr = {ajVar, ajVar2, ajVar3, ajVar4, ajVar5, ajVar6};
        f55879g = ajVarArr;
        h.d.b.a(ajVarArr);
    }

    private aj(String str, int i2, String str2) {
        this.f55880h = str2;
    }

    public static aj[] values() {
        return (aj[]) f55879g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f55880h;
    }
}
