package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Color;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    private TextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43) {
        this.focusedTextColor = j2;
        this.unfocusedTextColor = j3;
        this.disabledTextColor = j4;
        this.errorTextColor = j5;
        this.focusedContainerColor = j6;
        this.unfocusedContainerColor = j7;
        this.disabledContainerColor = j8;
        this.errorContainerColor = j9;
        this.cursorColor = j10;
        this.errorCursorColor = j11;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j12;
        this.unfocusedIndicatorColor = j13;
        this.disabledIndicatorColor = j14;
        this.errorIndicatorColor = j15;
        this.focusedLeadingIconColor = j16;
        this.unfocusedLeadingIconColor = j17;
        this.disabledLeadingIconColor = j18;
        this.errorLeadingIconColor = j19;
        this.focusedTrailingIconColor = j20;
        this.unfocusedTrailingIconColor = j21;
        this.disabledTrailingIconColor = j22;
        this.errorTrailingIconColor = j23;
        this.focusedLabelColor = j24;
        this.unfocusedLabelColor = j25;
        this.disabledLabelColor = j26;
        this.errorLabelColor = j27;
        this.focusedPlaceholderColor = j28;
        this.unfocusedPlaceholderColor = j29;
        this.disabledPlaceholderColor = j30;
        this.errorPlaceholderColor = j31;
        this.focusedSupportingTextColor = j32;
        this.unfocusedSupportingTextColor = j33;
        this.disabledSupportingTextColor = j34;
        this.errorSupportingTextColor = j35;
        this.focusedPrefixColor = j36;
        this.unfocusedPrefixColor = j37;
        this.disabledPrefixColor = j38;
        this.errorPrefixColor = j39;
        this.focusedSuffixColor = j40;
        this.unfocusedSuffixColor = j41;
        this.disabledSuffixColor = j42;
        this.errorSuffixColor = j43;
    }

    /* renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m5729copyejIjP34$default(TextFieldColors textFieldColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, int i2, int i3, Object obj) {
        long j44;
        long j45;
        TextSelectionColors textSelectionColors2;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        long j69;
        long j70;
        long j71;
        long j72;
        long j73;
        long j74;
        long j75;
        long j76;
        long j77;
        long j78;
        long j79;
        long j80;
        long j81;
        long j82;
        long j83;
        long j84;
        long j85;
        long j86;
        long j87;
        long j88;
        long j89;
        long j90;
        long j91;
        long j92;
        long j93;
        long j94;
        long j95;
        long j96;
        long j97;
        long j98;
        long j99;
        long j100;
        long j101 = (i2 & 1) != 0 ? textFieldColors.focusedTextColor : j2;
        long j102 = (i2 & 2) != 0 ? textFieldColors.unfocusedTextColor : j3;
        long j103 = (i2 & 4) != 0 ? textFieldColors.disabledTextColor : j4;
        long j104 = (i2 & 8) != 0 ? textFieldColors.errorTextColor : j5;
        long j105 = (i2 & 16) != 0 ? textFieldColors.focusedContainerColor : j6;
        long j106 = (i2 & 32) != 0 ? textFieldColors.unfocusedContainerColor : j7;
        if ((i2 & 64) != 0) {
            j44 = j101;
            j45 = textFieldColors.disabledContainerColor;
        } else {
            j44 = j101;
            j45 = j8;
        }
        long j107 = j45;
        long j108 = (i2 & 128) != 0 ? textFieldColors.errorContainerColor : j9;
        long j109 = (i2 & 256) != 0 ? textFieldColors.cursorColor : j10;
        long j110 = (i2 & 512) != 0 ? textFieldColors.errorCursorColor : j11;
        TextSelectionColors textSelectionColors3 = (i2 & 1024) != 0 ? textFieldColors.textSelectionColors : textSelectionColors;
        if ((i2 & 2048) != 0) {
            textSelectionColors2 = textSelectionColors3;
            j46 = textFieldColors.focusedIndicatorColor;
        } else {
            textSelectionColors2 = textSelectionColors3;
            j46 = j12;
        }
        long j111 = j46;
        long j112 = (i2 & 4096) != 0 ? textFieldColors.unfocusedIndicatorColor : j13;
        long j113 = (i2 & 8192) != 0 ? textFieldColors.disabledIndicatorColor : j14;
        long j114 = (i2 & 16384) != 0 ? textFieldColors.errorIndicatorColor : j15;
        if ((i2 & 32768) != 0) {
            j47 = j114;
            j48 = textFieldColors.focusedLeadingIconColor;
        } else {
            j47 = j114;
            j48 = j16;
        }
        if ((i2 & 65536) != 0) {
            j49 = j48;
            j50 = textFieldColors.unfocusedLeadingIconColor;
        } else {
            j49 = j48;
            j50 = j17;
        }
        if ((i2 & 131072) != 0) {
            j51 = j50;
            j52 = textFieldColors.disabledLeadingIconColor;
        } else {
            j51 = j50;
            j52 = j18;
        }
        if ((i2 & 262144) != 0) {
            j53 = j52;
            j54 = textFieldColors.errorLeadingIconColor;
        } else {
            j53 = j52;
            j54 = j19;
        }
        if ((i2 & 524288) != 0) {
            j55 = j54;
            j56 = textFieldColors.focusedTrailingIconColor;
        } else {
            j55 = j54;
            j56 = j20;
        }
        if ((i2 & 1048576) != 0) {
            j57 = j56;
            j58 = textFieldColors.unfocusedTrailingIconColor;
        } else {
            j57 = j56;
            j58 = j21;
        }
        if ((i2 & 2097152) != 0) {
            j59 = j58;
            j60 = textFieldColors.disabledTrailingIconColor;
        } else {
            j59 = j58;
            j60 = j22;
        }
        if ((i2 & 4194304) != 0) {
            j61 = j60;
            j62 = textFieldColors.errorTrailingIconColor;
        } else {
            j61 = j60;
            j62 = j23;
        }
        if ((i2 & 8388608) != 0) {
            j63 = j62;
            j64 = textFieldColors.focusedLabelColor;
        } else {
            j63 = j62;
            j64 = j24;
        }
        if ((i2 & 16777216) != 0) {
            j65 = j64;
            j66 = textFieldColors.unfocusedLabelColor;
        } else {
            j65 = j64;
            j66 = j25;
        }
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            j67 = j66;
            j68 = textFieldColors.disabledLabelColor;
        } else {
            j67 = j66;
            j68 = j26;
        }
        if ((i2 & 67108864) != 0) {
            j69 = j68;
            j70 = textFieldColors.errorLabelColor;
        } else {
            j69 = j68;
            j70 = j27;
        }
        if ((i2 & 134217728) != 0) {
            j71 = j70;
            j72 = textFieldColors.focusedPlaceholderColor;
        } else {
            j71 = j70;
            j72 = j28;
        }
        if ((i2 & 268435456) != 0) {
            j73 = j72;
            j74 = textFieldColors.unfocusedPlaceholderColor;
        } else {
            j73 = j72;
            j74 = j29;
        }
        if ((i2 & 536870912) != 0) {
            j75 = j74;
            j76 = textFieldColors.disabledPlaceholderColor;
        } else {
            j75 = j74;
            j76 = j30;
        }
        if ((i2 & 1073741824) != 0) {
            j77 = j76;
            j78 = textFieldColors.errorPlaceholderColor;
        } else {
            j77 = j76;
            j78 = j31;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            j79 = j78;
            j80 = textFieldColors.focusedSupportingTextColor;
        } else {
            j79 = j78;
            j80 = j32;
        }
        if ((i3 & 1) != 0) {
            j81 = j80;
            j82 = textFieldColors.unfocusedSupportingTextColor;
        } else {
            j81 = j80;
            j82 = j33;
        }
        if ((i3 & 2) != 0) {
            j83 = j82;
            j84 = textFieldColors.disabledSupportingTextColor;
        } else {
            j83 = j82;
            j84 = j34;
        }
        if ((i3 & 4) != 0) {
            j85 = j84;
            j86 = textFieldColors.errorSupportingTextColor;
        } else {
            j85 = j84;
            j86 = j35;
        }
        if ((i3 & 8) != 0) {
            j87 = j86;
            j88 = textFieldColors.focusedPrefixColor;
        } else {
            j87 = j86;
            j88 = j36;
        }
        if ((i3 & 16) != 0) {
            j89 = j88;
            j90 = textFieldColors.unfocusedPrefixColor;
        } else {
            j89 = j88;
            j90 = j37;
        }
        if ((i3 & 32) != 0) {
            j91 = j90;
            j92 = textFieldColors.disabledPrefixColor;
        } else {
            j91 = j90;
            j92 = j38;
        }
        if ((i3 & 64) != 0) {
            j93 = j92;
            j94 = textFieldColors.errorPrefixColor;
        } else {
            j93 = j92;
            j94 = j39;
        }
        if ((i3 & 128) != 0) {
            j95 = j94;
            j96 = textFieldColors.focusedSuffixColor;
        } else {
            j95 = j94;
            j96 = j40;
        }
        if ((i3 & 256) != 0) {
            j97 = j96;
            j98 = textFieldColors.unfocusedSuffixColor;
        } else {
            j97 = j96;
            j98 = j41;
        }
        if ((i3 & 512) != 0) {
            j99 = j98;
            j100 = textFieldColors.disabledSuffixColor;
        } else {
            j99 = j98;
            j100 = j42;
        }
        return textFieldColors.m5731copyejIjP34(j44, j102, j103, j104, j105, j106, j107, j108, j109, j110, textSelectionColors2, j111, j112, j113, j47, j49, j51, j53, j55, j57, j59, j61, j63, j65, j67, j69, j71, j73, j75, j77, j79, j81, j83, j85, j87, j89, j91, j93, j95, j97, j99, j100, (i3 & 1024) != 0 ? textFieldColors.errorSuffixColor : j43);
    }

    /* renamed from: containerColor-XeAY9LY, reason: not valid java name */
    public final long m5730containerColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledContainerColor : z2 ? this.errorContainerColor : z3 ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m5731copyejIjP34(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43) {
        return new TextFieldColors(j2 != 16 ? j2 : this.focusedTextColor, j3 != 16 ? j3 : this.unfocusedTextColor, j4 != 16 ? j4 : this.disabledTextColor, j5 != 16 ? j5 : this.errorTextColor, j6 != 16 ? j6 : this.focusedContainerColor, j7 != 16 ? j7 : this.unfocusedContainerColor, j8 != 16 ? j8 : this.disabledContainerColor, j9 != 16 ? j9 : this.errorContainerColor, j10 != 16 ? j10 : this.cursorColor, j11 != 16 ? j11 : this.errorCursorColor, takeOrElse$material3(textSelectionColors, new a() { // from class: androidx.compose.material3.TextFieldColors$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.textSelectionColors;
            }
        }), j12 != 16 ? j12 : this.focusedIndicatorColor, j13 != 16 ? j13 : this.unfocusedIndicatorColor, j14 != 16 ? j14 : this.disabledIndicatorColor, j15 != 16 ? j15 : this.errorIndicatorColor, j16 != 16 ? j16 : this.focusedLeadingIconColor, j17 != 16 ? j17 : this.unfocusedLeadingIconColor, j18 != 16 ? j18 : this.disabledLeadingIconColor, j19 != 16 ? j19 : this.errorLeadingIconColor, j20 != 16 ? j20 : this.focusedTrailingIconColor, j21 != 16 ? j21 : this.unfocusedTrailingIconColor, j22 != 16 ? j22 : this.disabledTrailingIconColor, j23 != 16 ? j23 : this.errorTrailingIconColor, j24 != 16 ? j24 : this.focusedLabelColor, j25 != 16 ? j25 : this.unfocusedLabelColor, j26 != 16 ? j26 : this.disabledLabelColor, j27 != 16 ? j27 : this.errorLabelColor, j28 != 16 ? j28 : this.focusedPlaceholderColor, j29 != 16 ? j29 : this.unfocusedPlaceholderColor, j30 != 16 ? j30 : this.disabledPlaceholderColor, j31 != 16 ? j31 : this.errorPlaceholderColor, j32 != 16 ? j32 : this.focusedSupportingTextColor, j33 != 16 ? j33 : this.unfocusedSupportingTextColor, j34 != 16 ? j34 : this.disabledSupportingTextColor, j35 != 16 ? j35 : this.errorSupportingTextColor, j36 != 16 ? j36 : this.focusedPrefixColor, j37 != 16 ? j37 : this.unfocusedPrefixColor, j38 != 16 ? j38 : this.disabledPrefixColor, j39 != 16 ? j39 : this.errorPrefixColor, j40 != 16 ? j40 : this.focusedSuffixColor, j41 != 16 ? j41 : this.unfocusedSuffixColor, j42 != 16 ? j42 : this.disabledSuffixColor, j43 != 16 ? j43 : this.errorSuffixColor, null);
    }

    /* renamed from: cursorColor-vNxB06k, reason: not valid java name */
    public final long m5732cursorColorvNxB06k(boolean z) {
        return z ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        return Color.m8229equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m8229equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m8229equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m8229equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m8229equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m8229equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m8229equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m8229equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m8229equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m8229equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && x.n(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m8229equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m8229equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m8229equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m8229equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m8229equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m8229equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m8229equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m8229equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m8229equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m8229equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m8229equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m8229equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m8229equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m8229equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m8229equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m8229equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m8229equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m8229equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m8229equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m8229equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m8229equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m8229equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m8229equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m8229equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m8229equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m8229equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m8229equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m8229equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m8229equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m8229equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m8229equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m8229equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
    public final long m5733getCursorColor0d7_KjU() {
        return this.cursorColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5734getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m5735getDisabledIndicatorColor0d7_KjU() {
        return this.disabledIndicatorColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m5736getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5737getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m5738getDisabledPlaceholderColor0d7_KjU() {
        return this.disabledPlaceholderColor;
    }

    /* renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m5739getDisabledPrefixColor0d7_KjU() {
        return this.disabledPrefixColor;
    }

    /* renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m5740getDisabledSuffixColor0d7_KjU() {
        return this.disabledSuffixColor;
    }

    /* renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m5741getDisabledSupportingTextColor0d7_KjU() {
        return this.disabledSupportingTextColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m5742getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5743getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5744getErrorContainerColor0d7_KjU() {
        return this.errorContainerColor;
    }

    /* renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name */
    public final long m5745getErrorCursorColor0d7_KjU() {
        return this.errorCursorColor;
    }

    /* renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m5746getErrorIndicatorColor0d7_KjU() {
        return this.errorIndicatorColor;
    }

    /* renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name */
    public final long m5747getErrorLabelColor0d7_KjU() {
        return this.errorLabelColor;
    }

    /* renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5748getErrorLeadingIconColor0d7_KjU() {
        return this.errorLeadingIconColor;
    }

    /* renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m5749getErrorPlaceholderColor0d7_KjU() {
        return this.errorPlaceholderColor;
    }

    /* renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m5750getErrorPrefixColor0d7_KjU() {
        return this.errorPrefixColor;
    }

    /* renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m5751getErrorSuffixColor0d7_KjU() {
        return this.errorSuffixColor;
    }

    /* renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m5752getErrorSupportingTextColor0d7_KjU() {
        return this.errorSupportingTextColor;
    }

    /* renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name */
    public final long m5753getErrorTextColor0d7_KjU() {
        return this.errorTextColor;
    }

    /* renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5754getErrorTrailingIconColor0d7_KjU() {
        return this.errorTrailingIconColor;
    }

    /* renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5755getFocusedContainerColor0d7_KjU() {
        return this.focusedContainerColor;
    }

    /* renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m5756getFocusedIndicatorColor0d7_KjU() {
        return this.focusedIndicatorColor;
    }

    /* renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m5757getFocusedLabelColor0d7_KjU() {
        return this.focusedLabelColor;
    }

    /* renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5758getFocusedLeadingIconColor0d7_KjU() {
        return this.focusedLeadingIconColor;
    }

    /* renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m5759getFocusedPlaceholderColor0d7_KjU() {
        return this.focusedPlaceholderColor;
    }

    /* renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m5760getFocusedPrefixColor0d7_KjU() {
        return this.focusedPrefixColor;
    }

    /* renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m5761getFocusedSuffixColor0d7_KjU() {
        return this.focusedSuffixColor;
    }

    /* renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m5762getFocusedSupportingTextColor0d7_KjU() {
        return this.focusedSupportingTextColor;
    }

    /* renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m5763getFocusedTextColor0d7_KjU() {
        return this.focusedTextColor;
    }

    /* renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5764getFocusedTrailingIconColor0d7_KjU() {
        return this.focusedTrailingIconColor;
    }

    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5765getUnfocusedContainerColor0d7_KjU() {
        return this.unfocusedContainerColor;
    }

    /* renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m5766getUnfocusedIndicatorColor0d7_KjU() {
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m5767getUnfocusedLabelColor0d7_KjU() {
        return this.unfocusedLabelColor;
    }

    /* renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5768getUnfocusedLeadingIconColor0d7_KjU() {
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m5769getUnfocusedPlaceholderColor0d7_KjU() {
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m5770getUnfocusedPrefixColor0d7_KjU() {
        return this.unfocusedPrefixColor;
    }

    /* renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m5771getUnfocusedSuffixColor0d7_KjU() {
        return this.unfocusedSuffixColor;
    }

    /* renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m5772getUnfocusedSupportingTextColor0d7_KjU() {
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m5773getUnfocusedTextColor0d7_KjU() {
        return this.unfocusedTextColor;
    }

    /* renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5774getUnfocusedTrailingIconColor0d7_KjU() {
        return this.unfocusedTrailingIconColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.focusedTextColor) * 31;
        TextSelectionColors textSelectionColors = this.textSelectionColors;
        long j2 = this.errorCursorColor;
        long j3 = this.cursorColor;
        long j4 = this.errorContainerColor;
        long j5 = this.disabledContainerColor;
        long j6 = this.unfocusedContainerColor;
        long j7 = this.focusedContainerColor;
        long j8 = this.errorTextColor;
        int iM8235hashCodeimpl2 = ((((((((((((((((((Color.m8235hashCodeimpl(this.unfocusedTextColor) + iM8235hashCodeimpl) * 31) + Color.m8235hashCodeimpl(this.disabledTextColor)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2)) * 31) + textSelectionColors.hashCode();
        long j9 = this.focusedIndicatorColor;
        long j10 = this.unfocusedIndicatorColor;
        int iM8235hashCodeimpl3 = ((iM8235hashCodeimpl2 * 31) + Color.m8235hashCodeimpl(j9)) * 31;
        long j11 = this.disabledIndicatorColor;
        int iM8235hashCodeimpl4 = (iM8235hashCodeimpl3 + Color.m8235hashCodeimpl(j10)) * 31;
        long j12 = this.errorIndicatorColor;
        int iM8235hashCodeimpl5 = (iM8235hashCodeimpl4 + Color.m8235hashCodeimpl(j11)) * 31;
        long j13 = this.focusedLeadingIconColor;
        int iM8235hashCodeimpl6 = (iM8235hashCodeimpl5 + Color.m8235hashCodeimpl(j12)) * 31;
        long j14 = this.unfocusedLeadingIconColor;
        int iM8235hashCodeimpl7 = (iM8235hashCodeimpl6 + Color.m8235hashCodeimpl(j13)) * 31;
        long j15 = this.disabledLeadingIconColor;
        int iM8235hashCodeimpl8 = (iM8235hashCodeimpl7 + Color.m8235hashCodeimpl(j14)) * 31;
        long j16 = this.errorLeadingIconColor;
        int iM8235hashCodeimpl9 = (iM8235hashCodeimpl8 + Color.m8235hashCodeimpl(j15)) * 31;
        long j17 = this.focusedTrailingIconColor;
        int iM8235hashCodeimpl10 = (iM8235hashCodeimpl9 + Color.m8235hashCodeimpl(j16)) * 31;
        long j18 = this.unfocusedTrailingIconColor;
        int iM8235hashCodeimpl11 = (iM8235hashCodeimpl10 + Color.m8235hashCodeimpl(j17)) * 31;
        long j19 = this.disabledTrailingIconColor;
        int iM8235hashCodeimpl12 = (iM8235hashCodeimpl11 + Color.m8235hashCodeimpl(j18)) * 31;
        long j20 = this.errorTrailingIconColor;
        int iM8235hashCodeimpl13 = (iM8235hashCodeimpl12 + Color.m8235hashCodeimpl(j19)) * 31;
        long j21 = this.focusedLabelColor;
        int iM8235hashCodeimpl14 = (iM8235hashCodeimpl13 + Color.m8235hashCodeimpl(j20)) * 31;
        long j22 = this.unfocusedLabelColor;
        return ((((((((((((((((((((((((((((((((((((((iM8235hashCodeimpl14 + Color.m8235hashCodeimpl(j21)) * 31) + Color.m8235hashCodeimpl(j22)) * 31) + Color.m8235hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m8235hashCodeimpl(this.errorLabelColor)) * 31) + Color.m8235hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m8235hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m8235hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m8235hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m8235hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m8235hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m8235hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m8235hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m8235hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m8235hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m8235hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m8235hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m8235hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m8235hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m8235hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m8235hashCodeimpl(this.errorSuffixColor);
    }

    /* renamed from: indicatorColor-XeAY9LY, reason: not valid java name */
    public final long m5775indicatorColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledIndicatorColor : z2 ? this.errorIndicatorColor : z3 ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    /* renamed from: labelColor-XeAY9LY, reason: not valid java name */
    public final long m5776labelColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledLabelColor : z2 ? this.errorLabelColor : z3 ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    /* renamed from: leadingIconColor-XeAY9LY, reason: not valid java name */
    public final long m5777leadingIconColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledLeadingIconColor : z2 ? this.errorLeadingIconColor : z3 ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    /* renamed from: placeholderColor-XeAY9LY, reason: not valid java name */
    public final long m5778placeholderColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledPlaceholderColor : z2 ? this.errorPlaceholderColor : z3 ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    /* renamed from: prefixColor-XeAY9LY, reason: not valid java name */
    public final long m5779prefixColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledPrefixColor : z2 ? this.errorPrefixColor : z3 ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    /* renamed from: suffixColor-XeAY9LY, reason: not valid java name */
    public final long m5780suffixColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledSuffixColor : z2 ? this.errorSuffixColor : z3 ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    /* renamed from: supportingTextColor-XeAY9LY, reason: not valid java name */
    public final long m5781supportingTextColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledSupportingTextColor : z2 ? this.errorSupportingTextColor : z3 ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public final TextSelectionColors takeOrElse$material3(TextSelectionColors textSelectionColors, a<TextSelectionColors> aVar) {
        return textSelectionColors == null ? aVar.invoke() : textSelectionColors;
    }

    /* renamed from: textColor-XeAY9LY, reason: not valid java name */
    public final long m5782textColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledTextColor : z2 ? this.errorTextColor : z3 ? this.focusedTextColor : this.unfocusedTextColor;
    }

    /* renamed from: trailingIconColor-XeAY9LY, reason: not valid java name */
    public final long m5783trailingIconColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledTrailingIconColor : z2 ? this.errorTrailingIconColor : z3 ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    public /* synthetic */ TextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, textSelectionColors, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43);
    }
}
