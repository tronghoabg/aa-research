package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nij {
    public static final nij a;
    public static final nij b;
    public static final nij c;
    public static final nij d;
    private static final /* synthetic */ nij[] e;

    static {
        nij nijVar = new nij("DASHBOARD", 0);
        a = nijVar;
        nij nijVar2 = new nij("LAUNCHER", 1);
        b = nijVar2;
        nij nijVar3 = new nij("NOTIFICATION_CENTER", 2);
        c = nijVar3;
        nij nijVar4 = new nij("OTHER", 3);
        d = nijVar4;
        nij[] nijVarArr = {nijVar, nijVar2, nijVar3, nijVar4};
        e = nijVarArr;
        affa.p(nijVarArr);
    }

    public static nij valueOf(String str) {
        return (nij) Enum.valueOf(nij.class, str);
    }

    public static nij[] values() {
        return (nij[]) e.clone();
    }
}
