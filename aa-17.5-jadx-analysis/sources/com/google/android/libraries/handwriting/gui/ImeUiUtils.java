package com.google.android.libraries.handwriting.gui;

import android.util.Log;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.Character;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public class ImeUiUtils {
    public static final int IME_ACTION_EMOJI_MODE = -10;
    public static final int IME_ACTION_LEAVE_EMOJI_MODE = -11;
    private static final String PHONE_NUMBER_CHAR = "+()/*#,.-N ;";
    private static final String TAG = "HWRImeUiUtils";
    private static final int[] EDITOR_ACTIONS = {6, 2, 5, 1, 3, 0, 4};
    public static final Character.UnicodeBlock[] NON_SPACING_LANGUAGES = {Character.UnicodeBlock.CJK_COMPATIBILITY, Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT, Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT, Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B, Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS, Character.UnicodeBlock.HIRAGANA, Character.UnicodeBlock.KATAKANA, Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, Character.UnicodeBlock.KHMER, Character.UnicodeBlock.KHMER_SYMBOLS, Character.UnicodeBlock.LAO, Character.UnicodeBlock.THAI};

    public static boolean disableNewWordJustInCase(String str) {
        return str.startsWith("th") || str.startsWith("km") || str.startsWith("lo") || str.startsWith("universal");
    }

    public static String filterForNumber(String str, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        boolean z4 = false;
        boolean z5 = true;
        while (i < length) {
            char c = charArray[i];
            if (z5 && z && c == '-') {
                sb.append('-');
            } else if (z3 && PHONE_NUMBER_CHAR.indexOf(c) != -1) {
                sb.append(c);
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            } else if (z2 && ((c == '.' || c == ',') && !z4)) {
                sb.append(c);
                z4 = true;
            }
            i++;
            z5 = false;
        }
        String string = sb.toString();
        return string.endsWith(" ") ? string.substring(0, string.length() - 1) : string;
    }

    public static RecognitionResult filterResultForInputType(RecognitionResult recognitionResult, String str) throws NumberFormatException {
        if (recognitionResult != RecognitionResult.EMPTY) {
            try {
                int i = Integer.parseInt(str);
                if ((i & 2) != 0) {
                    processResultForTypeNumberFields(recognitionResult, i & 15, i & 16773120);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return recognitionResult;
    }

    public static int getEditorAction(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return 0;
        }
        int i = editorInfo.imeOptions;
        if ((editorInfo.inputType & 15) == 1 && (editorInfo.inputType & 4080) == 64) {
            return -10;
        }
        if ((i & 1073741824) == 1073741824) {
            return 1;
        }
        int i2 = i & 255;
        int i3 = 0;
        while (true) {
            int[] iArr = EDITOR_ACTIONS;
            if (i3 >= iArr.length) {
                Log.i("getEditorAction", "Returning EditorAction Unspecified");
                return 0;
            }
            int i4 = iArr[i3];
            if (i2 == i4) {
                return i4;
            }
            i3++;
        }
    }

    public static boolean isAutoLanguage(String str) {
        return str.contentEquals("auto") || str.contentEquals("mul");
    }

    public static boolean isCJKLanguage(String str) {
        return str.startsWith("zh") || str.startsWith("ja") || str.startsWith("ko");
    }

    public static boolean isIndicLanguage(String str) {
        return str.startsWith("bn") || str.startsWith("gu") || str.startsWith("hi") || str.startsWith("kn") || str.startsWith("ml") || str.startsWith("mr") || str.startsWith("ne") || str.startsWith("or") || str.startsWith("pa") || str.startsWith("ta") || str.startsWith("te") || str.startsWith("ur");
    }

    public static boolean isLanguageWithSpaces(String str) {
        return (str.startsWith("zh") || str.startsWith("ja") || str.startsWith("th")) ? false : true;
    }

    public static boolean isPasswordField(EditorInfo editorInfo) {
        if (editorInfo != null) {
            return editorInfo.inputType == 129 || editorInfo.inputType == 145 || editorInfo.inputType == 225 || editorInfo.inputType == 18;
        }
        return false;
    }

    public static boolean isRTLLanguage(String str) {
        return str.startsWith("ar") || str.startsWith("fa") || str.startsWith("ur") || str.startsWith("iw") || str.startsWith("he");
    }

    private static void processResultForTypeNumberFields(RecognitionResult recognitionResult, int i, int i2) {
        boolean z = (i2 & 4096) == 4096 && recognitionResult.getStrokes().getPreContext().isEmpty();
        boolean z2 = ((i2 & 8192) != 8192 || recognitionResult.getStrokes().getPreContext().contains(".") || recognitionResult.getStrokes().getPreContext().contains(",")) ? false : true;
        boolean z3 = i == 3;
        List<ScoredCandidate> candidateList = recognitionResult.getCandidateList();
        ArrayList arrayList = new ArrayList();
        for (ScoredCandidate scoredCandidate : candidateList) {
            String strFilterForNumber = filterForNumber(scoredCandidate.word, z, z2, z3);
            Log.i(TAG, "filtered: '" + scoredCandidate.word + "' -> '" + strFilterForNumber + "'.");
            if (!strFilterForNumber.isEmpty()) {
                arrayList.add(new ScoredCandidate(strFilterForNumber, scoredCandidate.score));
            }
        }
        for (int i3 = 0; i3 < 10; i3++) {
            arrayList.add(new ScoredCandidate(Integer.toString(i3), BitmapDescriptorFactory.HUE_RED));
        }
        recognitionResult.getCandidateList().clear();
        TreeSet treeSet = new TreeSet();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String str = ((ScoredCandidate) arrayList.get(i4)).word;
            if (!treeSet.contains(str)) {
                treeSet.add(str);
                recognitionResult.getCandidateList().add((ScoredCandidate) arrayList.get(i4));
            }
        }
    }

    public static boolean spaceAfterString(String str) {
        if (str != null && !str.isEmpty()) {
            char cCharAt = str.charAt(str.length() - 1);
            Character.valueOf(cCharAt).getClass();
            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(cCharAt);
            for (Character.UnicodeBlock unicodeBlock : NON_SPACING_LANGUAGES) {
                if (unicodeBlock == unicodeBlockOf) {
                    return false;
                }
            }
        }
        return true;
    }
}
