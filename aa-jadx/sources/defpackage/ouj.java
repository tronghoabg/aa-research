package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ouj {
    public static final defpackage.ouj a;
    public static final defpackage.ouj b;
    public static final defpackage.ouj c;
    public static final defpackage.ouj d;
    public static final defpackage.ouj e;
    private static final /* synthetic */ defpackage.ouj[] f;

    static {
        defpackage.ouj oujVar = new defpackage.ouj("TRANSCRIPTION_CHANGED", 0);
        a = oujVar;
        defpackage.ouj oujVar2 = new defpackage.ouj("TRANSCRIPTION_FINISHED", 1);
        b = oujVar2;
        defpackage.ouj oujVar3 = new defpackage.ouj("TRANSCRIPTION_SESSION_ENDED", 2);
        c = oujVar3;
        defpackage.ouj oujVar4 = new defpackage.ouj("ASSISTANT_TEXT", 3);
        d = oujVar4;
        defpackage.ouj oujVar5 = new defpackage.ouj("EVENT_NOT_SET", 4);
        e = oujVar5;
        f = new defpackage.ouj[]{oujVar, oujVar2, oujVar3, oujVar4, oujVar5};
    }

    public static defpackage.ouj a(int i) {
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

    public static defpackage.ouj valueOf(java.lang.String str) {
        return (defpackage.ouj) java.lang.Enum.valueOf(defpackage.ouj.class, str);
    }

    public static defpackage.ouj[] values() {
        return (defpackage.ouj[]) f.clone();
    }
}
