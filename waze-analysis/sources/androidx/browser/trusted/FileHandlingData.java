package androidx.browser.trusted;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FileHandlingData {
    public static final String KEY_URIS = "androidx.browser.trusted.KEY_URIS";
    public final List<Uri> uris;

    public FileHandlingData(List<Uri> list) {
        this.uris = (List) Objects.requireNonNull(list);
    }

    public static FileHandlingData fromBundle(Bundle bundle) {
        return new FileHandlingData(BundleCompat.getParcelableArrayList(bundle, KEY_URIS, Uri.class));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        List<Uri> list = this.uris;
        if (list != null) {
            bundle.putParcelableArrayList(KEY_URIS, new ArrayList<>(list));
        }
        return bundle;
    }
}
