package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class giz {
    public static final giz a;
    public static final giz b;
    public static final giz c;
    public static final giz d;
    private static final /* synthetic */ giz[] e;

    static {
        giz gizVar = new giz("Up", 0);
        a = gizVar;
        giz gizVar2 = new giz("Down", 1);
        b = gizVar2;
        giz gizVar3 = new giz("Left", 2);
        c = gizVar3;
        giz gizVar4 = new giz("Right", 3);
        d = gizVar4;
        giz[] gizVarArr = {gizVar, gizVar2, gizVar3, gizVar4};
        e = gizVarArr;
        affa.p(gizVarArr);
    }

    public static giz valueOf(String str) {
        return (giz) Enum.valueOf(giz.class, str);
    }

    public static giz[] values() {
        return (giz[]) e.clone();
    }
}
