package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes2.dex */
public final class ajtt {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public final ajtp a(String str) {
        ahgm.e(str, "Scheme name");
        ajtp ajtpVar = (ajtp) this.a.get(str);
        if (ajtpVar != null) {
            return ajtpVar;
        }
        throw new IllegalStateException(a.bq(str, "Scheme '", "' not registered."));
    }

    public final void b(ajtp ajtpVar) {
    }
}
