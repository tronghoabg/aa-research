package com.waze.navigate;

import com.waze.jni.protos.navigate.DriveTo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f31022a;

    aw(kotlinx.coroutines.k kVar) {
        this.f31022a = kVar;
    }

    @Override // com.waze.jni.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        kotlinx.coroutines.k kVar = this.f31022a;
        DriveTo.DangerZoneType dangerZoneType = (DriveTo.DangerZoneType) obj;
        if (kVar.g()) {
            kVar.resumeWith(dangerZoneType);
        }
    }
}
