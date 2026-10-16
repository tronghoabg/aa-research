package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class aedx extends adlg {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public aedx(List list, AtomicInteger atomicInteger) {
        woy.O(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((adlg) it.next()).hashCode();
        }
        this.c = iHashCode;
    }

    @Override // defpackage.adlg
    public final adlc a(adld adldVar) {
        int andIncrement = this.b.getAndIncrement() & Alert.DURATION_SHOW_INDEFINITELY;
        List list = this.a;
        return ((adlg) list.get(andIncrement % list.size())).a(adldVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aedx)) {
            return false;
        }
        aedx aedxVar = (aedx) obj;
        if (aedxVar == this) {
            return true;
        }
        if (this.c == aedxVar.c && this.b == aedxVar.b) {
            List list = this.a;
            int size = list.size();
            List list2 = aedxVar.a;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        xxg xxgVarAn = woy.an(aedx.class);
        xxgVarAn.b("subchannelPickers", this.a);
        return xxgVarAn.toString();
    }
}
