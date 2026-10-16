package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;
import com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class juu implements hmg {
    public static final juu a = new juu(1);
    private final /* synthetic */ int b;

    public juu(int i) {
        this.b = i;
    }

    @Override // defpackage.hmg
    public final TemplateWrapper b(geu geuVar, TemplateWrapper templateWrapper) {
        TelephoneKeypadTemplate telephoneKeypadTemplate;
        mqc mqcVarA;
        if (this.b != 0) {
            hem hemVarL = geuVar.l(gyy.class);
            hemVarL.getClass();
            gmw gmwVar = (gmw) ((gyy) hemVarL).a(templateWrapper.getTemplate(), geuVar);
            TemplateWrapper templateWrapperCopyOf = TemplateWrapper.copyOf(templateWrapper);
            templateWrapperCopyOf.setTemplate(gmwVar);
            return templateWrapperCopyOf;
        }
        wb template = templateWrapper.getTemplate();
        if (!(template instanceof DialpadTemplate)) {
            if (template instanceof TelephoneKeypadTemplate) {
                telephoneKeypadTemplate = (TelephoneKeypadTemplate) template;
            }
            return templateWrapper;
        }
        telephoneKeypadTemplate = new TelephoneKeypadTemplate((DialpadTemplate) template);
        oga ogaVar = ogb.a;
        if (acqd.p() && (mqcVarA = ogb.a.a().a()) != null) {
            if (affa.f(((gmh) geuVar.d()).a, mqcVarA.a()) && telephoneKeypadTemplate.getPrimaryAction() != null && !affa.f(telephoneKeypadTemplate.getPrimaryAction().getIcon(), CarIcon.ERROR)) {
                templateWrapper = TemplateWrapper.copyOf(templateWrapper);
                Header header = telephoneKeypadTemplate.getHeader();
                fzg fzgVarJ = header != null ? fww.j(header, geuVar) : null;
                String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                primaryAction.getClass();
                fvu fvuVarC = fvl.c(primaryAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12);
                gkl keyListenerDelegate = telephoneKeypadTemplate.getKeyListenerDelegate();
                fnv fnvVar = keyListenerDelegate != null ? new fnv(geuVar, keyListenerDelegate, 18, null) : null;
                gkl keyListenerDelegate2 = telephoneKeypadTemplate.getKeyListenerDelegate();
                fnv fnvVar2 = keyListenerDelegate2 != null ? new fnv(geuVar, keyListenerDelegate2, 19, null) : null;
                gkl keyListenerDelegate3 = telephoneKeypadTemplate.getKeyListenerDelegate();
                fnv fnvVar3 = keyListenerDelegate3 != null ? new fnv(geuVar, keyListenerDelegate3, 20, null) : null;
                gdg gdgVar = new gdg(geuVar, telephoneKeypadTemplate, 1, null);
                Map<Integer, CarText> keypadKeySecondaryText = telephoneKeypadTemplate.getKeypadKeySecondaryText();
                keypadKeySecondaryText.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keypadKeySecondaryText.size()));
                Iterator<T> it = keypadKeySecondaryText.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    linkedHashMap.put(key, fzo.f((CarText) value));
                }
                templateWrapper.setTemplate(new gdf(fzgVarJ, phoneNumber, fvuVarC, fnvVar, fnvVar2, fnvVar3, gdgVar, linkedHashMap));
            }
        }
        return templateWrapper;
    }

    @Override // defpackage.hmg
    public final /* synthetic */ TemplateWrapper c(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        return this.b != 0 ? b(geuVar, templateWrapper) : b(geuVar, templateWrapper);
    }
}
