package com.bytedance.sdk.component.xs.oa;

import android.text.TextUtils;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.wrv;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class yo {
    protected com.bytedance.sdk.openadsdk.sy.moa cz;
    int ivm;
    String lw;

    /* renamed from: oa, reason: collision with root package name */
    private List<String> f25112oa;
    protected dj yo;
    protected String moa = null;
    protected final Map<String, String> xs = new HashMap();
    protected String bcc = null;
    private String uef = null;
    private long dj = 30000;
    protected boolean zjm = false;

    public yo(dj djVar) {
        this.yo = djVar;
        try {
            moa(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void bcc() {
        if (this.cz == null) {
            return;
        }
        try {
            dj djVar = this.yo;
            if (djVar == null || djVar.uef() == null) {
                return;
            }
            this.yo.uef().oa(this.cz);
        } catch (Throwable unused) {
        }
    }

    public void cz() {
        if (this.cz == null) {
            return;
        }
        try {
            dj djVar = this.yo;
            if (djVar == null || djVar.uef() == null) {
                return;
            }
            this.yo.uef().yo(this.cz);
        } catch (Throwable unused) {
        }
    }

    public String ivm() {
        return this.bcc;
    }

    public final com.bytedance.sdk.component.xs.oa lw() {
        com.bytedance.sdk.component.xs.oa oaVarUef;
        xs();
        try {
            oaVarUef = uef();
            if (oaVarUef != null) {
                try {
                    if (oaVarUef.ivm()) {
                        bcc();
                        return oaVarUef;
                    }
                } catch (Throwable unused) {
                    cz();
                    return oaVarUef;
                }
            }
            cz();
            return oaVarUef;
        } catch (Throwable unused2) {
            oaVarUef = null;
        }
    }

    public void moa(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.xs.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void oa(String str) {
        this.lw = str;
    }

    public abstract com.bytedance.sdk.component.xs.oa uef();

    public abstract void uef(com.bytedance.sdk.component.xs.uef.uef uefVar);

    public void uef(com.bytedance.sdk.openadsdk.sy.moa moaVar) {
        this.cz = moaVar;
    }

    public void xs() {
        if (this.cz == null) {
            return;
        }
        try {
            dj djVar = this.yo;
            if (djVar == null || djVar.uef() == null) {
                return;
            }
            this.yo.uef().uef(this.cz);
        } catch (Throwable unused) {
        }
    }

    public String yo() {
        return this.uef;
    }

    public void oa(String str, String str2) {
        this.xs.put(str, str2);
    }

    public void uef(List<String> list) {
        this.f25112oa = list;
    }

    public void yo(String str) {
        this.bcc = str;
    }

    public void moa(String str) {
        this.moa = str;
    }

    public void oa() {
        dj djVar;
        if (this.moa == null || (djVar = this.yo) == null) {
            return;
        }
        com.bytedance.sdk.component.oa.uef.moa moaVarOa = djVar.oa();
        synchronized (moaVarOa) {
            try {
                for (com.bytedance.sdk.component.oa.uef.oa oaVar : moaVarOa.yo()) {
                    if (this.moa.equals(oaVar.uef().yo())) {
                        oaVar.yo();
                    }
                }
                for (com.bytedance.sdk.component.oa.uef.oa oaVar2 : moaVarOa.moa()) {
                    if (this.moa.equals(oaVar2.uef().yo())) {
                        oaVar2.yo();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void uef(long j8, TimeUnit timeUnit) {
        this.dj = timeUnit.toMillis(j8);
    }

    public String moa() {
        return this.moa;
    }

    public void uef(wrv.uef uefVar) {
        if (com.bytedance.sdk.component.xs.uef.ivm()) {
            List<String> list = this.f25112oa;
            if (list != null && !list.isEmpty()) {
                uefVar.uef(this.f25112oa);
            }
            uefVar.uef(this.dj);
        }
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void uef(int i5) {
        this.ivm = i5;
    }

    public final void oa(final com.bytedance.sdk.component.xs.uef.uef uefVar) {
        xs();
        uef(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.component.xs.oa.yo.1
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                if (oaVar == null || !oaVar.ivm()) {
                    yo.this.cz();
                } else {
                    yo.this.bcc();
                }
                com.bytedance.sdk.component.xs.uef.uef uefVar2 = uefVar;
                if (uefVar2 != null) {
                    uefVar2.uef(yoVar, oaVar);
                }
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(yo yoVar, IOException iOException) {
                yo.this.cz();
                com.bytedance.sdk.component.xs.uef.uef uefVar2 = uefVar;
                if (uefVar2 != null) {
                    uefVar2.uef(yoVar, iOException);
                }
            }
        });
    }

    public void oa(wrv.uef uefVar) {
        if (uefVar != null && this.xs.size() > 0) {
            for (Map.Entry<String, String> entry : this.xs.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    uefVar.oa(key, value);
                }
            }
        }
    }
}
