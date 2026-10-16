package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wie {
    public static final defpackage.wie a;
    public static final defpackage.wie b;
    public static final defpackage.wie c;
    public static final defpackage.wie d;
    public static final defpackage.wie e;
    private static final /* synthetic */ defpackage.wie[] f;

    static {
        defpackage.wie wieVar = new defpackage.wie("BACKEND_TIMEOUT", 0);
        a = wieVar;
        defpackage.wie wieVar2 = new defpackage.wie("FAILED_TO_FETCH_SURVEY", 1);
        b = wieVar2;
        defpackage.wie wieVar3 = new defpackage.wie("NO_AVAILABLE_SURVEY", 2);
        c = wieVar3;
        defpackage.wie wieVar4 = new defpackage.wie("TRIGGER_ID_NOT_SET", 3);
        d = wieVar4;
        defpackage.wie wieVar5 = new defpackage.wie("UNSUPPORTED_CRONET_ENGINE", 4);
        e = wieVar5;
        f = new defpackage.wie[]{wieVar, wieVar2, wieVar3, wieVar4, wieVar5};
    }

    public static defpackage.wie valueOf(java.lang.String str) {
        return (defpackage.wie) java.lang.Enum.valueOf(defpackage.wie.class, str);
    }

    public static defpackage.wie[] values() {
        return (defpackage.wie[]) f.clone();
    }
}
