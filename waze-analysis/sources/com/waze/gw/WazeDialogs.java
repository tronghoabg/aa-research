package com.waze.gw;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes10.dex */
final class WazeDialogs {
    private static final int MAX_SHOW_ATTEMPTS = 4;
    private static final String MESSAGE = "Bản mod được làm bởi Chisadin và chỉ được tải chính thức tại:\n\nhttps://wazemod.io.vn\n\nMọi nguồn tải không đến từ trang này đều là giả mạo. Ứng dụng Waze gốc và các quyền liên quan thuộc Waze Mobile Ltd. cùng các công ty liên kết Google.";
    private static final String PREFS = "waze_hud_gw";
    private static final String SEEN_AUTHENTICITY = "authenticity_notice_v1_seen";
    private static final String TAG = "WazeGW";
    private static final String TITLE = "Thông báo bản mod";
    private static volatile int attempts;
    private static volatile boolean pending;

    private WazeDialogs() {
    }

    static void showAuthenticityNoticeOnce(final View view) {
        if (view == null) {
            return;
        }
        final Context context = view.getContext();
        if (isSeen(context) || pending || attempts >= 4) {
            return;
        }
        pending = true;
        view.postDelayed(new Runnable() { // from class: com.waze.gw.WazeDialogs.1
            @Override // java.lang.Runnable
            public void run() {
                WazeDialogs.attempts++;
                if (!view.isAttachedToWindow() || !WazeDialogs.showNative(context)) {
                    WazeDialogs.pending = false;
                    if (WazeDialogs.attempts < 4 && view.isAttachedToWindow()) {
                        View view2 = view;
                        final View view3 = view;
                        view2.postDelayed(new Runnable(this) { // from class: com.waze.gw.WazeDialogs.1.1
                            final /* synthetic */ AnonymousClass1 this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                WazeDialogs.showAuthenticityNoticeOnce(view3);
                            }
                        }, 1200L);
                    }
                }
            }
        }, 900L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean showNative(Context context) {
        if (showModernNative(context) || showLegacyNative(context)) {
            return true;
        }
        Log.w(TAG, "native Waze dialog unavailable");
        return false;
    }

    private static boolean showModernNative(final Context context) {
        try {
            Class<?> cls = Class.forName("com.waze.ab.o");
            Class<?> cls2 = Class.forName("com.waze.ab.q");
            Object objNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            cls.getMethod("Q", String.class).invoke(objNewInstance, TITLE);
            cls.getMethod("O", CharSequence.class).invoke(objNewInstance, MESSAGE);
            cls.getMethod("M", String.class).invoke(objNewInstance, "Đóng");
            cls.getField(CmcdData.OBJECT_TYPE_AUDIO_ONLY).set(objNewInstance, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.waze.gw.WazeDialogs.2
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    boolean z = false;
                    if ("onClick".equals(name)) {
                        WazeDialogs.markSeen(context);
                        WazeDialogs.pending = false;
                        return null;
                    }
                    if ("hashCode".equals(name)) {
                        return Integer.valueOf(System.identityHashCode(obj));
                    }
                    if (!"equals".equals(name)) {
                        if ("toString".equals(name)) {
                            return "ModAuthenticityDialogCallback";
                        }
                        return null;
                    }
                    if (objArr != null && objArr.length == 1 && obj == objArr[0]) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }));
            cls.getMethod("H", DialogInterface.OnCancelListener.class).invoke(objNewInstance, new DialogInterface.OnCancelListener() { // from class: com.waze.gw.WazeDialogs.3
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    WazeDialogs.pending = false;
                }
            });
            if (Class.forName("com.waze.z.a.d.ai").getMethod("q", cls).invoke(null, objNewInstance) == null) {
                return false;
            }
            Log.i(TAG, "authenticity notice shown with native Waze dialog");
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean showLegacyNative(final Context context) {
        try {
            Class<?> cls = Class.forName("com.waze.MsgBox");
            Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            cls.getMethod("OpenMessageBoxTimeoutJavaCb", String.class, String.class, String.class, Integer.TYPE, DialogInterface.OnClickListener.class).invoke(objInvoke, TITLE, MESSAGE, "Đóng", 0, new DialogInterface.OnClickListener() { // from class: com.waze.gw.WazeDialogs.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    WazeDialogs.markSeen(context);
                    WazeDialogs.pending = false;
                }
            });
            Log.i(TAG, "authenticity notice shown with legacy native Waze dialog");
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean isSeen(Context context) {
        SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences(PREFS, 0);
        return sharedPreferences != null && sharedPreferences.getBoolean(SEEN_AUTHENTICITY, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void markSeen(Context context) {
        if (context != null) {
            context.getSharedPreferences(PREFS, 0).edit().putBoolean(SEEN_AUTHENTICITY, true).apply();
        }
    }
}
