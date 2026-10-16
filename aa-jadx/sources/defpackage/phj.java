package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class phj {
    public static final defpackage.phj a;
    public static final defpackage.phj b;
    public static final defpackage.phj c;
    public static final defpackage.phj d;
    private static final /* synthetic */ defpackage.phj[] e;

    static {
        defpackage.phj phjVar = new defpackage.phj("NONE", 0);
        a = phjVar;
        defpackage.phj phjVar2 = new defpackage.phj(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS, 1);
        b = phjVar2;
        defpackage.phj phjVar3 = new defpackage.phj("FAILURE", 2);
        c = phjVar3;
        defpackage.phj phjVar4 = new defpackage.phj("PREEMPTED_BY_START_REQUEST", 3);
        d = phjVar4;
        e = new defpackage.phj[]{phjVar, phjVar2, phjVar3, phjVar4};
    }

    public static defpackage.phj valueOf(java.lang.String str) {
        return (defpackage.phj) java.lang.Enum.valueOf(defpackage.phj.class, str);
    }

    public static defpackage.phj[] values() {
        return (defpackage.phj[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                throw new java.lang.RuntimeException(null, null);
            }
        }
        return true;
    }

    final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return true;
        }
        throw new java.lang.RuntimeException(null, null);
    }
}
