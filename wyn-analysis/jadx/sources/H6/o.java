package H6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f4961a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f4962b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f4963c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f4964d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o[] f4965e;

    static {
        o oVar = new o("SUCCESS", 0);
        f4961a = oVar;
        o oVar2 = new o("PERMANENT_FAILURE", 1);
        f4962b = oVar2;
        o oVar3 = new o("RETRIABLE_FAILURE", 2);
        f4963c = oVar3;
        o oVar4 = new o("BUFFERED", 3);
        f4964d = oVar4;
        f4965e = new o[]{oVar, oVar2, oVar3, oVar4};
    }

    public static o[] values() {
        return (o[]) f4965e.clone();
    }
}
