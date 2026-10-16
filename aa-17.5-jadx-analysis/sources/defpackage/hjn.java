package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hjn {
    public static final hjn a;
    public static final hjn b;
    public static final hjn c;
    private static final /* synthetic */ hjn[] e;
    public final int d;

    static {
        hjn hjnVar = new hjn("COMPACT", 0, 0);
        a = hjnVar;
        hjn hjnVar2 = new hjn("WIDE", 1, 1100);
        b = hjnVar2;
        hjn hjnVar3 = new hjn("EXTRA_WIDE", 2, 1500);
        c = hjnVar3;
        hjn[] hjnVarArr = {hjnVar, hjnVar2, hjnVar3};
        e = hjnVarArr;
        affa.p(hjnVarArr);
    }

    private hjn(String str, int i, int i2) {
        this.d = i2;
    }

    public static hjn valueOf(String str) {
        return (hjn) Enum.valueOf(hjn.class, str);
    }

    public static hjn[] values() {
        return (hjn[]) e.clone();
    }
}
