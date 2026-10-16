package androidx.camera.viewfinder.core.impl;

import android.util.Log;
import h.ab;
import h.e.b;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.Arrays;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RefCounted<T> {
    private static final String TAG = "RefCounted";
    private final boolean debugRefCounts;
    private final l<T, ab> onRelease;
    private final d<k<T, Integer>> refCounted;
    public static final Companion Companion = new Companion(null);
    private static final k<ab, Integer> UNINITIALIZED = new k<>(ab.f48028a, -1);
    private static final k<ab, Integer> RELEASED = new k<>(ab.f48028a, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public RefCounted(boolean z, l<? super T, ab> lVar) {
        x.f(lVar, "onRelease");
        this.debugRefCounts = z;
        this.onRelease = lVar;
        this.refCounted = b.h(Companion.uninitialized());
    }

    public final T acquire() {
        k kVar;
        T t;
        int iIntValue;
        if (x.n(this.refCounted.b(), Companion.uninitialized())) {
            throw new IllegalStateException("Ref-count managed object has not yet been initialized. Unable to acquire.");
        }
        d<k<T, Integer>> dVar = this.refCounted;
        do {
            kVar = (k) dVar.b();
            if (x.n(kVar, Companion.released())) {
                if (!this.debugRefCounts) {
                    return null;
                }
                String str = String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode())}, 1));
                x.e(str, "format(...)");
                Log.d(TAG, "RefCounted@" + str + ".acquire() failure: [refCount: 0]", new Throwable());
                return null;
            }
            t = (T) kVar.a();
            iIntValue = ((Number) kVar.b()).intValue() + 1;
        } while (!this.refCounted.e(kVar, new k(t, Integer.valueOf(iIntValue))));
        if (this.debugRefCounts) {
            String str2 = String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode())}, 1));
            x.e(str2, "format(...)");
            Class<?> cls = t.getClass();
            int i2 = ar.f48106a;
            Log.d(TAG, "RefCounted@" + str2 + "<" + new m(cls).c() + ">.acquire() success: [refCount: " + iIntValue + ", value: " + t + "]", new Throwable());
        }
        return t;
    }

    public final void initialize(T t) {
        x.f(t, "newValue");
        if (!this.refCounted.e(Companion.uninitialized(), new k(t, 1))) {
            throw new IllegalStateException("Ref-count managed object has already been initialized.");
        }
        if (this.debugRefCounts) {
            String str = String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode())}, 1));
            x.e(str, "format(...)");
            Class<?> cls = t.getClass();
            int i2 = ar.f48106a;
            Log.d(TAG, "RefCounted@" + str + "<" + new m(cls).c() + "> initialized: [refCount: 1, value: " + t + "]", new Throwable());
        }
    }

    public final void release() {
        k kVar;
        Companion companion;
        Object objA;
        int iIntValue;
        k kVarReleased;
        if (x.n(this.refCounted.b(), Companion.uninitialized())) {
            throw new IllegalStateException("Ref-count managed object has not yet been initialized. Unable to release.");
        }
        d<k<T, Integer>> dVar = this.refCounted;
        do {
            kVar = (k) dVar.b();
            companion = Companion;
            if (x.n(kVar, companion.released())) {
                throw new IllegalStateException("Release called more times than initialize + acquire.");
            }
            objA = kVar.a();
            iIntValue = ((Number) kVar.b()).intValue();
            kVarReleased = iIntValue == 1 ? companion.released() : new k(objA, Integer.valueOf(iIntValue - 1));
        } while (!this.refCounted.e(kVar, kVarReleased));
        boolean zN = x.n(kVarReleased, companion.released());
        boolean z = this.debugRefCounts;
        if (zN) {
            if (z) {
                String str = String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode())}, 1));
                x.e(str, "format(...)");
                Class<?> cls = objA.getClass();
                int i2 = ar.f48106a;
                Log.d(TAG, "RefCounted@" + str + "<" + new m(cls).c() + ">.release() (last ref): [refCount: 0, value: " + objA + "]", new Throwable());
            }
            this.onRelease.invoke(objA);
            return;
        }
        if (z) {
            String str2 = String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode())}, 1));
            x.e(str2, "format(...)");
            Class<?> cls2 = objA.getClass();
            int i3 = ar.f48106a;
            String strC = new m(cls2).c();
            StringBuilder sb = new StringBuilder("RefCounted@");
            sb.append(str2);
            sb.append("<");
            sb.append(strC);
            sb.append(">.release(): [refCount: ");
            sb.append(iIntValue - 1);
            sb.append(", value: ");
            sb.append(objA);
            sb.append("]");
            Log.d(TAG, sb.toString(), new Throwable());
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> k<T, Integer> released() {
            k<T, Integer> kVar = RefCounted.RELEASED;
            x.d(kVar, "null cannot be cast to non-null type kotlin.Pair<T of androidx.camera.viewfinder.core.impl.RefCounted.Companion.released, kotlin.Int>");
            return kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> k<T, Integer> uninitialized() {
            k<T, Integer> kVar = RefCounted.UNINITIALIZED;
            x.d(kVar, "null cannot be cast to non-null type kotlin.Pair<T of androidx.camera.viewfinder.core.impl.RefCounted.Companion.uninitialized, kotlin.Int>");
            return kVar;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ RefCounted(boolean z, l lVar, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), lVar);
    }
}
