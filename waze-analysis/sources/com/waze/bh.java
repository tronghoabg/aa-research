package com.waze;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.q f16749a;

    bh(h.g.a.q qVar) {
        this.f16749a = qVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        h.g.b.x.f(message, NotificationCompat.CATEGORY_MESSAGE);
        super.handleMessage(message);
        if (message.what == DriveToNativeManager.UH_DANGER_ZONE_FOUND) {
            Bundle data = message.getData();
            int i2 = data.getInt(DriveToNativeManager.EXTRA_LON, 0);
            int i3 = data.getInt(DriveToNativeManager.EXTRA_LAT, 0);
            DriveTo.DangerZoneType dangerZoneTypeForNumber = DriveTo.DangerZoneType.forNumber(data.getInt(DriveToNativeManager.EXTRA_DANGER_ZONE_TYPE));
            if (dangerZoneTypeForNumber != null) {
                this.f16749a.invoke(Integer.valueOf(i2), Integer.valueOf(i3), dangerZoneTypeForNumber);
            }
        }
    }
}
