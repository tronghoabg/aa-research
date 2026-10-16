package Gf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4780a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f4781b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f4782c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f4783d;

    static {
        a aVar = new a("SUSPEND", 0);
        f4780a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f4781b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f4782c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f4783d = aVarArr;
        ic.d.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4783d.clone();
    }
}
