package Ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ef.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0517x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3787b = AtomicIntegerFieldUpdater.newUpdater(C0517x.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3788a;

    public C0517x(boolean z2, Throwable th) {
        this.f3788a = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3788a + ']';
    }
}
