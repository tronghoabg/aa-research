package com.google.firebase.crashlytics.a.g;

import android.util.Log;
import com.google.android.datatransport.f;
import com.google.firebase.crashlytics.a.e.cu;
import com.google.firebase.messaging.a.g;
import com.google.firebase.perf.f.ad;
import com.google.firebase.sessions.ai;
import com.google.firebase.sessions.aj;
import h.g.b.x;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f9715a;

    public /* synthetic */ a(int i2) {
        this.f9715a = i2;
    }

    @Override // com.google.android.datatransport.f
    public final Object a(Object obj) {
        int i2 = this.f9715a;
        if (i2 == 0) {
            return b.f9716a.g((cu) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (i2 == 1) {
            return com.google.e.b((g) obj);
        }
        if (i2 == 2) {
            return ((ad) obj).toByteArray();
        }
        aj ajVar = aj.f10806a;
        String strA = aj.c().a((ai) obj);
        x.e(strA, "encode(...)");
        Log.d("EventGDTLogger", "Session Event: ".concat(String.valueOf(strA)));
        byte[] bytes = strA.getBytes(h.n.a.f48221b);
        x.e(bytes, "getBytes(...)");
        return bytes;
    }
}
