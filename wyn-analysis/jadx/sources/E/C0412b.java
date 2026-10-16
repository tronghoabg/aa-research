package E;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412b implements InterfaceC0414d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2738b;

    public C0412b(int i5) {
        this.f2737a = i5;
        switch (i5) {
            case 1:
                this.f2738b = 0;
                break;
            case 2:
                this.f2738b = 0;
                break;
            case 3:
                this.f2738b = 0;
                break;
            default:
                this.f2738b = 0;
                break;
        }
    }

    @Override // E.InterfaceC0417g
    public final void a(L0.b bVar, int i5, int[] sizes, int[] outPositions) {
        switch (this.f2737a) {
            case 0:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(outPositions, "outPositions");
                AbstractC0419i.a(i5, sizes, outPositions, false);
                break;
            case 1:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(outPositions, "outPositions");
                AbstractC0419i.d(i5, sizes, outPositions, false);
                break;
            case 2:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(outPositions, "outPositions");
                AbstractC0419i.e(i5, sizes, outPositions, false);
                break;
            default:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(outPositions, "outPositions");
                AbstractC0419i.f(i5, sizes, outPositions, false);
                break;
        }
    }

    @Override // E.InterfaceC0413c
    public final float b() {
        switch (this.f2737a) {
        }
        return this.f2738b;
    }

    @Override // E.InterfaceC0413c
    public final void c(L0.b bVar, int i5, int[] sizes, L0.i layoutDirection, int[] outPositions) {
        switch (this.f2737a) {
            case 0:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                AbstractC3340k.e(outPositions, "outPositions");
                if (layoutDirection != L0.i.f6806a) {
                    AbstractC0419i.a(i5, sizes, outPositions, true);
                    break;
                } else {
                    AbstractC0419i.a(i5, sizes, outPositions, false);
                    break;
                }
            case 1:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                AbstractC3340k.e(outPositions, "outPositions");
                if (layoutDirection != L0.i.f6806a) {
                    AbstractC0419i.d(i5, sizes, outPositions, true);
                    break;
                } else {
                    AbstractC0419i.d(i5, sizes, outPositions, false);
                    break;
                }
            case 2:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                AbstractC3340k.e(outPositions, "outPositions");
                if (layoutDirection != L0.i.f6806a) {
                    AbstractC0419i.e(i5, sizes, outPositions, true);
                    break;
                } else {
                    AbstractC0419i.e(i5, sizes, outPositions, false);
                    break;
                }
            default:
                AbstractC3340k.e(bVar, "<this>");
                AbstractC3340k.e(sizes, "sizes");
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                AbstractC3340k.e(outPositions, "outPositions");
                if (layoutDirection != L0.i.f6806a) {
                    AbstractC0419i.f(i5, sizes, outPositions, true);
                    break;
                } else {
                    AbstractC0419i.f(i5, sizes, outPositions, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f2737a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
