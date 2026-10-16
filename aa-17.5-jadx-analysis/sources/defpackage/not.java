package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class not {
    public static final not a;
    public static final not b;
    public static final not c;
    public static final not d;
    public static final not e;
    public static final not f;
    public static final not g;
    public static final not h;
    public static final /* synthetic */ afdf i;
    private static final /* synthetic */ not[] k;
    public final int j;

    static {
        not notVar = new not("Unknown", 0, 0);
        a = notVar;
        not notVar2 = new not("Face", 1, 1);
        b = notVar2;
        not notVar3 = new not("Floor", 2, 2);
        c = notVar3;
        not notVar4 = new not("FaceAndFloor", 3, 3);
        d = notVar4;
        not notVar5 = new not("Defrost", 4, 4);
        e = notVar5;
        not notVar6 = new not("FaceAndDefrost", 5, 5);
        f = notVar6;
        not notVar7 = new not("DefrostAndFloor", 6, 6);
        g = notVar7;
        not notVar8 = new not("FaceDefrostAndFloor", 7, 7);
        h = notVar8;
        not[] notVarArr = {notVar, notVar2, notVar3, notVar4, notVar5, notVar6, notVar7, notVar8};
        k = notVarArr;
        i = affa.p(notVarArr);
    }

    private not(String str, int i2, int i3) {
        this.j = i3;
    }

    public static not valueOf(String str) {
        return (not) Enum.valueOf(not.class, str);
    }

    public static not[] values() {
        return (not[]) k.clone();
    }
}
