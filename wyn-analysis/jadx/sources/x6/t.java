package x6;

import D6.C0392q;
import D6.C0395s;
import D6.H0;
import D6.z1;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final H0 f47747a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f47748b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C4478i f47749c;

    public t(H0 h02) {
        this.f47747a = h02;
        if (h02 != null) {
            try {
                List<z1> listZzg = h02.zzg();
                if (listZzg != null) {
                    for (z1 z1Var : listZzg) {
                        C4478i c4478i = z1Var != null ? new C4478i(z1Var) : null;
                        if (c4478i != null) {
                            this.f47748b.add(c4478i);
                        }
                    }
                }
            } catch (RemoteException e7) {
                H6.l.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e7);
            }
        }
        H0 h03 = this.f47747a;
        if (h03 == null) {
            return;
        }
        try {
            z1 z1VarZzh = h03.zzh();
            if (z1VarZzh != null) {
                this.f47749c = new C4478i(z1VarZzh);
            }
        } catch (RemoteException e10) {
            H6.l.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    public final Bundle a() {
        try {
            H0 h02 = this.f47747a;
            if (h02 != null) {
                Bundle bundleZzi = h02.zzi();
                if (bundleZzi != null) {
                    if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzv)).booleanValue()) {
                        bundleZzi.keySet();
                        return bundleZzi;
                    }
                }
                return bundleZzi;
            }
        } catch (BadParcelableException | RemoteException | IllegalArgumentException e7) {
            H6.l.d("Could not forward getResponseExtras to ResponseInfo.", e7);
        }
        return new Bundle();
    }

    public final String b() {
        try {
            H0 h02 = this.f47747a;
            if (h02 != null) {
                return h02.zzf();
            }
            return null;
        } catch (RemoteException e7) {
            H6.l.d("Could not forward getResponseId to ResponseInfo.", e7);
            return null;
        }
    }

    public final JSONObject c() throws JSONException {
        H0 h02;
        JSONObject jSONObject = new JSONObject();
        String strB = b();
        if (strB == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strB);
        }
        try {
            h02 = this.f47747a;
        } catch (RemoteException e7) {
            H6.l.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e7);
        }
        String strZze = h02 != null ? h02.zze() : null;
        if (strZze == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strZze);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f47748b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C4478i) it.next()).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        C4478i c4478i = this.f47749c;
        if (c4478i != null) {
            jSONObject.put("Loaded Adapter Response", c4478i.a());
        }
        Bundle bundleA = a();
        if (bundleA != null) {
            jSONObject.put("Response Extras", C0392q.f2477g.f2478a.m(bundleA));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
