package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mpc {
    public static final defpackage.mpc a;
    public static final defpackage.mpc b;
    public static final defpackage.mpc c;
    private static final /* synthetic */ defpackage.mpc[] d;

    static {
        defpackage.mpc mpcVar = new defpackage.mpc("LOCK_SCREEN", 0);
        a = mpcVar;
        defpackage.mpc mpcVar2 = new defpackage.mpc("NO_VIDEO_FOCUS_SCREEN", 1);
        b = mpcVar2;
        defpackage.mpc mpcVar3 = new defpackage.mpc("DISMISSED", 2);
        c = mpcVar3;
        d = new defpackage.mpc[]{mpcVar, mpcVar2, mpcVar3};
    }

    public static defpackage.mpc valueOf(java.lang.String str) {
        return (defpackage.mpc) java.lang.Enum.valueOf(defpackage.mpc.class, str);
    }

    public static defpackage.mpc[] values() {
        return (defpackage.mpc[]) d.clone();
    }
}
