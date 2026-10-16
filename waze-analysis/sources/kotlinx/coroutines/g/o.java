package kotlinx.coroutines.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f52011a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f52012b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f52013c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f52014d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ o[] f52015e;

    static {
        o oVar = new o("SUCCESSFUL", 0);
        f52011a = oVar;
        o oVar2 = new o("REREGISTER", 1);
        f52012b = oVar2;
        o oVar3 = new o("CANCELLED", 2);
        f52013c = oVar3;
        o oVar4 = new o("ALREADY_SELECTED", 3);
        f52014d = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        f52015e = oVarArr;
        h.d.b.a(oVarArr);
    }

    public static o[] values() {
        return (o[]) f52015e.clone();
    }
}
