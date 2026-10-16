package com.waze.jni.protos.crash;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NonFatalErrorInfoOrBuilder extends fj {
    String getArgumentsFormatted();

    v getArgumentsFormattedBytes();

    String getFunctionName();

    v getFunctionNameBytes();

    int getLine();

    String getSourceFileName();

    v getSourceFileNameBytes();

    boolean hasArgumentsFormatted();

    boolean hasFunctionName();

    boolean hasLine();

    boolean hasSourceFileName();
}
