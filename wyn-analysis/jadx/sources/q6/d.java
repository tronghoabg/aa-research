package q6;

import A.AbstractC0213f;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l8.AbstractC3399A;
import l8.C3443y;
import l8.d0;
import r6.k;
import r6.l;
import r9.C3946c;
import s6.C4019f;
import t0.t;
import w9.AbstractC4397p;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44152a;

    public /* synthetic */ d(int i5) {
        this.f44152a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i5 = 8;
        int i10 = 9;
        switch (this.f44152a) {
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() != -1) {
                    if (num2.intValue() != -1) {
                        break;
                    }
                } else if (num2.intValue() != -1) {
                    break;
                }
                break;
            case 4:
                d0 d0Var = l.f44454j;
                break;
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                break;
            case 9:
                k kVar = (k) obj;
                k kVar2 = (k) obj2;
                d0 d0VarA = (kVar.f44441e && kVar.f44444h) ? l.f44454j : l.f44454j.a();
                C3443y c3443y = AbstractC3399A.f40038a;
                int i11 = kVar.f44445i;
                break;
            case 10:
                C3946c c3946c = (C3946c) obj;
                C3946c c3946c2 = (C3946c) obj2;
                int iA = c3946c.f44606a.compareTo(c3946c2.f44606a);
                if (iA == 0) {
                    break;
                }
                break;
            case 11:
                C3946c c3946c3 = (C3946c) obj;
                C3946c c3946c4 = (C3946c) obj2;
                int iD = AbstractC4397p.d(c3946c3.f44607b, c3946c4.f44607b);
                if (iD == 0) {
                    break;
                }
                break;
            case 12:
                break;
            case 13:
                s9.a aVar = (s9.a) obj;
                s9.a aVar2 = (s9.a) obj2;
                int iCompare = Long.compare(aVar.f45359d.f45365a, aVar2.f45359d.f45365a);
                if (iCompare == 0) {
                    break;
                }
                break;
            case 15:
                C4019f c4019f = (C4019f) obj;
                C4019f c4019f2 = (C4019f) obj2;
                int iCompare2 = Integer.compare(c4019f2.f45176b, c4019f.f45176b);
                if (iCompare2 == 0) {
                    int iCompareTo = c4019f.f45177c.compareTo(c4019f2.f45177c);
                    if (iCompareTo == 0) {
                        break;
                    }
                }
                break;
            case 16:
                C4019f c4019f3 = (C4019f) obj;
                C4019f c4019f4 = (C4019f) obj2;
                int iCompare3 = Integer.compare(c4019f4.f45175a, c4019f3.f45175a);
                if (iCompare3 == 0) {
                    int iCompareTo2 = c4019f4.f45177c.compareTo(c4019f3.f45177c);
                    if (iCompareTo2 == 0) {
                        break;
                    }
                }
                break;
            case 18:
                s9.a aVar3 = (s9.a) obj;
                s9.a aVar4 = (s9.a) obj2;
                int iCompareTo3 = aVar3.f45357b.compareTo(aVar4.f45357b);
                if (iCompareTo3 == 0) {
                    Iterator it = aVar3.f45358c.iterator();
                    Iterator it2 = aVar4.f45358c.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        s9.d dVar = (s9.d) it.next();
                        s9.d dVar2 = (s9.d) it2.next();
                        dVar.getClass();
                        int iD2 = dVar.f45367a.compareTo(dVar2.f45367a);
                        int iA2 = iD2 != 0 ? iD2 : AbstractC0213f.a(dVar.f45368b, dVar2.f45368b);
                        if (iA2 != 0) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 21:
                t tVar = (t) obj;
                t tVar2 = (t) obj2;
                float f10 = tVar.f45535z;
                float f11 = tVar2.f45535z;
                if (f10 != f11) {
                    break;
                } else {
                    break;
                }
        }
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
