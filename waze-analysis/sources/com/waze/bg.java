package com.waze;

import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bf f16300a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bh f16301b;

    bg(bf bfVar, bh bhVar) {
        this.f16300a = bfVar;
        this.f16301b = bhVar;
    }

    public final void a() {
        this.f16300a.unsetUpdateHandler(DriveToNativeManager.UH_DANGER_ZONE_FOUND, this.f16301b);
    }
}
