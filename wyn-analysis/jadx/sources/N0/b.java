package N0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f7991c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f7992d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7993a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f7994b;

    static {
        if (i.f8009d) {
            f7992d = null;
            f7991c = null;
        } else {
            f7992d = new b(false, null);
            f7991c = new b(true, null);
        }
    }

    public b(boolean z2, CancellationException cancellationException) {
        this.f7993a = z2;
        this.f7994b = cancellationException;
    }
}
