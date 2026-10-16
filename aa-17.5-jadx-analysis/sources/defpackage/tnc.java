package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public final /* synthetic */ class tnc implements FilenameFilter {
    private final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.a;
        if (i == 0) {
            int i2 = tnd.a;
            return str.startsWith("_google_maps_sdk_crash_count_");
        }
        if (i != 1) {
            return str.endsWith(".feedbackbundle.ready");
        }
        int i3 = tnd.a;
        return str.startsWith("_google_maps_sdk_crash_count_");
    }
}
