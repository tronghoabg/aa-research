package G5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class y implements InterfaceC0532m {

    /* renamed from: b, reason: collision with root package name */
    public C0530k f4485b;

    /* renamed from: c, reason: collision with root package name */
    public C0530k f4486c;

    /* renamed from: d, reason: collision with root package name */
    public C0530k f4487d;

    /* renamed from: e, reason: collision with root package name */
    public C0530k f4488e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f4489f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f4490g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4491h;

    public y() {
        ByteBuffer byteBuffer = InterfaceC0532m.f4426a;
        this.f4489f = byteBuffer;
        this.f4490g = byteBuffer;
        C0530k c0530k = C0530k.f4421e;
        this.f4487d = c0530k;
        this.f4488e = c0530k;
        this.f4485b = c0530k;
        this.f4486c = c0530k;
    }

    public abstract C0530k a(C0530k c0530k);

    @Override // G5.InterfaceC0532m
    public boolean b() {
        return this.f4491h && this.f4490g == InterfaceC0532m.f4426a;
    }

    @Override // G5.InterfaceC0532m
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f4490g;
        this.f4490g = InterfaceC0532m.f4426a;
        return byteBuffer;
    }

    @Override // G5.InterfaceC0532m
    public final void e() {
        this.f4491h = true;
        h();
    }

    @Override // G5.InterfaceC0532m
    public final C0530k f(C0530k c0530k) {
        this.f4487d = c0530k;
        this.f4488e = a(c0530k);
        return isActive() ? this.f4488e : C0530k.f4421e;
    }

    @Override // G5.InterfaceC0532m
    public final void flush() {
        this.f4490g = InterfaceC0532m.f4426a;
        this.f4491h = false;
        this.f4485b = this.f4487d;
        this.f4486c = this.f4488e;
        g();
    }

    @Override // G5.InterfaceC0532m
    public boolean isActive() {
        return this.f4488e != C0530k.f4421e;
    }

    public final ByteBuffer j(int i5) {
        if (this.f4489f.capacity() < i5) {
            this.f4489f = ByteBuffer.allocateDirect(i5).order(ByteOrder.nativeOrder());
        } else {
            this.f4489f.clear();
        }
        ByteBuffer byteBuffer = this.f4489f;
        this.f4490g = byteBuffer;
        return byteBuffer;
    }

    @Override // G5.InterfaceC0532m
    public final void reset() {
        flush();
        this.f4489f = InterfaceC0532m.f4426a;
        C0530k c0530k = C0530k.f4421e;
        this.f4487d = c0530k;
        this.f4488e = c0530k;
        this.f4485b = c0530k;
        this.f4486c = c0530k;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
