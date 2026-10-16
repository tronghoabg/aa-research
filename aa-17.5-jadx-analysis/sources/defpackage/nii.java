package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nii {
    public static final nii a;
    public static final nii b;
    public static final nii c;
    public static final nii d;
    public static final nii e;
    public static final nii f;
    public static final nii g;
    public static final nii h;
    public static final nii i;
    public static final /* synthetic */ afdf j;
    private static final /* synthetic */ nii[] k;

    static {
        nii niiVar = new nii("NONE", 0);
        a = niiVar;
        nii niiVar2 = new nii("HOME", 1);
        b = niiVar2;
        nii niiVar3 = new nii("ASSISTANT", 2);
        c = niiVar3;
        nii niiVar4 = new nii("RAIL_WIDGET", 3);
        d = niiVar4;
        nii niiVar5 = new nii("HOTSEAT_ITEM_1", 4);
        e = niiVar5;
        nii niiVar6 = new nii("HOTSEAT_ITEM_2", 5);
        f = niiVar6;
        nii niiVar7 = new nii("HOTSEAT_ITEM_3", 6);
        g = niiVar7;
        nii niiVar8 = new nii("HOTSEAT_ITEM_4", 7);
        h = niiVar8;
        nii niiVar9 = new nii("STATUS", 8);
        i = niiVar9;
        nii[] niiVarArr = {niiVar, niiVar2, niiVar3, niiVar4, niiVar5, niiVar6, niiVar7, niiVar8, niiVar9};
        k = niiVarArr;
        j = affa.p(niiVarArr);
    }

    public static nii valueOf(String str) {
        return (nii) Enum.valueOf(nii.class, str);
    }

    public static nii[] values() {
        return (nii[]) k.clone();
    }
}
