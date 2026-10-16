package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rcn {
    public static final defpackage.rcn a;
    public static final defpackage.rcn b;
    public static final defpackage.rcn c;
    private static final /* synthetic */ defpackage.rcn[] d;

    static {
        defpackage.rcn rcnVar = new defpackage.rcn("UNKNOWN", 0);
        a = rcnVar;
        defpackage.rcn rcnVar2 = new defpackage.rcn("SERVICE_DISCONNECTED", 1);
        b = rcnVar2;
        defpackage.rcn rcnVar3 = new defpackage.rcn("NETWORK_LOST", 2);
        c = rcnVar3;
        d = new defpackage.rcn[]{rcnVar, rcnVar2, rcnVar3};
    }

    public static defpackage.rcn valueOf(java.lang.String str) {
        return (defpackage.rcn) java.lang.Enum.valueOf(defpackage.rcn.class, str);
    }

    public static defpackage.rcn[] values() {
        return (defpackage.rcn[]) d.clone();
    }
}
