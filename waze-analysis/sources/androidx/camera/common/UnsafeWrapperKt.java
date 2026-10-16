package androidx.camera.common;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UnsafeWrapperKt {
    public static final /* synthetic */ <T> T unwrapAs(UnsafeWrapper unsafeWrapper) {
        x.f(unsafeWrapper, "<this>");
        x.i();
        return (T) unsafeWrapper.unwrapAs(Object.class);
    }
}
