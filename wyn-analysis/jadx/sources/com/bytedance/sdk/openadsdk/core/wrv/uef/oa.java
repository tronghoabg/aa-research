package com.bytedance.sdk.openadsdk.core.wrv.uef;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.core.sy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private static volatile oa uef;

    /* renamed from: oa, reason: collision with root package name */
    private final ArrayList<String> f25821oa = new ArrayList<>();
    private final AtomicBoolean yo = new AtomicBoolean(false);
    private long moa = System.currentTimeMillis();
    private long lw = 0;
    private long ivm = 0;
    private String xs = "";
    private String bcc = "";
    private String cz = "";
    private boolean zjm = false;
    private boolean dj = false;

    public static oa uef(Application application) {
        if (uef == null) {
            synchronized (oa.class) {
                try {
                    if (uef == null) {
                        oa oaVar = new oa();
                        uef = oaVar;
                        oaVar.zjm = uef((Context) application);
                        uef.dj = uef(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        uef.uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public void oa(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f25821oa.contains(localClassName)) {
            this.f25821oa.remove(localClassName);
        }
        if (this.f25821oa.size() == 0) {
            this.moa = System.currentTimeMillis();
            this.yo.set(true);
            this.bcc = localClassName;
        }
    }

    private static int uef(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean uef(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void uef(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f25821oa.size() == 0) {
            this.xs = localClassName;
            this.lw = System.currentTimeMillis();
            this.ivm = System.currentTimeMillis() - this.moa;
            this.yo.set(false);
        }
        if (!this.f25821oa.contains(localClassName)) {
            this.f25821oa.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.cz = localClassName;
    }

    private void uef() {
        int size;
        boolean z2 = true;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i5 = 0; i5 < size; i5++) {
                    Object objValueAt = arrayMap.valueAt(i5);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.f25821oa.contains(localClassName)) {
                            this.f25821oa.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.yo;
                if (this.f25821oa.size() > 0) {
                    z2 = false;
                }
                atomicBoolean.set(z2);
            }
        } catch (Throwable unused) {
        }
    }

    public String uef(String str, long j8, int i5) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.lw;
        long j11 = jCurrentTimeMillis - j8;
        int i10 = j11 < 500 ? 1 : 0;
        if (this.yo.get() && this.dj) {
            i10 |= 2;
        }
        if (!this.yo.get() && this.ivm >= 5000 && j10 < 1000) {
            i10 = this.bcc.equals(this.cz) ? i10 | 4 : i10 | 8;
        }
        try {
            string = new JSONObject().put("rst", i10).put("adtag", str).put("bakdur", this.ivm).put("rit", i5).put("poptime", j10).put("unlocktime", j11).put("bakground", this.yo).put("alert", this.dj).put("sys", this.zjm).put("actsize", this.f25821oa.size()).put("mutiproc", true ^ tpx.uef(sy.uef())).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.xs = "";
        this.ivm = 0L;
        this.lw = 0L;
        this.moa = System.currentTimeMillis();
        return string;
    }
}
