package Pf;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final i f9458a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9459b;

    /* renamed from: c, reason: collision with root package name */
    public g f9460c;

    /* renamed from: d, reason: collision with root package name */
    public int f9461d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9462e;

    /* renamed from: f, reason: collision with root package name */
    public long f9463f;

    public c(i iVar) {
        this.f9458a = iVar;
        a buffer = iVar.getBuffer();
        this.f9459b = buffer;
        g gVar = buffer.f9454a;
        this.f9460c = gVar;
        this.f9461d = gVar != null ? gVar.f9470b : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f9462e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f9470b) goto L15;
     */
    @Override // Pf.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(Pf.a r12, long r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pf.c.j(Pf.a, long):long");
    }
}
