package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class luf {
    public static final defpackage.luf a;
    public static final defpackage.luf b;
    public static final defpackage.luf c;
    private static final /* synthetic */ defpackage.luf[] d;

    static {
        defpackage.luf lufVar = new defpackage.luf("NOTIFICATION_IM", 0);
        a = lufVar;
        defpackage.luf lufVar2 = new defpackage.luf("NOTIFICATION_SMS", 1);
        b = lufVar2;
        defpackage.luf lufVar3 = new defpackage.luf("CAL_BINDER_CONNECTION", 2);
        c = lufVar3;
        d = new defpackage.luf[]{lufVar, lufVar2, lufVar3};
    }

    public static defpackage.luf valueOf(java.lang.String str) {
        return (defpackage.luf) java.lang.Enum.valueOf(defpackage.luf.class, str);
    }

    public static defpackage.luf[] values() {
        return (defpackage.luf[]) d.clone();
    }
}
