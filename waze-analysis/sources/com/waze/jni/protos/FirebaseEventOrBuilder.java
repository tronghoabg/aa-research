package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.FirebaseEvent;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface FirebaseEventOrBuilder extends fj {
    String getName();

    v getNameBytes();

    FirebaseEvent.Param getParams(int i2);

    int getParamsCount();

    List<FirebaseEvent.Param> getParamsList();
}
