package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hdr {
    public static final hdr a;
    public static final hdr b;
    public static final hdr c;
    public static final hdr d;
    public static final hdr e;
    private static final /* synthetic */ hdr[] g;
    public final afeg f;

    static {
        hdr hdrVar = new hdr("LARGE", 0, new hdh(5));
        a = hdrVar;
        hdr hdrVar2 = new hdr("MEDIUM", 1, new hdh(6));
        b = hdrVar2;
        hdr hdrVar3 = new hdr("SMALL", 2, new hdh(7));
        c = hdrVar3;
        hdr hdrVar4 = new hdr("EXTRA_SMALL", 3, new hdh(8));
        d = hdrVar4;
        hdr hdrVar5 = new hdr("ICON", 4, new hdh(9));
        e = hdrVar5;
        hdr[] hdrVarArr = {hdrVar, hdrVar2, hdrVar3, hdrVar4, hdrVar5};
        g = hdrVarArr;
        affa.p(hdrVarArr);
    }

    private hdr(String str, int i, afeg afegVar) {
        this.f = afegVar;
    }

    public static hdr valueOf(String str) {
        return (hdr) Enum.valueOf(hdr.class, str);
    }

    public static hdr[] values() {
        return (hdr[]) g.clone();
    }
}
