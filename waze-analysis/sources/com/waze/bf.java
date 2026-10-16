package com.waze;

import android.os.Handler;
import com.waze.jni.protos.navigate.DriveTo;
import l.a.alx;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public interface bf {
    void addDangerZoneStat(int i2, int i3, alx alxVar, DriveTo.DangerZoneStatType dangerZoneStatType);

    void getDangerZoneType(int i2, int i3, com.waze.jni.a<DriveTo.DangerZoneType> aVar, boolean z);

    void setUpdateHandler(int i2, Handler handler);

    void unsetUpdateHandler(int i2, Handler handler);
}
