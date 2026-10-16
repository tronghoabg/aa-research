package com.google.firebase.appcheck.playintegrity.a;

import android.content.BroadcastReceiver;
import com.google.firebase.crashlytics.a.d.t;
import com.google.firebase.remoteconfig.i;
import com.google.firebase.remoteconfig.internal.w;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8899a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f8900b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f8900b = i2;
        this.f8899a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8900b) {
            case 0:
                e eVar = (e) this.f8899a;
                return a.a(eVar.f8904c.a(new JSONObject().toString().getBytes("UTF-8"), eVar.f8907f));
            case 1:
                ((BroadcastReceiver.PendingResult) this.f8899a).finish();
                return null;
            case 2:
                t.k((t) this.f8899a);
                return null;
            case 3:
                return com.google.firebase.f.c.c((com.google.firebase.f.c) this.f8899a);
            case 4:
                com.google.firebase.f.c.d((com.google.firebase.f.c) this.f8899a);
                return null;
            case 5:
                return ((i) this.f8899a).a("firebase");
            case 6:
                return ((w) this.f8899a).a();
            default:
                return com.waze.shared_infra.i.a.e().a(new com.waze.shared_infra.i.c((String) this.f8899a));
        }
    }
}
