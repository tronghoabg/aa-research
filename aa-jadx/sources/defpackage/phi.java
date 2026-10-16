package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class phi {
    public static final defpackage.phi a;
    public static final defpackage.phi b;
    public static final defpackage.phi c;
    private static final /* synthetic */ defpackage.phi[] d;

    static {
        defpackage.phi phiVar = new defpackage.phi("DISCONNECTED", 0);
        a = phiVar;
        defpackage.phi phiVar2 = new defpackage.phi("REQUESTED", 1);
        b = phiVar2;
        defpackage.phi phiVar3 = new defpackage.phi("CONNECTED", 2);
        c = phiVar3;
        d = new defpackage.phi[]{phiVar, phiVar2, phiVar3};
    }

    public static defpackage.phi valueOf(java.lang.String str) {
        return (defpackage.phi) java.lang.Enum.valueOf(defpackage.phi.class, str);
    }

    public static defpackage.phi[] values() {
        return (defpackage.phi[]) d.clone();
    }

    final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        throw new java.lang.RuntimeException(null, null);
    }
}
