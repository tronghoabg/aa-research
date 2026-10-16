package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public class ImeUiUtils {
    public static final int IME_ACTION_EMOJI_MODE = -10;
    public static final int IME_ACTION_LEAVE_EMOJI_MODE = -11;
    private static final java.lang.String PHONE_NUMBER_CHAR = "+()/*#,.-N ;";
    private static final java.lang.String TAG = "HWRImeUiUtils";
    private static final int[] EDITOR_ACTIONS = {6, 2, 5, 1, 3, 0, 4};
    public static final java.lang.Character.UnicodeBlock[] NON_SPACING_LANGUAGES = {java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY, java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS, java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT, java.lang.Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT, java.lang.Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B, java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS, java.lang.Character.UnicodeBlock.HIRAGANA, java.lang.Character.UnicodeBlock.KATAKANA, java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, java.lang.Character.UnicodeBlock.KHMER, java.lang.Character.UnicodeBlock.KHMER_SYMBOLS, java.lang.Character.UnicodeBlock.LAO, java.lang.Character.UnicodeBlock.THAI};

    public static boolean disableNewWordJustInCase(java.lang.String str) {
        return str.startsWith("th") || str.startsWith("km") || str.startsWith("lo") || str.startsWith("universal");
    }

    public static java.lang.String filterForNumber(java.lang.String str, boolean z, boolean z2, boolean z3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
        java.lang.String string = sb.toString();
        return string.endsWith(" ") ? string.substring(0, string.length() - 1) : string;
    }

    public static com.google.android.libraries.handwriting.base.RecognitionResult filterResultForInputType(com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult, java.lang.String str) {
        if (recognitionResult != com.google.android.libraries.handwriting.base.RecognitionResult.EMPTY) {
            try {
                int i = java.lang.Integer.parseInt(str);
                if ((i & 2) != 0) {
                    processResultForTypeNumberFields(recognitionResult, i & 15, i & 16773120);
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return recognitionResult;
    }

    public static int getEditorAction(android.view.inputmethod.EditorInfo editorInfo) {
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
                android.util.Log.i("getEditorAction", "Returning EditorAction Unspecified");
                return 0;
            }
            int i4 = iArr[i3];
            if (i2 == i4) {
                return i4;
            }
            i3++;
        }
    }

    public static boolean isAutoLanguage(java.lang.String str) {
        return str.contentEquals("auto") || str.contentEquals("mul");
    }

    public static boolean isCJKLanguage(java.lang.String str) {
        return str.startsWith("zh") || str.startsWith("ja") || str.startsWith("ko");
    }

    public static boolean isIndicLanguage(java.lang.String str) {
        return str.startsWith("bn") || str.startsWith("gu") || str.startsWith("hi") || str.startsWith("kn") || str.startsWith("ml") || str.startsWith("mr") || str.startsWith("ne") || str.startsWith("or") || str.startsWith("pa") || str.startsWith("ta") || str.startsWith("te") || str.startsWith("ur");
    }

    public static boolean isLanguageWithSpaces(java.lang.String str) {
        return (str.startsWith("zh") || str.startsWith("ja") || str.startsWith("th")) ? false : true;
    }

    public static boolean isPasswordField(android.view.inputmethod.EditorInfo editorInfo) {
        if (editorInfo != null) {
            return editorInfo.inputType == 129 || editorInfo.inputType == 145 || editorInfo.inputType == 225 || editorInfo.inputType == 18;
        }
        return false;
    }

    public static boolean isRTLLanguage(java.lang.String str) {
        return str.startsWith("ar") || str.startsWith("fa") || str.startsWith("ur") || str.startsWith("iw") || str.startsWith("he");
    }

    private static void processResultForTypeNumberFields(com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult, int i, int i2) {
        boolean z = (i2 & 4096) == 4096 && recognitionResult.getStrokes().getPreContext().isEmpty();
        boolean z2 = ((i2 & 8192) != 8192 || recognitionResult.getStrokes().getPreContext().contains(".") || recognitionResult.getStrokes().getPreContext().contains(",")) ? false : true;
        boolean z3 = i == 3;
        java.util.List<com.google.android.libraries.handwriting.base.ScoredCandidate> candidateList = recognitionResult.getCandidateList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.libraries.handwriting.base.ScoredCandidate scoredCandidate : candidateList) {
            java.lang.String strFilterForNumber = filterForNumber(scoredCandidate.word, z, z2, z3);
            android.util.Log.i(TAG, "filtered: '" + scoredCandidate.word + "' -> '" + strFilterForNumber + "'.");
            if (!strFilterForNumber.isEmpty()) {
                arrayList.add(new com.google.android.libraries.handwriting.base.ScoredCandidate(strFilterForNumber, scoredCandidate.score));
            }
        }
        for (int i3 = 0; i3 < 10; i3++) {
            arrayList.add(new com.google.android.libraries.handwriting.base.ScoredCandidate(java.lang.Integer.toString(i3), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
        }
        recognitionResult.getCandidateList().clear();
        java.util.TreeSet treeSet = new java.util.TreeSet();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            java.lang.String str = ((com.google.android.libraries.handwriting.base.ScoredCandidate) arrayList.get(i4)).word;
            if (!treeSet.contains(str)) {
                treeSet.add(str);
                recognitionResult.getCandidateList().add((com.google.android.libraries.handwriting.base.ScoredCandidate) arrayList.get(i4));
            }
        }
    }

    public static boolean spaceAfterString(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            char cCharAt = str.charAt(str.length() - 1);
            java.lang.Character.valueOf(cCharAt).getClass();
            java.lang.Character.UnicodeBlock unicodeBlockOf = java.lang.Character.UnicodeBlock.of(cCharAt);
            for (java.lang.Character.UnicodeBlock unicodeBlock : NON_SPACING_LANGUAGES) {
                if (unicodeBlock == unicodeBlockOf) {
                    return false;
                }
            }
        }
        return true;
    }
}
