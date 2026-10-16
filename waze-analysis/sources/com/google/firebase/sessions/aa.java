package com.google.firebase.sessions;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10781a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Preferences.Key f10782b = PreferencesKeys.stringKey("session_id");

    public static final Preferences.Key a() {
        return f10782b;
    }
}
