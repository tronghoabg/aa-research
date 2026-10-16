package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private EmojiCompat.GlyphChecker mGlyphChecker;
    private final MetadataRepo mMetadataRepo;
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    /* compiled from: WazeSource */
    final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        static int findIndexBackward(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 >= 0 && length >= i2 && i3 >= 0) {
                loop0: while (true) {
                    boolean z = false;
                    while (i3 != 0) {
                        i2--;
                        if (i2 >= 0) {
                            char cCharAt = charSequence.charAt(i2);
                            if (!z) {
                                if (!Character.isSurrogate(cCharAt)) {
                                    i3--;
                                } else {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        break loop0;
                                    }
                                    z = true;
                                }
                            } else {
                                if (!Character.isHighSurrogate(cCharAt)) {
                                    return -1;
                                }
                                i3--;
                            }
                        } else {
                            return z ? -1 : 0;
                        }
                    }
                    return i2;
                }
            }
            return -1;
        }

        static int findIndexForward(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i3 != 0) {
                    if (i2 >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2++;
                        i3--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2++;
                        i3--;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2++;
                        z = true;
                    }
                }
                return i2;
            }
        }
    }

    /* compiled from: WazeSource */
    interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* compiled from: WazeSource */
    final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        ProcessorSm(MetadataRepo.Node node, boolean z, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i2) {
            return i2 == 65039;
        }

        private static boolean isTextStyle(int i2) {
            return i2 == 65038;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int check(int i2) {
            MetadataRepo.Node node = this.mCurrentNode.get(i2);
            int i3 = 1;
            if (this.mState == 2) {
                if (node != null) {
                    this.mCurrentNode = node;
                    this.mCurrentDepth++;
                } else if (isTextStyle(i2)) {
                    reset();
                } else if (!isEmojiStyle(i2)) {
                    if (this.mCurrentNode.getData() == null) {
                        reset();
                    } else if (this.mCurrentDepth != 1 || shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                        i3 = 3;
                    } else {
                        reset();
                    }
                }
                i3 = 2;
            } else if (node == null) {
                reset();
            } else {
                this.mState = 2;
                this.mCurrentNode = node;
                this.mCurrentDepth = 1;
                i3 = 2;
            }
            this.mLastCodepoint = i2;
            return i3;
        }

        TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        boolean isInFlushableState() {
            if (this.mState != 2 || this.mCurrentNode.getData() == null) {
                return false;
            }
            return this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint();
        }
    }

    EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker, boolean z, int[] iArr, Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean delete(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
        /*
            boolean r7 = hasModifiers(r7)
            r0 = 0
            if (r7 == 0) goto L8
            goto L43
        L8:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = hasInvalidSelection(r7, r1)
            if (r2 != 0) goto L43
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r2 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            androidx.emoji2.text.EmojiSpan[] r1 = (androidx.emoji2.text.EmojiSpan[]) r1
            if (r1 == 0) goto L43
            int r2 = r1.length
            if (r2 <= 0) goto L43
            r3 = r0
        L24:
            if (r3 >= r2) goto L43
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L35
            if (r5 == r7) goto L3e
            goto L37
        L35:
            if (r4 == r7) goto L3e
        L37:
            if (r7 <= r5) goto L3b
            if (r7 < r4) goto L3e
        L3b:
            int r3 = r3 + 1
            goto L24
        L3e:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.delete(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    static boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!hasInvalidSelection(selectionStart, selectionEnd)) {
                if (z) {
                    iMax = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i2, 0));
                    iMin = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i3, 0));
                    if (iMax != -1 && iMin != -1) {
                    }
                } else {
                    iMax = Math.max(selectionStart - i2, 0);
                    iMin = Math.min(selectionEnd + i3, editable.length());
                }
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(iMax, iMin, EmojiSpan.class);
                if (emojiSpanArr != null && (emojiSpanArr.length) > 0) {
                    for (EmojiSpan emojiSpan : emojiSpanArr) {
                        int spanStart = editable.getSpanStart(emojiSpan);
                        int spanEnd = editable.getSpanEnd(emojiSpan);
                        iMax = Math.min(spanStart, iMax);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax2 = Math.max(iMax, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    inputConnection.beginBatchEdit();
                    editable.delete(iMax2, iMin2);
                    inputConnection.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    static boolean handleOnKeyDown(Editable editable, int i2, KeyEvent keyEvent) {
        boolean zDelete;
        if (i2 != 67) {
            if (i2 == 112) {
                zDelete = delete(editable, keyEvent, true);
            }
            return false;
        }
        zDelete = delete(editable, keyEvent, false);
        if (zDelete) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean hasGlyph(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i2, i3, typefaceEmojiRasterizer.getSdkAdded()));
        }
        return typefaceEmojiRasterizer.getHasGlyph() == 2;
    }

    private static boolean hasInvalidSelection(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    private static boolean hasModifiers(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    int getEmojiEnd(CharSequence charSequence, int i2) {
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).end;
    }

    int getEmojiMatch(CharSequence charSequence, int i2) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int iCharCount = 0;
        int i3 = 0;
        int i4 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iCheck = processorSm.check(iCodePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (iCheck == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i4 = 0;
            } else if (iCheck != 2) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i2) {
                    i3++;
                }
            } else {
                iCharCount += Character.charCount(iCodePointAt);
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i2) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i2) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }

    int getEmojiStart(CharSequence charSequence, int i2) {
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).start;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[Catch: all -> 0x002b, TRY_ENTER, TryCatch #2 {all -> 0x002b, blocks: (B:6:0x000c, B:9:0x0011, B:11:0x0016, B:13:0x0025, B:20:0x003b, B:22:0x0045, B:26:0x004b, B:28:0x0057, B:29:0x005a, B:39:0x0077), top: B:67:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:6:0x000c, B:9:0x0011, B:11:0x0016, B:13:0x0025, B:20:0x003b, B:22:0x0045, B:26:0x004b, B:28:0x0057, B:29:0x005a, B:39:0x0077), top: B:67:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:33:0x0069, B:42:0x0086, B:17:0x0030), top: B:63:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence process(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r1 = r10 instanceof androidx.emoji2.text.SpannableBuilder
            if (r1 == 0) goto La
            r0 = r10
            androidx.emoji2.text.SpannableBuilder r0 = (androidx.emoji2.text.SpannableBuilder) r0
            r0.beginBatchEdit()
        La:
            if (r1 != 0) goto L30
            boolean r0 = r10 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L11
            goto L30
        L11:
            boolean r0 = r10 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r0 == 0) goto L38
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0     // Catch: java.lang.Throwable -> L2b
            int r3 = r11 + (-1)
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r5 = androidx.emoji2.text.EmojiSpan.class
            int r0 = r0.nextSpanTransition(r3, r4, r5)     // Catch: java.lang.Throwable -> L2b
            if (r0 > r12) goto L38
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L2b
            goto L38
        L2b:
            r0 = move-exception
            r9 = r0
            r3 = r10
            goto Lb4
        L30:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> Lb1
            r0 = r10
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> Lb1
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
        L38:
            r0 = 0
            if (r2 == 0) goto L65
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r3 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r3 = r2.getSpans(r11, r12, r3)     // Catch: java.lang.Throwable -> L2b
            androidx.emoji2.text.EmojiSpan[] r3 = (androidx.emoji2.text.EmojiSpan[]) r3     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L65
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2b
            if (r4 <= 0) goto L65
            r5 = r0
        L49:
            if (r5 >= r4) goto L65
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L2b
            int r7 = r2.getSpanStart(r6)     // Catch: java.lang.Throwable -> L2b
            int r8 = r2.getSpanEnd(r6)     // Catch: java.lang.Throwable -> L2b
            if (r7 == r12) goto L5a
            r2.removeSpan(r6)     // Catch: java.lang.Throwable -> L2b
        L5a:
            int r11 = java.lang.Math.min(r7, r11)     // Catch: java.lang.Throwable -> L2b
            int r12 = java.lang.Math.max(r8, r12)     // Catch: java.lang.Throwable -> L2b
            int r5 = r5 + 1
            goto L49
        L65:
            r4 = r11
            r5 = r12
            if (r4 == r5) goto La7
            int r11 = r10.length()     // Catch: java.lang.Throwable -> Lb1
            if (r4 < r11) goto L70
            goto La7
        L70:
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r11) goto L85
            if (r2 == 0) goto L85
            int r11 = r2.length()     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r12 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r11 = r2.getSpans(r0, r11, r12)     // Catch: java.lang.Throwable -> L2b
            androidx.emoji2.text.EmojiSpan[] r11 = (androidx.emoji2.text.EmojiSpan[]) r11     // Catch: java.lang.Throwable -> L2b
            int r11 = r11.length     // Catch: java.lang.Throwable -> L2b
            int r13 = r13 - r11
        L85:
            r6 = r13
            androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback r8 = new androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback     // Catch: java.lang.Throwable -> Lb1
            androidx.emoji2.text.EmojiCompat$SpanFactory r11 = r9.mSpanFactory     // Catch: java.lang.Throwable -> Lb1
            r8.<init>(r2, r11)     // Catch: java.lang.Throwable -> Lb1
            r2 = r9
            r3 = r10
            r7 = r14
            java.lang.Object r9 = r2.process(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La5
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r9 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) r9     // Catch: java.lang.Throwable -> La5
            if (r9 == 0) goto La8
            android.text.Spannable r9 = r9.getUnwrappedSpannable()     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto La4
            r10 = r3
            androidx.emoji2.text.SpannableBuilder r10 = (androidx.emoji2.text.SpannableBuilder) r10
            r10.endBatchEdit()
        La4:
            return r9
        La5:
            r0 = move-exception
            goto Lb3
        La7:
            r3 = r10
        La8:
            if (r1 == 0) goto Lb0
            r10 = r3
            androidx.emoji2.text.SpannableBuilder r10 = (androidx.emoji2.text.SpannableBuilder) r10
            r10.endBatchEdit()
        Lb0:
            return r3
        Lb1:
            r0 = move-exception
            r3 = r10
        Lb3:
            r9 = r0
        Lb4:
            if (r1 != 0) goto Lb7
            goto Lbd
        Lb7:
            r10 = r3
            androidx.emoji2.text.SpannableBuilder r10 = (androidx.emoji2.text.SpannableBuilder) r10
            r10.endBatchEdit()
        Lbd:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.process(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* compiled from: WazeSource */
    class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;
        public UnprecomputeTextOnModificationSpannable spannable;

        EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                this.spannable = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i2, i3, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    /* compiled from: WazeSource */
    class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        EmojiProcessLookupCallback(int i2) {
            this.mOffset = i2;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i4 = this.mOffset;
            if (i2 > i4 || i4 >= i3) {
                return i3 <= i4;
            }
            this.start = i2;
            this.end = i3;
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }
    }

    /* compiled from: WazeSource */
    class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }
    }

    int getEmojiMatch(CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    private <T> T process(CharSequence charSequence, int i2, int i3, int i4, boolean z, EmojiProcessCallback<T> emojiProcessCallback) {
        int iCharCount;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        boolean zHandleEmoji = true;
        int i5 = 0;
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        loop0: while (true) {
            iCharCount = i2;
            while (i2 < i3 && i5 < i4 && zHandleEmoji) {
                int iCheck = processorSm.check(iCodePointAt);
                if (iCheck == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i2 = iCharCount;
                } else if (iCheck != 2) {
                    if (z || !hasGlyph(charSequence, iCharCount, i2, processorSm.getFlushMetadata())) {
                        i5++;
                        zHandleEmoji = emojiProcessCallback.handleEmoji(charSequence, iCharCount, i2, processorSm.getFlushMetadata());
                    }
                } else {
                    i2 += Character.charCount(iCodePointAt);
                    if (i2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, i2);
                    }
                }
            }
            break loop0;
        }
        if (processorSm.isInFlushableState() && i5 < i4 && zHandleEmoji && (z || !hasGlyph(charSequence, iCharCount, i2, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, iCharCount, i2, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
