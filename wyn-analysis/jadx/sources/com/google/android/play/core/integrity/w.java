package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes4.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f27248a = this;

    /* renamed from: b, reason: collision with root package name */
    private final i8.i f27249b;

    /* renamed from: c, reason: collision with root package name */
    private final i8.i f27250c;

    /* renamed from: d, reason: collision with root package name */
    private final i8.i f27251d;

    /* renamed from: e, reason: collision with root package name */
    private final i8.i f27252e;

    /* renamed from: f, reason: collision with root package name */
    private final i8.i f27253f;

    /* renamed from: g, reason: collision with root package name */
    private final i8.i f27254g;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        J4.c cVar = new J4.c(context, false);
        this.f27249b = cVar;
        i8.g gVarB = i8.g.b(bb.f27185a);
        this.f27250c = gVarB;
        au auVar = new au(cVar, n.f27239a);
        this.f27251d = auVar;
        i8.g gVarB2 = i8.g.b(new bp(cVar, gVarB, auVar, n.f27239a));
        this.f27252e = gVarB2;
        i8.g gVarB3 = i8.g.b(new bu(gVarB2));
        this.f27253f = gVarB3;
        this.f27254g = i8.g.b(new ba(gVarB2, gVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f27254g.a();
    }
}
