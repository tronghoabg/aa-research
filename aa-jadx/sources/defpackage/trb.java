package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class trb {
    public static final defpackage.trb a;
    public static final defpackage.trb b;
    private static final /* synthetic */ defpackage.trb[] c;

    static {
        defpackage.trb trbVar = new defpackage.trb("TAP", 0);
        a = trbVar;
        defpackage.trb trbVar2 = new defpackage.trb("LONG_PRESS", 1);
        b = trbVar2;
        c = new defpackage.trb[]{trbVar, trbVar2};
    }

    public static defpackage.trb valueOf(java.lang.String str) {
        return (defpackage.trb) java.lang.Enum.valueOf(defpackage.trb.class, str);
    }

    public static defpackage.trb[] values() {
        return (defpackage.trb[]) c.clone();
    }
}
