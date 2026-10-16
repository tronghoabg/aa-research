package db;

import android.app.ActivityManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* renamed from: db.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC2404b {
    public static /* synthetic */ ActivityManager.TaskDescription e(int i5, String str) {
        return new ActivityManager.TaskDescription(str, 0, i5);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }
}
