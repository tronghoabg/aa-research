package androidx.camera.viewfinder.core.impl;

import h.ab;
import h.g.a.a;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class PixelCopyCompat$PixelCopyApi24Impl$withHandlerScope$3 extends u implements a<ab> {
    PixelCopyCompat$PixelCopyApi24Impl$withHandlerScope$3(Object obj) {
        super(0, obj, RefCounted.class, "release", "release()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RefCounted) this.receiver).release();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
