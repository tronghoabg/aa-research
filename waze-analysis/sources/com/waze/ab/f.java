package com.waze.ab;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.waze.car_lib.r.cq;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.af;
import l.a.uq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f13780a;

    /* renamed from: b, reason: collision with root package name */
    private final t f13781b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ac.r f13782c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ac.b.e f13783d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ac.b.b f13784e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ac.b f13785f;

    /* renamed from: g, reason: collision with root package name */
    private final w f13786g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f13787h;

    public f(com.waze.app_nav.hub.b.c cVar, t tVar, com.waze.ac.r rVar, com.waze.ac.b.e eVar, com.waze.ac.b.b bVar, com.waze.ac.b bVar2, w wVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(cVar, "popupManager");
        h.g.b.x.f(tVar, "dialogImageProvider");
        h.g.b.x.f(rVar, "encouragementStatsSender");
        h.g.b.x.f(eVar, "engagementDisplayedSender");
        h.g.b.x.f(bVar, "engagementButtonClickedSender");
        h.g.b.x.f(bVar2, "encouragementIntentFactory");
        h.g.b.x.f(wVar, "isSkipOnImageNotFoundEnabledProvider");
        h.g.b.x.f(eVar2, "logger");
        this.f13780a = cVar;
        this.f13781b = tVar;
        this.f13782c = rVar;
        this.f13783d = eVar;
        this.f13784e = bVar;
        this.f13785f = bVar2;
        this.f13786g = wVar;
        this.f13787h = eVar2;
    }

    public static /* synthetic */ h.ab a(final f fVar, final com.waze.messages.c cVar, final AtomicBoolean atomicBoolean, com.waze.app_nav.hub.b.e eVar, Composer composer, int i2) {
        int i3 = 2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460625253, i2, -1, "com.waze.dialog.AppLaunchDialogLauncher.createPopup.<anonymous>.<anonymous>.<anonymous> (AppLaunchDialogLauncher.kt:74)");
            }
            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChangedInstance = composer.changedInstance(eVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.beacons.m(eVar, i3);
                composer.updateRememberedValue(objRememberedValue);
            }
            final h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            h.g.b.x.f(cVar, "<this>");
            h.g.b.x.f(context, "context");
            h.g.b.x.f(atomicBoolean, "isClickReported");
            h.g.b.x.f(aVar, "dismiss");
            String strA = fVar.f13781b.a(cVar.f29767c);
            com.waze.ui.ac.a aVar2 = strA != null ? new com.waze.ui.ac.a(strA) : null;
            String str = cVar.f29765a;
            h.g.b.x.e(str, "Text");
            String str2 = cVar.f29766b;
            String str3 = cVar.f29768d;
            h.g.b.x.e(str3, "SubText1");
            String str4 = cVar.f29769e;
            final int i4 = 1;
            h.g.a.a aVar3 = new h.g.a.a(fVar) { // from class: com.waze.ab.d

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f f13772a;

                {
                    this.f13772a = fVar;
                }

                @Override // h.g.a.a
                public final Object invoke() {
                    int i5 = i4;
                    Context context2 = context;
                    if (i5 != 0) {
                        h.g.a.a aVar4 = aVar;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        return f.b(this.f13772a, cVar, atomicBoolean2, aVar4, context2);
                    }
                    h.g.a.a aVar5 = aVar;
                    AtomicBoolean atomicBoolean3 = atomicBoolean;
                    return f.c(this.f13772a, cVar, atomicBoolean3, aVar5, context2);
                }
            };
            final int i5 = 0;
            com.waze.ui.b.d.e(new com.waze.ui.c.a(aVar2, str, str2, str3, str4, aVar3, new h.g.a.a(fVar) { // from class: com.waze.ab.d

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f f13772a;

                {
                    this.f13772a = fVar;
                }

                @Override // h.g.a.a
                public final Object invoke() {
                    int i52 = i5;
                    Context context2 = context;
                    if (i52 != 0) {
                        h.g.a.a aVar4 = aVar;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        return f.b(this.f13772a, cVar, atomicBoolean2, aVar4, context2);
                    }
                    h.g.a.a aVar5 = aVar;
                    AtomicBoolean atomicBoolean3 = atomicBoolean;
                    return f.c(this.f13772a, cVar, atomicBoolean3, aVar5, context2);
                }
            }), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab b(f fVar, com.waze.messages.c cVar, AtomicBoolean atomicBoolean, h.g.a.a aVar, Context context) {
        fVar.g(cVar, com.waze.ac.j.f13855c, atomicBoolean, cVar.f29771g, aVar, context);
        return h.ab.f48028a;
    }

    static final h.ab c(f fVar, com.waze.messages.c cVar, AtomicBoolean atomicBoolean, h.g.a.a aVar, Context context) {
        fVar.g(cVar, com.waze.ac.j.f13856d, atomicBoolean, cVar.f29772h, aVar, context);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void d(f fVar, com.waze.messages.c cVar) {
        fVar.f13782c.d(cVar, new com.waze.ac.k(com.waze.ac.l.f13864a, cVar.f29767c));
        String str = cVar.w;
        if (str != null) {
            fVar.f13783d.a(str);
        }
    }

    private final void g(com.waze.messages.c cVar, com.waze.ac.j jVar, AtomicBoolean atomicBoolean, String str, h.g.a.a aVar, Context context) {
        Intent intentA;
        Object objA;
        f(cVar, jVar);
        atomicBoolean.set(true);
        if (str != null && (intentA = this.f13785f.a(str)) != null) {
            try {
                f fVar = this;
                context.startActivity(intentA);
                objA = h.ab.f48028a;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                this.f13787h.b("couldn't open url (" + str + ") via intent: " + thC.getMessage());
            }
        }
        aVar.invoke();
    }

    private final void h(com.waze.messages.c cVar, uq uqVar) {
        this.f13782c.e(cVar, uqVar, new com.waze.ac.k(com.waze.ac.l.f13864a, cVar.f29767c));
    }

    public final void e(final com.waze.messages.c cVar) {
        h.g.b.x.f(cVar, "data");
        if (cVar.f29765a == null || cVar.f29768d == null || cVar.f29771g == null) {
            this.f13787h.b("mandatory fields are missing in the data");
            h(cVar, uq.BAD_PARAMS);
            return;
        }
        String str = cVar.f29767c;
        if (str != null && !h.n.o.G(str) && this.f13786g.a() && this.f13781b.a(cVar.f29767c) == null) {
            this.f13787h.b("image not found, skipping: ".concat(String.valueOf(cVar.f29767c)));
            h(cVar, uq.NO_IMAGE);
        } else {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f13780a.b(new com.waze.app_nav.hub.b.k("AppLaunchDialog", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.ab.a
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    h.g.b.x.f(context, "it");
                    final com.waze.messages.c cVar2 = cVar;
                    final AtomicBoolean atomicBoolean2 = atomicBoolean;
                    final f fVar = this;
                    return new com.waze.app_nav.hub.b.e(new com.waze.app_nav.hub.o(atomicBoolean2, fVar, cVar2, 5, null), (com.waze.app_nav.hub.b.f) null, ComposableLambdaKt.composableLambdaInstance(1941014495, true, new h.g.a.q() { // from class: com.waze.ab.b
                        @Override // h.g.a.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            com.waze.app_nav.hub.b.e eVar = (com.waze.app_nav.hub.b.e) obj;
                            Composer composer = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            h.g.b.x.f(eVar, "$this$ComposablePopUp");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= true != ((iIntValue & 8) == 0 ? composer.changed(eVar) : composer.changedInstance(eVar)) ? 2 : 4;
                            }
                            if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1941014495, iIntValue, -1, "com.waze.dialog.AppLaunchDialogLauncher.createPopup.<anonymous>.<anonymous> (AppLaunchDialogLauncher.kt:72)");
                                }
                                com.waze.messages.c cVar3 = cVar2;
                                f fVar2 = fVar;
                                h.ab abVar = h.ab.f48028a;
                                boolean zChangedInstance = composer.changedInstance(fVar2) | composer.changedInstance(cVar3);
                                e eVarRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || eVarRememberedValue == Composer.Companion.getEmpty()) {
                                    eVarRememberedValue = new e(fVar2, cVar3, null);
                                    composer.updateRememberedValue(eVarRememberedValue);
                                }
                                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                                EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super af, ? super h.c.e<? super h.ab>, ? extends Object>) eVarRememberedValue, composer, 6);
                                cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-460625253, true, new c(fVar2, cVar3, atomicBoolean3, eVar, 0), composer, 54), composer, 196608);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return h.ab.f48028a;
                        }
                    }), 6);
                }
            }, 6));
        }
    }

    public final void f(com.waze.messages.c cVar, com.waze.ac.j jVar) {
        h.g.b.x.f(cVar, "data");
        h.g.b.x.f(jVar, "buttonType");
        this.f13782c.a(cVar, jVar.b(), new com.waze.ac.k(com.waze.ac.l.f13864a, cVar.f29767c));
        String str = cVar.w;
        if (str != null) {
            this.f13784e.a(str, jVar.a(), false);
        }
    }
}
