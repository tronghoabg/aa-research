package flutter.overlay.window.flutter_overlay_window;

import E4.y;
import E5.C0461l;
import S3.f;
import Va.X7;
import X0.C1289q;
import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import b7.k;
import cc.C1594a;
import cc.c;
import g2.C2690k;
import java.util.Timer;
import kc.p;
import kc.r;
import lc.C3458b;
import lc.d;
import mc.a;
import mc.b;
import oc.C3665d;
import tc.g;
import uc.C4275l;
import uc.C4281r;

/* loaded from: classes5.dex */
public class OverlayService extends Service implements View.OnTouchListener {

    /* renamed from: q, reason: collision with root package name */
    public static OverlayService f35437q = null;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f35438r = false;

    /* renamed from: c, reason: collision with root package name */
    public Resources f35441c;

    /* renamed from: e, reason: collision with root package name */
    public r f35443e;

    /* renamed from: f, reason: collision with root package name */
    public C4281r f35444f;

    /* renamed from: g, reason: collision with root package name */
    public X7 f35445g;

    /* renamed from: j, reason: collision with root package name */
    public float f35448j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public int f35449l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35450m;

    /* renamed from: a, reason: collision with root package name */
    public Integer f35439a = -1;

    /* renamed from: b, reason: collision with root package name */
    public Integer f35440b = -1;

    /* renamed from: d, reason: collision with root package name */
    public WindowManager f35442d = null;

    /* renamed from: h, reason: collision with root package name */
    public final int f35446h = 920;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f35447i = new Handler();

    /* renamed from: n, reason: collision with root package name */
    public final Point f35451n = new Point();

    /* renamed from: o, reason: collision with root package name */
    public Timer f35452o = null;

    /* renamed from: p, reason: collision with root package name */
    public c f35453p = null;

    public final int a(int i5) {
        return (int) TypedValue.applyDimension(1, Float.parseFloat(i5 + ""), this.f35441c.getDisplayMetrics());
    }

