package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ivr {
    public static final yph a = yph.c("CAR.VIDEO");

    public static void a(Context context, Bitmap bitmap) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        FileOutputStream fileOutputStreamCreateOutputStream;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mime_type", "image/png");
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
        contentValues.put("relative_path", "Pictures/Android Auto feedback");
        contentValues.put("is_pending", (Boolean) true);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert != null) {
            try {
                wdw wdwVar = wdw.a;
                int i = wdx.a;
                ContentResolver contentResolver2 = context.getContentResolver();
                Uri uriA = wdx.a(uriInsert);
                String scheme = uriA.getScheme();
                if ("android.resource".equals(scheme)) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver2.openAssetFileDescriptor(uriA, "w");
                } else if ("content".equals(scheme)) {
                    if (!wdx.e(context, uriA, 2, wdwVar)) {
                        throw new FileNotFoundException("Can't open content uri.");
                    }
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver2.openAssetFileDescriptor(uriA, "w");
                    wdx.f(assetFileDescriptorOpenAssetFileDescriptor);
                } else {
                    if (!"file".equals(scheme)) {
                        throw new FileNotFoundException("Unsupported scheme");
                    }
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver2.openAssetFileDescriptor(uriA, "w");
                    wdx.f(assetFileDescriptorOpenAssetFileDescriptor2);
                    try {
                        wdx.d(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriA, wdwVar);
                        assetFileDescriptorOpenAssetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor2;
                    } catch (FileNotFoundException e) {
                        wdx.c(assetFileDescriptorOpenAssetFileDescriptor2, e);
                        throw e;
                    } catch (IOException e2) {
                        FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                        fileNotFoundException.initCause(e2);
                        wdx.c(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
                        throw fileNotFoundException;
                    }
                }
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    try {
                        fileOutputStreamCreateOutputStream = assetFileDescriptorOpenAssetFileDescriptor.createOutputStream();
                    } catch (IOException e3) {
                        FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Unable to create stream");
                        fileNotFoundException2.initCause(e3);
                        wdx.c(assetFileDescriptorOpenAssetFileDescriptor, fileNotFoundException2);
                        throw fileNotFoundException2;
                    }
                } else {
                    fileOutputStreamCreateOutputStream = null;
                }
                if (fileOutputStreamCreateOutputStream != null) {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStreamCreateOutputStream);
                    } finally {
                    }
                }
                if (fileOutputStreamCreateOutputStream != null) {
                    fileOutputStreamCreateOutputStream.close();
                }
            } catch (IOException e4) {
                ((ype) ((ype) ((ype) a.h()).p(e4)).ai((char) 1427)).u("Couldn't save screenshot to media store");
            }
            contentValues.put("is_pending", (Boolean) false);
            contentResolver.update(uriInsert, contentValues, null, null);
        }
    }
}
