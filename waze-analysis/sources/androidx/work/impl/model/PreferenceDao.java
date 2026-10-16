package androidx.work.impl.model;

import androidx.lifecycle.LiveData;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface PreferenceDao {
    Long getLongValue(String str);

    LiveData<Long> getObservableLongValue(String str);

    void insertPreference(Preference preference);
}
