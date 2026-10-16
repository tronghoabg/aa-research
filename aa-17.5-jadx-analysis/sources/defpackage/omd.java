package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class omd extends iag {
    static final byte[] b = "BlurTransformation".getBytes();
    private final Context c;

    public omd(Context context) {
        this.c = context;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iag
    protected final Bitmap c(hxe hxeVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), true);
        if (bitmapCreateScaledBitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            bitmapCreateScaledBitmap = bitmapCreateScaledBitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
        Context context = this.c;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(18.0f);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
