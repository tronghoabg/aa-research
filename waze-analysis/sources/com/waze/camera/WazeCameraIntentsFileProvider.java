package com.waze.camera;

import android.content.Context;
import androidx.core.content.FileProvider;
import com.waze.R;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeCameraIntentsFileProvider extends FileProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18798a = 0;

    public WazeCameraIntentsFileProvider() {
        super(R.xml.camera_provider_paths);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        File file = new File(context.getCacheDir(), "waze_camera_private_folder");
        if (file.exists()) {
            return true;
        }
        file.mkdirs();
        return true;
    }
}
