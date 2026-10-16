package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class af {
    private static ViewConfiguration bcc = null;
    private static boolean cq = true;
    private static int cz = -1;
    private static Boolean dj = null;
    private static int ivm = -1;
    private static int lw = -1;
    private static int moa = -1;

    /* renamed from: oa, reason: collision with root package name */
    private static int f26128oa = -1;
    private static float uef = -1.0f;
    private static final Object wrv = new Object();
    private static WindowManager xs = null;
    private static float yo = -1.0f;
    private static float zjm = -1.0f;

    public static boolean ab(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static float bcc(Context context) {
        uef(context, true);
        return uef;
    }

    public static boolean bs(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int cq(Context context) {
        return ((Integer) dj(context).first).intValue();
    }

    public static float cz(Context context) {
        uef(context);
        return yo;
    }

    public static Pair<Integer, Integer> dj(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.sy.uef();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static boolean dz(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int ivm(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.sy.uef();
        }
        if (context == null) {
            return ivm;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            ivm = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return ivm;
    }

    public static int lw(Context context) {
        uef(context);
        return lw;
    }

    public static int moa(Context context) {
        uef(context);
        return yo(context, moa);
    }

    public static boolean sy(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    private static boolean uef(int i5) {
        return i5 == 0 || i5 == 8 || i5 == 4;
    }

    public static boolean wk(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int wrv(Context context) {
        return ((Integer) dj(context).second).intValue();
    }

    public static int xs(Context context) {
        uef(context);
        return yo(context, lw);
    }

    private static boolean yo() {
        return uef < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f26128oa < 0 || yo < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || moa < 0 || lw < 0;
    }

    public static int zjm(Context context) {
        uef(context);
        return f26128oa;
    }

    public static int oa(Context context, float f10) {
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return Float.valueOf(uef(context, f10, true)).intValue();
    }

    public static void uef(Context context) {
        uef(context, false);
    }

    public static int yo(Context context, float f10) {
        uef(context, true);
        float fBcc = bcc(context);
        if (fBcc <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fBcc = 1.0f;
        }
        return (int) ((f10 / fBcc) + 0.5f);
    }

    public static void lw(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.af.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    af.uef(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static boolean moa(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int[] oa(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (context == null) {
            return null;
        }
        if (xs == null) {
            xs = (WindowManager) com.bytedance.sdk.openadsdk.core.sy.uef().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = xs;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i5 = displayMetrics.widthPixels;
            int i10 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i5 = point.x;
                i10 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i5;
            iArr[1] = i10;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static void uef(Context context, boolean z2) {
        Context contextUef = context == null ? com.bytedance.sdk.openadsdk.core.sy.uef() : context;
        if (contextUef == null) {
            return;
        }
        xs = (WindowManager) contextUef.getSystemService("window");
        if (yo() || z2) {
            DisplayMetrics displayMetrics = contextUef.getResources().getDisplayMetrics();
            uef = displayMetrics.density;
            f26128oa = displayMetrics.densityDpi;
            yo = displayMetrics.scaledDensity;
            moa = displayMetrics.widthPixels;
            lw = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i5 = moa;
            int i10 = lw;
            if (i5 > i10) {
                moa = i10;
                lw = i5;
            }
        } else {
            int i11 = moa;
            int i12 = lw;
            if (i11 < i12) {
                moa = i12;
                lw = i11;
            }
        }
        ivm = configuration.smallestScreenWidthDp;
    }

    public static void xs(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean moa(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    cq = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e7.getMessage());
            }
        }
        return false;
    }

    public static int yo(Context context) {
        uef(context);
        return moa;
    }

    public static int[] yo(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void ivm(View view) {
        if (view == null) {
            return;
        }
        uef(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.af.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static boolean yo(Activity activity) {
        if (dj == null) {
            synchronized (wrv) {
                try {
                    if (dj == null) {
                        String strUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strUef) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strUef);
                                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                    if (str.equals(jSONArray.getString(i5))) {
                                        dj = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e7) {
                                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e7.getMessage());
                            }
                        }
                        dj = Boolean.valueOf(moa(activity) || uef("ro.miui.notch", activity) == 1 || dz(activity) || sy(activity) || wk(activity) || ab(activity) || bs(activity));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dj.booleanValue();
    }

    public static int[] oa(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float uef(Context context, float f10) {
        uef(context);
        return cz(context) * f10;
    }

    public static void oa(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static float uef(Context context, float f10, boolean z2) {
        uef(context);
        return (bcc(context) * f10) + (z2 ? 0.5f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static int[] uef(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean oa() {
        return cq && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap oa(com.bytedance.sdk.component.cz.ivm ivmVar) {
        if (ivmVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ivmVar.getWidth(), ivmVar.getHeight(), Bitmap.Config.RGB_565);
            ivmVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void uef(View view, int i5) {
        if (view == null || view.getVisibility() == i5 || !uef(i5)) {
            return;
        }
        view.setVisibility(i5);
    }

    public static void uef(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yo(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, String str2, final Bitmap bitmap, final String str3, final long j8) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.utils.af.4
                        @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                        public JSONObject yo() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iUef = af.uef(bitmap);
                                jSONObject.put("url", str3);
                                long j10 = j8;
                                if (j10 != -1) {
                                    jSONObject.put("page_id", j10);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iUef == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.cp.oa(gzwVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(gzwVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    private static ArrayList<Integer> oa(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i5 = width * height;
            int[] iArr = new int[i5];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = iArr[i10];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i11) >> 16, (65280 & i11) >> 8, i11 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void uef(View view, int i5, int i10, int i11, int i12) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        uef(view, (ViewGroup.MarginLayoutParams) layoutParams, i5, i10, i11, i12);
    }

    private static void uef(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i10, int i11, int i12) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i5 && marginLayoutParams.topMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.bottomMargin == i12) {
            return;
        }
        if (i5 != -3) {
            marginLayoutParams.leftMargin = i5;
        }
        if (i10 != -3) {
            marginLayoutParams.topMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.rightMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.bottomMargin = i12;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void oa(View view, final float f10) {
        if (view != null && f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.af.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap uef(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float uef() {
        float f10 = zjm;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.sy.uef().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        zjm = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void uef(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e7.getMessage());
        }
    }

    public static int uef(String str, Activity activity) throws ClassNotFoundException {
        if (pz.ivm()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e7) {
                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e7.getMessage());
            } catch (IllegalAccessException e10) {
                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e10.getMessage());
            } catch (IllegalArgumentException e11) {
                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e11.getMessage());
            } catch (NoSuchMethodException e12) {
                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e12.getMessage());
            } catch (InvocationTargetException e13) {
                com.bytedance.sdk.component.utils.dhk.yo("UIUtils", e13.getMessage());
            }
        }
        return 0;
    }

    public static void uef(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.dhk.yo("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void uef(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.dhk.yo("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void uef(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void uef(TextView textView, com.bytedance.sdk.openadsdk.core.widget.ab abVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        uef(textView, abVar, gzwVar, 14);
    }

    public static void uef(TextView textView, com.bytedance.sdk.openadsdk.core.widget.ab abVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5) {
        uef(textView, abVar, (gzwVar == null || gzwVar.no() == null) ? -1.0d : gzwVar.no().moa(), i5);
    }

    public static void uef(TextView textView, com.bytedance.sdk.openadsdk.core.widget.ab abVar, double d3, int i5) {
        if (d3 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            abVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d3)));
            }
            uef(abVar, d3, i5);
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.widget.ab abVar, double d3, int i5) {
        if (d3 < 0.0d) {
            abVar.setVisibility(8);
        } else {
            abVar.setVisibility(0);
            abVar.uef(d3, i5);
        }
    }

    public static Bitmap uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = ivmVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapOa = oa(ivmVar);
        if (bitmapOa == null) {
            bitmapOa = uef(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapOa == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.moa.uef(bitmapOa, bitmapOa.getWidth() / 6, bitmapOa.getHeight() / 6);
    }

    public static void uef(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j8) {
        km.oa(new com.bytedance.sdk.component.bcc.oa.yo("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.af.3
            @Override // java.lang.Runnable
            public void run() {
                af.yo(gzwVar, str, str2, bitmap, str3, j8);
            }
        }, 10);
    }

    public static int uef(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListOa = oa(bitmap);
            if (arrayListOa == null) {
                return -1;
            }
            HashMap map = new HashMap();
            Iterator<Integer> it = arrayListOa.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (map.containsKey(next)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(next)).intValue() + 1);
                    map.remove(next);
                    map.put(next, numValueOf);
                } else {
                    map.put(next, 1);
                }
            }
            int iIntValue = 0;
            int i5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i5 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i5 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i5 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean uef(float f10, float f11, Context context) {
        if (f10 != -1.0f && f11 != -1.0f) {
            if (bcc == null) {
                bcc = ViewConfiguration.get(context);
            }
            if (cz == -1) {
                cz = bcc.getScaledTouchSlop();
            }
            if (f10 - f11 > cz) {
                return true;
            }
        }
        return false;
    }

    public static void uef(boolean z2) {
        dj = Boolean.valueOf(z2);
    }
}
