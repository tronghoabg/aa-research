package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kxh {
    public static final defpackage.kxh a;
    public static final defpackage.kxh b;
    public static final defpackage.kxh c;
    private static final /* synthetic */ defpackage.kxh[] d;

    static {
        defpackage.kxh kxhVar = new defpackage.kxh("UNKNOWN", 0);
        a = kxhVar;
        defpackage.kxh kxhVar2 = new defpackage.kxh("VOICE_SEARCH", 1);
        b = kxhVar2;
        defpackage.kxh kxhVar3 = new defpackage.kxh("MEDIA_REC", 2);
        c = kxhVar3;
        d = new defpackage.kxh[]{kxhVar, kxhVar2, kxhVar3};
    }

    public static defpackage.kxh valueOf(java.lang.String str) {
        return (defpackage.kxh) java.lang.Enum.valueOf(defpackage.kxh.class, str);
    }

    public static defpackage.kxh[] values() {
        return (defpackage.kxh[]) d.clone();
    }
}
