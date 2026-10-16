package com.waze.ab.a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements b {
    @Override // com.waze.ab.a.b
    public final Uri a(Context context, File file) {
        h.g.b.x.f(context, "appContext");
        h.g.b.x.f(file, "file");
        try {
            h.g.b.x.f(context, "context");
            h.g.b.x.f(file, "file");
            Uri uriForFile = FileProvider.getUriForFile(context, String.valueOf(context.getPackageName()).concat(".provider"), file);
            h.g.b.x.e(uriForFile, "getUriForFile(...)");
            return uriForFile;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.waze.ab.a.b
    public final String b(Context context, Uri uri, File file) throws FileNotFoundException {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(uri, "sourceUri");
        h.g.b.x.f(file, "destination");
        h.g.b.x.f(context, "context");
        h.g.b.x.f(uri, "sourceUri");
        h.g.b.x.f(file, "destination");
        String absolutePath = file.getAbsolutePath();
        try {
            ContentResolver contentResolver = context.getContentResolver();
            h.g.b.x.e(contentResolver, "getContentResolver(...)");
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            FileOutputStream fileOutputStream = inputStreamOpenInputStream;
            try {
                InputStream inputStream = fileOutputStream;
                fileOutputStream = new FileOutputStream(file);
                try {
                    h.a.i.aY(inputStream, fileOutputStream);
                    h.a.i.aW(fileOutputStream, null);
                    h.a.i.aW(fileOutputStream, null);
                    return absolutePath;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            com.waze.shared_infra.i.h.l("FileUtils", "failed to write file ".concat(String.valueOf(absolutePath)), e2);
            return null;
        }
    }
}
