package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC2953f3 {
    public static final EnumC2953f3 OP;
    public static final EnumC2953f3 SPLITERATOR;
    public static final EnumC2953f3 STREAM;
    public static final EnumC2953f3 TERMINAL_OP;
    public static final EnumC2953f3 UPSTREAM_TERMINAL_OP;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC2953f3[] f38187a;

    public static EnumC2953f3 valueOf(String str) {
        return (EnumC2953f3) Enum.valueOf(EnumC2953f3.class, str);
    }

    public static EnumC2953f3[] values() {
        return (EnumC2953f3[]) f38187a.clone();
    }

    static {
        EnumC2953f3 enumC2953f3 = new EnumC2953f3("SPLITERATOR", 0);
        SPLITERATOR = enumC2953f3;
        EnumC2953f3 enumC2953f32 = new EnumC2953f3("STREAM", 1);
        STREAM = enumC2953f32;
        EnumC2953f3 enumC2953f33 = new EnumC2953f3("OP", 2);
        OP = enumC2953f33;
        EnumC2953f3 enumC2953f34 = new EnumC2953f3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC2953f34;
        EnumC2953f3 enumC2953f35 = new EnumC2953f3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC2953f35;
        f38187a = new EnumC2953f3[]{enumC2953f3, enumC2953f32, enumC2953f33, enumC2953f34, enumC2953f35};
    }
}
