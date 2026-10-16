package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class det {
    public static final defpackage.det a;
    public static final defpackage.det b;
    public static final defpackage.det c;
    private static final /* synthetic */ defpackage.det[] d;

    static {
        defpackage.det detVar = new defpackage.det("On", 0);
        a = detVar;
        defpackage.det detVar2 = new defpackage.det("Off", 1);
        b = detVar2;
        defpackage.det detVar3 = new defpackage.det("Indeterminate", 2);
        c = detVar3;
        defpackage.det[] detVarArr = {detVar, detVar2, detVar3};
        d = detVarArr;
        defpackage.afga.p(detVarArr);
    }

    public static defpackage.det valueOf(java.lang.String str) {
        return (defpackage.det) java.lang.Enum.valueOf(defpackage.det.class, str);
    }

    public static defpackage.det[] values() {
        return (defpackage.det[]) d.clone();
    }
}
