package com.waze.bx;

import android.content.Context;
import android.content.Intent;
import com.waze.install.LocationFailedActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements com.waze.app_nav.hub.e {
    @Override // com.waze.app_nav.hub.e
    public final Intent a(Context context) {
        return new Intent(context, (Class<?>) LocationFailedActivity.class);
    }
}
