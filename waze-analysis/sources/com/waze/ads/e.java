package com.waze.ads;

import com.waze.jni.protos.Advertisement;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f14022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14023b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14024c;

    public /* synthetic */ e(g gVar, Object obj, int i2) {
        this.f14024c = i2;
        this.f14022a = gVar;
        this.f14023b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f14024c;
        Object obj = this.f14023b;
        if (i2 != 0) {
            g.showAdInfoJNI$lambda$0(this.f14022a, (String) obj);
        } else {
            g.showAdvertisementTakeoverJNI$lambda$0(this.f14022a, (Advertisement) obj);
        }
    }
}
