package E;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415e implements InterfaceC0414d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2740b;

    public C0415e(float f10) {
        this.f2739a = f10;
        this.f2740b = f10;
    }

    @Override // E.InterfaceC0417g
    public final void a(L0.b bVar, int i5, int[] sizes, int[] outPositions) {
        AbstractC3340k.e(bVar, "<this>");
        AbstractC3340k.e(sizes, "sizes");
        AbstractC3340k.e(outPositions, "outPositions");
        c(bVar, i5, sizes, L0.i.f6806a, outPositions);
    }

    @Override // E.InterfaceC0413c
    public final float b() {
        return this.f2740b;
    }

    @Override // E.InterfaceC0413c
    public final void c(L0.b bVar, int i5, int[] sizes, L0.i layoutDirection, int[] outPositions) {
        int i10;
        int iMin;
        AbstractC3340k.e(bVar, "<this>");
        AbstractC3340k.e(sizes, "sizes");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        AbstractC3340k.e(outPositions, "outPositions");
        if (sizes.length == 0) {
            return;
        }
        int iJ = bVar.j(this.f2739a);
        boolean z2 = layoutDirection == L0.i.f6807b;
        C0416f c0416f = AbstractC0419i.f2743a;
        if (z2) {
            i10 = 0;
            iMin = 0;
            for (int length = sizes.length - 1; -1 < length; length--) {
                int i11 = sizes[length];
                int iMin2 = Math.min(i10, i5 - i11);
                outPositions[length] = iMin2;
                iMin = Math.min(iJ, (i5 - iMin2) - i11);
                i10 = outPositions[length] + i11 + iMin;
            }
        } else {
            int length2 = sizes.length;
            int i12 = 0;
            i10 = 0;
            iMin = 0;
            int i13 = 0;
            while (i12 < length2) {
                int i14 = sizes[i12];
                int iMin3 = Math.min(i10, i5 - i14);
                outPositions[i13] = iMin3;
                int iMin4 = Math.min(iJ, (i5 - iMin3) - i14);
                int i15 = outPositions[i13] + i14 + iMin4;
                i12++;
                iMin = iMin4;
                i10 = i15;
                i13++;
            }
        }
        if (i10 - iMin < i5) {
            int iH = AbstractC4345a.H((1 + (layoutDirection != L0.i.f6806a ? (-1.0f) * (-1) : -1.0f)) * ((i5 - r5) / 2.0f));
            int length3 = outPositions.length;
            for (int i16 = 0; i16 < length3; i16++) {
                outPositions[i16] = outPositions[i16] + iH;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0415e)) {
            return false;
        }
        if (!L0.d.a(this.f2739a, ((C0415e) obj).f2739a)) {
            return false;
        }
        Object obj2 = C0418h.f2742i;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0418h.f2742i.hashCode() + (((Float.floatToIntBits(this.f2739a) * 31) + 1) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = AbstractC0279p0.q("", "Arrangement#spacedAligned(");
        sbQ.append((Object) L0.d.b(this.f2739a));
        sbQ.append(", ");
        sbQ.append(C0418h.f2742i);
        sbQ.append(')');
        return sbQ.toString();
    }
}
