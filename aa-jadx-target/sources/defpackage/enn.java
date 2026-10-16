package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class enn {
    public static final defpackage.enn a;
    public static final defpackage.enn b;
    public static final defpackage.enn c;
    public static final defpackage.enn d;
    public static final defpackage.enn e;
    public static final defpackage.enn f;
    public static final defpackage.enn g;
    public static final defpackage.enn h;
    public static final defpackage.enn i;
    private static final /* synthetic */ defpackage.enn[] j;

    static {
        defpackage.enn ennVar = new defpackage.enn("PENALTY_LOG", 0);
        a = ennVar;
        defpackage.enn ennVar2 = new defpackage.enn("PENALTY_DEATH", 1);
        b = ennVar2;
        defpackage.enn ennVar3 = new defpackage.enn("DETECT_FRAGMENT_REUSE", 2);
        c = ennVar3;
        defpackage.enn ennVar4 = new defpackage.enn("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = ennVar4;
        defpackage.enn ennVar5 = new defpackage.enn("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = ennVar5;
        defpackage.enn ennVar6 = new defpackage.enn("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = ennVar6;
        defpackage.enn ennVar7 = new defpackage.enn("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = ennVar7;
        defpackage.enn ennVar8 = new defpackage.enn("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = ennVar8;
        defpackage.enn ennVar9 = new defpackage.enn("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = ennVar9;
        defpackage.enn[] ennVarArr = {ennVar, ennVar2, ennVar3, ennVar4, ennVar5, ennVar6, ennVar7, ennVar8, ennVar9};
        j = ennVarArr;
        defpackage.afga.p(ennVarArr);
    }

    public static defpackage.enn valueOf(java.lang.String str) {
        return (defpackage.enn) java.lang.Enum.valueOf(defpackage.enn.class, str);
    }

    public static defpackage.enn[] values() {
        return (defpackage.enn[]) j.clone();
    }
}
