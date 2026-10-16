package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.bcc.uef.ivm;
import com.bytedance.sdk.openadsdk.sy.oa;
import com.bytedance.sdk.openadsdk.sy.oa.uef;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
public class BusMonitorDependWrapper implements oa {

    /* renamed from: oa, reason: collision with root package name */
    private ivm f25132oa;
    private oa uef;

    public BusMonitorDependWrapper(oa oaVar) {
        this.uef = oaVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public Context getContext() {
        oa oaVar = this.uef;
        return (oaVar == null || oaVar.getContext() == null) ? getReflectContext() : this.uef.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public ivm getHandler() {
        oa oaVar = this.uef;
        if (oaVar != null && oaVar.getHandler() != null) {
            return this.uef.getHandler();
        }
        if (this.f25132oa == null) {
            this.f25132oa = new ivm(new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper())) { // from class: com.bytedance.sdk.openadsdk.BusMonitorDependWrapper.1
                @Override // com.bytedance.sdk.component.bcc.uef.ivm
                public boolean uef() {
                    return false;
                }
            };
        }
        return this.f25132oa;
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public int getOnceLogCount() {
        oa oaVar = this.uef;
        if (oaVar != null) {
            return oaVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public int getOnceLogInterval() {
        oa oaVar = this.uef;
        if (oaVar != null) {
            return oaVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public HandlerThread getSafeHandlerThread(String str, int i5) {
        HandlerThread safeHandlerThread;
        oa oaVar = this.uef;
        if (oaVar != null && (safeHandlerThread = oaVar.getSafeHandlerThread(str, i5)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        oa oaVar = this.uef;
        if (oaVar == null || (uploadIntervalTime = oaVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public boolean isMonitorOpen() {
        oa oaVar = this.uef;
        if (oaVar != null) {
            return oaVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.sy.oa
    public void onMonitorUpload(List<uef> list) {
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.onMonitorUpload(list);
        }
    }
}
