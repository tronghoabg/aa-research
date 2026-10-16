package od;

import java.util.concurrent.atomic.AtomicBoolean;
import md.AbstractC3541i;

/* loaded from: classes5.dex */
public final class W1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3541i[] f41842a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f41843b = new AtomicBoolean(false);

    static {
        new W1(new AbstractC3541i[0]);
    }

    public W1(AbstractC3541i[] abstractC3541iArr) {
        this.f41842a = abstractC3541iArr;
    }

    public final void a(long j8) {
        for (AbstractC3541i abstractC3541i : this.f41842a) {
            abstractC3541i.g(j8);
        }
    }
}
