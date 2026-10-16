package com.google.firebase.components;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements com.google.firebase.g.c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f8912a;

    @Override // com.google.firebase.g.c
    public final Object a() {
        int i2 = this.f8912a;
        if (i2 == 0) {
            return null;
        }
        if (i2 == 1) {
            return Collections.EMPTY_SET;
        }
        if (i2 == 2) {
            int i3 = FirebaseMessaging.f10058c;
            return null;
        }
        if (i2 == 3) {
            return Executors.newSingleThreadScheduledExecutor();
        }
        int i4 = com.google.firebase.remoteconfig.i.f10614a;
        return null;
    }
}
