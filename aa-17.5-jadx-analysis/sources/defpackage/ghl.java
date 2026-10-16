package defpackage;

import android.util.Pair;
import androidx.car.app.SessionInfo;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.android.car.libraries.apphost.external.model.InCallTemplate;
import com.android.car.libraries.apphost.external.model.MediaPlaybackTemplate;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.android.car.libraries.apphost.external.model.RadioPlaybackTemplate;
import com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ghl implements hem {
    public static final /* synthetic */ int d = 0;
    private static final ygr e = ygr.t(hhs.class, InCallTemplate.class, androidx.car.app.dialer.InCallTemplate.class, NavigationTemplate.class, SignInTemplate.class, LongMessageTemplate.class, PaneTemplate.class, MessageTemplate.class, MenuTemplate.class, MediaPlaybackTemplate.class);
    private static final ygr f = ygr.t(hhs.class, NavigationTemplate.class, MediaPlaybackTemplate.class, androidx.car.app.media.model.MediaPlaybackTemplate.class, RadioPlaybackTemplate.class, InCallTemplate.class, androidx.car.app.dialer.InCallTemplate.class);
    private static final ygr g = ygr.t(hhs.class, NavigationTemplate.class, MediaPlaybackTemplate.class, androidx.car.app.media.model.MediaPlaybackTemplate.class, RadioPlaybackTemplate.class, InCallTemplate.class, androidx.car.app.dialer.InCallTemplate.class, TelephoneKeypadTemplate.class, androidx.car.app.dialer.TelephoneKeypadTemplate.class);
    public final SessionInfo a;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final gns k;
    private final gdv l;
    private TemplateWrapper m;
    private boolean o;
    private int p;
    private final gjv r;
    private final Deque n = new ArrayDeque();
    private int q = 1;
    public final Set b = new HashSet();
    public final Map c = new HashMap();

    public ghl(int i, SessionInfo sessionInfo, gjv gjvVar, gns gnsVar, gdv gdvVar, boolean z, boolean z2) {
        this.k = gnsVar;
        this.h = i;
        this.a = sessionInfo;
        this.r = gjvVar;
        this.l = gdvVar;
        this.i = z;
        this.j = z2;
    }

    public static boolean d(Class cls) {
        return g.contains(cls);
    }

    private final int f(int i, Class cls) {
        if (!this.o && !f.contains(cls)) {
            return i;
        }
        gks.c("CarApp.H.Dis", "Resetting task step to %d. %s", 1, cls.getName());
        this.o = false;
        return 1;
    }

    private final ghk g(String str) {
        for (ghk ghkVar : this.n) {
            if (ghkVar.a.equals(str)) {
                return ghkVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(int r5, androidx.car.app.model.TemplateWrapper r6) {
        /*
            r4 = this;
            int r0 = r4.h
            boolean r1 = r4.c()
            if (r5 <= r0) goto La
            r5 = 3
            goto L38
        La:
            r2 = 1
            if (r5 != r0) goto L37
            wb r5 = r6.getTemplate()
            java.lang.Class r5 = r5.getClass()
            ygr r0 = defpackage.ghl.e
            boolean r0 = r0.contains(r5)
            java.lang.Class<androidx.car.app.navigation.model.MapTemplate> r3 = androidx.car.app.navigation.model.MapTemplate.class
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L33
            wb r5 = r6.getTemplate()
            androidx.car.app.navigation.model.MapTemplate r5 = (androidx.car.app.navigation.model.MapTemplate) r5
            androidx.car.app.model.Pane r5 = r5.getPane()
            if (r5 == 0) goto L31
            r5 = r2
            goto L32
        L31:
            r5 = 0
        L32:
            r0 = r0 | r5
        L33:
            if (r0 != 0) goto L37
            r5 = 2
            goto L38
        L37:
            r5 = r2
        L38:
            r4.q = r5
            boolean r5 = r4.i
            if (r5 == 0) goto L4b
            boolean r5 = r4.c()
            if (r1 == r5) goto L4b
            gjv r4 = r4.r
            r5 = 14
            r4.a(r5)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghl.h(int, androidx.car.app.model.TemplateWrapper):void");
    }

    private static boolean i(Class cls) {
        boolean z = SignInTemplate.class.equals(cls) || LongMessageTemplate.class.equals(cls);
        if (z) {
            gks.c("CarApp.H.Dis", "Parked only template detected. %s", cls.getName());
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j(wb wbVar, wb wbVar2, int i) {
        ghq ghqVar = (ghq) this.c.get(wbVar.getClass());
        if (ghqVar == null) {
            gks.c("CarApp.H.Dis", "REFRESH check failed. No checker has been registered for the template type: %s", wbVar.getClass());
            return false;
        }
        if (wbVar2.getClass() != wbVar.getClass()) {
            gks.c("CarApp.H.Dis", "REFRESH check failed. Template type differs (previous: %s, new: %s).", wbVar2.getClass(), wbVar.getClass());
            return false;
        }
        if (!ghqVar.b(wbVar, wbVar2, i)) {
            return false;
        }
        ynp ynpVarListIterator = ((yfq) ghqVar.c(wbVar, wbVar2)).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            Pair pair = (Pair) ynpVarListIterator.next();
            if (!j((wb) pair.first, (wb) pair.second, i)) {
                return false;
            }
        }
        return true;
    }

    public final void a(Class cls, ghq ghqVar) {
        this.c.put(cls, ghqVar);
    }

    public final void b() {
        this.o = true;
    }

    public final boolean c() {
        return this.q != 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.car.app.model.TemplateWrapper r11, int r12) throws defpackage.ghh {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghl.e(androidx.car.app.model.TemplateWrapper, int):void");
    }

    public final String toString() {
        return "[ step limit: " + this.h + ", last step: " + this.p + "]";
    }
}
