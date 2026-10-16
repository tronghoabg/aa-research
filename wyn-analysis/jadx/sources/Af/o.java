package Af;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3470i;

/* loaded from: classes5.dex */
public final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1316a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1317b;

    public /* synthetic */ o(Object obj, int i5) {
        this.f1316a = i5;
        this.f1317b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [lf.i, tf.p] */
    @Override // Af.k
    public final Iterator iterator() {
        switch (this.f1316a) {
            case 0:
                return S3.f.x((AbstractC3470i) this.f1317b);
            case 1:
                return (Iterator) this.f1317b;
            case 2:
                return new s(this.f1317b);
            case 3:
                return new Bf.d((String) this.f1317b);
            case 4:
                return AbstractC3340k.i((Object[]) this.f1317b);
            case 5:
                return ((Iterable) this.f1317b).iterator();
            default:
                return new qf.k(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(tf.p pVar) {
        this.f1316a = 0;
        this.f1317b = (AbstractC3470i) pVar;
    }
}
