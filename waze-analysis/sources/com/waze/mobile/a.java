package com.waze.mobile;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.waze.FreeMapAppActivity;
import com.waze.ResumePendingIntentBuilder;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements ResumePendingIntentBuilder {
    @Override // com.waze.ResumePendingIntentBuilder
    public final PendingIntent build(Context context, int i2) {
        x.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) FreeMapAppActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(268435456);
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
        taskStackBuilderCreate.addNextIntentWithParentStack(intent);
        PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(i2, Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456);
        x.e(pendingIntent, "getPendingIntent(...)");
        return pendingIntent;
    }
}
