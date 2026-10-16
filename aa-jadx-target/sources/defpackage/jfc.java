package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfc {
    public static final defpackage.jfc a;
    public static final defpackage.jfc b;
    public static final defpackage.jfc c;
    public static final defpackage.jfc d;
    public static final defpackage.jfc e;
    private static final /* synthetic */ defpackage.jfc[] f;

    static {
        defpackage.jfc jfcVar = new defpackage.jfc("FRAMER_READER_THREAD", 0);
        a = jfcVar;
        defpackage.jfc jfcVar2 = new defpackage.jfc("AUDIO_CAPTURE_THREAD", 1);
        b = jfcVar2;
        defpackage.jfc jfcVar3 = new defpackage.jfc("VIDEO_FOCUS_HANDLING_THREAD", 2);
        c = jfcVar3;
        defpackage.jfc jfcVar4 = new defpackage.jfc("VIDEO_ENCODING_THREAD", 3);
        d = jfcVar4;
        defpackage.jfc jfcVar5 = new defpackage.jfc("WINDOW_MANAGER_COMPOSITION_THREAD", 4);
        e = jfcVar5;
        f = new defpackage.jfc[]{jfcVar, jfcVar2, jfcVar3, jfcVar4, jfcVar5};
    }

    public static defpackage.jfc valueOf(java.lang.String str) {
        return (defpackage.jfc) java.lang.Enum.valueOf(defpackage.jfc.class, str);
    }

    public static defpackage.jfc[] values() {
        return (defpackage.jfc[]) f.clone();
    }
}
