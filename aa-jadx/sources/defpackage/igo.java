package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class igo {
    public static final defpackage.igo a;
    public static final defpackage.igo b;
    public static final defpackage.igo c;
    public static final defpackage.igo d;
    public static final defpackage.igo e;
    public static final defpackage.igo f;
    public static final defpackage.igo g;
    public static final defpackage.igo h;
    public static final defpackage.igo i;
    public static final defpackage.igo j;
    private static final /* synthetic */ defpackage.igo[] k;

    static {
        defpackage.igo igoVar = new defpackage.igo("all", 0);
        a = igoVar;
        defpackage.igo igoVar2 = new defpackage.igo("aural", 1);
        b = igoVar2;
        defpackage.igo igoVar3 = new defpackage.igo("braille", 2);
        c = igoVar3;
        defpackage.igo igoVar4 = new defpackage.igo("embossed", 3);
        d = igoVar4;
        defpackage.igo igoVar5 = new defpackage.igo("handheld", 4);
        e = igoVar5;
        defpackage.igo igoVar6 = new defpackage.igo("print", 5);
        f = igoVar6;
        defpackage.igo igoVar7 = new defpackage.igo("projection", 6);
        g = igoVar7;
        defpackage.igo igoVar8 = new defpackage.igo("screen", 7);
        h = igoVar8;
        defpackage.igo igoVar9 = new defpackage.igo("tty", 8);
        i = igoVar9;
        defpackage.igo igoVar10 = new defpackage.igo("tv", 9);
        j = igoVar10;
        k = new defpackage.igo[]{igoVar, igoVar2, igoVar3, igoVar4, igoVar5, igoVar6, igoVar7, igoVar8, igoVar9, igoVar10};
    }

    public static defpackage.igo valueOf(java.lang.String str) {
        return (defpackage.igo) java.lang.Enum.valueOf(defpackage.igo.class, str);
    }

    public static defpackage.igo[] values() {
        return (defpackage.igo[]) k.clone();
    }
}
