package com.waze.jni.protos.planned_drive;

import com.google.v.fj;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface LoadPlannedDriveOptionsResponseOrBuilder extends fj {
    LoadPlannedDriveOptionsResponse.ResponseCode getCode();

    int getCodeValue();

    int getEtas(int i2);

    int getEtasCount();

    List<Integer> getEtasList();

    boolean getIsTooLate();

    long getTimes(int i2);

    int getTimesCount();

    List<Long> getTimesList();

    boolean hasIsTooLate();
}
