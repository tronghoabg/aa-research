package defpackage;

/* loaded from: classes.dex */
public final class adtq extends adws {
    private boolean b;
    private final adnq c;
    private final adsi d;
    private final adjb[] e;

    public adtq(adnq adnqVar, adsi adsiVar, adjb[] adjbVarArr) {
        woy.O(!adnqVar.g(), "error must not be OK");
        this.c = adnqVar;
        this.d = adsiVar;
        this.e = adjbVarArr;
    }

    @Override // defpackage.adws, defpackage.adsh
    public final void b(aduk adukVar) {
        adukVar.b("error", this.c);
        adukVar.b("progress", this.d);
    }

    @Override // defpackage.adws, defpackage.adsh
    public final void m(adsj adsjVar) {
        woy.aa(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            adjb[] adjbVarArr = this.e;
            if (i >= adjbVarArr.length) {
                adsjVar.a(this.c, this.d, new admc());
                return;
            } else {
                adjb adjbVar = adjbVarArr[i];
                i++;
            }
        }
    }

    public adtq(adnq adnqVar, adjb[] adjbVarArr) {
        this(adnqVar, adsi.a, adjbVarArr);
    }
}
