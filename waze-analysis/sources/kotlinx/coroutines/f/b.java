package kotlinx.coroutines.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f51941a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f51942b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f51943c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f51944d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f51945e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f51946f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f51941a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f51942b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f51943c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f51944d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f51945e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f51946f = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f51946f.clone();
    }
}
