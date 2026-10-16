package com.waze.bl.d.a;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import com.waze.search.ai;
import com.waze.search.e.p;
import com.waze.ui.b.as;
import com.waze.ui.b.z;
import com.waze.z.a.ad;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17068c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f17069d;

    public /* synthetic */ h(int i2, com.waze.bl.c.b.a aVar, b bVar, int i3) {
        this.f17069d = i3;
        this.f17066a = i2;
        this.f17067b = aVar;
        this.f17068c = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.hapticfeedback.HapticFeedback, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f17069d;
        if (i2 == 0) {
            Context context = (Context) obj;
            x.f(context, "context");
            float fA = ((com.waze.bl.c.b.a) this.f17067b).a();
            x.f(context, "context");
            Object obj2 = this.f17068c;
            x.f(obj2, "pillPosition");
            return new c(context, this.f17066a + 1, fA, (b) obj2);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ?? r0 = this.f17067b;
                Object obj3 = this.f17068c;
                return ai.c(this.f17066a, (p) obj3, r0, (ad) obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            int i3 = this.f17066a;
            int i4 = z.f42115a;
            this.f17067b.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
            ((as) this.f17068c).d().invoke(bool, Integer.valueOf(i3));
            return ab.f48028a;
        }
        x.f((com.waze.search.e.z) obj, "it");
        Object obj4 = this.f17067b;
        x.f(obj4, "autoCompletePlace");
        Object obj5 = this.f17068c;
        x.f(obj5, "searchTerm");
        if (!(obj4 instanceof com.waze.w.f) && !(obj4 instanceof com.waze.w.e)) {
            if (!(obj4 instanceof com.waze.w.h)) {
                throw new h.i();
            }
            if (((com.waze.w.h) obj4).j()) {
                com.waze.w.i iVar = (com.waze.w.i) obj4;
                com.waze.ads.c.e.h(this.f17066a, (String) obj5, iVar.b().c().c(), iVar.b().c().b());
            }
        }
        return ab.f48028a;
    }

    public /* synthetic */ h(int i2, p pVar, State state, int i3) {
        this.f17069d = i3;
        this.f17066a = i2;
        this.f17068c = pVar;
        this.f17067b = state;
    }

    public /* synthetic */ h(Object obj, Object obj2, int i2, int i3) {
        this.f17069d = i3;
        this.f17067b = obj;
        this.f17068c = obj2;
        this.f17066a = i2;
    }
}
