package androidx.compose.material3.carousel;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface KeylineListScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.carousel.KeylineListScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void add$default(KeylineListScope keylineListScope, float f2, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            keylineListScope.add(f2, z & ((i2 & 2) == 0));
        }
    }

    void add(float f2, boolean z);
}
