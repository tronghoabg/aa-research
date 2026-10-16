package com.waze.l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import com.waze.ix;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f25098a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25099b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25100c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25101d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f25102e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f25103f;

    j(v vVar, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, ManagedActivityResultLauncher managedActivityResultLauncher3, Context context, h.g.a.a aVar) {
        this.f25098a = vVar;
        this.f25099b = managedActivityResultLauncher;
        this.f25100c = managedActivityResultLauncher2;
        this.f25101d = managedActivityResultLauncher3;
        this.f25102e = context;
        this.f25103f = aVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        f fVar = (f) obj;
        if (x.n(fVar, d.f25083a)) {
            this.f25098a.n();
            this.f25099b.launch(Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"} : new String[0]);
        } else if (x.n(fVar, e.f25084a)) {
            this.f25100c.launch(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        } else if (x.n(fVar, c.f25082a)) {
            ManagedActivityResultLauncher managedActivityResultLauncher = this.f25101d;
            Intent intentG = ix.g(this.f25102e);
            x.e(intentG, "createSystemSettingsIntent(...)");
            managedActivityResultLauncher.launch(intentG);
        } else if (x.n(fVar, b.f25081a)) {
            this.f25098a.g();
            this.f25103f.invoke();
        } else if (fVar != null) {
            throw new h.i();
        }
        if (fVar != null && !x.n(fVar, b.f25081a)) {
            this.f25098a.g();
        }
        return ab.f48028a;
    }
}
