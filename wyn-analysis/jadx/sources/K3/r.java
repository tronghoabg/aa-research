package K3;

import A.AbstractC0213f;
import Ef.H;
import Ef.H0;
import Ef.S;
import Hf.k0;
import Hf.x0;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.I;
import java.util.concurrent.atomic.AtomicReference;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public Object f6511a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6512b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6513c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6514d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6515e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6516f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6517g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6518h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6519i;

    public r(WebView view, Context context, Kd.a aVar) {
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(context, "context");
        this.f6511a = view;
        Lf.e eVar = S.f3698a;
        this.f6512b = H.F(aVar, Jf.n.f6132a);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.H h10 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.H(this, 0);
        this.f6514d = h10;
        view.addOnLayoutChangeListener(h10);
        x0 x0VarC = k0.c(Boolean.FALSE);
        this.f6515e = x0VarC;
        this.f6516f = x0VarC;
        AbstractC3340k.e(context, "context");
        r rVar = new r();
        Context applicationContext = context.getApplicationContext();
        AbstractC3340k.d(applicationContext, "getApplicationContext(...)");
        rVar.f6511a = applicationContext;
        rVar.f6512b = new Rect();
        rVar.f6513c = new Rect();
        rVar.f6514d = new Rect();
        rVar.f6515e = new Rect();
        rVar.f6516f = new Rect();
        rVar.f6517g = new Rect();
        rVar.f6518h = new Rect();
        rVar.f6519i = new Rect();
        this.f6517g = rVar;
        x0 x0VarC2 = k0.c(new I(rVar));
        this.f6518h = x0VarC2;
        this.f6519i = x0VarC2;
    }

    public static void d(String str, JSONObject jSONObject) {
        StringBuilder sbJ = N0.a.j(str);
        sbJ.append(jSONObject.toString());
        String string = sbJ.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public void a(Rect rect, Rect rect2) {
        float f10 = rect.left;
        Context context = (Context) this.f6511a;
        rect2.set(AbstractC3230e0.o(context, f10), AbstractC3230e0.o(context, rect.top), AbstractC3230e0.o(context, rect.right), AbstractC3230e0.o(context, rect.bottom));
    }

    public Z8.a b(int i5) throws Throwable {
        Z8.a aVar = null;
        try {
            if (!AbstractC0213f.b(2, i5)) {
                JSONObject jSONObjectM = ((Y9.c) this.f6515e).m();
                if (jSONObjectM != null) {
                    Z8.a aVarB = ((xa.d) this.f6513c).B(jSONObjectM);
                    d("Loaded cached settings: ", jSONObjectM);
                    ((m9.S) this.f6514d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (AbstractC0213f.b(3, i5) || aVarB.f17034c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return aVarB;
                        } catch (Exception e7) {
                            e = e7;
                            aVar = aVarB;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public Z8.a c() {
        return (Z8.a) ((AtomicReference) this.f6518h).get();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public void destroy() {
        H0 h02 = (H0) this.f6513c;
        if (h02 != null) {
            h02.cancel(null);
        }
        ((WebView) this.f6511a).removeOnLayoutChangeListener((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.H) this.f6514d);
    }
}
