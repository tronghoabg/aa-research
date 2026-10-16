package rd;

import H6.l;
import cg.C1618g;
import cg.C1621j;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: rd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3969d {

    /* renamed from: a, reason: collision with root package name */
    public int f44770a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f44771b = -1;

    /* renamed from: d, reason: collision with root package name */
    public Object f44773d = null;

    /* renamed from: e, reason: collision with root package name */
    public Object f44774e = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f44772c = 1;

    public void a(C3967b c3967b) {
        int i5;
        int i10 = c3967b.f44761c;
        if (i10 > 4096) {
            Arrays.fill((C3967b[]) this.f44774e, (Object) null);
            this.f44771b = ((C3967b[]) this.f44774e).length - 1;
            this.f44770a = 0;
            this.f44772c = 0;
            return;
        }
        int i11 = (this.f44772c + i10) - 4096;
        if (i11 > 0) {
            int length = ((C3967b[]) this.f44774e).length - 1;
            int i12 = 0;
            while (true) {
                i5 = this.f44771b;
                if (length < i5 || i11 <= 0) {
                    break;
                }
                int i13 = ((C3967b[]) this.f44774e)[length].f44761c;
                i11 -= i13;
                this.f44772c -= i13;
                this.f44770a--;
                i12++;
                length--;
            }
            C3967b[] c3967bArr = (C3967b[]) this.f44774e;
            int i14 = i5 + 1;
            System.arraycopy(c3967bArr, i14, c3967bArr, i14 + i12, this.f44770a);
            this.f44771b += i12;
        }
        int i15 = this.f44770a + 1;
        C3967b[] c3967bArr2 = (C3967b[]) this.f44774e;
        if (i15 > c3967bArr2.length) {
            C3967b[] c3967bArr3 = new C3967b[c3967bArr2.length * 2];
            System.arraycopy(c3967bArr2, 0, c3967bArr3, c3967bArr2.length, c3967bArr2.length);
            this.f44771b = ((C3967b[]) this.f44774e).length - 1;
            this.f44774e = c3967bArr3;
        }
        int i16 = this.f44771b;
        this.f44771b = i16 - 1;
        ((C3967b[]) this.f44774e)[i16] = c3967b;
        this.f44770a++;
        this.f44772c += i10;
    }

    public void b(String str) {
        if (str == null || "".equals(str)) {
            this.f44773d = null;
            return;
        }
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.f44773d = str;
        } else {
            l.f("Invalid value passed to setMaxAdContentRating: ".concat(str));
        }
    }

    public void c(int i5) {
        if (i5 == -1 || i5 == 0 || i5 == 1) {
            this.f44770a = i5;
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 57);
        sb2.append("Invalid value passed to setTagForChildDirectedTreatment: ");
        sb2.append(i5);
        l.f(sb2.toString());
    }

    public void d(int i5) {
        if (i5 == -1 || i5 == 0 || i5 == 1) {
            this.f44771b = i5;
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 52);
        sb2.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
        sb2.append(i5);
        l.f(sb2.toString());
    }

    public void e(C1621j c1621j) {
        f(c1621j.d(), 127, 0);
        ((C1618g) this.f44773d).Q(c1621j);
    }

    public void f(int i5, int i10, int i11) {
        C1618g c1618g = (C1618g) this.f44773d;
        if (i5 < i10) {
            c1618g.X(i5 | i11);
            return;
        }
        c1618g.X(i11 | i10);
        int i12 = i5 - i10;
        while (i12 >= 128) {
            c1618g.X(128 | (i12 & 127));
            i12 >>>= 7;
        }
        c1618g.X(i12);
    }
}
