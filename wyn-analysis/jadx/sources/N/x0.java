package N;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class x0 implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f7960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7962c;

    public x0(w0 w0Var, int i5, int i10) {
        this.f7960a = w0Var;
        this.f7961b = i5;
        this.f7962c = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i5;
        ArrayList arrayList;
        int iL;
        w0 w0Var = this.f7960a;
        if (w0Var.f7950g != this.f7962c) {
            throw new ConcurrentModificationException();
        }
        HashMap map = w0Var.f7952i;
        C0716c c0716c = null;
        int i10 = this.f7961b;
        if (map != null) {
            if (w0Var.f7949f) {
                C0718d.v("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i10 >= 0 && i10 < (i5 = w0Var.f7945b) && (iL = C0718d.L((arrayList = w0Var.f7951h), i10, i5)) >= 0) {
                c0716c = (C0716c) arrayList.get(iL);
            }
            if (c0716c != null) {
            }
        }
        return new G(w0Var, i10 + 1, w0Var.f7944a[(i10 * 5) + 3] + i10);
    }
}
