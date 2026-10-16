package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class omw {
    public static final omw a;
    public static final omw b;
    public static final omw c;
    private static final /* synthetic */ omw[] d;

    static {
        omw omwVar = new omw("NOTHING_PLAYING", 0);
        a = omwVar;
        omw omwVar2 = new omw("PLAYBACK_CONTROLS", 1);
        b = omwVar2;
        omw omwVar3 = new omw("ERROR", 2);
        c = omwVar3;
        d = new omw[]{omwVar, omwVar2, omwVar3};
    }

    public static omw valueOf(String str) {
        return (omw) Enum.valueOf(omw.class, str);
    }

    public static omw[] values() {
        return (omw[]) d.clone();
    }
}
