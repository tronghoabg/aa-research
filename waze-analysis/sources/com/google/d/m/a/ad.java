package com.google.d.m.a;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad extends ab {
    @Override // com.google.d.m.a.ab
    final int a(ae aeVar) {
        int i2;
        synchronized (aeVar) {
            i2 = aeVar.remainingField - 1;
            aeVar.remainingField = i2;
        }
        return i2;
    }

    @Override // com.google.d.m.a.ab
    final void b(ae aeVar, Set set) {
        synchronized (aeVar) {
            if (aeVar.seenExceptionsField == null) {
                aeVar.seenExceptionsField = set;
            }
        }
    }
}
