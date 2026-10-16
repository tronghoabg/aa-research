package com.waze.push;

import android.text.TextUtils;
import com.waze.NativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements h {
    @Override // com.waze.push.h
    public final String a() {
        return "OnlineActionPushMessageHandler";
    }

    @Override // com.waze.push.h
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        x.f(gVar, "pushMessage");
        return !TextUtils.isEmpty(gVar.h());
    }

    @Override // com.waze.push.h
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        g gVar = (g) obj;
        x.f(gVar, "pushMessage");
        if (!NativeManager.isAppStarted()) {
            return false;
        }
        NativeManager.getInstance().UrlHandlerImmediate(gVar.h());
        return false;
    }
}
