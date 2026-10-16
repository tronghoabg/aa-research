package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nmu {
    public static final defpackage.nmu a;
    public static final defpackage.nmu b;
    public static final defpackage.nmu c;
    public static final defpackage.nmu d;
    public static final defpackage.nmu e;
    private static final /* synthetic */ defpackage.nmu[] f;

    static {
        defpackage.nmu nmuVar = new defpackage.nmu("LAUNCHER_ICON", 0);
        a = nmuVar;
        defpackage.nmu nmuVar2 = new defpackage.nmu("NOTIFICATIONS", 1);
        b = nmuVar2;
        defpackage.nmu nmuVar3 = new defpackage.nmu("ASSISTANT_ICON", 2);
        c = nmuVar3;
        defpackage.nmu nmuVar4 = new defpackage.nmu("ASSISTANT_MEDIA_REC_ICON", 3);
        d = nmuVar4;
        defpackage.nmu nmuVar5 = new defpackage.nmu("RECENT_APP_HOTSEAT", 4);
        e = nmuVar5;
        f = new defpackage.nmu[]{nmuVar, nmuVar2, nmuVar3, nmuVar4, nmuVar5};
    }

    public static defpackage.nmu valueOf(java.lang.String str) {
        return (defpackage.nmu) java.lang.Enum.valueOf(defpackage.nmu.class, str);
    }

    public static defpackage.nmu[] values() {
        return (defpackage.nmu[]) f.clone();
    }
}
