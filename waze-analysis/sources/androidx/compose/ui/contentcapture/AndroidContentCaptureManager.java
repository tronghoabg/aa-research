package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import h.a.i;
import h.ab;
import h.d.b;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.w;
import h.g.b.x;
import h.g.b.y;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidContentCaptureManager implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private boolean checkingForSemanticsChanges;
    private ContentCaptureSessionWrapper contentCaptureSession;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private a<? extends ContentCaptureSessionWrapper> onContentCaptureSession;
    private SemanticsNodeCopy previousSemanticsRoot;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final o<ab> boundsUpdateChannel = w.c(1, null, null, 6);
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0(this.f$0);
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    final class TranslateStatus {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
        public static final TranslateStatus SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        static {
            TranslateStatus[] translateStatusArr$values = $values();
            $VALUES = translateStatusArr$values;
            $ENTRIES = b.a(translateStatusArr$values);
        }

        private TranslateStatus(String str, int i2) {
        }

        public static h.d.a<TranslateStatus> getEntries() {
            return $ENTRIES;
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void doTranslation(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            l lVar;
            int size = longSparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                long jKeyAt = longSparseArray.keyAt(i2);
                ViewTranslationResponse viewTranslationResponseM133m = bi$$ExternalSyntheticApiModelOutline0.m133m((Object) longSparseArray.get(jKeyAt));
                if (viewTranslationResponseM133m != null && (value = viewTranslationResponseM133m.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = androidContentCaptureManager.getCurrentSemanticsNodes$ui().get((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (lVar = (l) accessibilityAction.getAction()) != null) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onCreateVirtualViewTranslationRequests(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            for (long j2 : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = androidContentCaptureManager.getCurrentSemanticsNodes$ui().get((int) j2);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.getView().getAutofillId(), semanticsNode.getId());
                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getText());
                    if (list != null) {
                        builder.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null), null, 2, 0 == true ? 1 : 0)));
                        consumer.u(builder.build());
                    }
                }
            }
        }

        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager androidContentCaptureManager, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (x.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(androidContentCaptureManager, longSparseArray);
            } else {
                androidContentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$ViewTranslationHelperMethods$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
                    }
                });
            }
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, a<? extends ContentCaptureSessionWrapper> aVar) {
        this.view = androidComposeView;
        this.onContentCaptureSession = aVar;
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
    }

    private final void bufferContentCaptureViewAppeared(int i2, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(i2, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructureCompat));
    }

    private final void bufferContentCaptureViewDisappeared(int i2) {
        this.bufferedEvents.add(new ContentCaptureEvent(i2, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j2;
        char c2;
        long j3;
        int i2;
        SemanticsNodeCopy semanticsNodeCopy;
        int i3;
        long[] jArr3;
        SemanticsNodeCopy semanticsNodeCopy2;
        long j4;
        int i4;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap2 = intObjectMap;
        int[] iArr3 = intObjectMap2.keys;
        long[] jArr4 = intObjectMap2.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr4[i5];
            char c3 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = i5 - length;
                int i7 = 0;
                while (true) {
                    int i8 = 8;
                    int i9 = 8 - ((~i6) >>> 31);
                    if (i7 < i9) {
                        if ((j5 & 255) < 128) {
                            int i10 = iArr3[(i5 << 3) + i7];
                            SemanticsNodeCopy semanticsNodeCopy3 = this.previousSemanticsNodes.get(i10);
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap2.get(i10);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode == null) {
                                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                                throw new e();
                            }
                            if (semanticsNodeCopy3 == null) {
                                MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui = semanticsNode.getUnmergedConfig$ui().getProps$ui();
                                c2 = c3;
                                Object[] objArr = props$ui.keys;
                                long[] jArr5 = props$ui.metadata;
                                j3 = j6;
                                int length2 = jArr5.length - 2;
                                iArr2 = iArr3;
                                if (length2 >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j7 = jArr5[i11];
                                        j2 = j5;
                                        if ((((~j7) << c2) & j7 & j3) != j3) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j7 & 255) < 128) {
                                                    i4 = i8;
                                                    j4 = j7;
                                                    if (x.n((SemanticsPropertyKey) objArr[(i11 << 3) + i13], SemanticsProperties.INSTANCE.getText())) {
                                                        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getText());
                                                        sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(list != null ? (AnnotatedString) i.R(list) : null));
                                                    }
                                                } else {
                                                    j4 = j7;
                                                    i4 = i8;
                                                }
                                                j7 = j4 >> i4;
                                                i13++;
                                                i8 = i4;
                                            }
                                            i2 = i8;
                                            if (i12 != i2) {
                                                jArr2 = jArr4;
                                                break;
                                            }
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        j5 = j2;
                                        i8 = 8;
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    j2 = j5;
                                    jArr2 = jArr4;
                                }
                            } else {
                                iArr2 = iArr3;
                                j2 = j5;
                                c2 = c3;
                                j3 = j6;
                                MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui2 = semanticsNode.getUnmergedConfig$ui().getProps$ui();
                                Object[] objArr2 = props$ui2.keys;
                                long[] jArr6 = props$ui2.metadata;
                                int length3 = jArr6.length - 2;
                                if (length3 >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j8 = jArr6[i14];
                                        long[] jArr7 = jArr6;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j8) << c2) & j8 & j3) != j3) {
                                            int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j8 & 255) < 128) {
                                                    i3 = i16;
                                                    jArr3 = jArr4;
                                                    if (x.n((SemanticsPropertyKey) objArr3[(i14 << 3) + i16], SemanticsProperties.INSTANCE.getText())) {
                                                        List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy3.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
                                                        AnnotatedString annotatedString = list2 != null ? (AnnotatedString) i.R(list2) : null;
                                                        semanticsNodeCopy2 = semanticsNodeCopy3;
                                                        List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getText());
                                                        AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) i.R(list3) : null;
                                                        if (!x.n(annotatedString, annotatedString2)) {
                                                            sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(annotatedString2));
                                                        }
                                                    }
                                                    j8 >>= 8;
                                                    i16 = i3 + 1;
                                                    jArr4 = jArr3;
                                                    semanticsNodeCopy3 = semanticsNodeCopy2;
                                                } else {
                                                    i3 = i16;
                                                    jArr3 = jArr4;
                                                }
                                                semanticsNodeCopy2 = semanticsNodeCopy3;
                                                j8 >>= 8;
                                                i16 = i3 + 1;
                                                jArr4 = jArr3;
                                                semanticsNodeCopy3 = semanticsNodeCopy2;
                                            }
                                            jArr2 = jArr4;
                                            semanticsNodeCopy = semanticsNodeCopy3;
                                            if (i15 != 8) {
                                                i2 = 8;
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            semanticsNodeCopy = semanticsNodeCopy3;
                                        }
                                        if (i14 == length3) {
                                            break;
                                        }
                                        i14++;
                                        objArr2 = objArr3;
                                        jArr6 = jArr7;
                                        jArr4 = jArr2;
                                        semanticsNodeCopy3 = semanticsNodeCopy;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                }
                            }
                            i2 = 8;
                            j5 = j2 >> i2;
                            i7++;
                            intObjectMap2 = intObjectMap;
                            c3 = c2;
                            j6 = j3;
                            iArr3 = iArr2;
                            jArr4 = jArr2;
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j2 = j5;
                            c2 = c3;
                            j3 = j6;
                        }
                        i2 = 8;
                        j5 = j2 >> i2;
                        i7++;
                        intObjectMap2 = intObjectMap;
                        c3 = c2;
                        j6 = j3;
                        iArr3 = iArr2;
                        jArr4 = jArr2;
                    } else {
                        iArr = iArr3;
                        jArr = jArr4;
                        if (i9 != 8) {
                            return;
                        }
                    }
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            intObjectMap2 = intObjectMap;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void clearTranslatedText() {
        int i2;
        AccessibilityAction accessibilityAction;
        a aVar;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i3 << 3) + i5]).getSemanticsNode().getUnmergedConfig$ui();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (aVar = (a) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final void contentCaptureChangeChecker$lambda$0(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r4) {
        /*
            boolean r0 = r4.isEnabled$ui()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "ContentCapture:changeChecker"
            android.os.Trace.beginSection(r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.view     // Catch: java.lang.Throwable -> L45
            androidx.compose.ui.node.Owner r0 = (androidx.compose.ui.node.Owner) r0     // Catch: java.lang.Throwable -> L45
            r1 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.node.Owner.CC.measureAndLayout$default(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L45
            r4.sendContentCaptureDisappearEvents()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "ContentCapture:sendAppearEvents"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L45
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.view     // Catch: java.lang.Throwable -> L40
            androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()     // Catch: java.lang.Throwable -> L40
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.getUnmergedRootSemanticsNode()     // Catch: java.lang.Throwable -> L40
            androidx.compose.ui.platform.SemanticsNodeCopy r1 = r4.previousSemanticsRoot     // Catch: java.lang.Throwable -> L40
            r4.sendContentCaptureAppearEvents(r0, r1)     // Catch: java.lang.Throwable -> L40
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            androidx.collection.IntObjectMap r0 = r4.getCurrentSemanticsNodes$ui()     // Catch: java.lang.Throwable -> L45
            r4.checkForContentCapturePropertyChanges(r0)     // Catch: java.lang.Throwable -> L45
            r4.updateSemanticsCopy()     // Catch: java.lang.Throwable -> L45
            r4.checkingForSemanticsChanges = r3     // Catch: java.lang.Throwable -> L45
            android.os.Trace.endSection()
            return
        L40:
            r4 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            throw r4     // Catch: java.lang.Throwable -> L45
        L45:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0(androidx.compose.ui.contentcapture.AndroidContentCaptureManager):void");
    }

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> list, p<? super Integer, ? super T, ab> pVar, l<? super T, Boolean> lVar) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (lVar.invoke(t).booleanValue()) {
                pVar.invoke(Integer.valueOf(i2), t);
                i2++;
            }
        }
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, p<? super Integer, ? super SemanticsNode, ab> pVar) {
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i3);
            if (getCurrentSemanticsNodes$ui().containsKey(semanticsNode2.getId())) {
                pVar.invoke(Integer.valueOf(i2), semanticsNode2);
                i2++;
            }
        }
    }

    private final void hideTranslatedText() {
        int i2;
        AccessibilityAction accessibilityAction;
        l lVar;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i3 << 3) + i5]).getSemanticsNode().getUnmergedConfig$ui();
                        if (x.n(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), true) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (lVar = (l) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i2);
            ContentCaptureEventType type = contentCaptureEvent.getType();
            ContentCaptureEventType contentCaptureEventType = ContentCaptureEventType.VIEW_APPEAR;
            int iOrdinal = type.ordinal();
            if (iOrdinal == 0) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionWrapper.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                AutofillId autofillIdNewAutofillId = contentCaptureSessionWrapper.newAutofillId(contentCaptureEvent.getId());
                if (autofillIdNewAutofillId != null) {
                    contentCaptureSessionWrapper.notifyViewDisappeared(autofillIdNewAutofillId);
                }
            }
        }
        contentCaptureSessionWrapper.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.i(ab.f48028a);
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        fastForEachReplacedVisibleChildren(semanticsNode, new AnonymousClass1(semanticsNodeCopy, this));
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
            if (getCurrentSemanticsNodes$ui().containsKey(semanticsNode2.getId()) && this.previousSemanticsNodes.containsKey(semanticsNode2.getId())) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(semanticsNode2.getId());
                if (semanticsNodeCopy2 == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("node not present in pruned tree before this change");
                    throw new e();
                }
                sendContentCaptureAppearEvents(semanticsNode2, semanticsNodeCopy2);
            }
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        int i2;
        MutableIntObjectMap<SemanticsNodeCopy> mutableIntObjectMap = this.previousSemanticsNodes;
        int[] iArr = mutableIntObjectMap.keys;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = iArr[(i3 << 3) + i5];
                        if (!getCurrentSemanticsNodes$ui().containsKey(i6)) {
                            bufferContentCaptureViewDisappeared(i6);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int i2, String str) {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null) {
            return;
        }
        AutofillId autofillIdNewAutofillId = contentCaptureSessionWrapper.newAutofillId(i2);
        if (autofillIdNewAutofillId != null) {
            contentCaptureSessionWrapper.notifyViewTextChanged(autofillIdNewAutofillId, str);
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid content capture ID");
            throw new e();
        }
    }

    private final void showTranslatedText() {
        int i2;
        AccessibilityAction accessibilityAction;
        l lVar;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i3 << 3) + i5]).getSemanticsNode().getUnmergedConfig$ui();
                        if (x.n(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), false) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (lVar = (l) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i2) {
        AutofillId autofillId;
        String strM10288toLegacyClassNameV4PA4sw;
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper != null) {
            AutofillIdCompat autofillId2 = ViewCompatShims.getAutofillId(this.view);
            if (semanticsNode.getParent() != null) {
                autofillId = contentCaptureSessionWrapper.newAutofillId(r4.getId());
                if (autofillId != null) {
                }
            } else {
                autofillId = autofillId2.toAutofillId();
            }
            ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionWrapper.newVirtualViewStructure(autofillId, semanticsNode.getId());
            if (viewStructureCompatNewVirtualViewStructure != null) {
                SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
                if (!unmergedConfig$ui.contains(SemanticsProperties.INSTANCE.getPassword())) {
                    Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
                        extras.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, i2);
                    }
                    String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getTestTag());
                    if (str != null) {
                        viewStructureCompatNewVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
                    }
                    Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsTraversalGroup());
                    if (bool != null) {
                        bool.booleanValue();
                        viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
                    }
                    List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getText());
                    if (list != null) {
                        viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                        viewStructureCompatNewVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
                    }
                    AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getEditableText());
                    if (annotatedString != null) {
                        viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                        viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
                    }
                    List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getContentDescription());
                    if (list2 != null) {
                        viewStructureCompatNewVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
                    }
                    Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getRole());
                    if (role != null && (strM10288toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m10288toLegacyClassNameV4PA4sw(role.m10315unboximpl())) != null) {
                        viewStructureCompatNewVirtualViewStructure.setClassName(strM10288toLegacyClassNameV4PA4sw);
                    }
                    TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui);
                    if (textLayoutResult != null) {
                        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
                        viewStructureCompatNewVirtualViewStructure.setTextStyle(TextUnit.m11362getValueimpl(layoutInput.getStyle().m10577getFontSizeXSAIIZE()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
                    }
                    Rect boundsInParent$ui = semanticsNode.getBoundsInParent$ui();
                    viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui.getLeft(), (int) boundsInParent$ui.getTop(), 0, 0, (int) (boundsInParent$ui.getRight() - boundsInParent$ui.getLeft()), (int) (boundsInParent$ui.getBottom() - boundsInParent$ui.getTop()));
                    return viewStructureCompatNewVirtualViewStructure;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int i2, SemanticsNode semanticsNode) {
        if (isEnabled$ui()) {
            updateTranslationOnAppeared(semanticsNode);
            bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode, i2));
            fastForEachReplacedVisibleChildren(semanticsNode, new C03641());
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui()) {
            bufferContentCaptureViewDisappeared(semanticsNode.getId());
            List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            for (int i2 = 0; i2 < size; i2++) {
                updateBuffersOnDisappeared(replacedChildren$ui.get(i2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsCopy() {
        /*
            r17 = this;
            r0 = r17
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r1 = r0.previousSemanticsNodes
            r1.clear()
            androidx.collection.IntObjectMap r1 = r0.getCurrentSemanticsNodes$ui()
            int[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            r10 = 0
        L2a:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L57
            int r11 = r6 << 3
            int r11 = r11 + r10
            r13 = r2[r11]
            r11 = r3[r11]
            androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds r11 = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) r11
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r14 = r0.previousSemanticsNodes
            androidx.compose.ui.platform.SemanticsNodeCopy r15 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.semantics.SemanticsNode r11 = r11.getSemanticsNode()
            androidx.collection.IntObjectMap r5 = r0.getCurrentSemanticsNodes$ui()
            r15.<init>(r11, r5)
            r14.set(r13, r15)
        L57:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2a
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.AndroidComposeView r1 = r0.view
            androidx.compose.ui.platform.SemanticsNodeCopy r2 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.semantics.SemanticsOwner r1 = r1.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.getUnmergedRootSemanticsNode()
            androidx.collection.IntObjectMap r3 = r0.getCurrentSemanticsNodes$ui()
            r2.<init>(r1, r3)
            r0.previousSemanticsRoot = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateSemanticsCopy():void");
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        l lVar;
        l lVar2;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && x.n(bool, true)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (lVar2 = (l) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !x.n(bool, false) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (lVar = (l) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0080 -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui(h.c.e<? super h.ab> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.a.q r2 = (kotlinx.coroutines.a.q) r2
            e.b.c.b(r8)
            goto L47
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.a.q r2 = (kotlinx.coroutines.a.q) r2
            e.b.c.b(r8)
            goto L51
        L3e:
            e.b.c.b(r8)
            kotlinx.coroutines.a.o<h.ab> r8 = r7.boundsUpdateChannel
            kotlinx.coroutines.a.q r2 = r8.p()
        L47:
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto L86
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L83
            r2.b()
            boolean r8 = r7.isEnabled$ui()
            if (r8 == 0) goto L65
            r7.notifyContentCaptureChanges()
        L65:
            android.os.Handler r8 = r7.getHandler$ui()
            boolean r5 = r7.checkingForSemanticsChanges
            if (r5 != 0) goto L76
            if (r8 == 0) goto L76
            r7.checkingForSemanticsChanges = r4
            java.lang.Runnable r5 = r7.contentCaptureChangeChecker
            r8.post(r5)
        L76:
            long r5 = r7.SendRecurringContentCaptureEventsIntervalMillis
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.q(r5, r0)
            if (r8 != r1) goto L47
            goto L86
        L83:
            h.ab r7 = h.ab.f48028a
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui(h.c.e):java.lang.Object");
    }

    public final ContentCaptureSessionWrapper getContentCaptureSession$ui() {
        return this.contentCaptureSession;
    }

    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, AndroidContentCaptureManager$currentSemanticsNodes$1.INSTANCE);
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final Handler getHandler$ui() {
        return AndroidComposeUiFlags.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    public final a<ContentCaptureSessionWrapper> getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui() {
        return ContentCaptureManager.Companion.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    public final void onCreateVirtualViewTranslationRequests$ui(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    public final void onHideTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler$ui = getHandler$ui();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler$ui == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler$ui.post(this.contentCaptureChangeChecker);
    }

    public final void onShowTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler$ui = getHandler$ui();
        if (handler$ui == null) {
            x.g();
        }
        handler$ui.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void onVirtualViewTranslationResponses$ui(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(androidContentCaptureManager, longSparseArray);
    }

    public final void setContentCaptureSession$ui(ContentCaptureSessionWrapper contentCaptureSessionWrapper) {
        this.contentCaptureSession = contentCaptureSessionWrapper;
    }

    public final void setCurrentSemanticsNodes$ui(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        this.currentSemanticsNodes = intObjectMap;
    }

    public final void setOnContentCaptureSession(a<? extends ContentCaptureSessionWrapper> aVar) {
        this.onContentCaptureSession = aVar;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    final class C03641 extends y implements p<Integer, SemanticsNode, ab> {
        C03641() {
            super(2);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Integer num, SemanticsNode semanticsNode) {
            invoke(num.intValue(), semanticsNode);
            return ab.f48028a;
        }

        public final void invoke(int i2, SemanticsNode semanticsNode) {
            AndroidContentCaptureManager.this.updateBuffersOnAppeared(i2, semanticsNode);
        }
    }

    public static /* synthetic */ void getContentCaptureSession$ui$annotations() {
    }

    public static /* synthetic */ void getHandler$ui$annotations() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends y implements p<Integer, SemanticsNode, ab> {
        final /* synthetic */ SemanticsNodeCopy $oldNode;
        final /* synthetic */ AndroidContentCaptureManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SemanticsNodeCopy semanticsNodeCopy, AndroidContentCaptureManager androidContentCaptureManager) {
            super(2);
            this.$oldNode = semanticsNodeCopy;
            this.this$0 = androidContentCaptureManager;
        }

        public final void invoke(int i2, SemanticsNode semanticsNode) {
            if (this.$oldNode.getChildren().contains(semanticsNode.getId())) {
                return;
            }
            this.this$0.updateBuffersOnAppeared(i2, semanticsNode);
            this.this$0.notifySubtreeStateChangeIfNeeded();
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Integer num, SemanticsNode semanticsNode) {
            invoke(num.intValue(), semanticsNode);
            return ab.f48028a;
        }
    }
}
