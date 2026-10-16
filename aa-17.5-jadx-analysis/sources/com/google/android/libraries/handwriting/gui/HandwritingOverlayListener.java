package com.google.android.libraries.handwriting.gui;

/* loaded from: classes3.dex */
public interface HandwritingOverlayListener {

    /* renamed from: com.google.android.libraries.handwriting.gui.HandwritingOverlayListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onPenCancel(float f, float f2, long j, float f3, int i);

    void onPenDown(float f, float f2, long j, float f3, int i);

    void onPenMove(float f, float f2, long j, float f3, int i);

    void onPenUp(float f, float f2, long j, float f3, int i);

    void onSizeChanged(int i, int i2);
}
