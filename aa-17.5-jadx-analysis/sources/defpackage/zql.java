package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zql {
    public static final zql a;
    public static final zql b;
    public static final zql c;
    public static final zql d;
    private static final /* synthetic */ zql[] e;

    static {
        zql zqlVar = new zql("BUCKET_EVENT", 0);
        a = zqlVar;
        zql zqlVar2 = new zql("COUNT_EVENT", 1);
        b = zqlVar2;
        zql zqlVar3 = new zql("TIMER_EVENT", 2);
        c = zqlVar3;
        zql zqlVar4 = new zql("EVENT_NOT_SET", 3);
        d = zqlVar4;
        e = new zql[]{zqlVar, zqlVar2, zqlVar3, zqlVar4};
    }

    public static zql a(int i) {
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

    public static zql valueOf(String str) {
        return (zql) Enum.valueOf(zql.class, str);
    }

    public static zql[] values() {
        return (zql[]) e.clone();
    }
}
