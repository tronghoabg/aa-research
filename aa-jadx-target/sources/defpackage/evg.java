package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class evg extends defpackage.evf implements java.lang.Iterable<defpackage.evf>, defpackage.afhc {
    public static final /* synthetic */ int b = 0;
    public final defpackage.adnh a;

    public evg(defpackage.evv evvVar) {
        super(evvVar);
        this.a = new defpackage.adnh(this);
    }

    @Override // defpackage.evf
    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super.a(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, defpackage.ewe.d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        defpackage.adnh adnhVar = this.a;
        java.lang.Object obj = adnhVar.c;
        if (resourceId != ((defpackage.evf) obj).c()) {
            adnhVar.b = resourceId;
            adnhVar.d = null;
            adnhVar.d = defpackage.ebm.g(new defpackage.erh(context), resourceId);
            typedArrayObtainAttributes.recycle();
            return;
        }
        throw new java.lang.IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + obj);
    }

    @Override // defpackage.evf
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.evg) && super.equals(obj)) {
            defpackage.evg evgVar = (defpackage.evg) obj;
            if (k().c() == evgVar.k().c() && j() == evgVar.j()) {
                java.util.Iterator itA = afsg.b(defpackage.ca.ac(k())).a();
                while (itA.hasNext()) {
                    defpackage.evf evfVar = (defpackage.evf) itA.next();
                    if (!defpackage.afga.f(evfVar, defpackage.abc.a(evgVar.k(), evfVar.c()))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.evf
    public final defpackage.eve f(defpackage.evd evdVar) {
        defpackage.adnh adnhVar = this.a;
        return adnhVar.f(super.f(evdVar), evdVar, false, (defpackage.evf) adnhVar.c);
    }

    @Override // defpackage.evf
    public final int hashCode() {
        int iJ = j();
        defpackage.abb abbVarK = k();
        int iC = abbVarK.c();
        for (int i = 0; i < iC; i++) {
            iJ = (((iJ * 31) + abbVarK.b(i)) * 31) + ((defpackage.evf) abbVarK.e(i)).hashCode();
        }
        return iJ;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<defpackage.evf> iterator() {
        return new ewx(this.a);
    }

    public final int j() {
        return this.a.b;
    }

    public final defpackage.abb k() {
        return (defpackage.abb) this.a.a;
    }

    public final defpackage.evf l(int i) {
        defpackage.adnh adnhVar = this.a;
        return adnhVar.e(i, (defpackage.evf) adnhVar.c, false, null);
    }

    public final defpackage.evf m(int i, defpackage.evf evfVar, boolean z, defpackage.evf evfVar2) {
        return this.a.e(i, evfVar, z, evfVar2);
    }

    public final java.lang.String n() {
        java.lang.String strG = super.g();
        if (strG == null) {
            strG = java.lang.String.valueOf(c());
        }
        defpackage.adnh adnhVar = this.a;
        strG.getClass();
        return ((defpackage.evf) adnhVar.c).c() != 0 ? strG : "the root navigation";
    }

    public final void o(defpackage.evf evfVar) {
        int iC = evfVar.c();
        java.lang.String strH = evfVar.h();
        if (iC == 0) {
            if (strH == null) {
                throw new java.lang.IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            }
            iC = 0;
        }
        defpackage.adnh adnhVar = this.a;
        java.lang.Object obj = adnhVar.c;
        defpackage.evf evfVar2 = (defpackage.evf) obj;
        if (evfVar2.h() != null && defpackage.afga.f(strH, evfVar2.h())) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(obj, evfVar, "Destination ", " cannot have the same route as graph "));
        }
        if (iC == evfVar2.c()) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(obj, evfVar, "Destination ", " cannot have the same id as graph "));
        }
        defpackage.abb abbVar = (defpackage.abb) adnhVar.a;
        defpackage.evf evfVar3 = (defpackage.evf) defpackage.abc.a(abbVar, iC);
        if (evfVar3 != evfVar) {
            if (evfVar.e != null) {
                throw new java.lang.IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            if (evfVar3 != null) {
                evfVar3.e = null;
            }
            evfVar.e = (defpackage.evg) obj;
            abbVar.f(evfVar.c(), evfVar);
        }
    }

    public final defpackage.eve p(defpackage.evd evdVar, defpackage.evf evfVar) {
        return this.a.f(super.f(evdVar), evdVar, true, evfVar);
    }

    @Override // defpackage.evf
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        defpackage.evf evfVarL = l(j());
        sb.append(" startDestination=");
        if (evfVarL == null) {
            defpackage.adnh adnhVar = this.a;
            java.lang.Object obj = adnhVar.d;
            if (obj != null) {
                sb.append((java.lang.String) obj);
            } else {
                sb.append("0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(adnhVar.b))));
            }
        } else {
            sb.append("{");
            sb.append(evfVarL.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
