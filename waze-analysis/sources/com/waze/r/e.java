package com.waze.r;

import android.content.Context;
import android.support.v4.app.ar;
import com.waze.sharedui.web.af;
import com.waze.uid.d.q;
import com.waze.uid.d.r;
import com.waze.uid.d.s;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements af {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33501a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33502b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f33502b = i2;
        this.f33501a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [h.g.a.l, java.lang.Object] */
    @Override // com.waze.sharedui.web.af
    public final boolean a(String str) {
        int i2 = this.f33502b;
        if (i2 == 0) {
            h.j((h) this.f33501a);
            return false;
        }
        if (i2 == 1) {
            x.c(str);
            this.f33501a.invoke(str);
            return true;
        }
        x.c(str);
        Object obj = this.f33501a;
        try {
            s sVar = q.f44463a.a().f44466d;
            Context contextRequireContext = ((ar) obj).requireContext();
            x.e(contextRequireContext, "requireContext(...)");
            ((ar) obj).startActivity(sVar.a(contextRequireContext, new r("", false), str));
            return true;
        } catch (Exception unused) {
            com.waze.shared_infra.i.h.j("failed to parse url");
            return false;
        }
    }
}
