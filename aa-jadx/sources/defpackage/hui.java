package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hui {
    public static final defpackage.hui a;
    public static final defpackage.hui b;
    public static final defpackage.hui c;
    private static final /* synthetic */ defpackage.hui[] d;

    static {
        defpackage.hui huiVar = new defpackage.hui("PREFER_ARGB_8888", 0);
        a = huiVar;
        defpackage.hui huiVar2 = new defpackage.hui("PREFER_RGB_565", 1);
        b = huiVar2;
        d = new defpackage.hui[]{huiVar, huiVar2};
        c = huiVar;
    }

    public static defpackage.hui valueOf(java.lang.String str) {
        return (defpackage.hui) java.lang.Enum.valueOf(defpackage.hui.class, str);
    }

    public static defpackage.hui[] values() {
        return (defpackage.hui[]) d.clone();
    }
}
