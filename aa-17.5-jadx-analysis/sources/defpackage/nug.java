package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nug {
    public static final nug a;
    public static final nug b;
    public static final nug c;
    public static final nug d;
    private static final /* synthetic */ nug[] e;

    static {
        nug nugVar = new nug("ALLOWED", 0);
        a = nugVar;
        nug nugVar2 = new nug("VISUAL_EFFECT_SUPPRESSED", 1);
        b = nugVar2;
        nug nugVar3 = new nug("AUDIO_EFFECT_SUPPRESSED", 2);
        c = nugVar3;
        nug nugVar4 = new nug("SOURCE_SUSPENDED", 3);
        d = nugVar4;
        e = new nug[]{nugVar, nugVar2, nugVar3, nugVar4};
    }

    public static nug valueOf(String str) {
        return (nug) Enum.valueOf(nug.class, str);
    }

    public static nug[] values() {
        return (nug[]) e.clone();
    }
}
