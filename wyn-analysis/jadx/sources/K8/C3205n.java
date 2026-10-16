package k8;

import A.AbstractC0213f;
import Y2.B;
import a2.v;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: k8.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3205n implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f39306b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f39307c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3195d f39308d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f39311g;

    /* renamed from: a, reason: collision with root package name */
    public int f39305a = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f39309e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f39310f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C3205n(v vVar, B b5, CharSequence charSequence) {
        this.f39311g = vVar;
        this.f39308d = (AbstractC3195d) b5.f16383b;
        this.f39307c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC3195d abstractC3195d;
        Fe.e.x(this.f39305a != 4);
        int iF = AbstractC0213f.f(this.f39305a);
        if (iF == 0) {
            return true;
        }
        if (iF != 2) {
            this.f39305a = 4;
            int i5 = this.f39309e;
            while (true) {
                int length = this.f39309e;
                if (length == -1) {
                    this.f39305a = 3;
                    string = null;
                    break;
                }
                C3194c c3194c = (C3194c) this.f39311g.f17322b;
                CharSequence charSequence = this.f39307c;
                int length2 = charSequence.length();
                Fe.e.u(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (c3194c.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.f39309e = -1;
                } else {
                    this.f39309e = length + 1;
                }
                int i10 = this.f39309e;
                if (i10 == i5) {
                    int i11 = i10 + 1;
                    this.f39309e = i11;
                    if (i11 > charSequence.length()) {
                        this.f39309e = -1;
                    }
                } else {
                    while (true) {
                        abstractC3195d = this.f39308d;
                        if (i5 >= length || !abstractC3195d.a(charSequence.charAt(i5))) {
                            break;
                        }
                        i5++;
                    }
                    while (length > i5 && abstractC3195d.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    int i12 = this.f39310f;
                    if (i12 == 1) {
                        length = charSequence.length();
                        this.f39309e = -1;
                        while (length > i5 && abstractC3195d.a(charSequence.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.f39310f = i12 - 1;
                    }
                    string = charSequence.subSequence(i5, length).toString();
                }
            }
            this.f39306b = string;
            if (this.f39305a != 3) {
                this.f39305a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f39305a = 2;
        String str = this.f39306b;
        this.f39306b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
