package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zoo {
    public static final zoo a;
    public static final zoo b;
    public static final zoo c;
    public static final zoo d;
    private static final /* synthetic */ zoo[] e;

    static {
        zoo zooVar = new zoo("POSSIBLE", 0);
        a = zooVar;
        zoo zooVar2 = new zoo("VALID", 1);
        b = zooVar2;
        zoo zooVar3 = new zoo("STRICT_GROUPING", 2);
        c = zooVar3;
        zoo zooVar4 = new zoo("EXACT_GROUPING", 3);
        d = zooVar4;
        e = new zoo[]{zooVar, zooVar2, zooVar3, zooVar4};
    }

    public static zoo valueOf(String str) {
        return (zoo) Enum.valueOf(zoo.class, str);
    }

    public static zoo[] values() {
        return (zoo[]) e.clone();
    }
}
