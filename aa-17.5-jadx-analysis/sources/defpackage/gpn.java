package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gpn {
    public static final gpn a;
    public static final gpn b;
    public static final gpn c;
    public static final gpn d;
    public static final gpn e;
    public static final gpn f;
    private static final /* synthetic */ gpn[] g;

    static {
        gpn gpnVar = new gpn("SHORT", 0);
        a = gpnVar;
        gpn gpnVar2 = new gpn("CANONICAL", 1);
        b = gpnVar2;
        gpn gpnVar3 = new gpn("ALMOST_TALL", 2);
        c = gpnVar3;
        gpn gpnVar4 = new gpn("TALL", 3);
        d = gpnVar4;
        gpn gpnVar5 = new gpn("VERY_TALL", 4);
        e = gpnVar5;
        gpn gpnVar6 = new gpn("WIDE_ALMOST_TALL", 5);
        f = gpnVar6;
        gpn[] gpnVarArr = {gpnVar, gpnVar2, gpnVar3, gpnVar4, gpnVar5, gpnVar6};
        g = gpnVarArr;
        affa.p(gpnVarArr);
    }

    public static gpn valueOf(String str) {
        return (gpn) Enum.valueOf(gpn.class, str);
    }

    public static gpn[] values() {
        return (gpn[]) g.clone();
    }
}
