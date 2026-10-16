package androidx.compose.ui.text.android;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class HorizontalPositionCache {
    private int cachedKey = -1;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float get(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L20
            androidx.compose.ui.text.android.TextLayout r2 = r5.layout
            android.text.Layout r2 = r2.getLayout()
            int r2 = androidx.compose.ui.text.android.LayoutCompat_androidKt.getLineForOffset(r2, r6, r1)
            androidx.compose.ui.text.android.TextLayout r3 = r5.layout
            int r3 = r3.getLineStart(r2)
            androidx.compose.ui.text.android.TextLayout r4 = r5.layout
            int r2 = r4.getLineEnd(r2)
            if (r6 == r3) goto L1e
            if (r6 != r2) goto L20
        L1e:
            r2 = r1
            goto L21
        L20:
            r2 = r0
        L21:
            int r3 = r6 * 4
            if (r9 == 0) goto L2a
            if (r2 == 0) goto L28
            goto L2f
        L28:
            r0 = r1
            goto L2f
        L2a:
            if (r2 == 0) goto L2e
            r0 = 2
            goto L2f
        L2e:
            r0 = 3
        L2f:
            int r3 = r3 + r0
            int r0 = r5.cachedKey
            if (r0 != r3) goto L37
            float r5 = r5.cachedValue
            return r5
        L37:
            androidx.compose.ui.text.android.TextLayout r0 = r5.layout
            if (r9 == 0) goto L40
            float r6 = r0.getPrimaryHorizontal(r6, r7)
            goto L44
        L40:
            float r6 = r0.getSecondaryHorizontal(r6, r7)
        L44:
            if (r8 == 0) goto L4a
            r5.cachedKey = r3
            r5.cachedValue = r6
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.HorizontalPositionCache.get(int, boolean, boolean, boolean):float");
    }

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int i2) {
        return get(i2, false, false, true);
    }

    public final float getPrimaryUpstream(int i2) {
        return get(i2, true, true, true);
    }

    public final float getSecondaryDownstream(int i2) {
        return get(i2, false, false, false);
    }

    public final float getSecondaryUpstream(int i2) {
        return get(i2, true, true, false);
    }
}
