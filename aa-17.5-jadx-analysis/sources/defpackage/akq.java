package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class akq {
    public static final akq a;
    public static final akq b;
    public static final akq c;
    private static final /* synthetic */ akq[] d;

    static {
        akq akqVar = new akq("Default", 0);
        a = akqVar;
        akq akqVar2 = new akq("UserInput", 1);
        b = akqVar2;
        akq akqVar3 = new akq("PreventUserInput", 2);
        c = akqVar3;
        akq[] akqVarArr = {akqVar, akqVar2, akqVar3};
        d = akqVarArr;
        affa.p(akqVarArr);
    }

    public static akq valueOf(String str) {
        return (akq) Enum.valueOf(akq.class, str);
    }

    public static akq[] values() {
        return (akq[]) d.clone();
    }
}
