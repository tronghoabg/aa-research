package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hux {
    public static final defpackage.hux a;
    public static final defpackage.hux b;
    private static final /* synthetic */ defpackage.hux[] c;

    static {
        defpackage.hux huxVar = new defpackage.hux("SRGB", 0);
        a = huxVar;
        defpackage.hux huxVar2 = new defpackage.hux("DISPLAY_P3", 1);
        b = huxVar2;
        c = new defpackage.hux[]{huxVar, huxVar2};
    }

    public static defpackage.hux valueOf(java.lang.String str) {
        return (defpackage.hux) java.lang.Enum.valueOf(defpackage.hux.class, str);
    }

    public static defpackage.hux[] values() {
        return (defpackage.hux[]) c.clone();
    }
}
