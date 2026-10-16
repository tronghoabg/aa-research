package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pac {
    public static final pac a;
    public static final pac b;
    private static final /* synthetic */ pac[] c;

    static {
        pac pacVar = new pac("RFCOMM", 0);
        a = pacVar;
        pac pacVar2 = new pac("TCP", 1);
        b = pacVar2;
        c = new pac[]{pacVar, pacVar2};
    }

    public static pac valueOf(String str) {
        return (pac) Enum.valueOf(pac.class, str);
    }

    public static pac[] values() {
        return (pac[]) c.clone();
    }
}
