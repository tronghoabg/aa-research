package N6;

import D6.C0395s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzgxd;
import com.moloco.sdk.internal.publisher.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3773c;
import x3.AbstractC4467j;
import y3.AbstractC4557o;

/* renamed from: N6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0777b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8457a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f8458b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8459c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.a f8460d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f8461e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f8462f = new AtomicBoolean(false);

    public C0777b(Context context, List list, H6.a aVar) {
        this.f8457a = context;
        this.f8458b = context.getApplicationInfo();
        this.f8459c = list;
        this.f8460d = aVar;
    }

    public final void a(WebView webView) throws JSONException {
        ApplicationInfo applicationInfo = this.f8458b;
        if (this.f8462f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = null;
        if (applicationInfo != null) {
            try {
                packageInfoC = C3773c.a(this.f8457a).c(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f8461e;
        if (packageInfoC != null) {
            try {
                jSONObject.put("vc", packageInfoC.versionCode);
                jSONObject.put("vnm", packageInfoC.versionName);
            } catch (JSONException e7) {
                C6.n.f1857D.f1868h.zzh(e7, "PawAppSignalGenerator.initialize");
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        List list = this.f8459c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) C0395s.f2489e.f2492c.zzd(zzbix.zzlu)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        jSONObject.put("js", this.f8460d.f4927a);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzblc.zzb.zze()).booleanValue() && H.b0("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) C0395s.f2489e.f2492c.zzd(zzbix.zzlt), b());
            zzgxd zzgxdVarZzi = zzgxd.zzi("*");
            boolean z2 = AbstractC4467j.f47677a;
            if (!AbstractC4557o.f48013h.b()) {
                throw AbstractC4557o.a();
            }
        }
    }

    public final JSONObject b() throws JSONException {
        if (!this.f8462f.get()) {
            a(null);
        }
        return this.f8461e;
    }
}
