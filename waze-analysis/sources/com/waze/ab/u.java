package com.waze.ab;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f13822a;

    public u(NativeManager nativeManager) {
        h.g.b.x.f(nativeManager, "nativeManager");
        this.f13822a = nativeManager;
    }

    @Override // com.waze.ab.t
    public final String a(String str) {
        if (str != null) {
            return com.waze.resources.a.e(this.f13822a.getEncImagePath(str));
        }
        return null;
    }
}
