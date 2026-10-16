package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fa extends cf {

    /* renamed from: a, reason: collision with root package name */
    static final fa f7604a = new fa(new ep());

    /* renamed from: b, reason: collision with root package name */
    final transient ep f7605b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f7606c;

    /* renamed from: d, reason: collision with root package name */
    private transient ci f7607d;

    fa(ep epVar) {
        this.f7605b = epVar;
        long jC = 0;
        for (int i2 = 0; i2 < epVar.f7573c; i2++) {
            jC += epVar.c(i2);
        }
        this.f7606c = com.google.d.l.j.k(jC);
    }

    @Override // com.google.d.d.em
    public final int a(Object obj) {
        return this.f7605b.b(obj);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return false;
    }

    @Override // com.google.d.d.cf, com.google.d.d.em
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ci b() {
        ci ciVar = this.f7607d;
        if (ciVar != null) {
            return ciVar;
        }
        ey eyVar = new ey(this);
        this.f7607d = eyVar;
        return eyVar;
    }

    @Override // com.google.d.d.cf
    final el n(int i2) {
        ep epVar = this.f7605b;
        com.google.d.b.an.A(i2, epVar.f7573c);
        return new en(epVar, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.d.d.em
    public final int size() {
        return this.f7606c;
    }

    @Override // com.google.d.d.cf, com.google.d.d.bh
    Object writeReplace() {
        return new ez(this);
    }
}
