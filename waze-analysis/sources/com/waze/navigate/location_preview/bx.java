package com.waze.navigate.location_preview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bx extends com.waze.reports_v2.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final Class f31700a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.m.z f31701b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f31702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(Class cls, com.waze.ui.m.z zVar) {
        super(null, null);
        h.g.b.x.f(cls, "theClass");
        h.g.b.x.f(zVar, "launcherId");
        this.f31700a = cls;
        this.f31701b = zVar;
        this.f31702c = new Bundle();
    }

    public final Intent a(Context context) {
        h.g.b.x.f(context, "context");
        Intent intentPutExtras = new Intent(context, (Class<?>) this.f31700a).putExtras(this.f31702c);
        h.g.b.x.e(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    public final Bundle b() {
        return this.f31702c;
    }

    public final com.waze.ui.m.z c() {
        return this.f31701b;
    }
}
