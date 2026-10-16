package defpackage;

import androidx.car.app.model.TemplateWrapper;
import java.util.Collection;

/* loaded from: classes.dex */
public final class gwb implements hlp {
    private final afec a;

    public gwb(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.hlp
    public final hlo a(geu geuVar, TemplateWrapper templateWrapper) {
        geuVar.getClass();
        return b(geuVar, templateWrapper, gzc.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gfh, java.lang.Object] */
    @Override // defpackage.hlp
    public final hlo b(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        geuVar.getClass();
        if (templateWrapper.getTemplate() instanceof gza) {
            return new gwa(templateWrapper, geuVar, gzcVar, this.a.invoke(geuVar));
        }
        return null;
    }

    @Override // defpackage.hlp
    public final Collection c() {
        return woy.bg(gza.class);
    }
}
