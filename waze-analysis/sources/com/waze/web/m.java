package com.waze.web;

import com.waze.mywaze.MyWazeNativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements com.waze.sharedui.web.b {

    /* renamed from: a, reason: collision with root package name */
    private final MyWazeNativeManager f45509a;

    public m(MyWazeNativeManager myWazeNativeManager) {
        x.f(myWazeNativeManager, "myWazeNativeManager");
        this.f45509a = myWazeNativeManager;
    }

    @Override // com.waze.sharedui.web.b
    public final void a(String str, h.g.a.l lVar) {
        x.f(str, "url");
        x.f(lVar, "onResult");
        this.f45509a.isVerifiedUrl(str, new com.waze.uid.b(lVar, 6));
    }
}
