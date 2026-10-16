package Pf;

import com.applovin.shadow.okio.Segment;
import ff.m;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9469a;

    /* renamed from: b, reason: collision with root package name */
    public int f9470b;

    /* renamed from: c, reason: collision with root package name */
    public int f9471c;

    /* renamed from: d, reason: collision with root package name */
    public j f9472d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9473e;

    /* renamed from: f, reason: collision with root package name */
    public g f9474f;

    /* renamed from: g, reason: collision with root package name */
    public g f9475g;

    public g() {
        this.f9469a = new byte[Segment.SIZE];
        this.f9473e = true;
        this.f9472d = null;
    }

    public final int a() {
        return this.f9471c - this.f9470b;
    }

    public final byte b(int i5) {
        return this.f9469a[this.f9470b + i5];
    }

    public final g c() {
        g gVar = this.f9474f;
        g gVar2 = this.f9475g;
        if (gVar2 != null) {
            AbstractC3340k.b(gVar2);
            gVar2.f9474f = this.f9474f;
        }
        g gVar3 = this.f9474f;
        if (gVar3 != null) {
            AbstractC3340k.b(gVar3);
            gVar3.f9475g = this.f9475g;
        }
        this.f9474f = null;
        this.f9475g = null;
        return gVar;
    }

    public final void d(g segment) {
        AbstractC3340k.e(segment, "segment");
        segment.f9475g = this;
        segment.f9474f = this.f9474f;
        g gVar = this.f9474f;
        if (gVar != null) {
            gVar.f9475g = segment;
        }
        this.f9474f = segment;
    }

    public final g e() {
        j fVar = this.f9472d;
        if (fVar == null) {
            g gVar = h.f9476a;
            fVar = new f();
            this.f9472d = fVar;
        }
        int i5 = this.f9470b;
        int i10 = this.f9471c;
        f.f9467c.incrementAndGet((f) fVar);
        return new g(this.f9469a, i5, i10, fVar);
    }

    public final void f(g sink, int i5) {
        AbstractC3340k.e(sink, "sink");
        if (!sink.f9473e) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.f9471c + i5 > 8192) {
            j jVar = sink.f9472d;
            if (jVar != null && ((f) jVar).f9468b > 0) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.f9471c;
            int i11 = sink.f9470b;
            if ((i10 + i5) - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f9469a;
            m.f0(0, i11, i10, bArr, bArr);
            sink.f9471c -= sink.f9470b;
            sink.f9470b = 0;
        }
        int i12 = sink.f9471c;
        int i13 = this.f9470b;
        m.f0(i12, i13, i13 + i5, this.f9469a, sink.f9469a);
        sink.f9471c += i5;
        this.f9470b += i5;
    }

    public g(byte[] bArr, int i5, int i10, j jVar) {
        this.f9469a = bArr;
        this.f9470b = i5;
        this.f9471c = i10;
        this.f9472d = jVar;
        this.f9473e = false;
    }
}
