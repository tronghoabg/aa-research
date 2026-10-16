package com.waze.ui.b;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.ui.layout.Placeable;
import com.waze.ui.m.cb;
import com.waze.ui.m.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class r implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f42089a;

    public /* synthetic */ r(int i2) {
        this.f42089a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f42089a) {
            case 0:
                ((Integer) obj).intValue();
                int i2 = z.f42115a;
                return h.ab.f48028a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                int i3 = n.f42077a;
                return Integer.valueOf(-iIntValue);
            case 2:
                as asVar = (as) obj;
                int i4 = z.f42115a;
                if (asVar != null) {
                    return Integer.valueOf(asVar.a());
                }
                return null;
            case 3:
                int i5 = com.waze.ui.d.a.f42131a;
                h.g.b.x.f((com.waze.ui.d.k) obj, "it");
                return h.ab.f48028a;
            case 4:
                int i6 = com.waze.ui.d.a.f42131a;
                h.g.b.x.f((com.waze.ui.d.k) obj, "it");
                return h.ab.f48028a;
            case 5:
                h.g.b.x.f((AnimatedContentTransitionScope) obj, "$this$AnimatedContent");
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            case 6:
                int i7 = com.waze.ui.l.l.f42701a;
                h.g.b.x.f((Placeable.PlacementScope) obj, "$this$layout");
                return h.ab.f48028a;
            case 7:
                Integer num = (Integer) obj;
                num.intValue();
                int i8 = com.waze.ui.l.l.f42701a;
                return num;
            case 8:
                Integer num2 = (Integer) obj;
                num2.intValue();
                int i9 = com.waze.ui.l.l.f42701a;
                return num2;
            case 9:
                int i10 = com.waze.ui.m.m.f43018a;
                return a.a.s((String) obj);
            case 10:
                int i11 = com.waze.ui.m.n.f43020a;
                return h.ab.f48028a;
            case 11:
                int i12 = com.waze.ui.m.n.f43020a;
                h.g.b.x.f((cb) obj, "it");
                return h.ab.f48028a;
            case 12:
                int i13 = com.waze.ui.m.n.f43020a;
                return h.ab.f48028a;
            case 13:
                int i14 = com.waze.ui.m.n.f43020a;
                h.g.b.x.f((cb) obj, "it");
                return h.ab.f48028a;
            case 14:
                int i15 = com.waze.ui.m.n.f43020a;
                return h.ab.f48028a;
            case 15:
                int i16 = com.waze.ui.m.n.f43020a;
                h.g.b.x.f((cb) obj, "it");
                return h.ab.f48028a;
            case 16:
                return h.ab.f48028a;
            case 17:
                Integer num3 = (Integer) obj;
                num3.intValue();
                return num3;
            case 18:
                Integer num4 = (Integer) obj;
                num4.intValue();
                return num4;
            case 19:
                int i17 = dj.f42972a;
                h.g.b.x.f((cb) obj, "it");
                return h.ab.f48028a;
            default:
                Integer num5 = (Integer) obj;
                num5.intValue();
                return num5;
        }
    }
}
