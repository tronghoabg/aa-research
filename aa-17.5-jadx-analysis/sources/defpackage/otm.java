package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class otm {
    public static final otm a;
    public static final otm b;
    public static final otm c;
    public static final otm d;
    public static final otm e;
    private static final /* synthetic */ otm[] f;

    static {
        otm otmVar = new otm("TRANSCRIPTION_CHANGED", 0);
        a = otmVar;
        otm otmVar2 = new otm("TRANSCRIPTION_FINISHED", 1);
        b = otmVar2;
        otm otmVar3 = new otm("TRANSCRIPTION_SESSION_ENDED", 2);
        c = otmVar3;
        otm otmVar4 = new otm("ASSISTANT_TEXT", 3);
        d = otmVar4;
        otm otmVar5 = new otm("EVENT_NOT_SET", 4);
        e = otmVar5;
        f = new otm[]{otmVar, otmVar2, otmVar3, otmVar4, otmVar5};
    }

    public static otm a(int i) {
        if (i == 0) {
            return e;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i != 4) {
            return null;
        }
        return d;
    }

    public static otm valueOf(String str) {
        return (otm) Enum.valueOf(otm.class, str);
    }

    public static otm[] values() {
        return (otm[]) f.clone();
    }
}
