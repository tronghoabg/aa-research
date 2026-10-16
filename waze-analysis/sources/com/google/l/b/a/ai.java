package com.google.l.b.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.l.u f12247a;

    ai(com.google.l.u uVar) {
        this.f12247a = uVar;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        bVar.i();
        while (bVar.p()) {
            arrayList.add(Long.valueOf(((Number) this.f12247a.b(bVar)).longValue()));
        }
        bVar.k();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        cVar.b();
        int length = atomicLongArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            this.f12247a.d(cVar, Long.valueOf(atomicLongArray.get(i2)));
        }
        cVar.d();
    }
}
