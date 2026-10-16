package q2;

import N1.Y;
import Q1.t;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f44101a;

    /* renamed from: b, reason: collision with root package name */
    public final m f44102b;

    /* renamed from: c, reason: collision with root package name */
    public final C8.j f44103c = new C8.j(5);

    /* renamed from: d, reason: collision with root package name */
    public final t f44104d = new t(0);

    /* renamed from: e, reason: collision with root package name */
    public final t f44105e = new t(0);

    /* renamed from: f, reason: collision with root package name */
    public final G4.f f44106f;

    /* renamed from: g, reason: collision with root package name */
    public Y f44107g;

    /* renamed from: h, reason: collision with root package name */
    public Y f44108h;

    /* renamed from: i, reason: collision with root package name */
    public long f44109i;

    /* renamed from: j, reason: collision with root package name */
    public long f44110j;

    public p(com.google.android.gms.ads.nativead.l lVar, m mVar) {
        this.f44101a = lVar;
        this.f44102b = mVar;
        G4.f fVar = new G4.f();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        fVar.f4233a = 0;
        fVar.f4234b = 0;
        fVar.f4236d = new long[iHighestOneBit];
        fVar.f4235c = iHighestOneBit - 1;
        this.f44106f = fVar;
        this.f44108h = Y.f8125d;
        this.f44110j = -9223372036854775807L;
    }
}
