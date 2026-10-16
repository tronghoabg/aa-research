package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.navigate.Instruction;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NavigationItemOrBuilder extends fj {
    String getAddress();

    v getAddressBytes();

    String getDistance();

    v getDistanceBytes();

    boolean getHov();

    String getIcon();

    v getIconBytes();

    Instruction.Type getInstruction();

    int getInstructionExit();

    int getInstructionSegmentIdx();

    int getInstructionValue();

    String getLabel();

    v getLabelBytes();

    int getLat();

    int getLon();

    int getNavSegmentIdx();

    NavigationRoadSign getRoadSign();

    int getRotation();

    boolean hasRoadSign();
}
