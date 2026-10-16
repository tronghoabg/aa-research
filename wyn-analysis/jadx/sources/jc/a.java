package Jc;

import A.AbstractC0213f;
import A7.V1;
import android.app.Activity;
import android.content.IntentFilter;
import android.view.WindowManager;
import md.J;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final IntentFilter f5997g = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* renamed from: a, reason: collision with root package name */
    public final Activity f5998a;

    /* renamed from: b, reason: collision with root package name */
    public final J f5999b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6000c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6001d;

    /* renamed from: e, reason: collision with root package name */
    public int f6002e;

    /* renamed from: f, reason: collision with root package name */
    public V1 f6003f;

    public a(Activity activity, J j8, boolean z2, int i5) {
        this.f5998a = activity;
        this.f5999b = j8;
        this.f6000c = z2;
        this.f6001d = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L6
            int r6 = r5.b()
        L6:
            int r6 = A.AbstractC0213f.f(r6)
            r0 = 270(0x10e, float:3.78E-43)
            if (r6 == 0) goto L27
            r1 = 1
            if (r6 == r1) goto L25
            r1 = 2
            r2 = 180(0xb4, float:2.52E-43)
            boolean r3 = r5.f6000c
            r4 = 0
            if (r6 == r1) goto L22
            r1 = 3
            if (r6 == r1) goto L1d
            goto L29
        L1d:
            if (r3 == 0) goto L20
        L1f:
            r2 = r4
        L20:
            r4 = r2
            goto L29
        L22:
            if (r3 == 0) goto L1f
            goto L20
        L25:
            r4 = r0
            goto L29
        L27:
            r4 = 90
        L29:
            int r6 = r5.f6001d
            int r4 = r4 + r6
            int r4 = r4 + r0
            int r4 = r4 % 360
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Jc.a.a(int):int");
    }

    public final int b() {
        Activity activity = this.f5998a;
        int rotation = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation();
        int i5 = activity.getResources().getConfiguration().orientation;
        if (i5 != 1) {
            if (i5 == 2) {
                return (rotation == 0 || rotation == 1) ? 3 : 4;
            }
        } else if (rotation != 0 && rotation != 1) {
            return 2;
        }
        return 1;
    }

    public final int c(int i5) {
        if (i5 == 0) {
            i5 = b();
        }
        int iF = AbstractC0213f.f(i5);
        int i10 = 0;
        if (iF != 0) {
            if (iF == 1) {
                i10 = 180;
            } else if (iF == 2) {
                i10 = 270;
            } else if (iF == 3) {
                i10 = 90;
            }
        }
        if (this.f6000c) {
            i10 *= -1;
        }
        return ((i10 + this.f6001d) + 360) % 360;
    }
}
