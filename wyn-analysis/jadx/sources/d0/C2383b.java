package d0;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2383b {

    /* renamed from: a, reason: collision with root package name */
    public float f33927a;

    /* renamed from: b, reason: collision with root package name */
    public float f33928b;

    /* renamed from: c, reason: collision with root package name */
    public float f33929c;

    /* renamed from: d, reason: collision with root package name */
    public float f33930d;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f33927a = Math.max(f10, this.f33927a);
        this.f33928b = Math.max(f11, this.f33928b);
        this.f33929c = Math.min(f12, this.f33929c);
        this.f33930d = Math.min(f13, this.f33930d);
    }

    public final boolean b() {
        return this.f33927a >= this.f33929c || this.f33928b >= this.f33930d;
    }

    public final String toString() {
        return "MutableRect(" + S3.f.O(this.f33927a) + ", " + S3.f.O(this.f33928b) + ", " + S3.f.O(this.f33929c) + ", " + S3.f.O(this.f33930d) + ')';
    }
}
