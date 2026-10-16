package com.waze.sharedui;

import android.content.Context;
import com.waze.sharedui.f.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface b {
    int getCode();

    String getErrorCode();

    String getErrorMessage();

    r getTransactionStats();

    boolean hasServerError();

    boolean isSuccess();

    void openErrorDialog(Context context, Runnable runnable);
}
