package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1775v extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        ArrayList arrayList = new ArrayList();
        c3962a.a();
        while (c3962a.D()) {
            try {
                arrayList.add(Integer.valueOf(c3962a.W()));
            } catch (NumberFormatException e7) {
                throw new la.p(e7, 13);
            }
        }
        c3962a.i();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i5 = 0; i5 < size; i5++) {
            atomicIntegerArray.set(i5, ((Integer) arrayList.get(i5)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        c3963b.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i5 = 0; i5 < length; i5++) {
            c3963b.V(r6.get(i5));
        }
        c3963b.i();
    }
}
