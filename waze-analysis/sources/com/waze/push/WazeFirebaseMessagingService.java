package com.waze.push;

import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.z;
import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class WazeFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.az.b f33416b;

    public WazeFirebaseMessagingService() {
        com.waze.az.b bVar = new com.waze.az.b();
        this.f33416b = bVar;
        bVar.c(new e());
        bVar.c(new q(this));
        bVar.c(new f());
        bVar.c(new a(this));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(z zVar) {
        g gVar = new g(zVar);
        if (!gVar.y()) {
            com.waze.shared_infra.i.h.c("WazeFirebaseMessagingService: Received no data");
        } else {
            if (!this.f33416b.d(gVar) || NativeManager.isAppStarted()) {
                return;
            }
            com.waze.shared_infra.i.h.a("WazeFirebaseMessagingService: Stopping service");
            stopService(new Intent(this, (Class<?>) WazeFirebaseMessagingService.class));
            System.exit(0);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            com.waze.shared_infra.i.h.c("WazeFirebaseMessagingService: onNewToken: received null token");
            return;
        }
        com.waze.shared_infra.i.h.a("WazeFirebaseMessagingService: onNewToken: received token");
        o.c(getApplicationContext(), str);
        NativeManager.handlePushToken();
    }
}
