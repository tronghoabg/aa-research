package com.waze.cf.c;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.jz;
import com.waze.kc;
import com.waze.z.a.g.u;
import h.g.b.am;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements com.waze.app_nav.hub.b.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22203d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f22204e;

    public /* synthetic */ f(l lVar, am amVar, h.g.a.a aVar, h.g.a.a aVar2, int i2) {
        this.f22204e = i2;
        this.f22203d = lVar;
        this.f22201b = amVar;
        this.f22202c = aVar;
        this.f22200a = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.a, java.lang.Object] */
    @Override // com.waze.app_nav.hub.b.j
    public final com.waze.app_nav.hub.b.i create(Context context) {
        int i2 = this.f22204e;
        if (i2 == 0) {
            Object obj = this.f22203d;
            Object obj2 = this.f22202c;
            return l.b((String) this.f22200a, (String) this.f22201b, (l) obj2, (jz) obj, context);
        }
        if (i2 != 1) {
            ?? r0 = this.f22200a;
            return l.d((l) this.f22203d, (am) this.f22201b, this.f22202c, r0, context);
        }
        x.f(context, "it");
        Object obj3 = this.f22203d;
        Object obj4 = this.f22201b;
        return new com.waze.app_nav.hub.b.e((h.g.a.a) null, (com.waze.app_nav.hub.b.f) obj3, ComposableLambdaKt.composableLambdaInstance(-1748872756, true, new u(this.f22202c, this.f22200a, obj4, 2, (byte[]) null)), 5);
    }

    public /* synthetic */ f(kc kcVar, com.waze.ui.t.b bVar, h.g.a.l lVar, h.g.a.l lVar2, int i2) {
        this.f22204e = i2;
        this.f22203d = kcVar;
        this.f22202c = bVar;
        this.f22200a = lVar;
        this.f22201b = lVar2;
    }

    public /* synthetic */ f(String str, String str2, l lVar, jz jzVar, int i2) {
        this.f22204e = i2;
        this.f22200a = str;
        this.f22201b = str2;
        this.f22202c = lVar;
        this.f22203d = jzVar;
    }
}
