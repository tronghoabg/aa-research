package com.waze.parking;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.waze.strings.DisplayStrings;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f32962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f32963b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32964c;

    public /* synthetic */ i(long j2, long j3, int i2) {
        this.f32964c = i2;
        this.f32962a = j2;
        this.f32963b = j3;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f32964c == 0) {
            long j2 = this.f32963b;
            return q.a(this.f32962a, j2, (DrawScope) obj);
        }
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
        h.g.b.x.f(keyframesSpecConfig, "$this$keyframes");
        keyframesSpecConfig.setDurationMillis(1200);
        long j3 = this.f32962a;
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Color.m8218boximpl(j3), 0), EasingKt.getFastOutSlowInEasing());
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Color.m8218boximpl(this.f32963b), DisplayStrings.DS_NIGHT), EasingKt.getFastOutSlowInEasing());
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Color.m8218boximpl(j3), keyframesSpecConfig.getDurationMillis());
        return ab.f48028a;
    }
}
