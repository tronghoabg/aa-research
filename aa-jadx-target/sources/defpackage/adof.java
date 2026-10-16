package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adof {
    public static final defpackage.adof a;
    public static final defpackage.adof b;
    public static final defpackage.adof c;
    private static final /* synthetic */ defpackage.adof[] d;

    static {
        defpackage.adof adofVar = new defpackage.adof("NONE", 0);
        a = adofVar;
        defpackage.adof adofVar2 = new defpackage.adof("INTEGRITY", 1);
        b = adofVar2;
        defpackage.adof adofVar3 = new defpackage.adof("PRIVACY_AND_INTEGRITY", 2);
        c = adofVar3;
        d = new defpackage.adof[]{adofVar, adofVar2, adofVar3};
    }

    public static defpackage.adof valueOf(java.lang.String str) {
        return (defpackage.adof) java.lang.Enum.valueOf(defpackage.adof.class, str);
    }

    public static defpackage.adof[] values() {
        return (defpackage.adof[]) d.clone();
    }
}
