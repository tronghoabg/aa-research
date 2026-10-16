package com.waze;

import android.content.DialogInterface;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class kq implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f25062a;

    public /* synthetic */ kq(int i2) {
        this.f25062a = i2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f25062a != 1) {
            return;
        }
        ix.A(false);
    }
}
