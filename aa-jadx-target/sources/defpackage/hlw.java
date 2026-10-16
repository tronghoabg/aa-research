package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class hlw implements hlv {
    public static final defpackage.hlw a = new defpackage.hlw();
    private final java.util.Map b = new java.util.HashMap();

    private hlw() {
    }

    private final hlv e(androidx.car.app.model.TemplateWrapper templateWrapper) {
        return (hlv) this.b.get(templateWrapper.getTemplate().getClass());
    }

    public final hlu a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        hlv hlvVarE = e(templateWrapper);
        if (hlvVarE == null) {
            return null;
        }
        return hlvVarE.a(gfaVar, templateWrapper);
    }

    public final hlu b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        hlv hlvVarE = e(templateWrapper);
        if (hlvVarE == null) {
            return null;
        }
        return hlvVarE.b(gfaVar, templateWrapper, gzlVar);
    }

    public final java.util.Collection c() {
        return this.b.keySet();
    }

    public final void d(hlv hlvVar) {
        java.util.Iterator it = hlvVar.c().iterator();
        while (it.hasNext()) {
            this.b.put((java.lang.Class) it.next(), hlvVar);
        }
    }
}
