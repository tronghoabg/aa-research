package kotlinx.b.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f51104a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f51105b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f51106c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f51107d;

    static {
        a aVar = new a("NONE", 0);
        f51104a = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        f51105b = aVar2;
        a aVar3 = new a("POLYMORPHIC", 2);
        f51106c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f51107d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f51107d.clone();
    }
}
