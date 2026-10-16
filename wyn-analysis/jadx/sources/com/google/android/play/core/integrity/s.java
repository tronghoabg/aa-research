package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes4.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f27241a = this;

    /* renamed from: b, reason: collision with root package name */
    private final i8.i f27242b;

    /* renamed from: c, reason: collision with root package name */
    private final i8.i f27243c;

    /* renamed from: d, reason: collision with root package name */
    private final i8.i f27244d;

    /* renamed from: e, reason: collision with root package name */
    private final i8.i f27245e;

    /* renamed from: f, reason: collision with root package name */
    private final i8.i f27246f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        J4.c cVar = new J4.c(context, false);
        this.f27242b = cVar;
        i8.g gVarB = i8.g.b(ac.f27132a);
        this.f27243c = gVarB;
        au auVar = new au(cVar, l.f27234a);
        this.f27244d = auVar;
        i8.g gVarB2 = i8.g.b(new al(cVar, gVarB, auVar, l.f27234a));
        this.f27245e = gVarB2;
        this.f27246f = i8.g.b(new ab(gVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f27246f.a();
    }
}
