package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat$Style$$ExternalSyntheticApiModelOutline2;
import androidx.core.os.BuildCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.bumptech.glide.load.n$$ExternalSyntheticApiModelOutline0;
import j$.time.Duration;
import j$.time.TimeConversions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class AccessibilityNodeInfoCompat {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String ACTION_ARGUMENT_DIRECTION_INT = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_PARCELABLE = "android.view.accessibility.action.ARGUMENT_SELECTION_PARCELABLE";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    private static final int BOOLEAN_PROPERTY_ACCESSIBILITY_DATA_SENSITIVE = 64;
    private static final int BOOLEAN_PROPERTY_HAS_REQUEST_INITIAL_ACCESSIBILITY_FOCUS = 32;
    private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
    private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
    private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 8;
    private static final String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
    private static final int BOOLEAN_PROPERTY_SUPPORTS_GRANULAR_SCROLLING = 67108864;
    private static final int BOOLEAN_PROPERTY_TEXT_SELECTABLE = 8388608;
    private static final String BOUNDS_IN_WINDOW_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";
    private static final String CHECKED_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY";
    public static final int CHECKED_STATE_FALSE = 0;
    public static final int CHECKED_STATE_PARTIAL = 2;
    public static final int CHECKED_STATE_TRUE = 1;
    private static final String CONTAINER_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";
    public static final int EXPANDED_STATE_COLLAPSED = 1;
    public static final int EXPANDED_STATE_FULL = 3;
    private static final String EXPANDED_STATE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY";
    public static final int EXPANDED_STATE_PARTIAL = 2;
    public static final int EXPANDED_STATE_UNDEFINED = 0;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY";
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    static final String EXTRA_SELECTION_END_OFFSET_TYPE = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SELECTION_END_OFFSET_TYPE";
    static final String EXTRA_SELECTION_START_OFFSET_TYPE = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SELECTION_START_OFFSET_TYPE";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    private static final String IS_REQUIRED_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY";
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    private static final String MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private static final String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
    private static final String SPANS_ACTION_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    private static final String SPANS_END_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    private static final String SPANS_FLAGS_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    private static final String SPANS_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    private static final String SPANS_START_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    private static final String STATE_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    private static final String SUPPLEMENTAL_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY";
    private static final String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    private static final String UNIQUE_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
    private static int sClickableSpanId;
    private final AccessibilityNodeInfo mInfo;
    public int mParentVirtualDescendantId = -1;
    private int mVirtualDescendantId = -1;

    /* compiled from: WazeSource */
    class Api30Impl {
        private Api30Impl() {
        }

        public static Object createRangeInfo(int i2, float f2, float f3, float f4) {
            return new AccessibilityNodeInfo.RangeInfo(i2, f2, f3, f4);
        }

        public static CharSequence getStateDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void setStateDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* compiled from: WazeSource */
    class Api33Impl {
        private Api33Impl() {
        }

        public static CollectionItemInfoCompat buildCollectionItemInfoCompat(boolean z, int i2, int i3, int i4, int i5, boolean z2, String str, String str2) {
            return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static AccessibilityNodeInfoCompat getChild(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getChild(i2, i3));
        }

        public static String getCollectionItemColumnTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String getCollectionItemRowTitle(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static AccessibilityNodeInfoCompat getParent(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getParent(i2));
        }

        public static String getUniqueId(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean isTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void setTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static void setUniqueId(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* compiled from: WazeSource */
    class Api34Impl {
        private Api34Impl() {
        }

        public static AccessibilityNodeInfo.AccessibilityAction getActionScrollInDirection() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void getBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence getContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long getMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo) {
            return TimeConversions.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()).toMillis();
        }

        public static boolean hasRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean isAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void setAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static void setBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void setContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void setMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo, long j2) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(Duration.ofMillis(j2)));
        }

        public static void setQueryFromAppProcessEnabled(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static void setRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    /* compiled from: WazeSource */
    class Api35Impl {
        private Api35Impl() {
        }

        public static CollectionInfoCompat buildCollectionInfoCompat(int i2, int i3, boolean z, int i4, int i5, int i6) {
            return new CollectionInfoCompat(new AccessibilityNodeInfo.CollectionInfo.Builder().setRowCount(i2).setColumnCount(i3).setHierarchical(z).setSelectionMode(i4).setItemCount(i5).setImportantForAccessibilityItemCount(i6).build());
        }

        public static int getImportantForAccessibilityItemCount(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getImportantForAccessibilityItemCount();
        }

        public static int getItemCount(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getItemCount();
        }
    }

    /* compiled from: WazeSource */
    class Api36Impl {
        private Api36Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void addLabeledBy(AccessibilityNodeInfo accessibilityNodeInfo, View view, int i2) {
            accessibilityNodeInfo.addLabeledBy(view, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getChecked(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int getExpandedState(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static List<AccessibilityNodeInfoCompat> getLabeledByList(AccessibilityNodeInfo accessibilityNodeInfo) {
            List<AccessibilityNodeInfo> labeledByList = accessibilityNodeInfo.getLabeledByList();
            ArrayList arrayList = new ArrayList(labeledByList.size());
            for (AccessibilityNodeInfo accessibilityNodeInfo2 : labeledByList) {
                if (accessibilityNodeInfo2 != null) {
                    arrayList.add(AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo2));
                }
            }
            return arrayList;
        }

        public static CharSequence getSupplementalDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean isFieldRequired(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean removeLabeledBy(AccessibilityNodeInfo accessibilityNodeInfo, View view, int i2) {
            return accessibilityNodeInfo.removeLabeledBy(view, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void setChecked(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
            accessibilityNodeInfo.setChecked(i2);
        }

        public static void setExpandedState(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
            accessibilityNodeInfo.setExpandedState(i2);
        }

        public static void setFieldRequired(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setFieldRequired(z);
        }

        public static void setSupplementalDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setSupplementalDescription(charSequence);
        }
    }

    /* compiled from: WazeSource */
    class Api36MinorImpl {
        private Api36MinorImpl() {
        }

        public static CollectionItemInfoCompat buildCollectionItemInfoCompat(boolean z, int i2, int i3, int i4, int i5, boolean z2, String str, String str2, int i6) {
            return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z2).setRowTitle(str).setColumnTitle(str2).setSortDirection(i6).build());
        }

        public static AccessibilityNodeInfo.AccessibilityAction getActionSetExtendedSelection() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        }

        public static int getCollectionItemSortDirection(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getSortDirection();
        }
    }

    /* compiled from: WazeSource */
    class Api37Impl {
        private Api37Impl() {
        }

        public static AccessibilityNodeInfo.MathInfo createMathInfo(String str) {
            return new AccessibilityNodeInfo.MathInfo(str);
        }

        public static AccessibilityNodeInfo.StructuredDataInfo getStructuredDataInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (accessibilityNodeInfo == null) {
                return null;
            }
            return accessibilityNodeInfo.getStructuredDataInfo();
        }

        public static String getStructuredDataInfoAttribute(AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo, String str) {
            if (structuredDataInfo == null) {
                return null;
            }
            return structuredDataInfo.getAttribute(str);
        }

        public static Map<String, String> getStructuredDataInfoAttributes(AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo) {
            return structuredDataInfo == null ? Collections.EMPTY_MAP : structuredDataInfo.getAttributes();
        }

        public static String getStructuredDataInfoTag(AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo) {
            if (structuredDataInfo == null) {
                return null;
            }
            return structuredDataInfo.getTag();
        }

        public static View getView(AccessibilityNodeInfo.SelectionPosition selectionPosition) {
            return selectionPosition.getView();
        }

        public static int getVirtualDescendantId(AccessibilityNodeInfo.SelectionPosition selectionPosition) {
            return selectionPosition.getVirtualDescendantId();
        }

        public static void putStructuredDataInfoAttribute(AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo, String str, String str2) {
            if (structuredDataInfo == null) {
                return;
            }
            structuredDataInfo.putAttribute(str, str2);
        }

        public static void removeStructuredDataInfoAttribute(AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo, String str) {
            if (structuredDataInfo == null) {
                return;
            }
            structuredDataInfo.removeAttribute(str);
        }

        public static void setStructuredDataInfo(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo) {
            if (accessibilityNodeInfo == null) {
                return;
            }
            accessibilityNodeInfo.setStructuredDataInfo(structuredDataInfo);
        }

        public static boolean structuredDataInfoEquals(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public static int structuredDataInfoHashCode(AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo) {
            if (structuredDataInfo == null) {
                return 0;
            }
            return structuredDataInfo.hashCode();
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExpandedState {
    }

    /* compiled from: WazeSource */
    public abstract class StructuredDataInfoCompat {
        final AccessibilityNodeInfo.StructuredDataInfo mStructuredDataInfo;

        protected StructuredDataInfoCompat(AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo) {
            this.mStructuredDataInfo = structuredDataInfo;
        }

        public boolean equals(Object obj) {
            return (Build.VERSION.SDK_INT < 37 || !(obj instanceof StructuredDataInfoCompat)) ? this == obj : Api37Impl.structuredDataInfoEquals(this.mStructuredDataInfo, ((StructuredDataInfoCompat) obj).mStructuredDataInfo);
        }

        public String getAttribute(String str) {
            if (Build.VERSION.SDK_INT >= 37) {
                return Api37Impl.getStructuredDataInfoAttribute(this.mStructuredDataInfo, str);
            }
            return null;
        }

        public Map<String, String> getAttributes() {
            return Build.VERSION.SDK_INT >= 37 ? Api37Impl.getStructuredDataInfoAttributes(this.mStructuredDataInfo) : Collections.EMPTY_MAP;
        }

        public String getTag() {
            if (Build.VERSION.SDK_INT >= 37) {
                return Api37Impl.getStructuredDataInfoTag(this.mStructuredDataInfo);
            }
            return null;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 37) {
                return Api37Impl.structuredDataInfoHashCode(this.mStructuredDataInfo);
            }
            return 0;
        }

        public void putAttribute(String str, String str2) {
            if (Build.VERSION.SDK_INT >= 37) {
                Api37Impl.putStructuredDataInfoAttribute(this.mStructuredDataInfo, str, str2);
            }
        }

        public void removeAttribute(String str) {
            if (Build.VERSION.SDK_INT >= 37) {
                Api37Impl.removeStructuredDataInfoAttribute(this.mStructuredDataInfo, str);
            }
        }
    }

    @Deprecated
    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = (AccessibilityNodeInfo) obj;
    }

    private void addSpanLocationToExtras(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        extrasIntList(SPANS_START_KEY).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        extrasIntList(SPANS_END_KEY).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        extrasIntList(SPANS_FLAGS_KEY).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        extrasIntList(SPANS_ID_KEY).add(Integer.valueOf(i2));
    }

    private void clearExtrasSpans() {
        this.mInfo.getExtras().remove(SPANS_START_KEY);
        this.mInfo.getExtras().remove(SPANS_END_KEY);
        this.mInfo.getExtras().remove(SPANS_FLAGS_KEY);
        this.mInfo.getExtras().remove(SPANS_ID_KEY);
    }

    private List<Integer> extrasIntList(String str) {
        ArrayList<Integer> integerArrayList = this.mInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.mInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String getActionSymbolicName(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    private boolean getBooleanProperty(int i2) {
        Bundle extras = getExtras();
        return extras != null && (extras.getInt(BOOLEAN_PROPERTY_KEY, 0) & i2) == i2;
    }

    private String getCheckedString() {
        int checked = getChecked();
        return checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE";
    }

    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    static String getExpandedStateSymbolicName(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    private SparseArray<WeakReference<ClickableSpan>> getOrCreateSpansFromViewTags(View view) {
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            return spansFromViewTags;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(com.waze.R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> getSpansFromViewTags(View view) {
        return (SparseArray) view.getTag(com.waze.R.id.tag_accessibility_clickable_spans);
    }

    private boolean hasSpans() {
        return !extrasIntList(SPANS_START_KEY).isEmpty();
    }

    private int idForClickableSpan(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = sClickableSpanId;
        sClickableSpanId = i3 + 1;
        return i3;
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrap(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.mInfo));
    }

    private void removeCollectedSpans(View view) {
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < spansFromViewTags.size(); i2++) {
                if (spansFromViewTags.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                spansFromViewTags.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void setBooleanProperty(int i2, boolean z) {
        Bundle extras = getExtras();
        if (extras != null) {
            int i3 = extras.getInt(BOOLEAN_PROPERTY_KEY, 0) & (~i2);
            if (true != z) {
                i2 = 0;
            }
            extras.putInt(BOOLEAN_PROPERTY_KEY, i2 | i3);
        }
    }

    public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj) {
        if (obj != null) {
            return new AccessibilityNodeInfoCompat(obj);
        }
        return null;
    }

    public void addAction(AccessibilityActionCompat accessibilityActionCompat) {
        this.mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
    }

    public void addChild(View view) {
        this.mInfo.addChild(view);
    }

    public void addLabeledBy(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 36) {
            Api36Impl.addLabeledBy(this.mInfo, view, i2);
        } else {
            setLabeledBy(view, i2);
        }
    }

    public void addSpansToExtras(CharSequence charSequence, View view) {
    }

    public boolean canOpenPopup() {
        return this.mInfo.canOpenPopup();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.mInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.mInfo)) {
            return false;
        }
        return this.mVirtualDescendantId == accessibilityNodeInfoCompat.mVirtualDescendantId && this.mParentVirtualDescendantId == accessibilityNodeInfoCompat.mParentVirtualDescendantId;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.mInfo.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(wrap(listFindAccessibilityNodeInfosByText.get(i2)));
        }
        return arrayList;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.mInfo.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(wrap(it.next()));
        }
        return arrayList;
    }

    public AccessibilityNodeInfoCompat findFocus(int i2) {
        return wrapNonNullInstance(this.mInfo.findFocus(i2));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i2) {
        return wrapNonNullInstance(this.mInfo.focusSearch(i2));
    }

    public List<AccessibilityActionCompat> getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.mInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i2)));
        }
        return arrayList;
    }

    @Deprecated
    public int getActions() {
        return this.mInfo.getActions();
    }

    public List<String> getAvailableExtraData() {
        return this.mInfo.getAvailableExtraData();
    }

    @Deprecated
    public void getBoundsInParent(Rect rect) {
        this.mInfo.getBoundsInParent(rect);
    }

    public void getBoundsInScreen(Rect rect) {
        this.mInfo.getBoundsInScreen(rect);
    }

    public void getBoundsInWindow(Rect rect) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 34) {
            Api34Impl.getBoundsInWindow(accessibilityNodeInfo, rect);
            return;
        }
        Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable(BOUNDS_IN_WINDOW_KEY);
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public int getChecked() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 36 ? Api36Impl.getChecked(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt(CHECKED_KEY, accessibilityNodeInfo.isChecked() ? 1 : 0);
    }

    public AccessibilityNodeInfoCompat getChild(int i2, int i3) {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.getChild(this.mInfo, i2, i3) : getChild(i2);
    }

    public int getChildCount() {
        return this.mInfo.getChildCount();
    }

    public CharSequence getClassName() {
        return this.mInfo.getClassName();
    }

    public CollectionInfoCompat getCollectionInfo() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.mInfo.getCollectionInfo();
        if (collectionInfo != null) {
            return new CollectionInfoCompat(collectionInfo);
        }
        return null;
    }

    public CollectionItemInfoCompat getCollectionItemInfo() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.mInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new CollectionItemInfoCompat(collectionItemInfo);
        }
        return null;
    }

    public CharSequence getContainerTitle() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 34 ? Api34Impl.getContainerTitle(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence(CONTAINER_TITLE_KEY);
    }

    public CharSequence getContentDescription() {
        return this.mInfo.getContentDescription();
    }

    public int getDrawingOrder() {
        return this.mInfo.getDrawingOrder();
    }

    public CharSequence getError() {
        return this.mInfo.getError();
    }

    public int getExpandedState() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 36 ? Api36Impl.getExpandedState(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt(EXPANDED_STATE_KEY, 0);
    }

    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getExtraRenderingInfo(this.mInfo);
        }
        return null;
    }

    public Bundle getExtras() {
        return this.mInfo.getExtras();
    }

    public CharSequence getHintText() {
        return this.mInfo.getHintText();
    }

    @Deprecated
    public Object getInfo() {
        return this.mInfo;
    }

    public int getInputType() {
        return this.mInfo.getInputType();
    }

    public AccessibilityNodeInfoCompat getLabelFor() {
        return wrapNonNullInstance(this.mInfo.getLabelFor());
    }

    @Deprecated
    public AccessibilityNodeInfoCompat getLabeledBy() {
        return wrapNonNullInstance(this.mInfo.getLabeledBy());
    }

    public List<AccessibilityNodeInfoCompat> getLabeledByList() {
        if (Build.VERSION.SDK_INT >= 36) {
            return Api36Impl.getLabeledByList(this.mInfo);
        }
        ArrayList arrayList = new ArrayList(1);
        AccessibilityNodeInfoCompat labeledBy = getLabeledBy();
        if (labeledBy != null) {
            arrayList.add(labeledBy);
        }
        return arrayList;
    }

    public int getLiveRegion() {
        return this.mInfo.getLiveRegion();
    }

    public int getMaxTextLength() {
        return this.mInfo.getMaxTextLength();
    }

    public long getMinDurationBetweenContentChangesMillis() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 34 ? Api34Impl.getMinDurationBetweenContentChangeMillis(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getLong(MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY);
    }

    public int getMovementGranularities() {
        return this.mInfo.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        return this.mInfo.getPackageName();
    }

    public CharSequence getPaneTitle() {
        return this.mInfo.getPaneTitle();
    }

    public AccessibilityNodeInfoCompat getParent(int i2) {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.getParent(this.mInfo, i2) : getParent();
    }

    public RangeInfoCompat getRangeInfo() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.mInfo.getRangeInfo();
        if (rangeInfo != null) {
            return new RangeInfoCompat(rangeInfo);
        }
        return null;
    }

    public CharSequence getRoleDescription() {
        return this.mInfo.getExtras().getCharSequence(ROLE_DESCRIPTION_KEY);
    }

    public SelectionCompat getSelection() {
        AccessibilityNodeInfo.Selection selection;
        int i2;
        if (!BuildCompat.isAtLeastB_1() || (selection = this.mInfo.getSelection()) == null) {
            return null;
        }
        int i3 = 0;
        if (this.mInfo.getExtras() != null) {
            int i4 = this.mInfo.getExtras().getInt(EXTRA_SELECTION_START_OFFSET_TYPE, 0);
            i2 = this.mInfo.getExtras().getInt(EXTRA_SELECTION_END_OFFSET_TYPE, 0);
            i3 = i4;
        } else {
            i2 = 0;
        }
        return new SelectionCompat(selection, i3, i2);
    }

    public CharSequence getStateDescription() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 30 ? Api30Impl.getStateDescription(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence(STATE_DESCRIPTION_KEY);
    }

    public StructuredDataInfoCompat getStructuredDataInfo() {
        AccessibilityNodeInfo.StructuredDataInfo structuredDataInfo;
        if (Build.VERSION.SDK_INT < 37 || (structuredDataInfo = Api37Impl.getStructuredDataInfo(this.mInfo)) == null || !NotificationCompat$Style$$ExternalSyntheticApiModelOutline2.m11653m((Object) structuredDataInfo)) {
            return null;
        }
        return new MathInfoCompat(NotificationCompat$Style$$ExternalSyntheticApiModelOutline2.m((Object) structuredDataInfo));
    }

    public CharSequence getSupplementalDescription() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 36 ? Api36Impl.getSupplementalDescription(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence(SUPPLEMENTAL_DESCRIPTION_KEY);
    }

    public CharSequence getText() {
        if (!hasSpans()) {
            return this.mInfo.getText();
        }
        List<Integer> listExtrasIntList = extrasIntList(SPANS_START_KEY);
        List<Integer> listExtrasIntList2 = extrasIntList(SPANS_END_KEY);
        List<Integer> listExtrasIntList3 = extrasIntList(SPANS_FLAGS_KEY);
        List<Integer> listExtrasIntList4 = extrasIntList(SPANS_ID_KEY);
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i2 = 0; i2 < listExtrasIntList.size(); i2++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(listExtrasIntList4.get(i2).intValue(), this, getExtras().getInt(SPANS_ACTION_ID_KEY)), listExtrasIntList.get(i2).intValue(), listExtrasIntList2.get(i2).intValue(), listExtrasIntList3.get(i2).intValue());
        }
        return spannableString;
    }

    public int getTextSelectionEnd() {
        return this.mInfo.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return this.mInfo.getTextSelectionStart();
    }

    public CharSequence getTooltipText() {
        return this.mInfo.getTooltipText();
    }

    public TouchDelegateInfoCompat getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = this.mInfo.getTouchDelegateInfo();
        if (touchDelegateInfo != null) {
            return new TouchDelegateInfoCompat(touchDelegateInfo);
        }
        return null;
    }

    public AccessibilityNodeInfoCompat getTraversalAfter() {
        return wrapNonNullInstance(this.mInfo.getTraversalAfter());
    }

    public AccessibilityNodeInfoCompat getTraversalBefore() {
        return wrapNonNullInstance(this.mInfo.getTraversalBefore());
    }

    public String getUniqueId() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 33 ? Api33Impl.getUniqueId(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString(UNIQUE_ID_KEY);
    }

    public String getViewIdResourceName() {
        return this.mInfo.getViewIdResourceName();
    }

    public AccessibilityWindowInfoCompat getWindow() {
        return AccessibilityWindowInfoCompat.wrapNonNullInstance(this.mInfo.getWindow());
    }

    public int getWindowId() {
        return this.mInfo.getWindowId();
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.hasRequestInitialAccessibilityFocus(this.mInfo) : getBooleanProperty(32);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.isAccessibilityDataSensitive(this.mInfo) : getBooleanProperty(64);
    }

    public boolean isAccessibilityFocused() {
        return this.mInfo.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return this.mInfo.isCheckable();
    }

    @Deprecated
    public boolean isChecked() {
        return this.mInfo.isChecked();
    }

    public boolean isClickable() {
        return this.mInfo.isClickable();
    }

    public boolean isContentInvalid() {
        return this.mInfo.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.mInfo.isContextClickable();
    }

    public boolean isDismissable() {
        return this.mInfo.isDismissable();
    }

    public boolean isEditable() {
        return this.mInfo.isEditable();
    }

    public boolean isEnabled() {
        return this.mInfo.isEnabled();
    }

    public boolean isFieldRequired() {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        return i2 >= 36 ? Api36Impl.isFieldRequired(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean(IS_REQUIRED_KEY);
    }

    public boolean isFocusable() {
        return this.mInfo.isFocusable();
    }

    public boolean isFocused() {
        return this.mInfo.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return getBooleanProperty(67108864);
    }

    public boolean isHeading() {
        return this.mInfo.isHeading();
    }

    public boolean isImportantForAccessibility() {
        return this.mInfo.isImportantForAccessibility();
    }

    public boolean isLongClickable() {
        return this.mInfo.isLongClickable();
    }

    public boolean isMultiLine() {
        return this.mInfo.isMultiLine();
    }

    public boolean isPassword() {
        return this.mInfo.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return this.mInfo.isScreenReaderFocusable();
    }

    public boolean isScrollable() {
        return this.mInfo.isScrollable();
    }

    public boolean isSelected() {
        return this.mInfo.isSelected();
    }

    public boolean isShowingHintText() {
        return this.mInfo.isShowingHintText();
    }

    public boolean isTextEntryKey() {
        return this.mInfo.isTextEntryKey();
    }

    public boolean isTextSelectable() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.isTextSelectable(this.mInfo) : getBooleanProperty(8388608);
    }

    public boolean isVisibleToUser() {
        return this.mInfo.isVisibleToUser();
    }

    public boolean performAction(int i2) {
        return this.mInfo.performAction(i2);
    }

    @Deprecated
    public void recycle() {
    }

    public boolean refresh() {
        return this.mInfo.refresh();
    }

    public boolean removeAction(AccessibilityActionCompat accessibilityActionCompat) {
        return this.mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
    }

    public boolean removeChild(View view) {
        return this.mInfo.removeChild(view);
    }

    public boolean removeLabeledBy(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 36) {
            return Api36Impl.removeLabeledBy(this.mInfo, view, i2);
        }
        return false;
    }

    public void setAccessibilityDataSensitive(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setAccessibilityDataSensitive(this.mInfo, z);
        } else {
            setBooleanProperty(64, z);
        }
    }

    public void setAccessibilityFocused(boolean z) {
        this.mInfo.setAccessibilityFocused(z);
    }

    public void setAvailableExtraData(List<String> list) {
        this.mInfo.setAvailableExtraData(list);
    }

    @Deprecated
    public void setBoundsInParent(Rect rect) {
        this.mInfo.setBoundsInParent(rect);
    }

    public void setBoundsInScreen(Rect rect) {
        this.mInfo.setBoundsInScreen(rect);
    }

    public void setBoundsInWindow(Rect rect) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 34) {
            Api34Impl.setBoundsInWindow(accessibilityNodeInfo, rect);
        } else {
            accessibilityNodeInfo.getExtras().putParcelable(BOUNDS_IN_WINDOW_KEY, rect);
        }
    }

    public void setCanOpenPopup(boolean z) {
        this.mInfo.setCanOpenPopup(z);
    }

    public void setCheckable(boolean z) {
        this.mInfo.setCheckable(z);
    }

    public void setChecked(int i2) {
        if (Build.VERSION.SDK_INT >= 36) {
            Api36Impl.setChecked(this.mInfo, i2);
            return;
        }
        if (i2 == 1 || i2 == 2 || i2 == 0) {
            this.mInfo.setChecked(i2 == 1);
            this.mInfo.getExtras().putInt(CHECKED_KEY, i2);
        } else {
            throw new IllegalArgumentException("Unknown checked argument: " + i2);
        }
    }

    public void setClassName(CharSequence charSequence) {
        this.mInfo.setClassName(charSequence);
    }

    public void setClickable(boolean z) {
        this.mInfo.setClickable(z);
    }

    public void setCollectionInfo(Object obj) {
        this.mInfo.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).mInfo);
    }

    public void setCollectionItemInfo(Object obj) {
        this.mInfo.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).mInfo);
    }

    public void setContainerTitle(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 34) {
            Api34Impl.setContainerTitle(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence(CONTAINER_TITLE_KEY, charSequence);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.mInfo.setContentDescription(charSequence);
    }

    public void setContentInvalid(boolean z) {
        this.mInfo.setContentInvalid(z);
    }

    public void setContextClickable(boolean z) {
        this.mInfo.setContextClickable(z);
    }

    public void setDismissable(boolean z) {
        this.mInfo.setDismissable(z);
    }

    public void setDrawingOrder(int i2) {
        this.mInfo.setDrawingOrder(i2);
    }

    public void setEditable(boolean z) {
        this.mInfo.setEditable(z);
    }

    public void setEnabled(boolean z) {
        this.mInfo.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        this.mInfo.setError(charSequence);
    }

    public void setExpandedState(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i3 >= 36) {
            Api36Impl.setExpandedState(accessibilityNodeInfo, i2);
        } else {
            accessibilityNodeInfo.getExtras().putInt(EXPANDED_STATE_KEY, i2);
        }
    }

    public void setFieldRequired(boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 36) {
            Api36Impl.setFieldRequired(accessibilityNodeInfo, z);
        } else {
            accessibilityNodeInfo.getExtras().putBoolean(IS_REQUIRED_KEY, z);
        }
    }

    public void setFocusable(boolean z) {
        this.mInfo.setFocusable(z);
    }

    public void setFocused(boolean z) {
        this.mInfo.setFocused(z);
    }

    public void setGranularScrollingSupported(boolean z) {
        setBooleanProperty(67108864, z);
    }

    public void setHeading(boolean z) {
        this.mInfo.setHeading(z);
    }

    public void setHintText(CharSequence charSequence) {
        this.mInfo.setHintText(charSequence);
    }

    public void setImportantForAccessibility(boolean z) {
        this.mInfo.setImportantForAccessibility(z);
    }

    public void setInputType(int i2) {
        this.mInfo.setInputType(i2);
    }

    public void setLabelFor(View view) {
        this.mInfo.setLabelFor(view);
    }

    @Deprecated
    public void setLabeledBy(View view) {
        this.mInfo.setLabeledBy(view);
    }

    public void setLiveRegion(int i2) {
        this.mInfo.setLiveRegion(i2);
    }

    public void setLongClickable(boolean z) {
        this.mInfo.setLongClickable(z);
    }

    public void setMaxTextLength(int i2) {
        this.mInfo.setMaxTextLength(i2);
    }

    public void setMinDurationBetweenContentChangesMillis(long j2) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 34) {
            Api34Impl.setMinDurationBetweenContentChangeMillis(accessibilityNodeInfo, j2);
        } else {
            accessibilityNodeInfo.getExtras().putLong(MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY, j2);
        }
    }

    public void setMovementGranularities(int i2) {
        this.mInfo.setMovementGranularities(i2);
    }

    public void setMultiLine(boolean z) {
        this.mInfo.setMultiLine(z);
    }

    public void setPackageName(CharSequence charSequence) {
        this.mInfo.setPackageName(charSequence);
    }

    public void setPaneTitle(CharSequence charSequence) {
        this.mInfo.setPaneTitle(charSequence);
    }

    public void setParent(View view) {
        this.mParentVirtualDescendantId = -1;
        this.mInfo.setParent(view);
    }

    public void setPassword(boolean z) {
        this.mInfo.setPassword(z);
    }

    public void setQueryFromAppProcessEnabled(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setQueryFromAppProcessEnabled(this.mInfo, view, z);
        }
    }

    public void setRangeInfo(RangeInfoCompat rangeInfoCompat) {
        this.mInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) rangeInfoCompat.mInfo);
    }

    public void setRequestInitialAccessibilityFocus(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setRequestInitialAccessibilityFocus(this.mInfo, z);
        } else {
            setBooleanProperty(32, z);
        }
    }

    public void setRoleDescription(CharSequence charSequence) {
        this.mInfo.getExtras().putCharSequence(ROLE_DESCRIPTION_KEY, charSequence);
    }

    public void setScreenReaderFocusable(boolean z) {
        this.mInfo.setScreenReaderFocusable(z);
    }

    public void setScrollable(boolean z) {
        this.mInfo.setScrollable(z);
    }

    public void setSelected(boolean z) {
        this.mInfo.setSelected(z);
    }

    public void setSelection(SelectionCompat selectionCompat) {
        if (BuildCompat.isAtLeastB_1()) {
            if (selectionCompat == null || selectionCompat.unwrap() == null) {
                this.mInfo.setSelection(null);
                if (this.mInfo.getExtras() != null) {
                    this.mInfo.getExtras().remove(EXTRA_SELECTION_START_OFFSET_TYPE);
                    this.mInfo.getExtras().remove(EXTRA_SELECTION_END_OFFSET_TYPE);
                    return;
                }
                return;
            }
            this.mInfo.setSelection(selectionCompat.unwrap());
            SelectionPositionCompat start = selectionCompat.getStart();
            SelectionPositionCompat end = selectionCompat.getEnd();
            if (start == null || end == null) {
                return;
            }
            this.mInfo.getExtras().putInt(EXTRA_SELECTION_START_OFFSET_TYPE, start.getOffsetType());
            this.mInfo.getExtras().putInt(EXTRA_SELECTION_END_OFFSET_TYPE, end.getOffsetType());
        }
    }

    public void setShowingHintText(boolean z) {
        this.mInfo.setShowingHintText(z);
    }

    public void setSource(View view) {
        this.mVirtualDescendantId = -1;
        this.mInfo.setSource(view);
    }

    public void setStateDescription(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 30) {
            Api30Impl.setStateDescription(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence(STATE_DESCRIPTION_KEY, charSequence);
        }
    }

    public void setStructuredDataInfo(StructuredDataInfoCompat structuredDataInfoCompat) {
        if (Build.VERSION.SDK_INT >= 37) {
            Api37Impl.setStructuredDataInfo(this.mInfo, structuredDataInfoCompat == null ? null : structuredDataInfoCompat.mStructuredDataInfo);
        }
    }

    public void setSupplementalDescription(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 36) {
            Api36Impl.setSupplementalDescription(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence(SUPPLEMENTAL_DESCRIPTION_KEY, charSequence);
        }
    }

    public void setText(CharSequence charSequence) {
        this.mInfo.setText(charSequence);
    }

    public void setTextEntryKey(boolean z) {
        this.mInfo.setTextEntryKey(z);
    }

    public void setTextSelectable(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setTextSelectable(this.mInfo, z);
        } else {
            setBooleanProperty(8388608, z);
        }
    }

    public void setTextSelection(int i2, int i3) {
        this.mInfo.setTextSelection(i2, i3);
    }

    public void setTooltipText(CharSequence charSequence) {
        this.mInfo.setTooltipText(charSequence);
    }

    public void setTouchDelegateInfo(TouchDelegateInfoCompat touchDelegateInfoCompat) {
        this.mInfo.setTouchDelegateInfo(touchDelegateInfoCompat.mInfo);
    }

    public void setTraversalAfter(View view) {
        this.mInfo.setTraversalAfter(view);
    }

    public void setTraversalBefore(View view) {
        this.mInfo.setTraversalBefore(view);
    }

    public void setUniqueId(String str) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i2 >= 33) {
            Api33Impl.setUniqueId(accessibilityNodeInfo, str);
        } else {
            accessibilityNodeInfo.getExtras().putString(UNIQUE_ID_KEY, str);
        }
    }

    public void setViewIdResourceName(String str) {
        this.mInfo.setViewIdResourceName(str);
    }

    public void setVisibleToUser(boolean z) {
        this.mInfo.setVisibleToUser(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        getBoundsInScreen(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        getBoundsInWindow(rect);
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(getPackageName());
        sb.append("; className: ");
        sb.append(getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(getError());
        sb.append("; maxTextLength: ");
        sb.append(getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(getSupplementalDescription());
        sb.append("; tooltipText: ");
        sb.append(getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(getUniqueId());
        sb.append("; checkable: ");
        sb.append(isCheckable());
        sb.append("; checked: ");
        sb.append(getCheckedString());
        sb.append("; fieldRequired: ");
        sb.append(isFieldRequired());
        sb.append("; focusable: ");
        sb.append(isFocusable());
        sb.append("; focused: ");
        sb.append(isFocused());
        sb.append("; selected: ");
        sb.append(isSelected());
        sb.append("; clickable: ");
        sb.append(isClickable());
        sb.append("; longClickable: ");
        sb.append(isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(isContextClickable());
        sb.append("; expandedState: ");
        sb.append(getExpandedStateSymbolicName(getExpandedState()));
        sb.append("; enabled: ");
        sb.append(isEnabled());
        sb.append("; password: ");
        sb.append(isPassword());
        sb.append("; scrollable: " + isScrollable());
        sb.append("; containerTitle: ");
        sb.append(getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        sb.append(isGranularScrollingSupported());
        sb.append("; importantForAccessibility: ");
        sb.append(isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(isAccessibilityDataSensitive());
        sb.append("; [");
        List<AccessibilityActionCompat> actionList = getActionList();
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            AccessibilityActionCompat accessibilityActionCompat = actionList.get(i2);
            String actionSymbolicName = getActionSymbolicName(accessibilityActionCompat.getId());
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && accessibilityActionCompat.getLabel() != null) {
                actionSymbolicName = accessibilityActionCompat.getLabel().toString();
            }
            sb.append(actionSymbolicName);
            if (i2 != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        return this.mInfo;
    }

    public void addChild(View view, int i2) {
        this.mInfo.addChild(view, i2);
    }

    public void setLabelFor(View view, int i2) {
        this.mInfo.setLabelFor(view, i2);
    }

    @Deprecated
    public void setLabeledBy(View view, int i2) {
        this.mInfo.setLabeledBy(view, i2);
    }

    public void setTraversalAfter(View view, int i2) {
        this.mInfo.setTraversalAfter(view, i2);
    }

    public void setTraversalBefore(View view, int i2) {
        this.mInfo.setTraversalBefore(view, i2);
    }

    public boolean performAction(int i2, Bundle bundle) {
        return this.mInfo.performAction(i2, bundle);
    }

    public boolean removeChild(View view, int i2) {
        return this.mInfo.removeChild(view, i2);
    }

    /* compiled from: WazeSource */
    public class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public static final int UNDEFINED = -1;
        final Object mInfo;

        /* compiled from: WazeSource */
        public final class Builder {
            private int mSelectionMode;
            private int mRowCount = 0;
            private int mColumnCount = 0;
            private boolean mHierarchical = false;
            private int mItemCount = -1;
            private int mImportantForAccessibilityItemCount = -1;

            public CollectionInfoCompat build() {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = this.mRowCount;
                return i2 >= 35 ? Api35Impl.buildCollectionInfoCompat(i3, this.mColumnCount, this.mHierarchical, this.mSelectionMode, this.mItemCount, this.mImportantForAccessibilityItemCount) : CollectionInfoCompat.obtain(i3, this.mColumnCount, this.mHierarchical, this.mSelectionMode);
            }

            public Builder setColumnCount(int i2) {
                this.mColumnCount = i2;
                return this;
            }

            public Builder setHierarchical(boolean z) {
                this.mHierarchical = z;
                return this;
            }

            public Builder setImportantForAccessibilityItemCount(int i2) {
                this.mImportantForAccessibilityItemCount = i2;
                return this;
            }

            public Builder setItemCount(int i2) {
                this.mItemCount = i2;
                return this;
            }

            public Builder setRowCount(int i2) {
                this.mRowCount = i2;
                return this;
            }

            public Builder setSelectionMode(int i2) {
                this.mSelectionMode = i2;
                return this;
            }
        }

        CollectionInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static CollectionInfoCompat obtain(int i2, int i3, boolean z) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z));
        }

        public int getColumnCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).getColumnCount();
        }

        public int getImportantForAccessibilityItemCount() {
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Impl.getImportantForAccessibilityItemCount(this.mInfo);
            }
            return -1;
        }

        public int getItemCount() {
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Impl.getItemCount(this.mInfo);
            }
            return -1;
        }

        public int getRowCount() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).getRowCount();
        }

        public int getSelectionMode() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).getSelectionMode();
        }

        public boolean isHierarchical() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).isHierarchical();
        }

        public static CollectionInfoCompat obtain(int i2, int i3, boolean z, int i4) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4));
        }
    }

    /* compiled from: WazeSource */
    public class CollectionItemInfoCompat {
        public static final int SORT_DIRECTION_ASCENDING = 1;
        public static final int SORT_DIRECTION_DESCENDING = 2;
        public static final int SORT_DIRECTION_NONE = 0;
        public static final int SORT_DIRECTION_OTHER = 3;
        final Object mInfo;

        /* compiled from: WazeSource */
        public final class Builder {
            private int mColumnIndex;
            private int mColumnSpan;
            private String mColumnTitle;
            private boolean mHeading;
            private int mRowIndex;
            private int mRowSpan;
            private String mRowTitle;
            private boolean mSelected;
            private int mSortDirection;

            public CollectionItemInfoCompat build() {
                return BuildCompat.isAtLeastB_1() ? Api36MinorImpl.buildCollectionItemInfoCompat(this.mHeading, this.mColumnIndex, this.mRowIndex, this.mColumnSpan, this.mRowSpan, this.mSelected, this.mRowTitle, this.mColumnTitle, this.mSortDirection) : Build.VERSION.SDK_INT >= 33 ? Api33Impl.buildCollectionItemInfoCompat(this.mHeading, this.mColumnIndex, this.mRowIndex, this.mColumnSpan, this.mRowSpan, this.mSelected, this.mRowTitle, this.mColumnTitle) : new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(this.mRowIndex, this.mRowSpan, this.mColumnIndex, this.mColumnSpan, this.mHeading, this.mSelected));
            }

            public Builder setColumnIndex(int i2) {
                this.mColumnIndex = i2;
                return this;
            }

            public Builder setColumnSpan(int i2) {
                this.mColumnSpan = i2;
                return this;
            }

            public Builder setColumnTitle(String str) {
                this.mColumnTitle = str;
                return this;
            }

            public Builder setHeading(boolean z) {
                this.mHeading = z;
                return this;
            }

            public Builder setRowIndex(int i2) {
                this.mRowIndex = i2;
                return this;
            }

            public Builder setRowSpan(int i2) {
                this.mRowSpan = i2;
                return this;
            }

            public Builder setRowTitle(String str) {
                this.mRowTitle = str;
                return this;
            }

            public Builder setSelected(boolean z) {
                this.mSelected = z;
                return this;
            }

            public Builder setSortDirection(int i2) {
                this.mSortDirection = i2;
                return this;
            }
        }

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface SortDirection {
        }

        CollectionItemInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static CollectionItemInfoCompat obtain(int i2, int i3, int i4, int i5, boolean z) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z));
        }

        public int getColumnIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getColumnIndex();
        }

        public int getColumnSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getColumnSpan();
        }

        public String getColumnTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return Api33Impl.getCollectionItemColumnTitle(this.mInfo);
            }
            return null;
        }

        public int getRowIndex() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getRowIndex();
        }

        public int getRowSpan() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getRowSpan();
        }

        public String getRowTitle() {
            if (Build.VERSION.SDK_INT >= 33) {
                return Api33Impl.getCollectionItemRowTitle(this.mInfo);
            }
            return null;
        }

        public int getSortDirection() {
            if (BuildCompat.isAtLeastB_1()) {
                return Api36MinorImpl.getCollectionItemSortDirection(this.mInfo);
            }
            return 0;
        }

        @Deprecated
        public boolean isHeading() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).isHeading();
        }

        public boolean isSelected() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).isSelected();
        }

        public static CollectionItemInfoCompat obtain(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2));
        }
    }

    public void setParent(View view, int i2) {
        this.mParentVirtualDescendantId = i2;
        this.mInfo.setParent(view, i2);
    }

    public void setSource(View view, int i2) {
        this.mVirtualDescendantId = i2;
        this.mInfo.setSource(view, i2);
    }

    /* compiled from: WazeSource */
    public final class TouchDelegateInfoCompat {
        final AccessibilityNodeInfo.TouchDelegateInfo mInfo;

        public TouchDelegateInfoCompat(Map<Region, View> map) {
            this.mInfo = new AccessibilityNodeInfo.TouchDelegateInfo(map);
        }

        public Region getRegionAt(int i2) {
            return this.mInfo.getRegionAt(i2);
        }

        public int getRegionCount() {
            return this.mInfo.getRegionCount();
        }

        public AccessibilityNodeInfoCompat getTargetForRegion(Region region) {
            AccessibilityNodeInfo targetForRegion = this.mInfo.getTargetForRegion(region);
            if (targetForRegion != null) {
                return AccessibilityNodeInfoCompat.wrap(targetForRegion);
            }
            return null;
        }

        TouchDelegateInfoCompat(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.mInfo = touchDelegateInfo;
        }
    }

    public void addAction(int i2) {
        this.mInfo.addAction(i2);
    }

    public static AccessibilityNodeInfoCompat obtain(View view) {
        return wrap(AccessibilityNodeInfo.obtain(view));
    }

    /* compiled from: WazeSource */
    public final class SelectionPositionCompat {
        public static final int OFFSET_TYPE_CHILD = 1;
        public static final int OFFSET_TYPE_TEXT = 0;
        final int mOffsetType;
        final AccessibilityNodeInfo.SelectionPosition mPosition;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface OffsetType {
        }

        public SelectionPositionCompat(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
            this(BuildCompat.isAtLeastB_1() ? new AccessibilityNodeInfo.SelectionPosition(accessibilityNodeInfoCompat.unwrap(), i2) : null, 0);
        }

        public boolean equals(Object obj) {
            if (!BuildCompat.isAtLeastB_1()) {
                return this == obj;
            }
            if (!(obj instanceof SelectionPositionCompat)) {
                return false;
            }
            SelectionPositionCompat selectionPositionCompat = (SelectionPositionCompat) obj;
            AccessibilityNodeInfo.SelectionPosition selectionPosition = this.mPosition;
            return selectionPosition != null && selectionPosition.equals(selectionPositionCompat.mPosition) && this.mOffsetType == selectionPositionCompat.mOffsetType;
        }

        public AccessibilityNodeInfoCompat getNode() {
            if (BuildCompat.isAtLeastB_1()) {
                return AccessibilityNodeInfoCompat.wrap(this.mPosition.getNode());
            }
            return null;
        }

        public int getOffset() {
            if (BuildCompat.isAtLeastB_1()) {
                return this.mPosition.getOffset();
            }
            return -1;
        }

        public int getOffsetType() {
            return this.mOffsetType;
        }

        public View getView() {
            if (Build.VERSION.SDK_INT >= 37) {
                return Api37Impl.getView(this.mPosition);
            }
            return null;
        }

        public int getVirtualDescendantId() {
            if (Build.VERSION.SDK_INT >= 37) {
                return Api37Impl.getVirtualDescendantId(this.mPosition);
            }
            return -1;
        }

        public int hashCode() {
            if (!BuildCompat.isAtLeastB_1()) {
                return 0;
            }
            AccessibilityNodeInfo.SelectionPosition selectionPosition = this.mPosition;
            return ((selectionPosition != null ? selectionPosition.hashCode() : 0) * 31) + this.mOffsetType;
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private AccessibilityNodeInfoCompat mNode;
            private final int mOffset;
            private int mOffsetType;
            private View mView;
            private int mVirtualDescendantId;

            public Builder(View view, int i2) {
                this.mVirtualDescendantId = -1;
                this.mOffsetType = 0;
                this.mView = view;
                this.mOffset = i2;
            }

            public SelectionPositionCompat build() {
                return new SelectionPositionCompat(BuildCompat.isAtLeastB_1() ? this.mNode != null ? new AccessibilityNodeInfo.SelectionPosition(this.mNode.unwrap(), this.mOffset) : this.mVirtualDescendantId != -1 ? new AccessibilityNodeInfo.SelectionPosition(this.mView, this.mVirtualDescendantId, this.mOffset) : new AccessibilityNodeInfo.SelectionPosition(this.mView, this.mOffset) : null, this.mOffsetType);
            }

            public Builder setOffsetType(int i2) {
                if (i2 == 0 || i2 == 1) {
                    this.mOffsetType = i2;
                    return this;
                }
                throw new IllegalArgumentException("Unknown offsetType: " + i2);
            }

            public Builder(View view, int i2, int i3) {
                this.mOffsetType = 0;
                this.mView = view;
                this.mVirtualDescendantId = i2;
                this.mOffset = i3;
            }

            public Builder(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
                this.mVirtualDescendantId = -1;
                this.mOffsetType = 0;
                this.mNode = accessibilityNodeInfoCompat;
                this.mOffset = i2;
            }
        }

        public SelectionPositionCompat(View view, int i2, int i3) {
            this(BuildCompat.isAtLeastB_1() ? new AccessibilityNodeInfo.SelectionPosition(view, i2, i3) : null, 0);
        }

        public SelectionPositionCompat(AccessibilityNodeInfo.SelectionPosition selectionPosition) {
            this(selectionPosition, 0);
        }

        SelectionPositionCompat(AccessibilityNodeInfo.SelectionPosition selectionPosition, int i2) {
            this.mPosition = true != BuildCompat.isAtLeastB_1() ? null : selectionPosition;
            this.mOffsetType = i2;
        }

        public SelectionPositionCompat(View view, int i2) {
            this(BuildCompat.isAtLeastB_1() ? new AccessibilityNodeInfo.SelectionPosition(view, i2) : null, 0);
        }
    }

    public static AccessibilityNodeInfoCompat obtain(View view, int i2) {
        return wrapNonNullInstance(AccessibilityNodeInfo.obtain(view, i2));
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.mInfo = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return wrap(AccessibilityNodeInfo.obtain());
    }

    /* compiled from: WazeSource */
    public class MathInfoCompat extends StructuredDataInfoCompat {
        public static final String MATH_ATTRIBUTE_ARG = "arg";
        public static final String MATH_ATTRIBUTE_INTENT = "intent";
        public static final String MATH_TAG_FRACTION = "mfrac";
        public static final String MATH_TAG_IDENTIFIER = "mi";
        public static final String MATH_TAG_MATH = "math";
        public static final String MATH_TAG_MULTISCRIPTS = "mmultiscripts";
        public static final String MATH_TAG_NONE_SCRIPT = "none";
        public static final String MATH_TAG_NUMBER = "mn";
        public static final String MATH_TAG_OPERATOR = "mo";
        public static final String MATH_TAG_OVER = "mover";
        public static final String MATH_TAG_PRESCRIPT_DELIMITER = "mprescripts";
        public static final String MATH_TAG_ROOT = "mroot";
        public static final String MATH_TAG_ROW = "mrow";
        public static final String MATH_TAG_SQUARE_ROOT = "msqrt";
        public static final String MATH_TAG_STRING_LITERAL = "ms";
        public static final String MATH_TAG_SUB = "msub";
        public static final String MATH_TAG_SUB_SUP = "msubsup";
        public static final String MATH_TAG_SUP = "msup";
        public static final String MATH_TAG_TABLE = "mtable";
        public static final String MATH_TAG_TABLE_CELL = "mtd";
        public static final String MATH_TAG_TABLE_ROW = "mtr";
        public static final String MATH_TAG_TEXT = "mtext";
        public static final String MATH_TAG_UNDER = "munder";
        public static final String MATH_TAG_UNDER_OVER = "munderover";

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface MathAttribute {
        }

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface MathTag {
        }

        public MathInfoCompat(String str) {
            super(Build.VERSION.SDK_INT >= 37 ? Api37Impl.createMathInfo(str) : null);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.StructuredDataInfoCompat
        public String getAttribute(String str) {
            return super.getAttribute(str);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.StructuredDataInfoCompat
        public String getTag() {
            return super.getTag();
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.StructuredDataInfoCompat
        public void putAttribute(String str, String str2) {
            super.putAttribute(str, str2);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeInfoCompat.StructuredDataInfoCompat
        public void removeAttribute(String str) {
            super.removeAttribute(str);
        }

        public MathInfoCompat(AccessibilityNodeInfo.MathInfo mathInfo) {
            super(Build.VERSION.SDK_INT < 37 ? null : mathInfo);
        }
    }

    public boolean removeLabeledBy(View view) {
        return removeLabeledBy(view, -1);
    }

    public void addLabeledBy(View view) {
        addLabeledBy(view, -1);
    }

    /* compiled from: WazeSource */
    public class AccessibilityActionCompat {
        public static final AccessibilityActionCompat ACTION_DRAG_CANCEL;
        public static final AccessibilityActionCompat ACTION_DRAG_DROP;
        public static final AccessibilityActionCompat ACTION_DRAG_START;
        public static final AccessibilityActionCompat ACTION_IME_ENTER;
        public static final AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
        public static final AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION;
        public static final AccessibilityActionCompat ACTION_SET_EXTENDED_SELECTION;
        public static final AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS;
        private static final String TAG = "A11yActionCompat";
        final Object mAction;
        protected final AccessibilityViewCommand mCommand;
        private final int mId;
        private final Class<? extends AccessibilityViewCommand.CommandArguments> mViewCommandArgumentClass;
        public static final AccessibilityActionCompat ACTION_FOCUS = new AccessibilityActionCompat(1, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
        public static final AccessibilityActionCompat ACTION_SELECT = new AccessibilityActionCompat(4, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
        public static final AccessibilityActionCompat ACTION_CLICK = new AccessibilityActionCompat(16, null);
        public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, null);
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, null);
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, null);
        public static final AccessibilityActionCompat ACTION_COPY = new AccessibilityActionCompat(16384, null);
        public static final AccessibilityActionCompat ACTION_PASTE = new AccessibilityActionCompat(32768, null);
        public static final AccessibilityActionCompat ACTION_CUT = new AccessibilityActionCompat(65536, null);
        public static final AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityActionCompat(131072, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.SetSelectionArguments.class);
        public static final AccessibilityActionCompat ACTION_EXPAND = new AccessibilityActionCompat(262144, null);
        public static final AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityActionCompat(524288, null);
        public static final AccessibilityActionCompat ACTION_DISMISS = new AccessibilityActionCompat(1048576, null);
        public static final AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityActionCompat(2097152, (CharSequence) null, (Class<? extends AccessibilityViewCommand.CommandArguments>) AccessibilityViewCommand.SetTextArguments.class);
        public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
        public static final AccessibilityActionCompat ACTION_SCROLL_UP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        public static final AccessibilityActionCompat ACTION_PAGE_UP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        public static final AccessibilityActionCompat ACTION_PAGE_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        public static final AccessibilityActionCompat ACTION_PAGE_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        public static final AccessibilityActionCompat ACTION_PAGE_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        public static final AccessibilityActionCompat ACTION_SET_PROGRESS = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
        public static final AccessibilityActionCompat ACTION_MOVE_WINDOW = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
        public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);

        static {
            ACTION_PRESS_AND_HOLD = new AccessibilityActionCompat(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            ACTION_IME_ENTER = new AccessibilityActionCompat(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            ACTION_DRAG_START = new AccessibilityActionCompat(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            ACTION_DRAG_DROP = new AccessibilityActionCompat(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            ACTION_DRAG_CANCEL = new AccessibilityActionCompat(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            ACTION_SHOW_TEXT_SUGGESTIONS = new AccessibilityActionCompat(Build.VERSION.SDK_INT >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            ACTION_SCROLL_IN_DIRECTION = new AccessibilityActionCompat(Build.VERSION.SDK_INT >= 34 ? Api34Impl.getActionScrollInDirection() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
            ACTION_SET_EXTENDED_SELECTION = new AccessibilityActionCompat(BuildCompat.isAtLeastB_1() ? Api36MinorImpl.getActionSetExtendedSelection() : null, R.id.ALT, null, null, null);
        }

        AccessibilityActionCompat(Object obj, int i2, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this.mId = i2;
            this.mCommand = accessibilityViewCommand;
            this.mAction = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
            this.mViewCommandArgumentClass = cls;
        }

        public AccessibilityActionCompat createReplacementAction(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new AccessibilityActionCompat(null, this.mId, charSequence, accessibilityViewCommand, this.mViewCommandArgumentClass);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.mAction;
            return obj2 == null ? accessibilityActionCompat.mAction == null : obj2.equals(accessibilityActionCompat.mAction);
        }

        public int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.mAction).getId();
        }

        public CharSequence getLabel() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.mAction).getLabel();
        }

        public int hashCode() {
            Object obj = this.mAction;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean perform(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            AccessibilityViewCommand.CommandArguments commandArgumentsNewInstance;
            if (this.mCommand == null) {
                return false;
            }
            Class<? extends AccessibilityViewCommand.CommandArguments> cls = this.mViewCommandArgumentClass;
            AccessibilityViewCommand.CommandArguments commandArguments = null;
            if (cls != null) {
                try {
                    commandArgumentsNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    commandArgumentsNewInstance.setBundle(bundle);
                    commandArguments = commandArgumentsNewInstance;
                } catch (Exception e3) {
                    e = e3;
                    commandArguments = commandArgumentsNewInstance;
                    Class<? extends AccessibilityViewCommand.CommandArguments> cls2 = this.mViewCommandArgumentClass;
                    Log.e(TAG, "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                    return this.mCommand.perform(view, commandArguments);
                }
            }
            return this.mCommand.perform(view, commandArguments);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String actionSymbolicName = AccessibilityNodeInfoCompat.getActionSymbolicName(this.mId);
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && getLabel() != null) {
                actionSymbolicName = getLabel().toString();
            }
            sb.append(actionSymbolicName);
            return sb.toString();
        }

        public AccessibilityActionCompat(int i2, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i2, charSequence, accessibilityViewCommand, null);
        }

        private AccessibilityActionCompat(int i2, CharSequence charSequence, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this(null, i2, charSequence, null, cls);
        }

        AccessibilityActionCompat(Object obj) {
            this(obj, 0, null, null, null);
        }

        public AccessibilityActionCompat(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }
    }

    public AccessibilityNodeInfoCompat getChild(int i2) {
        return wrapNonNullInstance(this.mInfo.getChild(i2));
    }

    public AccessibilityNodeInfoCompat getParent() {
        return wrapNonNullInstance(this.mInfo.getParent());
    }

    /* compiled from: WazeSource */
    public class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        final Object mInfo;

        public RangeInfoCompat(int i2, float f2, float f3, float f4) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mInfo = Api30Impl.createRangeInfo(i2, f2, f3, f4);
            } else {
                this.mInfo = AccessibilityNodeInfo.RangeInfo.obtain(i2, f2, f3, f4);
            }
        }

        public static RangeInfoCompat obtain(int i2, float f2, float f3, float f4) {
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(i2, f2, f3, f4));
        }

        public float getCurrent() {
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getCurrent();
        }

        public float getMax() {
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getMax();
        }

        public float getMin() {
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getMin();
        }

        public int getType() {
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getType();
        }

        RangeInfoCompat(Object obj) {
            this.mInfo = obj;
        }
    }

    @Deprecated
    public void setChecked(boolean z) {
        this.mInfo.setChecked(z);
    }

    /* compiled from: WazeSource */
    public final class SelectionCompat {
        private final SelectionPositionCompat mEnd;
        private final AccessibilityNodeInfo.Selection mSelection;
        private final SelectionPositionCompat mStart;

        public SelectionCompat(Bundle bundle) {
            if (!BuildCompat.isAtLeastB_1()) {
                this.mSelection = null;
                this.mStart = null;
                this.mEnd = null;
                return;
            }
            if (!bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_PARCELABLE)) {
                throw new IllegalArgumentException("Bundle must contain android.view.accessibility.action.ARGUMENT_SELECTION_PARCELABLE");
            }
            AccessibilityNodeInfo.Selection selectionM = n$$ExternalSyntheticApiModelOutline0.m(bundle.getParcelable(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_PARCELABLE));
            this.mSelection = selectionM;
            int i2 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_SELECTION_START_OFFSET_TYPE, 0);
            int i3 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_SELECTION_END_OFFSET_TYPE, 0);
            if (i2 != 0 && i2 != 1) {
                throw new IllegalArgumentException("Unknown start offset type: " + i2);
            }
            if (i3 != 0 && i3 != 1) {
                throw new IllegalArgumentException("Unknown end offset type: " + i3);
            }
            if (selectionM != null) {
                this.mStart = new SelectionPositionCompat(selectionM.getStart(), i2);
                this.mEnd = new SelectionPositionCompat(selectionM.getEnd(), i3);
            } else {
                this.mStart = null;
                this.mEnd = null;
            }
        }

        public boolean equals(Object obj) {
            if (!BuildCompat.isAtLeastB_1()) {
                return this == obj;
            }
            if (!(obj instanceof SelectionCompat)) {
                return false;
            }
            SelectionCompat selectionCompat = (SelectionCompat) obj;
            SelectionPositionCompat selectionPositionCompat = this.mStart;
            if (selectionPositionCompat == null ? selectionCompat.mStart == null : selectionPositionCompat.equals(selectionCompat.mStart)) {
                SelectionPositionCompat selectionPositionCompat2 = this.mEnd;
                if (selectionPositionCompat2 == null ? selectionCompat.mEnd == null : selectionPositionCompat2.equals(selectionCompat.mEnd)) {
                    return true;
                }
            }
            return false;
        }

        public SelectionPositionCompat getEnd() {
            return this.mEnd;
        }

        public SelectionPositionCompat getStart() {
            return this.mStart;
        }

        public int hashCode() {
            if (!BuildCompat.isAtLeastB_1()) {
                return 0;
            }
            SelectionPositionCompat selectionPositionCompat = this.mStart;
            int iHashCode = selectionPositionCompat != null ? selectionPositionCompat.hashCode() : 0;
            SelectionPositionCompat selectionPositionCompat2 = this.mEnd;
            return (iHashCode * 31) + (selectionPositionCompat2 != null ? selectionPositionCompat2.hashCode() : 0);
        }

        public Bundle toActionArguments() {
            Bundle bundle = new Bundle();
            if (BuildCompat.isAtLeastB_1()) {
                AccessibilityNodeInfo.Selection selection = this.mSelection;
                if (selection != null) {
                    bundle.putParcelable(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_PARCELABLE, selection);
                }
                SelectionPositionCompat selectionPositionCompat = this.mStart;
                if (selectionPositionCompat != null) {
                    bundle.putInt(AccessibilityNodeInfoCompat.EXTRA_SELECTION_START_OFFSET_TYPE, selectionPositionCompat.getOffsetType());
                }
                SelectionPositionCompat selectionPositionCompat2 = this.mEnd;
                if (selectionPositionCompat2 != null) {
                    bundle.putInt(AccessibilityNodeInfoCompat.EXTRA_SELECTION_END_OFFSET_TYPE, selectionPositionCompat2.getOffsetType());
                }
            }
            return bundle;
        }

        public AccessibilityNodeInfo.Selection unwrap() {
            return this.mSelection;
        }

        public SelectionCompat(AccessibilityNodeInfo.Selection selection) {
            this(selection, 0, 0);
        }

        SelectionCompat(AccessibilityNodeInfo.Selection selection, int i2, int i3) {
            if (!BuildCompat.isAtLeastB_1() || selection == null) {
                this.mSelection = null;
                this.mStart = null;
                this.mEnd = null;
            } else {
                this.mSelection = selection;
                this.mStart = new SelectionPositionCompat(selection.getStart(), i2);
                this.mEnd = new SelectionPositionCompat(selection.getEnd(), i3);
            }
        }

        public SelectionCompat(SelectionPositionCompat selectionPositionCompat, SelectionPositionCompat selectionPositionCompat2) {
            if (BuildCompat.isAtLeastB_1()) {
                this.mSelection = new AccessibilityNodeInfo.Selection(selectionPositionCompat.mPosition, selectionPositionCompat2.mPosition);
                this.mStart = selectionPositionCompat;
                this.mEnd = selectionPositionCompat2;
            } else {
                this.mSelection = null;
                this.mStart = null;
                this.mEnd = null;
            }
        }
    }
}
