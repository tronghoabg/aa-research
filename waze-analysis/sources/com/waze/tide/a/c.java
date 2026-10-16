package com.waze.tide.a;

import android.view.MotionEvent;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import androidx.media3.muxer.MuxerUtil;
import com.waze.modules.c.de;
import com.waze.trip_overview.bw;
import com.waze.trip_overview.c.a.ab;
import com.waze.trip_overview.ds;
import com.waze.trip_overview.et;
import com.waze.trip_overview.fd;
import com.waze.trip_overview.views.trip_details_container.q;
import com.waze.ui.af;
import com.waze.ui.b.n;
import com.waze.ui.b.o;
import com.waze.ui.b.p;
import com.waze.ui.d.h;
import com.waze.ui.r;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40915a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40916b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f40916b = i2;
        this.f40915a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 1;
        switch (this.f40916b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                bw bwVar = (bw) obj;
                x.f(bwVar, "it");
                break;
            case 3:
                bw bwVar2 = (bw) obj;
                x.f(bwVar2, "it");
                break;
            case 4:
                bw bwVar3 = (bw) obj;
                x.f(bwVar3, "it");
                break;
            case 5:
                x.f((com.waze.design_components.c.b) obj, "it");
                ((ab) this.f40915a).h().l(ds.f41417a);
                break;
            case 6:
                x.f((com.waze.design_components.c.b) obj, "it");
                ((ab) this.f40915a).h().l(et.f41444a);
                break;
            case 7:
                break;
            case 8:
                de deVar = (de) obj;
                x.f(deVar, "vehicleType");
                ((ab) this.f40915a).h().l(new fd(deVar));
                break;
            case 9:
                this.f40915a.setValue(IntSize.m11331boximpl(((IntSize) obj).m11343unboximpl()));
                break;
            case 10:
                com.waze.trip_overview.views.trip_details_container.d dVar = (com.waze.trip_overview.views.trip_details_container.d) obj;
                x.f(dVar, "it");
                com.waze.trip_overview.c.a.d dVarS = ((q) this.f40915a).s();
                if (dVarS != null) {
                    dVarS.a(dVar);
                }
                break;
            case 11:
                break;
            case 12:
                com.waze.trip_overview.views.trip_details_container.d dVar2 = (com.waze.trip_overview.views.trip_details_container.d) obj;
                x.f(dVar2, "it");
                com.waze.trip_overview.c.a.d dVarS2 = ((q) this.f40915a).s();
                if (dVarS2 != null) {
                    dVarS2.a(dVar2);
                }
                break;
            case 13:
                MotionEvent motionEvent = (MotionEvent) obj;
                int i3 = r.f43259a;
                x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                x.e(motionEventObtain, "obtain(...)");
                this.f40915a.invoke(motionEventObtain);
                break;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                int i4 = af.f41795a;
                x.f(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new com.waze.settings.g.a.b(this.f40915a, 14), 1, null);
                break;
            case 15:
                this.f40915a.invoke();
                break;
            case 16:
                this.f40915a.invoke((IntSize) obj);
                break;
            case 17:
                break;
            case 18:
                int i5 = n.f42077a;
                x.f((AnimatedContentTransitionScope) obj, "$this$AnimatedContent");
                if (((p) this.f40915a).a() != o.f42079a) {
                    com.waze.z.a.x xVar = com.waze.z.a.x.f46210a;
                    break;
                } else {
                    com.waze.z.a.x xVar2 = com.waze.z.a.x.f46210a;
                    break;
                }
            case 19:
                com.waze.ui.d.b bVar = (com.waze.ui.d.b) obj;
                x.f(bVar, "clickedItem");
                this.f40915a.invoke(new h(com.waze.ui.d.b.d(bVar)));
                break;
            default:
                this.f40915a.setIntValue((int) (((IntSize) obj).m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                break;
        }
        return h.ab.f48028a;
    }
}
