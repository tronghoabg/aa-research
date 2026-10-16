package defpackage;

import androidx.car.app.SessionInfo;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.android.car.libraries.apphost.external.model.LocalWrapperTemplate;
import com.android.car.libraries.apphost.external.model.MediaPlaybackTemplate;
import com.android.car.libraries.apphost.external.model.RadioPlaybackTemplate;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import com.android.car.libraries.apphost.external.model.widgets.ActionsWidget;
import com.android.car.libraries.apphost.external.model.widgets.ItemWidget;
import com.android.car.libraries.apphost.external.model.widgets.PaneWidget;
import com.android.car.libraries.apphost.external.model.widgets.VoicePlateWidget;
import com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate;
import com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class jsl implements Supplier {
    public final /* synthetic */ mqb a;
    public final /* synthetic */ SessionInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jsl(Object obj, mqb mqbVar, SessionInfo sessionInfo, int i) {
        this.d = i;
        this.c = obj;
        this.a = mqbVar;
        this.b = sessionInfo;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.d == 0) {
            SessionInfo sessionInfo = this.b;
            return ((jso) this.c).b.b(this.a, sessionInfo);
        }
        Object obj = this.c;
        final mqb mqbVar = this.a;
        final jsp jspVar = (jsp) obj;
        final geu geuVarC = jspVar.c(mqbVar, this.b);
        ((ype) jsp.a.l().ai((char) 2750)).y("Creating car host instance for %s", mqbVar.c());
        fug fugVar = new fug(geuVarC);
        geuVarC.c().a = fugVar;
        fugVar.f(CloudRecognizerProtocolStrings.APP, new fui() { // from class: jsh
            @Override // defpackage.fui
            public final fuh a(Object obj2) {
                geu geuVar = geuVarC;
                hhz hhzVar = new hhz(new jsb(geuVar, jspVar, mqbVar), new hia(obj2), new gjv(obj2, (char[]) null), geuVar);
                ghl ghlVar = hhzVar.h;
                ghlVar.getClass();
                ghlVar.a(GridWrapperTemplate.class, new gyt(2));
                ghlVar.a(WebViewTemplate.class, new gyt(3));
                int i = 7;
                int i2 = 8;
                int i3 = 9;
                Iterator it = woy.bi(MinimizedStateMapBasedTemplate.class, MinimizedStateNavigationTemplate.class, UnrestrictedTabTemplate.class, MediaPlaybackTemplate.class, RadioPlaybackTemplate.class, AlphaJumpTemplate.class, LocalWrapperTemplate.class, ItemWidget.class, ActionsWidget.class, PaneWidget.class, VoicePlateWidget.class).iterator();
                while (it.hasNext()) {
                    ghlVar.a((Class) it.next(), gyt.b);
                }
                Map map = ghs.a;
                hkn hknVar = hkn.d;
                Map map2 = ghs.a;
                map2.put(WebViewTemplate.class, new hko(hknVar, 5));
                map2.put(MinimizedStateNavigationTemplate.class, new hko(new hko(new jxa(i), 6), 7));
                map2.put(MinimizedStateMapBasedTemplate.class, new hko(new hko(new jxa(i2), 8), 9));
                map2.put(GridWrapperTemplate.class, new hko(new hko(new jxa(i3), 10), 11));
                return hhzVar;
            }
        });
        final int i = 0;
        fugVar.f("constraints", new fui() { // from class: jsi
            @Override // defpackage.fui
            public final fuh a(Object obj2) {
                int i2 = i;
                if (i2 == 0) {
                    yph yphVar = jsp.a;
                    return new hic(geuVarC);
                }
                if (i2 == 1) {
                    yph yphVar2 = jsp.a;
                    return new gpx(geuVarC);
                }
                if (i2 == 2) {
                    yph yphVar3 = jsp.a;
                    geu geuVar = geuVarC;
                    return new gsr(new gsu(obj2), geuVar, new jyj(geuVar));
                }
                if (i2 != 3) {
                    yph yphVar4 = jsp.a;
                    geu geuVar2 = geuVarC;
                    return new jvu(geuVar2, jvu.c(geuVar2));
                }
                yph yphVar5 = jsp.a;
                return new hfe(geuVarC, new gms(mod.a(), (byte[]) null));
            }
        });
        if (((gmh) geuVarC.d()).b) {
            final int i2 = 2;
            fugVar.f("navigation", new fui() { // from class: jsi
                @Override // defpackage.fui
                public final fuh a(Object obj2) {
                    int i22 = i2;
                    if (i22 == 0) {
                        yph yphVar = jsp.a;
                        return new hic(geuVarC);
                    }
                    if (i22 == 1) {
                        yph yphVar2 = jsp.a;
                        return new gpx(geuVarC);
                    }
                    if (i22 == 2) {
                        yph yphVar3 = jsp.a;
                        geu geuVar = geuVarC;
                        return new gsr(new gsu(obj2), geuVar, new jyj(geuVar));
                    }
                    if (i22 != 3) {
                        yph yphVar4 = jsp.a;
                        geu geuVar2 = geuVarC;
                        return new jvu(geuVar2, jvu.c(geuVar2));
                    }
                    yph yphVar5 = jsp.a;
                    return new hfe(geuVarC, new gms(mod.a(), (byte[]) null));
                }
            });
            final int i3 = 3;
            fugVar.f("suggestion", new fui() { // from class: jsi
                @Override // defpackage.fui
                public final fuh a(Object obj2) {
                    int i22 = i3;
                    if (i22 == 0) {
                        yph yphVar = jsp.a;
                        return new hic(geuVarC);
                    }
                    if (i22 == 1) {
                        yph yphVar2 = jsp.a;
                        return new gpx(geuVarC);
                    }
                    if (i22 == 2) {
                        yph yphVar3 = jsp.a;
                        geu geuVar = geuVarC;
                        return new gsr(new gsu(obj2), geuVar, new jyj(geuVar));
                    }
                    if (i22 != 3) {
                        yph yphVar4 = jsp.a;
                        geu geuVar2 = geuVarC;
                        return new jvu(geuVar2, jvu.c(geuVar2));
                    }
                    yph yphVar5 = jsp.a;
                    return new hfe(geuVarC, new gms(mod.a(), (byte[]) null));
                }
            });
        }
        final int i4 = 4;
        fugVar.f("hardware", new fui() { // from class: jsi
            @Override // defpackage.fui
            public final fuh a(Object obj2) {
                int i22 = i4;
                if (i22 == 0) {
                    yph yphVar = jsp.a;
                    return new hic(geuVarC);
                }
                if (i22 == 1) {
                    yph yphVar2 = jsp.a;
                    return new gpx(geuVarC);
                }
                if (i22 == 2) {
                    yph yphVar3 = jsp.a;
                    geu geuVar = geuVarC;
                    return new gsr(new gsu(obj2), geuVar, new jyj(geuVar));
                }
                if (i22 != 3) {
                    yph yphVar4 = jsp.a;
                    geu geuVar2 = geuVarC;
                    return new jvu(geuVar2, jvu.c(geuVar2));
                }
                yph yphVar5 = jsp.a;
                return new hfe(geuVarC, new gms(mod.a(), (byte[]) null));
            }
        });
        final int i5 = 1;
        fugVar.f("media_playback", new fui() { // from class: jsi
            @Override // defpackage.fui
            public final fuh a(Object obj2) {
                int i22 = i5;
                if (i22 == 0) {
                    yph yphVar = jsp.a;
                    return new hic(geuVarC);
                }
                if (i22 == 1) {
                    yph yphVar2 = jsp.a;
                    return new gpx(geuVarC);
                }
                if (i22 == 2) {
                    yph yphVar3 = jsp.a;
                    geu geuVar = geuVarC;
                    return new gsr(new gsu(obj2), geuVar, new jyj(geuVar));
                }
                if (i22 != 3) {
                    yph yphVar4 = jsp.a;
                    geu geuVar2 = geuVarC;
                    return new jvu(geuVar2, jvu.c(geuVar2));
                }
                yph yphVar5 = jsp.a;
                return new hfe(geuVarC, new gms(mod.a(), (byte[]) null));
            }
        });
        return fugVar;
    }
}
