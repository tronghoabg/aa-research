package com.waze.speech;

import androidx.compose.ui.focus.FocusRequester;
import com.waze.ui.af.ap;
import com.waze.uid.VehicleType;
import com.waze.uid.c.ad;
import com.waze.uid.c.ai;
import com.waze.uid.c.bo;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class l implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40457a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40458b;

    public /* synthetic */ l(Object obj, int i2) {
        this.f40458b = i2;
        this.f40457a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f40458b) {
            case 0:
                return m.d((m) this.f40457a);
            case 1:
                return m.c((m) this.f40457a);
            case 2:
                int i2 = ap.f41852a;
                this.f40457a.invoke(com.waze.ui.af.e.f41885a);
                return ab.f48028a;
            case 3:
                int i3 = ap.f41852a;
                this.f40457a.invoke(com.waze.ui.af.f.f41886a);
                return ab.f48028a;
            case 4:
                ((com.waze.uid.state_impl.c.a) this.f40457a).a(false);
                return ab.f48028a;
            case 5:
                return a.a.k(this.f40457a);
            case 6:
                FocusRequester.m7885requestFocus3ESFkO8$default((FocusRequester) this.f40457a, 0, 1, null);
                return ab.f48028a;
            case 7:
                this.f40457a.invoke(com.waze.uid.c.d.f44350d);
                return ab.f48028a;
            case 8:
                this.f40457a.invoke(com.waze.uid.c.d.f44347a);
                return ab.f48028a;
            case 9:
                this.f40457a.invoke(com.waze.uid.c.d.f44348b);
                return ab.f48028a;
            case 10:
                this.f40457a.invoke(com.waze.uid.c.d.f44349c);
                return ab.f48028a;
            case 11:
                this.f40457a.invoke(VehicleType.Private);
                return ab.f48028a;
            case 12:
                this.f40457a.invoke(VehicleType.Motorcycle);
                return ab.f48028a;
            case 13:
                this.f40457a.invoke(VehicleType.Taxi);
                return ab.f48028a;
            case 14:
                return ad.a((ad) this.f40457a);
            case 15:
                return ad.b((ad) this.f40457a);
            case 16:
                return ad.c((ad) this.f40457a);
            case 17:
                return a.a.k(this.f40457a);
            case 18:
                return ai.a((ai) this.f40457a);
            case 19:
                return a.a.k(this.f40457a);
            default:
                return bo.k((bo) this.f40457a);
        }
    }
}
