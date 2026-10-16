package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gid {
    public static final gid a;
    public static final gid b;
    private static final /* synthetic */ gid[] c;

    static {
        gid gidVar = new gid("IDLE", 0);
        a = gidVar;
        gid gidVar2 = new gid("ENGAGED", 1);
        b = gidVar2;
        gid[] gidVarArr = {gidVar, gidVar2};
        c = gidVarArr;
        affa.p(gidVarArr);
    }

    public static gid valueOf(String str) {
        return (gid) Enum.valueOf(gid.class, str);
    }

    public static gid[] values() {
        return (gid[]) c.clone();
    }
}
