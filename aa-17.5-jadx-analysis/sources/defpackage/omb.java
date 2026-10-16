package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class omb {
    public static final omb a;
    public static final omb b;
    private static final /* synthetic */ omb[] c;

    static {
        omb ombVar = new omb("LEFT", 0);
        a = ombVar;
        omb ombVar2 = new omb("RIGHT", 1);
        b = ombVar2;
        c = new omb[]{ombVar, ombVar2};
    }

    public static omb valueOf(String str) {
        return (omb) Enum.valueOf(omb.class, str);
    }

    public static omb[] values() {
        return (omb[]) c.clone();
    }
}
