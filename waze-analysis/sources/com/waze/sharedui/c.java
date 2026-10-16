package com.waze.sharedui;

import android.content.Context;
import com.waze.sharedui.f.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final int f38837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38838b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38839c;

    public c(int i2, String str) {
        x.f(str, "errorCode");
        this.f38837a = i2;
        this.f38838b = str;
        this.f38839c = "CUIErrorBase";
    }

    @Override // com.waze.sharedui.b
    public final int getCode() {
        return this.f38837a;
    }

    @Override // com.waze.sharedui.b
    public final String getErrorCode() {
        return this.f38838b;
    }

    @Override // com.waze.sharedui.b
    public final String getErrorMessage() {
        return String.valueOf(this.f38837a);
    }

    @Override // com.waze.sharedui.b
    public final r getTransactionStats() {
        return null;
    }

    @Override // com.waze.sharedui.b
    public final boolean hasServerError() {
        return false;
    }

    @Override // com.waze.sharedui.b
    public final boolean isSuccess() {
        return this.f38837a == 0;
    }

    @Override // com.waze.sharedui.b
    public void openErrorDialog(Context context, Runnable runnable) {
        com.waze.shared_infra.i.h.k(this.f38839c, "not implemented");
    }
}
