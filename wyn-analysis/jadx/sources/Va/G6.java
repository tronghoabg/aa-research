package Va;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class G6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) arrayList.get(0);
        int i5 = P6.f13596U + 111;
        P6.f13595T = i5 % 128;
        if (i5 % 2 != 0) {
            P6.H0(diagnosticEvent);
            throw null;
        }
        String strH0 = P6.H0(diagnosticEvent);
        P6.f13595T = (P6.f13596U + 51) % 128;
        return strH0;
    }
}
