package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pem implements peo {
    public static final pem a;
    private static final /* synthetic */ pem[] b;

    static {
        pem pemVar = new pem();
        a = pemVar;
        b = new pem[]{pemVar};
    }

    private pem() {
    }

    public static pem valueOf(String str) {
        return (pem) Enum.valueOf(pem.class, str);
    }

    public static pem[] values() {
        return (pem[]) b.clone();
    }
}
