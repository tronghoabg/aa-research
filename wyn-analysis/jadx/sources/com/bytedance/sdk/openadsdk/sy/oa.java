package com.bytedance.sdk.openadsdk.sy;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.bcc.uef.ivm;
import java.util.List;

/* loaded from: classes3.dex */
public interface oa {
    Context getContext();

    ivm getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i5);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.sy.oa.uef> list);
}
