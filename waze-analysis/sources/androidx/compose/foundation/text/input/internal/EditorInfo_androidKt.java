package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EditorInfo_androidKt {
    private static final boolean shouldEnableStylusHandwriting(EditorInfo editorInfo, ImeOptions imeOptions) {
        return (!StylusHandwriting_androidKt.isStylusHandwritingSupported() || KeyboardType.m10770equalsimpl0(imeOptions.m10747getKeyboardTypePjHm6EE(), KeyboardType.Companion.m10815getPasswordPjHm6EE()) || KeyboardType.m10770equalsimpl0(imeOptions.m10747getKeyboardTypePjHm6EE(), KeyboardType.Companion.m10816getPasswordVisiblePjHm6EE()) || KeyboardType.m10770equalsimpl0(imeOptions.m10747getKeyboardTypePjHm6EE(), KeyboardType.Companion.m10812getNumberPasswordPjHm6EE()) || KeyboardType.m10770equalsimpl0(imeOptions.m10747getKeyboardTypePjHm6EE(), KeyboardType.Companion.m10804getDecimalPasswordPjHm6EE()) || KeyboardType.m10770equalsimpl0(imeOptions.m10747getKeyboardTypePjHm6EE(), KeyboardType.Companion.m10813getNumberPasswordSignedPjHm6EE()) || KeyboardType.m10770equalsimpl0(imeOptions.m10747getKeyboardTypePjHm6EE(), KeyboardType.Companion.m10805getDecimalPasswordSignedPjHm6EE())) ? false : true;
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m3524updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int iM10746getImeActioneUduSuo = imeOptions.m10746getImeActioneUduSuo();
        int i2 = 4;
        int i3 = 6;
        if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10730getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i3 = 0;
            }
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10734getNoneeUduSuo())) {
            i3 = 1;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10732getGoeUduSuo())) {
            i3 = 2;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10733getNexteUduSuo())) {
            i3 = 5;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10735getPreviouseUduSuo())) {
            i3 = 7;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10736getSearcheUduSuo())) {
            i3 = 3;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10737getSendeUduSuo())) {
            i3 = 4;
        } else if (!ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10731getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i3;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int iM10747getKeyboardTypePjHm6EE = imeOptions.m10747getKeyboardTypePjHm6EE();
        if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10822getTextPjHm6EE())) {
            i2 = 1;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10800getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10811getNumberPjHm6EE())) {
            i2 = 2;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10818getPhonePjHm6EE())) {
            i2 = 3;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10825getUriPjHm6EE())) {
            i2 = 17;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10807getEmailPjHm6EE())) {
            i2 = 33;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10815getPasswordPjHm6EE())) {
            i2 = 129;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10812getNumberPasswordPjHm6EE())) {
            i2 = 18;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10803getDecimalPjHm6EE())) {
            i2 = InputDeviceCompat.SOURCE_MOUSE;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10816getPasswordVisiblePjHm6EE())) {
            i2 = 145;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10820getPostalAddressPjHm6EE())) {
            i2 = 113;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10817getPersonNamePjHm6EE())) {
            i2 = 97;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10808getEmailSubjectPjHm6EE())) {
            i2 = 49;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10821getShortMessagePjHm6EE())) {
            i2 = 65;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10810getLongMessagePjHm6EE())) {
            i2 = 81;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10809getFilterPjHm6EE())) {
            i2 = 177;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10819getPhoneticPjHm6EE())) {
            i2 = DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE;
        } else if (!KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10802getDateTimePjHm6EE())) {
            if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10801getDatePjHm6EE())) {
                i2 = 20;
            } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10823getTimePjHm6EE())) {
                i2 = 36;
            } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10814getNumberSignedPjHm6EE())) {
                i2 = InputDeviceCompat.SOURCE_TOUCHSCREEN;
            } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10806getDecimalSignedPjHm6EE())) {
                i2 = 12290;
            } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10804getDecimalPasswordPjHm6EE())) {
                i2 = 8210;
            } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10813getNumberPasswordSignedPjHm6EE())) {
                i2 = 4114;
            } else {
                if (!KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10805getDecimalPasswordSignedPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i2 = 12306;
            }
        }
        editorInfo.inputType = i2;
        if (!imeOptions.getSingleLine() && (editorInfo.inputType & 15) == 1) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m10717equalsimpl0(imeOptions.m10746getImeActioneUduSuo(), ImeAction.Companion.m10730getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((editorInfo.inputType & 15) == 1) {
            int iM10745getCapitalizationIUNYP9k = imeOptions.m10745getCapitalizationIUNYP9k();
            if (KeyboardCapitalization.m10753equalsimpl0(iM10745getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m10762getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m10753equalsimpl0(iM10745getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m10766getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m10753equalsimpl0(iM10745getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m10764getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m10546getStartimpl(j2);
        editorInfo.initialSelEnd = TextRange.m10541getEndimpl(j2);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= GroupFlagsKt.HasAuxSlotFlag;
        if (!shouldEnableStylusHandwriting(editorInfo, imeOptions)) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        }
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m3525updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            strArr = null;
        }
        m3524updatepLxbY9I(editorInfo, charSequence, j2, imeOptions, strArr);
    }
}
