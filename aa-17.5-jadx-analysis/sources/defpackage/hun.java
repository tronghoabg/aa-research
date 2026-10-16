package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hun {
    public static final hun a;
    public static final hun b;
    private static final /* synthetic */ hun[] c;

    static {
        hun hunVar = new hun("SRGB", 0);
        a = hunVar;
        hun hunVar2 = new hun("DISPLAY_P3", 1);
        b = hunVar2;
        c = new hun[]{hunVar, hunVar2};
    }

    public static hun valueOf(String str) {
        return (hun) Enum.valueOf(hun.class, str);
    }

    public static hun[] values() {
        return (hun[]) c.clone();
    }
}
