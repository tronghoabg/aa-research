package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class juz implements hmm {
    public static final defpackage.juz a = new defpackage.juz(1);
    private final /* synthetic */ int b;

    public juz(int i) {
        this.b = i;
    }

    public final androidx.car.app.model.TemplateWrapper b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate telephoneKeypadTemplate;
        defpackage.mqj mqjVarA;
        if (this.b != 0) {
            gzh gzhVarL = gfaVar.l(gzh.class);
            gzhVarL.getClass();
            gnd gndVar = (gnd) gzhVarL.a(templateWrapper.getTemplate(), gfaVar);
            androidx.car.app.model.TemplateWrapper templateWrapperCopyOf = androidx.car.app.model.TemplateWrapper.copyOf(templateWrapper);
            templateWrapperCopyOf.setTemplate(gndVar);
            return templateWrapperCopyOf;
        }
        com.android.car.libraries.apphost.external.model.DialpadTemplate template = templateWrapper.getTemplate();
        if (!(template instanceof com.android.car.libraries.apphost.external.model.DialpadTemplate)) {
            if (template instanceof com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate) {
                telephoneKeypadTemplate = (com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate) template;
            }
            return templateWrapper;
        }
        telephoneKeypadTemplate = new com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate(template);
        defpackage.ogu oguVar = defpackage.ogv.a;
        if (defpackage.acrf.q() && (mqjVarA = defpackage.ogv.a.a().a()) != null) {
            if (defpackage.afga.f(gfaVar.d().a, mqjVarA.a()) && telephoneKeypadTemplate.getPrimaryAction() != null && !defpackage.afga.f(telephoneKeypadTemplate.getPrimaryAction().getIcon(), androidx.car.app.model.CarIcon.ERROR)) {
                templateWrapper = androidx.car.app.model.TemplateWrapper.copyOf(templateWrapper);
                androidx.car.app.model.Header header = telephoneKeypadTemplate.getHeader();
                fzn fznVarJ = header != null ? fxf.j(header, gfaVar) : null;
                java.lang.String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                androidx.car.app.model.Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                primaryAction.getClass();
                fwe fweVarC = fvv.c(primaryAction, gfaVar, gfaVar.F(ggq.class).f(), (defpackage.afer) null, false, 12);
                gks keyListenerDelegate = telephoneKeypadTemplate.getKeyListenerDelegate();
                foc focVar = keyListenerDelegate != null ? new foc(gfaVar, keyListenerDelegate, 18, (byte[]) null) : null;
                gks keyListenerDelegate2 = telephoneKeypadTemplate.getKeyListenerDelegate();
                defpackage.affc focVar2 = keyListenerDelegate2 != null ? new foc(gfaVar, keyListenerDelegate2, 19, (byte[]) null) : null;
                gks keyListenerDelegate3 = telephoneKeypadTemplate.getKeyListenerDelegate();
                defpackage.affc focVar3 = keyListenerDelegate3 != null ? new foc(gfaVar, keyListenerDelegate3, 20, (byte[]) null) : null;
                gdm gdmVar = new gdm(gfaVar, telephoneKeypadTemplate, 1, (byte[]) null);
                java.util.Map keypadKeySecondaryText = telephoneKeypadTemplate.getKeypadKeySecondaryText();
                keypadKeySecondaryText.getClass();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afga.P(keypadKeySecondaryText.size()));
                for (java.util.Map.Entry entry : keypadKeySecondaryText.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    value.getClass();
                    linkedHashMap.put(key, gca.f((androidx.car.app.model.CarText) value));
                }
                templateWrapper.setTemplate(new gdl(fznVarJ, phoneNumber, fweVarC, focVar, focVar2, focVar3, gdmVar, linkedHashMap));
            }
        }
        return templateWrapper;
    }

    public final /* synthetic */ androidx.car.app.model.TemplateWrapper c(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        return this.b != 0 ? b(gfaVar, templateWrapper) : b(gfaVar, templateWrapper);
    }
}
