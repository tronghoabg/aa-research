package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class htx {
    public static final htx a;
    public static final htx b;
    public static final htx c;
    public static final htx d;
    private static final /* synthetic */ htx[] e;

    static {
        htx htxVar = new htx("CLEARED", 0);
        a = htxVar;
        htx htxVar2 = new htx("RUNNING", 1);
        b = htxVar2;
        htx htxVar3 = new htx("SUCCEEDED", 2);
        c = htxVar3;
        htx htxVar4 = new htx("FAILED", 3);
        d = htxVar4;
        htx[] htxVarArr = {htxVar, htxVar2, htxVar3, htxVar4};
        e = htxVarArr;
        affa.p(htxVarArr);
    }

    public static htx valueOf(String str) {
        return (htx) Enum.valueOf(htx.class, str);
    }

    public static htx[] values() {
        return (htx[]) e.clone();
    }
}
