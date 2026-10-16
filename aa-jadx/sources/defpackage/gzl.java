package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gzl {
    public static final defpackage.gzl a;
    public static final defpackage.gzl b;
    public static final defpackage.gzl c;
    public static final defpackage.gzl d;
    public static final defpackage.gzl e;
    private static final /* synthetic */ defpackage.gzl[] f;

    static {
        defpackage.gzl gzlVar = new defpackage.gzl("FULL_SCREEN", 0);
        a = gzlVar;
        defpackage.gzl gzlVar2 = new defpackage.gzl("FULL_SCREEN_NO_HEADER", 1);
        b = gzlVar2;
        defpackage.gzl gzlVar3 = new defpackage.gzl("HALF_SCREEN", 2);
        c = gzlVar3;
        defpackage.gzl gzlVar4 = new defpackage.gzl("MINIMIZED_SCREEN", 3);
        d = gzlVar4;
        defpackage.gzl gzlVar5 = new defpackage.gzl("MAP_CONTENT_SCREEN", 4);
        e = gzlVar5;
        defpackage.gzl[] gzlVarArr = {gzlVar, gzlVar2, gzlVar3, gzlVar4, gzlVar5};
        f = gzlVarArr;
        defpackage.afga.p(gzlVarArr);
    }

    public static defpackage.gzl valueOf(java.lang.String str) {
        return (defpackage.gzl) java.lang.Enum.valueOf(defpackage.gzl.class, str);
    }

    public static defpackage.gzl[] values() {
        return (defpackage.gzl[]) f.clone();
    }

    public final boolean a() {
        return this == c || this == e || this == d;
    }
}
