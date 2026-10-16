package defpackage;

import com.google.android.gms.car.CarCall;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class thc {
    List a;
    CarCall b;
    public Set c;
    Map d;
    public Boolean e;
    public Integer f;
    public Integer g;
    final /* synthetic */ the h;

    public thc(the theVar) {
        this.h = theVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        thc thcVar;
        if (b()) {
            this.d = new HashMap();
            for (CarCall carCall : this.c) {
                this.d.put(Integer.valueOf(carCall.a), carCall);
            }
            the theVar = this.h;
            synchronized (theVar.c) {
                thcVar = theVar.d;
                if (!this.c.isEmpty() && this.g.intValue() == 0) {
                    if (thcVar == null || !thcVar.b() || thcVar.g.intValue() == 0) {
                        ((ype) ((ype) the.a.h()).ai(9060)).u("Using default audio state since new state has active calls and invalid audio state");
                        this.g = 2;
                        this.f = Integer.valueOf(2 | this.f.intValue());
                    } else {
                        ((ype) ((ype) the.a.h()).ai(9061)).u("Using previous audio state since new state has active calls and invalid audio state");
                        this.g = thcVar.g;
                        this.f = thcVar.f;
                    }
                }
                theVar.d = this;
            }
            if (thcVar == null || !thcVar.b()) {
                the.e(theVar.b, this.c);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    mjv.y(thd.f, (CarCall) it.next());
                }
                return;
            }
            ymn ymnVarP = yrm.p(this.c, thcVar.c);
            ymn ymnVarP2 = yrm.p(thcVar.c, this.c);
            Set set = thcVar.c;
            Set set2 = this.c;
            set.getClass();
            set2.getClass();
            ymj ymjVar = new ymj(set, set2);
            List<qrv> list = theVar.b;
            the.e(list, ymnVarP);
            for (qrv qrvVar : list) {
                yno it2 = ((yml) ymnVarP2).iterator();
                while (it2.hasNext()) {
                    CarCall carCall2 = (CarCall) it2.next();
                    qrvVar.e(carCall2);
                    qrvVar.d(carCall2);
                }
                yno it3 = ymjVar.iterator();
                while (it3.hasNext()) {
                    int i = ((CarCall) it3.next()).a;
                    Map map = thcVar.d;
                    Integer numValueOf = Integer.valueOf(i);
                    CarCall carCall3 = (CarCall) map.get(numValueOf);
                    carCall3.getClass();
                    CarCall carCall4 = (CarCall) this.d.get(numValueOf);
                    carCall4.getClass();
                    CarCall carCall5 = carCall4.b;
                    if (the.d(carCall3.b, carCall5)) {
                        qrvVar.j(carCall4, carCall5);
                    }
                    List list2 = carCall3.c;
                    List list3 = carCall4.c;
                    if (the.d(list2, list3)) {
                        qrvVar.f(carCall4, list3);
                    }
                    String str = carCall3.d;
                    String str2 = carCall4.d;
                    if (the.d(str, str2)) {
                        qrvVar.k(carCall4, str2);
                    }
                    int i2 = carCall3.e;
                    int i3 = carCall4.e;
                    if (i2 != i3) {
                        qrvVar.l(carCall4, i3);
                    }
                    CarCall.Details details = carCall3.f;
                    CarCall.Details details2 = carCall4.f;
                    if (details2 == null) {
                        ((ype) ((ype) the.a.g()).ai((char) 9064)).u("New call has null details.");
                    } else if (details == null || the.d(details.a, details2.a) || the.d(details.b, details2.b) || the.d(details.c, details2.c) || the.d(details.f, details2.f) || the.d(details.e, details2.e) || details.d != details2.d) {
                        qrvVar.i(carCall4, details2);
                    }
                    List listB = the.b(carCall3, thcVar);
                    List listB2 = the.b(carCall4, this);
                    if (!listB.containsAll(listB2) || !listB2.containsAll(listB)) {
                        qrvVar.g(carCall4, listB2);
                    }
                }
                CarCall carCall6 = this.b;
                if (carCall6 != null && this.a != null && this.d.containsKey(Integer.valueOf(carCall6.a))) {
                    qrvVar.h(this.b, this.a);
                }
            }
            if (this.c.isEmpty()) {
                return;
            }
            if (thcVar.e.equals(this.e) && thcVar.g.equals(this.g) && thcVar.f.equals(this.f)) {
                return;
            }
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((qrv) it4.next()).b(this.e.booleanValue(), this.g.intValue(), this.f.intValue());
            }
        }
    }

    public final boolean b() {
        return (this.c == null || this.e == null || this.f == null || this.g == null) ? false : true;
    }
}
