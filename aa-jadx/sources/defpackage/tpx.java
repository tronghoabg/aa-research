package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tpx {
    public static final defpackage.tpx a;
    public static final defpackage.tpx b;
    public static final defpackage.tpx c;
    public static final defpackage.tpx d;
    public static final defpackage.tpx e;
    public static final defpackage.tpx f;
    public static final defpackage.tpx g;
    private static final /* synthetic */ defpackage.tpx[] h;

    static {
        defpackage.tpx tpxVar = new defpackage.tpx("UNKNOWN", 0);
        a = tpxVar;
        defpackage.tpx tpxVar2 = new defpackage.tpx("NETWORK", 1);
        b = tpxVar2;
        defpackage.tpx tpxVar3 = new defpackage.tpx("DISK_CACHE", 2);
        c = tpxVar3;
        defpackage.tpx tpxVar4 = new defpackage.tpx("UPDATED_FROM_NETWORK", 3);
        d = tpxVar4;
        defpackage.tpx tpxVar5 = new defpackage.tpx("OFFLINE", 4);
        e = tpxVar5;
        defpackage.tpx tpxVar6 = new defpackage.tpx("UPDATED_FROM_NETWORK_DATA_UNCHANGED", 5);
        f = tpxVar6;
        defpackage.tpx tpxVar7 = new defpackage.tpx("OFFLINE_UPDATED_FROM_NETWORK_DATA_UNCHANGED", 6);
        g = tpxVar7;
        h = new defpackage.tpx[]{tpxVar, tpxVar2, tpxVar3, tpxVar4, tpxVar5, tpxVar6, tpxVar7};
    }

    public static defpackage.tpx valueOf(java.lang.String str) {
        return (defpackage.tpx) java.lang.Enum.valueOf(defpackage.tpx.class, str);
    }

    public static defpackage.tpx[] values() {
        return (defpackage.tpx[]) h.clone();
    }
}
