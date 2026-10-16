package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class lsv {
    public static final yph a = yph.c("GH.MediaSIM");
    public final ljv b;
    public long d;
    public lsp f;
    public lmc g;
    private lss k;
    public int c = 0;
    public List e = new ArrayList();
    public boolean h = false;
    public final lju i = new lsu(this);
    private final Runnable l = new lqj(this, 6);
    private final Handler j = new Handler();

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
    }

    public lsv(ljv ljvVar) {
        this.b = ljvVar;
    }

    private final boolean f() {
        lss lssVar = this.k;
        return (this.h || lssVar == null || TextUtils.isEmpty(lssVar.m) || !e()) ? false : true;
    }

    public final void a() {
        lss lssVar = this.k;
        if (lssVar == null) {
            return;
        }
        mlq.e().g(lssVar);
        this.k = null;
        this.g = null;
    }

    public final void b(lsp lspVar) {
        ljv ljvVar = this.b;
        lmd lmdVarB = ljvVar.b();
        AaPlaybackState aaPlaybackStateC = ljvVar.c();
        if (!omu.k(aaPlaybackStateC, lmdVarB)) {
            yph yphVar = a;
            if (yphVar.l().Z()) {
                ((ype) yphVar.l().ai(4265)).M("invalid session state. state=%s, metadata=%s", aaPlaybackStateC, Objects.toString(lmdVarB));
                return;
            }
            return;
        }
        lso lsoVar = new lso();
        lsr lsrVar = new lsr();
        lsrVar.c("MEDIA");
        lsrVar.i = lspVar.h;
        String str = lspVar.a;
        lsrVar.a = lspVar.j;
        lsrVar.r = lspVar.i ? mny.a : mny.c;
        lsrVar.y = lspVar.g;
        lsrVar.d(lspVar.d);
        lsrVar.e(lspVar.e);
        lsrVar.C = lsoVar;
        lsrVar.w = lspVar.f;
        String str2 = lspVar.b;
        if (str2 != null) {
            lsrVar.s = str2;
        }
        String str3 = lspVar.c;
        if (str3 != null) {
            lsrVar.t = str3;
        }
        lsrVar.j = yzr.MEDIA;
        lss lssVar = new lss(lsrVar);
        lssVar.p = Long.valueOf(str2 == null ? 0L : str2.hashCode());
        this.k = lssVar;
        if (f()) {
            boolean z = false;
            if (!this.h && !lssVar.a) {
                z = true;
            }
            lssVar.r = z;
            this.h = true;
        }
        mlq.e().j(lssVar);
        d(this.c);
        if (f()) {
            this.h = true;
        }
    }

    public final void c(boolean z) {
        if (!z && !mlq.e().b(yzr.MEDIA).isEmpty()) {
            a();
        }
        this.j.removeCallbacksAndMessages(null);
        this.c = 0;
        this.d = 0L;
        this.e = new ArrayList();
        this.k = null;
        this.f = null;
        this.g = null;
        this.h = false;
    }

    public final void d(int i) {
        if (i == 3 || i == 6) {
            this.j.removeCallbacks(this.l);
        }
    }

    public final boolean e() {
        return this.c == 3;
    }
}
