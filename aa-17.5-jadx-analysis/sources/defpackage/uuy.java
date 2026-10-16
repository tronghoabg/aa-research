package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuy implements utf {
    public static final uuy a;
    private static final /* synthetic */ uuy[] b;

    static {
        uuy uuyVar = new uuy();
        a = uuyVar;
        b = new uuy[]{uuyVar};
    }

    private uuy() {
    }

    public static uuy valueOf(String str) {
        return (uuy) Enum.valueOf(uuy.class, str);
    }

    public static uuy[] values() {
        return (uuy[]) b.clone();
    }

    @Override // defpackage.utf
    public final int a() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final uvp c() {
        return uvp.a;
    }
}
