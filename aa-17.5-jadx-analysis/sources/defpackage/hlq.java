package defpackage;

import androidx.car.app.model.TemplateWrapper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class hlq implements hlp {
    public static final hlq a = new hlq();
    private final Map b = new HashMap();

    private hlq() {
    }

    private final hlp e(TemplateWrapper templateWrapper) {
        return (hlp) this.b.get(templateWrapper.getTemplate().getClass());
    }

    @Override // defpackage.hlp
    public final hlo a(geu geuVar, TemplateWrapper templateWrapper) {
        hlp hlpVarE = e(templateWrapper);
        if (hlpVarE == null) {
            return null;
        }
        return hlpVarE.a(geuVar, templateWrapper);
    }

    @Override // defpackage.hlp
    public final hlo b(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        hlp hlpVarE = e(templateWrapper);
        if (hlpVarE == null) {
            return null;
        }
        return hlpVarE.b(geuVar, templateWrapper, gzcVar);
    }

    @Override // defpackage.hlp
    public final Collection c() {
        return this.b.keySet();
    }

    public final void d(hlp hlpVar) {
        Iterator it = hlpVar.c().iterator();
        while (it.hasNext()) {
            this.b.put((Class) it.next(), hlpVar);
        }
    }
}
