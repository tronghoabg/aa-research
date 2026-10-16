package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.PendingIntentCompat;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class PendingIntentActivityWrapper {
    private final Context mContext;
    private final int mFlags;
    private final Intent mIntent;
    private final boolean mIsMutable;
    private final Bundle mOptions;
    private final PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentActivityWrapper(Context context, int i2, Intent intent, int i3, Bundle bundle, boolean z) {
        this.mContext = context;
        this.mRequestCode = i2;
        this.mIntent = intent;
        this.mFlags = i3;
        this.mOptions = bundle;
        this.mIsMutable = z;
        this.mPendingIntent = createPendingIntent();
    }

    private PendingIntent createPendingIntent() {
        Bundle bundle = this.mOptions;
        Context context = this.mContext;
        int i2 = this.mRequestCode;
        Intent intent = this.mIntent;
        int i3 = this.mFlags;
        return bundle == null ? PendingIntentCompat.getActivity(context, i2, intent, i3, this.mIsMutable) : PendingIntentCompat.getActivity(context, i2, intent, i3, bundle, this.mIsMutable);
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public Bundle getOptions() {
        return this.mOptions;
    }

    public PendingIntent getPendingIntent() {
        return this.mPendingIntent;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public boolean isMutable() {
        return this.mIsMutable;
    }

    public PendingIntentActivityWrapper(Context context, int i2, Intent intent, int i3, boolean z) {
        this(context, i2, intent, i3, null, z);
    }
}
