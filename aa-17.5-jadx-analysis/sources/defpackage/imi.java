package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class imi {
    public static final imi a;
    public static final imi b;
    public static final imi c;
    public static final imi d;
    public static final imi e;
    private static final /* synthetic */ imi[] f;

    static {
        imi imiVar = new imi("DISCONNECTED", 0);
        a = imiVar;
        imi imiVar2 = new imi("CONNECTION_SKIPPED_FOR_TEST", 1);
        b = imiVar2;
        imi imiVar3 = new imi("CONNECTING", 2);
        c = imiVar3;
        imi imiVar4 = new imi("CONNECTED", 3);
        d = imiVar4;
        imi imiVar5 = new imi("PROJECTION_STARTED", 4);
        e = imiVar5;
        f = new imi[]{imiVar, imiVar2, imiVar3, imiVar4, imiVar5};
    }

    public static imi valueOf(String str) {
        return (imi) Enum.valueOf(imi.class, str);
    }

    public static imi[] values() {
        return (imi[]) f.clone();
    }
}
