package defpackage;

import androidx.car.app.model.TemplateWrapper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class hmh implements hmg {
    public static final hmh a = new hmh();
    private static final Map b = new HashMap();

    public static final void a(Class cls, hmg hmgVar) {
        cls.getClass();
        b.put(cls, hmgVar);
    }

    @Override // defpackage.hmg
    public final TemplateWrapper b(geu geuVar, TemplateWrapper templateWrapper) {
        geuVar.getClass();
        templateWrapper.getClass();
        hmg hmgVar = (hmg) b.get(templateWrapper.getTemplate().getClass());
        return hmgVar != null ? hmgVar.b(geuVar, templateWrapper) : templateWrapper;
    }

    @Override // defpackage.hmg
    public final TemplateWrapper c(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        hmg hmgVar = (hmg) b.get(templateWrapper.getTemplate().getClass());
        return hmgVar != null ? hmgVar.c(geuVar, templateWrapper, gzcVar) : templateWrapper;
    }
}
