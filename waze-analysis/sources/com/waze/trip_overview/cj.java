package com.waze.trip_overview;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.KeyframesSpec;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cj implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f41292a;

    public /* synthetic */ cj(int i2) {
        this.f41292a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f41292a) {
            case 0:
                return de.d((bw) obj);
            case 1:
                return de.h((bw) obj);
            case 2:
                return de.e((bw) obj);
            case 3:
                return de.f((bw) obj);
            case 4:
                bw bwVar = (bw) obj;
                h.g.b.x.f(bwVar, "it");
                return bw.y(bwVar, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, null, false, bwVar.a() + 1, null, 0L, null, null, false, 16711679);
            case 5:
                return de.g((bw) obj);
            case 6:
                return bw.y((bw) obj, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, ae.f40993a, false, 0L, null, 0L, null, null, false, 16760831);
            case 7:
                return bw.y((bw) obj, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, null, false, 0L, null, 0L, null, null, false, 16760831);
            case 8:
                Context context = (Context) obj;
                h.g.b.x.f(context, "it");
                return Boolean.valueOf(com.waze.navigate.location_preview.ba.g(context));
            case 9:
                h.g.b.x.f((com.waze.modules.c.de) obj, "it");
                return h.ab.f48028a;
            case 10:
                h.g.b.x.f((AnimatedContentTransitionScope) obj, "$this$AnimatedContent");
                return AnimatedContentKt.togetherWith(com.waze.ui.q.g.a(), com.waze.ui.q.g.b());
            case 11:
                int i2 = com.waze.trip_overview.views.b.f41502a;
                h.g.b.x.f((com.waze.modules.c.de) obj, "it");
                return h.ab.f48028a;
            case 12:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i3 = com.waze.cb.m.f22100a;
                h.g.b.x.f(aVar, "$this$module");
                com.waze.bw.c.d.d dVar = new com.waze.bw.c.d.d(15);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i4 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.cb.j.class), null, dVar, cVar, listH));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                return h.ab.f48028a;
            case 13:
                int iIntValue = ((Integer) obj).intValue();
                int i5 = com.waze.ui.r.f43259a;
                return Integer.valueOf(-(iIntValue + iIntValue));
            case 14:
                int iIntValue2 = ((Integer) obj).intValue();
                int i6 = com.waze.ui.r.f43259a;
                return Integer.valueOf(-(iIntValue2 + iIntValue2));
            case 15:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                h.g.b.x.f(keyframesSpecConfig, "$this$keyframes");
                keyframesSpecConfig.setDurationMillis(600);
                keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(360.0f), 600);
                return h.ab.f48028a;
            case 16:
                ((Boolean) obj).booleanValue();
                return h.ab.f48028a;
            case 17:
                List list = (List) obj;
                int i7 = com.waze.ui.b.n.f42077a;
                h.g.b.x.f(list, "list");
                h.d.a aVarA = com.waze.ui.b.o.a();
                Object obj2 = list.get(0);
                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                com.waze.ui.b.o oVar = (com.waze.ui.b.o) aVarA.get(num != null ? num.intValue() : com.waze.ui.b.o.f42079a.ordinal());
                Object obj3 = list.get(1);
                Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                Object obj4 = list.get(2);
                Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                return new com.waze.ui.b.p(oVar, zBooleanValue, bool2 != null ? bool2.booleanValue() : true, new com.waze.ui.a.b(2));
            case 18:
                int iIntValue3 = ((Integer) obj).intValue();
                int i8 = com.waze.ui.b.n.f42077a;
                return Integer.valueOf(-iIntValue3);
            case 19:
                Integer num2 = (Integer) obj;
                num2.intValue();
                int i9 = com.waze.ui.b.n.f42077a;
                return num2;
            default:
                Integer num3 = (Integer) obj;
                num3.intValue();
                int i10 = com.waze.ui.b.n.f42077a;
                return num3;
        }
    }
}
