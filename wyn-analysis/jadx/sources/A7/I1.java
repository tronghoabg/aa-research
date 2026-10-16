package A7;

import android.net.Uri;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class I1 extends H1 {
    public static String i0(E e7) {
        Uri.Builder builder = new Uri.Builder();
        String strJ = e7.j();
        if (TextUtils.isEmpty(strJ)) {
            strJ = e7.d();
        }
        builder.scheme((String) AbstractC0304y.f1181f.a(null)).encodedAuthority((String) AbstractC0304y.f1183g.a(null)).path("config/app/" + strJ).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }

    public final M1 h0(String str) {
        E eC1;
        if (zzpu.zza()) {
            C0273n0 c0273n0 = (C0273n0) this.f421a;
            M1 m12 = null;
            if (c0273n0.f979g.o0(null, AbstractC0304y.f1222x0)) {
                b0();
                if (U1.h1(str)) {
                    zzj().f612n.c("sgtm feature flag enabled.");
                    E eC12 = f0().c1(str);
                    if (eC12 == null) {
                        return new M1(j0(str), 1);
                    }
                    String strG = eC12.g();
                    zzfr.zzd zzdVarU0 = g0().u0(str);
                    if (zzdVarU0 != null && (eC1 = f0().c1(str)) != null) {
                        if ((!zzdVarU0.zzq() || zzdVarU0.zzh().zza() != 100) && !b0().f1(str, eC1.l())) {
                            if (!c0273n0.f979g.o0(null, AbstractC0304y.f1226z0)) {
                            }
                        }
                        if (eC12.o()) {
                            zzj().f612n.c("sgtm upload enabled in manifest.");
                            zzfr.zzd zzdVarU02 = g0().u0(eC12.f());
                            if (zzdVarU02 != null && zzdVarU02.zzq()) {
                                String strZze = zzdVarU02.zzh().zze();
                                if (!TextUtils.isEmpty(strZze)) {
                                    String strZzd = zzdVarU02.zzh().zzd();
                                    zzj().f612n.b(strZze, "sgtm configured with upload_url, server_info", TextUtils.isEmpty(strZzd) ? "Y" : "N");
                                    if (TextUtils.isEmpty(strZzd)) {
                                        m12 = new M1(strZze, 3);
                                    } else {
                                        HashMap mapL = AbstractC1593a.l("x-sgtm-server-info", strZzd);
                                        if (!TextUtils.isEmpty(eC12.l())) {
                                            mapL.put("x-gtm-server-preview", eC12.l());
                                        }
                                        m12 = new M1(strZze, mapL, 3);
                                    }
                                }
                            }
                        }
                        if (m12 != null) {
                            return m12;
                        }
                    }
                    return new M1(j0(str), 1);
                }
            }
        }
        return new M1(j0(str), 1);
    }

    public final String j0(String str) {
        String strY0 = g0().y0(str);
        if (TextUtils.isEmpty(strY0)) {
            return (String) AbstractC0304y.f1210r.a(null);
        }
        Uri uri = Uri.parse((String) AbstractC0304y.f1210r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strY0 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
