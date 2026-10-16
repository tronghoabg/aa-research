package com.waze.modules.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.waze.authentication.ai;
import com.waze.beacons.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements ai {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29801a;

    /* renamed from: b, reason: collision with root package name */
    private final g f29802b;

    public e(Context context, g gVar) {
        x.f(context, "context");
        x.f(gVar, "legacyPasswordStore");
        this.f29801a = context;
        this.f29802b = gVar;
    }

    @Override // com.waze.authentication.ai
    public final SharedPreferences a() {
        return com.waze.be.b.f16231a.a(this.f29801a);
    }

    @Override // com.waze.authentication.ai
    public final g b() {
        return this.f29802b;
    }
}
