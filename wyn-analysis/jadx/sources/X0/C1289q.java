package X0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.wynauto.wyn.R;
import java.util.ArrayList;

/* renamed from: X0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289q {

    /* renamed from: B, reason: collision with root package name */
    public String f15866B;

    /* renamed from: C, reason: collision with root package name */
    public String f15867C;

    /* renamed from: D, reason: collision with root package name */
    public long f15868D;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f15870F;

    /* renamed from: G, reason: collision with root package name */
    public final Notification f15871G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15872H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f15873I;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15874a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f15878e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f15879f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f15880g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f15881h;

    /* renamed from: i, reason: collision with root package name */
    public IconCompat f15882i;

    /* renamed from: j, reason: collision with root package name */
    public int f15883j;
    public int k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15885m;

    /* renamed from: n, reason: collision with root package name */
    public E f15886n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f15887o;

    /* renamed from: p, reason: collision with root package name */
    public int f15888p;

    /* renamed from: q, reason: collision with root package name */
    public int f15889q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15890r;

    /* renamed from: s, reason: collision with root package name */
    public String f15891s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15892t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15894v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15895w;

    /* renamed from: x, reason: collision with root package name */
    public String f15896x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f15897y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15875b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15876c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15877d = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public boolean f15884l = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15893u = false;

    /* renamed from: z, reason: collision with root package name */
    public int f15898z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f15865A = 0;

    /* renamed from: E, reason: collision with root package name */
    public int f15869E = 0;

    public C1289q(Context context, String str) {
        Notification notification = new Notification();
        this.f15871G = notification;
        this.f15874a = context;
        this.f15866B = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.f15873I = new ArrayList();
        this.f15870F = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        N2.j jVar = new N2.j(this);
        C1289q c1289q = (C1289q) jVar.f8378a;
        E e7 = c1289q.f15886n;
        if (e7 != null) {
            e7.b(jVar);
        }
        if (e7 != null) {
            e7.e();
        }
        int i5 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) jVar.f8381d;
        if (i5 >= 26) {
            notificationBuild = builder.build();
        } else {
            int i10 = jVar.f8379b;
            if (i5 >= 24) {
                notificationBuild = builder.build();
                if (i10 != 0) {
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && i10 == 2) {
                        N2.j.n(notificationBuild);
                    }
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && i10 == 1) {
                        N2.j.n(notificationBuild);
                    }
                }
            } else {
                builder.setExtras((Bundle) jVar.f8382e);
                notificationBuild = builder.build();
                if (i10 != 0) {
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && i10 == 2) {
                        N2.j.n(notificationBuild);
                    }
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && i10 == 1) {
                        N2.j.n(notificationBuild);
                    }
                }
            }
        }
        if (e7 != null) {
            e7.d();
        }
        if (e7 != null) {
            c1289q.f15886n.f();
        }
        if (e7 != null && (bundle = notificationBuild.extras) != null) {
            e7.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i5, boolean z2) {
        Notification notification = this.f15871G;
        if (z2) {
            notification.flags = i5 | notification.flags;
        } else {
            notification.flags = (~i5) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompatF;
        if (bitmap == null) {
            iconCompatF = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f15874a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            iconCompatF = IconCompat.f(bitmap);
        }
        this.f15882i = iconCompatF;
    }

    public final void e(Uri uri) {
        Notification notification = this.f15871G;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = AbstractC1288p.a(AbstractC1288p.d(AbstractC1288p.c(AbstractC1288p.b(), 4), 5));
    }

    public final void f(E e7) {
        if (this.f15886n != e7) {
            this.f15886n = e7;
            if (e7 == null || ((C1289q) e7.f15788b) == this) {
                return;
            }
            e7.f15788b = this;
            f(e7);
        }
    }
}
