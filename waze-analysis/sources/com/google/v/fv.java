package com.google.v;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fv extends fz {
    fv() {
        super(null);
    }

    @Override // com.google.v.fz
    public final void a() {
        if (!i()) {
            for (int i2 = 0; i2 < c(); i2++) {
                Map.Entry entryF = f(i2);
                if (((fw) entryF).a().g()) {
                    entryF.setValue(DesugarCollections.unmodifiableList((List) entryF.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((dg) entry.getKey()).g()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
