package sb;

import A.C0230x;
import C6.n;
import G6.L;
import H6.l;
import N6.C0776a;
import N6.t;
import N6.u;
import N6.v;
import ba.C1521a;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblc;
import h9.c;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4033a extends Q6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45408a;

    /* renamed from: b, reason: collision with root package name */
    public String f45409b;

    /* renamed from: c, reason: collision with root package name */
    public Object f45410c;

    public /* synthetic */ C4033a(int i5) {
        this.f45408a = i5;
    }

    private final void a(String str) {
        L7.b bVar;
        C1521a c1521a = (C1521a) this.f45410c;
        ((c) c1521a.f19415c).f36227b = str;
        C0230x c0230x = (C0230x) c1521a.f19414b;
        synchronized (c0230x) {
            int i5 = c0230x.f187b - 1;
            c0230x.f187b = i5;
            if (i5 <= 0 && (bVar = (L7.b) c0230x.f188c) != null) {
                bVar.run();
            }
        }
    }

    private final void b(Q6.a aVar) {
        L7.b bVar;
        String str = aVar.f9884a.f2412a;
        C1521a c1521a = (C1521a) this.f45410c;
        ((c) c1521a.f19415c).f36226a.put(this.f45409b, str);
        C0230x c0230x = (C0230x) c1521a.f19414b;
        synchronized (c0230x) {
            int i5 = c0230x.f187b - 1;
            c0230x.f187b = i5;
            if (i5 <= 0 && (bVar = (L7.b) c0230x.f188c) != null) {
                bVar.run();
            }
        }
    }

    @Override // Q6.b
    public final void onFailure(String str) {
        L7.b bVar;
        int i5 = 0;
        switch (this.f45408a) {
            case 0:
                C1521a c1521a = (C1521a) this.f45410c;
                ((c) c1521a.f19415c).f36227b = str;
                C0230x c0230x = (C0230x) c1521a.f19414b;
                synchronized (c0230x) {
                    int i10 = c0230x.f187b - 1;
                    c0230x.f187b = i10;
                    if (i10 <= 0 && (bVar = (L7.b) c0230x.f188c) != null) {
                        bVar.run();
                    }
                }
                return;
            case 1:
                a(str);
                return;
            default:
                int i11 = L.f4523b;
                l.f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                boolean zBooleanValue = ((Boolean) zzblc.zzc.zze()).booleanValue();
                C0776a c0776a = (C0776a) this.f45410c;
                String strConcat = zBooleanValue ? ",\"as\":".concat(c0776a.k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                zzbkh zzbkhVar = zzblc.zze;
                String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f45409b, str, Long.valueOf(((Boolean) zzbkhVar.zze()).booleanValue() ? ((Long) zzblc.zzh.zze()).longValue() : 0L), strConcat);
                if (((Boolean) zzbkhVar.zze()).booleanValue()) {
                    try {
                        c0776a.f8453h.execute(new t(this, str2, i5));
                    } catch (RuntimeException e7) {
                        n.f1857D.f1868h.zzi(e7, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
                    }
                } else {
                    c0776a.f8447b.evaluateJavascript(str2, null);
                }
                if (((Boolean) zzblc.zzc.zze()).booleanValue() && ((Boolean) zzblc.zzd.zze()).booleanValue()) {
                    v vVar = c0776a.f8456l;
                    vVar.getClass();
                    vVar.f8552b.execute(new u(vVar, i5));
                    return;
                }
                return;
        }
    }

    @Override // Q6.b
    public final void onSuccess(Q6.a aVar) throws JSONException {
        L7.b bVar;
        String str;
        int i5 = 0;
        int i10 = 1;
        switch (this.f45408a) {
            case 0:
                String str2 = aVar.f9884a.f2412a;
                C1521a c1521a = (C1521a) this.f45410c;
                ((c) c1521a.f19415c).f36226a.put(this.f45409b, str2);
                C0230x c0230x = (C0230x) c1521a.f19414b;
                synchronized (c0230x) {
                    int i11 = c0230x.f187b - 1;
                    c0230x.f187b = i11;
                    if (i11 <= 0 && (bVar = (L7.b) c0230x.f188c) != null) {
                        bVar.run();
                    }
                }
                return;
            case 1:
                b(aVar);
                return;
            default:
                String str3 = this.f45409b;
                C0776a c0776a = (C0776a) this.f45410c;
                String str4 = aVar.f9884a.f2412a;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str3);
                    if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
                        jSONObject.put("as", c0776a.k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) zzblc.zze.zze()).booleanValue() ? ((Long) zzblc.zzh.zze()).longValue() : 0L);
                    jSONObject.put("signal", str4);
                    str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str3, aVar.f9884a.f2412a, Long.valueOf(((Boolean) zzblc.zze.zze()).booleanValue() ? ((Long) zzblc.zzh.zze()).longValue() : 0L), ((Boolean) zzblc.zzc.zze()).booleanValue() ? ",\"as\":".concat(c0776a.k.b().toString()) : "");
                }
                if (((Boolean) zzblc.zze.zze()).booleanValue()) {
                    try {
                        c0776a.f8453h.execute(new t(this, str, i10));
                    } catch (RuntimeException e7) {
                        n.f1857D.f1868h.zzi(e7, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
                    }
                } else {
                    c0776a.f8447b.evaluateJavascript(str, null);
                }
                if (((Boolean) zzblc.zzc.zze()).booleanValue() && ((Boolean) zzblc.zzd.zze()).booleanValue()) {
                    v vVar = c0776a.f8456l;
                    vVar.getClass();
                    vVar.f8552b.execute(new u(vVar, i5));
                    return;
                }
                return;
        }
    }

    public C4033a(C0776a c0776a, String str) {
        this.f45408a = 2;
        this.f45409b = str;
        this.f45410c = c0776a;
    }
}
