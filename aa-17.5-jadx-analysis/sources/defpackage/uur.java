package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uur implements utf {
    public static final uur a;
    public static final int b;
    private static final /* synthetic */ uur[] c;

    static {
        uur uurVar = new uur();
        a = uurVar;
        c = new uur[]{uurVar};
        b = uup.c + uup.values().length;
    }

    private uur() {
    }

    public static uur valueOf(String str) {
        return (uur) Enum.valueOf(uur.class, str);
    }

    public static uur[] values() {
        return (uur[]) c.clone();
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
        return uvp.o;
    }
}
