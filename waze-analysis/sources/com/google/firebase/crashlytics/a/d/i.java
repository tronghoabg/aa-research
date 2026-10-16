package com.google.firebase.crashlytics.a.d;

import j$.util.Objects;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    boolean f9245a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ StringBuilder f9246b;

    i(m mVar, StringBuilder sb) {
        this.f9246b = sb;
        Objects.requireNonNull(mVar);
        this.f9245a = true;
    }

    @Override // com.google.firebase.crashlytics.a.d.l
    public final void a(InputStream inputStream, int i2) {
        if (this.f9245a) {
            this.f9245a = false;
        } else {
            this.f9246b.append(", ");
        }
        this.f9246b.append(i2);
    }
}
