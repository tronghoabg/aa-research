package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uum implements utf {
    public static final uum a;
    public static final int b;
    private static final /* synthetic */ uum[] c;

    static {
        uum uumVar = new uum();
        a = uumVar;
        c = new uum[]{uumVar};
        b = uuk.b + uuk.values().length;
    }

    private uum() {
    }

    public static uum valueOf(String str) {
        return (uum) Enum.valueOf(uum.class, str);
    }

    public static uum[] values() {
        return (uum[]) c.clone();
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
        return uvp.i;
    }
}
