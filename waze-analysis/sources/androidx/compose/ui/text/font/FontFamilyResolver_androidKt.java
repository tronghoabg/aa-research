package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import h.c.j;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context, j jVar) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), jVar), null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(Context context) {
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter = null;
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), 0 == true ? 1 : 0, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0), platformFontFamilyTypefaceAdapter, 18, null);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<android.graphics.Typeface> m10635resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
        State stateMo10633resolveDPcqOEQ = resolver.mo10633resolveDPcqOEQ(fontFamily, fontWeight, i2, i3);
        x.d(stateMo10633resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return stateMo10633resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m10636resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontSynthesis.Companion.m10678getAllGVVA2EU();
        }
        if (1 == (i4 & 1)) {
            fontFamily = null;
        }
        return m10635resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i2, i3);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }
}
