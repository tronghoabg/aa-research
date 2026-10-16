package Yf;

import A7.AbstractC0279p0;
import java.nio.charset.CharacterCodingException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class C extends J5.f {

    /* renamed from: f, reason: collision with root package name */
    public final xa.d f16810f;

    /* renamed from: g, reason: collision with root package name */
    public final char[] f16811g;

    /* renamed from: h, reason: collision with root package name */
    public int f16812h = 128;

    /* renamed from: i, reason: collision with root package name */
    public final C1297c f16813i;

    public C(xa.d dVar, char[] cArr) throws CharacterCodingException {
        this.f16810f = dVar;
        this.f16811g = cArr;
        this.f16813i = new C1297c(cArr);
        I(0);
    }

    @Override // J5.f
    public final int A(int i5) throws CharacterCodingException {
        C1297c c1297c = this.f16813i;
        if (i5 < c1297c.f16852b) {
            return i5;
        }
        this.f5633b = i5;
        o();
        return (this.f5633b != 0 || c1297c.length() == 0) ? -1 : 0;
    }

    @Override // J5.f
    public int E() throws CharacterCodingException {
        int iA;
        char c10;
        int i5 = this.f5633b;
        while (true) {
            iA = A(i5);
            if (iA == -1 || !((c10 = this.f16813i.f16851a[iA]) == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t')) {
                break;
            }
            i5 = iA + 1;
        }
        this.f5633b = iA;
        return iA;
    }

    @Override // J5.f
    public final String F(int i5, int i10) {
        C1297c c1297c = this.f16813i;
        return Bf.r.Z(c1297c.f16851a, i5, Math.min(i10, c1297c.f16852b));
    }

    public final void I(int i5) throws CharacterCodingException {
        C1297c c1297c = this.f16813i;
        char[] buffer = c1297c.f16851a;
        if (i5 != 0) {
            int i10 = this.f5633b;
            AbstractC3340k.e(buffer, "<this>");
            System.arraycopy(buffer, i10, buffer, 0, (i10 + i5) - i10);
        }
        int i11 = c1297c.f16852b;
        while (true) {
            if (i5 == i11) {
                break;
            }
            xa.d dVar = this.f16810f;
            dVar.getClass();
            AbstractC3340k.e(buffer, "buffer");
            int iA = ((j) dVar.f47873b).a(buffer, i5, i11 - i5);
            if (iA == -1) {
                c1297c.f16852b = Math.min(c1297c.f16851a.length, i5);
                this.f16812h = -1;
                break;
            }
            i5 += iA;
        }
        this.f5633b = 0;
    }

    public final void J() {
        C1302h c1302h = C1302h.f16858c;
        c1302h.getClass();
        char[] array = this.f16811g;
        AbstractC3340k.e(array, "array");
        if (array.length == 16384) {
            c1302h.e(array);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // J5.f
    public final void b(int i5, int i10) {
        ((StringBuilder) this.f5636e).append(this.f16813i.f16851a, i5, i10 - i5);
    }

    @Override // J5.f
    public boolean c() throws CharacterCodingException {
        o();
        int i5 = this.f5633b;
        while (true) {
            int iA = A(i5);
            if (iA == -1) {
                this.f5633b = iA;
                return false;
            }
            char c10 = this.f16813i.f16851a[iA];
            if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                this.f5633b = iA;
                return J5.f.w(c10);
            }
            i5 = iA + 1;
        }
    }

    @Override // J5.f
    public final String e() throws CharacterCodingException {
        char[] cArr;
        h('\"');
        int i5 = this.f5633b;
        C1297c c1297c = this.f16813i;
        int i10 = c1297c.f16852b;
        int i11 = i5;
        while (true) {
            cArr = c1297c.f16851a;
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (cArr[i11] == '\"') {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            int iA = A(i5);
            if (iA != -1) {
                return k(c1297c, this.f5633b, iA);
            }
            int i12 = this.f5633b;
            int i13 = i12 - 1;
            J5.f.r(this, AbstractC0279p0.l("Expected quotation mark '\"', but had '", (i12 == c1297c.f16852b || i13 < 0) ? "EOF" : String.valueOf(c1297c.f16851a[i13]), "' instead"), i13, null, 4);
            throw null;
        }
        for (int i14 = i5; i14 < i11; i14++) {
            if (cArr[i14] == '\\') {
                return k(c1297c, this.f5633b, i14);
            }
        }
        this.f5633b = i11 + 1;
        return Bf.r.Z(cArr, i5, Math.min(i11, c1297c.f16852b));
    }

    @Override // J5.f
    public byte f() throws CharacterCodingException {
        o();
        int i5 = this.f5633b;
        while (true) {
            int iA = A(i5);
            if (iA == -1) {
                this.f5633b = iA;
                return (byte) 10;
            }
            int i10 = iA + 1;
            byte bF = r.f(this.f16813i.f16851a[iA]);
            if (bF != 3) {
                this.f5633b = i10;
                return bF;
            }
            i5 = i10;
        }
    }

    @Override // J5.f
    public void h(char c10) throws CharacterCodingException {
        o();
        int i5 = this.f5633b;
        while (true) {
            int iA = A(i5);
            if (iA == -1) {
                this.f5633b = iA;
                H(c10);
                throw null;
            }
            int i10 = iA + 1;
            char c11 = this.f16813i.f16851a[iA];
            if (c11 != ' ' && c11 != '\n' && c11 != '\r' && c11 != '\t') {
                this.f5633b = i10;
                if (c11 == c10) {
                    return;
                }
                H(c10);
                throw null;
            }
            i5 = i10;
        }
    }

    @Override // J5.f
    public final void o() throws CharacterCodingException {
        int i5 = this.f16813i.f16852b - this.f5633b;
        if (i5 > this.f16812h) {
            return;
        }
        I(i5);
    }

    @Override // J5.f
    public final CharSequence t() {
        return this.f16813i;
    }

    @Override // J5.f
    public final String x(String keyToMatch, boolean z2) {
        AbstractC3340k.e(keyToMatch, "keyToMatch");
        return null;
    }
}
