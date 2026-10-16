package Af;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class z implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f1341a;

    /* renamed from: b, reason: collision with root package name */
    public final tf.l f1342b;

    public z(k sequence, tf.l transformer) {
        AbstractC3340k.e(sequence, "sequence");
        AbstractC3340k.e(transformer, "transformer");
        this.f1341a = sequence;
        this.f1342b = transformer;
    }

    @Override // Af.k
    public final Iterator iterator() {
        return new y(this);
    }
}
