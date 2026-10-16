package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nun {
    public static final nun a;
    public static final nun b;
    public static final nun c;
    public static final nun d;
    private static final /* synthetic */ nun[] e;

    static {
        nun nunVar = new nun("UNSET", 0);
        a = nunVar;
        nun nunVar2 = new nun("SET_TRUE", 1);
        b = nunVar2;
        nun nunVar3 = new nun("NOTIFICATION_CENTER_ONLY", 2);
        c = nunVar3;
        nun nunVar4 = new nun("SET_FALSE", 3);
        d = nunVar4;
        e = new nun[]{nunVar, nunVar2, nunVar3, nunVar4};
    }

    public static nun valueOf(String str) {
        return (nun) Enum.valueOf(nun.class, str);
    }

    public static nun[] values() {
        return (nun[]) e.clone();
    }
}
