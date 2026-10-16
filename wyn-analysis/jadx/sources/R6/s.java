package r6;

import E5.B0;
import E5.L0;
import u6.v;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f44518a;

    /* renamed from: b, reason: collision with root package name */
    public final B0[] f44519b;

    /* renamed from: c, reason: collision with root package name */
    public final n[] f44520c;

    /* renamed from: d, reason: collision with root package name */
    public final L0 f44521d;

    /* renamed from: e, reason: collision with root package name */
    public final R1.q f44522e;

    public s(B0[] b0Arr, n[] nVarArr, L0 l02, R1.q qVar) {
        this.f44519b = b0Arr;
        this.f44520c = (n[]) nVarArr.clone();
        this.f44521d = l02;
        this.f44522e = qVar;
        this.f44518a = b0Arr.length;
    }

    public final boolean a(s sVar, int i5) {
        return sVar != null && v.a(this.f44519b[i5], sVar.f44519b[i5]) && v.a(this.f44520c[i5], sVar.f44520c[i5]);
    }

    public final boolean b(int i5) {
        return this.f44519b[i5] != null;
    }
}
