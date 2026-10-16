package com.waze.sharedui.views;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeEditTextBase f39176a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39177b;

    aa(WazeEditTextBase wazeEditTextBase, int i2, byte[] bArr) {
        this.f39177b = i2;
        Objects.requireNonNull(wazeEditTextBase);
        this.f39176a = wazeEditTextBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f39177b;
        WazeEditTextBase wazeEditTextBase = this.f39176a;
        if (i2 != 0) {
            wazeEditTextBase.f39155b = true;
        } else if (wazeEditTextBase.isFocused()) {
            wazeEditTextBase.a();
        }
    }

    aa(WazeEditTextBase wazeEditTextBase, int i2) {
        this.f39177b = i2;
        Objects.requireNonNull(wazeEditTextBase);
        this.f39176a = wazeEditTextBase;
    }
}
