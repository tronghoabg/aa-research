package okhttp3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    public static final av f55925a;

    /* renamed from: b, reason: collision with root package name */
    public static final av f55926b;

    /* renamed from: c, reason: collision with root package name */
    public static final av f55927c;

    /* renamed from: d, reason: collision with root package name */
    public static final av f55928d;

    /* renamed from: e, reason: collision with root package name */
    public static final av f55929e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ av[] f55930f;

    /* renamed from: g, reason: collision with root package name */
    private final String f55931g;

    static {
        av avVar = new av("TLS_1_3", 0, "TLSv1.3");
        f55925a = avVar;
        av avVar2 = new av("TLS_1_2", 1, "TLSv1.2");
        f55926b = avVar2;
        av avVar3 = new av("TLS_1_1", 2, "TLSv1.1");
        f55927c = avVar3;
        av avVar4 = new av("TLS_1_0", 3, "TLSv1");
        f55928d = avVar4;
        av avVar5 = new av("SSL_3_0", 4, "SSLv3");
        f55929e = avVar5;
        av[] avVarArr = {avVar, avVar2, avVar3, avVar4, avVar5};
        f55930f = avVarArr;
        h.d.b.a(avVarArr);
    }

    private av(String str, int i2, String str2) {
        this.f55931g = str2;
    }

    public static av[] values() {
        return (av[]) f55930f.clone();
    }

    public final String a() {
        return this.f55931g;
    }
}
