package com.google.android.projection.gearhead;

import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.SystemClock;
import defpackage.fix;
import defpackage.fiy;
import defpackage.jrl;
import defpackage.jru;
import defpackage.rhy;
import defpackage.vks;
import defpackage.vsf;
import defpackage.vwh;
import defpackage.vx;
import defpackage.wae;
import defpackage.weu;
import defpackage.xvy;
import defpackage.xxh;
import defpackage.xxm;
import defpackage.ygr;
import defpackage.yph;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class GhApplication extends Application implements wae.a, fix {
    public static final /* synthetic */ int b = 0;
    private static final yph c;
    private static final ygr d;
    public jrl a = jrl.EMPTY;

    static {
        vwh vwhVar = vwh.a;
        if (vwhVar.b == null) {
            vwhVar.b = new vsf(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
        }
        c = yph.c("CAR.GH");
        d = ygr.p("debug", "dogfood");
    }

    @Override // defpackage.fix
    public final fiy a() {
        vx vxVar = new vx();
        vxVar.a = new jru(this);
        return new fiy(vxVar);
    }

    @Override // wae.a
    public final xxh b() {
        AtomicReference atomicReference = wae.a;
        weu weuVar = new weu();
        weuVar.f = this;
        weuVar.a = new rhy(15);
        weuVar.d = new vks(xvy.a, 14);
        return new xxm(weuVar.a());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.car.service.START")) {
            i |= this.a == jrl.SHARED_SERVICE ? 64 : 32;
        }
        return super.bindService(intent, serviceConnection, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05ae  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, sxs] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, zgp] */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.projection.gearhead.GhApplication.onCreate():void");
    }
}
