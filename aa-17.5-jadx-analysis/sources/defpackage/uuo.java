package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuo implements utf {
    public static final uuo a;
    public static final int b;
    private static final /* synthetic */ uuo[] c;

    static {
        uuo uuoVar = new uuo();
        a = uuoVar;
        c = new uuo[]{uuoVar};
        b = uul.b + uul.values().length;
    }

    private uuo() {
    }

    public static uuo valueOf(String str) {
        return (uuo) Enum.valueOf(uuo.class, str);
    }

    public static uuo[] values() {
        return (uuo[]) c.clone();
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
        return uvp.l;
    }
}
