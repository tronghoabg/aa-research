package G6;

import D6.C0395s;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: G6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0539c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0546j f4586b;

    public /* synthetic */ RunnableC0539c(C0546j c0546j, int i5) {
        this.f4585a = i5;
        this.f4586b = c0546j;
    }

    private final void a() {
        C0546j c0546j = this.f4586b;
        c0546j.getClass();
        C0549m c0549m = C6.n.f1857D.f1874o;
        String str = c0546j.f4604d;
        String str2 = c0546j.f4605e;
        String str3 = c0546j.f4606f;
        boolean zH = c0549m.h();
        Context context = c0546j.f4601a;
        boolean zB = c0549m.b(context, str, str2);
        synchronized (c0549m.f4623f) {
            c0549m.f4621d = zB;
        }
        if (!c0549m.h()) {
            c0549m.c(context, str, str2);
            return;
        }
        if (!zH && !TextUtils.isEmpty(str3)) {
            c0549m.e(context, str2, str3, str);
        }
        int i5 = L.f4523b;
        H6.l.a("Device is linked for debug signals.");
        c0549m.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4585a) {
            case 0:
                C0546j c0546j = this.f4586b;
                c0546j.d(c0546j.f4601a);
                return;
            case 1:
                C0546j c0546j2 = this.f4586b;
                c0546j2.getClass();
                C6.n nVar = C6.n.f1857D;
                C0549m c0549m = nVar.f1874o;
                Context context = c0546j2.f4601a;
                String str = c0546j2.f4604d;
                String str2 = c0546j2.f4605e;
                c0549m.getClass();
                zzbio zzbioVar = zzbix.zzgc;
                C0395s c0395s = C0395s.f2489e;
                String strJ = C0549m.j(context, c0549m.k(context, (String) c0395s.f2492c.zzd(zzbioVar), str, str2).toString(), str2);
                if (TextUtils.isEmpty(strJ)) {
                    int i5 = L.f4523b;
                    H6.l.a("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ.trim());
                        String strOptString = jSONObject.optString("gct");
                        c0549m.f4620c = jSONObject.optString("status");
                        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
                            String str3 = c0549m.f4620c;
                            boolean z2 = "0".equals(str3) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str3);
                            c0549m.f(z2);
                            ((O) nVar.f1868h.zzp()).h(!z2 ? "" : str);
                        }
                        synchronized (c0549m.f4623f) {
                            c0549m.f4619b = strOptString;
                        }
                        String str4 = c0549m.f4620c;
                        if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str4)) {
                            int i10 = L.f4523b;
                            H6.l.a("Creative is not pushed for this device.");
                            c0549m.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str4)) {
                            int i11 = L.f4523b;
                            H6.l.a("The app is not linked for creative preview.");
                            c0549m.c(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(str4)) {
                                int i12 = L.f4523b;
                                H6.l.a("Device is linked for in app preview.");
                                c0549m.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e7) {
                        int i13 = L.f4523b;
                        H6.l.g("Fail to get in app preview response json.", e7);
                    }
                }
                c0549m.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                a();
                return;
            case 3:
                C0546j c0546j3 = this.f4586b;
                c0546j3.d(c0546j3.f4601a);
                return;
            case 4:
                C0546j c0546j4 = this.f4586b;
                c0546j4.getClass();
                C6.n.f1857D.f1874o.a(c0546j4.f4601a);
                return;
            case 5:
                C0546j c0546j5 = this.f4586b;
                c0546j5.getClass();
                C6.n.f1857D.f1874o.a(c0546j5.f4601a);
                return;
            default:
                C0546j c0546j6 = this.f4586b;
                c0546j6.f4607g = 4;
                c0546j6.b();
                return;
        }
    }
}
