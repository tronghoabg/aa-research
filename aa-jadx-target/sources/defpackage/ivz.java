package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivz {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.VIDEO");

    public static void a(android.content.Context context, android.graphics.Bitmap bitmap) {
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        java.io.FileOutputStream fileOutputStreamCreateOutputStream;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("mime_type", "image/png");
        contentValues.put("date_added", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        contentValues.put("relative_path", "Pictures/Android Auto feedback");
        contentValues.put("is_pending", java.lang.Boolean.TRUE);
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri uriInsert = contentResolver.insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert != null) {
            try {
                weu weuVar = weu.a;
                int i = wev.a;
                android.content.ContentResolver contentResolver2 = context.getContentResolver();
                android.net.Uri uriA = wev.a(uriInsert);
                java.lang.String scheme = uriA.getScheme();
                if ("android.resource".equals(scheme)) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver2.openAssetFileDescriptor(uriA, "w");
                } else if ("content".equals(scheme)) {
                    if (!wev.e(context, uriA, 2, weuVar)) {
                        throw new java.io.FileNotFoundException("Can't open content uri.");
                    }
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver2.openAssetFileDescriptor(uriA, "w");
                    wev.f(assetFileDescriptorOpenAssetFileDescriptor);
                } else {
                    if (!"file".equals(scheme)) {
                        throw new java.io.FileNotFoundException("Unsupported scheme");
                    }
                    android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver2.openAssetFileDescriptor(uriA, "w");
                    wev.f(assetFileDescriptorOpenAssetFileDescriptor2);
                    try {
                        try {
                            wev.d(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriA, weuVar);
                            assetFileDescriptorOpenAssetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor2;
                        } catch (java.io.FileNotFoundException e) {
                            wev.c(assetFileDescriptorOpenAssetFileDescriptor2, e);
                            throw e;
                        }
                    } catch (java.io.IOException e2) {
                        java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Validation failed.");
                        fileNotFoundException.initCause(e2);
                        wev.c(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
                        throw fileNotFoundException;
                    }
                }
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    try {
                        fileOutputStreamCreateOutputStream = assetFileDescriptorOpenAssetFileDescriptor.createOutputStream();
                    } catch (java.io.IOException e3) {
                        java.io.FileNotFoundException fileNotFoundException2 = new java.io.FileNotFoundException("Unable to create stream");
                        fileNotFoundException2.initCause(e3);
                        wev.c(assetFileDescriptorOpenAssetFileDescriptor, fileNotFoundException2);
                        throw fileNotFoundException2;
                    }
                } else {
                    fileOutputStreamCreateOutputStream = null;
                }
                if (fileOutputStreamCreateOutputStream != null) {
                    try {
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, fileOutputStreamCreateOutputStream);
                    } catch (java.lang.Throwable th) {
                        try {
                            fileOutputStreamCreateOutputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (fileOutputStreamCreateOutputStream != null) {
                    fileOutputStreamCreateOutputStream.close();
                }
            } catch (java.io.IOException e4) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e4)).ai((char) 1427)).u("Couldn't save screenshot to media store");
            }
            contentValues.put("is_pending", java.lang.Boolean.FALSE);
            contentResolver.update(uriInsert, contentValues, null, null);
        }
    }
}
