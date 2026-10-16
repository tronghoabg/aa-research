package com.waze.stats.storage;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.sqlite.SQLiteConnection;
import com.waze.sharedui.web.WazeWebView;
import com.waze.stats.aa;
import com.waze.trip_overview.bw;
import com.waze.ui.af;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f40608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40609b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40610c;

    public /* synthetic */ d(long j2, State state, int i2) {
        this.f40610c = i2;
        this.f40608a = j2;
        this.f40609b = state;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f40610c;
        if (i2 == 0) {
            long j2 = this.f40608a;
            return g.n((aa) this.f40609b, j2, (SQLiteConnection) obj);
        }
        if (i2 == 1) {
            WazeWebView wazeWebView = (WazeWebView) obj;
            x.f(wazeWebView, "it");
            wazeWebView.H((String) this.f40609b);
            wazeWebView.setBackgroundColor(ColorKt.m8282toArgb8_81llA(this.f40608a));
            return ab.f48028a;
        }
        if (i2 == 2) {
            long j3 = this.f40608a;
            g.l((aa) this.f40609b, j3, (SQLiteConnection) obj);
            return null;
        }
        if (i2 != 3) {
            DrawScope drawScope = (DrawScope) obj;
            ?? r1 = this.f40609b;
            int i3 = af.f41795a;
            x.f(drawScope, "$this$Canvas");
            DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, this.f40608a, 0L, 0L, ((Number) r1.getValue()).floatValue(), null, null, 0, 118, null);
            return ab.f48028a;
        }
        bw bwVar = (bw) obj;
        x.f(bwVar, "it");
        bw bwVar2 = (bw) this.f40609b;
        return bw.y(bwVar, false, false, null, null, bwVar2.h(), this.f40608a, null, 0L, bwVar2.n(), null, false, null, null, null, null, false, 0L, null, 0L, null, null, false, 16776911);
    }

    public /* synthetic */ d(Object obj, long j2, int i2) {
        this.f40610c = i2;
        this.f40609b = obj;
        this.f40608a = j2;
    }
}
