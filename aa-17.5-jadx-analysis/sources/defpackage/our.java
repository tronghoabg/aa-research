package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class our {
    public static final our a;
    private static final /* synthetic */ our[] b;

    static {
        our ourVar = new our();
        a = ourVar;
        b = new our[]{ourVar};
    }

    private our() {
    }

    public static our valueOf(String str) {
        return (our) Enum.valueOf(our.class, str);
    }

    public static our[] values() {
        return (our[]) b.clone();
    }
}
