package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface AuditEventMessageOrBuilder extends fj {
    int getContext();

    int getDisplayStrings(int i2);

    int getDisplayStringsCount();

    List<Integer> getDisplayStringsList();

    int getName();

    String getSelectedOption();

    v getSelectedOptionBytes();

    int getValue();
}
