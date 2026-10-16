package O1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public b f8807b;

    /* renamed from: c, reason: collision with root package name */
    public b f8808c;

    /* renamed from: d, reason: collision with root package name */
    public b f8809d;

    /* renamed from: e, reason: collision with root package name */
    public b f8810e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f8811f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f8812g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8813h;

    public e() {
        ByteBuffer byteBuffer = d.f8806a;
        this.f8811f = byteBuffer;
        this.f8812g = byteBuffer;
        b bVar = b.f8801e;
        this.f8809d = bVar;
        this.f8810e = bVar;
        this.f8807b = bVar;
        this.f8808c = bVar;
    }

    @Override // O1.d
    public final b a(b bVar) {
        this.f8809d = bVar;
        this.f8810e = f(bVar);
        return isActive() ? this.f8810e : b.f8801e;
    }

    @Override // O1.d
    public boolean b() {
        return this.f8813h && this.f8812g == d.f8806a;
    }

    @Override // O1.d
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f8812g;
        this.f8812g = d.f8806a;
        return byteBuffer;
    }

    @Override // O1.d
    public final void e() {
        this.f8813h = true;
        h();
    }

    public abstract b f(b bVar);

    @Override // O1.d
    public final void flush() {
        this.f8812g = d.f8806a;
        this.f8813h = false;
        this.f8807b = this.f8809d;
        this.f8808c = this.f8810e;
        g();
    }

    @Override // O1.d
    public boolean isActive() {
        return this.f8810e != b.f8801e;
    }

    public final ByteBuffer j(int i5) {
        if (this.f8811f.capacity() < i5) {
            this.f8811f = ByteBuffer.allocateDirect(i5).order(ByteOrder.nativeOrder());
        } else {
            this.f8811f.clear();
        }
        ByteBuffer byteBuffer = this.f8811f;
        this.f8812g = byteBuffer;
        return byteBuffer;
    }

    @Override // O1.d
    public final void reset() {
        flush();
        this.f8811f = d.f8806a;
        b bVar = b.f8801e;
        this.f8809d = bVar;
        this.f8810e = bVar;
        this.f8807b = bVar;
        this.f8808c = bVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
