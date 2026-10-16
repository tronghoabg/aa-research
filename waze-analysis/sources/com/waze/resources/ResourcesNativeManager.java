package com.waze.resources;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import com.waze.ResourceDownloadType;
import com.waze.lh;
import com.waze.mg;
import com.waze.t;
import com.waze.z.a.c.j;
import h.ab;
import h.g.a.l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ResourcesNativeManager extends f {
    private static final String mDefaultSkinsAssetDirPath = "res/skins/default/";
    private static ResourcesNativeManager mInstance;
    private final com.waze.native_managers.c<Boolean> downloadResCallbackWrapper = new com.waze.native_managers.c<>();

    private void downloadRes(ResourceDownloadType resourceDownloadType, String str, l<Boolean, ab> lVar) {
        downloadResource(resourceDownloadType.getValue(), str, this.downloadResCallbackWrapper.a(lVar));
    }

    public static ResourcesNativeManager getInstance() {
        ResourcesNativeManager resourcesNativeManager = mInstance;
        if (resourcesNativeManager != null) {
            return resourcesNativeManager;
        }
        ResourcesNativeManager resourcesNativeManager2 = new ResourcesNativeManager();
        mInstance = resourcesNativeManager2;
        return resourcesNativeManager2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ab lambda$getOrDownloadSkinDrawable$0(b bVar, Resources resources, String str, Boolean bool) {
        if (bool.booleanValue()) {
            Drawable skinDrawable = getSkinDrawable(resources, a.c(str));
            if (bVar != null) {
                bVar.a(skinDrawable);
            }
        } else if (bVar != null) {
            bVar.a(null);
        }
        return ab.f48028a;
    }

    private InputStream loadAssetStream(String str) {
        try {
            return mg.a().getAssets().open(mDefaultSkinsAssetDirPath.concat(String.valueOf(str)));
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Error getting asset stream", e2);
            return null;
        }
    }

    private byte[] loadResData(String str) throws IOException {
        byte[] bArr = null;
        try {
            InputStream inputStreamLoadResStream = loadResStream(str);
            if (inputStreamLoadResStream != null) {
                try {
                    int i2 = lh.f25149a;
                    byte[] bArr2 = new byte[8192];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i3 = inputStreamLoadResStream.read(bArr2);
                        if (i3 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i3);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bArr = byteArray;
                } finally {
                }
            }
            if (inputStreamLoadResStream == null) {
                return bArr;
            }
            inputStreamLoadResStream.close();
            return bArr;
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Error loading image from package", e2);
            return null;
        }
    }

    private InputStream loadResStream(String str) {
        String strE = a.e(str);
        if (strE == null) {
            InputStream inputStreamLoadAssetStream = loadAssetStream(a.i() ? a.c(a.b(str)) : a.h() ? a.c(a.a(str)) : a.c(str));
            return inputStreamLoadAssetStream != null ? inputStreamLoadAssetStream : loadAssetStream(a.c(str));
        }
        try {
            return new FileInputStream(strE);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Error loading image from package", e2);
            return null;
        }
    }

    void downloadResourceCallback(int i2, boolean z) {
        l lVarB = this.downloadResCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(Boolean.valueOf(z));
            return;
        }
        Log.d("ResourcesNativeManager", "No callback object found in map for id = " + i2);
    }

    protected native void downloadResourceNTV(int i2, String str, int i3);

    public Bitmap getEncBitmap(String str) {
        if (str == null) {
            return null;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(loadResStream(str));
        if (bitmapDecodeStream != null) {
            return str.endsWith(".9.png") ? Bitmap.createBitmap(bitmapDecodeStream, 1, 1, bitmapDecodeStream.getWidth() - 2, bitmapDecodeStream.getHeight() - 2) : bitmapDecodeStream;
        }
        String strE = a.e(str);
        if (!TextUtils.isEmpty(strE)) {
            new File(strE).delete();
        }
        return null;
    }

    protected native String getImageResolutionSuffixNTV();

    public void getOrDownloadSkinDrawable(Resources resources, String str, ResourceDownloadType resourceDownloadType, b bVar) {
        Drawable skinDrawable = getSkinDrawable(resources, a.c(str));
        if (skinDrawable == null) {
            downloadRes(resourceDownloadType, str, new j(this, bVar, resources, str, 6));
        } else if (bVar != null) {
            bVar.a(skinDrawable);
        }
    }

    public Drawable getSkinDrawable(Resources resources, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        InputStream inputStreamLoadResStream = loadResStream(str);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, inputStreamLoadResStream);
        Display displayC = t.c();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayC.getMetrics(displayMetrics);
        bitmapDrawable.setTargetDensity(displayMetrics);
        if (inputStreamLoadResStream != null) {
            return bitmapDrawable;
        }
        int iG = h.g(str);
        if (iG != 0) {
            return resources.getDrawable(iG);
        }
        return null;
    }

    public native void initNativeLayerNTV();

    byte[] loadSkin(String str) {
        return loadResData(str);
    }
}
