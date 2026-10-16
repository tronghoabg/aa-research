package com.waze.z.a.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.core.app.ActivityCompat;
import com.waze.asks.au;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class y implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46007e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f46008f;

    public /* synthetic */ y(com.waze.an.a.a.ac acVar, au auVar, com.waze.asks.j jVar, com.waze.an.a.u uVar, h.g.a.l lVar, int i2) {
        this.f46008f = i2;
        this.f46003a = acVar;
        this.f46006d = auVar;
        this.f46005c = jVar;
        this.f46007e = uVar;
        this.f46004b = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f46008f;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f46007e.setValue(Boolean.valueOf(false));
                this.f46003a.setValue(Boolean.valueOf(true));
                ((com.waze.t.c.k) this.f46004b).a().h();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ((Context) this.f46005c).getPackageName(), null));
                ((ActivityResultLauncher) this.f46006d).launch(intent);
                return h.ab.f48028a;
            }
            ?? r2 = this.f46004b;
            if (i2 != 2) {
                Object obj = this.f46007e;
                Object obj2 = this.f46005c;
                return com.waze.an.a.a.ac.c((com.waze.an.a.a.ac) this.f46003a, (au) this.f46006d, (com.waze.asks.j) obj2, (com.waze.an.a.u) obj, r2);
            }
            Object obj3 = this.f46007e;
            Object obj4 = this.f46005c;
            return com.waze.an.a.a.ac.b((com.waze.an.a.a.ac) this.f46003a, (au) this.f46006d, (com.waze.asks.j) obj4, (com.waze.an.a.u) obj3, r2);
        }
        aj ajVarA = ((ak) this.f46003a).a();
        if (ajVarA != null) {
            ?? r3 = this.f46004b;
            al alVar = al.f45928a;
            int iOrdinal = ajVarA.ordinal();
            if (iOrdinal == 0) {
                r3.invoke();
            } else {
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    throw new h.i();
                }
                Object obj5 = this.f46005c;
                if (com.waze.ad.a.j.u((Context) obj5)) {
                    r3.invoke();
                } else if ((obj5 instanceof Activity) && ActivityCompat.shouldShowRequestPermissionRationale((Activity) obj5, "android.permission.RECORD_AUDIO")) {
                    this.f46007e.setValue(Boolean.valueOf(true));
                } else {
                    ((ActivityResultLauncher) this.f46006d).launch("android.permission.RECORD_AUDIO");
                }
            }
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ y(com.waze.t.c.k kVar, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, MutableState mutableState2, Context context, int i2) {
        this.f46008f = i2;
        this.f46004b = kVar;
        this.f46006d = managedActivityResultLauncher;
        this.f46007e = mutableState;
        this.f46003a = mutableState2;
        this.f46005c = context;
    }

    public /* synthetic */ y(an anVar, h.g.a.a aVar, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, int i2) {
        this.f46008f = i2;
        this.f46003a = anVar;
        this.f46004b = aVar;
        this.f46005c = context;
        this.f46006d = managedActivityResultLauncher;
        this.f46007e = mutableState;
    }
}
