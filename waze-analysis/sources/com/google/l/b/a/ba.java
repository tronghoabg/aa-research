package com.google.l.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ba implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f12252a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f12253b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.l.u f12254c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f12255d;

    ba(Class cls, Class cls2, com.google.l.u uVar, int i2) {
        this.f12255d = i2;
        this.f12252a = cls;
        this.f12253b = cls2;
        this.f12254c = uVar;
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        if (this.f12255d != 0) {
            Class clsC = aVar.c();
            if (clsC == this.f12253b || clsC == this.f12252a) {
                return this.f12254c;
            }
            return null;
        }
        Class clsC2 = aVar.c();
        if (clsC2 == this.f12252a || clsC2 == this.f12253b) {
            return this.f12254c;
        }
        return null;
    }

    public final String toString() {
        int i2 = this.f12255d;
        Class cls = this.f12252a;
        if (i2 != 0) {
            Class cls2 = this.f12253b;
            com.google.l.u uVar = this.f12254c;
            return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + String.valueOf(uVar) + "]";
        }
        Class cls3 = this.f12253b;
        com.google.l.u uVar2 = this.f12254c;
        return "Factory[type=" + cls.getName() + "+" + cls3.getName() + ",adapter=" + String.valueOf(uVar2) + "]";
    }

    ba(Class cls, Class cls2, com.google.l.u uVar, int i2, byte[] bArr) {
        this.f12255d = i2;
        this.f12253b = cls;
        this.f12252a = cls2;
        this.f12254c = uVar;
    }
}
