package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jeu {
    public static final jeu a;
    public static final jeu b;
    public static final jeu c;
    public static final jeu d;
    public static final jeu e;
    private static final /* synthetic */ jeu[] f;

    static {
        jeu jeuVar = new jeu("FRAMER_READER_THREAD", 0);
        a = jeuVar;
        jeu jeuVar2 = new jeu("AUDIO_CAPTURE_THREAD", 1);
        b = jeuVar2;
        jeu jeuVar3 = new jeu("VIDEO_FOCUS_HANDLING_THREAD", 2);
        c = jeuVar3;
        jeu jeuVar4 = new jeu("VIDEO_ENCODING_THREAD", 3);
        d = jeuVar4;
        jeu jeuVar5 = new jeu("WINDOW_MANAGER_COMPOSITION_THREAD", 4);
        e = jeuVar5;
        f = new jeu[]{jeuVar, jeuVar2, jeuVar3, jeuVar4, jeuVar5};
    }

    public static jeu valueOf(String str) {
        return (jeu) Enum.valueOf(jeu.class, str);
    }

    public static jeu[] values() {
        return (jeu[]) f.clone();
    }
}
