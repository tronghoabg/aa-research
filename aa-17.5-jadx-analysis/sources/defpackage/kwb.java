package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kwb {
    public static final kwb a;
    public static final kwb b;
    public static final kwb c;
    public static final kwb d;
    public static final kwb e;
    private static final /* synthetic */ kwb[] g;
    public final kvx f;

    static {
        kwb kwbVar = new kwb("Icon", 0, kvy.b);
        a = kwbVar;
        kwb kwbVar2 = new kwb("Outlined", 1, kvy.a);
        b = kwbVar2;
        kwb kwbVar3 = new kwb("Tonal", 2, kvy.c);
        c = kwbVar3;
        kwb kwbVar4 = new kwb("Filled", 3, kvy.d);
        d = kwbVar4;
        kwb kwbVar5 = new kwb("Colored", 4, kwa.a);
        e = kwbVar5;
        kwb[] kwbVarArr = {kwbVar, kwbVar2, kwbVar3, kwbVar4, kwbVar5};
        g = kwbVarArr;
        affa.p(kwbVarArr);
    }

    private kwb(String str, int i, kvx kvxVar) {
        this.f = kvxVar;
    }

    public static kwb valueOf(String str) {
        return (kwb) Enum.valueOf(kwb.class, str);
    }

    public static kwb[] values() {
        return (kwb[]) g.clone();
    }
}
