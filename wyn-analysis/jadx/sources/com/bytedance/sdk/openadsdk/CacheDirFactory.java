package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.uef.uef.oa.uef.uef.uef;
import com.bykv.vk.openvk.uef.uef.uef.uef.oa;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.core.sy;
import java.io.File;
import wg.b;

/* loaded from: classes3.dex */
public class CacheDirFactory {
    public static volatile oa MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String uef;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir());
        return b.c(sb2, File.separator, str);
    }

    public static oa getICacheDir(int i5) {
        return uef();
    }

    public static String getImageCacheDir(String str) {
        if (uef == null) {
            uef = getDiskCacheDirPath(str);
        }
        return uef;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileUef = xs.uef(sy.uef(), "tt_ad");
        if (fileUef.isFile()) {
            fileUef.delete();
        }
        if (!fileUef.exists()) {
            fileUef.mkdirs();
        }
        String absolutePath = fileUef.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static oa uef() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        uef uefVar = new uef();
                        MEDIA_CACHE_DIR = uefVar;
                        uefVar.uef(getRootDir());
                        MEDIA_CACHE_DIR.moa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
