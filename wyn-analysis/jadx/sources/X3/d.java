package X3;

import A.C0230x;
import Ef.S;
import a4.C1328a;
import ad.L;
import ad.r;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import cg.m;
import cg.y;
import com.applovin.shadow.okio.Segment;
import f4.C2554a;
import f4.C2558e;
import f4.InterfaceC2561h;
import f4.InterfaceC2562i;
import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class d extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16086i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b7.k f16087j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b7.k kVar, int i5) {
        super(0);
        this.f16086i = i5;
        this.f16087j = kVar;
    }

    @Override // tf.a
    public final Object invoke() {
        L l10;
        InterfaceC2561h jVar;
        int largeMemoryClass;
        a4.i iVarA;
        int i5 = 4;
        int i10 = 0;
        switch (this.f16086i) {
            case 0:
                Context context = (Context) this.f16087j.f19396b;
                C2554a c2554a = new C2554a(context);
                InterfaceC2562i c0230x = c2554a.f34807d ? new C0230x((byte) 0, 14) : new ae.d(5);
                if (c2554a.f34806c) {
                    double d3 = c2554a.f34805b;
                    if (d3 > 0.0d) {
                        Bitmap.Config config = k4.e.f39264a;
                        try {
                            Object systemService = Y0.e.getSystemService(context, ActivityManager.class);
                            AbstractC3340k.b(systemService);
                            ActivityManager activityManager = (ActivityManager) systemService;
                            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused) {
                            largeMemoryClass = 256;
                        }
                        double d5 = d3 * largeMemoryClass;
                        double d10 = Segment.SHARE_MINIMUM;
                        i10 = (int) (d5 * d10 * d10);
                    }
                    if (i10 > 0) {
                        jVar = new X2.j(i10, c0230x);
                        return new C2558e(jVar, c0230x);
                    }
                    l10 = new L(c0230x, i5);
                } else {
                    l10 = new L(c0230x, i5);
                }
                jVar = l10;
                return new C2558e(jVar, c0230x);
            default:
                k4.i iVar = k4.i.f39272a;
                Context context2 = (Context) this.f16087j.f19396b;
                synchronized (iVar) {
                    iVarA = k4.i.f39273b;
                    if (iVarA == null) {
                        C1328a c1328a = new C1328a();
                        c1328a.f17337b = m.f19913a;
                        c1328a.f17338c = 0.02d;
                        c1328a.f17339d = 10485760L;
                        c1328a.f17340e = 262144000L;
                        Lf.e eVar = S.f3698a;
                        c1328a.f17341f = Lf.d.f7120b;
                        Bitmap.Config config2 = k4.e.f39264a;
                        File cacheDir = context2.getCacheDir();
                        cacheDir.mkdirs();
                        File fileX = qf.i.X(cacheDir, "image_cache");
                        String str = y.f19937b;
                        c1328a.f17336a = r.i(fileX);
                        iVarA = c1328a.a();
                        k4.i.f39273b = iVarA;
                    }
                }
                return iVarA;
        }
    }
}
