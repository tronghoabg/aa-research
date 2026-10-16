package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class phk {
    public static final defpackage.phk a;
    public static final defpackage.phk b;
    public static final defpackage.phk c;
    private static final /* synthetic */ defpackage.phk[] d;

    static {
        defpackage.phk phkVar = new defpackage.phk("DO_NOT_HANDLE", 0);
        a = phkVar;
        defpackage.phk phkVar2 = new defpackage.phk("WIFI_CHANNELS_SUPPORTED", 1);
        b = phkVar2;
        defpackage.phk phkVar3 = new defpackage.phk("WIFI_CHANNELS_UNSUPPORTED", 2);
        c = phkVar3;
        d = new defpackage.phk[]{phkVar, phkVar2, phkVar3};
    }

    public static defpackage.phk valueOf(java.lang.String str) {
        return (defpackage.phk) java.lang.Enum.valueOf(defpackage.phk.class, str);
    }

    public static defpackage.phk[] values() {
        return (defpackage.phk[]) d.clone();
    }
}
