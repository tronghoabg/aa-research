package defpackage;

import androidx.car.app.model.PlaceListMapTemplate;
import androidx.car.app.model.TemplateWrapper;
import java.util.Collection;

/* loaded from: classes.dex */
public final class kcd implements hlp {
    private static final yph b = yph.c("CarApp.H.Tem");
    public static final kcd a = new kcd();
    private static final ygr c = new ymp(PlaceListMapTemplate.class);

    @Override // defpackage.hlp
    public final hlo a(geu geuVar, TemplateWrapper templateWrapper) {
        return b(geuVar, templateWrapper, gzc.c);
    }

    @Override // defpackage.hlp
    public final hlo b(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        Class<?> cls = templateWrapper.getTemplate().getClass();
        if (cls != PlaceListMapTemplate.class) {
            ((ype) ((ype) b.h()).ai((char) 2912)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
            return null;
        }
        leh.a();
        kce kceVar = new kce(geuVar, templateWrapper, gzcVar);
        kceVar.f();
        return kceVar;
    }

    @Override // defpackage.hlp
    public final Collection c() {
        return c;
    }
}
