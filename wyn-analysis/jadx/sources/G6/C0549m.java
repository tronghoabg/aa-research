package G6;

import D6.C0395s;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzecy;
import com.google.android.gms.internal.ads.zzecz;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: G6.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0549m {

    /* renamed from: a, reason: collision with root package name */
    public String f4618a;

    /* renamed from: b, reason: collision with root package name */
    public String f4619b;

    /* renamed from: c, reason: collision with root package name */
    public String f4620c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4621d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4622e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4623f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4624g;

    public C0549m(int i5) {
        switch (i5) {
            case 1:
                this.f4622e = false;
                break;
            default:
                this.f4623f = new Object();
                this.f4618a = "";
                this.f4619b = "";
                this.f4621d = false;
                this.f4622e = false;
                this.f4620c = "";
                break;
        }
    }

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", C6.n.f1857D.f1863c.E(context, str2));
        C0558w c0558wA = new C0560y(context).a(0, str, map, null);
        try {
            return (String) c0558wA.get(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzgf)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            String strValueOf = String.valueOf(str);
            int i5 = L.f4523b;
            H6.l.d("Interrupted while retrieving a response from: ".concat(strValueOf), e7);
            c0558wA.cancel(true);
            return null;
        } catch (TimeoutException e10) {
            String strValueOf2 = String.valueOf(str);
            int i10 = L.f4523b;
            H6.l.d("Timeout while retrieving a response from: ".concat(strValueOf2), e10);
            c0558wA.cancel(true);
            return null;
        } catch (Exception e11) {
            String strValueOf3 = String.valueOf(str);
            int i11 = L.f4523b;
            H6.l.d("Error retrieving a response from: ".concat(strValueOf3), e11);
            return null;
        }
    }

    public void a(Context context) {
        zzecz zzeczVar;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkK)).booleanValue() || (zzeczVar = (zzecz) this.f4624g) == null) {
            return;
        }
        zzeczVar.zzo(new BinderC0547k(this, context), zzecy.DEBUG_MENU);
    }

    public boolean b(Context context, String str, String str2) {
        zzbio zzbioVar = zzbix.zzgd;
        C0395s c0395s = C0395s.f2489e;
        String strJ = j(context, k(context, (String) c0395s.f2492c.zzd(zzbioVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            int i5 = L.f4523b;
            H6.l.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
                N nZzp = C6.n.f1857D.f1868h.zzp();
                if (true != zEquals) {
                    str = "";
                }
                ((O) nZzp).h(str);
            }
            return zEquals;
        } catch (JSONException e7) {
            int i10 = L.f4523b;
            H6.l.g("Fail to get debug mode response json.", e7);
            return false;
        }
    }

    public void c(Context context, String str, String str2) {
        U u10 = C6.n.f1857D.f1863c;
        U.t(context, k(context, (String) C0395s.f2489e.f2492c.zzd(zzbix.zzgb), str, str2));
    }

    public boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        int i5 = L.f4523b;
        H6.l.a("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) C0395s.f2489e.f2492c.zzd(zzbix.zzge), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        U u10 = C6.n.f1857D.f1863c;
        new B(context, str, builderBuildUpon.build().toString(), null).zzb();
    }

    public void f(boolean z2) {
        synchronized (this.f4623f) {
            try {
                this.f4622e = z2;
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
                    ((O) C6.n.f1857D.f1868h.zzp()).g(z2);
                    zzecz zzeczVar = (zzecz) this.f4624g;
                    if (zzeczVar != null) {
                        zzeczVar.zzb(z2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g() {
        boolean z2;
        synchronized (this.f4623f) {
            z2 = this.f4622e;
        }
        return z2;
    }

    public boolean h() {
        boolean z2;
        synchronized (this.f4623f) {
            z2 = this.f4621d;
        }
        return z2;
    }

    public void i(Context context, String str, boolean z2, boolean z10) {
        if (context instanceof Activity) {
            U.f4562l.post(new RunnableC0548l(this, context, str, z2, z10));
        } else {
            int i5 = L.f4523b;
            H6.l.e("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003d, B:14:0x0045, B:16:0x0056, B:19:0x0068, B:11:0x0034, B:20:0x006f, B:21:0x0071), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri k(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.f4623f
            monitor-enter(r0)
            java.lang.String r1 = r5.f4618a     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6f
            C6.n r1 = C6.n.f1857D     // Catch: java.lang.Throwable -> L32
            G6.U r1 = r1.f1863c     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r4 = 1
            n7.AbstractC3598c.e(r1, r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            goto L3d
        L32:
            r6 = move-exception
            goto L86
        L34:
            java.lang.String r1 = "Error reading from internal storage."
            int r2 = G6.L.f4523b     // Catch: java.lang.Throwable -> L32
            H6.l.a(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = ""
        L3d:
            r5.f4618a = r2     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6f
            C6.n r1 = C6.n.f1857D     // Catch: java.lang.Throwable -> L32
            G6.U r1 = r1.f1863c     // Catch: java.lang.Throwable -> L32
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            r5.f4618a = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            r6.write(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            r6.close()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            goto L6f
        L67:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            int r2 = G6.L.f4523b     // Catch: java.lang.Throwable -> L32
            H6.l.d(r1, r6)     // Catch: java.lang.Throwable -> L32
        L6f:
            java.lang.String r6 = r5.f4618a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "linkedDeviceId"
            r7.appendQueryParameter(r0, r6)
            java.lang.String r6 = "adSlotPath"
            r7.appendQueryParameter(r6, r8)
            java.lang.String r6 = "afmaVersion"
            r7.appendQueryParameter(r6, r9)
            android.net.Uri r6 = r7.build()
            return r6
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.C0549m.k(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
