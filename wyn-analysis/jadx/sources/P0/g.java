package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f43136a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f43137b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f43138c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f43139d;

    static {
        g gVar = new g("Initial", 0);
        f43136a = gVar;
        g gVar2 = new g("Main", 1);
        f43137b = gVar2;
        g gVar3 = new g("Final", 2);
        f43138c = gVar3;
        f43139d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f43139d.clone();
    }
}
