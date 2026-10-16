package e.a.d;

import java.net.ProxySelector;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hm implements com.google.d.b.aj {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f47099a;

    hm(int i2) {
        this.f47099a = i2;
    }

    @Override // com.google.d.b.aj
    public final /* synthetic */ Object get() {
        return this.f47099a != 0 ? com.google.d.b.ai.c() : ProxySelector.getDefault();
    }
}