    public final void b(int i5, int i10, g gVar) {
        if (this.f35442d == null) {
            if (gVar != null) {
                gVar.a(Boolean.FALSE);
                return;
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f35443e.getLayoutParams();
        int iA = -1;
        if (i5 != -1999 && i5 != -1) {
            iA = a(i5);
        }
        layoutParams.x = iA;
        layoutParams.y = a(i10);
        this.f35442d.updateViewLayout(this.f35443e, layoutParams);
        if (gVar != null) {
            gVar.a(Boolean.TRUE);
        }
    }

    public final int c() {
        if (this.f35439a.intValue() == -1) {
            int identifier = this.f35441c.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                this.f35439a = Integer.valueOf(this.f35441c.getDimensionPixelSize(identifier));
            } else {
                this.f35439a = Integer.valueOf(a(25));
            }
        }
        return this.f35439a.intValue();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        C3458b c3458bA = (C3458b) y.a().f3001a.get("wynCachedEngine");
        if (c3458bA == null) {
            d dVar = new d(this, null);
            a aVar = new a((String) ((M.y) ((C3665d) k.z().f19396b).f41476d).f7228c, "overlayMain");
            C0461l c0461l = new C0461l(this);
            c0461l.f3455e = aVar;
            c0461l.f3456f = null;
            c3458bA = dVar.a(c0461l);
            y.a().b("wynCachedEngine", c3458bA);
        }
        b bVar = c3458bA.f40253c;
        this.f35444f = new C4281r(bVar, "x-slayer/overlay");
        this.f35445g = new X7(bVar, C4275l.f46757a, (Object) null, "x-slayer/overlay_messenger");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(cc.b.c());
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) C1594a.class), i5 >= 31 ? 67108864 : 134217728);
        int identifier = getApplicationContext().getResources().getIdentifier("ic_launcher", "mipmap", getApplicationContext().getPackageName());
        C1289q c1289q = new C1289q(this, "Overlay Channel");
        c1289q.f15878e = C1289q.b(f.f10948g);
        c1289q.f15879f = C1289q.b(f.f10949h);
        if (identifier == 0) {
            identifier = 2131231155;
        }
        c1289q.f15871G.icon = identifier;
        c1289q.f15880g = activity;
        c1289q.f15865A = f.f10951j;
        Notification notificationA = c1289q.a();
        if (i5 < 33) {
            startForeground(4579, notificationA);
        } else {
            startForeground(4579, notificationA, 1073741824);
        }
        f35437q = this;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        WindowManager windowManager = this.f35442d;
        if (windowManager != null) {
            windowManager.removeView(this.f35443e);
            this.f35442d = null;
            this.f35443e.b();
            this.f35443e = null;
        }
        f35438r = false;
        ((NotificationManager) getApplicationContext().getSystemService("notification")).cancel(4579);
        f35437q = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        this.f35441c = getApplicationContext().getResources();
        if (intent != null && intent.getExtras() != null) {
            int intExtra = intent.getIntExtra("startX", -6);
            int intExtra2 = intent.getIntExtra("startY", -6);
            if (intent.getBooleanExtra("IsCloseWindow", false)) {
                WindowManager windowManager = this.f35442d;
                if (windowManager != null) {
                    windowManager.removeView(this.f35443e);
                    this.f35442d = null;
                    this.f35443e.b();
                    stopSelf();
                }
                f35438r = false;
                return 1;
            }
            WindowManager windowManager2 = this.f35442d;
            if (windowManager2 != null) {
                windowManager2.removeView(this.f35443e);
                this.f35442d = null;
                this.f35443e.b();
                stopSelf();
            }
            f35438r = true;
            C3458b c3458b = (C3458b) y.a().f3001a.get("wynCachedEngine");
            C2690k c2690k = c3458b.f40257g;
            c2690k.f(2, c2690k.f35615a);
            r rVar = new r(getApplicationContext(), new p(getApplicationContext()));
            this.f35443e = rVar;
            rVar.a(c3458b);
            this.f35443e.setFitsSystemWindows(true);
            this.f35443e.setFocusable(true);
            this.f35443e.setFocusableInTouchMode(true);
            this.f35443e.setBackgroundColor(0);
            this.f35444f.b(new S8.b(this, 21));
            this.f35445g.n(new V1.c(19));
            WindowManager windowManager3 = (WindowManager) getSystemService("window");
            this.f35442d = windowManager3;
            int i11 = Build.VERSION.SDK_INT;
            windowManager3.getDefaultDisplay().getSize(this.f35451n);
            if (intExtra == -6) {
                intExtra = 0;
            }
            if (intExtra2 == -6) {
                intExtra2 = -c();
            }
            int i12 = f.f10944c;
            int i13 = i12 == -1999 ? -1 : i12;
            int iC = f.f10943b;
            if (iC == -1999) {
                Display defaultDisplay = this.f35442d.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                if (this.f35441c.getConfiguration().orientation == 1) {
                    int iC2 = c() + displayMetrics.heightPixels;
                    if (this.f35440b.intValue() == -1) {
                        int identifier = this.f35441c.getIdentifier("navigation_bar_height", "dimen", "android");
                        if (identifier > 0) {
                            this.f35440b = Integer.valueOf(this.f35441c.getDimensionPixelSize(identifier));
                        } else {
                            this.f35440b = Integer.valueOf(a(48));
                        }
                    }
                    iC = this.f35440b.intValue() + iC2;
                } else {
                    iC = c() + displayMetrics.heightPixels;
                }
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i13, iC, 0, -c(), i11 >= 26 ? 2038 : 2002, f.f10945d | R.attr.accessibilityEventTypes, -3);
            if (i11 >= 31 && f.f10945d == this.f35446h) {
                layoutParams.alpha = 0.8f;
            }
            layoutParams.gravity = f.f10946e;
            this.f35443e.setOnTouchListener(this);
            this.f35442d.addView(this.f35443e, layoutParams);
            b(intExtra, intExtra2, null);
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (((r3 * r3) + (r1 * r1)) < 25.0f) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flutter.overlay.window.flutter_overlay_window.OverlayService.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
