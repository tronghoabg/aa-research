package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nku {
    public static final defpackage.nku a;
    public static final defpackage.nku b;
    private static final /* synthetic */ defpackage.nku[] c;

    static {
        defpackage.nku nkuVar = new defpackage.nku("Measurement", 0);
        a = nkuVar;
        defpackage.nku nkuVar2 = new defpackage.nku("Content", 1);
        b = nkuVar2;
        defpackage.nku[] nkuVarArr = {nkuVar, nkuVar2};
        c = nkuVarArr;
        defpackage.afga.p(nkuVarArr);
    }

    public static defpackage.nku valueOf(java.lang.String str) {
        return (defpackage.nku) java.lang.Enum.valueOf(defpackage.nku.class, str);
    }

    public static defpackage.nku[] values() {
        return (defpackage.nku[]) c.clone();
    }
}
