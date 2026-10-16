package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
final class adtd extends adti {
    public final adld a;
    public final adjq b;
    public final adjb[] c;
    public volatile adnq d;
    final /* synthetic */ adte e;
    private String g;
    private String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adtd(adte adteVar, adld adldVar, adjb[] adjbVarArr, String str, String str2) {
        super("connecting_and_lb");
        this.e = adteVar;
        this.b = adjq.k();
        this.a = adldVar;
        this.c = adjbVarArr;
        this.g = str;
        this.h = str2;
        for (adjb adjbVar : adjbVarArr) {
        }
    }

    @Override // defpackage.adti, defpackage.adsh
    public final void b(aduk adukVar) {
        if (this.a.a.h()) {
            adukVar.a("wait_for_ready");
            adnq adnqVar = this.d;
            if (adnqVar != null && !adnqVar.g()) {
                adukVar.b("Last Pick Failure", adnqVar);
            }
        }
        super.b(adukVar);
    }

    @Override // defpackage.adti, defpackage.adsh
    public final void c(adnq adnqVar) {
        super.c(adnqVar);
        adte adteVar = this.e;
        synchronized (adteVar.a) {
            if (adteVar.e != null) {
                boolean zRemove = adteVar.g.remove(this);
                if (!adteVar.d() && zRemove) {
                    adnw adnwVar = adteVar.b;
                    adnwVar.b(adteVar.d);
                    if (adteVar.h.a != null) {
                        adnwVar.b(adteVar.e);
                        adteVar.e = null;
                    }
                }
            }
        }
        this.e.b.a();
    }

    final synchronized void p() {
        if (this.g != null) {
            for (adjb adjbVar : this.c) {
            }
            this.g = null;
            this.h = null;
        }
    }

    final synchronized void q(String str, String str2) {
        if (this.f == null) {
            if (!Objects.equals(this.g, str)) {
                if (this.g != null) {
                    for (adjb adjbVar : this.c) {
                    }
                }
                this.g = str;
                this.h = null;
                for (adjb adjbVar2 : this.c) {
                }
            }
            if (!Objects.equals(this.h, str2)) {
                this.h = str2;
                for (adjb adjbVar3 : this.c) {
                }
            }
        }
    }

    @Override // defpackage.adti
    protected final void r() {
        p();
        int i = 0;
        while (true) {
            adjb[] adjbVarArr = this.c;
            if (i >= adjbVarArr.length) {
                return;
            }
            adjb adjbVar = adjbVarArr[i];
            i++;
        }
    }
}
