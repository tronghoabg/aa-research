package Ge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4738a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f4739b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f4740c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f4741d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f4742e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f4743f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d[] f4744g;

    static {
        d dVar = new d("ScreenShown", 0);
        f4738a = dVar;
        d dVar2 = new d("Finished", 1);
        f4739b = dVar2;
        d dVar3 = new d("ActionStarted", 2);
        f4740c = dVar3;
        d dVar4 = new d("ActionFinished", 3);
        f4741d = dVar4;
        d dVar5 = new d("ActionFailed", 4);
        f4742e = dVar5;
        d dVar6 = new d("ScreenFailedToLoad", 5);
        f4743f = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f4744g = dVarArr;
        ic.d.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4744g.clone();
    }
}
