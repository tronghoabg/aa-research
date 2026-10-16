package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hsh {
    public static final hsh a;
    public static final hsh b;
    public static final hsh c;
    public static final hsh d;
    private static final /* synthetic */ hsh[] e;

    static {
        hsh hshVar = new hsh("IMMEDIATE", 0);
        a = hshVar;
        hsh hshVar2 = new hsh("HIGH", 1);
        b = hshVar2;
        hsh hshVar3 = new hsh("NORMAL", 2);
        c = hshVar3;
        hsh hshVar4 = new hsh("LOW", 3);
        d = hshVar4;
        e = new hsh[]{hshVar, hshVar2, hshVar3, hshVar4};
    }

    public static hsh valueOf(String str) {
        return (hsh) Enum.valueOf(hsh.class, str);
    }

    public static hsh[] values() {
        return (hsh[]) e.clone();
    }
}
