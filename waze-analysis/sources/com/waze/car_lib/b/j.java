package com.waze.car_lib.b;

import android.app.Activity;
import android.content.Context;
import android.net.UrlQuerySanitizer;
import com.waze.jt;
import com.waze.map.el;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f19100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19103d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f19104e;

    public /* synthetic */ j(com.waze.car_lib.screens.core.l lVar, com.waze.car_lib.r.d dVar, com.waze.av.b.n nVar, boolean z, int i2) {
        this.f19104e = i2;
        this.f19102c = lVar;
        this.f19101b = dVar;
        this.f19103d = nVar;
        this.f19100a = z;
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f19104e;
        if (i2 == 0) {
            Object obj = this.f19103d;
            return ap.q(this.f19100a, (ap) this.f19101b, (jt) this.f19102c, (String) obj);
        }
        int i3 = 4;
        if (i2 == 1) {
            ((com.waze.car_lib.screens.core.l) this.f19102c).a(new com.waze.car_lib.o.z((com.waze.car_lib.r.d) this.f19101b, (com.waze.av.b.n) this.f19103d, this.f19100a, i3));
            return h.ab.f48028a;
        }
        int i4 = 2;
        if (i2 == 2) {
            ((com.waze.car_lib.screens.core.l) this.f19102c).a(new com.waze.car_lib.o.z((com.waze.car_lib.r.d) this.f19101b, (com.waze.av.b.n) this.f19103d, this.f19100a, i4));
            return h.ab.f48028a;
        }
        int i5 = 3;
        if (i2 == 3) {
            ((com.waze.car_lib.screens.core.l) this.f19102c).a(new com.waze.car_lib.o.z((com.waze.car_lib.r.d) this.f19101b, (com.waze.av.b.n) this.f19103d, this.f19100a, i5));
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            return com.waze.google_assistant.n.a((com.waze.google_assistant.n) this.f19101b, (UrlQuerySanitizer) this.f19102c, (String) this.f19103d, this.f19100a);
        }
        if (i2 == 5) {
            if (this.f19100a) {
                Object obj2 = this.f19102c;
                Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null) {
                    com.waze.design_components.d.a(activity, (String) this.f19101b, null);
                }
            } else {
                this.f19103d.invoke();
            }
            return h.ab.f48028a;
        }
        boolean zD = el.d((com.waze.map.canvas.bj) this.f19103d);
        Object obj3 = this.f19102c;
        if (!zD) {
            ((com.waze.main_screen.p.bf) obj3).v().g();
        } else if (((com.waze.main_screen.p.bm) this.f19101b).e() != null) {
            ((com.waze.main_screen.p.bf) obj3).G();
        } else if (this.f19100a) {
            ((com.waze.main_screen.p.bf) obj3).u().s();
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ j(com.waze.google_assistant.n nVar, UrlQuerySanitizer urlQuerySanitizer, String str, boolean z, int i2) {
        this.f19104e = i2;
        this.f19101b = nVar;
        this.f19102c = urlQuerySanitizer;
        this.f19103d = str;
        this.f19100a = z;
    }

    public /* synthetic */ j(com.waze.map.canvas.bj bjVar, com.waze.main_screen.p.bf bfVar, com.waze.main_screen.p.bm bmVar, boolean z, int i2) {
        this.f19104e = i2;
        this.f19103d = bjVar;
        this.f19102c = bfVar;
        this.f19101b = bmVar;
        this.f19100a = z;
    }

    public /* synthetic */ j(boolean z, Context context, h.g.a.a aVar, String str, int i2) {
        this.f19104e = i2;
        this.f19100a = z;
        this.f19102c = context;
        this.f19103d = aVar;
        this.f19101b = str;
    }

    public /* synthetic */ j(boolean z, ap apVar, jt jtVar, String str, int i2) {
        this.f19104e = i2;
        this.f19100a = z;
        this.f19101b = apVar;
        this.f19102c = jtVar;
        this.f19103d = str;
    }
}
