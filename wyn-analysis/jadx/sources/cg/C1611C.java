package cg;

import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1611C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f19866a;

    /* renamed from: b, reason: collision with root package name */
    public int f19867b;

    /* renamed from: c, reason: collision with root package name */
    public int f19868c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19869d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19870e;

    /* renamed from: f, reason: collision with root package name */
    public C1611C f19871f;

    /* renamed from: g, reason: collision with root package name */
    public C1611C f19872g;

    public C1611C() {
        this.f19866a = new byte[Segment.SIZE];
        this.f19870e = true;
        this.f19869d = false;
    }

    public final C1611C a() {
        C1611C c1611c = this.f19871f;
        if (c1611c == this) {
            c1611c = null;
        }
        C1611C c1611c2 = this.f19872g;
        AbstractC3340k.b(c1611c2);
        c1611c2.f19871f = this.f19871f;
        C1611C c1611c3 = this.f19871f;
        AbstractC3340k.b(c1611c3);
        c1611c3.f19872g = this.f19872g;
        this.f19871f = null;
        this.f19872g = null;
        return c1611c;
    }

    public final void b(C1611C segment) {
        AbstractC3340k.e(segment, "segment");
        segment.f19872g = this;
        segment.f19871f = this.f19871f;
        C1611C c1611c = this.f19871f;
        AbstractC3340k.b(c1611c);
        c1611c.f19872g = segment;
        this.f19871f = segment;
    }

    public final C1611C c() {
        this.f19869d = true;
        return new C1611C(this.f19866a, this.f19867b, this.f19868c, true, false);
    }

    public final void d(C1611C sink, int i5) {
        AbstractC3340k.e(sink, "sink");
        if (!sink.f19870e) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.f19868c;
        int i11 = i10 + i5;
        byte[] bArr = sink.f19866a;
        if (i11 > 8192) {
            if (sink.f19869d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f19867b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            ff.m.f0(0, i12, i10, bArr, bArr);
            sink.f19868c -= sink.f19867b;
            sink.f19867b = 0;
        }
        int i13 = sink.f19868c;
        int i14 = this.f19867b;
        ff.m.f0(i13, i14, i14 + i5, this.f19866a, bArr);
        sink.f19868c += i5;
        this.f19867b += i5;
    }

    public C1611C(byte[] data, int i5, int i10, boolean z2, boolean z10) {
        AbstractC3340k.e(data, "data");
        this.f19866a = data;
        this.f19867b = i5;
        this.f19868c = i10;
        this.f19869d = z2;
        this.f19870e = z10;
    }
}
