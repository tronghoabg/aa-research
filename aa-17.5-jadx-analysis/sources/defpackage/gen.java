package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gen implements gdo {
    public final List a = new ArrayList();
    private final gdo b;

    public gen(gdo gdoVar) {
        this.b = gdoVar;
    }

    @Override // defpackage.gdo
    public final boolean a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((gem) it.next()).a()) {
                return true;
            }
        }
        this.b.a();
        return true;
    }
}
