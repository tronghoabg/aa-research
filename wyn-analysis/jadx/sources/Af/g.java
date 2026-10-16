package Af;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f1300a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1301b;

    /* renamed from: c, reason: collision with root package name */
    public final tf.l f1302c;

    public g(k kVar, boolean z2, tf.l predicate) {
        AbstractC3340k.e(predicate, "predicate");
        this.f1300a = kVar;
        this.f1301b = z2;
        this.f1302c = predicate;
    }

    @Override // Af.k
    public final Iterator iterator() {
        return new f(this);
    }
}
