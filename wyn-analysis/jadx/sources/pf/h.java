package Pf;

import Bf.r;
import com.applovin.shadow.okio.Segment;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final g f9476a = new g(new byte[0], 0, 0, null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f9477b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9478c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9479d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9480e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceArray f9481f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceArray f9482g;

    static {
        int iIntValue;
        int i5 = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9477b = iHighestOneBit;
        int i10 = iHighestOneBit / 2;
        int i11 = i10 >= 1 ? i10 : 1;
        f9478c = i11;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", AbstractC3340k.a(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        AbstractC3340k.d(property, "getProperty(...)");
        Integer numL0 = r.l0(property);
        if (numL0 != null && (iIntValue = numL0.intValue()) >= 0) {
            i5 = iIntValue;
        }
        f9479d = i5;
        int i12 = i5 / i11;
        if (i12 < 8192) {
            i12 = 8192;
        }
        f9480e = i12;
        f9481f = new AtomicReferenceArray(iHighestOneBit);
        f9482g = new AtomicReferenceArray(i11);
    }

    public static final void a(g segment) {
        AbstractC3340k.e(segment, "segment");
        if (segment.f9474f != null || segment.f9475g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j jVar = segment.f9472d;
        if (jVar != null) {
            f fVar = (f) jVar;
            if (fVar.f9468b != 0) {
                int iDecrementAndGet = f.f9467c.decrementAndGet(fVar);
                if (iDecrementAndGet >= 0) {
                    return;
                }
                if (iDecrementAndGet != -1) {
                    throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
                }
                fVar.f9468b = 0;
            }
        }
        AtomicReferenceArray atomicReferenceArray = f9481f;
        int id2 = (int) ((f9477b - 1) & Thread.currentThread().getId());
        segment.f9470b = 0;
        segment.f9473e = true;
        while (true) {
            g gVar = (g) atomicReferenceArray.get(id2);
            g gVar2 = f9476a;
            if (gVar != gVar2) {
                int i5 = gVar != null ? gVar.f9471c : 0;
                if (i5 < 65536) {
                    segment.f9474f = gVar;
                    segment.f9471c = i5 + Segment.SIZE;
                    while (!atomicReferenceArray.compareAndSet(id2, gVar, segment)) {
                        if (atomicReferenceArray.get(id2) != gVar) {
                            break;
                        }
                    }
                    return;
                }
                if (f9479d <= 0) {
                    return;
                }
                segment.f9470b = 0;
                segment.f9473e = true;
                int id3 = (int) ((f9478c - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f9482g;
                int i10 = 0;
                while (true) {
                    g gVar3 = (g) atomicReferenceArray2.get(id3);
                    if (gVar3 != gVar2) {
                        int i11 = (gVar3 != null ? gVar3.f9471c : 0) + Segment.SIZE;
                        if (i11 <= f9480e) {
                            segment.f9474f = gVar3;
                            segment.f9471c = i11;
                            while (!atomicReferenceArray2.compareAndSet(id3, gVar3, segment)) {
                                if (atomicReferenceArray2.get(id3) != gVar3) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i12 = f9478c;
                        if (i10 >= i12) {
                            return;
                        }
                        i10++;
                        id3 = (id3 + 1) & (i12 - 1);
                    }
                }
            }
        }
    }

    public static final g b() {
        g gVar;
        g gVar2;
        AtomicReferenceArray atomicReferenceArray = f9481f;
        int id2 = (int) ((f9477b - 1) & Thread.currentThread().getId());
        do {
            gVar = f9476a;
            gVar2 = (g) atomicReferenceArray.getAndSet(id2, gVar);
        } while (AbstractC3340k.a(gVar2, gVar));
        if (gVar2 != null) {
            atomicReferenceArray.set(id2, gVar2.f9474f);
            gVar2.f9474f = null;
            gVar2.f9471c = 0;
            return gVar2;
        }
        atomicReferenceArray.set(id2, null);
        if (f9479d <= 0) {
            return new g();
        }
        AtomicReferenceArray atomicReferenceArray2 = f9482g;
        int i5 = f9478c;
        int id3 = (int) (Thread.currentThread().getId() & (i5 - 1));
        int i10 = 0;
        while (true) {
            g gVar3 = (g) atomicReferenceArray2.getAndSet(id3, gVar);
            if (!AbstractC3340k.a(gVar3, gVar)) {
                if (gVar3 != null) {
                    atomicReferenceArray2.set(id3, gVar3.f9474f);
                    gVar3.f9474f = null;
                    gVar3.f9471c = 0;
                    return gVar3;
                }
                atomicReferenceArray2.set(id3, null);
                if (i10 >= i5) {
                    return new g();
                }
                id3 = (id3 + 1) & (i5 - 1);
                i10++;
            }
        }
    }
}
