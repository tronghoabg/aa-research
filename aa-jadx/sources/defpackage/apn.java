package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class apn {
    public static final defpackage.apn a;
    public static final defpackage.apn b;
    private static final /* synthetic */ defpackage.apn[] c;

    static {
        defpackage.apn apnVar = new defpackage.apn("Vertical", 0);
        a = apnVar;
        defpackage.apn apnVar2 = new defpackage.apn("Horizontal", 1);
        b = apnVar2;
        defpackage.apn[] apnVarArr = {apnVar, apnVar2};
        c = apnVarArr;
        defpackage.afga.p(apnVarArr);
    }

    public static defpackage.apn valueOf(java.lang.String str) {
        return (defpackage.apn) java.lang.Enum.valueOf(defpackage.apn.class, str);
    }

    public static defpackage.apn[] values() {
        return (defpackage.apn[]) c.clone();
    }
}
