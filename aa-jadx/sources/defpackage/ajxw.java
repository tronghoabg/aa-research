package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ajxw extends defpackage.akaw implements defpackage.ajst {
    public final defpackage.ajqh a;
    public java.net.URI b;
    public int c;
    private java.lang.String f;
    private defpackage.ajqt g;

    public ajxw(defpackage.ajqh ajqhVar) throws defpackage.ajqs {
        defpackage.aguw.e(ajqhVar, "HTTP request");
        this.a = ajqhVar;
        j(ajqhVar.hj());
        i(ajqhVar.l());
        if (ajqhVar instanceof defpackage.ajst) {
            defpackage.ajst ajstVar = (defpackage.ajst) ajqhVar;
            this.b = ajstVar.t();
            this.f = ajstVar.s();
            this.g = null;
        } else {
            defpackage.akbh akbhVarP = ajqhVar.p();
            try {
                this.b = new java.net.URI(akbhVarP.c);
                this.f = akbhVarP.b;
                this.g = ajqhVar.d();
            } catch (java.net.URISyntaxException e) {
                throw new defpackage.ajqs("Invalid request URI: ".concat(akbhVarP.c), e);
            }
        }
        this.c = 0;
    }

    @Override // defpackage.ajqg
    public final defpackage.ajqt d() {
        defpackage.ajqt ajqtVar = this.g;
        if (ajqtVar != null) {
            return ajqtVar;
        }
        defpackage.ajqt ajqtVarB = defpackage.akbt.b(hj());
        this.g = ajqtVarB;
        return ajqtVarB;
    }

    @Override // defpackage.ajqh
    public final defpackage.akbh p() {
        defpackage.ajqt ajqtVarD = d();
        java.net.URI uri = this.b;
        java.lang.String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new defpackage.akbh(this.f, aSCIIString, ajqtVarD);
    }

    public boolean q() {
        return true;
    }

    @Override // defpackage.ajst
    public final boolean r() {
        return false;
    }

    @Override // defpackage.ajst
    public final java.lang.String s() {
        return this.f;
    }

    @Override // defpackage.ajst
    public final java.net.URI t() {
        return this.b;
    }
}
