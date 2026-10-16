package com.waze.t.c;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.core.app.ActivityCompat;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f40855a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f40856b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f40857c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Activity f40858d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f40859e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f40860f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ MutableState f40861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(boolean z, Context context, h.g.a.l lVar, Activity activity, k kVar, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f40855a = z;
        this.f40856b = context;
        this.f40857c = lVar;
        this.f40858d = activity;
        this.f40859e = kVar;
        this.f40860f = managedActivityResultLauncher;
        this.f40861g = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f40855a, this.f40856b, this.f40857c, this.f40858d, this.f40859e, this.f40860f, this.f40861g, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (this.f40855a) {
            if (n.l(this.f40856b)) {
                this.f40857c.invoke(o.f40868a);
            } else {
                Activity activity = this.f40858d;
                if (activity == null || !ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.RECORD_AUDIO")) {
                    this.f40860f.launch("android.permission.RECORD_AUDIO");
                } else {
                    this.f40861g.setValue(Boolean.valueOf(true));
                    this.f40859e.a().d();
                }
            }
        }
        return ab.f48028a;
    }
}
