package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ube {
    public static final ube a;
    public static final ube b;
    public static final ube c;
    public static final ube d;
    private static final /* synthetic */ ube[] e;

    static {
        ube ubeVar = new ube("NONE", 0);
        a = ubeVar;
        ube ubeVar2 = new ube("IN", 1);
        b = ubeVar2;
        ube ubeVar3 = new ube("OUT", 2);
        c = ubeVar3;
        ube ubeVar4 = new ube("STEADY_STATE", 3);
        d = ubeVar4;
        e = new ube[]{ubeVar, ubeVar2, ubeVar3, ubeVar4};
    }

    public static ube valueOf(String str) {
        return (ube) Enum.valueOf(ube.class, str);
    }

    public static ube[] values() {
        return (ube[]) e.clone();
    }
}
