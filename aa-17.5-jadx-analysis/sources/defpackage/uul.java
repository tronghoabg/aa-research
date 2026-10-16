package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uul implements utf {
    public static final uul a;
    public static final int b;
    private static final /* synthetic */ uul[] c;

    static {
        uul uulVar = new uul();
        a = uulVar;
        c = new uul[]{uulVar};
        b = uuv.n + uuv.values().length;
    }

    private uul() {
    }

    public static uul valueOf(String str) {
        return (uul) Enum.valueOf(uul.class, str);
    }

    public static uul[] values() {
        return (uul[]) c.clone();
    }

    @Override // defpackage.utf
    public final int a() {
        return b + ordinal();
    }

    @Override // defpackage.utf
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final uvp c() {
        return uvp.k;
    }
}
