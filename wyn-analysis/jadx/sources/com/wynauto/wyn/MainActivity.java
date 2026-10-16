package com.wynauto.wyn;

import a2.C1323c;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.location.GnssStatus$Callback;
import android.location.LocationManager;
import android.os.Build;
import com.wynauto.wyn.MainActivity;
import io.flutter.embedding.android.FlutterActivity;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lc.C3458b;
import mc.b;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wynauto/wyn/MainActivity;", "Lio/flutter/embedding/android/FlutterActivity;", "<init>", "()V", "CHANNEL", "", "CAMERA_CONVERTER_CHANNEL", "channel", "Lio/flutter/plugin/common/MethodChannel;", "gnssStatusCallback", "Landroid/location/GnssStatus$Callback;", "configureFlutterEngine", "", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "startGnssStatusUpdates", "stopGnssStatusUpdates", "setupCameraConverterChannel", "yuvToJpeg", "", "nv21", "width", "", "height", "quality", "rotation", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MainActivity extends FlutterActivity {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f33906j = 0;

    /* renamed from: f, reason: collision with root package name */
    public final String f33907f = "wyn.wynauto.com/main_channel";

    /* renamed from: g, reason: collision with root package name */
    public final String f33908g = "wyn.wynauto.com/camera_converter";

    /* renamed from: h, reason: collision with root package name */
    public C4281r f33909h;

    /* renamed from: i, reason: collision with root package name */
    public GnssStatus$Callback f33910i;

    public static byte[] B(byte[] bArr, int i5, int i10, int i11, int i12) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i5, i10, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i5, i10), i11, byteArrayOutputStream);
        if (i12 == 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC3340k.d(byteArray, "toByteArray(...)");
            return byteArray;
        }
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray2, 0, byteArray2.length);
        Matrix matrix = new Matrix();
        matrix.postRotate(i12);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
        AbstractC3340k.d(bitmapCreateBitmap, "createBitmap(...)");
        bitmapDecodeByteArray.recycle();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream2);
        bitmapCreateBitmap.recycle();
        byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
        AbstractC3340k.d(byteArray3, "toByteArray(...)");
        return byteArray3;
    }

    @Override // io.flutter.embedding.android.FlutterActivity, kc.e, kc.g
    public final void b(C3458b flutterEngine) {
        AbstractC3340k.e(flutterEngine, "flutterEngine");
        super.b(flutterEngine);
        b bVar = flutterEngine.f40253c;
        this.f33909h = new C4281r((C1323c) bVar.f40527f, this.f33907f);
        C4281r c4281r = new C4281r((C1323c) bVar.f40527f, this.f33908g);
        final int i5 = 1;
        c4281r.b(new InterfaceC4279p(this) { // from class: Nb.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f8640b;

            {
                this.f8640b = this;
            }

            @Override // uc.InterfaceC4279p
            public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) throws PackageManager.NameNotFoundException {
                MainActivity mainActivity = this.f8640b;
                switch (i5) {
                    case 0:
                        int i10 = MainActivity.f33906j;
                        AbstractC3340k.e(call, "call");
                        String str = call.f46759a;
                        if (!AbstractC3340k.a(str, "getNativeLibraryDirectory")) {
                            if (!AbstractC3340k.a(str, "javaLoadLibrary")) {
                                if (!AbstractC3340k.a(str, "startGnssStatus")) {
                                    if (!AbstractC3340k.a(str, "stopGnssStatus")) {
                                        ((g) interfaceC4280q).c();
                                        break;
                                    } else {
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Object systemService = mainActivity.getSystemService("location");
                                            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                                            LocationManager locationManager = (LocationManager) systemService;
                                            GnssStatus$Callback gnssStatus$Callback = mainActivity.f33910i;
                                            if (gnssStatus$Callback != null) {
                                                locationManager.unregisterGnssStatusCallback(gnssStatus$Callback);
                                            }
                                        } else {
                                            mainActivity.getClass();
                                        }
                                        ((g) interfaceC4280q).a(null);
                                        break;
                                    }
                                } else {
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        Object systemService2 = mainActivity.getSystemService("location");
                                        AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.location.LocationManager");
                                        LocationManager locationManager2 = (LocationManager) systemService2;
                                        b bVar2 = new b(mainActivity, 0);
                                        mainActivity.f33910i = bVar2;
                                        try {
                                            locationManager2.registerGnssStatusCallback(bVar2);
                                        } catch (SecurityException unused) {
                                        }
                                    } else {
                                        mainActivity.getClass();
                                    }
                                    ((g) interfaceC4280q).a(null);
                                    break;
                                }
                            } else {
                                try {
                                    Object obj = call.f46760b;
                                    AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.String");
                                    System.loadLibrary((String) obj);
                                    ((g) interfaceC4280q).a(null);
                                    break;
                                } catch (Exception e7) {
                                    ((g) interfaceC4280q).b(e7.toString(), null, null);
                                    return;
                                }
                            }
                        } else {
                            mainActivity.getClass();
                            ApplicationInfo applicationInfo = mainActivity.getPackageManager().getApplicationInfo(mainActivity.getPackageName(), 128);
                            AbstractC3340k.d(applicationInfo, "getApplicationInfo(...)");
                            ((g) interfaceC4280q).a(applicationInfo.nativeLibraryDir);
                            break;
                        }
                    default:
                        int i11 = MainActivity.f33906j;
                        AbstractC3340k.e(call, "call");
                        if (!AbstractC3340k.a(call.f46759a, "yuvToJpeg")) {
                            ((g) interfaceC4280q).c();
                            break;
                        } else {
                            try {
                                Object objA = call.a("nv21");
                                AbstractC3340k.b(objA);
                                byte[] bArr = (byte[]) objA;
                                Object objA2 = call.a("width");
                                AbstractC3340k.b(objA2);
                                int iIntValue = ((Number) objA2).intValue();
                                Object objA3 = call.a("height");
                                AbstractC3340k.b(objA3);
                                int iIntValue2 = ((Number) objA3).intValue();
                                Integer num = (Integer) call.a("quality");
                                int iIntValue3 = num != null ? num.intValue() : 85;
                                Integer num2 = (Integer) call.a("rotation");
                                int iIntValue4 = num2 != null ? num2.intValue() : 0;
                                mainActivity.getClass();
                                ((g) interfaceC4280q).a(MainActivity.B(bArr, iIntValue, iIntValue2, iIntValue3, iIntValue4));
                                break;
                            } catch (Exception e10) {
                                ((g) interfaceC4280q).b("CONVERSION_ERROR", e10.getMessage(), null);
                                return;
                            }
                        }
                }
            }
        });
        C4281r c4281r2 = this.f33909h;
        if (c4281r2 == null) {
            AbstractC3340k.m("channel");
            throw null;
        }
        final int i10 = 0;
        c4281r2.b(new InterfaceC4279p(this) { // from class: Nb.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f8640b;

            {
                this.f8640b = this;
            }

            @Override // uc.InterfaceC4279p
            public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) throws PackageManager.NameNotFoundException {
                MainActivity mainActivity = this.f8640b;
                switch (i10) {
                    case 0:
                        int i102 = MainActivity.f33906j;
                        AbstractC3340k.e(call, "call");
                        String str = call.f46759a;
                        if (!AbstractC3340k.a(str, "getNativeLibraryDirectory")) {
                            if (!AbstractC3340k.a(str, "javaLoadLibrary")) {
                                if (!AbstractC3340k.a(str, "startGnssStatus")) {
                                    if (!AbstractC3340k.a(str, "stopGnssStatus")) {
                                        ((g) interfaceC4280q).c();
                                        break;
                                    } else {
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            Object systemService = mainActivity.getSystemService("location");
                                            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                                            LocationManager locationManager = (LocationManager) systemService;
                                            GnssStatus$Callback gnssStatus$Callback = mainActivity.f33910i;
                                            if (gnssStatus$Callback != null) {
                                                locationManager.unregisterGnssStatusCallback(gnssStatus$Callback);
                                            }
                                        } else {
                                            mainActivity.getClass();
                                        }
                                        ((g) interfaceC4280q).a(null);
                                        break;
                                    }
                                } else {
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        Object systemService2 = mainActivity.getSystemService("location");
                                        AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.location.LocationManager");
                                        LocationManager locationManager2 = (LocationManager) systemService2;
                                        b bVar2 = new b(mainActivity, 0);
                                        mainActivity.f33910i = bVar2;
                                        try {
                                            locationManager2.registerGnssStatusCallback(bVar2);
                                        } catch (SecurityException unused) {
                                        }
                                    } else {
                                        mainActivity.getClass();
                                    }
                                    ((g) interfaceC4280q).a(null);
                                    break;
                                }
                            } else {
                                try {
                                    Object obj = call.f46760b;
                                    AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.String");
                                    System.loadLibrary((String) obj);
                                    ((g) interfaceC4280q).a(null);
                                    break;
                                } catch (Exception e7) {
                                    ((g) interfaceC4280q).b(e7.toString(), null, null);
                                    return;
                                }
                            }
                        } else {
                            mainActivity.getClass();
                            ApplicationInfo applicationInfo = mainActivity.getPackageManager().getApplicationInfo(mainActivity.getPackageName(), 128);
                            AbstractC3340k.d(applicationInfo, "getApplicationInfo(...)");
                            ((g) interfaceC4280q).a(applicationInfo.nativeLibraryDir);
                            break;
                        }
                    default:
                        int i11 = MainActivity.f33906j;
                        AbstractC3340k.e(call, "call");
                        if (!AbstractC3340k.a(call.f46759a, "yuvToJpeg")) {
                            ((g) interfaceC4280q).c();
                            break;
                        } else {
                            try {
                                Object objA = call.a("nv21");
                                AbstractC3340k.b(objA);
                                byte[] bArr = (byte[]) objA;
                                Object objA2 = call.a("width");
                                AbstractC3340k.b(objA2);
                                int iIntValue = ((Number) objA2).intValue();
                                Object objA3 = call.a("height");
                                AbstractC3340k.b(objA3);
                                int iIntValue2 = ((Number) objA3).intValue();
                                Integer num = (Integer) call.a("quality");
                                int iIntValue3 = num != null ? num.intValue() : 85;
                                Integer num2 = (Integer) call.a("rotation");
                                int iIntValue4 = num2 != null ? num2.intValue() : 0;
                                mainActivity.getClass();
                                ((g) interfaceC4280q).a(MainActivity.B(bArr, iIntValue, iIntValue2, iIntValue3, iIntValue4));
                                break;
                            } catch (Exception e10) {
                                ((g) interfaceC4280q).b("CONVERSION_ERROR", e10.getMessage(), null);
                                return;
                            }
                        }
                }
            }
        });
    }
}
