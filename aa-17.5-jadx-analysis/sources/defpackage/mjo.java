package defpackage;

import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Optional;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class mjo implements Comparator {
    private static final mjq a = new mjq();
    private static final miz b = new miz();

    private static final mjn a(RadioProgramInfo radioProgramInfo) {
        RadioProgramSelector radioProgramSelector = radioProgramInfo.a;
        if (lws.j(radioProgramSelector.a.a)) {
            return mjn.a;
        }
        Optional optionalF = lws.f(radioProgramSelector);
        if (!optionalF.isEmpty()) {
            if (lws.k(((Long) optionalF.get()).longValue())) {
                return mjn.b;
            }
            if (lws.i(((Long) optionalF.get()).longValue())) {
                return mjn.c;
            }
        }
        return mjn.d;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        RadioProgramInfo radioProgramInfo = (RadioProgramInfo) obj;
        RadioProgramInfo radioProgramInfo2 = (RadioProgramInfo) obj2;
        mjn mjnVarA = a(radioProgramInfo);
        mjn mjnVarA2 = a(radioProgramInfo2);
        return mjnVarA != mjnVarA2 ? mjnVarA.compareTo(mjnVarA2) : mjnVarA == mjn.a ? a.compare(radioProgramInfo, radioProgramInfo2) : b.compare(radioProgramInfo, radioProgramInfo2);
    }
}
