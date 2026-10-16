package defpackage;

import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
final class kmx extends ContentObserver {
    private final SharedPreferences.OnSharedPreferenceChangeListener a;
    private final SharedPreferences b;

    public kmx(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, Handler handler, SharedPreferences sharedPreferences) {
        super(handler);
        this.a = onSharedPreferenceChangeListener;
        this.b = sharedPreferences;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.onSharedPreferenceChanged(this.b, uri.getLastPathSegment());
    }
}
