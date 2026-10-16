package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface OpeningHoursOrBuilder extends fj {
    int getDays(int i2);

    int getDaysCount();

    List<Integer> getDaysList();

    String getFrom();

    v getFromBytes();

    String getTo();

    v getToBytes();

    boolean hasFrom();

    boolean hasTo();
}
