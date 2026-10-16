package N;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import x.C4421n;

/* renamed from: N.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750y extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0751z f7963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.f f7964j;
    public final /* synthetic */ C4421n k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7965l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750y(C0751z c0751z, V.f fVar, C4421n c4421n, int i5) {
        super(1);
        this.f7963i = c0751z;
        this.f7964j = fVar;
        this.k = c4421n;
        this.f7965l = i5;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        if (obj == this.f7963i) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof X.y) {
            int i5 = this.f7964j.f12862a - this.f7965l;
            C4421n c4421n = this.k;
            int iC = c4421n.c(obj);
            int iMin = Math.min(i5, iC >= 0 ? c4421n.f47530c[iC] : com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            int iB = c4421n.b(obj);
            if (iB < 0) {
                iB = ~iB;
            }
            c4421n.f47529b[iB] = obj;
            c4421n.f47530c[iB] = iMin;
        }
        return C2515C.f34653a;
    }
}
