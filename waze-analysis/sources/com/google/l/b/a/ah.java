package com.google.l.b.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ah extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        bVar.i();
        while (bVar.p()) {
            try {
                arrayList.add(Integer.valueOf(bVar.b()));
            } catch (NumberFormatException e2) {
                throw new com.google.l.q(e2);
            }
        }
        bVar.k();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        cVar.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i2 = 0; i2 < length; i2++) {
            cVar.i(r5.get(i2));
        }
        cVar.d();
    }
}
