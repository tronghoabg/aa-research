package y4;

import A.AbstractC0213f;
import A6.c;
import Ka.b;
import X0.AbstractC1274b;
import Y0.e;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import uc.InterfaceC4285v;
import w4.C4360b;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4562a implements InterfaceC4285v {

    /* renamed from: d, reason: collision with root package name */
    public static C4562a f48021d;

    /* renamed from: a, reason: collision with root package name */
    public Activity f48022a;

    /* renamed from: b, reason: collision with root package name */
    public b f48023b;

    /* renamed from: c, reason: collision with root package name */
    public b f48024c;

    public static int a(Context context) {
        Iterator it = b(context).iterator();
        while (it.hasNext()) {
            if (e.checkSelfPermission(context, (String) it.next()) == 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    return 4;
                }
                return (c.C(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && e.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) ? 4 : 3;
            }
        }
        return 1;
    }

    public static ArrayList b(Context context) throws C4360b {
        boolean zC = c.C(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean zC2 = c.C(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zC && !zC2) {
            throw new C4360b();
        }
        ArrayList arrayList = new ArrayList();
        if (zC) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (zC2) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    public final void c(Activity activity, b bVar, b bVar2) {
        if (activity == null) {
            bVar2.onError(1);
            return;
        }
        int i5 = Build.VERSION.SDK_INT;
        ArrayList arrayListB = b(activity);
        if (i5 >= 29 && c.C(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") && a(activity) == 3) {
            arrayListB.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f48023b = bVar2;
        this.f48024c = bVar;
        this.f48022a = activity;
        AbstractC1274b.a(activity, (String[]) arrayListB.toArray(new String[0]), 109);
    }

    @Override // uc.InterfaceC4285v
    public final boolean onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        int iIndexOf;
        int i10 = 0;
        if (i5 == 109) {
            Activity activity = this.f48022a;
            if (activity == null) {
                Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
                b bVar = this.f48023b;
                if (bVar != null) {
                    bVar.onError(1);
                    return false;
                }
            } else {
                int i11 = 4;
                try {
                    ArrayList arrayListB = b(activity);
                    if (iArr.length == 0) {
                        Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                        return false;
                    }
                    Iterator it = arrayListB.iterator();
                    char c10 = 65535;
                    boolean z2 = false;
                    boolean z10 = false;
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        int iIndexOf2 = Arrays.asList(strArr).indexOf(str);
                        if (iIndexOf2 >= 0) {
                            z2 = true;
                        }
                        if (iArr[iIndexOf2] == 0) {
                            c10 = 0;
                        }
                        if (AbstractC1274b.b(this.f48022a, str)) {
                            z10 = true;
                        }
                    }
                    if (!z2) {
                        Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                        return false;
                    }
                    if (c10 != 0) {
                        i11 = !z10 ? 2 : 1;
                    } else if (Build.VERSION.SDK_INT >= 29 && ((iIndexOf = Arrays.asList(strArr).indexOf("android.permission.ACCESS_BACKGROUND_LOCATION")) < 0 || iArr[iIndexOf] != 0)) {
                        i11 = 3;
                    }
                    b bVar2 = this.f48024c;
                    if (bVar2 != null) {
                        int iF = AbstractC0213f.f(i11);
                        if (iF != 0) {
                            if (iF == 1) {
                                i10 = 1;
                            } else if (iF == 2) {
                                i10 = 2;
                            } else {
                                if (iF != 3) {
                                    throw new IndexOutOfBoundsException();
                                }
                                i10 = 3;
                            }
                        }
                        bVar2.f6712b.a(Integer.valueOf(i10));
                    }
                    return true;
                } catch (C4360b unused) {
                    b bVar3 = this.f48023b;
                    if (bVar3 != null) {
                        bVar3.onError(4);
                    }
                }
            }
        }
        return false;
    }
}
