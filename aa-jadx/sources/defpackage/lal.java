package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lal implements defpackage.ngw {
    public static final defpackage.lal a;
    public static final defpackage.lal b;
    public static final defpackage.lal c;
    private static final /* synthetic */ defpackage.lal[] d;

    static {
        defpackage.lal lalVar = new defpackage.lal("ASSISTANT_TRIGGER", 0);
        a = lalVar;
        defpackage.lal lalVar2 = new defpackage.lal("HARDWARE_BUTTON_TRIGGER", 1);
        b = lalVar2;
        defpackage.lal lalVar3 = new defpackage.lal("ASSISTANT_MEDIA_REC_TRIGGER", 2);
        c = lalVar3;
        d = new defpackage.lal[]{lalVar, lalVar2, lalVar3};
    }

    public static defpackage.lal valueOf(java.lang.String str) {
        return (defpackage.lal) java.lang.Enum.valueOf(defpackage.lal.class, str);
    }

    public static defpackage.lal[] values() {
        return (defpackage.lal[]) d.clone();
    }

    @Override // defpackage.ngw
    public final java.lang.String a() {
        return "assistant";
    }

    @Override // defpackage.ngw
    public final java.lang.String b() {
        return name();
    }
}
