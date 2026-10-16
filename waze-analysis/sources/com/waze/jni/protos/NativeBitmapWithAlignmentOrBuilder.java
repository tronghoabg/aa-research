package com.waze.jni.protos;

import com.google.v.fj;
import com.waze.jni.protos.EtaLabelDefinitions;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NativeBitmapWithAlignmentOrBuilder extends fj {
    EtaLabelDefinitions.PinAlignment getAlignment();

    int getAlignmentValue();

    NativeBitmap getBitmap();

    boolean hasBitmap();
}
