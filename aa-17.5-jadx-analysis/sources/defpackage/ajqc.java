package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

@Deprecated
/* loaded from: classes2.dex */
public final class ajqc implements ajsl {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.ajsl
    public final /* synthetic */ Object a(String str) {
        return new ajqb(this, str);
    }

    public final void b(String str, ajpz ajpzVar) {
        this.a.put(str.toLowerCase(Locale.ENGLISH), ajpzVar);
    }

    public final ajpy c(String str) throws IllegalStateException {
        ahgm.e(str, "Name");
        ajpz ajpzVar = (ajpz) this.a.get(str.toLowerCase(Locale.ENGLISH));
        if (ajpzVar != null) {
            return ajpzVar.a();
        }
        throw new IllegalStateException("Unsupported authentication scheme: ".concat(String.valueOf(str)));
    }
}
