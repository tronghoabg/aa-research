package com.waze.jni.protos.copilot.data;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface CarRenderingInfoOrBuilder extends fj {
    String getCarName();

    v getCarNameBytes();

    boolean getIsFromServer();

    LightingRenderingInfo getLightingInfo();

    String getModelFileName();

    v getModelFileNameBytes();

    String getNormalTextureFilePath();

    v getNormalTextureFilePathBytes();

    float getScale();

    String getShareTextureFilePath();

    v getShareTextureFilePathBytes();

    String getTaxiTextureFilePath();

    v getTaxiTextureFilePathBytes();

    boolean hasLightingInfo();

    boolean hasShareTextureFilePath();

    boolean hasTaxiTextureFilePath();
}
