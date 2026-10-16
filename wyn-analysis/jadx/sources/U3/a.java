package U3;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12240c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f12241d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12242a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f12243b;

    static {
        if (h.f12260d) {
            f12241d = null;
            f12240c = null;
        } else {
            f12241d = new a(false, null);
            f12240c = new a(true, null);
        }
    }

    public a(boolean z2, CancellationException cancellationException) {
        this.f12242a = z2;
        this.f12243b = cancellationException;
    }
}
