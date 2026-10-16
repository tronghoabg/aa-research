package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuk implements utf {
    public static final uuk a;
    public static final int b;
    private static final /* synthetic */ uuk[] c;

    static {
        uuk uukVar = new uuk();
        a = uukVar;
        c = new uuk[]{uukVar};
        b = uux.b + uux.values().length;
    }

    private uuk() {
    }

    public static uuk valueOf(String str) {
        return (uuk) Enum.valueOf(uuk.class, str);
    }

    public static uuk[] values() {
        return (uuk[]) c.clone();
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
