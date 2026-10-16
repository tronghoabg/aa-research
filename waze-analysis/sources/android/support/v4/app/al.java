package android.support.v4.app;

import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.arch.core.util.Function;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class al implements Function {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f118a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f119b;

    al(Object obj, int i2) {
        this.f119b = i2;
        this.f118a = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final /* synthetic */ Object apply(Object obj) {
        if (this.f119b == 0) {
            return this.f118a;
        }
        ar arVar = (ar) this.f118a;
        Object obj2 = arVar.mHost;
        return obj2 instanceof ActivityResultRegistryOwner ? ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry() : arVar.requireActivity().getActivityResultRegistry();
    }
}
