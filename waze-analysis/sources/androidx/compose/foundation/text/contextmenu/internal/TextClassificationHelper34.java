package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextClassificationHelper34 {
    public static final TextClassificationHelper34 INSTANCE = new TextClassificationHelper34();

    private TextClassificationHelper34() {
    }

    public final void sendIntentAllowBackgroundActivityStart(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e2) {
            Log.e(TextContextMenuTextClassificationHelper_androidKt.TAG, "error sending pendingIntent: " + pendingIntent + " error: " + e2);
        }
    }
}
