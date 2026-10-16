package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Objects;

/* loaded from: classes.dex */
public class lnb implements lju, ljy {
    public static final yph a = yph.c("GH.MediaPlaybackMonitor");
    public final Context b;
    protected ljv c;
    protected lth d;
    public lth e;
    protected lth f;
    lsv h;
    public lmd i;
    public boolean k;
    private boolean o;
    private boolean p;
    private final lmx m = new lmx(this);
    protected boolean j = false;
    private boolean q = true;
    private final Runnable r = new kyl(this, 15);
    protected final BroadcastReceiver l = new lmw();
    private final BroadcastReceiver n = new lmy(this);
    public final lna g = new lna(this);

    public lnb(Context context) {
        this.b = context;
    }

    public static boolean r(ComponentName componentName) {
        return componentName.equals(mkn.F) || componentName.equals(mkn.G);
    }

    private final void s(lmd lmdVar) {
        lna lnaVar = this.g;
        Message messageObtainMessage = lnaVar.obtainMessage(1, lmdVar);
        lnaVar.removeMessages(1);
        lnaVar.sendMessage(messageObtainMessage);
    }

    private final void t() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
        Context context = this.b;
        dup.e(context, this.n, intentFilter, null, 2);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.media.action.MEDIA_PLAY_FROM_SEARCH");
        intentFilter2.addAction("android.intent.action.MEDIA_SEARCH");
        dup.e(context, this.l, intentFilter2, null, 2);
    }

    @Override // defpackage.lju
    public final void a(ComponentName componentName, ComponentName componentName2) {
        ((ype) a.l().ai((char) 4028)).M("MediaBrowser onMediaAppChanged called current=%s new=%s", componentName, componentName2);
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.lju
    public final void b() {
        ((ype) a.l().ai((char) 4029)).u("MediaBrowser onConnected called");
        this.g.removeCallbacksAndMessages(null);
        this.q = true;
        AaPlaybackState aaPlaybackStateC = this.c.c();
        if (aaPlaybackStateC != null) {
            h(aaPlaybackStateC);
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) a.l().ai((char) 4040)).u("start called");
        wer.c();
        int i = 1;
        if (acsx.A()) {
            this.k = true;
            wer.d(this.r, acsx.f());
        }
        if (!lmi.a().e()) {
            this.c = lnm.z().b();
            n();
            this.c.d(this);
            lsv lsvVar = new lsv(this.c);
            this.h = lsvVar;
            lsvVar.b.d(lsvVar.i);
            this.c.f();
            t();
            this.o = true;
            return;
        }
        yzz yzzVar = yzz.MEDIA_FACET;
        this.d = lto.e(yzzVar, null, null, null, 14);
        eqj eqjVarT = tby.t(lgx.b().a(mpz.e));
        this.e = lto.e(yzzVar, eqjVarT, tby.C(eqjVarT, new lmv(i)), null, 8);
        int i2 = 20;
        this.f = lto.c(yzzVar, tby.t(tby.w(lrw.a().c, new lle(i2))), lto.d());
        ((ltn) this.d).d.fE(lbh.d(), new lkn(4));
        ((ltn) this.e).d.fE(lbh.d(), new lkn(5));
        tby.n(((ltn) this.f).a).fE(lbh.d(), new kqc(this, 18));
        tby.n(tby.z(tby.t(((ltn) this.f).d), tby.t(tby.w(((ltn) this.f).e, new lmv(2))))).fE(lbh.d(), new kqc(this, 19));
        tby.n(tby.t(((ltn) this.f).c)).fE(lbh.d(), new kqc(this, i2));
        tby.F(tby.t(tby.w(((ltn) this.d).a, new lmv(0))), new iwu(11)).fE(lbh.d(), new lnc(this, i));
        t();
        n();
        this.o = true;
    }

    @Override // defpackage.lhg
    public void d() {
        wer.c();
        if (this.o) {
            Context context = this.b;
            context.unregisterReceiver(this.l);
            context.unregisterReceiver(this.n);
            if (lmi.a().e()) {
                this.d = null;
                this.e = null;
                this.f = null;
            } else {
                lsv lsvVar = this.h;
                lsvVar.c(true);
                lsvVar.b.e(lsvVar.i);
                this.h = null;
                this.c.g();
                this.c = null;
            }
            o();
            if (acsx.A()) {
                wer.f(this.r);
            }
            lna lnaVar = this.g;
            wer.c();
            kfs kfsVar = lnaVar.j;
            if (kfsVar != null) {
                lnaVar.g.a(kfsVar);
                lnaVar.j = null;
            }
            lmz lmzVar = lnaVar.h;
            if (lmzVar != null) {
                lmzVar.cancel(true);
                lnaVar.h = null;
            }
            lnaVar.removeCallbacksAndMessages(null);
            this.o = false;
            this.i = null;
        }
    }

    @Override // defpackage.lju
    public final void e(CharSequence charSequence) {
        ((ype) ((ype) a.g()).ai((char) 4030)).u("Media browser service connection FAILED!");
    }

    @Override // defpackage.lju
    public final void f() {
        ((ype) ((ype) a.h()).ai((char) 4031)).u("Media browser service connection suspended. Waiting to be reconnected....");
    }

    @Override // defpackage.lju
    public final void g(lmd lmdVar) {
        yph yphVar = a;
        if (yphVar.l().Z()) {
            ((ype) yphVar.l().ai((char) 4036)).y("onMetadataChanged called with %s", Objects.toString(lmdVar));
        }
        if (lmdVar != null) {
            lmdVar.h();
            lmc lmcVarH = lmdVar.h();
            if (TextUtils.isEmpty(lmcVarH.S()) && TextUtils.isEmpty(lmcVarH.R())) {
                ((ype) ((ype) yphVar.h()).ai((char) 4035)).u("Invalid metadata, no title and subtitle.");
                return;
            }
            lmd lmdVar2 = this.i;
            if (lmdVar2 != null) {
                lmc lmcVarH2 = lmdVar.h();
                lmc lmcVarH3 = lmdVar2.h();
                if (TextUtils.equals(lmcVarH2.S(), lmcVarH3.S()) && TextUtils.equals(lmcVarH2.R(), lmcVarH3.R()) && TextUtils.equals(lmcVarH2.Q(), lmcVarH3.Q()) && lmdVar.O("android.media.metadata.DURATION") == lmdVar2.O("android.media.metadata.DURATION")) {
                    Bitmap bitmapO = lmcVarH.O();
                    if (bitmapO == null) {
                        ((ype) yphVar.l().ai((char) 4034)).u("No album art");
                        return;
                    }
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapO, 256, 256, false);
                    lna lnaVar = this.g;
                    if (bitmapCreateScaledBitmap.sameAs(lnaVar.f)) {
                        ((ype) yphVar.l().ai((char) 4033)).u("Received duplicate metadata, ignoring...");
                        return;
                    }
                    ((ype) yphVar.l().ai((char) 4032)).u("Received metadata with new album art");
                    Message messageObtainMessage = lnaVar.obtainMessage(3, bitmapCreateScaledBitmap);
                    lnaVar.removeMessages(3);
                    lnaVar.sendMessage(messageObtainMessage);
                    return;
                }
            }
            s(lmdVar);
        }
    }

    @Override // defpackage.lju
    public final void h(AaPlaybackState aaPlaybackState) {
        if (aaPlaybackState == null) {
            ((ype) ((ype) a.h()).ai((char) 4037)).u("playback state is null in onPlaybackStateChanged");
        } else {
            l(aaPlaybackState, this.c.a().c);
        }
    }

    @Override // defpackage.lju
    public final void i(boolean z) {
        if (z) {
            return;
        }
        s(this.c.b());
    }

    @Override // defpackage.lju
    public final void j(CharSequence charSequence) {
        ((ype) ((ype) a.g()).ai((char) 4039)).u("Media session is destroyed");
    }

    @Override // defpackage.ljy
    public final boolean k() {
        return this.p;
    }

    public final void l(AaPlaybackState aaPlaybackState, String str) {
        aaPlaybackState.Q();
        if (this.q && !lmi.a().e()) {
            this.q = false;
            s(this.c.b());
        }
        m();
        lmx lmxVar = this.m;
        if (aaPlaybackState == null) {
            throw new IllegalArgumentException("playbackstate cannot be null");
        }
        lmxVar.a = aaPlaybackState;
        lmxVar.b = str;
        this.g.post(lmxVar);
        int iQ = aaPlaybackState.Q();
        this.p = iQ == 3 || iQ == 6;
    }

    protected final void m() {
        this.g.removeCallbacks(this.m);
    }

    protected void n() {
    }

    protected void o() {
    }

    protected void q(AaPlaybackState aaPlaybackState, String str) {
    }

    protected void p(String str, String str2, String str3, byte[] bArr, long j) {
    }
}
