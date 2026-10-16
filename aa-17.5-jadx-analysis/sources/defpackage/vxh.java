package defpackage;

/* loaded from: classes3.dex */
public final class vxh extends vmc {
    public vxh(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    protected final String e() {
        ajfk ajfkVar = this.a.m;
        if (ajfkVar == null) {
            ajfkVar = ajfk.a;
        }
        if ((ajfkVar.b & 16) != 0) {
            return ajfkVar.toString();
        }
        int iAp = a.ap(ajfkVar.c);
        String str = String.format("Trace Type: %s, Span Count: %s, Backend Trace ID: %s\n\n\n%s", (iAp == 0 || iAp == 1) ? "UNKNOWN" : iAp != 2 ? "MINI_TRACE" : "TIKTOK_TRACE", Integer.valueOf(ajfkVar.d.size()), (ajfkVar.b & 32) != 0 ? Long.valueOf(ajfkVar.f) : "Not Present", ajfkVar);
        for (ajfl ajflVar : ajfkVar.d) {
            abnh abnhVar = vxs.b;
            ajflVar.j(abnhVar);
            abnl abnlVar = ajflVar.w;
            abnu abnuVar = abnhVar.d;
            if (abnlVar.m(abnuVar)) {
                ajflVar.j(abnhVar);
                Object objJ = ajflVar.w.j(abnuVar);
                str = str + "\n\n\n" + String.valueOf((vxs) (objJ == null ? abnhVar.b : abnhVar.c(objJ)));
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vmc
    protected final String g() {
        ajfk ajfkVar = this.a.m;
        if (ajfkVar == null) {
            ajfkVar = ajfk.a;
        }
        if ((ajfkVar.b & 16) != 0) {
            return "Startup Measurements";
        }
        return "Trace: ".concat(String.valueOf((ajfkVar.d.size() <= 0 || (((ajfl) ajfkVar.d.get(0)).b & 1) == 0) ? "UNKNOWN ROOT SPAN" : ((ajfl) ajfkVar.d.get(0)).c));
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 1024) != 0;
    }
}
