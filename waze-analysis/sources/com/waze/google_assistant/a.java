package com.waze.google_assistant;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class a extends Handler {
    public a() {
    }

    protected void a() {
    }

    protected void b() {
    }

    protected void c() {
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f() {
    }

    protected void g() {
    }

    protected void h() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == ab.SHOW_DIRECTIONS.a()) {
            f();
        } else if (i2 == ab.SDK_STATE_CHANGED.a()) {
            a();
        } else if (i2 == ab.SHOW_ROUTE_OVERVIEW.a()) {
            h();
        } else if (i2 == ab.SHOW_ALTERNATE_ROUTES.a()) {
            e();
        } else if (i2 == ab.RECENTER_MAP.a()) {
            d();
        } else if (i2 == ab.SHOW_MAP.a()) {
            g();
        } else if (i2 != ab.NAVIGATION_GUIDANCE_CHANGED.a()) {
            if (i2 == ab.OPEN_USER_AGREEMENT.a()) {
                c();
            } else if (i2 == ab.ON_USER_AGREEMENT_DECLINED.a()) {
                b();
            }
        }
        super.handleMessage(message);
    }

    public a(Looper looper) {
        super(looper);
    }
}
