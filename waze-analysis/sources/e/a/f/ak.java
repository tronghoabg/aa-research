package e.a.f;

import e.a.d.kg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak implements kg {

    /* renamed from: a, reason: collision with root package name */
    private final k.h f47650a;

    /* renamed from: b, reason: collision with root package name */
    private int f47651b;

    /* renamed from: c, reason: collision with root package name */
    private int f47652c;

    ak(k.h hVar, int i2) {
        this.f47650a = hVar;
        this.f47651b = i2;
    }

    @Override // e.a.d.kg
    public final int a() {
        return this.f47652c;
    }

    @Override // e.a.d.kg
    public final int b() {
        return this.f47651b;
    }

    @Override // e.a.d.kg
    public final void c(byte b2) {
        this.f47650a.ae(b2);
        this.f47651b--;
        this.f47652c++;
    }

    @Override // e.a.d.kg
    public final void d(byte[] bArr, int i2, int i3) {
        this.f47650a.aa(bArr, i2, i3);
        this.f47651b -= i3;
        this.f47652c += i3;
    }

    final k.h e() {
        return this.f47650a;
    }
}
