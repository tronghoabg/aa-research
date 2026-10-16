package androidx.datastore;

import android.content.Context;
import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String str) {
        x.f(context, "<this>");
        x.f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(String.valueOf(str)));
    }
}
