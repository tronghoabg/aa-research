package android.support.v4.app;

import androidx.activity.BackEventCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface bq {
    void onBackStackChangeCancelled();

    void onBackStackChangeCommitted(ar arVar, boolean z);

    void onBackStackChangeProgressed(BackEventCompat backEventCompat);

    void onBackStackChangeStarted(ar arVar, boolean z);

    void onBackStackChanged();
}
