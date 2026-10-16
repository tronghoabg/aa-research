package com.waze.ab.a;

import com.waze.NativeManager;
import com.waze.iu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f13707a;

    public g(NativeManager nativeManager) {
        h.g.b.x.f(nativeManager, "nativeManager");
        this.f13707a = nativeManager;
    }

    @Override // com.waze.ab.a.f
    public final void a(String str) {
        h.g.b.x.f(str, "imagePath");
        iu.UploadProfileImage$default(this.f13707a, str, null, 2, null);
    }
}
