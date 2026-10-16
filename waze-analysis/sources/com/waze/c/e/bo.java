package com.waze.c.e;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultLauncher;
import com.waze.navigate.AddressItem;
import com.waze.navigate.cs;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class bo implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18615b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18616c;

    public /* synthetic */ bo(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, int i2) {
        this.f18616c = i2;
        this.f18615b = context;
        this.f18614a = managedActivityResultLauncher;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.c.e.ca, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f18616c;
        if (i2 == 0) {
            this.f18614a.a((com.waze.c.d.l) this.f18615b, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            return ci.a((ci) this.f18614a, (com.waze.c.d.t) this.f18615b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
        }
        AddressItem addressItem = (AddressItem) obj;
        com.waze.ads.a.f fVar = (com.waze.ads.a.f) obj2;
        h.g.b.x.f(addressItem, "addressItem");
        h.g.b.x.f(fVar, "mapAdData");
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f18614a;
        cs csVar = new cs(addressItem);
        csVar.e(true);
        csVar.f(fVar);
        activityResultLauncher.launch(csVar.a((Context) this.f18615b));
        return h.ab.f48028a;
    }

    public /* synthetic */ bo(Object obj, Object obj2, int i2) {
        this.f18616c = i2;
        this.f18614a = obj;
        this.f18615b = obj2;
    }
}
