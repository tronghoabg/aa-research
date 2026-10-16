package com.google.android.datatransport.runtime.scheduling.a;

import androidx.compose.foundation.style.StylePropertiesKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f4235a;

    /* renamed from: b, reason: collision with root package name */
    private int f4236b;

    /* renamed from: c, reason: collision with root package name */
    private int f4237c;

    /* renamed from: d, reason: collision with root package name */
    private long f4238d;

    /* renamed from: e, reason: collision with root package name */
    private int f4239e;

    /* renamed from: f, reason: collision with root package name */
    private byte f4240f;

    final b a() {
        if (this.f4240f == 31) {
            return new b(this.f4235a, this.f4236b, this.f4237c, this.f4238d, this.f4239e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f4240f & 1) == 0) {
            sb.append(" maxStorageSizeInBytes");
        }
        if ((this.f4240f & 2) == 0) {
            sb.append(" loadBatchSize");
        }
        if ((this.f4240f & 4) == 0) {
            sb.append(" criticalSectionEnterTimeoutMs");
        }
        if ((this.f4240f & 8) == 0) {
            sb.append(" eventCleanUpAge");
        }
        if ((this.f4240f & StylePropertiesKt.BottomId) == 0) {
            sb.append(" maxBlobByteSizePerRow");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    final void b() {
        this.f4237c = 10000;
        this.f4240f = (byte) (this.f4240f | 4);
    }

    final void c() {
        this.f4238d = 604800000L;
        this.f4240f = (byte) (this.f4240f | 8);
    }

    final void d() {
        this.f4236b = 200;
        this.f4240f = (byte) (this.f4240f | 2);
    }

    final void e() {
        this.f4239e = 81920;
        this.f4240f = (byte) (this.f4240f | StylePropertiesKt.BottomId);
    }

    final void f() {
        this.f4235a = 10485760L;
        this.f4240f = (byte) (this.f4240f | 1);
    }
}
