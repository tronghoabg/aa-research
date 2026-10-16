package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ucq {
    public static final ucq a;
    public static final ucq b;
    public static final ucq c;
    public static final ucq d;
    public static final ucq e;
    public static final ucq f;
    public static final ucq g;
    private static final /* synthetic */ ucq[] h;

    static {
        ucq ucqVar = new ucq("ALL_VISIBLE", 0);
        a = ucqVar;
        ucq ucqVar2 = new ucq("PRIMARY_SECONDARY_VISIBLE", 1);
        b = ucqVar2;
        ucq ucqVar3 = new ucq("PRIMARY_TERTIARY_VISIBLE", 2);
        c = ucqVar3;
        ucq ucqVar4 = new ucq("ONLY_PRIMARY_VISIBLE", 3);
        d = ucqVar4;
        ucq ucqVar5 = new ucq("REPRESSED", 4);
        e = ucqVar5;
        ucq ucqVar6 = new ucq("PLACED_INVISIBLE", 5);
        f = ucqVar6;
        ucq ucqVar7 = new ucq("TRUMPED_PROMOTED", 6);
        g = ucqVar7;
        h = new ucq[]{ucqVar, ucqVar2, ucqVar3, ucqVar4, ucqVar5, ucqVar6, ucqVar7};
    }

    public static ucq valueOf(String str) {
        return (ucq) Enum.valueOf(ucq.class, str);
    }

    public static ucq[] values() {
        return (ucq[]) h.clone();
    }
}
