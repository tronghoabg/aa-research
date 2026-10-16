package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class igu {
    public static final defpackage.igu a;
    public static final defpackage.igu b;
    public static final defpackage.igu c;
    public static final defpackage.igu d;
    public static final defpackage.igu e;
    public static final defpackage.igu f;
    public static final defpackage.igu g;
    public static final defpackage.igu h;
    public static final defpackage.igu i;
    public static final defpackage.igu j;
    private static final /* synthetic */ defpackage.igu[] k;

    static {
        defpackage.igu iguVar = new defpackage.igu("None", 0);
        a = iguVar;
        defpackage.igu iguVar2 = new defpackage.igu("XMinYMin", 1);
        b = iguVar2;
        defpackage.igu iguVar3 = new defpackage.igu("XMidYMin", 2);
        c = iguVar3;
        defpackage.igu iguVar4 = new defpackage.igu("XMaxYMin", 3);
        d = iguVar4;
        defpackage.igu iguVar5 = new defpackage.igu("XMinYMid", 4);
        e = iguVar5;
        defpackage.igu iguVar6 = new defpackage.igu("XMidYMid", 5);
        f = iguVar6;
        defpackage.igu iguVar7 = new defpackage.igu("XMaxYMid", 6);
        g = iguVar7;
        defpackage.igu iguVar8 = new defpackage.igu("XMinYMax", 7);
        h = iguVar8;
        defpackage.igu iguVar9 = new defpackage.igu("XMidYMax", 8);
        i = iguVar9;
        defpackage.igu iguVar10 = new defpackage.igu("XMaxYMax", 9);
        j = iguVar10;
        k = new defpackage.igu[]{iguVar, iguVar2, iguVar3, iguVar4, iguVar5, iguVar6, iguVar7, iguVar8, iguVar9, iguVar10};
    }

    public static defpackage.igu valueOf(java.lang.String str) {
        return (defpackage.igu) java.lang.Enum.valueOf(defpackage.igu.class, str);
    }

    public static defpackage.igu[] values() {
        return (defpackage.igu[]) k.clone();
    }
}
