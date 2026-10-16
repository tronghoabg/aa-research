package com.carstream.tech.car;

import android.view.View;
import defpackage.a6;
import defpackage.ec;
import defpackage.l3;
import defpackage.s8;
import defpackage.w6;
import defpackage.z6;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarScreen b;

    public /* synthetic */ f(CarScreen carScreen, int i) {
        this.a = i;
        this.b = carScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CarScreen carScreen = this.b;
                if (!carScreen.locked) {
                    if (!ec.j(carScreen)) {
                        carScreen.lockAllNow("het han / thu hoi");
                        break;
                    } else {
                        a6.c(carScreen.getApplicationContext());
                        carScreen.debounce.postDelayed(this, 60000L);
                        break;
                    }
                }
                break;
            case 1:
                CarScreen carScreen2 = this.b;
                carScreen2.splashShowing = false;
                carScreen2.railAfterSettingChange();
                if (carScreen2.speedOverlay != null) {
                    carScreen2.giuTrenCung();
                    break;
                }
                break;
            case 2:
                CarScreen carScreen3 = this.b;
                carScreen3.controlsRevealed = false;
                carScreen3.syncControlBar(carScreen3.currentApp);
                break;
            case 3:
                CarScreen carScreen4 = this.b;
                if (carScreen4.homeShowing) {
                    carScreen4.tickHome();
                    carScreen4.debounce.postDelayed(this, 1000L);
                    break;
                }
                break;
            case 4:
                CarScreen carScreen5 = this.b;
                View view = carScreen5.controlBar.c;
                if (view != null && view.getVisibility() == 0) {
                    l3 l3Var = carScreen5.controlBar;
                    long jO = z6.o(z6.l());
                    long jK = z6.k();
                    s8 s8Var = l3Var.d;
                    if (s8Var != null) {
                        s8Var.g(jO, jK);
                    }
                    l3 l3Var2 = carScreen5.controlBar;
                    String strM = z6.m();
                    s8 s8Var2 = l3Var2.d;
                    if (s8Var2 != null) {
                        s8Var2.f(strM);
                    }
                    l3 l3Var3 = carScreen5.controlBar;
                    w6 w6VarG = z6.g(carScreen5.carHooks);
                    boolean z = w6VarG != null && w6VarG.d;
                    s8 s8Var3 = l3Var3.d;
                    if (s8Var3 != null) {
                        s8Var3.c(z);
                    }
                    carScreen5.debounce.postDelayed(this, 1000L);
                    break;
                } else {
                    carScreen5.barTicking = false;
                    break;
                }
            case 5:
                CarScreen carScreen6 = this.b;
                c cVar = carScreen6.autoOpen;
                cVar.f();
                cVar.a.a("(function(){  if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();}  var tries=0, guarded=null, asked=false, played=false;  window.__cntGuardOff=false;  var t=setInterval(function(){    if(window.__cntGuardOff){clearInterval(t);return;}    tries++;    if(window.__cntUnmute){window.__cntUnmute();}    var v=document.querySelector('video');    if(v){      var silent=v.muted||v.volume===0;      if(v.muted){v.muted=false;}      if(v.volume===0){v.volume=1;}      if(!v.paused){played=true;}      if(v.paused&&!played&&(tries<=3||window.__cntCanResume!==false)){v.play();}      if(v!==guarded){        guarded=v;        v.addEventListener('volumechange',function(){          if(v.muted){v.muted=false;}          if(v.volume===0){v.volume=1;}        });      }      if(silent&&tries>=3&&!asked){        asked=true;        if(window.CntBridge&&window.CntBridge.audioStuck){          window.CntBridge.audioStuck();        }      }    }    if(tries>30){clearInterval(t);}  },400);  window.__cntStopAudioGuard=function(){    window.__cntGuardOff=true;    clearInterval(t);  };})();");
                carScreen6.autoOpen.b();
                break;
            default:
                CarScreen carScreen7 = this.b;
                if (!carScreen7.isFullscreen() && !carScreen7.homeShowing && !carScreen7.settingsShowing && !carScreen7.gamesShowing) {
                    carScreen7.autoOpen.b();
                    break;
                }
                break;
        }
    }
}
