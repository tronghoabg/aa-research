package h0;

import L0.g;
import L0.h;
import d0.f;
import e0.C2452d;
import e0.r;
import g0.InterfaceC2663d;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import vf.AbstractC4345a;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2763a extends AbstractC2765c {

    /* renamed from: f, reason: collision with root package name */
    public final C2452d f35920f;

    /* renamed from: g, reason: collision with root package name */
    public final long f35921g;

    /* renamed from: h, reason: collision with root package name */
    public final long f35922h;

    /* renamed from: i, reason: collision with root package name */
    public int f35923i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final long f35924j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public r f35925l;

    public C2763a(C2452d c2452d, long j8, long j10) {
        int i5;
        int i10;
        this.f35920f = c2452d;
        this.f35921g = j8;
        this.f35922h = j10;
        int i11 = g.f6803c;
        if (((int) (j8 >> 32)) < 0 || ((int) (j8 & 4294967295L)) < 0 || (i5 = (int) (j10 >> 32)) < 0 || (i10 = (int) (4294967295L & j10)) < 0 || i5 > c2452d.f34361a.getWidth() || i10 > c2452d.f34361a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f35924j = j10;
        this.k = 1.0f;
    }

    @Override // h0.AbstractC2765c
    public final boolean a(float f10) {
        this.k = f10;
        return true;
    }

    @Override // h0.AbstractC2765c
    public final boolean b(r rVar) {
        this.f35925l = rVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2763a) {
            C2763a c2763a = (C2763a) obj;
            if (AbstractC3340k.a(this.f35920f, c2763a.f35920f)) {
                int i5 = g.f6803c;
                if (this.f35921g == c2763a.f35921g && h.a(this.f35922h, c2763a.f35922h) && this.f35923i == c2763a.f35923i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h0.AbstractC2765c
    public final long f() {
        return Ba.c.R(this.f35924j);
    }

    @Override // h0.AbstractC2765c
    public final void g(InterfaceC2663d interfaceC2663d) {
        AbstractC3340k.e(interfaceC2663d, "<this>");
        long jA = Ba.c.a(AbstractC4345a.H(f.d(interfaceC2663d.c())), AbstractC4345a.H(f.b(interfaceC2663d.c())));
        float f10 = this.k;
        r rVar = this.f35925l;
        int i5 = this.f35923i;
        com.google.android.gms.internal.consent_sdk.a.d(interfaceC2663d, this.f35920f, this.f35921g, this.f35922h, jA, f10, rVar, i5, 328);
    }

    public final int hashCode() {
        int iHashCode = this.f35920f.hashCode() * 31;
        int i5 = g.f6803c;
        long j8 = this.f35921g;
        int i10 = (((int) (j8 ^ (j8 >>> 32))) + iHashCode) * 31;
        long j10 = this.f35922h;
        return ((((int) ((j10 >>> 32) ^ j10)) + i10) * 31) + this.f35923i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f35920f);
        sb2.append(", srcOffset=");
        sb2.append((Object) g.a(this.f35921g));
        sb2.append(", srcSize=");
        sb2.append((Object) h.b(this.f35922h));
        sb2.append(", filterQuality=");
        int i5 = this.f35923i;
        sb2.append((Object) (i5 == 0 ? OfficeOpenXMLExtended.SECURITY_NONE : i5 == 1 ? "Low" : i5 == 2 ? "Medium" : i5 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
