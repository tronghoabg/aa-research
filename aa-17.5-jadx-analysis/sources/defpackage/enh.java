package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class enh {
    public static final enh a;
    public static final enh b;
    public static final enh c;
    public static final enh d;
    public static final enh e;
    public static final enh f;
    public static final enh g;
    public static final enh h;
    public static final enh i;
    private static final /* synthetic */ enh[] j;

    static {
        enh enhVar = new enh("PENALTY_LOG", 0);
        a = enhVar;
        enh enhVar2 = new enh("PENALTY_DEATH", 1);
        b = enhVar2;
        enh enhVar3 = new enh("DETECT_FRAGMENT_REUSE", 2);
        c = enhVar3;
        enh enhVar4 = new enh("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = enhVar4;
        enh enhVar5 = new enh("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = enhVar5;
        enh enhVar6 = new enh("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = enhVar6;
        enh enhVar7 = new enh("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = enhVar7;
        enh enhVar8 = new enh("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = enhVar8;
        enh enhVar9 = new enh("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = enhVar9;
        enh[] enhVarArr = {enhVar, enhVar2, enhVar3, enhVar4, enhVar5, enhVar6, enhVar7, enhVar8, enhVar9};
        j = enhVarArr;
        affa.p(enhVarArr);
    }

    public static enh valueOf(String str) {
        return (enh) Enum.valueOf(enh.class, str);
    }

    public static enh[] values() {
        return (enh[]) j.clone();
    }
}
