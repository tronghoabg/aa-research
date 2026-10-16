package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

@Deprecated
/* loaded from: classes2.dex */
public final class ajus implements ajsl {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.ajsl
    public final /* synthetic */ Object a(String str) {
        return new ajur(this, str);
    }

    public final void b(String str, ajup ajupVar) {
        this.a.put(str.toLowerCase(Locale.ENGLISH), ajupVar);
    }
}
