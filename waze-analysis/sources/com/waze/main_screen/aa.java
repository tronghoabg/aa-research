package com.waze.main_screen;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f25606a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f25607b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25608c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f25609d;

    aa(ab abVar, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2) {
        this.f25606a = abVar;
        this.f25607b = context;
        this.f25608c = managedActivityResultLauncher;
        this.f25609d = managedActivityResultLauncher2;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.sharedui.api.c cVar = (com.waze.sharedui.api.c) obj;
        ab abVar = this.f25606a;
        Object objA = abVar.f25617c.a(this.f25607b, cVar, this.f25608c, this.f25609d, abVar.f25616b, eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }
}
