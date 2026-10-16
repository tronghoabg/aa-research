package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class bwr implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ bwr(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                afdr afdrVar = ((bwt) obj).a;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                return afak.a;
            case 1:
                Object obj2 = ((kwp) czz.al((ccx) obj, bwb.a)).a;
                while (obj2 != null) {
                    View view = (View) obj2;
                    Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object objH = ebe.h(view);
                    obj2 = objH instanceof View ? (View) objH : null;
                }
                return null;
            case 2:
                return Boolean.valueOf(((Map) obj).isEmpty());
            case 3:
                return new cdo((Map) obj);
            case 4:
                return obj;
            case 5:
                synchronized (cek.b) {
                    List list = cek.g;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((afec) list.get(i)).invoke(obj);
                    }
                }
                return afak.a;
            case 6:
                afec afecVar = cek.a;
                return afak.a;
            case 7:
                return Boolean.valueOf(!(((cfw) obj) instanceof cfu));
            case 8:
                int i2 = cmi.x;
                return afak.a;
            case 9:
                return afak.a;
            case 10:
                cxb cxbVar = (cxb) obj;
                cxb cxbVar2 = cxbVar instanceof cxb ? cxbVar : null;
                if (cxbVar2 != null && cxbVar2.D) {
                    Objects.toString(cxbVar);
                    crt.c("Apply is called on deactivated node ".concat(String.valueOf(cxbVar)));
                }
                return afak.a;
            case 11:
                cyr cyrVar = (cyr) obj;
                if (cyrVar.w()) {
                    cxk cxkVar = cyrVar.b;
                    if (!cxkVar.m) {
                        afec afecVarG = cyrVar.a.g();
                        cyrVar.a.i();
                        if (afecVarG == null) {
                            cxkVar.j = null;
                            cxkVar.i = null;
                            cxkVar.T();
                        } else {
                            cxkVar.j = null;
                            cxkVar.Q(cyrVar, 9223372034707292159L, 0L);
                            cxkVar.i = afecVarG;
                        }
                    }
                }
                return afak.a;
            case 12:
                ((cvw) obj).i().d = false;
                return afak.a;
            case 13:
                cvw cvwVar = (cvw) obj;
                cvwVar.i().e = cvwVar.i().d;
                return afak.a;
            case 14:
                ((cvw) obj).i().c = false;
                return afak.a;
            case 15:
                cyc cycVar = (cyc) obj;
                cxb cxbVar3 = cycVar.t;
                try {
                    if (cycVar.w()) {
                        cycVar.ax(true);
                    }
                    return afak.a;
                } catch (Throwable th) {
                    cxbVar3.as(th);
                    throw new aezp();
                }
            case 16:
                afec afecVar2 = cyc.p;
                cyk cykVar = ((cyc) obj).I;
                if (cykVar != null) {
                    cykVar.invalidate();
                }
                return afak.a;
            case 17:
                cyh cyhVar = (cyh) obj;
                if (cyhVar.w()) {
                    cyhVar.b.r();
                }
                return afak.a;
            case 18:
                cxb cxbVar4 = (cxb) obj;
                if (cxbVar4.am()) {
                    cxbVar4.V(false, true, true);
                }
                return afak.a;
            case 19:
                cxb cxbVar5 = (cxb) obj;
                if (cxbVar5.am()) {
                    cxbVar5.X(false, true, true);
                }
                return afak.a;
            default:
                cxb cxbVar6 = (cxb) obj;
                if (cxbVar6.am()) {
                    cxbVar6.J();
                }
                return afak.a;
        }
    }
}
