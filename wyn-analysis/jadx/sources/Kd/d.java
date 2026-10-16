package Kd;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Ld.c f6741a;

    /* renamed from: b, reason: collision with root package name */
    public int f6742b;

    /* renamed from: c, reason: collision with root package name */
    public int f6743c;

    /* renamed from: d, reason: collision with root package name */
    public c f6744d;

    public d(Ld.c builder) {
        AbstractC3340k.e(builder, "builder");
        this.f6741a = builder;
        this.f6744d = (c) f.f6747b.C();
    }

    public final Ld.b a(String str) {
        if (this.f6742b == 0) {
            return null;
        }
        int i5 = Ld.f.f7094a;
        int iAbs = Math.abs(Ld.f.a(str, 0, str.length()));
        int i10 = this.f6743c;
        while (true) {
            int i11 = iAbs % i10;
            int i12 = i11 * 6;
            if (this.f6744d.a(i12) == -1) {
                return null;
            }
            if (b(str, i12)) {
                return (Ld.b) this.f6741a.subSequence(this.f6744d.a(i12 + 3), this.f6744d.a(i12 + 4));
            }
            iAbs = i11 + 1;
            i10 = this.f6743c;
        }
    }

    public final boolean b(CharSequence charSequence, int i5) {
        int iA = this.f6744d.a(i5 + 1);
        int iA2 = this.f6744d.a(i5 + 2);
        int i10 = Ld.f.f7094a;
        Ld.c cVar = this.f6741a;
        AbstractC3340k.e(cVar, "<this>");
        if (iA2 - iA != charSequence.length()) {
            return false;
        }
        for (int i11 = iA; i11 < iA2; i11++) {
            int iCharAt = cVar.charAt(i11);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = charSequence.charAt(i11 - iA);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    public final void c(int i5, int i10, int i11, int i12) {
        int i13;
        int i14 = this.f6742b;
        double d3 = i14;
        int i15 = this.f6743c;
        if (d3 >= i15 * 0.75d) {
            c cVar = this.f6744d;
            this.f6742b = 0;
            this.f6743c = (i15 * 2) | 128;
            c cVar2 = (c) f.f6747b.C();
            int size = (cVar.f6740a.size() * 2) | 1;
            for (int i16 = 0; i16 < size; i16++) {
                cVar2.f6740a.add(f.f6746a.C());
            }
            this.f6744d = cVar2;
            Af.l lVarX = S3.f.x(new b(cVar, null));
            while (lVarX.hasNext()) {
                int iIntValue = ((Number) lVarX.next()).intValue();
                c(cVar.a(iIntValue + 1), cVar.a(iIntValue + 2), cVar.a(iIntValue + 3), cVar.a(iIntValue + 4));
            }
            f.f6747b.S(cVar);
            if (i14 != this.f6742b) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        Ld.c cVar3 = this.f6741a;
        int iAbs = Math.abs(Ld.f.a(cVar3, i5, i10));
        CharSequence charSequenceSubSequence = cVar3.subSequence(i5, i10);
        int i17 = iAbs % this.f6743c;
        int i18 = -1;
        while (true) {
            i13 = i17 * 6;
            if (this.f6744d.a(i13) == -1) {
                break;
            }
            if (b(charSequenceSubSequence, i13)) {
                i18 = i17;
            }
            i17 = (i17 + 1) % this.f6743c;
        }
        this.f6744d.b(i13, iAbs);
        this.f6744d.b(i13 + 1, i5);
        this.f6744d.b(i13 + 2, i10);
        this.f6744d.b(i13 + 3, i11);
        this.f6744d.b(i13 + 4, i12);
        this.f6744d.b(i13 + 5, -1);
        if (i18 != -1) {
            this.f6744d.b((i18 * 6) + 5, i17);
        }
        this.f6742b++;
    }

    public final void d() {
        this.f6742b = 0;
        this.f6743c = 0;
        e eVar = f.f6747b;
        eVar.S(this.f6744d);
        this.f6744d = (c) eVar.C();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        e eVar = f.f6746a;
        c cVar = this.f6744d;
        cVar.getClass();
        Af.l lVarX = S3.f.x(new b(cVar, null));
        while (lVarX.hasNext()) {
            int iIntValue = ((Number) lVarX.next()).intValue();
            sb2.append((CharSequence) "");
            int iA = this.f6744d.a(iIntValue + 1);
            int iA2 = this.f6744d.a(iIntValue + 2);
            sb2.append(this.f6741a.subSequence(iA, iA2));
            sb2.append((CharSequence) " => ");
            sb2.append(r5.subSequence(this.f6744d.a(iIntValue + 3), this.f6744d.a(iIntValue + 4)));
            sb2.append((CharSequence) "\n");
        }
        return sb2.toString();
    }
}
