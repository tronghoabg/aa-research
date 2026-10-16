package defpackage;

import android.app.Notification;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.Fragment;
import android.telecom.Call;
import android.telecom.CallAudioState;
import android.view.Surface;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.SessionInfo;
import androidx.car.app.SurfaceContainer;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.apps.auto.components.feedback.hats.HatsSurveyActivity;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.UsbConfigFragment;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class ajmd {
    public final /* synthetic */ Object a;

    public ajmd() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public static final void A(SurveyMetadata surveyMetadata) {
        ((ype) ((ype) HatsSurveyActivity.m.f()).ai(3743)).y("Survey prompted to user with id %s", surveyMetadata.b);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.hj).l());
    }

    private final SurfaceContainer U() {
        hhz hhzVar = (hhz) this.a;
        hln hlnVarS = hhzVar.s();
        Surface surfaceB = hlnVarS.b();
        int width = hlnVarS.getWidth();
        int height = hlnVarS.getHeight();
        int iA = hlnVarS.a();
        SurfaceContainer surfaceContainer = hhzVar.f;
        return (surfaceContainer != null && surfaceContainer.getSurface() == surfaceB && surfaceContainer.getWidth() == width && surfaceContainer.getHeight() == height && hhzVar.f.getDpi() == iA) ? hhzVar.f : new SurfaceContainer(surfaceB, width, height, iA);
    }

    public static final void w(NotificationListenerService.RankingMap rankingMap) {
        nuj.b().l(rankingMap);
    }

    public final void B() {
        Iterator it = ((krh) this.a).a.iterator();
        while (it.hasNext()) {
            ((kqv) it.next()).a();
        }
    }

    public final void C(int i) {
        ((kcj) this.a).t(i);
    }

    public final ComponentName D() {
        return ((gmh) ((jyj) this.a).c.d()).a;
    }

    public final void E() throws IllegalArgumentException {
        yop yopVarE = jyj.a.e();
        jyj jyjVar = (jyj) this.a;
        geu geuVar = jyjVar.c;
        ((ynz) ((ynz) yopVarE).ai((char) 2829)).y("%s lost the navigation focus, will signal to stop navigation", ((gmh) geuVar.d()).a.getPackageName());
        un unVar = new un(null, null);
        unVar.r(2);
        jyjVar.b.c((NavigationSummary) unVar.a);
        if (jyjVar.e == null || !geuVar.D().a) {
            return;
        }
        jyjVar.e.run();
    }

    public final void F(boolean z) {
        SessionInfo sessionInfo;
        jsp jspVar = (jsp) this.a;
        mqb mqbVar = jspVar.p;
        if (mqbVar == null || (sessionInfo = jspVar.q) == null) {
            gks.d("CarApp.H.Tem", "Attempt to request location updates while app is unknown");
            return;
        }
        hhz hhzVar = (hhz) jspVar.b(mqbVar, sessionInfo).a(CloudRecognizerProtocolStrings.APP);
        hhzVar.g();
        int iC = hhzVar.a.i().c();
        if (iC <= 3) {
            gks.e("CarApp.H", "Attempt to request location updates for app Api level %s", Integer.valueOf(iC));
        } else if (z) {
            hhzVar.c.a(new geh(gnk.D, new gss(hhzVar.a, 5)));
        } else {
            hhzVar.c.a(new geh(gnk.E, new gss(hhzVar.a, 4)));
        }
    }

    public final void G(iwt iwtVar) {
        List list = ((iwz) this.a).a;
        synchronized (list) {
            if (list.contains(iwtVar)) {
                iwtVar.a();
            }
            list.remove(iwtVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, quy] */
    public final void H(Intent intent) throws RemoteException {
        yph yphVar = ipf.a;
        yphVar.l().y("Intent intercepted %s", intent);
        ipf ipfVar = (ipf) this.a;
        ?? Invoke = ipfVar.d.invoke();
        if (Invoke != 0) {
            Invoke.e(intent);
        } else {
            ((ype) yphVar.f()).M("%s Escape intent intercepted, but unable to process %s", ipfVar.b, intent);
        }
    }

    public final void I() {
        ype ypeVar = (ype) ioq.E.l().ai(845);
        Object obj = this.a;
        ioq ioqVar = (ioq) obj;
        ypeVar.y("%s onDisplayAddFailed()", ioqVar.i);
        ioqVar.b.v((ing) obj);
    }

    public final void J() {
        Object obj = this.a;
        ioq ioqVar = (ioq) obj;
        ipn ipnVar = ioqVar.G;
        Integer numB = ipnVar.b();
        numB.getClass();
        jhf jhfVarA = ipnVar.a();
        ioqVar.y.aa(ioqVar.z, jhfVarA);
        ioqVar.b.z((ing) obj);
        ioqVar.O(numB.intValue());
    }

    public final void K(xom xomVar) {
        ((ikb) this.a).j(xomVar);
    }

    public final void L() {
        SurfaceContainer surfaceContainerU = U();
        hhz hhzVar = (hhz) this.a;
        SurfaceContainer surfaceContainer = hhzVar.f;
        hhzVar.f = surfaceContainerU;
        gks.c("CarApp.H.Tem", "SurfaceProvider: Surface updated: %s.", surfaceContainerU);
        ISurfaceCallback iSurfaceCallback = hhzVar.e;
        if (iSurfaceCallback == null) {
            return;
        }
        if (surfaceContainer == null || (surfaceContainerU.getHeight() >= surfaceContainer.getHeight() && surfaceContainerU.getWidth() >= surfaceContainer.getWidth())) {
            hhzVar.a.t().r(iSurfaceCallback, surfaceContainerU);
            hhzVar.w();
            hhzVar.v();
        } else {
            hhzVar.w();
            hhzVar.v();
            hhzVar.a.t().r(iSurfaceCallback, surfaceContainerU);
        }
        if (((ggk) hhzVar.a.F(ggk.class)).u()) {
            hhzVar.s().f();
        }
    }

    public final void M() {
        SurfaceContainer surfaceContainerU = U();
        Object obj = this.a;
        hhz hhzVar = (hhz) obj;
        hhzVar.f = surfaceContainerU;
        ISurfaceCallback iSurfaceCallback = hhzVar.e;
        if (iSurfaceCallback != null && ((fud) obj).b) {
            glp glpVarT = hhzVar.a.t();
            surfaceContainerU.getClass();
            urf urfVar = new urf();
            glpVarT.a(gnk.k, new glq(new glu(iSurfaceCallback, surfaceContainerU, glpVarT, urfVar, 1), urfVar));
        }
        hhzVar.f = null;
        gks.b("CarApp.H.Tem", "SurfaceProvider: Surface destroyed");
    }

    public final float N(float f) {
        return ((dpz) this.a).j.a() * f;
    }

    public final doj O() {
        return ((dom) this.a).f();
    }

    public final doj P() {
        return ((dom) this.a).f();
    }

    public final doj Q() {
        return ((dom) this.a).f();
    }

    public final doj R() {
        return ((dom) this.a).f();
    }

    public final doj S() {
        return ((dom) this.a).f();
    }

    public final doj T() {
        return ((dom) this.a).f();
    }

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        name.getClass();
        return afyh.g(name, ((String) this.a).concat("."), false);
    }

    public final void b() {
        adrt adrtVar = (adrt) this.a;
        if (adrtVar.c.decrementAndGet() == 0) {
            adrtVar.d();
        }
    }

    public final void c(boolean z) {
        ((xdv) this.a).h(z);
    }

    public final void d() {
        Object obj = this.a;
        xda xdaVar = (xda) tec.a((Fragment) obj, xda.class);
        xdaVar.getClass();
        xdaVar.f();
        xdv xdvVar = (xdv) obj;
        if (xdvVar.k()) {
            xdvVar.a.performEditorAction(6);
        }
    }

    public final void e() {
        xda xdaVar = (xda) tec.a((Fragment) this.a, xda.class);
        xdaVar.getClass();
        xdaVar.e();
    }

    public final void f(int i) {
        ((xds) this.a).e(i);
    }

    public final void g(BluetoothDevice bluetoothDevice) {
        ((WirelessSetupSharedService) this.a).p = bluetoothDevice;
    }

    public final void h(nsi nsiVar) {
        yph yphVar = oxs.a;
        ((ype) yphVar.l().ai((char) 6099)).y("Display status changed to %s", nsiVar);
        Object obj = this.a;
        if (nsiVar != nsi.b) {
            if (nsiVar == nsi.c) {
                oxs oxsVar = (oxs) obj;
                if (!oxsVar.f) {
                    ((ype) yphVar.l().ai((char) 6100)).u("Ignoring update as display was never active");
                    return;
                }
                oxsVar.e = true;
                if (lal.a().b()) {
                    lau.c().j(ywk.RESIZE);
                    return;
                }
                return;
            }
            return;
        }
        oxs oxsVar2 = (oxs) obj;
        oxsVar2.f = true;
        if (oxsVar2.e) {
            oxsVar2.e = false;
            lha lhaVarA = lgv.a();
            mpz mpzVar = mpz.b;
            ComponentName componentNameA = lhaVarA.a(mpzVar);
            if (componentNameA == null) {
                ((ype) ((ype) yphVar.h()).ai((char) 6126)).u("Not launching nav app or turn card for resize since there is no default");
                return;
            }
            nso nsoVarB = nsr.c().b();
            nsv nsvVarM = nsoVarB.m();
            mqc mqcVarE = mpd.b().e(oxs.g(nsn.s));
            if (mqcVarE == null || mqcVarE.b != mpzVar) {
                boolean zH = nsoVarB.H();
                if (nsvVarM.equals(nsv.g) || nsvVarM.equals(nsv.h)) {
                    if (!zH) {
                        return;
                    } else {
                        zH = true;
                    }
                }
                if (oxs.k() && ((nsvVarM.equals(nsv.e) || nsvVarM.equals(nsv.f)) && oxsVar2.j(componentNameA))) {
                    return;
                }
                if (nsvVarM.equals(nsv.e) || nsvVarM.equals(nsv.f) || zH || !oxs.k()) {
                    ((ype) yphVar.l().ai((char) 6118)).y("Launching %s nav app due to resize", componentNameA);
                    mpe.a().i(new Intent().setComponent(componentNameA).putExtra("com.google.android.apps.auto.system.internal.display.primary.PrimaryDisplayContentManager.EXTRA_FOR_RESIZING", true).putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1));
                    return;
                }
                return;
            }
            ((ype) yphVar.l().ai((char) 6121)).y("Not launching nav app for resize since there is an existing nav app %s", mqcVarE);
            nsv nsvVar = nsv.a;
            if (!nsvVarM.equals(nsvVar) && oxs.k()) {
                ((ype) yphVar.l().ai((char) 6125)).u("Primary region and maps open, nothing to do");
                return;
            }
            if (lem.a().i(new mqb(componentNameA))) {
                if (!nsoVarB.K()) {
                    ((ype) yphVar.l().ai((char) 6123)).u("Unable to open dashboard, new layout doesn't support it");
                    return;
                } else {
                    ((ype) yphVar.l().ai((char) 6124)).u("Restoring dashboard state after resize for compatible nav app");
                    mua.a().k();
                    return;
                }
            }
            if (mqcVarE.a().equals(mkn.A) || nsvVarM.equals(nsvVar)) {
                return;
            }
            ((ype) yphVar.l().ai((char) 6122)).y("Showing dashboard due to incompatible nav app on %s", nsvVarM);
            mua.a().o(false);
        }
    }

    public final void i() {
        ((owy) this.a).i.R();
    }

    public final void j(boolean z) {
        SeekableLinearProgressIndicator seekableLinearProgressIndicator = (SeekableLinearProgressIndicator) this.a;
        seekableLinearProgressIndicator.c.setIndeterminate(z);
        seekableLinearProgressIndicator.f();
    }

    public final void k(int i, int i2) {
        SeekableLinearProgressIndicator seekableLinearProgressIndicator = (SeekableLinearProgressIndicator) this.a;
        int i3 = seekableLinearProgressIndicator.f;
        if ((!mlq.J(i3) && seekableLinearProgressIndicator.e == 1) || i3 == 2 || (i2 == 2 && i3 == 4)) {
            seekableLinearProgressIndicator.c(i);
            if (seekableLinearProgressIndicator.f == 4) {
                seekableLinearProgressIndicator.f = 2;
            }
        }
    }

    public final void l(double d) {
        MediaPlaybackView mediaPlaybackView = (MediaPlaybackView) this.a;
        if (mediaPlaybackView.m != null) {
            oit.a();
            if (Instant.now().isBefore(mediaPlaybackView.m.plus(MediaPlaybackView.b))) {
                return;
            }
        }
        if (!mediaPlaybackView.e.j(mediaPlaybackView.d)) {
            ((ype) ((ype) MediaPlaybackView.a.g()).ai((char) 6022)).u("Unable to process onSeekEvent. The MediaModel is not connected.");
            return;
        }
        long jRound = Math.round(d * mediaPlaybackView.d.b().O("android.media.metadata.DURATION"));
        AaPlaybackState aaPlaybackStateC = mediaPlaybackView.d.c();
        if (aaPlaybackStateC != null) {
            ebf.j().F(jRound >= ((long) omu.a(aaPlaybackStateC)) ? mediaPlaybackView.a(yzy.gZ) : mediaPlaybackView.a(yzy.ha));
        }
        mediaPlaybackView.d.j().d(yzz.MEDIA_FACET).e(jRound);
    }

    public final void m(ogx ogxVar) {
        Iterator it = ((ogy) this.a).d.iterator();
        while (it.hasNext()) {
            ogxVar.a((ajmd) it.next());
        }
    }

    public final void n(Call call) {
        ogp ogpVar = (ogp) this.a;
        CarCall carCallC = ogpVar.b.c(call);
        ((ype) ((ype) ogp.a.f()).ai((char) 5880)).y("onCallAdded: %s", new zjd(zjc.a, Integer.valueOf(carCallC.a)));
        call.registerCallback(ogpVar.c);
        ogpVar.a(new ogk(carCallC, 2));
    }

    public final void o(CallAudioState callAudioState) {
        ype ypeVar = (ype) ((ype) ogp.a.f()).ai(5881);
        Boolean boolValueOf = Boolean.valueOf(callAudioState.isMuted());
        zjc zjcVar = zjc.a;
        ypeVar.R("onCallAudioStateChanged (muted: %s route: %s mask: %s", new zjd(zjcVar, boolValueOf), new zjd(zjcVar, Integer.valueOf(callAudioState.getRoute())), new zjd(zjcVar, Integer.valueOf(callAudioState.getSupportedRouteMask())));
        ((ogp) this.a).a(new ogk(callAudioState, 4));
    }

    public final void p(Call call) {
        ogp ogpVar = (ogp) this.a;
        ogc ogcVar = ogpVar.b;
        CarCall carCallC = ogcVar.c(call);
        if (carCallC == null) {
            return;
        }
        ((ype) ((ype) ogp.a.f()).ai((char) 5882)).y("onCallRemoved: %s", new zjd(zjc.a, Integer.valueOf(carCallC.a)));
        call.unregisterCallback(ogpVar.c);
        ogpVar.a(new ogk(carCallC, 0));
        ConcurrentHashMap concurrentHashMap = ogcVar.c;
        if (((CarCall) concurrentHashMap.get(call)) != null) {
            concurrentHashMap.remove(call);
        }
    }

    public final void q(int i, long j) {
        Object obj = this.a;
        if (j != 2) {
            ((UsbConfigFragment) obj).c(i);
            return;
        }
        Fragment fragment = (Fragment) obj;
        ols.M(fragment.requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_RESOLVED_ISSUE);
        NavHostFragment.b(fragment).f(R.id.action_usbConfigFragment_to_projectionEstablishedFragment, null);
    }

    public final void r(boolean z) {
        ((RadioMediaBrowserService) this.a).l.b(new mis(true != z ? 3 : 1, null, null));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aixy, java.lang.Object] */
    public final void s() {
        ((ynz) mfa.b.e().ai(4822)).u("Call history changed");
        Object objA = aikz.a(this.a, afak.a);
        if (objA instanceof aixo) {
            throw new IllegalStateException("Could not post call history", aixp.b(objA));
        }
    }

    public final void t() {
        Notification.BubbleMetadata bubbleMetadata;
        yph yphVar = mba.a;
        ((ype) yphVar.l().ai((char) 4676)).u("onListenerConnected");
        wer.c();
        mba mbaVar = (mba) this.a;
        if (!mbaVar.f) {
            ((ype) ((ype) yphVar.h()).ai((char) 4700)).u("#startProcessing called after notification processor stopped");
            return;
        }
        mbaVar.e = true;
        mbaVar.g(true);
        ((ype) yphVar.l().ai((char) 4688)).u("postExistingNotifications");
        mbl mblVar = mbaVar.d;
        mblVar.getClass();
        List<StatusBarNotification> listB = mblVar.b();
        ((ype) yphVar.l().ai(4689)).w("Found %d active notification(s)", listB.size());
        NotificationListenerService.RankingMap rankingMapA = mblVar.a();
        nuj.b().l(rankingMapA);
        for (StatusBarNotification statusBarNotification : listB) {
            int iJ = mba.j(statusBarNotification, null);
            if (actj.s() || actj.r()) {
                iJ = mba.j(statusBarNotification, rankingMapA);
            }
            if (statusBarNotification.getNotification() != null && Build.VERSION.SDK_INT >= 30 && (statusBarNotification.getNotification().flags & 4096) == 4096 && (bubbleMetadata = statusBarNotification.getNotification().getBubbleMetadata()) != null && bubbleMetadata.isNotificationSuppressed()) {
                ((ype) yphVar.l().ai((char) 4684)).u("Ignoring bubble notification that is suppressed.");
            } else {
                mbaVar.h(statusBarNotification, false, iJ);
            }
        }
    }

    public final void u(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        mat.a(statusBarNotification, "NProc#onNotificationPosted");
        int iJ = mba.j(statusBarNotification, rankingMap);
        nuj.b().l(rankingMap);
        ((mba) this.a).h(statusBarNotification, true, iJ);
    }

    public final void v(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        mat.a(statusBarNotification, "NProc#onNotificationRemoved");
        mba.j(statusBarNotification, rankingMap);
        nuj.b().l(rankingMap);
        mba mbaVar = (mba) this.a;
        List list = mbaVar.b;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((max) it.next()).b(statusBarNotification)) {
                    return;
                }
            }
        }
        if (mbaVar.i(statusBarNotification)) {
            mcd.b();
            long jA = mcd.a(statusBarNotification);
            Map map = mbaVar.c;
            Long lValueOf = Long.valueOf(jA);
            moa moaVar = (moa) map.get(lValueOf);
            if (moaVar == null) {
                ((ype) ((ype) mba.a.h()).ai(4696)).L("Canceling a non-existent notification: %s %d", statusBarNotification.getPackageName(), jA);
            } else if (moaVar.J() != yzr.IM_NOTIFICATION) {
                mlq.e().g(moaVar);
                map.remove(lValueOf);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afck, java.lang.Object] */
    public final void x(Drawable drawable) {
        this.a.w(drawable);
    }

    public final void y(SurveyMetadata surveyMetadata) {
        ((ype) ((ype) HatsSurveyActivity.m.f()).ai(3742)).y("Survey closed by user with id %s", surveyMetadata.b);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.hn).l());
        ((HatsSurveyActivity) this.a).finishAndRemoveTask();
    }

    public final void z(SurveyMetadata surveyMetadata, int i) {
        zaa zaaVar;
        ((ype) ((ype) HatsSurveyActivity.m.g()).ai(3741)).y("Failed to present survey with id %s", surveyMetadata.b);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.ho);
        switch (i - 1) {
            case 0:
                zaaVar = zaa.HATS_CLIENT_ACTIVITY_WAS_DESTROYED;
                break;
            case 1:
                zaaVar = zaa.HATS_CLIENT_ACTIVITY_WAS_FINISHING;
                break;
            case 2:
                zaaVar = zaa.HATS_CLIENT_ACTIVITY_WAS_NULL;
                break;
            case 3:
                zaaVar = zaa.HATS_INVALID_COMPLETION_STYLE;
                break;
            case 4:
                zaaVar = zaa.HATS_INVALID_PROMPT_STYLE;
                break;
            case 5:
                zaaVar = zaa.HATS_INVALID_SURVEY_DATA_TYPE;
                break;
            case 6:
                zaaVar = zaa.HATS_INVALID_SURVEY_PAYLOAD;
                break;
            case 7:
                zaaVar = zaa.HATS_SURVEY_ALREADY_RUNNING;
                break;
            case 8:
                zaaVar = zaa.HATS_SURVEY_EXPIRED;
                break;
            case 9:
                zaaVar = zaa.HATS_UNSUPPORTED_EMBEDDED_SURVEY_CONTAINER;
                break;
            default:
                zaaVar = zaa.HATS_PARENT_VIEW_NOT_FOUND;
                break;
        }
        rrbVarH.v(zaaVar);
        ohsVarJ.F(rrbVarH.l());
        ((HatsSurveyActivity) this.a).finishAndRemoveTask();
    }

    public /* synthetic */ ajmd(Object obj) {
        this.a = obj;
    }

    public ajmd(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
