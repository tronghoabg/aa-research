package kotlinx.b.d.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    public static final ah f51143a;

    /* renamed from: b, reason: collision with root package name */
    public static final ah f51144b;

    /* renamed from: c, reason: collision with root package name */
    public static final ah f51145c;

    /* renamed from: d, reason: collision with root package name */
    public static final ah f51146d;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ ah[] f51147g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f51148h;

    /* renamed from: e, reason: collision with root package name */
    public final char f51149e;

    /* renamed from: f, reason: collision with root package name */
    public final char f51150f;

    static {
        ah ahVar = new ah("OBJ", 0, '{', '}');
        f51143a = ahVar;
        ah ahVar2 = new ah("LIST", 1, '[', ']');
        f51144b = ahVar2;
        ah ahVar3 = new ah("MAP", 2, '{', '}');
        f51145c = ahVar3;
        ah ahVar4 = new ah("POLY_OBJ", 3, '[', ']');
        f51146d = ahVar4;
        ah[] ahVarArr = {ahVar, ahVar2, ahVar3, ahVar4};
        f51147g = ahVarArr;
        f51148h = h.d.b.a(ahVarArr);
    }

    private ah(String str, int i2, char c2, char c3) {
        this.f51149e = c2;
        this.f51150f = c3;
    }

    public static h.d.a a() {
        return f51148h;
    }

    public static ah[] values() {
        return (ah[]) f51147g.clone();
    }
}
