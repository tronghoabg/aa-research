package t0;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: t0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4039D implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C4039D f45430b = new C4039D(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45431a;

    public /* synthetic */ C4039D(int i5) {
        this.f45431a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f45431a) {
            case 0:
                t a5 = (t) obj;
                t b5 = (t) obj2;
                AbstractC3340k.e(a5, "a");
                AbstractC3340k.e(b5, "b");
                int iG = AbstractC3340k.g(b5.f45518h, a5.f45518h);
                return iG != 0 ? iG : AbstractC3340k.g(a5.hashCode(), b5.hashCode());
            default:
                t l12 = (t) obj;
                t l22 = (t) obj2;
                AbstractC3340k.e(l12, "l1");
                AbstractC3340k.e(l22, "l2");
                int iG2 = AbstractC3340k.g(l12.f45518h, l22.f45518h);
                return iG2 != 0 ? iG2 : AbstractC3340k.g(l12.hashCode(), l22.hashCode());
        }
    }
}
