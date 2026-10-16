package com.waze.jni.protos;

import com.google.v.fj;
import com.waze.jni.protos.EtaLabelDefinitions;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EtaLabelRequestOrBuilder extends fj {
    EtaLabelData getLabelData();

    EtaLabelDefinitions.PinAlignment getPinAlignmentsToGenerate(int i2);

    int getPinAlignmentsToGenerateCount();

    List<EtaLabelDefinitions.PinAlignment> getPinAlignmentsToGenerateList();

    int getPinAlignmentsToGenerateValue(int i2);

    List<Integer> getPinAlignmentsToGenerateValueList();

    int getRequestId();

    boolean hasLabelData();
}
