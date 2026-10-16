package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dlz {
    public static final defpackage.dlz a;
    public static final defpackage.dlz b;
    private static final /* synthetic */ defpackage.dlz[] c;

    static {
        defpackage.dlz dlzVar = new defpackage.dlz("Ltr", 0);
        a = dlzVar;
        defpackage.dlz dlzVar2 = new defpackage.dlz("Rtl", 1);
        b = dlzVar2;
        defpackage.dlz[] dlzVarArr = {dlzVar, dlzVar2};
        c = dlzVarArr;
        defpackage.afga.p(dlzVarArr);
    }

    public static defpackage.dlz valueOf(java.lang.String str) {
        return (defpackage.dlz) java.lang.Enum.valueOf(defpackage.dlz.class, str);
    }

    public static defpackage.dlz[] values() {
        return (defpackage.dlz[]) c.clone();
    }
}
