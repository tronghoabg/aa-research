package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements java.util.Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f50139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50140c;

    public /* synthetic */ c(java.util.Comparator comparator, Object obj, int i2) {
        this.f50138a = i2;
        this.f50139b = comparator;
        this.f50140c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = this.f50138a;
        Object obj3 = this.f50140c;
        java.util.Comparator comparator = this.f50139b;
        switch (i2) {
            case 0:
                java.util.Comparator comparator2 = (java.util.Comparator) obj3;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
