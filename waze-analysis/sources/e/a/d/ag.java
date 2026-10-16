package e.a.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final ag f46605a;

    /* renamed from: b, reason: collision with root package name */
    public static final ag f46606b;

    /* renamed from: c, reason: collision with root package name */
    public static final ag f46607c;

    /* renamed from: d, reason: collision with root package name */
    public static final ag f46608d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ag[] f46609e;

    static {
        ag agVar = new ag("PROCESSED", 0);
        f46605a = agVar;
        ag agVar2 = new ag("REFUSED", 1);
        f46606b = agVar2;
        ag agVar3 = new ag("DROPPED", 2);
        f46607c = agVar3;
        ag agVar4 = new ag("MISCARRIED", 3);
        f46608d = agVar4;
        f46609e = new ag[]{agVar, agVar2, agVar3, agVar4};
    }

    public static ag[] values() {
        return (ag[]) f46609e.clone();
    }
}
