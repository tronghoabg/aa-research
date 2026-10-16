package defpackage;

import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate;
import java.util.Collection;

/* loaded from: classes.dex */
public final class kck implements hlp {
    private static final yph b = yph.c("CarApp.H.Tem");
    public static final kck a = new kck();
    private static final ygr c = ygr.p(MinimizedStateNavigationTemplate.class, NavigationTemplate.class);

    @Override // defpackage.hlp
    public final hlo a(geu geuVar, TemplateWrapper templateWrapper) {
        return b(geuVar, templateWrapper, gzc.c);
    }

    @Override // defpackage.hlp
    public final hlo b(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        Class<?> cls = templateWrapper.getTemplate().getClass();
        if (cls == NavigationTemplate.class) {
            kcj kcjVar = new kcj(geuVar, templateWrapper, gzcVar);
            kcjVar.w();
            return kcjVar;
        }
        if (cls != MinimizedStateNavigationTemplate.class) {
            ((ype) ((ype) b.h()).ai((char) 2913)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
            return null;
        }
        gzc gzcVar2 = gzc.d;
        geuVar.getClass();
        kcu kcuVar = new kcu(geuVar, templateWrapper, gzcVar2);
        kcuVar.s();
        gns gnsVarK = geuVar.k();
        gnq gnqVarA = gnr.a(21);
        gnqVarA.b(templateWrapper.getTemplate().getClass().getSimpleName());
        gnsVarK.d(gnqVarA);
        return kcuVar;
    }

    @Override // defpackage.hlp
    public final Collection c() {
        return c;
    }
}
