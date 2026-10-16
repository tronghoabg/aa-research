package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.Row;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fuy extends hmf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hmf
    public final /* synthetic */ wb a(geu geuVar, TemplateWrapper templateWrapper, wb wbVar) {
        AlphaJumpTemplate alphaJumpTemplate = (AlphaJumpTemplate) wbVar;
        int iOrdinal = alphaJumpTemplate.getState().ordinal();
        if (iOrdinal == 0) {
            return gur.i(geuVar, gkd.b(alphaJumpTemplate.getListTemplate()), templateWrapper.isRefresh(), null, alphaJumpTemplate.getAlphaJumpAction(), ghz.e, 8);
        }
        if (iOrdinal == 1) {
            fus fusVar = new fus(alphaJumpTemplate);
            gka.b(fusVar, alphaJumpTemplate);
            return fusVar;
        }
        if (iOrdinal != 2) {
            throw new aezs();
        }
        AlphaJumpTemplate alphaJumpTemplate2 = (AlphaJumpTemplate) templateWrapper.getTemplate();
        hik hikVarI = gur.i(geuVar, gkd.b(alphaJumpTemplate2.getListTemplate()), templateWrapper.isRefresh(), null, alphaJumpTemplate2.getAlphaJumpAction(), ghz.e, 8);
        hii hiiVar = hikVarI.b;
        String jumpKey = alphaJumpTemplate2.getJumpKey();
        jumpKey.getClass();
        ArrayList arrayList = new ArrayList();
        ynp ynpVarListIterator = ((yfq) hiiVar.i).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            E next = ynpVarListIterator.next();
            if (((him) next).a()) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next2 = it.next();
                CarText title = ((Row) ((him) next2).a).getTitle();
                title.getClass();
                String string = title.toString();
                string.getClass();
                if (affa.f(string, jumpKey)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next2;
                }
            }
        }
        obj = null;
        him himVar = (him) obj;
        Integer numValueOf = himVar != null ? Integer.valueOf(himVar.b + 1) : null;
        if (numValueOf != null) {
            gks.c("AppHost.H.Template", "Jump position found: %s", numValueOf);
        } else {
            gks.e("AppHost.H.Template", "**JUMP POSITION NOT FOUND** %s", jumpKey);
        }
        hiiVar.t = numValueOf;
        return hikVarI;
    }
}
