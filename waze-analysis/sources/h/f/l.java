package h.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f48089a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f48090b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ l[] f48091c;

    static {
        l lVar = new l("TOP_DOWN", 0);
        f48089a = lVar;
        l lVar2 = new l("BOTTOM_UP", 1);
        f48090b = lVar2;
        l[] lVarArr = {lVar, lVar2};
        f48091c = lVarArr;
        h.d.b.a(lVarArr);
    }

    public static l[] values() {
        return (l[]) f48091c.clone();
    }
}
