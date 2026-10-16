package n2;

import N1.V;
import Q1.x;
import U1.Y;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f40897a;

    /* renamed from: b, reason: collision with root package name */
    public final Y[] f40898b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f40899c;

    /* renamed from: d, reason: collision with root package name */
    public final V f40900d;

    /* renamed from: e, reason: collision with root package name */
    public final R1.q f40901e;

    public t(Y[] yArr, q[] qVarArr, V v2, R1.q qVar) {
        Q1.k.c(yArr.length == qVarArr.length);
        this.f40898b = yArr;
        this.f40899c = (q[]) qVarArr.clone();
        this.f40900d = v2;
        this.f40901e = qVar;
        this.f40897a = yArr.length;
    }

    public final boolean a(t tVar, int i5) {
        if (tVar == null) {
            return false;
        }
        Y y10 = this.f40898b[i5];
        Y y11 = tVar.f40898b[i5];
        int i10 = x.f9724a;
        return Objects.equals(y10, y11) && Objects.equals(this.f40899c[i5], tVar.f40899c[i5]);
    }

    public final boolean b(int i5) {
        return this.f40898b[i5] != null;
    }
}
