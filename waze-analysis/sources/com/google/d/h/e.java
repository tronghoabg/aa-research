package com.google.d.h;

import com.google.d.b.an;
import j$.util.Objects;
import java.math.RoundingMode;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private volatile f f7907a;

    /* renamed from: b, reason: collision with root package name */
    final a f7908b;

    /* renamed from: c, reason: collision with root package name */
    final Character f7909c;

    /* renamed from: d, reason: collision with root package name */
    private volatile f f7910d;

    /* renamed from: e, reason: collision with root package name */
    private volatile f f7911e;

    e(a aVar, Character ch) {
        this.f7908b = aVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (aVar.h()) {
                z = false;
            }
        }
        an.q(z, "Padding character %s was already in alphabet", ch);
        this.f7909c = ch;
    }

    @Override // com.google.d.h.f
    int a(byte[] bArr, CharSequence charSequence) throws d {
        int i2;
        CharSequence charSequenceJ = j(charSequence);
        int length = charSequenceJ.length();
        a aVar = this.f7908b;
        if (!aVar.f(length)) {
            throw new d("Invalid input length " + charSequenceJ.length());
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < charSequenceJ.length()) {
            long jB = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i2 = aVar.f7899c;
                if (i5 >= i2) {
                    break;
                }
                jB <<= aVar.f7898b;
                if (i3 + i5 < charSequenceJ.length()) {
                    jB |= aVar.b(charSequenceJ.charAt(i6 + i3));
                    i6++;
                }
                i5++;
            }
            int i7 = aVar.f7900d;
            int i8 = i6 * aVar.f7898b;
            int i9 = (i7 - 1) * 8;
            while (i9 >= (i7 * 8) - i8) {
                bArr[i4] = (byte) ((jB >>> i9) & 255);
                i9 -= 8;
                i4++;
            }
            i3 += i2;
        }
        return i4;
    }

    f b(a aVar, Character ch) {
        return new e(aVar, ch);
    }

    @Override // com.google.d.h.f
    void c(Appendable appendable, byte[] bArr, int i2, int i3) {
        an.t(i2, i2 + i3, bArr.length);
        int i4 = 0;
        while (i4 < i3) {
            int i5 = this.f7908b.f7900d;
            k(appendable, bArr, i2 + i4, Math.min(i5, i3 - i4));
            i4 += i5;
        }
    }

    @Override // com.google.d.h.f
    final int d(int i2) {
        return (int) (((this.f7908b.f7898b * i2) + 7) / 8);
    }

    @Override // com.google.d.h.f
    final int e(int i2) {
        a aVar = this.f7908b;
        return aVar.f7899c * com.google.d.j.e.h(i2, aVar.f7900d, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f7908b.equals(eVar.f7908b) && Objects.equals(this.f7909c, eVar.f7909c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.d.h.f
    public final f f() {
        f fVarB = this.f7911e;
        if (fVarB == null) {
            a aVar = this.f7908b;
            a aVarC = aVar.c();
            fVarB = aVarC == aVar ? this : b(aVarC, this.f7909c);
            this.f7911e = fVarB;
        }
        return fVarB;
    }

    @Override // com.google.d.h.f
    public final f g() {
        f fVarB = this.f7910d;
        if (fVarB == null) {
            a aVar = this.f7908b;
            a aVarD = aVar.d();
            fVarB = aVarD == aVar ? this : b(aVarD, this.f7909c);
            this.f7910d = fVarB;
        }
        return fVarB;
    }

    @Override // com.google.d.h.f
    public final f h() {
        return this.f7909c == null ? this : b(this.f7908b, null);
    }

    public final int hashCode() {
        return this.f7908b.hashCode() ^ Objects.hashCode(this.f7909c);
    }

    @Override // com.google.d.h.f
    public final f i() {
        f fVarB = this.f7907a;
        if (fVarB == null) {
            a aVar = this.f7908b;
            a aVarE = aVar.e();
            fVarB = aVarE == aVar ? this : b(aVarE, this.f7909c);
            this.f7907a = fVarB;
        }
        return fVarB;
    }

    @Override // com.google.d.h.f
    final CharSequence j(CharSequence charSequence) {
        an.B(charSequence);
        Character ch = this.f7909c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    final void k(Appendable appendable, byte[] bArr, int i2, int i3) {
        an.t(i2, i2 + i3, bArr.length);
        a aVar = this.f7908b;
        int i4 = aVar.f7900d;
        int i5 = 0;
        an.l(i3 <= i4);
        long j2 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            j2 = (j2 | (bArr[i2 + i6] & 255)) << 8;
        }
        int i7 = (i3 + 1) * 8;
        int i8 = aVar.f7898b;
        while (i5 < i3 * 8) {
            appendable.append(aVar.a(aVar.f7897a & ((int) (j2 >>> ((i7 - i8) - i5)))));
            i5 += i8;
        }
        Character ch = this.f7909c;
        if (ch != null) {
            while (i5 < i4 * 8) {
                ch.charValue();
                appendable.append('=');
                i5 += i8;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        a aVar = this.f7908b;
        sb.append(aVar);
        if (8 % aVar.f7898b != 0) {
            Character ch = this.f7909c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    e(String str, String str2, Character ch) {
        this(new a(str, str2.toCharArray()), ch);
    }
}
