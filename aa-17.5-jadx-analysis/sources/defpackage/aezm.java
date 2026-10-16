package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aezm {
    public static final aezm a;
    public static final aezm b;
    public static final aezm c;
    private static final /* synthetic */ aezm[] d;

    static {
        aezm aezmVar = new aezm("WARNING", 0);
        a = aezmVar;
        aezm aezmVar2 = new aezm("ERROR", 1);
        b = aezmVar2;
        aezm aezmVar3 = new aezm("HIDDEN", 2);
        c = aezmVar3;
        aezm[] aezmVarArr = {aezmVar, aezmVar2, aezmVar3};
        d = aezmVarArr;
        affa.p(aezmVarArr);
    }

    public static aezm valueOf(String str) {
        return (aezm) Enum.valueOf(aezm.class, str);
    }

    public static aezm[] values() {
        return (aezm[]) d.clone();
    }
}
