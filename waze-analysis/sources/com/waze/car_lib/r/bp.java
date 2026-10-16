package com.waze.car_lib.r;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.waze.R;
import com.waze.navbar.InstructionView;
import com.waze.ui.navbar.LaneGuidanceView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.cr f21079a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.bw f21080b;

    public bp(com.waze.navigate.cr crVar, com.waze.navigate.bw bwVar, bq bqVar) {
        h.g.b.x.f(crVar, "instructionState");
        h.g.b.x.f(bwVar, "drivingSideState");
        h.g.b.x.f(bqVar, "configs");
        this.f21079a = crVar;
        this.f21080b = bwVar;
    }

    private static final SpannableStringBuilder d(Context context, com.waze.navigate.es esVar, boolean z) {
        int i2 = com.waze.navbar.q.f30914a;
        SpannableStringBuilder spannableStringBuilderA = com.waze.navbar.q.a(esVar != null ? esVar.b() : null, z, -1, -1, Integer.valueOf(context.getResources().getDisplayMetrics().densityDpi), new com.waze.alerters.h(20), 32);
        if (h.n.o.G(spannableStringBuilderA)) {
            return null;
        }
        return spannableStringBuilderA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.waze.car_lib.r.ce e(com.waze.navigate.cp r22, android.content.Context r23, com.waze.ui.navbar.LaneGuidanceView r24, com.waze.navigate.bv r25, com.waze.navbar.InstructionView r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.bp.e(com.waze.navigate.cp, android.content.Context, com.waze.ui.navbar.LaneGuidanceView, com.waze.navigate.bv, com.waze.navbar.InstructionView, boolean):com.waze.car_lib.r.ce");
    }

    public final kotlinx.coroutines.b.k a(Context context, boolean z) throws Resources.NotFoundException {
        LaneGuidanceView laneGuidanceView;
        h.g.b.x.f(context, "context");
        if (z) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lane_guidance_view_aaos_height);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.lane_guidance_view_aaos_width);
            LaneGuidanceView laneGuidanceView2 = new LaneGuidanceView(context);
            laneGuidanceView2.d(dimensionPixelSize);
            com.waze.ad.a.j.d(laneGuidanceView2, dimensionPixelSize2, dimensionPixelSize, 1073741824);
            laneGuidanceView2.f();
            laneGuidanceView = laneGuidanceView2;
        } else {
            laneGuidanceView = null;
        }
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.instruction_view_aaos_height);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.instruction_view_aaos_width);
        InstructionView instructionView = new InstructionView(context, null, 2, null);
        com.waze.ad.a.j.d(instructionView, dimensionPixelSize4, dimensionPixelSize3, 1073741824);
        return kotlinx.coroutines.b.ai.q(this.f21079a.R(), this.f21080b.K(), new bo(this, context, laneGuidanceView, instructionView, null));
    }
}
