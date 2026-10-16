package com.bytedance.sdk.component.uef;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.uef.ivm;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes.dex */
public abstract class uef {
    protected String lw;

    /* renamed from: oa, reason: collision with root package name */
    protected dj f25091oa;
    protected Context uef;
    ivm xs;
    protected xs yo;
    protected Handler moa = new Handler(Looper.getMainLooper());
    protected volatile boolean ivm = false;
    private final Map<String, ivm> bcc = new HashMap();

    public void invokeMethod(final String str) {
        if (this.ivm) {
            return;
        }
        this.moa.post(new Runnable() { // from class: com.bytedance.sdk.component.uef.uef.1
            @Override // java.lang.Runnable
            public void run() {
                dz dzVarUef;
                if (uef.this.ivm) {
                    return;
                }
                try {
                    dzVarUef = uef.this.uef(new JSONObject(str));
                } catch (Exception unused) {
                    dzVarUef = null;
                }
                if (!dz.uef(dzVarUef)) {
                    uef.this.uef(dzVarUef);
                    return;
                }
                Objects.toString(dzVarUef);
                if (dzVarUef != null) {
                    uef.this.oa(oib.uef(new ab(dzVarUef.uef, "Failed to parse invocation.")), dzVarUef);
                }
            }
        });
    }

    public void oa() {
        this.xs.uef();
        Iterator<ivm> it = this.bcc.values().iterator();
        while (it.hasNext()) {
            it.next().uef();
        }
        this.moa.removeCallbacksAndMessages(null);
        this.ivm = true;
    }

    public abstract void oa(cz czVar);

    public abstract Context uef(cz czVar);

    public abstract String uef();

    public abstract void uef(String str);

    public final void yo(cz czVar) {
        this.uef = uef(czVar);
        this.yo = czVar.moa;
        this.f25091oa = czVar.bcc;
        this.xs = new ivm(czVar, this);
        this.lw = czVar.zjm;
        oa(czVar);
    }

    public void uef(String str, dz dzVar) {
        uef(str);
    }

    public final void uef(dz dzVar) {
        String strUef;
        if (this.ivm || (strUef = uef()) == null) {
            return;
        }
        ivm ivmVarOa = oa(dzVar.xs);
        if (ivmVarOa == null) {
            dzVar.toString();
            if (this.f25091oa != null) {
                uef();
            }
            oa(oib.uef(new ab(-4, b.c(new StringBuilder("Namespace "), dzVar.xs, " unknown."))), dzVar);
            return;
        }
        lw lwVar = new lw();
        lwVar.f25089oa = strUef;
        lwVar.uef = this.uef;
        lwVar.yo = ivmVarOa;
        try {
            ivm.uef uefVarUef = ivmVarOa.uef(dzVar, lwVar);
            if (uefVarUef == null) {
                dzVar.toString();
                if (this.f25091oa != null) {
                    uef();
                }
                oa(oib.uef(new ab(-2, "Function " + dzVar.moa + " is not registered.")), dzVar);
                return;
            }
            if (uefVarUef.uef) {
                oa(uefVarUef.f25088oa, dzVar);
            }
            if (this.f25091oa != null) {
                uef();
            }
        } catch (Exception e7) {
            dzVar.toString();
            oa(oib.uef(e7), dzVar);
        }
    }

    public final void oa(String str, dz dzVar) {
        JSONObject jSONObject;
        if (this.ivm || TextUtils.isEmpty(dzVar.ivm)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            bcc.uef(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        uef(cq.uef().uef("__msg_type", "callback").uef("__callback_id", dzVar.ivm).uef("__params", jSONObject).oa(), dzVar);
    }

    private ivm oa(String str) {
        if (!TextUtils.equals(str, this.lw) && !TextUtils.isEmpty(str)) {
            return this.bcc.get(str);
        }
        return this.xs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dz uef(JSONObject jSONObject) throws JSONException {
        String strOptString;
        if (this.ivm) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (uef() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return dz.uef().uef(string2).oa(string).yo(strOptString3).moa(strOptString).lw(strOptString2).ivm(strOptString4).xs(jSONObject.optString("__iframe_url")).uef();
        } catch (JSONException unused2) {
            return dz.uef(strOptString2, -1);
        }
    }
}
