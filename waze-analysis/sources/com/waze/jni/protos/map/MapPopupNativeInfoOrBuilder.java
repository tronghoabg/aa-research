package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.map.MapPopupNativeInfo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MapPopupNativeInfoOrBuilder extends fj {
    MapPopupNativeInfo.DetailsPopupInfo getDetailsPopupInfo();

    MapPopupNativeInfo.PopupInfoCase getPopupInfoCase();

    MapPopupNativeInfo.WazerPopupInfo getWazerPopupInfo();

    boolean hasDetailsPopupInfo();

    boolean hasWazerPopupInfo();
}
