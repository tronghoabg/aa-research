package E;

import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416f implements InterfaceC0413c, InterfaceC0417g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2741a;

    public /* synthetic */ C0416f(int i5) {
        this.f2741a = i5;
    }

    public static final C0411a d(int i5, String str) {
        WeakHashMap weakHashMap = S.f2713s;
        return new C0411a(i5, str);
    }

    public static final P e(int i5, String str) {
        WeakHashMap weakHashMap = S.f2713s;
        return new P(new C(0, 0, 0, 0), str);
    }

    @Override // E.InterfaceC0417g
    public void a(L0.b bVar, int i5, int[] sizes, int[] outPositions) {
        AbstractC3340k.e(bVar, "<this>");
        AbstractC3340k.e(sizes, "sizes");
        AbstractC3340k.e(outPositions, "outPositions");
        AbstractC0419i.b(sizes, outPositions, false);
    }

    @Override // E.InterfaceC0413c
    public float b() {
        return 0;
    }

    @Override // E.InterfaceC0413c
    public void c(L0.b bVar, int i5, int[] sizes, L0.i layoutDirection, int[] outPositions) {
        AbstractC3340k.e(bVar, "<this>");
        AbstractC3340k.e(sizes, "sizes");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        AbstractC3340k.e(outPositions, "outPositions");
        if (layoutDirection == L0.i.f6806a) {
            AbstractC0419i.b(sizes, outPositions, false);
        } else {
            AbstractC0419i.c(i5, sizes, outPositions, true);
        }
    }

    public String toString() {
        switch (this.f2741a) {
            case 0:
                return "Arrangement#Start";
            case 1:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
