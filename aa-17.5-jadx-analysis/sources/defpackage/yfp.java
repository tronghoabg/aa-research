package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class yfp extends yfq {
    final transient int a;
    final transient int b;
    final /* synthetic */ yfq c;

    public yfp(yfq yfqVar, int i, int i2) {
        this.c = yfqVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.yfg
    public final int b() {
        return this.c.c() + this.a + this.b;
    }

    @Override // defpackage.yfg
    public final int c() {
        return this.c.c() + this.a;
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // defpackage.yfg
    public final Object[] g() {
        return this.c.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        woy.ai(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.yfq
    /* renamed from: i */
    public final yfq subList(int i, int i2) {
        woy.Y(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.yfq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.yfq, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
