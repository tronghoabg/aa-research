package A7;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.google.android.gms.internal.measurement.zzov;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import r4.C3920f;

/* renamed from: A7.g1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0253g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f871a;

    /* renamed from: b, reason: collision with root package name */
    public int f872b;

    /* renamed from: c, reason: collision with root package name */
    public Object f873c;

    /* renamed from: d, reason: collision with root package name */
    public Object f874d;

    /* renamed from: e, reason: collision with root package name */
    public Object f875e;

    public /* synthetic */ RunnableC0253g1(int i5) {
        this.f871a = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f871a) {
            case 0:
                C0273n0 c0273n0 = (C0273n0) ((A.e0) ((RunnableC0299w0) this.f873c).f1093b).f152b;
                N n10 = c0273n0.f981i;
                int i5 = this.f872b;
                IOException iOException = (IOException) this.f874d;
                if ((i5 != 200 && i5 != 204 && i5 != 304) || iOException != null) {
                    C0273n0.d(n10);
                    n10.f608i.b(Integer.valueOf(i5), "Network Request for Deferred Deep Link failed. response, exception", iOException);
                    break;
                } else {
                    Z z2 = c0273n0.f980h;
                    C0273n0.c(z2);
                    z2.f780u.c(true);
                    byte[] bArr = (byte[]) this.f875e;
                    if (bArr == null || bArr.length == 0) {
                        C0273n0.d(n10);
                        n10.f611m.c("Deferred Deep Link response empty.");
                        break;
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String strOptString = jSONObject.optString("deeplink", "");
                            if (!TextUtils.isEmpty(strOptString)) {
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                String strOptString4 = jSONObject.optString("gad_source", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                Bundle bundle = new Bundle();
                                boolean zZza = zzov.zza();
                                C0245e c0245e = c0273n0.f979g;
                                U1 u12 = c0273n0.f983l;
                                if (!zZza || !c0245e.o0(null, AbstractC0304y.f1154T0)) {
                                    C0273n0.c(u12);
                                    if (!u12.l1(strOptString)) {
                                        C0273n0.d(n10);
                                        n10.f608i.b(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                                        break;
                                    }
                                } else {
                                    C0273n0.c(u12);
                                    if (!u12.l1(strOptString)) {
                                        C0273n0.d(n10);
                                        n10.f608i.a(strOptString2, strOptString3, strOptString, "Deferred Deep Link validation failed. gclid, gbraid, deep link");
                                        break;
                                    } else {
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            bundle.putString("gbraid", strOptString3);
                                        }
                                        if (!TextUtils.isEmpty(strOptString4)) {
                                            bundle.putString("gad_source", strOptString4);
                                        }
                                    }
                                }
                                if (zzov.zza()) {
                                    c0245e.o0(null, AbstractC0304y.f1154T0);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                c0273n0.f987p.H0("auto", "_cmp", bundle);
                                C0273n0.c(u12);
                                if (!TextUtils.isEmpty(strOptString) && u12.N0(strOptString, dOptDouble)) {
                                    ((C0273n0) u12.f421a).f973a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    break;
                                }
                            } else {
                                C0273n0.d(n10);
                                n10.f611m.c("Deferred Deep Link is empty.");
                                break;
                            }
                        } catch (JSONException e7) {
                            C0273n0.d(n10);
                            n10.f605f.d("Failed to parse the Deferred Deep Link response. exception", e7);
                            return;
                        }
                    }
                }
                break;
            case 1:
                S3.l lVar = (S3.l) this.f873c;
                InterfaceC0306y1 interfaceC0306y1 = (InterfaceC0306y1) ((Service) lVar.f10967a);
                int i10 = this.f872b;
                if (interfaceC0306y1.zza(i10)) {
                    ((N) this.f874d).f612n.d("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
                    lVar.u().f612n.c("Completed wakeful intent.");
                    interfaceC0306y1.a((Intent) this.f875e);
                    break;
                }
                break;
            default:
                FFmpegKitConfig.i((C3920f) this.f873c, this.f872b);
                ((com.google.android.gms.ads.nativead.l) this.f874d).l((tc.g) this.f875e, null);
                break;
        }
    }

    public RunnableC0253g1(C3920f c3920f, int i5, com.google.android.gms.ads.nativead.l lVar, tc.g gVar) {
        this.f871a = 2;
        this.f873c = c3920f;
        this.f872b = i5;
        this.f874d = lVar;
        this.f875e = gVar;
    }
}
