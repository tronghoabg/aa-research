package defpackage;

import java.util.Collection;

@Deprecated
/* loaded from: classes2.dex */
public final class ajyl implements ajup, ajuq {
    private final ajuo a = new ajyk(null);

    @Override // defpackage.ajup
    public final ajuo a(akas akasVar) {
        if (akasVar == null) {
            return new ajyk(null);
        }
        Collection collection = (Collection) akasVar.a("http.protocol.cookie-datepatterns");
        return new ajyk(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null);
    }

    @Override // defpackage.ajuq
    public final ajuo b(akba akbaVar) {
        return this.a;
    }
}
