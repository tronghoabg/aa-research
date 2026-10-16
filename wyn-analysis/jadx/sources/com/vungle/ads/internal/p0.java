package com.vungle.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f33473d = Pattern.quote("{{{req_width}}}");

    /* renamed from: e, reason: collision with root package name */
    public static final String f33474e = Pattern.quote("{{{req_height}}}");

    /* renamed from: f, reason: collision with root package name */
    public static final String f33475f = Pattern.quote("{{{width}}}");

    /* renamed from: g, reason: collision with root package name */
    public static final String f33476g = Pattern.quote("{{{height}}}");

    /* renamed from: h, reason: collision with root package name */
    public static final String f33477h = Pattern.quote("{{{down_x}}}");

    /* renamed from: i, reason: collision with root package name */
    public static final String f33478i = Pattern.quote("{{{down_y}}}");

    /* renamed from: j, reason: collision with root package name */
    public static final String f33479j = Pattern.quote("{{{up_x}}}");
    public static final String k = Pattern.quote("{{{up_y}}}");

    /* renamed from: a, reason: collision with root package name */
    public final Context f33480a;

    /* renamed from: b, reason: collision with root package name */
    public final com.vungle.ads.internal.model.h0 f33481b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f33482c;

    public p0(Context context, com.vungle.ads.internal.model.h0 advertisement) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(advertisement, "advertisement");
        this.f33480a = context;
        this.f33481b = advertisement;
        this.f33482c = new l0(new m0(Integer.MIN_VALUE, Integer.MIN_VALUE), new m0(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    public final void a(MotionEvent event) {
        AbstractC3340k.e(event, "event");
        if (this.f33481b.z()) {
            int action = event.getAction();
            if (action == 0) {
                this.f33482c.a(new m0((int) event.getX(), (int) event.getY()));
                return;
            }
            if (action != 1) {
                return;
            }
            this.f33482c.b(new m0((int) event.getX(), (int) event.getY()));
            if (this.f33482c.c()) {
                List<String> listA = com.vungle.ads.internal.model.h0.a(this.f33481b, "video.clickCoordinates", (String) null, 6);
                if (listA == null || listA.isEmpty()) {
                    new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.f33481b.q()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                int iD = this.f33481b.d();
                int iA = iD == 0 ? new n0(this.f33480a).f33370b.widthPixels : com.vungle.ads.internal.util.a0.a(this.f33480a, iD);
                int iA2 = this.f33481b.a();
                int iA3 = iA2 == 0 ? new n0(this.f33480a).f33370b.heightPixels : com.vungle.ads.internal.util.a0.a(this.f33480a, iA2);
                int iD2 = this.f33481b.d();
                int iA4 = iD2 == 0 ? new n0(this.f33480a).f33370b.widthPixels : com.vungle.ads.internal.util.a0.a(this.f33480a, iD2);
                int iA5 = this.f33481b.a();
                int iA6 = iA5 == 0 ? new n0(this.f33480a).f33370b.heightPixels : com.vungle.ads.internal.util.a0.a(this.f33480a, iA5);
                InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new o0(this.f33480a));
                for (String input : listA) {
                    String MACRO_REQ_WIDTH = f33473d;
                    AbstractC3340k.d(MACRO_REQ_WIDTH, "MACRO_REQ_WIDTH");
                    Pattern patternCompile = Pattern.compile(MACRO_REQ_WIDTH);
                    AbstractC3340k.d(patternCompile, "compile(...)");
                    String replacement = String.valueOf(iA);
                    AbstractC3340k.e(input, "input");
                    AbstractC3340k.e(replacement, "replacement");
                    String strReplaceAll = patternCompile.matcher(input).replaceAll(replacement);
                    AbstractC3340k.d(strReplaceAll, "replaceAll(...)");
                    String MACRO_REQ_HEIGHT = f33474e;
                    AbstractC3340k.d(MACRO_REQ_HEIGHT, "MACRO_REQ_HEIGHT");
                    Pattern patternCompile2 = Pattern.compile(MACRO_REQ_HEIGHT);
                    AbstractC3340k.d(patternCompile2, "compile(...)");
                    String replacement2 = String.valueOf(iA3);
                    AbstractC3340k.e(replacement2, "replacement");
                    String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(replacement2);
                    AbstractC3340k.d(strReplaceAll2, "replaceAll(...)");
                    String MACRO_WIDTH = f33475f;
                    AbstractC3340k.d(MACRO_WIDTH, "MACRO_WIDTH");
                    Pattern patternCompile3 = Pattern.compile(MACRO_WIDTH);
                    AbstractC3340k.d(patternCompile3, "compile(...)");
                    String replacement3 = String.valueOf(iA4);
                    AbstractC3340k.e(replacement3, "replacement");
                    String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll(replacement3);
                    AbstractC3340k.d(strReplaceAll3, "replaceAll(...)");
                    String MACRO_HEIGHT = f33476g;
                    AbstractC3340k.d(MACRO_HEIGHT, "MACRO_HEIGHT");
                    Pattern patternCompile4 = Pattern.compile(MACRO_HEIGHT);
                    AbstractC3340k.d(patternCompile4, "compile(...)");
                    String replacement4 = String.valueOf(iA6);
                    AbstractC3340k.e(replacement4, "replacement");
                    String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll(replacement4);
                    AbstractC3340k.d(strReplaceAll4, "replaceAll(...)");
                    String MACRO_DOWN_X = f33477h;
                    AbstractC3340k.d(MACRO_DOWN_X, "MACRO_DOWN_X");
                    Pattern patternCompile5 = Pattern.compile(MACRO_DOWN_X);
                    AbstractC3340k.d(patternCompile5, "compile(...)");
                    String replacement5 = String.valueOf(this.f33482c.a().a());
                    AbstractC3340k.e(replacement5, "replacement");
                    String strReplaceAll5 = patternCompile5.matcher(strReplaceAll4).replaceAll(replacement5);
                    AbstractC3340k.d(strReplaceAll5, "replaceAll(...)");
                    String MACRO_DOWN_Y = f33478i;
                    AbstractC3340k.d(MACRO_DOWN_Y, "MACRO_DOWN_Y");
                    Pattern patternCompile6 = Pattern.compile(MACRO_DOWN_Y);
                    AbstractC3340k.d(patternCompile6, "compile(...)");
                    String replacement6 = String.valueOf(this.f33482c.a().b());
                    AbstractC3340k.e(replacement6, "replacement");
                    String strReplaceAll6 = patternCompile6.matcher(strReplaceAll5).replaceAll(replacement6);
                    AbstractC3340k.d(strReplaceAll6, "replaceAll(...)");
                    String MACRO_UP_X = f33479j;
                    AbstractC3340k.d(MACRO_UP_X, "MACRO_UP_X");
                    Pattern patternCompile7 = Pattern.compile(MACRO_UP_X);
                    AbstractC3340k.d(patternCompile7, "compile(...)");
                    String replacement7 = String.valueOf(this.f33482c.b().a());
                    AbstractC3340k.e(replacement7, "replacement");
                    String strReplaceAll7 = patternCompile7.matcher(strReplaceAll6).replaceAll(replacement7);
                    AbstractC3340k.d(strReplaceAll7, "replaceAll(...)");
                    String MACRO_UP_Y = k;
                    AbstractC3340k.d(MACRO_UP_Y, "MACRO_UP_Y");
                    Pattern patternCompile8 = Pattern.compile(MACRO_UP_Y);
                    AbstractC3340k.d(patternCompile8, "compile(...)");
                    String replacement8 = String.valueOf(this.f33482c.b().b());
                    AbstractC3340k.e(replacement8, "replacement");
                    String strReplaceAll8 = patternCompile8.matcher(strReplaceAll7).replaceAll(replacement8);
                    AbstractC3340k.d(strReplaceAll8, "replaceAll(...)");
                    ((com.vungle.ads.internal.network.r) interfaceC2525iY.getValue()).a(new com.vungle.ads.internal.network.p(strReplaceAll8).b("coordinate").a(), false);
                }
            }
        }
    }
}
