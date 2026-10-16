package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rrx {
    public static final rrx a;
    public static final rrx b;
    public static final rrx c;
    private static final /* synthetic */ rrx[] d;

    static {
        rrx rrxVar = new rrx("STARTED", 0);
        a = rrxVar;
        rrx rrxVar2 = new rrx("COMPLETED", 1);
        b = rrxVar2;
        rrx rrxVar3 = new rrx("FAILED", 2);
        c = rrxVar3;
        d = new rrx[]{rrxVar, rrxVar2, rrxVar3};
    }

    public static rrx valueOf(String str) {
        return (rrx) Enum.valueOf(rrx.class, str);
    }

    public static rrx[] values() {
        return (rrx[]) d.clone();
    }
}
