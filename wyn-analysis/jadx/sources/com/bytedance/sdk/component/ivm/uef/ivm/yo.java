package com.bytedance.sdk.component.ivm.uef.ivm;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.ivm.uef.xs;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yo implements oa {

    /* renamed from: oa, reason: collision with root package name */
    private final lw f24985oa;
    private final Context uef;

    public class uef extends com.bytedance.sdk.component.ivm.uef.lw.lw {
        private final Map<String, String> moa;

        /* renamed from: oa, reason: collision with root package name */
        private final moa f24988oa;
        private final String yo;

        private String yo(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.yo)) ? str.replace("{UID}", this.yo).replace("__UID__", this.yo) : str;
        }

        public String oa(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(yo.yo().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.ivm.uef.lw.moa moaVarUef;
            com.bytedance.sdk.component.ivm.uef.lw lwVarWk = xs.ivm().wk();
            if (lwVarWk == null || xs.ivm().lw() == null || !lwVarWk.yo() || !uef(this.f24988oa.oa())) {
                return;
            }
            if (this.f24988oa.moa() >= lwVarWk.yo(this.f24988oa.ivm())) {
                yo.this.f24985oa.yo(this.f24988oa);
                return;
            }
            try {
                if (this.f24988oa.dj()) {
                    yo.this.f24985oa.uef(this.f24988oa);
                }
                if (lwVarWk.uef(yo.this.uef())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strOa = this.f24988oa.oa();
                    if (lwVarWk.ivm() == 0) {
                        strOa = yo(this.f24988oa.oa());
                        if (this.f24988oa.yo()) {
                            strOa = oa(strOa);
                        }
                    }
                    com.bytedance.sdk.component.ivm.uef.lw.yo yoVarZjm = lwVarWk.zjm();
                    if (yoVarZjm == null) {
                        return;
                    }
                    yoVarZjm.uef("User-Agent", lwVarWk.cz());
                    yoVarZjm.uef("csj_client_source_from", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (this.moa != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.moa.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        yoVarZjm.uef("csj_extra_info", jSONObject.toString());
                    }
                    yoVarZjm.uef(strOa);
                    try {
                        moaVarUef = yoVarZjm.uef();
                        try {
                            moaVarUef.uef();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        moaVarUef = null;
                    }
                    moa moaVar = this.f24988oa;
                    moaVar.uef(moaVar.moa() + 1);
                    if (moaVarUef != null && moaVarUef.uef()) {
                        yo.this.f24985oa.yo(this.f24988oa);
                        this.f24988oa.oa();
                        lwVarWk.uef(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.f24988oa);
                        return;
                    }
                    if (moaVarUef != null) {
                        this.f24988oa.oa(moaVarUef.oa());
                        this.f24988oa.yo(moaVarUef.yo());
                    }
                    if (moaVarUef == null || moaVarUef.oa() != 8848) {
                        this.f24988oa.oa();
                        if (this.f24988oa.moa() >= lwVarWk.yo(this.f24988oa.ivm())) {
                            yo.this.f24985oa.yo(this.f24988oa);
                            this.f24988oa.oa();
                        } else {
                            yo.this.f24985oa.oa(this.f24988oa);
                        }
                    } else {
                        moaVarUef.yo();
                        yo.this.f24985oa.yo(this.f24988oa);
                    }
                    lwVarWk.uef(false, this.f24988oa.bcc(), System.currentTimeMillis() - jCurrentTimeMillis, this.f24988oa);
                }
            } catch (Throwable unused3) {
            }
        }

        public boolean uef(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        private uef(moa moaVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.f24988oa = moaVar;
            this.yo = str;
            this.moa = map;
        }
    }

    public yo(Context context, lw lwVar) {
        this.uef = context;
        this.f24985oa = lwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random yo() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context uef() {
        Context context = this.uef;
        return context == null ? xs.ivm().lw() : context;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.oa
    public void uef(String str, List<String> list, boolean z2, Map<String, String> map, int i5, String str2) {
        com.bytedance.sdk.component.ivm.uef.lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || xs.ivm().lw() == null || lwVarWk.moa() == null || !lwVarWk.yo() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            lwVarWk.moa().execute(new uef(new moa(UUID.randomUUID().toString() + Constants.USER_ID_SEPARATOR + System.currentTimeMillis(), it.next(), z2, i5, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.oa
    public Runnable uef(final moa moaVar, final String str, final Map<String, String> map) {
        if (moaVar == null || TextUtils.isEmpty(moaVar.uef())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.ivm.uef.ivm.yo.1
            @Override // java.lang.Runnable
            public void run() {
                if (yo.this.f24985oa.uef(moaVar.uef()) != null) {
                    new uef(moaVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.oa
    public void uef(final String str, final boolean z2) {
        com.bytedance.sdk.component.ivm.uef.lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || xs.ivm().lw() == null || !lwVarWk.yo()) {
            return;
        }
        com.bytedance.sdk.component.ivm.uef.lw.lw lwVar = new com.bytedance.sdk.component.ivm.uef.lw.lw("trackFailedUrls") { // from class: com.bytedance.sdk.component.ivm.uef.ivm.yo.2
            @Override // java.lang.Runnable
            public void run() {
                yo.this.uef(yo.this.f24985oa.uef(), str, z2);
            }
        };
        lwVar.uef(1);
        if (lwVarWk.moa() != null) {
            lwVarWk.moa().execute(lwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(List<moa> list, String str, boolean z2) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.ivm.uef.lw lwVarWk = xs.ivm().wk();
        for (moa moaVar : list) {
            if (lwVarWk == null || lwVarWk.moa() == null) {
                str2 = str;
            } else {
                moaVar.uef(z2);
                str2 = str;
                lwVarWk.moa().execute(new uef(moaVar, str2, null));
            }
            str = str2;
        }
    }
}
