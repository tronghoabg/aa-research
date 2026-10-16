package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lfi {
    public static final defpackage.lfi a;
    public static final defpackage.lfi b;
    public static final defpackage.lfi c;
    private static final /* synthetic */ defpackage.lfi[] d;

    static {
        defpackage.lfi lfiVar = new defpackage.lfi("GRANTED", 0);
        a = lfiVar;
        defpackage.lfi lfiVar2 = new defpackage.lfi("DENIED", 1);
        b = lfiVar2;
        defpackage.lfi lfiVar3 = new defpackage.lfi("DENY_DO_NOT_ASK_AGAIN", 2);
        c = lfiVar3;
        d = new defpackage.lfi[]{lfiVar, lfiVar2, lfiVar3};
    }

    public static defpackage.lfi valueOf(java.lang.String str) {
        return (defpackage.lfi) java.lang.Enum.valueOf(defpackage.lfi.class, str);
    }

    public static defpackage.lfi[] values() {
        return (defpackage.lfi[]) d.clone();
    }
}
