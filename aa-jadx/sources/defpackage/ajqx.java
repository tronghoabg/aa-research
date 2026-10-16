package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ajqx {
    public static final defpackage.ajqx a;
    public static final defpackage.ajqx b;
    public static final defpackage.ajqx c;
    public static final defpackage.ajqx d;
    public static final defpackage.ajqx e;
    private static final /* synthetic */ defpackage.ajqx[] f;

    static {
        defpackage.ajqx ajqxVar = new defpackage.ajqx("UNCHALLENGED", 0);
        a = ajqxVar;
        defpackage.ajqx ajqxVar2 = new defpackage.ajqx("CHALLENGED", 1);
        b = ajqxVar2;
        defpackage.ajqx ajqxVar3 = new defpackage.ajqx("HANDSHAKE", 2);
        c = ajqxVar3;
        defpackage.ajqx ajqxVar4 = new defpackage.ajqx("FAILURE", 3);
        d = ajqxVar4;
        defpackage.ajqx ajqxVar5 = new defpackage.ajqx(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS, 4);
        e = ajqxVar5;
        f = new defpackage.ajqx[]{ajqxVar, ajqxVar2, ajqxVar3, ajqxVar4, ajqxVar5};
    }

    public static defpackage.ajqx valueOf(java.lang.String str) {
        return (defpackage.ajqx) java.lang.Enum.valueOf(defpackage.ajqx.class, str);
    }

    public static defpackage.ajqx[] values() {
        return (defpackage.ajqx[]) f.clone();
    }
}
