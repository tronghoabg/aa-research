package kf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39711a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f39712b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f39713c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f39714d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f39711a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f39712b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f39713c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f39714d = aVarArr;
        ic.d.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f39714d.clone();
    }
}
