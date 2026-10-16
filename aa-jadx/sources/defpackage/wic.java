package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wic {
    public static final defpackage.wic a;
    public static final defpackage.wic b;
    private static final /* synthetic */ defpackage.wic[] c;

    static {
        defpackage.wic wicVar = new defpackage.wic("FIRST_CARD_MODAL", 0);
        a = wicVar;
        defpackage.wic wicVar2 = new defpackage.wic("FIRST_CARD_NON_MODAL", 1);
        b = wicVar2;
        c = new defpackage.wic[]{wicVar, wicVar2};
    }

    public static defpackage.wic valueOf(java.lang.String str) {
        return (defpackage.wic) java.lang.Enum.valueOf(defpackage.wic.class, str);
    }

    public static defpackage.wic[] values() {
        return (defpackage.wic[]) c.clone();
    }
}
