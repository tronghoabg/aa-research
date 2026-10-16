package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Gainmap;
import android.os.Build;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af {
    public static Bitmap a(FileDescriptor fileDescriptor, BitmapFactory.Options options, ai aiVar) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !ae.a(options) || !f(aiVar)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        com.bumptech.glide.g.p.a(options.inPreferredConfig == Bitmap.Config.HARDWARE);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapE = e(bitmapDecodeFileDescriptor);
                bitmapDecodeFileDescriptor.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapE;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeFileDescriptor;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap b(InputStream inputStream, BitmapFactory.Options options, ai aiVar) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !ae.a(options) || !f(aiVar)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        com.bumptech.glide.g.p.a(options.inPreferredConfig == Bitmap.Config.HARDWARE);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapE = e(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapE;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static final int c(int i2, ByteBuffer byteBuffer) {
        if (g(i2, 4, byteBuffer)) {
            return byteBuffer.getInt(i2);
        }
        return -1;
    }

    static final short d(int i2, ByteBuffer byteBuffer) {
        if (g(i2, 2, byteBuffer)) {
            return byteBuffer.getShort(i2);
        }
        return (short) -1;
    }

    private static Bitmap e(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null && gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
            bitmap.setGainmap(ac.a(gainmap));
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    private static boolean f(ai aiVar) {
        try {
            boolean zE = aiVar.e();
            if (Log.isLoggable("GlideBitmapFactory", 2)) {
                Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zE);
            }
            return zE;
        } catch (IOException e2) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e2);
            return false;
        }
    }

    private static final boolean g(int i2, int i3, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i2 >= i3;
    }
}
