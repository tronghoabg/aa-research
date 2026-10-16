package com.waze.main_screen.c;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.bw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26219a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f26220b;

    public /* synthetic */ f(long j2, int i2) {
        this.f26220b = i2;
        this.f26219a = j2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f26220b) {
            case 0:
                h.g.b.x.f((Density) obj, "$this$offset");
                return IntOffset.m11287boximpl(this.f26219a);
            case 1:
                h.g.b.x.f((Density) obj, "$this$offset");
                return IntOffset.m11287boximpl(this.f26219a);
            case 2:
                h.g.b.x.f((Density) obj, "$this$offset");
                return IntOffset.m11287boximpl(this.f26219a);
            case 3:
                h.g.b.x.f((Density) obj, "$this$offset");
                return IntOffset.m11287boximpl(this.f26219a);
            case 4:
                h.g.b.x.f((Density) obj, "$this$offset");
                return IntOffset.m11287boximpl(this.f26219a);
            case 5:
                h.g.b.x.f((Density) obj, "$this$offset");
                return IntOffset.m11287boximpl(this.f26219a);
            case 6:
                bw bwVar = (bw) obj;
                h.g.b.x.f(bwVar, "it");
                return bw.y(bwVar, false, false, null, null, null, this.f26219a, null, 0L, null, null, false, null, null, null, null, false, 0L, null, 0L, null, null, false, 16777183);
            case 7:
                DrawScope drawScope = (DrawScope) obj;
                h.g.b.x.f(drawScope, "$this$Canvas");
                DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, this.f26219a, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
                return h.ab.f48028a;
            case 8:
                DrawScope drawScope2 = (DrawScope) obj;
                h.g.b.x.f(drawScope2, "$this$drawBehind");
                long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() >> 32)));
                long jFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                float f2 = drawScope2.mo2127toPx0680j_4(2.0f);
                DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope2, this.f26219a, (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f2, 0, null, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL, null);
                return h.ab.f48028a;
            default:
                return Long.valueOf(this.f26219a);
        }
    }
}
