package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uux implements utf {
    public static final uux a;
    public static final int b;
    private static final /* synthetic */ uux[] c;

    static {
        uux uuxVar = new uux();
        a = uuxVar;
        c = new uux[]{uuxVar};
        b = uun.d + uun.values().length;
    }

    private uux() {
    }

    public static uux valueOf(String str) {
        return (uux) Enum.valueOf(uux.class, str);
    }

    public static uux[] values() {
        return (uux[]) c.clone();
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
        return uvp.g;
    }
}
