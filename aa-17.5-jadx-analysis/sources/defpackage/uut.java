package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uut implements utf {
    public static final uut a;
    public static final int b;
    private static final /* synthetic */ uut[] c;

    static {
        uut uutVar = new uut();
        a = uutVar;
        c = new uut[]{uutVar};
        b = uuo.b + uuo.values().length;
    }

    private uut() {
    }

    public static uut valueOf(String str) {
        return (uut) Enum.valueOf(uut.class, str);
    }

    public static uut[] values() {
        return (uut[]) c.clone();
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
        return uvp.m;
    }
}
