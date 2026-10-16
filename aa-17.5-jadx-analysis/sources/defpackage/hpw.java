package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hpw {
    public static final hpw a;
    public static final hpw b;
    public static final /* synthetic */ afdf c;
    private static final /* synthetic */ hpw[] e;
    public final int d;

    static {
        hpw hpwVar = new hpw("EVENT", 0, 0);
        a = hpwVar;
        hpw hpwVar2 = new hpw("LOCATION", 1, 1);
        b = hpwVar2;
        hpw[] hpwVarArr = {hpwVar, hpwVar2};
        e = hpwVarArr;
        c = affa.p(hpwVarArr);
    }

    private hpw(String str, int i, int i2) {
        this.d = i2;
    }

    public static hpw valueOf(String str) {
        return (hpw) Enum.valueOf(hpw.class, str);
    }

    public static hpw[] values() {
        return (hpw[]) e.clone();
    }
}
