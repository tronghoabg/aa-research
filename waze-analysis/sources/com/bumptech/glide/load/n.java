package com.bumptech.glide.load;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import com.bumptech.glide.load.c.a.an;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {
    public static ImageHeaderParser$ImageType a(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : t(list, new e(byteBuffer, 0));
    }

    public static int b(List list, com.bumptech.glide.load.data.s sVar, com.bumptech.glide.load.a.a.j jVar) {
        return s(list, new h(sVar, jVar));
    }

    public static int c(List list, InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new an(inputStream, jVar);
        }
        inputStream.mark(5242880);
        return s(list, new g(inputStream, jVar, 0));
    }

    public static int d(List list, ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return s(list, new g(byteBuffer, jVar, 1));
    }

    public static ImageHeaderParser$ImageType e(List list, com.bumptech.glide.load.data.s sVar, com.bumptech.glide.load.a.a.j jVar) {
        return t(list, new f(sVar, jVar));
    }

    public static ImageHeaderParser$ImageType f(List list, InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new an(inputStream, jVar);
        }
        inputStream.mark(5242880);
        return t(list, new e(inputStream, 1));
    }

    public static boolean g(List list, com.bumptech.glide.load.data.s sVar, com.bumptech.glide.load.a.a.j jVar) {
        return u(list, new j(sVar, jVar));
    }

    public static boolean h(List list, InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        inputStream.mark(5242880);
        return u(list, new i(inputStream, jVar, 0));
    }

    public static boolean i(List list, ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar) {
        if (byteBuffer == null) {
            return false;
        }
        return u(list, new i(byteBuffer, jVar, 1));
    }

    public static AssetFileDescriptor j(Uri uri, ContentResolver contentResolver) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
    }

    public static boolean k(Uri uri) {
        return m(uri) && !v(uri);
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }

    public static boolean m(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean n(Uri uri) {
        return m(uri) && v(uri);
    }

    public static boolean o(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static /* synthetic */ String p(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static void q(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void r(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    private static int s(List list, l lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iA = lVar.a((d) list.get(i2));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    private static ImageHeaderParser$ImageType t(List list, m mVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = mVar.a((d) list.get(i2));
            if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeA;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    private static boolean u(List list, k kVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar.a((d) list.get(i2))) {
                return true;
            }
        }
        return false;
    }

    private static boolean v(Uri uri) {
        return uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
    }
}
