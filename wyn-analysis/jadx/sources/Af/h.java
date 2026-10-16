package Af;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f1303a;

    /* renamed from: b, reason: collision with root package name */
    public final tf.l f1304b;

    /* renamed from: c, reason: collision with root package name */
    public final tf.l f1305c;

    public h(k sequence, tf.l transformer, tf.l lVar) {
        AbstractC3340k.e(sequence, "sequence");
        AbstractC3340k.e(transformer, "transformer");
        this.f1303a = sequence;
        this.f1304b = transformer;
        this.f1305c = lVar;
    }

    @Override // Af.k
    public final Iterator iterator() {
        return new f(this);
    }
}
