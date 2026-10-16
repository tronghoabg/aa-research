package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jxe implements hlv {
    public static final defpackage.jxe a = new defpackage.jxe();

    public final hlu a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        gfaVar.getClass();
        return b(gfaVar, templateWrapper, gzl.c);
    }

    public final hlu b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        gfaVar.getClass();
        wi template = templateWrapper.getTemplate();
        geo geoVarL = gfaVar.l(geo.class);
        geoVarL.getClass();
        hrs hrsVar = (hrs) geoVarL.a.e();
        int i = hrsVar != null ? hrsVar.a : 0;
        gzl gzlVar2 = gzl.d;
        defpackage.lel lelVar = defpackage.lem.a;
        lelVar.a();
        if (i == 1 && gzlVar == gzlVar2) {
            templateWrapper.setTemplate(new com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate(template));
            template = templateWrapper.getTemplate();
        }
        if (template instanceof gpp) {
            lelVar.a();
            jxg jxgVar = new jxg(gfaVar, templateWrapper, gzlVar);
            jxgVar.d();
            return jxgVar;
        }
        if (!(template instanceof com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate)) {
            return null;
        }
        lelVar.a();
        kcr kcrVar = new kcr(gfaVar, templateWrapper, gzlVar);
        kcrVar.v();
        gnz gnzVarK = gfaVar.k();
        gnx gnxVarA = gny.a(21);
        gnxVarA.b(templateWrapper.getTemplate().getClass().getSimpleName());
        gnzVarK.d(gnxVarA);
        return kcrVar;
    }

    public final java.util.Collection c() {
        return defpackage.afga.ac(gpp.class, com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate.class);
    }
}
