package defpackage;

import java.util.Collection;

@Deprecated
/* loaded from: classes2.dex */
public final class ajyt implements ajup, ajuq {
    private final ajuo a = new ajys(null);

    @Override // defpackage.ajup
    public final ajuo a(akas akasVar) {
        if (akasVar == null) {
            return new ajys(null);
        }
        Collection collection = (Collection) akasVar.a("http.protocol.cookie-datepatterns");
        return new ajys(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null);
    }

    @Override // defpackage.ajuq
    public final ajuo b(akba akbaVar) {
        return this.a;
    }
}
