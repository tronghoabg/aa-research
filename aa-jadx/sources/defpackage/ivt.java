package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ivt {
    public static final defpackage.ivt a;
    public static final defpackage.ivt b;
    public static final defpackage.ivt c;
    public static final defpackage.ivt d;
    private static final /* synthetic */ defpackage.ivt[] e;

    static {
        defpackage.ivt ivtVar = new defpackage.ivt("GAIN", 0);
        a = ivtVar;
        defpackage.ivt ivtVar2 = new defpackage.ivt("LOSS", 1);
        b = ivtVar2;
        defpackage.ivt ivtVar3 = new defpackage.ivt("LOSS_TRANSIENT", 2);
        c = ivtVar3;
        defpackage.ivt ivtVar4 = new defpackage.ivt("DISCONNECT", 3);
        d = ivtVar4;
        e = new defpackage.ivt[]{ivtVar, ivtVar2, ivtVar3, ivtVar4};
    }

    public static defpackage.ivt valueOf(java.lang.String str) {
        return (defpackage.ivt) java.lang.Enum.valueOf(defpackage.ivt.class, str);
    }

    public static defpackage.ivt[] values() {
        return (defpackage.ivt[]) e.clone();
    }
}
