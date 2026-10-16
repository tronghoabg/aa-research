package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class dpg extends dph {
    public ArrayList a;

    public dpg(char[] cArr) {
        super(cArr);
        this.a = new ArrayList();
    }

    public final float a(int i) throws dpm {
        dph dphVarH = h(i);
        if (dphVarH != null) {
            return dphVarH.v();
        }
        throw new dpm(a.bp(i, "no float at index "), this);
    }

    public final float b(String str) throws dpm {
        dph dphVarI = i(str);
        dphVarI.getClass();
        return dphVarI.v();
    }

    public final int c(int i) throws dpm {
        dph dphVarH = h(i);
        if (dphVarH != null) {
            return dphVarH.w();
        }
        throw new dpm(a.bp(i, "no int at index "), this);
    }

    public final int d() {
        return this.a.size();
    }

    public final dpf e(String str) {
        dph dphVarK = k(str);
        if (dphVarK instanceof dpf) {
            return (dpf) dphVarK;
        }
        return null;
    }

    @Override // defpackage.dph
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dpg) {
            return this.a.equals(((dpg) obj).a);
        }
        return false;
    }

    @Override // defpackage.dph
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public dpg g() {
        dpg dpgVar = (dpg) super.g();
        ArrayList arrayList = new ArrayList(this.a.size());
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            dph dphVarG = ((dph) arrayList2.get(i)).g();
            dphVarG.d = dpgVar;
            if (dpgVar != null) {
                dphVarG.e = dpgVar.e + 1;
            }
            arrayList.add(dphVarG);
        }
        dpgVar.a = arrayList;
        return dpgVar;
    }

    public final dph h(int i) throws dpm {
        if (i < 0 || i >= this.a.size()) {
            throw new dpm(a.bp(i, "no element at index "), this);
        }
        return (dph) this.a.get(i);
    }

    @Override // defpackage.dph
    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(super.hashCode()));
    }

    public final dph i(String str) throws dpm {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dpi dpiVar = (dpi) ((dph) arrayList.get(i));
            i++;
            if (dpiVar.x().equals(str)) {
                return dpiVar.C();
            }
        }
        throw new dpm(a.bq(str, "no element for key <", ">"), this);
    }

    public final dph j(int i) {
        if (i < this.a.size()) {
            return (dph) this.a.get(i);
        }
        return null;
    }

    public final dph k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dpi dpiVar = (dpi) ((dph) arrayList.get(i));
            i++;
            if (dpiVar.x().equals(str)) {
                return dpiVar.C();
            }
        }
        return null;
    }

    public final dpl l(String str) {
        dph dphVarK = k(str);
        if (dphVarK instanceof dpl) {
            return (dpl) dphVarK;
        }
        return null;
    }

    public final String m(int i) throws dpm {
        dph dphVarH = h(i);
        if (dphVarH instanceof dpn) {
            return dphVarH.x();
        }
        throw new dpm(a.bp(i, "no string at index "), this);
    }

    public final String n(String str) throws dpm {
        dph dphVarI = i(str);
        if (dphVarI instanceof dpn) {
            return dphVarI.x();
        }
        throw new dpm("no string found for key <" + str + ">, found [" + (dphVarI != null ? dphVarI.y() : null) + "] : " + String.valueOf(dphVarI), this);
    }

    public final String o(String str) {
        dph dphVarK = k(str);
        if (dphVarK instanceof dpn) {
            return dphVarK.x();
        }
        return null;
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            dph dphVar = (dph) arrayList2.get(i);
            if (dphVar instanceof dpi) {
                arrayList.add(((dpi) dphVar).x());
            }
        }
        return arrayList;
    }

    public final void q(dph dphVar) {
        this.a.add(dphVar);
    }

    public final void r(String str, dph dphVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dpi dpiVar = (dpi) ((dph) arrayList.get(i));
            i++;
            if (dpiVar.x().equals(str)) {
                dpiVar.D(dphVar);
                return;
            }
        }
        dpi dpiVar2 = new dpi(str.toCharArray());
        dpiVar2.B();
        dpiVar2.z(str.length() - 1);
        dpiVar2.D(dphVar);
        this.a.add(dpiVar2);
    }

    public final void s(String str, float f) {
        r(str, new dpj(f));
    }

    public final void t(String str, String str2) {
        dpn dpnVar = new dpn(str2.toCharArray());
        dpnVar.B();
        dpnVar.z(str2.length() - 1);
        r(str, dpnVar);
    }

    @Override // defpackage.dph
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dph dphVar = (dph) arrayList.get(i);
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(dphVar);
        }
        return super.toString() + " = <" + sb.toString() + " >";
    }

    public final boolean u(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dph dphVar = (dph) arrayList.get(i);
            if ((dphVar instanceof dpi) && ((dpi) dphVar).x().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
