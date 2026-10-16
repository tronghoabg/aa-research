package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class plw {
    public static final defpackage.plw a;
    public static final defpackage.plw b;
    public static final defpackage.plw c;
    public static final defpackage.plw d;
    private static final /* synthetic */ defpackage.plw[] e;

    static {
        defpackage.plw plwVar = new defpackage.plw("ALL_LONG_LRU", 0);
        a = plwVar;
        defpackage.plw plwVar2 = new defpackage.plw("GL_LABEL", 1);
        b = plwVar2;
        defpackage.plw plwVar3 = new defpackage.plw("LABEL_PRIMARY_BOUNDARY", 2);
        c = plwVar3;
        defpackage.plw plwVar4 = new defpackage.plw("OTHER", 3);
        d = plwVar4;
        e = new defpackage.plw[]{plwVar, plwVar2, plwVar3, plwVar4};
    }

    public static defpackage.plw valueOf(java.lang.String str) {
        return (defpackage.plw) java.lang.Enum.valueOf(defpackage.plw.class, str);
    }

    public static defpackage.plw[] values() {
        return (defpackage.plw[]) e.clone();
    }
}
