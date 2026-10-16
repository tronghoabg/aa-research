package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bkm {
    public static final defpackage.bkm a;
    public static final defpackage.bkm b;
    private static final /* synthetic */ defpackage.bkm[] c;

    static {
        defpackage.bkm bkmVar = new defpackage.bkm("EditableText", 0);
        a = bkmVar;
        defpackage.bkm bkmVar2 = new defpackage.bkm("StaticText", 1);
        b = bkmVar2;
        defpackage.bkm[] bkmVarArr = {bkmVar, bkmVar2};
        c = bkmVarArr;
        defpackage.afga.p(bkmVarArr);
    }

    public static defpackage.bkm valueOf(java.lang.String str) {
        return (defpackage.bkm) java.lang.Enum.valueOf(defpackage.bkm.class, str);
    }

    public static defpackage.bkm[] values() {
        return (defpackage.bkm[]) c.clone();
    }
}
