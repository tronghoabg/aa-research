package j7;

import java.util.Comparator;

/* renamed from: j7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3089b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C3089b f38672a = new C3089b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d7.d dVar = (d7.d) obj;
        d7.d dVar2 = (d7.d) obj2;
        return !dVar.f34122a.equals(dVar2.f34122a) ? dVar.f34122a.compareTo(dVar2.f34122a) : (dVar.V() > dVar2.V() ? 1 : (dVar.V() == dVar2.V() ? 0 : -1));
    }
}
