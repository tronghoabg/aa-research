package Hf;

import Ef.C0502n;
import If.AbstractC0621b;
import If.AbstractC0622c;
import If.AbstractC0623d;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class x0 extends AbstractC0621b implements InterfaceC0592c0, InterfaceC0593d, If.w {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5227f = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f5228e;

    public x0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // If.w
    public final InterfaceC0602l a(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return (((i5 < 0 || i5 >= 2) && i5 != -2) || aVar != Gf.a.f4781b) ? k0.t(this, interfaceC3108h, i5, aVar) : this;
    }

    @Override // Hf.InterfaceC0590b0
    public final boolean b(Object obj) {
        j(obj);
        return true;
    }

    @Override // Hf.InterfaceC0590b0
    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (((Hf.A0) r0).a(r3) == r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0097, code lost:
    
        if (r6 != r4) goto L37;
     */
    /* JADX WARN: Path cross not found for [B:45:0x00ad, B:47:0x00b3], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:47:0x00b3, B:45:0x00ad], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:47:0x00b3, B:55:0x00ce], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:67:0x0112, B:68:0x0113], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:37:0x0097, B:39:0x009f, B:42:0x00a6, B:43:0x00aa, B:45:0x00ad, B:55:0x00ce, B:58:0x00de, B:59:0x00f8, B:65:0x010a, B:62:0x0101, B:64:0x0107, B:47:0x00b3, B:51:0x00ba, B:21:0x0052, B:24:0x005d, B:36:0x0088), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:37:0x0097, B:39:0x009f, B:42:0x00a6, B:43:0x00aa, B:45:0x00ad, B:55:0x00ce, B:58:0x00de, B:59:0x00f8, B:65:0x010a, B:62:0x0101, B:64:0x0107, B:47:0x00b3, B:51:0x00ba, B:21:0x0052, B:24:0x005d, B:36:0x0088), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:37:0x0097, B:39:0x009f, B:42:0x00a6, B:43:0x00aa, B:45:0x00ad, B:55:0x00ce, B:58:0x00de, B:59:0x00f8, B:65:0x010a, B:62:0x0101, B:64:0x0107, B:47:0x00b3, B:51:0x00ba, B:21:0x0052, B:24:0x005d, B:36:0x0088), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00dd -> B:37:0x0097). Please report as a decompilation issue!!! */
    @Override // Hf.InterfaceC0602l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Hf.InterfaceC0603m r17, jf.InterfaceC3103c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.x0.collect(Hf.m, jf.c):java.lang.Object");
    }

    @Override // If.AbstractC0621b
    public final AbstractC0623d e() {
        return new y0();
    }

    @Override // Hf.InterfaceC0590b0, Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        j(obj);
        return C2515C.f34653a;
    }

    @Override // If.AbstractC0621b
    public final AbstractC0623d[] f() {
        return new y0[2];
    }

    @Override // Hf.v0
    public final Object getValue() {
        H6.g gVar = AbstractC0622c.f5464b;
        Object obj = f5227f.get(this);
        if (obj == gVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        H6.g gVar = AbstractC0622c.f5464b;
        if (obj == null) {
            obj = gVar;
        }
        if (obj2 == null) {
            obj2 = gVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = AbstractC0622c.f5464b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i5;
        AbstractC0623d[] abstractC0623dArr;
        H6.g gVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5227f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC3340k.a(obj3, obj)) {
                return false;
            }
            if (AbstractC3340k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f5228e;
            if ((i10 & 1) != 0) {
                this.f5228e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f5228e = i11;
            AbstractC0623d[] abstractC0623dArr2 = this.f5459a;
            while (true) {
                y0[] y0VarArr = (y0[]) abstractC0623dArr2;
                if (y0VarArr != null) {
                    for (y0 y0Var : y0VarArr) {
                        if (y0Var != null) {
                            AtomicReference atomicReference = y0Var.f5233a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (gVar = k0.f5156c)) {
                                    H6.g gVar2 = k0.f5155b;
                                    if (obj4 != gVar2) {
                                        while (!atomicReference.compareAndSet(obj4, gVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0502n) obj4).resumeWith(C2515C.f34653a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, gVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i5 = this.f5228e;
                    if (i5 == i11) {
                        this.f5228e = i11 + 1;
                        return true;
                    }
                    abstractC0623dArr = this.f5459a;
                }
                abstractC0623dArr2 = abstractC0623dArr;
                i11 = i5;
            }
        }
    }
}
