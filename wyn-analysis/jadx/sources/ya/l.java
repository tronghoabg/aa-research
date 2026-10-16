package ya;

import A7.RunnableC0307z;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes4.dex */
public final class l extends PhantomReference {

    /* renamed from: a, reason: collision with root package name */
    public final Set f48060a;

    /* renamed from: b, reason: collision with root package name */
    public final RunnableC0307z f48061b;

    public /* synthetic */ l(C4570a c4570a, ReferenceQueue referenceQueue, Set set, RunnableC0307z runnableC0307z) {
        super(c4570a, referenceQueue);
        this.f48060a = set;
        this.f48061b = runnableC0307z;
    }
}
