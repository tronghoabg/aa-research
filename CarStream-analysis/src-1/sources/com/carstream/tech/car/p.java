package com.carstream.tech.car;

import android.widget.FrameLayout;
import defpackage.dd;
import defpackage.f1;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ p(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                CarScreen carScreen = this.b.a;
                if (carScreen.pageTrusted() && (frameLayout = carScreen.sheet.c) != null) {
                    frameLayout.setVisibility(8);
                    break;
                }
                break;
            case 1:
                t tVar = this.b;
                dd ddVar = tVar.a.currentApp;
                if (ddVar != null && "web".equals(ddVar.a)) {
                    tVar.a.dongOnhapTrang();
                    break;
                }
                break;
            case 2:
                CarScreen carScreen2 = this.b.a;
                if (carScreen2.pageTrusted()) {
                    c cVar = carScreen2.autoOpen;
                    cVar.f();
                    cVar.a.a("(function(){  if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();}  var tries=0, guarded=null, asked=false, played=false;  window.__cntGuardOff=false;  var t=setInterval(function(){    if(window.__cntGuardOff){clearInterval(t);return;}    tries++;    if(window.__cntUnmute){window.__cntUnmute();}    var v=document.querySelector('video');    if(v){      var silent=v.muted||v.volume===0;      if(v.muted){v.muted=false;}      if(v.volume===0){v.volume=1;}      if(!v.paused){played=true;}      if(v.paused&&!played&&(tries<=3||window.__cntCanResume!==false)){v.play();}      if(v!==guarded){        guarded=v;        v.addEventListener('volumechange',function(){          if(v.muted){v.muted=false;}          if(v.volume===0){v.volume=1;}        });      }      if(silent&&tries>=3&&!asked){        asked=true;        if(window.CntBridge&&window.CntBridge.audioStuck){          window.CntBridge.audioStuck();        }      }    }    if(tries>30){clearInterval(t);}  },400);  window.__cntStopAudioGuard=function(){    window.__cntGuardOff=true;    clearInterval(t);  };})();");
                    break;
                }
                break;
            default:
                CarScreen carScreen3 = this.b.a;
                if (carScreen3.pageTrusted()) {
                    c cVar2 = carScreen3.autoOpen;
                    cVar2.f();
                    cVar2.b.postDelayed(new f1(cVar2, 2), 200L);
                    break;
                }
                break;
        }
    }
}
