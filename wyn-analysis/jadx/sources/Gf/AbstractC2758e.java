package gf;

import a9.C1341a;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import k1.C3114a;
import k1.C3115b;
import k1.S;

/* renamed from: gf.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2758e {

    /* renamed from: a, reason: collision with root package name */
    public int f35890a;

    /* renamed from: b, reason: collision with root package name */
    public int f35891b;

    /* renamed from: c, reason: collision with root package name */
    public int f35892c;

    /* renamed from: d, reason: collision with root package name */
    public Object f35893d;

    public AbstractC2758e() {
        if (C1341a.f17400b == null) {
            C1341a.f17400b = new C1341a();
        }
    }

    public int a(int i5) {
        if (i5 < this.f35892c) {
            return ((ByteBuffer) this.f35893d).getShort(this.f35891b + i5);
        }
        return 0;
    }

    public void c() {
        if (((C2759f) this.f35893d).f35902h != this.f35892c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i5 = this.f35890a;
            C2759f c2759f = (C2759f) this.f35893d;
            if (i5 >= c2759f.f35900f || c2759f.f35897c[i5] >= 0) {
                return;
            } else {
                this.f35890a = i5 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f35891b) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f35891b) {
            tag = d(view);
        } else {
            tag = view.getTag(this.f35890a);
            if (!((Class) this.f35893d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = S.d(view);
            C3115b c3115b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C3114a ? ((C3114a) accessibilityDelegateD).f38796a : new C3115b(accessibilityDelegateD);
            if (c3115b == null) {
                c3115b = new C3115b();
            }
            S.m(view, c3115b);
            view.setTag(this.f35890a, obj);
            S.h(this.f35892c, view);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f35890a < ((C2759f) this.f35893d).f35900f;
    }

    public void remove() {
        c();
        if (this.f35891b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C2759f c2759f = (C2759f) this.f35893d;
        c2759f.d();
        c2759f.m(this.f35891b);
        this.f35891b = -1;
        this.f35892c = c2759f.f35902h;
    }
}
