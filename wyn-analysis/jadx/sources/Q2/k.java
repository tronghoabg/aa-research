package q2;

import N1.W;
import N1.X;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f44053a;

    public k(j jVar) {
        this.f44053a = jVar;
    }

    public final void a() throws W {
        try {
            ((k) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(X.class).newInstance(this.f44053a)).a();
        } catch (Exception e7) {
            int i5 = W.f8124a;
            if (!(e7 instanceof W)) {
                throw new W(e7);
            }
        }
    }
}
