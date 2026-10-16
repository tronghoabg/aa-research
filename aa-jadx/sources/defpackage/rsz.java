package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rsz {
    public static final defpackage.rsz a;
    public static final defpackage.rsz b;
    public static final defpackage.rsz c;
    public static final defpackage.rsz d;
    private static final /* synthetic */ defpackage.rsz[] e;

    static {
        defpackage.rsz rszVar = new defpackage.rsz(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS, 0);
        a = rszVar;
        defpackage.rsz rszVar2 = new defpackage.rsz("INVALID_PAIRING_METHOD", 1);
        b = rszVar2;
        defpackage.rsz rszVar3 = new defpackage.rsz("INVALID_AUTH_DATA", 2);
        c = rszVar3;
        defpackage.rsz rszVar4 = new defpackage.rsz("AUTH_DATA_MISMATCH", 3);
        d = rszVar4;
        e = new defpackage.rsz[]{rszVar, rszVar2, rszVar3, rszVar4};
    }

    public static defpackage.rsz valueOf(java.lang.String str) {
        return (defpackage.rsz) java.lang.Enum.valueOf(defpackage.rsz.class, str);
    }

    public static defpackage.rsz[] values() {
        return (defpackage.rsz[]) e.clone();
    }
}
