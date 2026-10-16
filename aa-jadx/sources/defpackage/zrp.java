package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zrp {
    public static final defpackage.zrp a;
    public static final defpackage.zrp b;
    public static final defpackage.zrp c;
    public static final defpackage.zrp d;
    private static final /* synthetic */ defpackage.zrp[] e;

    static {
        defpackage.zrp zrpVar = new defpackage.zrp("BUCKET_EVENT", 0);
        a = zrpVar;
        defpackage.zrp zrpVar2 = new defpackage.zrp("COUNT_EVENT", 1);
        b = zrpVar2;
        defpackage.zrp zrpVar3 = new defpackage.zrp("TIMER_EVENT", 2);
        c = zrpVar3;
        defpackage.zrp zrpVar4 = new defpackage.zrp("EVENT_NOT_SET", 3);
        d = zrpVar4;
        e = new defpackage.zrp[]{zrpVar, zrpVar2, zrpVar3, zrpVar4};
    }

    public static defpackage.zrp a(int i) {
        if (i == 0) {
            return d;
        }
        if (i == 2) {
            return a;
        }
        if (i == 3) {
            return b;
        }
        if (i != 4) {
            return null;
        }
        return c;
    }

    public static defpackage.zrp valueOf(java.lang.String str) {
        return (defpackage.zrp) java.lang.Enum.valueOf(defpackage.zrp.class, str);
    }

    public static defpackage.zrp[] values() {
        return (defpackage.zrp[]) e.clone();
    }
}
