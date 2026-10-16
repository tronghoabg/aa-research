package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class adoz {
    public static final defpackage.adoz a;
    public static final defpackage.adoz b;
    public static final defpackage.adoz c;
    private static final /* synthetic */ defpackage.adoz[] d;

    static {
        defpackage.adoz adozVar = new defpackage.adoz("FAKE", 0);
        a = adozVar;
        defpackage.adoz adozVar2 = new defpackage.adoz("MTLS", 1);
        b = adozVar2;
        defpackage.adoz adozVar3 = new defpackage.adoz("CUSTOM_MANAGERS", 2);
        c = adozVar3;
        d = new defpackage.adoz[]{adozVar, adozVar2, adozVar3};
    }

    public static defpackage.adoz valueOf(java.lang.String str) {
        return (defpackage.adoz) java.lang.Enum.valueOf(defpackage.adoz.class, str);
    }

    public static defpackage.adoz[] values() {
        return (defpackage.adoz[]) d.clone();
    }
}
