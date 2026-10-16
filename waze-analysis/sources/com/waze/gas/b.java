package com.waze.gas;

import android.support.v4.app.ar;
import com.waze.uid.activities.UidFragmentActivity;
import com.waze.uid.c.bf;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24016d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f24017e;

    public /* synthetic */ b(c cVar, String str, String str2, boolean z, int i2) {
        this.f24017e = i2;
        this.f24015c = cVar;
        this.f24016d = str;
        this.f24013a = str2;
        this.f24014b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24017e == 0) {
            boolean z = this.f24014b;
            c.updatePricesDoneJNI$lambda$0((c) this.f24015c, (String) this.f24016d, this.f24013a, z);
            return;
        }
        int i2 = UidFragmentActivity.f44064g;
        boolean z2 = this.f24014b;
        ((bf) this.f24016d).b((ar) this.f24015c, this.f24013a, z2);
    }

    public /* synthetic */ b(bf bfVar, ar arVar, String str, boolean z, int i2) {
        this.f24017e = i2;
        this.f24016d = bfVar;
        this.f24015c = arVar;
        this.f24013a = str;
        this.f24014b = z;
    }
}
