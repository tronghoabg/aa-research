package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class FontsContractCompat {

    @Deprecated
    public static final String PARCEL_FONT_RESULTS = "font_results";

    @Deprecated
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;

    @Deprecated
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;

    /* compiled from: WazeSource */
    public final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    /* compiled from: WazeSource */
    public class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @Deprecated
        public static final int RESULT_OK = 0;
        static final int RESULT_SUCCESS = 0;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i2) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TypefaceStyle {
    }

    private FontsContractCompat() {
    }

    public static Typeface buildTypeface(Context context, CancellationSignal cancellationSignal, FontInfo[] fontInfoArr) {
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    public static FontFamilyResult fetchFonts(Context context, CancellationSignal cancellationSignal, FontRequest fontRequest) {
        return FontProvider.getFontFamilyResult(context, FontsContractCompat$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), cancellationSignal);
    }

    @Deprecated
    public static Typeface getFontSync(Context context, FontRequest fontRequest, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z, int i2, int i3) {
        TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = new TypefaceCompat.ResourcesCallbackAdapter(fontCallback);
        return requestFont(context, (List<FontRequest>) FontsContractCompat$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), i3, z, i2, ResourcesCompat.FontCallback.getHandler(handler), resourcesCallbackAdapter);
    }

    @Deprecated
    public static ProviderInfo getProvider(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        return FontProvider.getProvider(packageManager, fontRequest, resources);
    }

    @Deprecated
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        return TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
    }

    public static Typeface requestFont(Context context, List<FontRequest> list, int i2, boolean z, int i3, Handler handler, FontRequestCallback fontRequestCallback) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback, RequestExecutor.createHandlerExecutor(handler));
        if (!z) {
            return FontRequestWorker.requestFontAsync(context, list, i2, null, callbackWrapper);
        }
        if (list.size() <= 1) {
            return FontRequestWorker.requestFontSync(context, list.get(0), callbackWrapper, i2, i3);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static void requestFontWithFallbackChain(Context context, List<FontRequest> list, int i2, Executor executor, Executor executor2, FontRequestCallback fontRequestCallback) {
        FontRequestWorker.requestFontAsync(context.getApplicationContext(), list, i2, executor, new CallbackWrapper(fontRequestCallback, executor2));
    }

    @Deprecated
    public static void resetCache() {
        FontRequestWorker.resetTypefaceCache();
    }

    public static void resetTypefaceCache() {
        FontRequestWorker.resetTypefaceCache();
    }

    /* compiled from: WazeSource */
    public class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final List<FontInfo[]> mFonts;
        private final int mStatusCode;

        @Deprecated
        public FontFamilyResult(int i2, FontInfo[] fontInfoArr) {
            this.mStatusCode = i2;
            this.mFonts = Collections.singletonList(fontInfoArr);
        }

        static FontFamilyResult create(int i2, List<FontInfo[]> list) {
            return new FontFamilyResult(i2, list);
        }

        public FontInfo[] getFonts() {
            return this.mFonts.get(0);
        }

        public List<FontInfo[]> getFontsWithFallbacks() {
            return this.mFonts;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        boolean hasFallback() {
            return this.mFonts.size() > 1;
        }

        static FontFamilyResult create(int i2, FontInfo[] fontInfoArr) {
            return new FontFamilyResult(i2, fontInfoArr);
        }

        FontFamilyResult(int i2, List<FontInfo[]> list) {
            this.mStatusCode = i2;
            this.mFonts = list;
        }
    }

    /* compiled from: WazeSource */
    public class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final String mVariationSettings;
        private final int mWeight;

        public FontInfo(String str, String str2) {
            this.mUri = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.mTtcIndex = 0;
            this.mWeight = DisplayStrings.DS_NIGHT;
            this.mItalic = false;
            this.mVariationSettings = str2;
            this.mResultCode = 0;
        }

        static FontInfo create(Uri uri, int i2, int i3, boolean z, int i4) {
            return new FontInfo(uri, i2, i3, z, i4);
        }

        public int getResultCode() {
            return this.mResultCode;
        }

        public String getSystemFont() {
            if (isSystemFont()) {
                return this.mUri.getAuthority();
            }
            return null;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public Uri getUri() {
            return this.mUri;
        }

        public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public boolean isSystemFont() {
            return Objects.equals(this.mUri.getScheme(), "systemfont");
        }

        public FontInfo(Uri uri, int i2, int i3, boolean z, String str, int i4) {
            Preconditions.checkNotNull(uri);
            this.mUri = uri;
            this.mTtcIndex = i2;
            this.mWeight = i3;
            this.mItalic = z;
            this.mVariationSettings = str;
            this.mResultCode = i4;
        }

        @Deprecated
        public FontInfo(Uri uri, int i2, int i3, boolean z, int i4) {
            this(uri, i2, i3, z, null, i4);
        }
    }

    public static Typeface requestFont(Context context, FontRequest fontRequest, int i2, boolean z, int i3, Handler handler, FontRequestCallback fontRequestCallback) {
        return requestFont(context, (List<FontRequest>) FontsContractCompat$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), i2, z, i3, handler, fontRequestCallback);
    }

    @Deprecated
    public static void requestFont(Context context, FontRequest fontRequest, FontRequestCallback fontRequestCallback, Handler handler) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback);
        FontRequestWorker.requestFontAsync(context.getApplicationContext(), FontsContractCompat$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), 0, RequestExecutor.createHandlerExecutor(handler), callbackWrapper);
    }

    public static void requestFont(Context context, FontRequest fontRequest, int i2, Executor executor, Executor executor2, FontRequestCallback fontRequestCallback) {
        FontRequestWorker.requestFontAsync(context.getApplicationContext(), FontsContractCompat$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), i2, executor, new CallbackWrapper(fontRequestCallback, executor2));
    }
}
