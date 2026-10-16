package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nuu {
    public static final defpackage.nuu a;
    public static final defpackage.nuu b;
    public static final defpackage.nuu c;
    public static final defpackage.nuu d;
    private static final /* synthetic */ defpackage.nuu[] e;

    static {
        defpackage.nuu nuuVar = new defpackage.nuu("ALLOWED", 0);
        a = nuuVar;
        defpackage.nuu nuuVar2 = new defpackage.nuu("VISUAL_EFFECT_SUPPRESSED", 1);
        b = nuuVar2;
        defpackage.nuu nuuVar3 = new defpackage.nuu("AUDIO_EFFECT_SUPPRESSED", 2);
        c = nuuVar3;
        defpackage.nuu nuuVar4 = new defpackage.nuu("SOURCE_SUSPENDED", 3);
        d = nuuVar4;
        e = new defpackage.nuu[]{nuuVar, nuuVar2, nuuVar3, nuuVar4};
    }

    public static defpackage.nuu valueOf(java.lang.String str) {
        return (defpackage.nuu) java.lang.Enum.valueOf(defpackage.nuu.class, str);
    }

    public static defpackage.nuu[] values() {
        return (defpackage.nuu[]) e.clone();
    }
}
