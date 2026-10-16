package com.waze.ads;

import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import com.waze.trip_overview.de;
import h.ab;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14034a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f14035b;

    public /* synthetic */ j(Object obj, int i2) {
        this.f14035b = i2;
        this.f14034a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.l, java.lang.Object] */
    @Override // com.waze.jni.a
    public final void a(Object obj) throws IOException {
        int i2 = this.f14035b;
        if (i2 == 0) {
            this.f14034a.invoke((ab) obj);
        } else if (i2 != 1) {
            de.q((de) this.f14034a, (StartNavigationResponse) obj);
        } else {
            g.fetchAdInfo$lambda$1(this.f14034a, (byte[]) obj);
        }
    }
}
