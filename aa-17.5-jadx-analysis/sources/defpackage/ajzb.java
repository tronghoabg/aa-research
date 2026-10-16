package defpackage;

import java.util.Collection;

@Deprecated
/* loaded from: classes2.dex */
public final class ajzb implements ajup, ajuq {
    private final ajuo a = new ajza(null, false);

    @Override // defpackage.ajup
    public final ajuo a(akas akasVar) {
        if (akasVar == null) {
            return new ajza(null, false);
        }
        Collection collection = (Collection) akasVar.a("http.protocol.cookie-datepatterns");
        return new ajza(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, akasVar.d("http.protocol.single-cookie-header", false));
    }

    @Override // defpackage.ajuq
    public final ajuo b(akba akbaVar) {
        return this.a;
    }
}
