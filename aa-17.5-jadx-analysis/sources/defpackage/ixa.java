package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.CarAudioConfiguration;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ixa implements jay {
    public static final yph a = yph.c("CAR.MIC");
    public CarAudioConfiguration[] c;
    public volatile jaz d;
    public final Context h;
    public final boolean i;
    public final isf j;
    public volatile ivu k;
    public volatile boolean b = false;
    public final List e = new ArrayList();
    public final AtomicInteger f = new AtomicInteger();
    private final Handler l = new rbj(this, Looper.getMainLooper());
    private final Runnable m = new imt(this, 15, null);
    public volatile boolean g = false;

    public ixa(Context context, boolean z, isf isfVar) {
        this.h = context;
        this.i = z;
        this.j = isfVar;
    }

    public final void a() {
        if (!this.b) {
            throw new IllegalStateException("Attempted to use MicrophoneInputService before end point is ready.");
        }
    }

    @Override // defpackage.iyw
    public final /* synthetic */ jbj b(jbn jbnVar) {
        return new jaz(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    public final void e() {
        this.l.postDelayed(this.m, 2000L);
    }

    public final void f() {
        this.l.removeCallbacks(this.m);
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.d = (jaz) jbjVar;
        this.b = true;
    }
}
