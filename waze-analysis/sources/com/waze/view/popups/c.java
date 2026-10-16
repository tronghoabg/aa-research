package com.waze.view.popups;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f45293a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45294b;

    public /* synthetic */ c(d dVar, int i2) {
        this.f45294b = i2;
        this.f45293a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f45294b;
        d dVar = this.f45293a;
        if (i2 != 0) {
            NativeManager.getInstance().sendThumbsDown(dVar.f45313b.getId());
        } else {
            NativeManager.getInstance().sendThumbsUp(dVar.f45313b.getId());
        }
    }
}
