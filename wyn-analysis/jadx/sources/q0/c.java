package Q0;

import A.AbstractC0213f;
import R0.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f9507b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9508c;

    /* renamed from: d, reason: collision with root package name */
    public final d f9509d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9510e;

    /* renamed from: f, reason: collision with root package name */
    public c f9511f;

    /* renamed from: i, reason: collision with root package name */
    public O0.f f9514i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f9506a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f9512g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f9513h = Integer.MIN_VALUE;

    public c(d dVar, int i5) {
        this.f9509d = dVar;
        this.f9510e = i5;
    }

    public final void a(c cVar, int i5) {
        b(cVar, i5, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i5, int i10, boolean z2) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z2 && !i(cVar)) {
            return false;
        }
        this.f9511f = cVar;
        if (cVar.f9506a == null) {
            cVar.f9506a = new HashSet();
        }
        HashSet hashSet = this.f9511f.f9506a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f9512g = i5;
        this.f9513h = i10;
        return true;
    }

    public final void c(int i5, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.f9506a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                R0.h.b(((c) it.next()).f9509d, i5, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f9508c) {
            return this.f9507b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f9509d.f9553g0 == 8) {
            return 0;
        }
        int i5 = this.f9513h;
        return (i5 == Integer.MIN_VALUE || (cVar = this.f9511f) == null || cVar.f9509d.f9553g0 != 8) ? this.f9512g : i5;
    }

    public final c f() {
        int i5 = this.f9510e;
        int iF = AbstractC0213f.f(i5);
        d dVar = this.f9509d;
        switch (iF) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f9525K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.f9523I;
            case 4:
                return dVar.f9524J;
            default:
                throw new AssertionError(N0.a.t(i5));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f9506a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f9511f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(Q0.c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            r1 = 6
            int r2 = r10.f9510e
            r3 = 1
            Q0.d r4 = r11.f9509d
            int r11 = r11.f9510e
            if (r11 != r2) goto L1c
            if (r2 != r1) goto L63
            boolean r11 = r4.f9519E
            if (r11 == 0) goto L65
            Q0.d r11 = r10.f9509d
            boolean r11 = r11.f9519E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = A.AbstractC0213f.f(r2)
            r6 = 8
            r7 = 9
            r8 = 4
            r9 = 2
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = N0.a.t(r2)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r1) goto L65
            if (r11 == r6) goto L65
            if (r11 == r7) goto L65
            goto L63
        L3a:
            if (r11 == r9) goto L65
            if (r11 != r8) goto L63
            goto L65
        L3f:
            r1 = 3
            if (r11 == r1) goto L48
            r1 = 5
            if (r11 != r1) goto L46
            goto L48
        L46:
            r1 = r0
            goto L49
        L48:
            r1 = r3
        L49:
            boolean r2 = r4 instanceof Q0.h
            if (r2 == 0) goto L52
            if (r1 != 0) goto L63
            if (r11 != r7) goto L65
            goto L63
        L52:
            return r1
        L53:
            if (r11 == r9) goto L5a
            if (r11 != r8) goto L58
            goto L5a
        L58:
            r1 = r0
            goto L5b
        L5a:
            r1 = r3
        L5b:
            boolean r2 = r4 instanceof Q0.h
            if (r2 == 0) goto L64
            if (r1 != 0) goto L63
            if (r11 != r6) goto L65
        L63:
            return r3
        L64:
            return r1
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.c.i(Q0.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f9511f;
        if (cVar != null && (hashSet = cVar.f9506a) != null) {
            hashSet.remove(this);
            if (this.f9511f.f9506a.size() == 0) {
                this.f9511f.f9506a = null;
            }
        }
        this.f9506a = null;
        this.f9511f = null;
        this.f9512g = 0;
        this.f9513h = Integer.MIN_VALUE;
        this.f9508c = false;
        this.f9507b = 0;
    }

    public final void k() {
        O0.f fVar = this.f9514i;
        if (fVar == null) {
            this.f9514i = new O0.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i5) {
        this.f9507b = i5;
        this.f9508c = true;
    }

    public final String toString() {
        return this.f9509d.f9555h0 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + N0.a.t(this.f9510e);
    }
}
