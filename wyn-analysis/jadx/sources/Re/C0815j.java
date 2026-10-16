package Re;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Re.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0815j extends AbstractC0814i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10736c = 1;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f10737d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10738e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f10739f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10740g;

    public C0815j(He.f fVar, int i5) {
        super(fVar);
        this.f10740g = new Ve.b(i5);
        this.f10739f = new AtomicInteger();
    }

    @Override // He.d
    public final void b(Object obj) {
        switch (this.f10736c) {
            case 0:
                if (!this.f10738e && !this.f10735b.b()) {
                    if (obj != null) {
                        ((Ve.b) this.f10740g).offer(obj);
                        h();
                        break;
                    } else {
                        d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        break;
                    }
                }
                break;
            default:
                if (!this.f10738e && !this.f10735b.b()) {
                    if (obj != null) {
                        ((AtomicReference) this.f10740g).set(obj);
                        h();
                        break;
                    } else {
                        d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        break;
                    }
                }
                break;
        }
    }

    @Override // Re.AbstractC0814i
    public final void e() {
        switch (this.f10736c) {
            case 0:
                h();
                break;
            default:
                h();
                break;
        }
    }

    @Override // Re.AbstractC0814i
    public final void f() {
        switch (this.f10736c) {
            case 0:
                if (this.f10739f.getAndIncrement() == 0) {
                    ((Ve.b) this.f10740g).clear();
                    break;
                }
                break;
            default:
                if (this.f10739f.getAndIncrement() == 0) {
                    ((AtomicReference) this.f10740g).lazySet(null);
                    break;
                }
                break;
        }
    }

    @Override // Re.AbstractC0814i
    public final boolean g(Throwable th) {
        switch (this.f10736c) {
            case 0:
                if (!this.f10738e && !this.f10735b.b()) {
                    this.f10737d = th;
                    this.f10738e = true;
                    h();
                    break;
                }
                break;
            default:
                if (!this.f10738e && !this.f10735b.b()) {
                    this.f10737d = th;
                    this.f10738e = true;
                    h();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r9 != r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r17.f10735b.b() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r2.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r5 = r17.f10738e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r2.get() != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r12 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f10737d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r9 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        Fe.e.P(r17, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r4 = r17.f10739f.addAndGet(-r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Re.C0815j.h():void");
    }

    public C0815j(He.f fVar) {
        super(fVar);
        this.f10740g = new AtomicReference();
        this.f10739f = new AtomicInteger();
    }
}
