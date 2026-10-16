package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gnl {
    public static final gnl a;
    public static final gnl b;
    public static final gnl c;
    public static final gnl d;
    public static final gnl e;
    public static final gnl f;
    public static final gnl g;
    public static final gnl h;
    private static final /* synthetic */ gnl[] i;

    static {
        gnl gnlVar = new gnl("UNKNOWN_ERROR", 0);
        a = gnlVar;
        gnl gnlVar2 = new gnl("BUNDLER_EXCEPTION", 1);
        b = gnlVar2;
        gnl gnlVar3 = new gnl("ILLEGAL_STATE_EXCEPTION", 2);
        c = gnlVar3;
        gnl gnlVar4 = new gnl("INVALID_PARAMETER_EXCEPTION", 3);
        d = gnlVar4;
        gnl gnlVar5 = new gnl("SECURITY_EXCEPTION", 4);
        e = gnlVar5;
        gnl gnlVar6 = new gnl("RUNTIME_EXCEPTION", 5);
        f = gnlVar6;
        gnl gnlVar7 = new gnl("REMOTE_EXCEPTION", 6);
        g = gnlVar7;
        gnl gnlVar8 = new gnl("ANR", 7);
        h = gnlVar8;
        i = new gnl[]{gnlVar, gnlVar2, gnlVar3, gnlVar4, gnlVar5, gnlVar6, gnlVar7, gnlVar8};
    }

    public static gnl valueOf(String str) {
        return (gnl) Enum.valueOf(gnl.class, str);
    }

    public static gnl[] values() {
        return (gnl[]) i.clone();
    }
}
