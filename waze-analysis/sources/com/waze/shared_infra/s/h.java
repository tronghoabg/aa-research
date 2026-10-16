package com.waze.shared_infra.s;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import h.g.b.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {
    public static final k a(f fVar) {
        x.f(fVar, "<this>");
        return ai.n(new g(fVar, null));
    }

    public static boolean b(int i2) {
        return i2 == 6 || i2 == 2 || i2 == 5 || i2 == 3 || i2 == 4 || i2 == 134217728;
    }

    public static final String c(Bitmap bitmap, String str) {
        x.f(bitmap, "bitmap");
        x.f(str, "fileName");
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                h.a.i.aW(fileOutputStream, null);
                if (zCompress) {
                    return file.getAbsolutePath();
                }
                com.waze.shared_infra.i.h.b("FileUtils", "storeAsJpeg: Failed to compress " + str);
                return null;
            } finally {
            }
        } catch (FileNotFoundException e2) {
            com.waze.shared_infra.i.h.f("FileUtils", "storeAsJpeg: File not found - ".concat(String.valueOf(str)), e2);
            return null;
        } catch (IOException e3) {
            com.waze.shared_infra.i.h.f("FileUtils", "storeAsJpeg: IO Exception saving ".concat(String.valueOf(str)), e3);
            return null;
        } catch (Exception e4) {
            com.waze.shared_infra.i.h.f("FileUtils", "storeAsJpeg: Unexpected error saving ".concat(String.valueOf(str)), e4);
            return null;
        }
    }

    public static final void d(LiveData liveData) {
        x.f(liveData, "<this>");
    }
}
