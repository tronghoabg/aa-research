package org.apache.tika.language.detect;

import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* loaded from: classes5.dex */
public class LanguageResult {
    public static final LanguageResult NULL = new LanguageResult("", LanguageConfidence.NONE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    private final LanguageConfidence confidence;
    private final String language;
    private final float rawScore;

    public LanguageResult(String str, LanguageConfidence languageConfidence, float f10) {
        this.language = str;
        this.confidence = languageConfidence;
        this.rawScore = f10;
    }

    public LanguageConfidence getConfidence() {
        return this.confidence;
    }

    public String getLanguage() {
        return this.language;
    }

    public float getRawScore() {
        return this.rawScore;
    }

    public boolean isLanguage(String str) {
        String[] strArrSplit = str.split("\\-");
        String[] strArrSplit2 = this.language.split("\\-");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i5 = 0; i5 < iMin; i5++) {
            if (!strArrSplit[i5].equalsIgnoreCase(strArrSplit2[i5])) {
                return false;
            }
        }
        return true;
    }

    public boolean isReasonablyCertain() {
        return this.confidence == LanguageConfidence.HIGH;
    }

    public boolean isUnknown() {
        return this.confidence == LanguageConfidence.NONE;
    }

    public String toString() {
        return String.format(Locale.US, "%s: %s (%f)", this.language, this.confidence, Float.valueOf(this.rawScore));
    }
}
