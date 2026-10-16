package com.waze.view.anim;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import com.waze.AlerterController$Alerter$Type;
import com.waze.navigate.TrafficSeverity;
import com.waze.navigate.gg;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import l.a.bjo;
import l.a.bjp;
import l.a.bjq;
import l.a.bjr;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    public static void a(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(80L);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 1.4f, 1.0f, 1.4f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(80L);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation2.setInterpolator(new AccelerateInterpolator(1.0f));
        c(view, scaleAnimation, scaleAnimation2);
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.4f, 1.0f, 1.4f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setDuration(320L);
        scaleAnimation3.setInterpolator(new DecelerateInterpolator());
        c(view, scaleAnimation2, scaleAnimation3);
        view.startAnimation(scaleAnimation);
    }

    public static final /* synthetic */ List b(List list) {
        bjp bjpVar;
        List<gg> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        for (gg ggVar : list2) {
            bjo bjoVarNewBuilder = bjr.newBuilder();
            x.f(bjoVarNewBuilder, "builder");
            AlerterController$Alerter$Type alerterController$Alerter$TypeB = ggVar.b();
            AlerterController$Alerter$Type alerterController$Alerter$Type = AlerterController$Alerter$Type.UNSPECIFIED;
            TrafficSeverity trafficSeverity = TrafficSeverity.Light;
            int iOrdinal = alerterController$Alerter$TypeB.ordinal();
            bjq bjqVar = iOrdinal != 1 ? iOrdinal != 3 ? iOrdinal != 6 ? iOrdinal != 13 ? bjq.TRAFFIC_TYPE_UNSPECIFIED : bjq.CLOSURE : bjq.HAZARD : bjq.ACCIDENT : bjq.CHITCHAT;
            x.f(bjqVar, "value");
            bjoVarNewBuilder.b(bjqVar);
            int iOrdinal2 = ggVar.c().ordinal();
            if (iOrdinal2 == 0) {
                bjpVar = bjp.LIGHT;
            } else if (iOrdinal2 == 1) {
                bjpVar = bjp.MODERATE;
            } else if (iOrdinal2 == 2) {
                bjpVar = bjp.HEAVY;
            } else if (iOrdinal2 == 3) {
                bjpVar = bjp.STANDSTILL;
            } else {
                if (iOrdinal2 != 4) {
                    throw new h.i();
                }
                bjpVar = bjp.CLOSED_ROAD;
            }
            x.f(bjpVar, "value");
            bjoVarNewBuilder.a(bjpVar);
            bjr bjrVarBuild = bjoVarNewBuilder.build();
            x.e(bjrVarBuild, "build(...)");
            arrayList.add(bjrVarBuild);
        }
        return arrayList;
    }

    private static void c(View view, Animation animation, Animation animation2) {
        animation.setAnimationListener(new a(view, animation2));
    }
}
