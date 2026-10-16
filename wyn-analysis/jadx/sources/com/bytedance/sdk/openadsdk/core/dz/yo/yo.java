package com.bytedance.sdk.openadsdk.core.dz.yo;

import A7.AbstractC0279p0;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class yo {
    private static boolean moa = false;
    private static SimpleDateFormat uef;

    /* renamed from: oa, reason: collision with root package name */
    private final List<String> f25610oa;
    private final Map<oa, String> yo;

    public yo(List<String> list, gzw gzwVar) {
        int iDqw;
        this.f25610oa = list;
        HashMap map = new HashMap();
        this.yo = map;
        map.put(oa.CACHEBUSTING, yo());
        map.put(oa.TIMESTAMP, oa());
        map.put(oa.APPBUNDLE, sy.uef().getPackageName());
        oa oaVar = oa.PLAYERSTATE;
        map.put(oaVar, "");
        if (gzwVar != null && ((iDqw = gzwVar.dqw()) == 3 || iDqw == 7 || iDqw == 8)) {
            map.put(oaVar, "fullscreen");
        }
        map.put(oa.SERVERSIDE, "0");
    }

    private String oa() {
        if (uef == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                uef = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
            } else {
                uef = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault());
                moa = true;
            }
        }
        String str = uef.format(new Date());
        if (!moa) {
            return str;
        }
        int iGr = gb.gr();
        if (iGr < 0) {
            if (iGr > -10) {
                StringBuilder sbQ = AbstractC0279p0.q(str, "-0");
                sbQ.append(-iGr);
                return sbQ.toString();
            }
            return str + iGr;
        }
        if (iGr < 10) {
            return str + "+0" + iGr;
        }
        return str + "+" + iGr;
    }

    private String yo() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    public List<String> uef() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.f25610oa) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (oa oaVar : oa.values()) {
                    String str = this.yo.get(oaVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = oaVar == oa.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(oaVar.name(), str) : strReplaceAll.replaceAll("\\[" + oaVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public yo uef(com.bytedance.sdk.openadsdk.core.dz.uef.uef uefVar) {
        if (uefVar != null) {
            this.yo.put(oa.ERRORCODE, uefVar.uef());
        }
        return this;
    }

    public yo uef(long j8) {
        if (j8 >= 0) {
            String strOa = oa(j8);
            if (!TextUtils.isEmpty(strOa)) {
                this.yo.put(oa.CONTENTPLAYHEAD, strOa);
            }
        }
        return this;
    }

    public yo uef(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.yo.put(oa.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    public yo oa(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.yo.put(oa.ASSETURI, str);
        }
        return this;
    }

    private String oa(long j8) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j8)), Long.valueOf(timeUnit.toMinutes(j8) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j8) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j8 % 1000));
    }
}
