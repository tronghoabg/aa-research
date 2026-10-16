package defpackage;

/* loaded from: classes.dex */
final class in implements hr {
    final /* synthetic */ io a;

    public in(io ioVar) {
        this.a = ioVar;
    }

    @Override // defpackage.hr
    public final void a(hg hgVar, boolean z) {
        if (hgVar instanceof ia) {
            hgVar.a().i(false);
        }
        hr hrVar = this.a.e;
        if (hrVar != null) {
            hrVar.a(hgVar, z);
        }
    }

    @Override // defpackage.hr
    public final boolean b(hg hgVar) {
        io ioVar = this.a;
        if (hgVar == ioVar.c) {
            return false;
        }
        hi hiVar = ((ia) hgVar).l;
        hr hrVar = ioVar.e;
        if (hrVar != null) {
            return hrVar.b(hgVar);
        }
        return false;
    }
}
