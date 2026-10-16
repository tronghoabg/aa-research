package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yrs {
    public static final yrs a;
    public static final yrs b;
    public static final yrs c;
    public static final yrs d;
    private static final /* synthetic */ yrs[] e;

    static {
        yrs yrsVar = new yrs("BOOLEAN", 0);
        a = yrsVar;
        yrs yrsVar2 = new yrs("STRING", 1);
        b = yrsVar2;
        yrs yrsVar3 = new yrs("LONG", 2);
        c = yrsVar3;
        yrs yrsVar4 = new yrs("DOUBLE", 3);
        d = yrsVar4;
        e = new yrs[]{yrsVar, yrsVar2, yrsVar3, yrsVar4};
    }

    public static yrs a(Object obj) {
        if (obj instanceof String) {
            return b;
        }
        if (obj instanceof Boolean) {
            return a;
        }
        if (obj instanceof Long) {
            return c;
        }
        if (obj instanceof Double) {
            return d;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public static yrs valueOf(String str) {
        return (yrs) Enum.valueOf(yrs.class, str);
    }

    public static yrs[] values() {
        return (yrs[]) e.clone();
    }
}
