package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class plq {
    public static final defpackage.plq a;
    public static final defpackage.plq b;
    public static final defpackage.plq c;
    public static final defpackage.plq d;
    public static final defpackage.plq e;
    public static final defpackage.plq f;
    public static final defpackage.plq g;
    public static final defpackage.plq h;
    private static final /* synthetic */ defpackage.plq[] i;

    static {
        defpackage.qcs qcsVar = defpackage.pns.a;
        defpackage.plq plqVar = new defpackage.plq("COMPLETE", 0);
        a = plqVar;
        defpackage.plq plqVar2 = new defpackage.plq("MODERATE", 1);
        b = plqVar2;
        defpackage.plq plqVar3 = new defpackage.plq("BACKGROUND", 2);
        c = plqVar3;
        defpackage.plq plqVar4 = new defpackage.plq("UI_HIDDEN", 3);
        d = plqVar4;
        defpackage.plq plqVar5 = new defpackage.plq("RUNNING_CRITICAL", 4);
        e = plqVar5;
        defpackage.plq plqVar6 = new defpackage.plq("RUNNING_LOW", 5);
        f = plqVar6;
        defpackage.plq plqVar7 = new defpackage.plq("RUNNING_MODERATE", 6);
        g = plqVar7;
        defpackage.plq plqVar8 = new defpackage.plq("THRESHOLD_REACHED", 7);
        h = plqVar8;
        i = new defpackage.plq[]{plqVar, plqVar2, plqVar3, plqVar4, plqVar5, plqVar6, plqVar7, plqVar8};
    }

    public static defpackage.plq valueOf(java.lang.String str) {
        return (defpackage.plq) java.lang.Enum.valueOf(defpackage.plq.class, str);
    }

    public static defpackage.plq[] values() {
        return (defpackage.plq[]) i.clone();
    }
}
