package e.a.b.a;

import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46363b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f46364c;

    public /* synthetic */ b(Object obj, int i2, int i3) {
        this.f46364c = i3;
        this.f46363b = obj;
        this.f46362a = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2 = this.f46364c;
        int i3 = this.f46362a;
        return i2 != 0 ? LottieAnimationView.c((LottieAnimationView) this.f46363b, i3) : ((e) this.f46363b).f46370h.a(i3);
    }
}
