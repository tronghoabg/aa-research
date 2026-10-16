package Va;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class H6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) arrayList.get(0);
        int i5 = (P6.f13596U + 65) % 128;
        P6.f13595T = i5;
        P6.f13596U = (i5 + 83) % 128;
        Map<String, String> stringTagsMap = diagnosticEvent.getStringTagsMap();
        int i10 = P6.f13596U + 103;
        P6.f13595T = i10 % 128;
        if (i10 % 2 == 0) {
            return stringTagsMap;
        }
        throw null;
    }
}
