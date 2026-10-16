package x0;

import kotlin.jvm.internal.AbstractC3340k;
import t0.t;

/* renamed from: x0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4442l {

    /* renamed from: a, reason: collision with root package name */
    public final t f47606a;

    public C4442l(t rootNode) {
        AbstractC3340k.e(rootNode, "rootNode");
        this.f47606a = rootNode;
    }

    public final C4441k a() {
        C4438h c4438hV = S3.f.v(this.f47606a);
        AbstractC3340k.b(c4438hV);
        return new C4441k(c4438hV, false);
    }
}
