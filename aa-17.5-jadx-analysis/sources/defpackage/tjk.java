package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tjk {
    public static final tjk a;
    public static final tjk b;
    public static final tjk c;
    public static final tjk d;
    private static final /* synthetic */ tjk[] e;

    static {
        tjk tjkVar = new tjk("AppIcon", 0);
        a = tjkVar;
        tjk tjkVar2 = new tjk("Back", 1);
        b = tjkVar2;
        tjk tjkVar3 = new tjk("Pan", 2);
        c = tjkVar3;
        tjk tjkVar4 = new tjk("ComposeMessage", 3);
        d = tjkVar4;
        tjk[] tjkVarArr = {tjkVar, tjkVar2, tjkVar3, tjkVar4};
        e = tjkVarArr;
        affa.p(tjkVarArr);
    }

    public static tjk valueOf(String str) {
        return (tjk) Enum.valueOf(tjk.class, str);
    }

    public static tjk[] values() {
        return (tjk[]) e.clone();
    }
}
