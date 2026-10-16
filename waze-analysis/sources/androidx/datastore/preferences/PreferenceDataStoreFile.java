package androidx.datastore.preferences;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.datastore.DataStoreFile;
import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String str) {
        x.f(context, "<this>");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return DataStoreFile.dataStoreFile(context, String.valueOf(str).concat(".preferences_pb"));
    }
}
