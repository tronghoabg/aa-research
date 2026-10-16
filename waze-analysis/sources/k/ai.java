package k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50806a;

    /* renamed from: b, reason: collision with root package name */
    public int f50807b;

    /* renamed from: c, reason: collision with root package name */
    public int f50808c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f50809d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f50810e;

    /* renamed from: f, reason: collision with root package name */
    public ai f50811f;

    /* renamed from: g, reason: collision with root package name */
    public ai f50812g;

    public ai(byte[] bArr, int i2, int i3, boolean z) {
        h.g.b.x.f(bArr, "data");
        this.f50806a = bArr;
        this.f50807b = i2;
        this.f50808c = i3;
        this.f50809d = z;
        this.f50810e = false;
    }

    public final ai a() {
        ai aiVar = this.f50811f;
        if (aiVar == this) {
            aiVar = null;
        }
        ai aiVar2 = this.f50812g;
        h.g.b.x.c(aiVar2);
        aiVar2.f50811f = this.f50811f;
        ai aiVar3 = this.f50811f;
        h.g.b.x.c(aiVar3);
        aiVar3.f50812g = this.f50812g;
        this.f50811f = null;
        this.f50812g = null;
        return aiVar;
    }

    public final ai b() {
        this.f50809d = true;
        return new ai(this.f50806a, this.f50807b, this.f50808c, true);
    }

    public final void c(ai aiVar, int i2) {
        h.g.b.x.f(aiVar, "sink");
        if (!aiVar.f50810e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = aiVar.f50808c;
        int i4 = i3 + i2;
        if (i4 > 8192) {
            if (aiVar.f50809d) {
                throw new IllegalArgumentException();
            }
            int i5 = aiVar.f50807b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = aiVar.f50806a;
            h.a.c.an(bArr, bArr, 0, i5, i3);
            i3 = aiVar.f50808c - aiVar.f50807b;
            aiVar.f50808c = i3;
            aiVar.f50807b = 0;
        }
        byte[] bArr2 = this.f50806a;
        byte[] bArr3 = aiVar.f50806a;
        int i6 = this.f50807b;
        h.a.c.an(bArr2, bArr3, i3, i6, i6 + i2);
        aiVar.f50808c += i2;
        this.f50807b += i2;
    }

    public final void d(ai aiVar) {
        h.g.b.x.f(aiVar, "segment");
        aiVar.f50812g = this;
        aiVar.f50811f = this.f50811f;
        ai aiVar2 = this.f50811f;
        h.g.b.x.c(aiVar2);
        aiVar2.f50812g = aiVar;
        this.f50811f = aiVar;
    }

    public ai() {
        this.f50806a = new byte[8192];
        this.f50810e = true;
        this.f50809d = false;
    }
}
