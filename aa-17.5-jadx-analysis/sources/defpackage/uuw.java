package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuw implements utf {
    public static final uuw a;
    public static final int b;
    private static final /* synthetic */ uuw[] c;

    static {
        uuw uuwVar = new uuw();
        a = uuwVar;
        c = new uuw[]{uuwVar};
        b = uuy.values().length;
    }

    private uuw() {
    }

    public static uuw valueOf(String str) {
        return (uuw) Enum.valueOf(uuw.class, str);
    }

    public static uuw[] values() {
        return (uuw[]) c.clone();
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
        return uvp.b;
    }
}
