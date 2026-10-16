package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nsi {
    public static final nsi a;
    public static final nsi b;
    public static final nsi c;
    private static final /* synthetic */ nsi[] d;

    static {
        nsi nsiVar = new nsi("INACTIVE", 0);
        a = nsiVar;
        nsi nsiVar2 = new nsi("ACTIVE", 1);
        b = nsiVar2;
        nsi nsiVar3 = new nsi("UPDATING", 2);
        c = nsiVar3;
        d = new nsi[]{nsiVar, nsiVar2, nsiVar3};
    }

    public static nsi valueOf(String str) {
        return (nsi) Enum.valueOf(nsi.class, str);
    }

    public static nsi[] values() {
        return (nsi[]) d.clone();
    }
}
