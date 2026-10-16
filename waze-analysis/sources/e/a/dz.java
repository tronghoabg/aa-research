package e.a;

import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dz implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ea f47353a;

    dz(ea eaVar) {
        this.f47353a = eaVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ea eaVar = this.f47353a;
        int iA = eaVar.a(obj) - eaVar.a(obj2);
        return iA != 0 ? iA : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
