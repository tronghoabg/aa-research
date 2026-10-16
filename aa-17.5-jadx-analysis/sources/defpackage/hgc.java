package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hgc {
    public static final hgc a;
    public static final hgc b;
    private static final /* synthetic */ hgc[] c;

    static {
        hgc hgcVar = new hgc("ACTIVE", 0);
        a = hgcVar;
        hgc hgcVar2 = new hgc("INACTIVE", 1);
        b = hgcVar2;
        hgc[] hgcVarArr = {hgcVar, hgcVar2};
        c = hgcVarArr;
        affa.p(hgcVarArr);
    }

    public static hgc valueOf(String str) {
        return (hgc) Enum.valueOf(hgc.class, str);
    }

    public static hgc[] values() {
        return (hgc[]) c.clone();
    }
}
