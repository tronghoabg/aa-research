package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.UserManager;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class thg {
    private static Context a;
    private static Boolean b;

    public static int c(int i, Context context) {
        return afgi.k(i * context.getResources().getDisplayMetrics().density);
    }

    public static boolean d(float f, float f2, float f3) {
        if (Math.copySign(f - f2, 1.0f) <= f3 || f == f2) {
            return true;
        }
        return Float.isNaN(f) && Float.isNaN(f2);
    }

    public static boolean e(float f, float f2) {
        return f >= f2 || d(f, f2, 0.5f);
    }

    public static boolean f(float f, float f2) {
        return f <= f2 || d(f, f2, 0.5f);
    }

    public static Object g(View view, afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        nxj nxjVar = new nxj(aitgVar, 7);
        if (view.isAttachedToWindow()) {
            nxjVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new eea(view, nxjVar, 2));
        }
        Object objK = aitgVar.k();
        return objK == afcr.a ? objK : afak.a;
    }

    public static ColorStateList h(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        colorStateListValueOf.getClass();
        return colorStateListValueOf;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    public static ColorStateList i(afec afecVar) {
        gjv gjvVar = new gjv((byte[]) null, (byte[]) null);
        afecVar.invoke(gjvVar);
        ?? r4 = gjvVar.a;
        ArrayList arrayList = new ArrayList(woy.bp(r4, 10));
        Iterator it = r4.iterator();
        while (it.hasNext()) {
            arrayList.add((int[]) ((aezu) it.next()).b);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[0][]);
        ArrayList arrayList2 = new ArrayList(woy.bp(r4, 10));
        Iterator it2 = r4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) ((aezu) it2.next()).a).intValue()));
        }
        return new ColorStateList(iArr, woy.cp(arrayList2));
    }

    public static Object j(emp empVar, afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        empVar.g(new tem(aitgVar, 0));
        aitgVar.d(new nxj(empVar, 6));
        Object objK = aitgVar.k();
        return objK == afcr.a ? objK : afak.a;
    }

    public static boolean k(Rect rect) {
        return (rect.left == 0 && rect.right == 0 && rect.top == 0 && rect.bottom == 0) ? false : true;
    }

    public static boolean l(UserManager userManager) {
        return c.a() && userManager.isPrivateProfile();
    }

    public static Bundle m(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String n() {
        return a.ce("-");
    }

    public static void o(Bundle bundle) {
        if (!((Boolean) srk.c.a()).booleanValue() || bundle == null) {
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        sxo sxoVar = srk.b;
        if (iDataSize <= ((Integer) sxoVar.a()).intValue()) {
            return;
        }
        throw new IllegalStateException("Max allowed bundle size of " + sxoVar.a().toString() + " exceeded, you are passing in a bundle of " + iDataSize + " size.");
    }

    public static void p(FeedbackOptions feedbackOptions) {
        if (((Boolean) srk.c.a()).booleanValue()) {
            Parcel parcelObtain = Parcel.obtain();
            sre.a(feedbackOptions, parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            sxo sxoVar = srk.b;
            if (iDataSize <= ((Integer) sxoVar.a()).intValue()) {
                return;
            }
            throw new IllegalStateException("Max allowed feedback options size of " + sxoVar.a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
        }
    }

    public static void q(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    public static void r(Bundle bundle, List list) {
        if (bundle.isEmpty()) {
            list.isEmpty();
        }
    }

    public static synchronized boolean s(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        b = boolValueOf;
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean t() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    @ResultIgnorabilityUnspecified
    public static void u(Context context) {
        try {
            spu.aw(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static String v(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void w(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    @ResultIgnorabilityUnspecified
    public static FeedbackOptions x(Bitmap bitmap, Bundle bundle, String str, String str2, List list, LogOptions logOptions, thg thgVar, String str3) {
        FeedbackOptions feedbackOptions = new FeedbackOptions(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null, null);
        feedbackOptions.m = bitmap;
        feedbackOptions.f = null;
        feedbackOptions.a = null;
        feedbackOptions.c = str;
        feedbackOptions.b = bundle;
        feedbackOptions.e = str2;
        feedbackOptions.h = list;
        feedbackOptions.i = false;
        feedbackOptions.j = null;
        feedbackOptions.k = logOptions;
        feedbackOptions.l = false;
        feedbackOptions.u = thgVar;
        feedbackOptions.n = str3;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        feedbackOptions.q = false;
        feedbackOptions.r = null;
        feedbackOptions.s = null;
        feedbackOptions.t = null;
        return feedbackOptions;
    }

    public List a() {
        throw null;
    }

    public List b() {
        throw null;
    }
}
