package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class pkw {
    public static final pkw a;
    public static final pkw b;
    public static final pkw c;
    public static final pkw d;
    public static final pkw e;
    public static final pkw f;
    public static final pkw g;
    public static final pkw h;
    private static final /* synthetic */ pkw[] i;

    static {
        qbu qbuVar = pmw.a;
        pkw pkwVar = new pkw("COMPLETE", 0);
        a = pkwVar;
        pkw pkwVar2 = new pkw("MODERATE", 1);
        b = pkwVar2;
        pkw pkwVar3 = new pkw("BACKGROUND", 2);
        c = pkwVar3;
        pkw pkwVar4 = new pkw("UI_HIDDEN", 3);
        d = pkwVar4;
        pkw pkwVar5 = new pkw("RUNNING_CRITICAL", 4);
        e = pkwVar5;
        pkw pkwVar6 = new pkw("RUNNING_LOW", 5);
        f = pkwVar6;
        pkw pkwVar7 = new pkw("RUNNING_MODERATE", 6);
        g = pkwVar7;
        pkw pkwVar8 = new pkw("THRESHOLD_REACHED", 7);
        h = pkwVar8;
        i = new pkw[]{pkwVar, pkwVar2, pkwVar3, pkwVar4, pkwVar5, pkwVar6, pkwVar7, pkwVar8};
    }

    public static pkw valueOf(String str) {
        return (pkw) Enum.valueOf(pkw.class, str);
    }

    public static pkw[] values() {
        return (pkw[]) i.clone();
    }
}
