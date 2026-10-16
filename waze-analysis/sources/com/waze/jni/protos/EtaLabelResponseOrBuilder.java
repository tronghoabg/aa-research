package com.waze.jni.protos;

import com.google.v.fj;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EtaLabelResponseOrBuilder extends fj {
    NativeBitmapWithAlignment getNativeBitmaps(int i2);

    int getNativeBitmapsCount();

    List<NativeBitmapWithAlignment> getNativeBitmapsList();

    int getRequestId();
}
