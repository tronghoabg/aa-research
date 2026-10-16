package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class uso {
    public static final uso a;
    public static final uso b;
    public static final uso c;
    public static final uso d;
    public static final uso e;
    public static final uso f;
    public static final int g;
    private static final /* synthetic */ uso[] h;

    static {
        uso usoVar = new uso("NEXT", 0);
        a = usoVar;
        uso usoVar2 = new uso("PREV", 1);
        b = usoVar2;
        uso usoVar3 = new uso("Y", 2);
        c = usoVar3;
        uso usoVar4 = new uso("HEIGHT", 3);
        d = usoVar4;
        uso usoVar5 = new uso("CELL_COUNT", 4);
        e = usoVar5;
        uso usoVar6 = new uso("HOLE_LIMIT", 5);
        f = usoVar6;
        h = new uso[]{usoVar, usoVar2, usoVar3, usoVar4, usoVar5, usoVar6};
        g = values().length;
    }

    public static uso valueOf(String str) {
        return (uso) Enum.valueOf(uso.class, str);
    }

    public static uso[] values() {
        return (uso[]) h.clone();
    }

    final int a(int[] iArr, int i) {
        return iArr[(i * g) + ordinal()];
    }

    final void b(int[] iArr, int i, int i2) {
        iArr[(i * g) + ordinal()] = i2;
    }
}
