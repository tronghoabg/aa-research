package com.bytedance.sdk.openadsdk.gzw;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class xs implements ivm {

    /* renamed from: oa, reason: collision with root package name */
    private ivm f25923oa;
    Handler uef = null;

    public xs(ivm ivmVar) {
        this.f25923oa = ivmVar;
    }

    private Context cz() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public boolean bcc() {
        ivm ivmVar = this.f25923oa;
        if (ivmVar != null) {
            return ivmVar.bcc();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public JSONObject ivm() {
        ivm ivmVar = this.f25923oa;
        if (ivmVar != null) {
            return ivmVar.ivm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public String lw() {
        ivm ivmVar = this.f25923oa;
        if (ivmVar != null) {
            return ivmVar.lw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public Handler moa() {
        ivm ivmVar = this.f25923oa;
        if (ivmVar != null && ivmVar.xs() != null) {
            return this.f25923oa.moa();
        }
        Handler handler = new Handler(uef("pag_strategy", -1).getLooper());
        this.uef = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public Context oa() {
        ivm ivmVar = this.f25923oa;
        return (ivmVar == null || ivmVar.oa() == null) ? cz() : this.f25923oa.oa();
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public ExecutorService uef() {
        ivm ivmVar = this.f25923oa;
        return (ivmVar == null || ivmVar.uef() == null) ? Executors.newCachedThreadPool() : this.f25923oa.uef();
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public Map<String, String> xs() {
        ivm ivmVar = this.f25923oa;
        return (ivmVar == null || ivmVar.xs() == null) ? new HashMap() : this.f25923oa.xs();
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public String yo() {
        ivm ivmVar = this.f25923oa;
        return (ivmVar == null || TextUtils.isEmpty(ivmVar.yo())) ? "null" : this.f25923oa.yo();
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public JSONObject uef(JSONObject jSONObject) {
        ivm ivmVar = this.f25923oa;
        return ivmVar != null ? ivmVar.uef(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.gzw.ivm
    public HandlerThread uef(String str, int i5) {
        HandlerThread handlerThreadUef;
        ivm ivmVar = this.f25923oa;
        if (ivmVar != null && (handlerThreadUef = ivmVar.uef(str, i5)) != null) {
            return handlerThreadUef;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
