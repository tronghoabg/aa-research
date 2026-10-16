package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kir {
    public static final defpackage.kir a;
    public static final defpackage.kir b;
    private static final /* synthetic */ defpackage.kir[] c;

    static {
        defpackage.kir kirVar = new defpackage.kir("TOKEN", 0);
        a = kirVar;
        defpackage.kir kirVar2 = new defpackage.kir("CAR", 1);
        b = kirVar2;
        c = new defpackage.kir[]{kirVar, kirVar2};
    }

    public static defpackage.kir valueOf(java.lang.String str) {
        return (defpackage.kir) java.lang.Enum.valueOf(defpackage.kir.class, str);
    }

    public static defpackage.kir[] values() {
        return (defpackage.kir[]) c.clone();
    }
}
