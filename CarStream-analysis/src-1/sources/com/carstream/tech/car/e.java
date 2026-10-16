package com.carstream.tech.car;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.carstream.tech.media.ControllerService;
import defpackage.c8;
import defpackage.dd;
import defpackage.t2;
import defpackage.u6;
import defpackage.w6;
import defpackage.x6;
import defpackage.y6;
import defpackage.z6;
import defpackage.za;
import java.util.Iterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class e implements u6, y6 {
    public final /* synthetic */ int a;
    public final CarScreen b;

    public /* synthetic */ e(CarScreen carScreen, int i) {
        this.a = i;
        this.b = carScreen;
    }

    public void A(String str) {
        CarScreen carScreen = this.b;
        carScreen.keeper.a(20000L);
        carScreen.debounce.post(new l(this, str, 2));
    }

    public void B(long j, boolean z) {
        CarScreen carScreen = this.b;
        carScreen.keeper.b();
        carScreen.js("if(window.__cntSeek){window.__cntSeek(" + j + "," + z + ");}");
    }

    public void C(long j) {
        CarScreen carScreen = this.b;
        carScreen.keeper.b();
        carScreen.js("if(window.__cntSeek){window.__cntSeek(" + j + ",true);}");
        carScreen.revealControls();
    }

    public void D(String str) {
        this.b.debounce.post(new l(this, str, 1));
    }

    public void E() {
        this.b.debounce.post(new n(this, 0));
    }

    public void F() {
        CarScreen carScreen = this.b;
        carScreen.keeper.a(20000L);
        carScreen.debounce.post(new n(this, 1));
    }

    public void G() {
        CarScreen carScreen = this.b;
        carScreen.keeper.b();
        carScreen.toggleFullscreen();
    }

    public void a() {
        c cVar = this.b.autoOpen;
        cVar.c = true;
        cVar.e = SystemClock.uptimeMillis();
    }

    public void b() {
        WebView webView = this.b.web;
        if (webView != null) {
            webView.clearFocus();
        }
    }

    public void c() {
        c cVar = this.b.autoOpen;
        cVar.c = false;
        cVar.d = false;
    }

    public boolean d() {
        za zaVar = this.b.speedOverlay;
        return (zaVar == null || zaVar.c == null || !zaVar.a.j()) ? false : true;
    }

    public dd e() {
        return this.b.currentApp;
    }

    public void f() {
        CarScreen carScreen = this.b;
        carScreen.js("if(window.__cntSheetClose){window.__cntSheetClose();}");
        FrameLayout frameLayout = carScreen.sheet.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public boolean g() {
        return this.b.fullSurface;
    }

    public boolean h() {
        return this.b.keepAliveWanted;
    }

    public boolean i(int i, int i2) {
        FrameLayout frameLayout;
        za zaVar = this.b.speedOverlay;
        if (zaVar != null) {
            e eVar = zaVar.a;
            if (zaVar.c != null && eVar.j() && (frameLayout = eVar.b.rootLayout) != null && frameLayout.getWidth() != 0 && zaVar.c.getWidth() != 0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zaVar.c.getLayoutParams();
                layoutParams.leftMargin = za.e(i, Math.max(0, frameLayout.getWidth() - zaVar.c.getWidth()));
                layoutParams.topMargin = za.e(i2, Math.max(0, frameLayout.getHeight() - zaVar.c.getHeight()));
                zaVar.c.setLayoutParams(layoutParams);
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return !this.b.onDevice;
    }

    public void k() {
        this.b.searchBar.f(false);
    }

    public void l() {
        switch (this.a) {
            case 0:
                ((e) this.b.webPlayer).l();
                break;
            default:
                CarScreen carScreen = this.b;
                carScreen.keeper.b();
                carScreen.keeper.d();
                carScreen.js("if(window.__cntNext){window.__cntNext();}else if(window.CntBridge&&window.CntBridge.webLog){window.CntBridge.webLog('next: KHONG co moc __cntNext');}");
                break;
        }
    }

    public void m() {
        this.b.debounce.post(new h(this, 0));
    }

    public void n() {
        this.b.debounce.post(new t2(this, 1));
    }

    public void o() {
        y6 y6Var;
        x6 x6Var = z6.g;
        if (x6Var != null) {
            new Handler(Looper.getMainLooper()).post(new defpackage.f(x6Var, 28));
        }
        u6 u6Var = this.b.carHooks;
        Iterator it = z6.e.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            if (w6Var.a != u6Var && (y6Var = w6Var.b) != null) {
                try {
                    ((e) y6Var).E();
                } catch (Throwable unused) {
                }
            }
        }
        this.b.railAfterSettingChange();
        this.b.applyVideoFitLive();
        this.b.applyDataSaverLive();
        this.b.rebuildControlBar();
        CarScreen carScreen = this.b;
        carScreen.syncScreenFlags(carScreen.onScreen);
        this.b.speedOverlay.c();
        this.b.giuTrenCung();
        ControllerService controllerService = z6.a;
        if (controllerService != null) {
            controllerService.publishNowPlaying();
        }
    }

    public void p(String str) {
        this.b.debounce.post(new l(this, str, 0));
    }

    public void q(String str, String str2) {
        this.b.debounce.post(new m(this, str2, str));
    }

    public void r() {
        CarScreen carScreen = this.b;
        carScreen.keeper.b();
        carScreen.js("if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();}if(!(window.__cntPause&&window.__cntPause())){var v=(window.__cntVideo&&window.__cntVideo())||document.querySelector('video');if(v){v.pause();}}");
    }

    public void s() {
        ((e) this.b.webPlayer).r();
    }

    public void t() {
        CarScreen carScreen = this.b;
        carScreen.keeper.b();
        carScreen.js("var v=(window.__cntVideo&&window.__cntVideo())||document.querySelector('video'); if(v){v.play();}");
        c cVar = carScreen.autoOpen;
        if (cVar != null) {
            cVar.a.a("(function(){  if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();}  var tries=0, guarded=null, asked=false, played=false;  window.__cntGuardOff=false;  var t=setInterval(function(){    if(window.__cntGuardOff){clearInterval(t);return;}    tries++;    if(window.__cntUnmute){window.__cntUnmute();}    var v=document.querySelector('video');    if(v){      var silent=v.muted||v.volume===0;      if(v.muted){v.muted=false;}      if(v.volume===0){v.volume=1;}      if(!v.paused){played=true;}      if(v.paused&&!played&&(tries<=3||window.__cntCanResume!==false)){v.play();}      if(v!==guarded){        guarded=v;        v.addEventListener('volumechange',function(){          if(v.muted){v.muted=false;}          if(v.volume===0){v.volume=1;}        });      }      if(silent&&tries>=3&&!asked){        asked=true;        if(window.CntBridge&&window.CntBridge.audioStuck){          window.CntBridge.audioStuck();        }      }    }    if(tries>30){clearInterval(t);}  },400);  window.__cntStopAudioGuard=function(){    window.__cntGuardOff=true;    clearInterval(t);  };})();");
        }
    }

    public void u() {
        CarScreen carScreen = this.b;
        carScreen.keeper.b();
        carScreen.js("var v=(window.__cntVideo&&window.__cntVideo())||document.querySelector('video');if(v){ if(v.paused){ v.play(); } else { if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();} if(!(window.__cntPause&&window.__cntPause())){ v.pause(); } } }");
    }

    public void v() {
        ((e) this.b.webPlayer).w();
    }

    public void w() {
        CarScreen carScreen = this.b;
        carScreen.keeper.b();
        carScreen.keeper.d();
        carScreen.js("if(window.__cntPrev){window.__cntPrev();}else if(window.CntBridge&&window.CntBridge.webLog){window.CntBridge.webLog('prev: KHONG co moc __cntPrev');}");
    }

    public void x() {
        this.b.debounce.post(new t2(this, 0));
    }

    public void y() {
        ((e) this.b.webPlayer).t();
    }

    public void z(String str) {
        FrameLayout frameLayout;
        CarScreen carScreen = this.b;
        c8 c8Var = carScreen.sheet;
        if (c8Var == null || (frameLayout = c8Var.c) == null || frameLayout.getVisibility() != 0 || !str.equals(carScreen.lastScript)) {
            carScreen.lastScript = str;
            carScreen.js(str);
        } else {
            FrameLayout frameLayout2 = carScreen.sheet.c;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            carScreen.js("if(window.__cntSheetClose){window.__cntSheetClose();}");
        }
    }
}
