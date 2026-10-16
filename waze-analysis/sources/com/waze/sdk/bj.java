package com.waze.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.waze.FreeMapAppActivity;
import com.waze.NativeManager;
import com.waze.lm;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bj extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f35342a;

    bj(SdkService sdkService) {
        super(Looper.getMainLooper());
        this.f35342a = new WeakReference(sdkService);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strE;
        String string;
        Bundle data = message.getData();
        String string2 = data == null ? null : data.getString("token");
        com.waze.shared_infra.i.h.a("WazeSdk: Handling message...");
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        switch (message.what) {
            case 101:
                com.waze.shared_infra.i.h.a("WazeSdk: Received message: OPEN_WAZE");
                WeakReference weakReference = this.f35342a;
                if (weakReference.get() != null && (strE = bd.d().e(string2)) != null) {
                    Intent intent = new Intent((Context) weakReference.get(), (Class<?>) FreeMapAppActivity.class);
                    intent.putExtra("waze.sdkReferrerPackage", strE);
                    intent.putExtra("waze.sdkType", 2);
                    if (lm.d().c() == null) {
                        intent.addFlags(268435456);
                        ((SdkService) weakReference.get()).startActivity(intent);
                        break;
                    } else {
                        lm.d().c().startActivity(intent);
                        break;
                    }
                }
                break;
            case 102:
                boolean z = data.getBoolean("request");
                com.waze.shared_infra.i.h.a("WazeSdk: Received message: MSG_REQUEST_NAVIGATION_DATA, " + z);
                bd.d().H(string2, z);
                break;
            case 103:
                com.waze.shared_infra.i.h.a("WazeSdk: Received message: MSG_DISCONNECT_SDK");
                bd.d().y(string2);
                break;
            case 104:
                com.waze.shared_infra.i.h.a("WazeSdk: Received message: MSG_SHOW_ERROR_MESSAGE");
                String strF = bd.d().f();
                String strG = bd.d().g();
                if (this.f35342a.get() != null && strF != null && strG != null && data.containsKey("errorMessage") && (string = data.getString("errorMessage")) != null) {
                    NativeManager.getInstance().showSdkErrorMessagePopup(strF, string, strG, false);
                    break;
                }
                break;
            case 105:
                com.waze.shared_infra.i.h.a("WazeSdk: Received message: MSG_CANCEL_ERROR_MESSAGE");
                if (this.f35342a.get() != null) {
                    NativeManager.getInstance().cancelSdkErrorMessagePopup();
                    break;
                }
                break;
            case 106:
                String string3 = data.getString("statsEvent");
                if (string3 != null) {
                    com.waze.shared_infra.i.h.a("WazeSdk: Received message: MSG_SEND_STATS: ".concat(string3));
                    break;
                }
                break;
        }
    }
}
