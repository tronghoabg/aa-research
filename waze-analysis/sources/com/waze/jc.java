package com.waze;

import android.content.Context;
import com.waze.OfflineNativeManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class jc implements OfflineNativeManager.CalendarUpdateProtobufListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f24930a;

    jc(OfflineNativeManager offlineNativeManager, Context context) {
        this.f24930a = context;
        Objects.requireNonNull(offlineNativeManager);
    }

    @Override // com.waze.OfflineNativeManager.CalendarUpdateProtobufListener
    public final void a(String str) {
        com.waze.shared_infra.i.h.a("CALENDAR got calendar update protobuf");
        if (str != null) {
            com.waze.shared_infra.i.h.a("CALENDAR sending offline command");
            Context context = this.f24930a;
            com.waze.ci.a.b.a();
            com.waze.ci.a.b.b(context, str);
            com.waze.shared_infra.i.h.a("CALENDAR sent offline command");
        }
    }
}
