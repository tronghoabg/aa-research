package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nkb {
    public static final nkb a;
    public static final nkb b;
    private static final /* synthetic */ nkb[] c;

    static {
        nkb nkbVar = new nkb("Measurement", 0);
        a = nkbVar;
        nkb nkbVar2 = new nkb("Content", 1);
        b = nkbVar2;
        nkb[] nkbVarArr = {nkbVar, nkbVar2};
        c = nkbVarArr;
        affa.p(nkbVarArr);
    }

    public static nkb valueOf(String str) {
        return (nkb) Enum.valueOf(nkb.class, str);
    }

    public static nkb[] values() {
        return (nkb[]) c.clone();
    }
}
