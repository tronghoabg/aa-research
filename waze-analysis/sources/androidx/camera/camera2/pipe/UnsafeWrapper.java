package androidx.camera.camera2.pipe;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UnsafeWrapper extends androidx.camera.common.UnsafeWrapper {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.UnsafeWrapper$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$unwrapAs(UnsafeWrapper unsafeWrapper, c cVar) {
            x.f(cVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            return unsafeWrapper.unwrapAs(o.w(cVar));
        }
    }

    <T> T unwrapAs(c<T> cVar);

    @Override // androidx.camera.common.UnsafeWrapper
    <T> T unwrapAs(Class<T> cls);
}
