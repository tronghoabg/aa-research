package androidx.compose.foundation.text;

import android.R;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuItems {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES;
    public static final TextContextMenuItems Autofill;
    public static final TextContextMenuItems Copy;
    public static final TextContextMenuItems Cut;
    public static final TextContextMenuItems Paste;
    public static final TextContextMenuItems SelectAll;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    private static final /* synthetic */ TextContextMenuItems[] $values() {
        return new TextContextMenuItems[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        Object cutKey = TextContextMenuKeys.INSTANCE.getCutKey();
        ContextMenuStrings.Companion.m3265getCut9Hzcbyc();
        ContextMenuIcons.Companion.m3252getActionModeCutDrawable3I4p1mQ();
        Cut = new TextContextMenuItems("Cut", 0, cutKey, R.string.cut, R.attr.actionModeCutDrawable);
        Object copyKey = TextContextMenuKeys.INSTANCE.getCopyKey();
        ContextMenuStrings.Companion.m3264getCopy9Hzcbyc();
        ContextMenuIcons.Companion.m3251getActionModeCopyDrawable3I4p1mQ();
        Copy = new TextContextMenuItems("Copy", 1, copyKey, R.string.copy, R.attr.actionModeCopyDrawable);
        Object pasteKey = TextContextMenuKeys.INSTANCE.getPasteKey();
        ContextMenuStrings.Companion.m3266getPaste9Hzcbyc();
        ContextMenuIcons.Companion.m3253getActionModePasteDrawable3I4p1mQ();
        Paste = new TextContextMenuItems("Paste", 2, pasteKey, R.string.paste, R.attr.actionModePasteDrawable);
        Object selectAllKey = TextContextMenuKeys.INSTANCE.getSelectAllKey();
        ContextMenuStrings.Companion.m3267getSelectAll9Hzcbyc();
        ContextMenuIcons.Companion.m3254getActionModeSelectAllDrawable3I4p1mQ();
        SelectAll = new TextContextMenuItems("SelectAll", 3, selectAllKey, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        Object autofillKey = TextContextMenuKeys.INSTANCE.getAutofillKey();
        ContextMenuStrings.Companion.m3263getAutofill9Hzcbyc();
        ContextMenuIcons.Companion.m3255getID_NULL3I4p1mQ();
        Autofill = new TextContextMenuItems("Autofill", 4, autofillKey, R.string.autofill, 0);
        TextContextMenuItems[] textContextMenuItemsArr$values = $values();
        $VALUES = textContextMenuItemsArr$values;
        $ENTRIES = b.a(textContextMenuItemsArr$values);
    }

    private TextContextMenuItems(String str, int i2, Object obj, int i3, int i4) {
        this.key = obj;
        this.stringId = i3;
        this.drawableId = i4;
    }

    public static a<TextContextMenuItems> getEntries() {
        return $ENTRIES;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    /* renamed from: getDrawableId-3I4p1mQ, reason: not valid java name */
    public final int m3377getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* renamed from: getStringId-9Hzcbyc, reason: not valid java name */
    public final int m3378getStringId9Hzcbyc() {
        return this.stringId;
    }

    public final String resolvedString(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(479426150, i2, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (CommonContextMenuArea.kt:178)");
        }
        String strM3268getStringtk4Tqcs = ContextMenuStrings_androidKt.m3268getStringtk4Tqcs(this.stringId, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM3268getStringtk4Tqcs;
    }
}
