package com.google.firebase.sessions.b;

import android.content.Context;
import android.os.Bundle;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f10864a;

    public a(Context context) {
        x.f(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f10864a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.b.p
    public final Boolean a() {
        Bundle bundle = this.f10864a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.b.p
    public final Double b() {
        Bundle bundle = this.f10864a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.b.p
    public final /* synthetic */ Object c(h.c.e eVar) {
        return ab.f48028a;
    }

    @Override // com.google.firebase.sessions.b.p
    public final h.o.a d() {
        Bundle bundle = this.f10864a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return h.o.a.z(h.o.c.i(bundle.getInt("firebase_sessions_sessions_restart_timeout"), h.o.d.f48273d));
        }
        return null;
    }
}
