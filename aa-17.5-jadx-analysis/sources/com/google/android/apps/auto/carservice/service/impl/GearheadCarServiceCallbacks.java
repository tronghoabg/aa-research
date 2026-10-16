package com.google.android.apps.auto.carservice.service.impl;

import android.content.Context;
import android.content.res.Configuration;
import defpackage.iku;
import defpackage.ikv;
import defpackage.jew;
import defpackage.mdd;
import defpackage.vky;
import defpackage.xhv;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes.dex */
public final class GearheadCarServiceCallbacks implements ikv {
    public static final yph a = yph.c("CAR.CALLBACKS");
    public static volatile iku b;
    public static volatile jew c;
    public final Configuration d;

    /* loaded from: classes2.dex */
    public static class CarModeBroadcastReceiver extends mdd {
        private static final void c(String str, xhv xhvVar) {
            if (GearheadCarServiceCallbacks.b != null) {
                ((ype) ((ype) GearheadCarServiceCallbacks.a.f()).ai(2595)).M("%s: %s; quitting projection [CarServiceBinderProxyImpl]", xhvVar.name(), str);
                GearheadCarServiceCallbacks.b.fl(xhvVar);
            }
        }

        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("CarModeBroadcastReceiver");
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
        @Override // defpackage.mdd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(android.content.Context r4, android.content.Intent r5) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks.CarModeBroadcastReceiver.b(android.content.Context, android.content.Intent):void");
        }
    }

    public GearheadCarServiceCallbacks(Context context) {
        this.d = new Configuration(context.getResources().getConfiguration());
    }
}
