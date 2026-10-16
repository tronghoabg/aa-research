package defpackage;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class nqz implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ nqz(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                nvd nvdVar = (nvd) obj;
                nvdVar.getClass();
                break;
            case 5:
                nvd nvdVar2 = (nvd) obj;
                nvdVar2.getClass();
                break;
            case 6:
                nvd nvdVar3 = (nvd) obj;
                nvdVar3.getClass();
                break;
            case 7:
                nvd nvdVar4 = (nvd) obj;
                nvdVar4.getClass();
                break;
            case 8:
                mqc mqcVar = (mqc) obj;
                yph yphVar = nvf.a;
                mqcVar.getClass();
                break;
            case 9:
                nwd nwdVar = (nwd) obj;
                float f = nvv.a;
                nwdVar.getClass();
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                float f2 = nvv.a;
                break;
            case 11:
                cks cksVar = (cks) obj;
                yph yphVar2 = nxm.a;
                cksVar.getClass();
                cksVar.t(1);
                break;
            case 12:
                Stream map = Collection.EL.stream((yfq) obj).map(new nsb(5));
                int i = nuj.b;
                Stream streamSorted = map.sorted(new ail(18));
                int i2 = yfq.d;
                break;
            case 13:
                qsw qswVar = (qsw) obj;
                nye nyeVar = nyf.a;
                qswVar.getClass();
                qswVar.l = true;
                qswVar.m = 192;
                break;
            case 14:
                ViewGroup viewGroup = (ViewGroup) obj;
                yph yphVar3 = RailStatusBarFragment.b;
                viewGroup.getClass();
                TransitionManager.beginDelayedTransition(viewGroup);
                break;
            case 15:
                nxs nxsVar = (nxs) obj;
                yph yphVar4 = RailStatusBarFragment.b;
                nxsVar.getClass();
                break;
            case 16:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((kjl) obj2).b().contains(2)) {
                        arrayList.add(obj2);
                    }
                }
                break;
            case 17:
                ((Boolean) obj).booleanValue();
                break;
            case 18:
                ((Boolean) obj).booleanValue();
                break;
            case 19:
                ((Boolean) obj).booleanValue();
                break;
            default:
                List list2 = (List) obj;
                ygr ygrVar = oal.a;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof kjk) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(woy.bp(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((kjk) it.next()).a);
                }
                break;
        }
        return afak.a;
    }
}
