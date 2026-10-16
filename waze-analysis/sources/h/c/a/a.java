package h.c.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f48038a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f48039b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f48040c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f48041d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f48038a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f48039b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f48040c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f48041d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f48041d.clone();
    }
}
