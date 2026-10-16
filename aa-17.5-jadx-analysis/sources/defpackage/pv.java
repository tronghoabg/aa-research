package defpackage;

import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class pv implements xy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xy
    public final Object a() throws xr {
        TemplateWrapper templateWrapper;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                AppManager.AnonymousClass1.lambda$onBackPressed$0((qn) this.a);
                return null;
            }
            Object obj = this.a;
            if (i != 2) {
                AppManager.AnonymousClass1.lambda$startLocationUpdates$1((qn) obj);
                return null;
            }
            AppManager.AnonymousClass1.lambda$stopLocationUpdates$2((qn) obj);
            return null;
        }
        yj.a();
        qx qxVar = (qx) this.a;
        qw qwVarA = qxVar.a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(qwVarA);
            Log.d("CarApp", "Requesting template from Screen ".concat(qwVarA.toString()));
        }
        wb wbVarH = qwVarA.h();
        TemplateWrapper templateWrapperWrap = (!qwVarA.e || (templateWrapper = qwVarA.d) == null) ? TemplateWrapper.wrap(wbVarH) : TemplateWrapper.wrap(wbVarH, new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
        qwVarA.e = false;
        qwVarA.d = templateWrapperWrap;
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", a.bt(qwVarA, wbVarH, "Returning ", " from screen "));
        }
        ArrayList arrayList = new ArrayList();
        for (qw qwVar : qxVar.a) {
            if (qwVar.d == null) {
                qwVar.d = TemplateWrapper.wrap(qwVar.h());
            }
            arrayList.add(new TemplateInfo(qwVar.d.getTemplate().getClass(), qwVar.d.getId()));
        }
        templateWrapperWrap.setTemplateInfosForScreenStack(arrayList);
        return templateWrapperWrap;
    }
}
