package N6;

import A7.CallableC0255h0;
import A7.CallableC0305y0;
import A7.RunnableC0299w0;
import D6.C0395s;
import G6.L;
import G6.U;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ka.AbstractC3256n;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;
import sb.C4033a;
import x6.C4476g;
import x6.EnumC4471b;

/* renamed from: N6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0776a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8446a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f8447b;

    /* renamed from: c, reason: collision with root package name */
    public final zzbaw f8448c;

    /* renamed from: d, reason: collision with root package name */
    public final zzflk f8449d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8450e;

    /* renamed from: f, reason: collision with root package name */
    public final zzdzy f8451f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8452g;

    /* renamed from: h, reason: collision with root package name */
    public final zzhcp f8453h = zzcfy.zzf;

    /* renamed from: i, reason: collision with root package name */
    public final zzfsm f8454i;

    /* renamed from: j, reason: collision with root package name */
    public final x f8455j;
    public final C0777b k;

    /* renamed from: l, reason: collision with root package name */
    public final v f8456l;

    public C0776a(WebView webView, zzbaw zzbawVar, zzdzy zzdzyVar, zzfsm zzfsmVar, zzflk zzflkVar, x xVar, C0777b c0777b, v vVar) {
        this.f8447b = webView;
        Context context = webView.getContext();
        this.f8446a = context;
        this.f8448c = zzbawVar;
        this.f8451f = zzdzyVar;
        zzbix.zza(context);
        zzbio zzbioVar = zzbix.zzlj;
        C0395s c0395s = C0395s.f2489e;
        this.f8450e = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        this.f8452g = ((Boolean) c0395s.f2492c.zzd(zzbix.zzlk)).booleanValue();
        this.f8454i = zzfsmVar;
        this.f8449d = zzflkVar;
        this.f8455j = xVar;
        this.k = c0777b;
        this.f8456l = vVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            C6.n nVar = C6.n.f1857D;
            nVar.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzg = this.f8448c.zzb().zzg(this.f8446a, str, this.f8447b);
            if (!this.f8452g) {
                return strZzg;
            }
            nVar.k.getClass();
            AbstractC3772b.a0(this.f8451f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzg;
        } catch (RuntimeException e7) {
            int i5 = L.f4523b;
            H6.l.d("Exception getting click signals. ", e7);
            C6.n.f1857D.f1868h.zzh(e7, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i5) {
        if (i5 <= 0) {
            String strD = N0.a.d(i5, "Invalid timeout for getting click signals. Timeout=", new StringBuilder(String.valueOf(i5).length() + 51));
            int i10 = L.f4523b;
            H6.l.c(strD);
            return "";
        }
        try {
            return (String) zzcfy.zza.zzc(new CallableC0305y0(this, false, str, 7)).get(Math.min(i5, this.f8450e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            int i11 = L.f4523b;
            H6.l.d("Exception getting click signals with timeout. ", e7);
            C6.n.f1857D.f1868h.zzh(e7, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e7 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() throws Throwable {
        U u10 = C6.n.f1857D.f1863c;
        String string = UUID.randomUUID().toString();
        Bundle bundleB = AbstractC3256n.b("query_info_type", "requester_type_6");
        C4033a c4033a = new C4033a(this, string);
        if (((Boolean) zzblc.zze.zze()).booleanValue()) {
            this.f8455j.a(this.f8447b, c4033a);
            return string;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlm)).booleanValue()) {
            this.f8453h.execute(new RunnableC0299w0(14, this, bundleB, c4033a, false));
            return string;
        }
        Q6.a.a(this.f8446a, EnumC4471b.BANNER, new C4476g((AdRequest$Builder) new AdRequest$Builder(14).x(AdMobAdapter.class, bundleB)), c4033a);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            C6.n nVar = C6.n.f1857D;
            nVar.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzj = this.f8448c.zzb().zzj(this.f8446a, this.f8447b, null);
            if (!this.f8452g) {
                return strZzj;
            }
            nVar.k.getClass();
            AbstractC3772b.a0(this.f8451f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzj;
        } catch (RuntimeException e7) {
            int i5 = L.f4523b;
            H6.l.d("Exception getting view signals. ", e7);
            C6.n.f1857D.f1868h.zzh(e7, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i5) {
        if (i5 <= 0) {
            String strD = N0.a.d(i5, "Invalid timeout for getting view signals. Timeout=", new StringBuilder(String.valueOf(i5).length() + 50));
            int i10 = L.f4523b;
            H6.l.c(strD);
            return "";
        }
        try {
            return (String) zzcfy.zza.zzc(new CallableC0255h0(this, 4)).get(Math.min(i5, this.f8450e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            int i11 = L.f4523b;
            H6.l.d("Exception getting view signals with timeout. ", e7);
            C6.n.f1857D.f1868h.zzh(e7, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e7 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlo)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcfy.zza.execute(new L7.b(4, this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i5;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("x");
            int i11 = jSONObject.getInt("y");
            int i12 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt("type");
            if (i13 != 0) {
                i5 = 1;
                if (i13 != 1) {
                    i5 = 2;
                    if (i13 != 2) {
                        i5 = 3;
                        if (i13 != 3) {
                            i5 = -1;
                        }
                    }
                }
            } else {
                i5 = 0;
            }
            try {
                this.f8448c.zzc(MotionEvent.obtain(0L, i12, i5, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e7) {
                e = e7;
                int i14 = L.f4523b;
                H6.l.d("Failed to parse the touch string. ", e);
                C6.n.f1857D.f1868h.zzh(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e10) {
                e = e10;
                int i142 = L.f4523b;
                H6.l.d("Failed to parse the touch string. ", e);
                C6.n.f1857D.f1868h.zzh(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e11) {
            e = e11;
        }
    }
}
