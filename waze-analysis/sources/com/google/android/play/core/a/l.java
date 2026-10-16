package com.google.android.play.core.a;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.w;
import com.waze.navigate.di;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.play.core.b.i f6944a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6945b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6946c;

    /* renamed from: d, reason: collision with root package name */
    private final di f6947d;

    l(Context context, di diVar) {
        this.f6945b = context.getPackageName();
        this.f6947d = diVar;
        this.f6946c = context;
        if (com.google.android.play.core.c.a.b(context)) {
            this.f6944a = new com.google.android.play.core.b.i(context, diVar, m.f6948a);
        } else {
            diVar.f(new Object[0]);
            this.f6944a = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(l lVar, byte[] bArr, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", lVar.f6945b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l2 != null) {
            bundle.putLong("cloud.prj", l2.longValue());
        }
        ArrayList<com.google.android.play.core.common.a.a> arrayList = new ArrayList();
        arrayList.add(com.google.android.play.core.common.a.a.b(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (com.google.android.play.core.common.a.a aVar : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", aVar.a());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }

    public final com.google.android.gms.o.t b(q qVar) {
        if (this.f6944a == null) {
            return ag.b(new n(-2));
        }
        if (com.google.android.play.core.c.a.a(this.f6946c) < 82380000) {
            return ag.b(new n(-14));
        }
        try {
            byte[] bArrDecode = Base64.decode(qVar.b(), 10);
            Long lA = qVar.a();
            this.f6947d.h("requestIntegrityToken(%s)", qVar);
            w wVar = new w();
            this.f6944a.o(new j(this, wVar, bArrDecode, lA, wVar, qVar), wVar);
            return wVar.a();
        } catch (IllegalArgumentException e2) {
            return ag.b(new n(-13, e2));
        }
    }
}
