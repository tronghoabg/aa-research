package V5;

import java.util.Comparator;
import java.util.Map;
import p9.C3778C;
import p9.C3785f;
import w9.AbstractC4397p;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13143b;

    public /* synthetic */ s(Object obj, int i5) {
        this.f13142a = i5;
        this.f13143b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13142a) {
            case 0:
                x xVar = (x) this.f13143b;
                return xVar.a(obj2) - xVar.a(obj);
            case 1:
                d2.u uVar = (d2.u) this.f13143b;
                return uVar.a(obj2) - uVar.a(obj);
            case 2:
                C3785f c3785f = (C3785f) obj;
                C3785f c3785f2 = (C3785f) obj2;
                C3778C c3778c = (C3778C) this.f13143b;
                c3778c.getClass();
                int iD = AbstractC4397p.d(C3778C.c(c3785f), C3778C.c(c3785f2));
                return iD != 0 ? iD : ((p9.u) c3778c.f43324c).a().compare(c3785f.f43353b, c3785f2.f43353b);
            case 3:
                s9.k kVar = (s9.k) obj;
                s9.k kVar2 = (s9.k) obj2;
                int iCompare = ((O7.d) this.f13143b).compare(kVar, kVar2);
                return iCompare == 0 ? kVar.f45380a.compareTo(kVar2.f45380a) : iCompare;
            default:
                return ((q6.d) this.f13143b).compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
        }
    }
}
