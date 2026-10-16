package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class onp {
    public static final defpackage.onp a;
    public static final defpackage.onp b;
    public static final defpackage.onp c;
    private static final /* synthetic */ defpackage.onp[] d;

    static {
        defpackage.onp onpVar = new defpackage.onp("NOTHING_PLAYING", 0);
        a = onpVar;
        defpackage.onp onpVar2 = new defpackage.onp("PLAYBACK_CONTROLS", 1);
        b = onpVar2;
        defpackage.onp onpVar3 = new defpackage.onp("ERROR", 2);
        c = onpVar3;
        d = new defpackage.onp[]{onpVar, onpVar2, onpVar3};
    }

    public static defpackage.onp valueOf(java.lang.String str) {
        return (defpackage.onp) java.lang.Enum.valueOf(defpackage.onp.class, str);
    }

    public static defpackage.onp[] values() {
        return (defpackage.onp[]) d.clone();
    }
}
