package t0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: t0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4040E extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C4041F f45432i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f45433j;
    public final /* synthetic */ float k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ tf.l f45434l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4040E(C4041F c4041f, long j8, float f10, tf.l lVar) {
        super(0);
        this.f45432i = c4041f;
        this.f45433j = j8;
        this.k = f10;
        this.f45434l = lVar;
    }

    @Override // tf.a
    public final Object invoke() {
        float f10 = this.k;
        tf.l lVar = this.f45434l;
        C4041F c4041f = this.f45432i;
        long j8 = this.f45433j;
        if (lVar == null) {
            r0.s.b(c4041f.f45436f, j8, f10);
        } else {
            r0.s.f(c4041f.f45436f, j8, f10, lVar);
        }
        return C2515C.f34653a;
    }
}
