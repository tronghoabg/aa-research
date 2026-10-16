package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class tjp extends tjo {
    public Throwable a;

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.k) {
            if (obj instanceof tjr) {
                arrayList.add(obj);
            }
        }
        tjr tjrVar = (tjr) woy.bP(arrayList);
        if (tjrVar != null) {
            return (wb) tjrVar.d();
        }
        throw new IllegalStateException("Compose screen did not emit a template or emitted more than one.");
    }

    @Override // defpackage.tjo
    public final String b() {
        return "Root";
    }
}
