package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class s extends q {

    /* renamed from: a, reason: collision with root package name */
    private static final WeakReference f5122a = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f5123b;

    s(byte[] bArr) {
        super(bArr);
        this.f5123b = f5122a;
    }

    protected abstract byte[] a();

    @Override // com.google.android.gms.common.q
    final byte[] e() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = (byte[]) this.f5123b.get();
            if (bArrA == null) {
                bArrA = a();
                this.f5123b = new WeakReference(bArrA);
            }
        }
        return bArrA;
    }
}
