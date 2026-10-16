package com.carstream.tech.car;

import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.webkit.WebView;
import com.carstream.tech.R;
import defpackage.dd;
import defpackage.f1;
import defpackage.s2;
import defpackage.xc;
import java.io.IOException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class c {
    public final s2 a;
    public final Handler b;
    public boolean c;
    public boolean d;
    public long e;
    public long f;

    public c(s2 s2Var, Handler handler) {
        this.a = s2Var;
        this.b = handler;
    }

    public final void a() throws Resources.NotFoundException, IOException {
        s2 s2Var = this.a;
        CarScreen carScreen = s2Var.a;
        dd ddVar = carScreen.currentApp;
        if (ddVar == null || ddVar.l == null) {
            return;
        }
        s2Var.a("if(!window.__cntOpenFirstOnce){window.__cntAutoPlaying=false;" + carScreen.rawScript(R.raw.yt_open_first) + "}if(window.__cntOpenFirstOnce){window.__cntOpenFirstOnce();}");
    }

    public final void b() {
        s2 s2Var = this.a;
        CarScreen carScreen = s2Var.a;
        dd ddVar = carScreen.currentApp;
        if (ddVar != null && ddVar.h && carScreen.onScreen && xc.l(carScreen).getBoolean(xc.h("autoFullscreen"), true) && !carScreen.isFullscreen()) {
            s2Var.a("if(window.__cntGoFullscreen){window.__cntGoFullscreen();}");
            this.b.postDelayed(new f1(this, 0), 900L);
        }
    }

    public final void c(String str) throws Resources.NotFoundException, IOException {
        boolean z;
        s2 s2Var = this.a;
        CarScreen carScreen = s2Var.a;
        if (str == null) {
            return;
        }
        if (this.d && e(str)) {
            this.d = false;
            carScreen.keeper.a(20000L);
            f();
            s2Var.a("(function(){  if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();}  var tries=0, guarded=null, asked=false, played=false;  window.__cntGuardOff=false;  var t=setInterval(function(){    if(window.__cntGuardOff){clearInterval(t);return;}    tries++;    if(window.__cntUnmute){window.__cntUnmute();}    var v=document.querySelector('video');    if(v){      var silent=v.muted||v.volume===0;      if(v.muted){v.muted=false;}      if(v.volume===0){v.volume=1;}      if(!v.paused){played=true;}      if(v.paused&&!played&&(tries<=3||window.__cntCanResume!==false)){v.play();}      if(v!==guarded){        guarded=v;        v.addEventListener('volumechange',function(){          if(v.muted){v.muted=false;}          if(v.volume===0){v.volume=1;}        });      }      if(silent&&tries>=3&&!asked){        asked=true;        if(window.CntBridge&&window.CntBridge.audioStuck){          window.CntBridge.audioStuck();        }      }    }    if(tries>30){clearInterval(t);}  },400);  window.__cntStopAudioGuard=function(){    window.__cntGuardOff=true;    clearInterval(t);  };})();");
            b();
        } else if (e(str)) {
            s2Var.a("(function(){  if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();}  var tries=0, guarded=null, asked=false, played=false;  window.__cntGuardOff=false;  var t=setInterval(function(){    if(window.__cntGuardOff){clearInterval(t);return;}    tries++;    if(window.__cntUnmute){window.__cntUnmute();}    var v=document.querySelector('video');    if(v){      var silent=v.muted||v.volume===0;      if(v.muted){v.muted=false;}      if(v.volume===0){v.volume=1;}      if(!v.paused){played=true;}      if(v.paused&&!played&&(tries<=3||window.__cntCanResume!==false)){v.play();}      if(v!==guarded){        guarded=v;        v.addEventListener('volumechange',function(){          if(v.muted){v.muted=false;}          if(v.volume===0){v.volume=1;}        });      }      if(silent&&tries>=3&&!asked){        asked=true;        if(window.CntBridge&&window.CntBridge.audioStuck){          window.CntBridge.audioStuck();        }      }    }    if(tries>30){clearInterval(t);}  },400);  window.__cntStopAudioGuard=function(){    window.__cntGuardOff=true;    clearInterval(t);  };})();");
            b();
        }
        if (this.c) {
            if (SystemClock.uptimeMillis() - this.e > 45000) {
                this.c = false;
                return;
            }
            if (carScreen.currentApp == null || !d(str)) {
                return;
            }
            this.c = false;
            carScreen.searchBar.i(null, false);
            carScreen.keeper.a(20000L);
            if (carScreen.currentApp.j == null) {
                f();
                s2Var.a("(function(){  if(window.__cntStopAudioGuard){window.__cntStopAudioGuard();}  var tries=0, guarded=null, asked=false, played=false;  window.__cntGuardOff=false;  var t=setInterval(function(){    if(window.__cntGuardOff){clearInterval(t);return;}    tries++;    if(window.__cntUnmute){window.__cntUnmute();}    var v=document.querySelector('video');    if(v){      var silent=v.muted||v.volume===0;      if(v.muted){v.muted=false;}      if(v.volume===0){v.volume=1;}      if(!v.paused){played=true;}      if(v.paused&&!played&&(tries<=3||window.__cntCanResume!==false)){v.play();}      if(v!==guarded){        guarded=v;        v.addEventListener('volumechange',function(){          if(v.muted){v.muted=false;}          if(v.volume===0){v.volume=1;}        });      }      if(silent&&tries>=3&&!asked){        asked=true;        if(window.CntBridge&&window.CntBridge.audioStuck){          window.CntBridge.audioStuck();        }      }    }    if(tries>30){clearInterval(t);}  },400);  window.__cntStopAudioGuard=function(){    window.__cntGuardOff=true;    clearInterval(t);  };})();");
                return;
            }
            try {
                z = xc.l(carScreen).getBoolean(xc.h("voiceOpenFirst"), true);
            } catch (Throwable th) {
                String.valueOf(th);
                z = true;
            }
            if (z) {
                this.d = true;
                dd ddVar = carScreen.currentApp;
                if (ddVar == null || ddVar.l == null) {
                    return;
                }
                a();
                if (this.d) {
                    this.b.postDelayed(new b(this, 0), 400L);
                }
            }
        }
    }

    public final boolean d(String str) {
        String strSubstring;
        dd ddVar = this.a.a.currentApp;
        if (ddVar != null && (strSubstring = ddVar.e) != null && str != null) {
            int iIndexOf = strSubstring.indexOf(63);
            if (iIndexOf > 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            int iLastIndexOf = strSubstring.lastIndexOf(47);
            if (iLastIndexOf >= 0 && iLastIndexOf + 1 < strSubstring.length()) {
                return str.contains(strSubstring.substring(iLastIndexOf));
            }
        }
        return false;
    }

    public final boolean e(String str) {
        dd ddVar = this.a.a.currentApp;
        if (ddVar == null || str == null) {
            return false;
        }
        String str2 = ddVar.j;
        return str2 == null ? d(str) : str.contains(str2);
    }

    public final void f() {
        WebView webView = this.a.a.web;
        if (webView == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f < 3000) {
            return;
        }
        this.f = jUptimeMillis;
        webView.post(new defpackage.f(webView, 6));
    }
}
