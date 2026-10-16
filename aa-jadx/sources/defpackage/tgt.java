package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tgt {
    public static final defpackage.tgt a;
    public static final defpackage.tgt b;
    private static final /* synthetic */ defpackage.tgt[] c;

    static {
        defpackage.tgt tgtVar = new defpackage.tgt("USB", 0);
        a = tgtVar;
        defpackage.tgt tgtVar2 = new defpackage.tgt("WIRELESS", 1);
        b = tgtVar2;
        c = new defpackage.tgt[]{tgtVar, tgtVar2};
    }

    public static defpackage.tgt valueOf(java.lang.String str) {
        return (defpackage.tgt) java.lang.Enum.valueOf(defpackage.tgt.class, str);
    }

    public static defpackage.tgt[] values() {
        return (defpackage.tgt[]) c.clone();
    }
}
