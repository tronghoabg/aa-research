package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.a4;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* loaded from: classes4.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f32583a;

    /* renamed from: b, reason: collision with root package name */
    private final b f32584b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f32585c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f32586d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f32584b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static PglSSManager getInstance() {
        return f32583a;
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f32551b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f32583a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f32583a == null) {
                        f32583a = new PglSSManager(context, pglSSConfig);
                        if (b.d() == 0) {
                            f32583a.f32586d = pglSSConfig.getCallBack();
                            f32583a.f32584b.a(pglSSConfig.getCustomInfo());
                            f32583a.f32584b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32583a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f32584b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f32584b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f32586d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f32584b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f32584b.a(str);
            int i5 = this.f32585c;
            b bVar = this.f32584b;
            if (i5 % bVar.f32567l == 0) {
                bVar.a(str, map, !TextUtils.isEmpty(a4.a()) ? 0L : 10000L);
            }
            this.f32585c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f32584b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f32584b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f32584b.d(str);
        }
    }
}
