package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import e.b.c;
import h.a.i;
import h.g.a.l;
import h.k;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final k<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, l<? super TypefaceRequest, ? extends Object> lVar) {
        Object objInvoke;
        Object objInvoke2;
        Object objA;
        Object objM10622unboximpl;
        int size = list.size();
        List listL = null;
        for (int i2 = 0; i2 < size; i2++) {
            Font font = list.get(i2);
            int iMo10603getLoadingStrategyPKNRLFQ = font.mo10603getLoadingStrategyPKNRLFQ();
            if (FontLoadingStrategy.m10648equalsimpl0(iMo10603getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m10653getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                    }
                    if (asyncTypefaceResult != null) {
                        objInvoke2 = asyncTypefaceResult.m10622unboximpl();
                    } else {
                        try {
                            objInvoke = platformFontLoader.loadBlocking(font);
                        } catch (Exception unused) {
                            objInvoke = lVar.invoke(typefaceRequest);
                        }
                        Object obj = objInvoke;
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj, false, 8, null);
                        objInvoke2 = obj;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = lVar.invoke(typefaceRequest);
                }
                return new k<>(listL, FontSynthesis_androidKt.m10683synthesizeTypefaceFxwP2eA(typefaceRequest.m10708getFontSynthesisGVVA2EU(), objInvoke2, font, typefaceRequest.getFontWeight(), typefaceRequest.m10707getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m10648equalsimpl0(iMo10603getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m10654getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        objM10622unboximpl = asyncTypefaceResult2.m10622unboximpl();
                    } else {
                        try {
                            objA = platformFontLoader.loadBlocking(font);
                        } catch (Throwable th) {
                            objA = c.a(th);
                        }
                        Object obj2 = true == (objA instanceof h.l) ? null : objA;
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj2, false, 8, null);
                        objM10622unboximpl = obj2;
                    }
                }
                if (objM10622unboximpl != null) {
                    return new k<>(listL, FontSynthesis_androidKt.m10683synthesizeTypefaceFxwP2eA(typefaceRequest.m10708getFontSynthesisGVVA2EU(), objM10622unboximpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m10707getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m10648equalsimpl0(iMo10603getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m10652getAsyncPKNRLFQ())) {
                    Objects.toString(font);
                    throw new IllegalStateException("Unknown font type ".concat(String.valueOf(font)));
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM10614get1ASDuI8 = asyncTypefaceCache.m10614get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM10614get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m10620isPermanentFailureimpl(asyncTypefaceResultM10614get1ASDuI8.m10622unboximpl()) && asyncTypefaceResultM10614get1ASDuI8.m10622unboximpl() != null) {
                        return new k<>(listL, FontSynthesis_androidKt.m10683synthesizeTypefaceFxwP2eA(typefaceRequest.m10708getFontSynthesisGVVA2EU(), asyncTypefaceResultM10614get1ASDuI8.m10622unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m10707getFontStyle_LCdwA()));
                    }
                } else if (listL == null) {
                    listL = i.l(font);
                } else {
                    listL.add(font);
                }
            }
        }
        return new k<>(listL, lVar.invoke(typefaceRequest));
    }
}
