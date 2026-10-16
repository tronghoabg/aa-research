package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class noq {
    public static final noq a;
    public static final noq b;
    public static final noq c;
    private static final /* synthetic */ noq[] d;

    static {
        noq noqVar = new noq("Off", 0);
        a = noqVar;
        noq noqVar2 = new noq("On", 1);
        b = noqVar2;
        noq noqVar3 = new noq("Max", 2);
        c = noqVar3;
        noq[] noqVarArr = {noqVar, noqVar2, noqVar3};
        d = noqVarArr;
        affa.p(noqVarArr);
    }

    public static noq valueOf(String str) {
        return (noq) Enum.valueOf(noq.class, str);
    }

    public static noq[] values() {
        return (noq[]) d.clone();
    }
}
