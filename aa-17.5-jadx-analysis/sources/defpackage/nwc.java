package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nwc {
    public static final nwc a;
    public static final nwc b;
    public static final nwc c;
    private static final /* synthetic */ nwc[] f;
    public final int d;
    public final int e;

    static {
        nwc nwcVar = new nwc("UP", 0, 0, -1);
        a = nwcVar;
        nwc nwcVar2 = new nwc("LEFT", 1, -1, 0);
        b = nwcVar2;
        nwc nwcVar3 = new nwc("RIGHT", 2, 1, 0);
        c = nwcVar3;
        nwc[] nwcVarArr = {nwcVar, nwcVar2, nwcVar3};
        f = nwcVarArr;
        affa.p(nwcVarArr);
    }

    private nwc(String str, int i, int i2, int i3) {
        this.d = i2;
        this.e = i3;
    }

    public static nwc valueOf(String str) {
        return (nwc) Enum.valueOf(nwc.class, str);
    }

    public static nwc[] values() {
        return (nwc[]) f.clone();
    }
}
