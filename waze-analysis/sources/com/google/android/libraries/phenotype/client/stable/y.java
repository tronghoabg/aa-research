package com.google.android.libraries.phenotype.client.stable;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f6164a = new AtomicReferenceArray(20);

    /* renamed from: b, reason: collision with root package name */
    private final p f6165b;

    public y(p pVar) {
        this.f6165b = pVar;
    }

    public final k a(int i2, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.f6164a;
        k kVar = (k) atomicReferenceArray.get(11);
        if (kVar != null) {
            return kVar;
        }
        k kVarK = this.f6165b.k();
        while (!atomicReferenceArray.compareAndSet(11, null, kVarK)) {
            if (atomicReferenceArray.get(11) != null) {
                k kVar2 = (k) atomicReferenceArray.get(11);
                com.google.d.b.an.B(kVar2);
                return kVar2;
            }
        }
        return kVarK;
    }
}
