package androidx.autofill.inline;

import android.os.Bundle;
import androidx.autofill.inline.UiVersions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VersionUtils {
    private static final String KEY_INLINE_UI_VERSIONS = "androidx.autofill.inline.ui.version:key";

    private VersionUtils() {
    }

    public static List<String> getSupportedVersions(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_INLINE_UI_VERSIONS);
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                if (isVersionSupported(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static boolean isVersionSupported(String str) {
        return UiVersions.getUiVersions().contains(str);
    }

    public static Bundle readStyleByVersion(Bundle bundle, String str) {
        return bundle.getBundle(str);
    }

    public static void writeStylesToBundle(List<UiVersions.Style> list, Bundle bundle) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (UiVersions.Style style : list) {
            String version = style.getVersion();
            arrayList.add(style.getVersion());
            bundle.putBundle(version, style.getBundle());
        }
        bundle.putStringArrayList(KEY_INLINE_UI_VERSIONS, arrayList);
    }

    public static void writeSupportedVersions(Bundle bundle) {
        bundle.putStringArrayList(KEY_INLINE_UI_VERSIONS, new ArrayList<>(UiVersions.getUiVersions()));
    }
}
