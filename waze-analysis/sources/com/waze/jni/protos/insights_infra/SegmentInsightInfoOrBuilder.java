package com.waze.jni.protos.insights_infra;

import com.google.v.fj;
import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.insights_infra.SegmentInsightInfo;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface SegmentInsightInfoOrBuilder extends fj {
    SegmentInsightInfo.Id getId();

    SegmentInsightInfo.PositionRelativeToSegment getPositionRelativeToSegment();

    int getPositionRelativeToSegmentValue();

    InsightPriority getPriority();

    int getRemainingDistanceMeters();

    int getRemainingDurationSeconds();

    SegmentInsightInfo.AlertInfo getSourceAlertInfos(int i2);

    int getSourceAlertInfosCount();

    List<SegmentInsightInfo.AlertInfo> getSourceAlertInfosList();

    boolean hasId();

    boolean hasPriority();

    boolean hasRemainingDurationSeconds();
}
