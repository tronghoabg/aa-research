package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dpo extends defpackage.dpp {
    public java.util.ArrayList a;

    public dpo(char[] cArr) {
        super(cArr);
        this.a = new java.util.ArrayList();
    }

    public final float a(int i) throws defpackage.dpu {
        defpackage.dpp dppVarH = h(i);
        if (dppVarH != null) {
            return dppVarH.v();
        }
        throw new defpackage.dpu(defpackage.a.bo(i, "no float at index "), this);
    }

    public final float b(java.lang.String str) throws defpackage.dpu {
        defpackage.dpp dppVarI = i(str);
        dppVarI.getClass();
        return dppVarI.v();
    }

    public final int c(int i) throws defpackage.dpu {
        defpackage.dpp dppVarH = h(i);
        if (dppVarH != null) {
            return dppVarH.w();
        }
        throw new defpackage.dpu(defpackage.a.bo(i, "no int at index "), this);
    }

    public final int d() {
        return this.a.size();
    }

    public final defpackage.dpn e(java.lang.String str) {
        defpackage.dpp dppVarK = k(str);
        if (dppVarK instanceof defpackage.dpn) {
            return (defpackage.dpn) dppVarK;
        }
        return null;
    }

    @Override // defpackage.dpp
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dpo) {
            return this.a.equals(((defpackage.dpo) obj).a);
        }
        return false;
    }

    @Override // defpackage.dpp
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public defpackage.dpo clone() {
        defpackage.dpo dpoVar = (defpackage.dpo) super.clone();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.a.size());
        java.util.ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            defpackage.dpp dppVarClone = ((defpackage.dpp) arrayList2.get(i)).clone();
            dppVarClone.d = dpoVar;
            if (dpoVar != null) {
                dppVarClone.e = dpoVar.e + 1;
            }
            arrayList.add(dppVarClone);
        }
        dpoVar.a = arrayList;
        return dpoVar;
    }

    public final defpackage.dpp h(int i) throws defpackage.dpu {
        if (i < 0 || i >= this.a.size()) {
            throw new defpackage.dpu(defpackage.a.bo(i, "no element at index "), this);
        }
        return (defpackage.dpp) this.a.get(i);
    }

    @Override // defpackage.dpp
    public final int hashCode() {
        return j$.util.Objects.hash(this.a, java.lang.Integer.valueOf(super.hashCode()));
    }

    public final defpackage.dpp i(java.lang.String str) throws defpackage.dpu {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            defpackage.dpq dpqVar = (defpackage.dpq) ((defpackage.dpp) arrayList.get(i));
            i++;
            if (dpqVar.x().equals(str)) {
                return dpqVar.C();
            }
        }
        throw new defpackage.dpu(defpackage.a.bp(str, "no element for key <", ">"), this);
    }

    public final defpackage.dpp j(int i) {
        if (i < this.a.size()) {
            return (defpackage.dpp) this.a.get(i);
        }
        return null;
    }

    public final defpackage.dpp k(java.lang.String str) {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            defpackage.dpq dpqVar = (defpackage.dpq) ((defpackage.dpp) arrayList.get(i));
            i++;
            if (dpqVar.x().equals(str)) {
                return dpqVar.C();
            }
        }
        return null;
    }

    public final defpackage.dpt l(java.lang.String str) {
        defpackage.dpp dppVarK = k(str);
        if (dppVarK instanceof defpackage.dpt) {
            return (defpackage.dpt) dppVarK;
        }
        return null;
    }

    public final java.lang.String m(int i) throws defpackage.dpu {
        defpackage.dpp dppVarH = h(i);
        if (dppVarH instanceof defpackage.dpv) {
            return dppVarH.x();
        }
        throw new defpackage.dpu(defpackage.a.bo(i, "no string at index "), this);
    }

    public final java.lang.String n(java.lang.String str) throws defpackage.dpu {
        defpackage.dpp dppVarI = i(str);
        if (dppVarI instanceof defpackage.dpv) {
            return dppVarI.x();
        }
        throw new defpackage.dpu("no string found for key <" + str + ">, found [" + (dppVarI != null ? dppVarI.y() : null) + "] : " + java.lang.String.valueOf(dppVarI), this);
    }

    public final java.lang.String o(java.lang.String str) {
        defpackage.dpp dppVarK = k(str);
        if (dppVarK instanceof defpackage.dpv) {
            return dppVarK.x();
        }
        return null;
    }

    public final java.util.ArrayList p() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            defpackage.dpp dppVar = (defpackage.dpp) arrayList2.get(i);
            if (dppVar instanceof defpackage.dpq) {
                arrayList.add(((defpackage.dpq) dppVar).x());
            }
        }
        return arrayList;
    }

    public final void q(defpackage.dpp dppVar) {
        this.a.add(dppVar);
    }

    public final void r(java.lang.String str, defpackage.dpp dppVar) {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            defpackage.dpq dpqVar = (defpackage.dpq) ((defpackage.dpp) arrayList.get(i));
            i++;
            if (dpqVar.x().equals(str)) {
                dpqVar.D(dppVar);
                return;
            }
        }
        defpackage.dpq dpqVar2 = new defpackage.dpq(str.toCharArray());
        dpqVar2.B();
        dpqVar2.z(str.length() - 1);
        dpqVar2.D(dppVar);
        this.a.add(dpqVar2);
    }

    public final void s(java.lang.String str, float f) {
        r(str, new defpackage.dpr(f));
    }

    public final void t(java.lang.String str, java.lang.String str2) {
        defpackage.dpv dpvVar = new defpackage.dpv(str2.toCharArray());
        dpvVar.B();
        dpvVar.z(str2.length() - 1);
        r(str, dpvVar);
    }

    @Override // defpackage.dpp
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.dpp dppVar = (defpackage.dpp) arrayList.get(i);
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(dppVar);
        }
        return super.toString() + " = <" + sb.toString() + " >";
    }

    public final boolean u(java.lang.String str) {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.dpp dppVar = (defpackage.dpp) arrayList.get(i);
            if ((dppVar instanceof defpackage.dpq) && ((defpackage.dpq) dppVar).x().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
