package defpackage;

import android.content.res.Resources;
import androidx.car.app.media.model.MediaPlaybackTemplate;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.model.signin.SignInTemplate;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;
import java.util.Collection;

/* loaded from: classes.dex */
public final class kbp implements hlp {
    private static final yph b = yph.c("CarApp.H.Tem");
    public static final kbp a = new kbp();
    private static final ygr c = ygr.t(GridWrapperTemplate.class, MessageTemplate.class, LongMessageTemplate.class, hik.class, SearchTemplate.class, SignInTemplate.class, TabTemplateInternal.class, MediaPlaybackTemplate.class);

    @Override // defpackage.hlp
    public final hlo a(geu geuVar, TemplateWrapper templateWrapper) {
        return b(geuVar, templateWrapper, gzc.a);
    }

    @Override // defpackage.hlp
    public final hlo b(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) throws Resources.NotFoundException, kdb {
        Class<?> cls = templateWrapper.getTemplate().getClass();
        int iC = geuVar.i().c();
        if (iC >= 2) {
            if (cls == LongMessageTemplate.class) {
                kbq kbqVar = new kbq(geuVar, templateWrapper, gzcVar);
                kbqVar.f();
                return kbqVar;
            }
            if (cls == SignInTemplate.class) {
                kby kbyVar = new kby(geuVar, templateWrapper, gzcVar);
                kbyVar.m();
                return kbyVar;
            }
        }
        if (cls == GridWrapperTemplate.class) {
            leh.a();
            kbr kbrVar = new kbr(geuVar, templateWrapper, gzcVar);
            kbrVar.f();
            return kbrVar;
        }
        if (cls == MessageTemplate.class) {
            kbw kbwVar = new kbw(geuVar, templateWrapper, gzcVar);
            kbwVar.f();
            return kbwVar;
        }
        if (cls == hik.class) {
            leh.a();
            gne gneVar = new gne(geuVar, templateWrapper, gzcVar);
            gneVar.h();
            return gneVar;
        }
        if (cls == SearchTemplate.class) {
            leh.a();
            kbu kbuVar = new kbu(geuVar, templateWrapper, gzcVar);
            kbuVar.h();
            return kbuVar;
        }
        if (cls == TabTemplateInternal.class) {
            leh.a();
            geuVar.getClass();
            kbv kbvVar = new kbv(geuVar, templateWrapper, gzcVar);
            kbvVar.d();
            return kbvVar;
        }
        if (cls == MediaPlaybackTemplate.class && iC >= 8) {
            leh.a();
            return new kca(geuVar, templateWrapper);
        }
        ((ype) ((ype) b.h()).ai((char) 2902)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
        return null;
    }

    @Override // defpackage.hlp
    public final Collection c() {
        return c;
    }
}
