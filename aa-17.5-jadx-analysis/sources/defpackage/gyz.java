package defpackage;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gyz implements hem {
    public final geu a;
    public final Map b = new LinkedHashMap();

    public gyz(geu geuVar) {
        this.a = geuVar;
        ((ghl) geuVar.F(ghl.class)).b.add(new WeakReference(this));
    }

    public final void a(String str, Object obj) {
        if (((ggk) this.a.F(ggk.class)).q()) {
            this.b.put(str, obj);
        }
    }
}
