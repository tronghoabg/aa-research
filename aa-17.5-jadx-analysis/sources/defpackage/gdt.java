package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gdt {
    public static final gdt a;
    public static final gdt b;
    private static final /* synthetic */ gdt[] c;

    static {
        gdt gdtVar = new gdt("RECORDING", 0);
        a = gdtVar;
        gdt gdtVar2 = new gdt("NOT_RECORDING", 1);
        b = gdtVar2;
        c = new gdt[]{gdtVar, gdtVar2};
    }

    public static gdt valueOf(String str) {
        return (gdt) Enum.valueOf(gdt.class, str);
    }

    public static gdt[] values() {
        return (gdt[]) c.clone();
    }
}
