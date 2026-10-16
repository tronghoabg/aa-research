package kotlinx.coroutines.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f51271a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f51272b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f51273c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f51274d;

    static {
        a aVar = new a("SUSPEND", 0);
        f51271a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f51272b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f51273c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f51274d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f51274d.clone();
    }
}
