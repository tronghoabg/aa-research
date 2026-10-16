package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hmo {
    public static final defpackage.hmo a;
    public static final defpackage.hmo b;
    private static final /* synthetic */ defpackage.hmo[] c;

    static {
        defpackage.hmo hmoVar = new defpackage.hmo("SCRIM_CLICKED", 0);
        a = hmoVar;
        defpackage.hmo hmoVar2 = new defpackage.hmo("EXIT_ACTION_CLICKED", 1);
        b = hmoVar2;
        defpackage.hmo[] hmoVarArr = {hmoVar, hmoVar2};
        c = hmoVarArr;
        defpackage.afga.p(hmoVarArr);
    }

    public static defpackage.hmo valueOf(java.lang.String str) {
        return (defpackage.hmo) java.lang.Enum.valueOf(defpackage.hmo.class, str);
    }

    public static defpackage.hmo[] values() {
        return (defpackage.hmo[]) c.clone();
    }
}
