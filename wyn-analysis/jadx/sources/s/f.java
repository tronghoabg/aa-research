package S;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public final e f10811d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10812e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10813f;

    /* renamed from: g, reason: collision with root package name */
    public int f10814g;

    public f(e eVar, o[] oVarArr) {
        super(eVar.f10807c, oVarArr);
        this.f10811d = eVar;
        this.f10814g = eVar.f10809e;
    }

    public final void d(int i5, n nVar, Object obj, int i10) {
        int i11 = i10 * 5;
        o[] oVarArr = this.f10802a;
        if (i11 <= 30) {
            int iZ = 1 << A6.h.z(i5, i11);
            if (nVar.h(iZ)) {
                oVarArr[i10].a(nVar.f10828d, Integer.bitCount(nVar.f10825a) * 2, nVar.f(iZ));
                this.f10803b = i10;
                return;
            } else {
                int iT = nVar.t(iZ);
                n nVarS = nVar.s(iT);
                oVarArr[i10].a(nVar.f10828d, Integer.bitCount(nVar.f10825a) * 2, iT);
                d(i5, nVarS, obj, i10 + 1);
                return;
            }
        }
        o oVar = oVarArr[i10];
        Object[] objArr = nVar.f10828d;
        oVar.a(objArr, objArr.length, 0);
        while (true) {
            o oVar2 = oVarArr[i10];
            if (AbstractC3340k.a(oVar2.f10829a[oVar2.f10831c], obj)) {
                this.f10803b = i10;
                return;
            } else {
                oVarArr[i10].f10831c += 2;
            }
        }
    }

    @Override // S.d, java.util.Iterator
    public final Object next() {
        if (this.f10811d.f10809e != this.f10814g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f10804c) {
            throw new NoSuchElementException();
        }
        o oVar = this.f10802a[this.f10803b];
        this.f10812e = oVar.f10829a[oVar.f10831c];
        this.f10813f = true;
        return super.next();
    }

    @Override // S.d, java.util.Iterator
    public final void remove() {
        if (!this.f10813f) {
            throw new IllegalStateException();
        }
        boolean z2 = this.f10804c;
        e eVar = this.f10811d;
        if (!z2) {
            K.c(eVar).remove(this.f10812e);
        } else {
            if (!z2) {
                throw new NoSuchElementException();
            }
            o oVar = this.f10802a[this.f10803b];
            Object obj = oVar.f10829a[oVar.f10831c];
            K.c(eVar).remove(this.f10812e);
            d(obj != null ? obj.hashCode() : 0, eVar.f10807c, obj, 0);
        }
        this.f10812e = null;
        this.f10813f = false;
        this.f10814g = eVar.f10809e;
    }
}
