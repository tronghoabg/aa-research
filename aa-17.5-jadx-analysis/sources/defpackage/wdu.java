package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class wdu {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i) {
        woy.O((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        woy.O((i & 1) == 0 || e(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        woy.O((i & 2) == 0 || e(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        woy.O((i & 4) == 0 || e(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        woy.O((i & 128) == 0 || e(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        woy.O(intent.getComponent() != null, "Must set component on Intent.");
        if (e(0, 1)) {
            woy.O(!e(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            woy.O(e(i, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!e(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!e(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!e(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!e(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!e(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    @ResultIgnorabilityUnspecified
    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, a(intent, i2), i2);
    }

    @ResultIgnorabilityUnspecified
    public static PendingIntent c(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, a(intent, i2), i2);
    }

    @ResultIgnorabilityUnspecified
    public static PendingIntent d(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getService(context, i, a(intent, i2), i2);
    }

    private static boolean e(int i, int i2) {
        return (i & i2) == i2;
    }
}
