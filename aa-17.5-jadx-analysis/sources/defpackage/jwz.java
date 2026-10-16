package defpackage;

import android.content.res.Resources;
import androidx.car.app.model.TemplateWrapper;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate;
import java.util.Collection;

/* loaded from: classes.dex */
public final class jwz implements hlp {
    public static final jwz a = new jwz();

    @Override // defpackage.hlp
    public final hlo a(geu geuVar, TemplateWrapper templateWrapper) {
        geuVar.getClass();
        return b(geuVar, templateWrapper, gzc.c);
    }

    @Override // defpackage.hlp
    public final hlo b(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) throws Resources.NotFoundException {
        geuVar.getClass();
        wb template = templateWrapper.getTemplate();
        hem hemVarL = geuVar.l(gei.class);
        hemVarL.getClass();
        hrj hrjVar = (hrj) ((gei) hemVarL).a.e();
        int i = hrjVar != null ? hrjVar.a : 0;
        gzc gzcVar2 = gzc.d;
        leg legVar = leh.a;
        legVar.a();
        if (i == 1 && gzcVar == gzcVar2) {
            templateWrapper.setTemplate(new MinimizedStateMapBasedTemplate(template));
            template = templateWrapper.getTemplate();
        }
        if (template instanceof gpf) {
            legVar.a();
            jxb jxbVar = new jxb(geuVar, templateWrapper, gzcVar);
            jxbVar.d();
            return jxbVar;
        }
        if (!(template instanceof MinimizedStateMapBasedTemplate)) {
            return null;
        }
        legVar.a();
        kcp kcpVar = new kcp(geuVar, templateWrapper, gzcVar);
        kcpVar.v();
        gns gnsVarK = geuVar.k();
        gnq gnqVarA = gnr.a(21);
        gnqVarA.b(templateWrapper.getTemplate().getClass().getSimpleName());
        gnsVarK.d(gnqVarA);
        return kcpVar;
    }

    @Override // defpackage.hlp
    public final Collection c() {
        return woy.bi(gpf.class, MinimizedStateMapBasedTemplate.class);
    }
}
