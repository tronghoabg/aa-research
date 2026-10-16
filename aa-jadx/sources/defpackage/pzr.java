package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pzr {
    public static final defpackage.pzr a;
    public static final defpackage.pzr b;
    public static final defpackage.pzr c;

    @java.lang.Deprecated
    public static final defpackage.pzr d;
    private static final /* synthetic */ defpackage.pzr[] e;

    static {
        defpackage.pzr pzrVar = new defpackage.pzr("ON_CLIENT_PARAMETERS_LOADED", 0);
        a = pzrVar;
        defpackage.pzr pzrVar2 = new defpackage.pzr("ON_FIRST_TRANSITION_COMPLETE", 1);
        b = pzrVar2;
        defpackage.pzr pzrVar3 = new defpackage.pzr("ON_STARTUP_FULLY_COMPLETE", 2);
        c = pzrVar3;
        defpackage.pzr pzrVar4 = new defpackage.pzr("ON_MAP_STABLE", 3);
        d = pzrVar4;
        e = new defpackage.pzr[]{pzrVar, pzrVar2, pzrVar3, pzrVar4};
    }

    public static defpackage.pzr valueOf(java.lang.String str) {
        return (defpackage.pzr) java.lang.Enum.valueOf(defpackage.pzr.class, str);
    }

    public static defpackage.pzr[] values() {
        return (defpackage.pzr[]) e.clone();
    }
}
