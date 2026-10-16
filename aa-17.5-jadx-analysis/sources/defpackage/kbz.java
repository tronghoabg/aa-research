package defpackage;

import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;
import com.android.car.libraries.apphost.external.model.MediaPlaybackTemplate;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import java.util.Collection;

/* loaded from: classes.dex */
public final class kbz implements hlp {
    private static final yph b = yph.c("CarApp.H.Tem");
    public static final kbz a = new kbz();
    private static final ygr c = ygr.q(WebViewTemplate.class, MediaPlaybackTemplate.class, DialpadTemplate.class);

    @Override // defpackage.hlp
    public final hlo a(geu geuVar, TemplateWrapper templateWrapper) {
        Class<?> cls = templateWrapper.getTemplate().getClass();
        if (cls == WebViewTemplate.class) {
            kcc kccVar = new kcc(geuVar, templateWrapper);
            kccVar.f();
            return kccVar;
        }
        if (cls == MediaPlaybackTemplate.class) {
            leh.a();
            return new kca(geuVar, templateWrapper);
        }
        if (cls == DialpadTemplate.class) {
            leh.a();
            return new kab(geuVar, templateWrapper);
        }
        ((ype) ((ype) b.h()).ai((char) 2908)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
        return null;
    }

    @Override // defpackage.hlp
    public final hlo b(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        return a(geuVar, templateWrapper);
    }

    @Override // defpackage.hlp
    public final Collection c() {
        return c;
    }
}
