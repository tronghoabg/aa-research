package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import androidx.car.app.model.CarIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class fxp {
    public static final void a(fya fyaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2 = cfyVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(675196860);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(fyaVar) : buxVarC.E(fyaVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar2) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 112;
            fxo fxoVar = fyaVar.a;
            if (fxoVar instanceof fwy) {
                buxVarC.v(1457934396);
                fww.c((fwy) fxoVar, cfyVar2, fyaVar.b, null, null, null, null, false, null, null, buxVarC, i4, 1016);
                cfyVar2 = cfyVar2;
                ((bvv) buxVarC).Y(false);
            } else if (fxoVar instanceof fwu) {
                buxVarC.v(1458044942);
                fwt.c((fwu) fxoVar, cfyVar2, null, buxVarC, i4);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1458114010);
                gvq.g(fxoVar, cfyVar2, buxVarC, i4, 0);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fyaVar, cfyVar2, i, 10, null);
        }
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? "FILL_WIDTH" : "MIN_MAX_WIDTH" : "NONE";
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.gab r26, final float r27, defpackage.cfy r28, defpackage.cfn r29, defpackage.csi r30, defpackage.cjv r31, boolean r32, boolean r33, defpackage.afeg r34, defpackage.bux r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxp.c(gab, float, cfy, cfn, csi, cjv, boolean, boolean, afeg, bux, int, int):void");
    }

    public static final fzy d(CarIcon carIcon, geu geuVar, afec afecVar, afec afecVar2, ghw ghwVar, ghv ghvVar) {
        CarIcon carIcon2;
        fzy fzyVar;
        ghwVar.getClass();
        ghvVar.getClass();
        boolean zBooleanValue = ((Boolean) afecVar.invoke(geuVar.F(ggk.class))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) afecVar2.invoke(geuVar.F(ggk.class))).booleanValue();
        int i = true != zBooleanValue ? 1 : 2;
        if (true == zBooleanValue2) {
            i = 3;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            carIcon2 = carIcon;
            fzyVar = new fzy(carIcon2, null, null);
        } else if (i2 != 1) {
            carIcon2 = carIcon;
            fzyVar = new fzy(null, null, gai.a(carIcon2, geuVar, ghwVar, ghvVar, null, 8));
        } else {
            carIcon2 = carIcon;
            fzyVar = new fzy(null, gad.a(carIcon2, geuVar, ghwVar, ghvVar), null);
        }
        gka.b(fzyVar, carIcon2);
        return fzyVar;
    }

    public static /* synthetic */ fzy e(CarIcon carIcon, geu geuVar, afec afecVar, afec afecVar2, ghv ghvVar, int i) {
        ghw ghwVar = (i & 8) != 0 ? ghw.b : null;
        if ((i & 16) != 0) {
            ghvVar = ghv.b;
            ghvVar.getClass();
        }
        return d(carIcon, geuVar, afecVar, afecVar2, ghwVar, ghvVar);
    }

    public static Bitmap f(byte[] bArr, int i, int i2, BitmapFactory.Options options, ibl iblVar) throws Throwable {
        if (Build.VERSION.SDK_INT != 34 || !ibh.a(options) || !i(iblVar)) {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        fxy.g(options.inPreferredConfig == Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = null;
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            if (bitmapDecodeByteArray == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapH = h(bitmapDecodeByteArray);
                bitmapDecodeByteArray.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapH;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeByteArray;
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

    public static Bitmap g(InputStream inputStream, BitmapFactory.Options options, ibl iblVar) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !ibh.a(options) || !i(iblVar)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        fxy.g(options.inPreferredConfig == Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapH = h(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapH;
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

    public static Bitmap h(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null && gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
            ColorMatrixColorFilter colorMatrixColorFilter = ibf.a;
            Bitmap gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                fxy.g(gainmapContents.getConfig() == Bitmap.Config.ALPHA_8, "");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColorFilter(ibf.a);
                canvas.drawBitmap(gainmapContents, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                canvas.setBitmap(null);
                Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
                float[] ratioMin = gainmap.getRatioMin();
                gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                float[] ratioMax = gainmap.getRatioMax();
                gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                float[] gamma = gainmap.getGamma();
                gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                float[] epsilonSdr = gainmap.getEpsilonSdr();
                gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                float[] epsilonHdr = gainmap.getEpsilonHdr();
                gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                gainmap = gainmap2;
            }
            bitmap.setGainmap(gainmap);
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static boolean i(ibl iblVar) {
        try {
            boolean zE = iblVar.e();
            if (Log.isLoggable("GlideBitmapFactory", 2)) {
                Log.v("GlideBitmapFactory", a.bR(zE, "isLikelyToContainGainmap="));
            }
            return zE;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    public static final int j(int i, ByteBuffer byteBuffer) {
        if (l(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static final short k(int i, ByteBuffer byteBuffer) {
        if (l(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static final boolean l(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }
}
