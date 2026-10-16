package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.os.PerformanceHintManager;
import android.view.WindowManager;
import j$.util.Optional;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class umn extends uvs implements utt, uyl {
    public final ykd A;
    public final erb B;
    public umm b;
    public final List c;
    public final tmb d;
    public final ukz e;
    public long f;
    public uts g;
    public final qay h;
    public final Executor i;
    public boolean j;
    public volatile boolean k;
    public boolean l;
    public final uuh m;
    public final int n;
    public final utg o;
    public final xyc p;
    public final xyc q;
    public final xyc r;
    public tun s;
    public PerformanceHintManager.Session t;
    public final Optional u;
    public final psj v;
    public tsl w;
    public final uvg x;
    public final ncp y;
    public final std z;
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/renderer/GmmRenderTarget");
    private static final float[] E = {0.93f, 0.93f, 0.93f, 1.0f};

    /* JADX WARN: Illegal instructions before constructor call */
    public umn(Context context, tmb tmbVar, std stdVar, uvg uvgVar, ukz ukzVar, qay qayVar, Executor executor, psj psjVar, erb erbVar, zwm zwmVar, ackk ackkVar, utg utgVar, Optional optional, Executor executor2, qau qauVar) {
        Resources resources = context.getResources();
        super(resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().heightPixels);
        this.c = new ArrayList();
        this.j = false;
        this.k = false;
        this.l = true;
        this.A = new ykd(this, null);
        wub.L(new uai(ackkVar, 11));
        int i = 12;
        this.p = wub.L(new uai(ackkVar, i));
        int i2 = 13;
        wub.L(new uai(ackkVar, i2));
        int i3 = 14;
        this.q = wub.L(new uai(ackkVar, i3));
        this.r = wub.L(new uai(ackkVar, 15));
        this.d = tmbVar;
        this.z = stdVar;
        this.x = uvgVar;
        if (uvgVar != null) {
            uvgVar.s = new ueh(this, i);
            uvgVar.t = new ueh(this, i2);
        }
        this.e = ukzVar;
        this.h = qayVar;
        this.i = executor;
        this.v = psjVar;
        this.o = utgVar;
        this.n = (int) (context instanceof Activity ? ((Activity) context).getWindowManager().getDefaultDisplay().getRefreshRate() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate());
        this.B = erbVar;
        this.m = new uuh(new ueh(this, i3));
        float[] fArr = E;
        h(fArr[0], fArr[1], fArr[2], fArr[3]);
        this.u = optional;
        this.y = zwmVar.c().x ? new ncp(executor2, qauVar) : null;
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            ((ynz) a.a(uys.a).ai(9426)).K("GL error set on entry to %s, error=%d", str, iGlGetError);
        }
    }

    public final void c(uml umlVar) {
        List list = this.c;
        synchronized (list) {
            if (list.contains(umlVar)) {
                return;
            }
            list.add(umlVar);
        }
    }

    public final void d(boolean z) {
        tsl tslVar = this.w;
        tslVar.getClass();
        if (!z) {
            tslVar.c(false);
            return;
        }
        tslVar.c(true);
        tun tunVar = this.s;
        if (tunVar != null) {
            tunVar.e();
        }
    }

    public final void e(uml umlVar) {
        List list = this.c;
        synchronized (list) {
            list.remove(umlVar);
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
