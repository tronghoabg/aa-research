package com.google.d.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final CharSequence f7223a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f7224b;

    /* renamed from: c, reason: collision with root package name */
    int f7225c;

    /* renamed from: d, reason: collision with root package name */
    int f7226d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p f7227e;

    /* renamed from: f, reason: collision with root package name */
    private Object f7228f;

    /* renamed from: g, reason: collision with root package name */
    private int f7229g;

    b(ag agVar, CharSequence charSequence) {
        this.f7229g = 2;
        this.f7225c = 0;
        this.f7224b = agVar.f7204a;
        this.f7226d = Integer.MAX_VALUE;
        this.f7223a = charSequence;
    }

    static int b(int i2) {
        return i2 + 1;
    }

    final int a(int i2) {
        return this.f7227e.d(this.f7223a, i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iA;
        int iB;
        an.u(this.f7229g != 4);
        int i2 = this.f7229g;
        int i3 = i2 - 1;
        String string = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f7229g = 4;
            int i4 = this.f7225c;
            while (true) {
                int i5 = this.f7225c;
                if (i5 == -1) {
                    this.f7229g = 3;
                    break;
                }
                iA = a(i5);
                if (iA == -1) {
                    iA = this.f7223a.length();
                    this.f7225c = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.f7225c = iB;
                }
                if (iB == i4) {
                    int i6 = iB + 1;
                    this.f7225c = i6;
                    if (i6 > this.f7223a.length()) {
                        this.f7225c = -1;
                    }
                } else {
                    if (i4 < iA) {
                        this.f7223a.charAt(i4);
                    }
                    if (i4 < iA) {
                        this.f7223a.charAt(iA - 1);
                    }
                    if (!this.f7224b || i4 != iA) {
                        break;
                    }
                    i4 = this.f7225c;
                }
            }
            int i7 = this.f7226d;
            if (i7 == 1) {
                CharSequence charSequence = this.f7223a;
                int length = charSequence.length();
                this.f7225c = -1;
                if (length > i4) {
                    charSequence.charAt(length - 1);
                }
                iA = length;
            } else {
                this.f7226d = i7 - 1;
            }
            string = this.f7223a.subSequence(i4, iA).toString();
            this.f7228f = string;
            if (this.f7229g != 3) {
                this.f7229g = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7229g = 2;
        T t = (T) this.f7228f;
        this.f7228f = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    b(ag agVar, CharSequence charSequence, p pVar) {
        this(agVar, charSequence);
        this.f7227e = pVar;
    }
}
