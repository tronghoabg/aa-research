package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class n4 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f22326a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22327b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22328c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22329d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f22330e;

    public n4(Activity activity) {
        this.f22326a = activity;
        int iD = o7.d(activity);
        this.f22328c = iD;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f22329d = zIsTablet;
        this.f22327b = a(iD, zIsTablet);
        this.f22330e = zIsTablet && 2 == a(activity);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i5;
        if (!bVar.x0() || (i5 = this.f22327b) == -1) {
            a(bVar.W());
        } else {
            a(i5);
        }
    }

    private int a(int i5, boolean z2) {
        if (z2 && this.f22330e) {
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 1) {
                return 9;
            }
            if (i5 == 2) {
                return 8;
            }
            return i5 == 3 ? 1 : -1;
        }
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 9;
        }
        return i5 == 3 ? 8 : -1;
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.f22329d && this.f22330e) {
                int i5 = this.f22328c;
                if (i5 != 1 && i5 != 3) {
                    a(1);
                    return;
                } else if (i5 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i10 = this.f22328c;
            if (i10 != 0 && i10 != 2) {
                a(1);
                return;
            } else {
                a(i10 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.f22329d && this.f22330e) {
                int i11 = this.f22328c;
                if (i11 != 0 && i11 != 2) {
                    a(0);
                    return;
                } else {
                    a(i11 != 2 ? 0 : 8);
                    return;
                }
            }
            int i12 = this.f22328c;
            if (i12 != 1 && i12 != 3) {
                a(0);
            } else {
                a(i12 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = o7.f(context).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i5) {
        try {
            this.f22326a.setRequestedOrientation(i5);
        } catch (Throwable unused) {
        }
    }
}
