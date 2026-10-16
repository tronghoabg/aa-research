package E4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: E4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final t f2865a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2866b;

    /* renamed from: c, reason: collision with root package name */
    public B f2867c;

    public C0434c(t tVar, u uVar, ReferenceQueue referenceQueue) {
        super(uVar, referenceQueue);
        gc.b.k(tVar, "Argument must not be null");
        this.f2865a = tVar;
        boolean z2 = uVar.f2985a;
        this.f2867c = null;
        this.f2866b = z2;
    }
}
