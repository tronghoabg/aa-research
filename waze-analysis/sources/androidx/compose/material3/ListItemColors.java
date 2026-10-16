package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ListItemColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;
    private final long disabledLeadingContentColor;
    private final long disabledOverlineContentColor;
    private final long disabledSupportingContentColor;
    private final long disabledTrailingContentColor;
    private final long draggedContainerColor;
    private final long draggedContentColor;
    private final long draggedLeadingContentColor;
    private final long draggedOverlineContentColor;
    private final long draggedSupportingContentColor;
    private final long draggedTrailingContentColor;
    private final long leadingContentColor;
    private final long overlineContentColor;
    private final long selectedContainerColor;
    private final long selectedContentColor;
    private final long selectedLeadingContentColor;
    private final long selectedOverlineContentColor;
    private final long selectedSupportingContentColor;
    private final long selectedTrailingContentColor;
    private final long supportingContentColor;
    private final long trailingContentColor;

    private ListItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this(j2, j3, j4, j7, j5, j6, Color.Companion.m8264getUnspecified0d7_KjU(), j8, j9, j10, Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), null);
    }

    /* renamed from: copy-5r9EGqc$default, reason: not valid java name */
    public static /* synthetic */ ListItemColors m5078copy5r9EGqc$default(ListItemColors listItemColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i2, Object obj) {
        ListItemColors listItemColors2;
        long j11;
        if ((i2 & 1) != 0) {
            listItemColors2 = listItemColors;
            j11 = listItemColors2.containerColor;
        } else {
            listItemColors2 = listItemColors;
            j11 = j2;
        }
        return listItemColors.m5090copy5r9EGqc(j11, (i2 & 2) != 0 ? listItemColors2.m5109getHeadlineColor0d7_KjU() : j3, (i2 & 4) != 0 ? listItemColors2.m5111getLeadingIconColor0d7_KjU() : j4, (i2 & 8) != 0 ? listItemColors2.m5112getOverlineColor0d7_KjU() : j5, (i2 & 16) != 0 ? listItemColors2.m5121getSupportingTextColor0d7_KjU() : j6, (i2 & 32) != 0 ? listItemColors2.m5123getTrailingIconColor0d7_KjU() : j7, (i2 & 64) != 0 ? listItemColors2.m5096getDisabledHeadlineColor0d7_KjU() : j8, (i2 & 128) != 0 ? listItemColors.m5098getDisabledLeadingIconColor0d7_KjU() : j9, (i2 & 256) != 0 ? listItemColors.m5102getDisabledTrailingIconColor0d7_KjU() : j10);
    }

    /* renamed from: copy-KKJ9vVU$default, reason: not valid java name */
    public static /* synthetic */ ListItemColors m5079copyKKJ9vVU$default(ListItemColors listItemColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, int i2, Object obj) {
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
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
        ListItemColors listItemColors2;
        long j65 = (i2 & 1) != 0 ? listItemColors.containerColor : j2;
        long j66 = (i2 & 2) != 0 ? listItemColors.contentColor : j3;
        long j67 = (i2 & 4) != 0 ? listItemColors.leadingContentColor : j4;
        long j68 = (i2 & 8) != 0 ? listItemColors.trailingContentColor : j5;
        long j69 = (i2 & 16) != 0 ? listItemColors.overlineContentColor : j6;
        long j70 = (i2 & 32) != 0 ? listItemColors.supportingContentColor : j7;
        long j71 = (i2 & 64) != 0 ? listItemColors.disabledContainerColor : j8;
        long j72 = j65;
        long j73 = (i2 & 128) != 0 ? listItemColors.disabledContentColor : j9;
        long j74 = (i2 & 256) != 0 ? listItemColors.disabledLeadingContentColor : j10;
        long j75 = (i2 & 512) != 0 ? listItemColors.disabledTrailingContentColor : j11;
        long j76 = (i2 & 1024) != 0 ? listItemColors.disabledOverlineContentColor : j12;
        long j77 = (i2 & 2048) != 0 ? listItemColors.disabledSupportingContentColor : j13;
        long j78 = (i2 & 4096) != 0 ? listItemColors.selectedContainerColor : j14;
        long j79 = (i2 & 8192) != 0 ? listItemColors.selectedContentColor : j15;
        long j80 = (i2 & 16384) != 0 ? listItemColors.selectedLeadingContentColor : j16;
        if ((i2 & 32768) != 0) {
            j26 = j80;
            j27 = listItemColors.selectedTrailingContentColor;
        } else {
            j26 = j80;
            j27 = j17;
        }
        if ((i2 & 65536) != 0) {
            j28 = j27;
            j29 = listItemColors.selectedOverlineContentColor;
        } else {
            j28 = j27;
            j29 = j18;
        }
        if ((i2 & 131072) != 0) {
            j30 = j29;
            j31 = listItemColors.selectedSupportingContentColor;
        } else {
            j30 = j29;
            j31 = j19;
        }
        if ((i2 & 262144) != 0) {
            j32 = j31;
            j33 = listItemColors.draggedContainerColor;
        } else {
            j32 = j31;
            j33 = j20;
        }
        if ((i2 & 524288) != 0) {
            j34 = j33;
            j35 = listItemColors.draggedContentColor;
        } else {
            j34 = j33;
            j35 = j21;
        }
        if ((i2 & 1048576) != 0) {
            j36 = j35;
            j37 = listItemColors.draggedLeadingContentColor;
        } else {
            j36 = j35;
            j37 = j22;
        }
        if ((i2 & 2097152) != 0) {
            j38 = j37;
            j39 = listItemColors.draggedTrailingContentColor;
        } else {
            j38 = j37;
            j39 = j23;
        }
        if ((i2 & 4194304) != 0) {
            j40 = j39;
            j41 = listItemColors.draggedOverlineContentColor;
        } else {
            j40 = j39;
            j41 = j24;
        }
        if ((i2 & 8388608) != 0) {
            j43 = j41;
            j42 = listItemColors.draggedSupportingContentColor;
            j45 = j30;
            j46 = j32;
            j47 = j34;
            j48 = j36;
            j49 = j38;
            j50 = j40;
            j52 = j75;
            j53 = j76;
            j54 = j77;
            j55 = j78;
            j56 = j79;
            j57 = j26;
            j44 = j28;
            j59 = j67;
            j60 = j68;
            j61 = j69;
            j62 = j70;
            j63 = j71;
            j64 = j73;
            j51 = j74;
            listItemColors2 = listItemColors;
            j58 = j66;
        } else {
            j42 = j25;
            j43 = j41;
            j44 = j28;
            j45 = j30;
            j46 = j32;
            j47 = j34;
            j48 = j36;
            j49 = j38;
            j50 = j40;
            j51 = j74;
            j52 = j75;
            j53 = j76;
            j54 = j77;
            j55 = j78;
            j56 = j79;
            j57 = j26;
            j58 = j66;
            j59 = j67;
            j60 = j68;
            j61 = j69;
            j62 = j70;
            j63 = j71;
            j64 = j73;
            listItemColors2 = listItemColors;
        }
        return listItemColors2.m5091copyKKJ9vVU(j72, j58, j59, j60, j61, j62, j63, j64, j51, j52, j53, j54, j55, j56, j57, j44, j45, j46, j47, j48, j49, j50, j43, j42);
    }

    /* renamed from: containerColor-XeAY9LY, reason: not valid java name */
    public final long m5088containerColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledContainerColor : z3 ? this.draggedContainerColor : z2 ? this.selectedContainerColor : this.containerColor;
    }

    /* renamed from: contentColor-XeAY9LY, reason: not valid java name */
    public final long m5089contentColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledContentColor : z3 ? this.draggedContentColor : z2 ? this.selectedContentColor : this.contentColor;
    }

    /* renamed from: copy-5r9EGqc, reason: not valid java name */
    public final ListItemColors m5090copy5r9EGqc(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        ListItemColors listItemColors;
        long j11;
        if (j2 != 16) {
            listItemColors = this;
            j11 = j2;
        } else {
            listItemColors = this;
            j11 = listItemColors.containerColor;
        }
        return new ListItemColors(j11, j3 != 16 ? j3 : listItemColors.m5109getHeadlineColor0d7_KjU(), j4 != 16 ? j4 : listItemColors.m5111getLeadingIconColor0d7_KjU(), j5 != 16 ? j5 : listItemColors.m5112getOverlineColor0d7_KjU(), j6 != 16 ? j6 : listItemColors.m5121getSupportingTextColor0d7_KjU(), j7 != 16 ? j7 : listItemColors.m5123getTrailingIconColor0d7_KjU(), j8 != 16 ? j8 : listItemColors.m5096getDisabledHeadlineColor0d7_KjU(), j9 != 16 ? j9 : listItemColors.m5098getDisabledLeadingIconColor0d7_KjU(), j10 != 16 ? j10 : listItemColors.m5102getDisabledTrailingIconColor0d7_KjU(), null);
    }

    /* renamed from: copy-KKJ9vVU, reason: not valid java name */
    public final ListItemColors m5091copyKKJ9vVU(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        return new ListItemColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.contentColor, j4 != 16 ? j4 : this.leadingContentColor, j5 != 16 ? j5 : this.trailingContentColor, j6 != 16 ? j6 : this.overlineContentColor, j7 != 16 ? j7 : this.supportingContentColor, j8 != 16 ? j8 : this.disabledContainerColor, j9 != 16 ? j9 : this.disabledContentColor, j10 != 16 ? j10 : this.disabledLeadingContentColor, j11 != 16 ? j11 : this.disabledTrailingContentColor, j12 != 16 ? j12 : this.disabledOverlineContentColor, j13 != 16 ? j13 : this.disabledSupportingContentColor, j14 != 16 ? j14 : this.selectedContainerColor, j15 != 16 ? j15 : this.selectedContentColor, j16 != 16 ? j16 : this.selectedLeadingContentColor, j17 != 16 ? j17 : this.selectedTrailingContentColor, j18 != 16 ? j18 : this.selectedOverlineContentColor, j19 != 16 ? j19 : this.selectedSupportingContentColor, j20 != 16 ? j20 : this.draggedContainerColor, j21 != 16 ? j21 : this.draggedContentColor, j22 != 16 ? j22 : this.draggedLeadingContentColor, j23 != 16 ? j23 : this.draggedTrailingContentColor, j24 != 16 ? j24 : this.draggedOverlineContentColor, j25 != 16 ? j25 : this.draggedSupportingContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListItemColors)) {
            return false;
        }
        ListItemColors listItemColors = (ListItemColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, listItemColors.containerColor) && Color.m8229equalsimpl0(this.contentColor, listItemColors.contentColor) && Color.m8229equalsimpl0(this.leadingContentColor, listItemColors.leadingContentColor) && Color.m8229equalsimpl0(this.trailingContentColor, listItemColors.trailingContentColor) && Color.m8229equalsimpl0(this.overlineContentColor, listItemColors.overlineContentColor) && Color.m8229equalsimpl0(this.supportingContentColor, listItemColors.supportingContentColor) && Color.m8229equalsimpl0(this.disabledContainerColor, listItemColors.disabledContainerColor) && Color.m8229equalsimpl0(this.disabledContentColor, listItemColors.disabledContentColor) && Color.m8229equalsimpl0(this.disabledLeadingContentColor, listItemColors.disabledLeadingContentColor) && Color.m8229equalsimpl0(this.disabledTrailingContentColor, listItemColors.disabledTrailingContentColor) && Color.m8229equalsimpl0(this.disabledOverlineContentColor, listItemColors.disabledOverlineContentColor) && Color.m8229equalsimpl0(this.disabledSupportingContentColor, listItemColors.disabledSupportingContentColor) && Color.m8229equalsimpl0(this.selectedContainerColor, listItemColors.selectedContainerColor) && Color.m8229equalsimpl0(this.selectedContentColor, listItemColors.selectedContentColor) && Color.m8229equalsimpl0(this.selectedLeadingContentColor, listItemColors.selectedLeadingContentColor) && Color.m8229equalsimpl0(this.selectedTrailingContentColor, listItemColors.selectedTrailingContentColor) && Color.m8229equalsimpl0(this.selectedOverlineContentColor, listItemColors.selectedOverlineContentColor) && Color.m8229equalsimpl0(this.selectedSupportingContentColor, listItemColors.selectedSupportingContentColor) && Color.m8229equalsimpl0(this.draggedContainerColor, listItemColors.draggedContainerColor) && Color.m8229equalsimpl0(this.draggedContentColor, listItemColors.draggedContentColor) && Color.m8229equalsimpl0(this.draggedLeadingContentColor, listItemColors.draggedLeadingContentColor) && Color.m8229equalsimpl0(this.draggedTrailingContentColor, listItemColors.draggedTrailingContentColor) && Color.m8229equalsimpl0(this.draggedOverlineContentColor, listItemColors.draggedOverlineContentColor) && Color.m8229equalsimpl0(this.draggedSupportingContentColor, listItemColors.draggedSupportingContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5092getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m5093getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5094getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m5095getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    /* renamed from: getDisabledHeadlineColor-0d7_KjU, reason: not valid java name */
    public final long m5096getDisabledHeadlineColor0d7_KjU() {
        return this.disabledContentColor;
    }

    /* renamed from: getDisabledLeadingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5097getDisabledLeadingContentColor0d7_KjU() {
        return this.disabledLeadingContentColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5098getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingContentColor;
    }

    /* renamed from: getDisabledOverlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m5099getDisabledOverlineContentColor0d7_KjU() {
        return this.disabledOverlineContentColor;
    }

    /* renamed from: getDisabledSupportingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5100getDisabledSupportingContentColor0d7_KjU() {
        return this.disabledSupportingContentColor;
    }

    /* renamed from: getDisabledTrailingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5101getDisabledTrailingContentColor0d7_KjU() {
        return this.disabledTrailingContentColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5102getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingContentColor;
    }

    /* renamed from: getDraggedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5103getDraggedContainerColor0d7_KjU() {
        return this.draggedContainerColor;
    }

    /* renamed from: getDraggedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5104getDraggedContentColor0d7_KjU() {
        return this.draggedContentColor;
    }

    /* renamed from: getDraggedLeadingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5105getDraggedLeadingContentColor0d7_KjU() {
        return this.draggedLeadingContentColor;
    }

    /* renamed from: getDraggedOverlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m5106getDraggedOverlineContentColor0d7_KjU() {
        return this.draggedOverlineContentColor;
    }

    /* renamed from: getDraggedSupportingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5107getDraggedSupportingContentColor0d7_KjU() {
        return this.draggedSupportingContentColor;
    }

    /* renamed from: getDraggedTrailingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5108getDraggedTrailingContentColor0d7_KjU() {
        return this.draggedTrailingContentColor;
    }

    /* renamed from: getHeadlineColor-0d7_KjU, reason: not valid java name */
    public final long m5109getHeadlineColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getLeadingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5110getLeadingContentColor0d7_KjU() {
        return this.leadingContentColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5111getLeadingIconColor0d7_KjU() {
        return this.leadingContentColor;
    }

    /* renamed from: getOverlineColor-0d7_KjU, reason: not valid java name */
    public final long m5112getOverlineColor0d7_KjU() {
        return this.overlineContentColor;
    }

    /* renamed from: getOverlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m5113getOverlineContentColor0d7_KjU() {
        return this.overlineContentColor;
    }

    /* renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5114getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* renamed from: getSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5115getSelectedContentColor0d7_KjU() {
        return this.selectedContentColor;
    }

    /* renamed from: getSelectedLeadingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5116getSelectedLeadingContentColor0d7_KjU() {
        return this.selectedLeadingContentColor;
    }

    /* renamed from: getSelectedOverlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m5117getSelectedOverlineContentColor0d7_KjU() {
        return this.selectedOverlineContentColor;
    }

    /* renamed from: getSelectedSupportingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5118getSelectedSupportingContentColor0d7_KjU() {
        return this.selectedSupportingContentColor;
    }

    /* renamed from: getSelectedTrailingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5119getSelectedTrailingContentColor0d7_KjU() {
        return this.selectedTrailingContentColor;
    }

    /* renamed from: getSupportingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5120getSupportingContentColor0d7_KjU() {
        return this.supportingContentColor;
    }

    /* renamed from: getSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m5121getSupportingTextColor0d7_KjU() {
        return this.supportingContentColor;
    }

    /* renamed from: getTrailingContentColor-0d7_KjU, reason: not valid java name */
    public final long m5122getTrailingContentColor0d7_KjU() {
        return this.trailingContentColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5123getTrailingIconColor0d7_KjU() {
        return this.trailingContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.draggedSupportingContentColor;
        long j3 = this.draggedOverlineContentColor;
        long j4 = this.draggedTrailingContentColor;
        long j5 = this.draggedLeadingContentColor;
        long j6 = this.draggedContentColor;
        long j7 = this.draggedContainerColor;
        long j8 = this.selectedSupportingContentColor;
        long j9 = this.selectedOverlineContentColor;
        long j10 = this.selectedTrailingContentColor;
        long j11 = this.selectedLeadingContentColor;
        long j12 = this.selectedContentColor;
        long j13 = this.selectedContainerColor;
        long j14 = this.disabledSupportingContentColor;
        long j15 = this.disabledOverlineContentColor;
        long j16 = this.disabledTrailingContentColor;
        long j17 = this.disabledLeadingContentColor;
        long j18 = this.disabledContentColor;
        long j19 = this.disabledContainerColor;
        long j20 = this.supportingContentColor;
        long j21 = this.overlineContentColor;
        long j22 = this.trailingContentColor;
        return (((((((((((((((((((((((((((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.leadingContentColor)) * 31) + Color.m8235hashCodeimpl(j22)) * 31) + Color.m8235hashCodeimpl(j21)) * 31) + Color.m8235hashCodeimpl(j20)) * 31) + Color.m8235hashCodeimpl(j19)) * 31) + Color.m8235hashCodeimpl(j18)) * 31) + Color.m8235hashCodeimpl(j17)) * 31) + Color.m8235hashCodeimpl(j16)) * 31) + Color.m8235hashCodeimpl(j15)) * 31) + Color.m8235hashCodeimpl(j14)) * 31) + Color.m8235hashCodeimpl(j13)) * 31) + Color.m8235hashCodeimpl(j12)) * 31) + Color.m8235hashCodeimpl(j11)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: leadingContentColor-XeAY9LY, reason: not valid java name */
    public final long m5124leadingContentColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledLeadingContentColor : z3 ? this.draggedLeadingContentColor : z2 ? this.selectedLeadingContentColor : this.leadingContentColor;
    }

    /* renamed from: overlineContentColor-XeAY9LY, reason: not valid java name */
    public final long m5125overlineContentColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledOverlineContentColor : z3 ? this.draggedOverlineContentColor : z2 ? this.selectedOverlineContentColor : this.overlineContentColor;
    }

    /* renamed from: supportingContentColor-XeAY9LY, reason: not valid java name */
    public final long m5126supportingContentColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledSupportingContentColor : z3 ? this.draggedSupportingContentColor : z2 ? this.selectedSupportingContentColor : this.supportingContentColor;
    }

    /* renamed from: trailingContentColor-XeAY9LY, reason: not valid java name */
    public final long m5127trailingContentColorXeAY9LY(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledTrailingContentColor : z3 ? this.draggedTrailingContentColor : z2 ? this.selectedTrailingContentColor : this.trailingContentColor;
    }

    /* renamed from: getDisabledHeadlineColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5080getDisabledHeadlineColor0d7_KjU$annotations() {
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5081getDisabledLeadingIconColor0d7_KjU$annotations() {
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5082getDisabledTrailingIconColor0d7_KjU$annotations() {
    }

    /* renamed from: getHeadlineColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5083getHeadlineColor0d7_KjU$annotations() {
    }

    /* renamed from: getLeadingIconColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5084getLeadingIconColor0d7_KjU$annotations() {
    }

    /* renamed from: getOverlineColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5085getOverlineColor0d7_KjU$annotations() {
    }

    /* renamed from: getSupportingTextColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5086getSupportingTextColor0d7_KjU$annotations() {
    }

    /* renamed from: getTrailingIconColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5087getTrailingIconColor0d7_KjU$annotations() {
    }

    public /* synthetic */ ListItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25);
    }

    public /* synthetic */ ListItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    private ListItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.leadingContentColor = j4;
        this.trailingContentColor = j5;
        this.overlineContentColor = j6;
        this.supportingContentColor = j7;
        this.disabledContainerColor = j8;
        this.disabledContentColor = j9;
        this.disabledLeadingContentColor = j10;
        this.disabledTrailingContentColor = j11;
        this.disabledOverlineContentColor = j12;
        this.disabledSupportingContentColor = j13;
        this.selectedContainerColor = j14;
        this.selectedContentColor = j15;
        this.selectedLeadingContentColor = j16;
        this.selectedTrailingContentColor = j17;
        this.selectedOverlineContentColor = j18;
        this.selectedSupportingContentColor = j19;
        this.draggedContainerColor = j20;
        this.draggedContentColor = j21;
        this.draggedLeadingContentColor = j22;
        this.draggedTrailingContentColor = j23;
        this.draggedOverlineContentColor = j24;
        this.draggedSupportingContentColor = j25;
    }
}
