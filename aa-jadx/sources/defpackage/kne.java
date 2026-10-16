package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class kne extends android.database.ContentObserver {
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener a;
    private final android.content.SharedPreferences b;

    public kne(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, android.os.Handler handler, android.content.SharedPreferences sharedPreferences) {
        super(handler);
        this.a = onSharedPreferenceChangeListener;
        this.b = sharedPreferences;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        this.a.onSharedPreferenceChanged(this.b, uri.getLastPathSegment());
    }
}
