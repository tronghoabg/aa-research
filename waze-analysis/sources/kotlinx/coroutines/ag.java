package kotlinx.coroutines;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final ag f51342a;

    /* renamed from: b, reason: collision with root package name */
    public static final ag f51343b;

    /* renamed from: c, reason: collision with root package name */
    public static final ag f51344c;

    /* renamed from: d, reason: collision with root package name */
    public static final ag f51345d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ag[] f51346e;

    static {
        ag agVar = new ag("DEFAULT", 0);
        f51342a = agVar;
        ag agVar2 = new ag("LAZY", 1);
        f51343b = agVar2;
        ag agVar3 = new ag("ATOMIC", 2);
        f51344c = agVar3;
        ag agVar4 = new ag("UNDISPATCHED", 3);
        f51345d = agVar4;
        ag[] agVarArr = {agVar, agVar2, agVar3, agVar4};
        f51346e = agVarArr;
        h.d.b.a(agVarArr);
    }

    public static ag[] values() {
        return (ag[]) f51346e.clone();
    }

    public final boolean a() {
        return this == f51343b;
    }
}
