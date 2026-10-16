package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdo {
    public static final defpackage.mdo a;
    public static final defpackage.mdo b;
    public static final defpackage.mdo c;
    private static final /* synthetic */ defpackage.mdo[] d;

    static {
        defpackage.mdo mdoVar = new defpackage.mdo("ALLOWED", 0);
        a = mdoVar;
        defpackage.mdo mdoVar2 = new defpackage.mdo("ACKNOWLEDGEMENT_REQUIRED", 1);
        b = mdoVar2;
        defpackage.mdo mdoVar3 = new defpackage.mdo("PERMISSION_REQUIRED", 2);
        c = mdoVar3;
        d = new defpackage.mdo[]{mdoVar, mdoVar2, mdoVar3};
    }

    public static defpackage.mdo valueOf(java.lang.String str) {
        return (defpackage.mdo) java.lang.Enum.valueOf(defpackage.mdo.class, str);
    }

    public static defpackage.mdo[] values() {
        return (defpackage.mdo[]) d.clone();
    }
}
