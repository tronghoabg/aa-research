package defpackage;

import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class ewc implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ ewc(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                aezu aezuVar = (aezu) obj;
                aezuVar.getClass();
                return (String) aezuVar.a;
            case 1:
                ((esc) obj).getClass();
                return new ewe();
            case 2:
                evf evfVar = (evf) obj;
                evfVar.getClass();
                evfVar.c = true;
                return afak.a;
            case 3:
                euz euzVar = (euz) obj;
                euzVar.getClass();
                return Integer.valueOf(euzVar.c());
            case 4:
                euz euzVar2 = (euz) obj;
                euzVar2.getClass();
                eva evaVar = euzVar2.e;
                if (evaVar == null || evaVar.j() != euzVar2.c()) {
                    return null;
                }
                return euzVar2.e;
            case 5:
                euz euzVar3 = (euz) obj;
                euzVar3.getClass();
                eva evaVar2 = euzVar3.e;
                if (evaVar2 == null || evaVar2.j() != euzVar3.c()) {
                    return null;
                }
                return euzVar3.e;
            case 6:
                ((eyl) obj).getClass();
                throw new aezt("An operation is not implemented.");
            case 7:
                fbk fbkVar = (fbk) obj;
                fbkVar.getClass();
                return Boolean.valueOf(fbkVar.k());
            case 8:
                fbk fbkVar2 = (fbk) obj;
                int i = ezv.h;
                fbkVar2.getClass();
                afce afceVar = new afce();
                while (fbkVar2.k()) {
                    afceVar.add(Integer.valueOf((int) fbkVar2.b(0)));
                }
                return woy.aN(afceVar);
            case 9:
                fik fikVar = (fik) obj;
                afec afecVar = fij.b;
                fikVar.getClass();
                return fikVar;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                fjc fjcVar = fjc.a;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                return str + " : " + value;
            case 11:
                fmt fmtVar = (fmt) obj;
                fmtVar.getClass();
                String simpleName = fmtVar.getClass().getSimpleName();
                simpleName.getClass();
                return simpleName;
            case 12:
                ((cun) obj).getClass();
                return afak.a;
            case 13:
                fpz fpzVar = (fpz) obj;
                fpzVar.getClass();
                return fpzVar;
            case 14:
                return Boolean.valueOf(roc.aO((ggk) obj));
            case 15:
                dec decVar = (dec) obj;
                decVar.getClass();
                daq.g(decVar, 0);
                return afak.a;
            case 16:
                ((cun) obj).getClass();
                return afak.a;
            case 17:
                dec decVar2 = (dec) obj;
                decVar2.getClass();
                deb debVar = ddx.q;
                afak afakVar = afak.a;
                decVar2.a(debVar, afakVar);
                return afakVar;
            case 18:
                ((ggk) obj).getClass();
                return true;
            case 19:
                ((ggk) obj).getClass();
                return true;
            default:
                ((kdg) obj).getClass();
                leh.a();
                return Integer.valueOf(R.drawable.gs_error_vd_theme_24);
        }
    }
}
