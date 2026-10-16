package k9;

/* loaded from: classes4.dex */
public final class h implements h9.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39337a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39338b = false;

    /* renamed from: c, reason: collision with root package name */
    public h9.d f39339c;

    /* renamed from: d, reason: collision with root package name */
    public final f f39340d;

    public h(f fVar) {
        this.f39340d = fVar;
    }

    @Override // h9.h
    public final h9.h add(String str) {
        if (this.f39337a) {
            throw new h9.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f39337a = true;
        this.f39340d.c(this.f39339c, str, this.f39338b);
        return this;
    }

    @Override // h9.h
    public final h9.h add(boolean z2) {
        if (!this.f39337a) {
            this.f39337a = true;
            this.f39340d.b(this.f39339c, z2 ? 1 : 0, this.f39338b);
            return this;
        }
        throw new h9.b("Cannot encode a second value in the ValueEncoderContext");
    }
}
