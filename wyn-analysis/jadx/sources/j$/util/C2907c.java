package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* renamed from: j$.util.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2907c implements java.util.Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f37783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37784c;

    public /* synthetic */ C2907c(java.util.Comparator comparator, Object obj, int i5) {
        this.f37782a = i5;
        this.f37783b = comparator;
        this.f37784c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f37782a) {
            case 0:
                int iCompare = this.f37783b.compare(obj, obj2);
                return iCompare != 0 ? iCompare : ((java.util.Comparator) this.f37784c).compare(obj, obj2);
            default:
                Function function = (Function) this.f37784c;
                return this.f37783b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
