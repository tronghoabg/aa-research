package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class eva extends euz implements Iterable<euz>, afgc {
    public static final /* synthetic */ int b = 0;
    public final admg a;

    public eva(evp evpVar) {
        super(evpVar);
        this.a = new admg(this);
    }

    @Override // defpackage.euz
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, evy.d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        admg admgVar = this.a;
        Object obj = admgVar.c;
        if (resourceId != ((euz) obj).c()) {
            admgVar.b = resourceId;
            admgVar.d = null;
            admgVar.d = ebf.K(new erb(context, (byte[]) null), resourceId);
            typedArrayObtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + obj);
    }

    @Override // defpackage.euz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof eva) && super.equals(obj)) {
            eva evaVar = (eva) obj;
            if (k().c() == evaVar.k().c() && j() == evaVar.j()) {
                Iterator itA = afrg.b(ca.ac(k())).a();
                while (itA.hasNext()) {
                    euz euzVar = (euz) itA.next();
                    if (!affa.f(euzVar, aav.a(evaVar.k(), euzVar.c()))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.euz
    public final euy f(eux euxVar) {
        admg admgVar = this.a;
        return admgVar.f(super.f(euxVar), euxVar, false, (euz) admgVar.c);
    }

    @Override // defpackage.euz
    public final int hashCode() {
        int iJ = j();
        aau aauVarK = k();
        int iC = aauVarK.c();
        for (int i = 0; i < iC; i++) {
            iJ = (((iJ * 31) + aauVarK.b(i)) * 31) + ((euz) aauVarK.e(i)).hashCode();
        }
        return iJ;
    }

    @Override // java.lang.Iterable
    public final Iterator<euz> iterator() {
        return new ewr(this.a);
    }

    public final int j() {
        return this.a.b;
    }

    public final aau k() {
        return (aau) this.a.a;
    }

    public final euz l(int i) {
        admg admgVar = this.a;
        return admgVar.e(i, (euz) admgVar.c, false, null);
    }

    public final euz m(int i, euz euzVar, boolean z, euz euzVar2) {
        return this.a.e(i, euzVar, z, euzVar2);
    }

    public final String n() {
        String strG = super.g();
        if (strG == null) {
            strG = String.valueOf(c());
        }
        admg admgVar = this.a;
        strG.getClass();
        return ((euz) admgVar.c).c() != 0 ? strG : "the root navigation";
    }

    public final void o(euz euzVar) {
        int iC = euzVar.c();
        String strH = euzVar.h();
        if (iC == 0) {
            if (strH == null) {
                throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            }
            iC = 0;
        }
        admg admgVar = this.a;
        Object obj = admgVar.c;
        euz euzVar2 = (euz) obj;
        if (euzVar2.h() != null && affa.f(strH, euzVar2.h())) {
            throw new IllegalArgumentException(a.bt(obj, euzVar, "Destination ", " cannot have the same route as graph "));
        }
        if (iC == euzVar2.c()) {
            throw new IllegalArgumentException(a.bt(obj, euzVar, "Destination ", " cannot have the same id as graph "));
        }
        aau aauVar = (aau) admgVar.a;
        euz euzVar3 = (euz) aav.a(aauVar, iC);
        if (euzVar3 != euzVar) {
            if (euzVar.e != null) {
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            if (euzVar3 != null) {
                euzVar3.e = null;
            }
            euzVar.e = (eva) obj;
            aauVar.f(euzVar.c(), euzVar);
        }
    }

    public final euy p(eux euxVar, euz euzVar) {
        return this.a.f(super.f(euxVar), euxVar, true, euzVar);
    }

    @Override // defpackage.euz
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        euz euzVarL = l(j());
        sb.append(" startDestination=");
        if (euzVarL == null) {
            admg admgVar = this.a;
            Object obj = admgVar.d;
            if (obj != null) {
                sb.append((String) obj);
            } else {
                sb.append("0x".concat(String.valueOf(Integer.toHexString(admgVar.b))));
            }
        } else {
            sb.append("{");
            sb.append(euzVarL.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
