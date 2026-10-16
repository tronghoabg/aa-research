package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.io.Serializable;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public class dsg<V extends View> {
    public dsg() {
    }

    public static boolean A() {
        yph yphVar = lfm.a;
        return !((lfm) mki.a.i(lfm.class)).g() || Build.DEVICE.equals("blueline") || Build.DEVICE.equals("crosshatch") || Build.DEVICE.equals("bonito") || Build.DEVICE.equals("sargo");
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap:java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] (LINE:1) dsg.class) */
    public static synchronized String B(Context context) {
        synchronized (dsg.class) {
            wer.b();
            String string = context.getSharedPreferences("DEVICE_ID_SHARED_PERF", 0).getString("DEVICE_ID", null);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String string2 = UUID.randomUUID().toString();
            context.getSharedPreferences("DEVICE_ID_SHARED_PERF", 0).edit().putString("DEVICE_ID", string2).apply();
            return string2;
        }
    }

    public static CarInfoInternal C(xob xobVar, int i, int i2, String str, long j, String str2) {
        xgr xgrVar;
        String str3;
        if ((xobVar.b & 16384) != 0) {
            xgrVar = xobVar.q;
            if (xgrVar == null) {
                xgrVar = xgr.a;
            }
        } else {
            abnp abnpVarN = xgr.a.n();
            String str4 = xobVar.i;
            abnpVarN.t();
            xgr xgrVar2 = (xgr) abnpVarN.b;
            str4.getClass();
            xgrVar2.b |= 16;
            xgrVar2.g = str4;
            String str5 = xobVar.j;
            abnpVarN.t();
            xgr xgrVar3 = (xgr) abnpVarN.b;
            str5.getClass();
            xgrVar3.b |= 32;
            xgrVar3.h = str5;
            String str6 = xobVar.k;
            abnpVarN.t();
            xgr xgrVar4 = (xgr) abnpVarN.b;
            str6.getClass();
            xgrVar4.b |= 64;
            xgrVar4.i = str6;
            String str7 = xobVar.l;
            abnpVarN.t();
            xgr xgrVar5 = (xgr) abnpVarN.b;
            str7.getClass();
            xgrVar5.b |= 128;
            xgrVar5.j = str7;
            String str8 = xobVar.g;
            abnpVarN.t();
            xgr xgrVar6 = (xgr) abnpVarN.b;
            str8.getClass();
            xgrVar6.b |= 8;
            xgrVar6.f = str8;
            String str9 = xobVar.f;
            abnpVarN.t();
            xgr xgrVar7 = (xgr) abnpVarN.b;
            str9.getClass();
            xgrVar7.b |= 4;
            xgrVar7.e = str9;
            String str10 = xobVar.d;
            abnpVarN.t();
            xgr xgrVar8 = (xgr) abnpVarN.b;
            str10.getClass();
            xgrVar8.b |= 1;
            xgrVar8.c = str10;
            String str11 = xobVar.e;
            abnpVarN.t();
            xgr xgrVar9 = (xgr) abnpVarN.b;
            str11.getClass();
            xgrVar9.b |= 2;
            xgrVar9.d = str11;
            int i3 = true != xobVar.e.toLowerCase(Locale.ENGLISH).endsWith("truck") ? 1 : 2;
            abnpVarN.t();
            xgr xgrVar10 = (xgr) abnpVarN.b;
            xgrVar10.b |= 256;
            xgrVar10.k = i3;
            xgrVar = (xgr) abnpVarN.q();
        }
        Iterator<E> it = xobVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            xnz xnzVar = (xnz) it.next();
            if ((xnzVar.b & 32) != 0) {
                xht xhtVar = xnzVar.h;
                if (xhtVar == null) {
                    xhtVar = xht.b;
                }
                str3 = xhtVar.c;
            }
        }
        String str12 = str3;
        String str13 = xobVar.o;
        if (TextUtils.isEmpty(str13)) {
            str13 = xgrVar.c;
        }
        String str14 = str13;
        int i4 = xobVar.n;
        String str15 = xgrVar.c;
        String str16 = xgrVar.d;
        String str17 = xgrVar.e;
        int i5 = i4 & 1;
        xje xjeVarB = xje.b(xobVar.h);
        if (xjeVarB == null) {
            xjeVarB = xje.DRIVER_POSITION_LEFT;
        }
        CarInfo carInfo = new CarInfo(str15, str16, str17, null, i, i2, 1 == i5, xjeVarB.e, xgrVar.g, xgrVar.h, xgrVar.i, xgrVar.j, (i4 & 8) == 8, (i4 & 2) == 2, (i4 & 4) == 4, null, str14, xgrVar.k);
        if (xobVar.m) {
            carInfo.m = true;
        }
        return new CarInfoInternal(carInfo, null, false, 0L, 0L, str12, null, null, null, -1, str, -1, -1, -1, false, false, j, false, "", -1, J(xgrVar.f, str2, str));
    }

    public static jmj D(Context context) {
        context.getClass();
        return jme.a.a(context);
    }

    public static void E(rpz rpzVar, yzy yzyVar) {
        abnp abnpVarN = yxb.a.n();
        abnpVarN.getClass();
        abnp abnpVarN2 = yxx.a.n();
        abnpVarN2.getClass();
        abnpVarN2.t();
        yxx yxxVar = (yxx) abnpVarN2.b;
        yxxVar.b |= 1;
        yxxVar.c = 4;
        abnv abnvVarQ = abnpVarN2.q();
        abnvVarQ.getClass();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yxbVar.O = (yxx) abnvVarQ;
        yxbVar.c |= 32768;
        abnp abnpVarN3 = zab.a.n();
        abnpVarN3.getClass();
        abnpVarN3.t();
        zab zabVar = (zab) abnpVarN3.b;
        zabVar.b |= 1;
        zabVar.d = 8300;
        int iA = yzyVar.a();
        abnpVarN3.t();
        zab zabVar2 = (zab) abnpVarN3.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        abnv abnvVarQ2 = abnpVarN3.q();
        abnvVarQ2.getClass();
        abnpVarN.t();
        yxb yxbVar2 = (yxb) abnpVarN.b;
        yxbVar2.o = (zab) abnvVarQ2;
        yxbVar2.b |= 4096;
        abnv abnvVarQ3 = abnpVarN.q();
        abnvVarQ3.getClass();
        rpzVar.d(yxc.UI, (yxb) abnvVarQ3);
    }

    public static int F(int i) {
        if (i == 260) {
            return 1;
        }
        if (i == 261) {
            return 2;
        }
        switch (i) {
            case 19:
                return 33;
            case 20:
                return 130;
            case 21:
                return 17;
            case 22:
                return 66;
            default:
                return -1;
        }
    }

    public static boolean G(int i) {
        return i == 20 || i == 19 || i == 22 || i == 21;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(defpackage.jhf r20, android.util.SparseArray r21, java.util.UUID r22, boolean r23, defpackage.jhg r24, int r25) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsg.H(jhf, android.util.SparseArray, java.util.UUID, boolean, jhg, int):void");
    }

    public static Bitmap I(IntBuffer intBuffer, int i, int i2) {
        int[] iArrArray = intBuffer.array();
        iArrArray.getClass();
        for (int i3 = 0; i3 < iArrArray.length; i3++) {
            int i4 = iArrArray[i3];
            iArrArray[i3] = (i4 & (-16711936)) | ((i4 >> 16) & 255) | ((i4 & 255) << 16);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArrArray, (i2 - 1) * i, -i, i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    private static String J(String str, String str2, String str3) throws NoSuchAlgorithmException {
        try {
            return ytq.d.i(MessageDigest.getInstance("SHA-256").digest((str + str2 + str3).getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            return (String) tss.r("GH.CarInfoUtil", e, "Couldn't find hash algorithm implementation!", new Object[0]);
        }
    }

    public static int u(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0731 A[PHI: r9
  0x0731: PHI (r9v26 dpb) = (r9v25 dpb), (r9v31 dpb) binds: [B:415:0x0725, B:418:0x072f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(defpackage.dqo r39, defpackage.doy r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsg.v(dqo, doy, java.util.ArrayList, int):void");
    }

    public static zgp w(dny dnyVar) {
        dnw dnwVar = new dnw();
        doa doaVar = new doa(dnwVar);
        dnwVar.b = doaVar;
        dnwVar.a = dnyVar.getClass();
        try {
            dnwVar.a = dnyVar.a(dnwVar);
            return doaVar;
        } catch (Exception e) {
            doaVar.a(e);
            return doaVar;
        }
    }

    public static void x(Object obj) {
        obj.getClass();
    }

    public static dwa y(Configuration configuration) {
        return new dwa(new dwb(configuration.getLocales()));
    }

    public static Bundle z(aezu... aezuVarArr) {
        aezuVarArr.getClass();
        Bundle bundle = new Bundle(aezuVarArr.length);
        for (aezu aezuVar : aezuVarArr) {
            String str = (String) aezuVar.a;
            Object obj = aezuVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean j(View view) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean m(View view) {
        return false;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public Parcelable r(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean t(View view, Rect rect) {
        return false;
    }

    public dsg(Context context, AttributeSet attributeSet) {
    }

    public dsg(byte[] bArr) {
    }

    public void d() {
    }

    public void a(int i) {
    }

    public void b(Typeface typeface) {
    }

    public void c(dsj dsjVar) {
    }

    public void k(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void q(View view, Parcelable parcelable) {
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }
}
