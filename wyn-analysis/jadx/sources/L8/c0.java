package l8;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class c0 extends d0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f40090b = new c0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f40091c = new c0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40092a;

    public /* synthetic */ c0(int i5) {
        this.f40092a = i5;
    }

    @Override // l8.d0
    public final d0 a() {
        switch (this.f40092a) {
            case 0:
                return f40091c;
            default:
                return f40090b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f40092a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f40092a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
