package u0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import n3.C3592d;

/* loaded from: classes.dex */
public final class P extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f46164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C3592d f46165j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(boolean z2, C3592d c3592d, String str) {
        super(0);
        this.f46164i = z2;
        this.f46165j = c3592d;
        this.k = str;
    }

    @Override // tf.a
    public final Object invoke() {
        if (this.f46164i) {
            C3592d c3592d = this.f46165j;
            c3592d.getClass();
            String key = this.k;
            AbstractC3340k.e(key, "key");
            c3592d.f40904a.b(key);
        }
        return C2515C.f34653a;
    }
}
