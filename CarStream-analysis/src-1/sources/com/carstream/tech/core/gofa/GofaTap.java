package com.carstream.tech.core.gofa;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import com.carstream.tech.R;
import defpackage.f;
import defpackage.ld;
import defpackage.r4;
import defpackage.ra;
import defpackage.s4;
import defpackage.t4;
import defpackage.w7;
import defpackage.xc;
import defpackage.yc;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class GofaTap extends AccessibilityService {
    static final String ID_LIMIT = "com.gofa.mobile:id/speedLimitIcon";
    static final String ID_SPEED = "com.gofa.mobile:id/txtCurrentSpeed";
    private static final long POLL_MS = 400;
    private static final long SHOT_MS = 1500;
    public static volatile boolean connected;
    private String chosenSrc;
    private ra gofaMatcher;
    private long lastScanAt;
    private long lastShotAt;
    private boolean notedWazeApp;
    private volatile boolean shootingWaze;
    private Executor shotExec;
    private volatile boolean shotInFlight;
    private HandlerThread shotThread;
    private ra wazeMatcher;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Rect rect = new Rect();
    private int wynLimit = -1;
    private volatile int limit = -1;
    private volatile int lastRawLimit = -1;
    private String wazePkg = "com.waze";
    private final Runnable poll = new f(this, 19);

    private AccessibilityNodeInfo first(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str);
        if (listFindAccessibilityNodeInfosByViewId == null || listFindAccessibilityNodeInfosByViewId.isEmpty()) {
            return null;
        }
        return listFindAccessibilityNodeInfosByViewId.get(0);
    }

    private void flatten(AccessibilityNodeInfo accessibilityNodeInfo, List<AccessibilityNodeInfo> list, int i) {
        if (accessibilityNodeInfo == null || i > 24 || list.size() > 400) {
            return;
        }
        list.add(accessibilityNodeInfo);
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            flatten(accessibilityNodeInfo.getChild(i2), list, i + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleShot(AccessibilityService.ScreenshotResult screenshotResult, Rect rect, Rect rect2, boolean z) throws Throwable {
        Bitmap bitmapWrapHardwareBuffer;
        Bitmap bitmap = null;
        try {
            bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(screenshotResult.getHardwareBuffer(), screenshotResult.getColorSpace());
            if (bitmapWrapHardwareBuffer == null) {
                if (bitmapWrapHardwareBuffer != null) {
                }
                screenshotResult.getHardwareBuffer().close();
            }
            try {
                boolean z2 = false;
                Bitmap bitmapCopy = bitmapWrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
                if (bitmapCopy != null) {
                    if (z) {
                        rect2 = null;
                    }
                    try {
                        Rect rectMapCrop = mapCrop(rect, rect2, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                        if (rectMapCrop != null) {
                            int iA = (this.shootingWaze ? this.wazeMatcher : this.gofaMatcher).a(bitmapCopy, rectMapCrop, new StringBuilder());
                            if (iA != -1 && iA == this.lastRawLimit) {
                                z2 = true;
                            }
                            this.lastRawLimit = iA;
                            if (z2 && iA != this.limit) {
                                this.limit = iA;
                                String.valueOf(iA == 0 ? "khong so" : Integer.valueOf(iA));
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapCopy;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        if (bitmapWrapHardwareBuffer != null) {
                            bitmapWrapHardwareBuffer.recycle();
                        }
                        screenshotResult.getHardwareBuffer().close();
                        throw th;
                    }
                } else if (bitmapCopy != null) {
                }
                bitmapCopy.recycle();
            } catch (Throwable th2) {
                th = th2;
            }
            bitmapWrapHardwareBuffer.recycle();
            screenshotResult.getHardwareBuffer().close();
        } catch (Throwable th3) {
            th = th3;
            bitmapWrapHardwareBuffer = null;
        }
    }

    private boolean isChosen(boolean z) {
        return z ? "waze".equals(this.chosenSrc) : "gofa".equals(this.chosenSrc);
    }

    private static boolean isDash(char c) {
        return c == '-' || c == 8211 || c == 8212;
    }

    private boolean isSmallWindow(AccessibilityWindowInfo accessibilityWindowInfo) {
        Rect rect = new Rect();
        accessibilityWindowInfo.getBoundsInScreen(rect);
        if (rect.isEmpty()) {
            return false;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        long j = displayMetrics.widthPixels * displayMetrics.heightPixels;
        return j <= 0 || (((long) rect.width()) * ((long) rect.height())) * 100 < j * 60;
    }

    private Rect mapCrop(Rect rect, Rect rect2, int i, int i2) {
        if (rect2 == null) {
            rect2 = new Rect(((WindowManager) getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds());
        }
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            return null;
        }
        float fWidth = i / rect2.width();
        float fHeight = i2 / rect2.height();
        Rect rect3 = new Rect(Math.round((rect.left - rect2.left) * fWidth), Math.round((rect.top - rect2.top) * fHeight), Math.round((rect.right - rect2.left) * fWidth), Math.round((rect.bottom - rect2.top) * fHeight));
        if (rect3.left < 0 || rect3.top < 0 || rect3.right > i || rect3.bottom > i2 || rect3.width() < 48 || rect3.height() < 48) {
            return null;
        }
        return rect3;
    }

    private void markNoSign(boolean z, boolean z2) {
        if (isChosen(z) && this.limit != 0) {
            this.limit = 0;
            this.lastRawLimit = -1;
        }
    }

    private void maybeShoot(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect, boolean z) {
        int i;
        if (accessibilityWindowInfo == null || this.shotInFlight || (i = Build.VERSION.SDK_INT) < 30 || !isChosen(z)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.lastShotAt < SHOT_MS) {
            return;
        }
        this.lastShotAt = jUptimeMillis;
        this.shotInFlight = true;
        Rect rect2 = new Rect();
        accessibilityWindowInfo.getBoundsInScreen(rect2);
        boolean z2 = i < 34;
        t4 t4Var = new t4(this, rect, rect2, z2);
        if (z2) {
            takeScreenshot(0, this.shotExec, t4Var);
        } else {
            takeScreenshotOfWindow(accessibilityWindowInfo.getId(), this.shotExec, t4Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = r4[r0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r4.isEmpty() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        return java.lang.Integer.parseInt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 < r4.length) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int parseWynLimit(java.lang.String r4) {
        /*
            java.lang.String r0 = "\n"
            java.lang.String[] r4 = r4.split(r0)
            r0 = 0
        L7:
            int r1 = r4.length
            r2 = -1
            if (r0 >= r1) goto L38
            r1 = r4[r0]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r3 = "km/h"
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L20
            int r0 = r0 + 1
            goto L7
        L20:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 < r1) goto L26
            return r2
        L26:
            r4 = r4[r0]
            java.lang.String r4 = r4.trim()
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L33
            return r2
        L33:
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L38
            return r4
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.core.gofa.GofaTap.parseWynLimit(java.lang.String):int");
    }

    private boolean readGofa(AccessibilityWindowInfo accessibilityWindowInfo, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (first(accessibilityNodeInfo, ID_SPEED) == null) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfoFirst = first(accessibilityNodeInfo, ID_LIMIT);
        if (accessibilityNodeInfoFirst == null) {
            return true;
        }
        accessibilityNodeInfoFirst.getBoundsInScreen(this.rect);
        maybeShoot(accessibilityWindowInfo, new Rect(this.rect), false);
        return true;
    }

    private boolean readWaze(AccessibilityWindowInfo accessibilityWindowInfo, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (!isSmallWindow(accessibilityWindowInfo)) {
            if (!this.notedWazeApp) {
                this.notedWazeApp = true;
            }
            return false;
        }
        this.notedWazeApp = false;
        ArrayList arrayList = new ArrayList();
        flatten(accessibilityNodeInfo, arrayList, 0);
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        AccessibilityNodeInfo accessibilityNodeInfo2 = null;
        boolean z = false;
        boolean z2 = false;
        int iHeight = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AccessibilityNodeInfo accessibilityNodeInfo3 = (AccessibilityNodeInfo) obj;
            CharSequence className = accessibilityNodeInfo3.getClassName();
            String string = className == null ? "" : className.toString();
            if (string.endsWith("TextView")) {
                CharSequence text = accessibilityNodeInfo3.getText();
                String strTrim = text != null ? text.toString().trim() : "";
                if ("km/h".equals(strTrim)) {
                    z = true;
                } else if (strTrim.length() == 1 && isDash(strTrim.charAt(0))) {
                    z2 = true;
                }
            } else if (string.endsWith("ImageView")) {
                Rect rect = new Rect();
                accessibilityNodeInfo3.getBoundsInScreen(rect);
                int iMin = Math.min(rect.width(), rect.height());
                if (iMin >= 80 && Math.abs(rect.width() - rect.height()) * 100 <= iMin * 15) {
                    if (rect.height() * rect.width() > iHeight) {
                        iHeight = rect.height() * rect.width();
                        accessibilityNodeInfo2 = accessibilityNodeInfo3;
                    }
                }
            }
        }
        if (!z && accessibilityNodeInfo2 == null) {
            return false;
        }
        if (accessibilityNodeInfo2 != null) {
            accessibilityNodeInfo2.getBoundsInScreen(this.rect);
            maybeShoot(accessibilityWindowInfo, new Rect(this.rect), true);
        } else if (z) {
            markNoSign(true, z2);
        }
        return true;
    }

    private boolean readWyn(AccessibilityWindowInfo accessibilityWindowInfo, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityWindowInfo.getBoundsInScreen(new Rect());
        Rect rect = new Rect(((WindowManager) getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds());
        long jWidth = r0.width() * r0.height();
        long jWidth2 = rect.width() * rect.height();
        boolean z = false;
        if (jWidth2 > 0 && jWidth * 100 <= jWidth2 * 60) {
            ArrayList arrayList = new ArrayList();
            flatten(accessibilityNodeInfo, arrayList, 0);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                CharSequence contentDescription = ((AccessibilityNodeInfo) obj).getContentDescription();
                if (contentDescription != null) {
                    String string = contentDescription.toString();
                    if (string.toLowerCase().contains("km/h")) {
                        int wynLimit = parseWynLimit(string);
                        z = true;
                        if (wynLimit != this.wynLimit) {
                            this.wynLimit = wynLimit;
                            String.valueOf(wynLimit < 0 ? "khong ro" : Integer.valueOf(wynLimit));
                            string.replace('\n', ' ');
                        }
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scan() {
        CharSequence packageName;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.lastScanAt < 100) {
            return;
        }
        this.lastScanAt = jUptimeMillis;
        boolean gofa = false;
        String string = getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getString(xc.h("vietmapSource"), "widget");
        if (!string.equals(this.chosenSrc)) {
            this.chosenSrc = string;
            this.limit = -1;
            this.lastRawLimit = -1;
            this.shootingWaze = "waze".equals(string);
        }
        String strA = yc.a(this);
        if (!strA.equals(this.wazePkg)) {
            this.wazePkg = strA;
            AccessibilityServiceInfo serviceInfo = getServiceInfo();
            if (serviceInfo != null) {
                serviceInfo.packageNames = new String[]{"com.gofa.mobile", this.wazePkg, "com.wynauto.wyn"};
                setServiceInfo(serviceInfo);
            }
        }
        try {
            boolean waze = false;
            boolean wyn = false;
            for (AccessibilityWindowInfo accessibilityWindowInfo : getWindows()) {
                AccessibilityNodeInfo root = accessibilityWindowInfo.getRoot();
                if (root != null && (packageName = root.getPackageName()) != null) {
                    if ("com.gofa.mobile".contentEquals(packageName)) {
                        gofa |= readGofa(accessibilityWindowInfo, root);
                    } else if (this.wazePkg.contentEquals(packageName)) {
                        waze |= readWaze(accessibilityWindowInfo, root);
                    } else if ("com.wynauto.wyn".contentEquals(packageName)) {
                        wyn |= readWyn(accessibilityWindowInfo, root);
                    }
                }
            }
            int i = (!gofa || this.shootingWaze) ? -1 : this.limit;
            if (gofa != r4.a) {
                "gofa".equals(xc.l(this).getString(xc.h("vietmapSource"), "widget"));
            }
            r4.a = gofa;
            System.currentTimeMillis();
            if ("gofa".equals(xc.l(this).getString(xc.h("vietmapSource"), "widget"))) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (i != r4.b || jCurrentTimeMillis - r4.c >= 2000) {
                    r4.b = i;
                    r4.c = jCurrentTimeMillis;
                    if (i <= 0) {
                        i = -1;
                    }
                    w7.c(r4.d, i);
                }
            }
            int i2 = (waze && this.shootingWaze) ? this.limit : -1;
            if (waze != yc.a) {
                "waze".equals(xc.l(this).getString(xc.h("vietmapSource"), "widget"));
            }
            yc.a = waze;
            System.currentTimeMillis();
            if ("waze".equals(xc.l(this).getString(xc.h("vietmapSource"), "widget"))) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (i2 != yc.b || jCurrentTimeMillis2 - yc.c >= 2000) {
                    yc.b = i2;
                    yc.c = jCurrentTimeMillis2;
                    if (i2 <= 0) {
                        i2 = -1;
                    }
                    w7.c(yc.d, i2);
                }
            }
            int i3 = wyn ? this.wynLimit : -1;
            if (wyn != ld.a) {
                "wyn".equals(xc.l(this).getString(xc.h("vietmapSource"), "widget"));
            }
            ld.a = wyn;
            System.currentTimeMillis();
            if ("wyn".equals(xc.l(this).getString(xc.h("vietmapSource"), "widget"))) {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (i3 != ld.b || jCurrentTimeMillis3 - ld.c >= 2000) {
                    ld.b = i3;
                    ld.c = jCurrentTimeMillis3;
                    w7.c(ld.d, i3 > 0 ? i3 : -1);
                }
            }
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        scan();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
        this.wazePkg = yc.a(this);
        AccessibilityServiceInfo serviceInfo = getServiceInfo();
        if (serviceInfo == null) {
            serviceInfo = new AccessibilityServiceInfo();
        }
        serviceInfo.eventTypes = 4196384;
        serviceInfo.feedbackType = 16;
        serviceInfo.flags |= 82;
        serviceInfo.packageNames = new String[]{"com.gofa.mobile", this.wazePkg, "com.wynauto.wyn"};
        serviceInfo.notificationTimeout = 0L;
        setServiceInfo(serviceInfo);
        this.gofaMatcher = new ra(this, 0.38d, new int[]{30, 40, 50, 60, 70, 80, 90, 100, 120, 0}, new int[]{R.drawable.gofa_limit_30, R.drawable.gofa_limit_40, R.drawable.gofa_limit_50, R.drawable.gofa_limit_60, R.drawable.gofa_limit_70, R.drawable.gofa_limit_80, R.drawable.gofa_limit_90, R.drawable.gofa_limit_100, R.drawable.gofa_limit_120, R.drawable.gofa_limit_undefined});
        this.wazeMatcher = new ra(this, 0.34d, new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120}, new int[]{R.drawable.waze_limit_10, R.drawable.waze_limit_20, R.drawable.waze_limit_30, R.drawable.waze_limit_40, R.drawable.waze_limit_50, R.drawable.waze_limit_60, R.drawable.waze_limit_70, R.drawable.waze_limit_80, R.drawable.waze_limit_90, R.drawable.waze_limit_100, R.drawable.waze_limit_110, R.drawable.waze_limit_120});
        HandlerThread handlerThread = new HandlerThread("gofa-shot");
        this.shotThread = handlerThread;
        handlerThread.start();
        this.shotExec = new s4(new Handler(this.shotThread.getLooper()));
        connected = true;
        this.handler.post(this.poll);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        this.handler.removeCallbacksAndMessages(null);
        HandlerThread handlerThread = this.shotThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        connected = false;
        r4.a = false;
        yc.a = false;
        return super.onUnbind(intent);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
    }
}
