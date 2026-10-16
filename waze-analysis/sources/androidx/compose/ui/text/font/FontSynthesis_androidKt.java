package androidx.compose.ui.text.font;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontSynthesis_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10683synthesizeTypefaceFxwP2eA(int r4, java.lang.Object r5, androidx.compose.ui.text.font.Font r6, androidx.compose.ui.text.font.FontWeight r7, int r8) {
        /*
            boolean r0 = r5 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            goto L4d
        L5:
            boolean r0 = androidx.compose.ui.text.font.FontSynthesis.m10675isWeightOnimpl$ui_text(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L35
            androidx.compose.ui.text.font.FontWeight r0 = r6.getWeight()
            boolean r0 = h.g.b.x.n(r0, r7)
            if (r0 != 0) goto L35
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r0 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r0)
            int r0 = r7.compareTo(r0)
            if (r0 < 0) goto L35
            androidx.compose.ui.text.font.FontWeight r0 = r6.getWeight()
            androidx.compose.ui.text.font.FontWeight$Companion r3 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r3 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r3)
            int r0 = r0.compareTo(r3)
            if (r0 >= 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            boolean r4 = androidx.compose.ui.text.font.FontSynthesis.m10674isStyleOnimpl$ui_text(r4)
            if (r4 == 0) goto L47
            int r4 = r6.mo10613getStyle_LCdwA()
            boolean r4 = androidx.compose.ui.text.font.FontStyle.m10661equalsimpl0(r8, r4)
            if (r4 != 0) goto L47
            goto L48
        L47:
            r1 = r2
        L48:
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4d
            goto L59
        L4d:
            return r5
        L4e:
            if (r0 != 0) goto L59
            androidx.compose.ui.text.font.FontWeight r4 = r6.getWeight()
            int r4 = r4.getWeight()
            goto L5d
        L59:
            int r4 = r7.getWeight()
        L5d:
            if (r1 == 0) goto L6a
            androidx.compose.ui.text.font.FontStyle$Companion r6 = androidx.compose.ui.text.font.FontStyle.Companion
            int r6 = r6.m10667getItalic_LCdwA()
            boolean r6 = androidx.compose.ui.text.font.FontStyle.m10661equalsimpl0(r8, r6)
            goto L78
        L6a:
            int r6 = r6.mo10613getStyle_LCdwA()
            androidx.compose.ui.text.font.FontStyle$Companion r7 = androidx.compose.ui.text.font.FontStyle.Companion
            int r7 = r7.m10667getItalic_LCdwA()
            boolean r6 = androidx.compose.ui.text.font.FontStyle.m10661equalsimpl0(r6, r7)
        L78:
            androidx.compose.ui.text.font.TypefaceHelperMethodsApi28 r7 = androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.INSTANCE
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            android.graphics.Typeface r4 = r7.create(r5, r4, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontSynthesis_androidKt.m10683synthesizeTypefaceFxwP2eA(int, java.lang.Object, androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.FontWeight, int):java.lang.Object");
    }
}
