package androidx.compose.material3;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;
    private ChipColors defaultAssistChipColorsCached;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private CheckboxColors defaultCheckboxColorsCached;
    private DatePickerColors defaultDatePickerColorsCached;
    private ChipColors defaultElevatedAssistChipColorsCached;
    private ButtonColors defaultElevatedButtonColorsCached;
    private CardColors defaultElevatedCardColorsCached;
    private SelectableChipColors defaultElevatedFilterChipColorsCached;
    private ChipColors defaultElevatedSuggestionChipColorsCached;
    private ToggleButtonColors defaultElevatedToggleButtonColorsCached;
    private IconButtonColors defaultFilledIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledIconToggleButtonColorsCached;
    private ButtonColors defaultFilledTonalButtonColorsCached;
    private IconButtonColors defaultFilledTonalIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached;
    private SelectableChipColors defaultFilterChipColorsCached;
    private FloatingToolbarColors defaultFloatingToolbarStandardColorsCached;
    private FloatingToolbarColors defaultFloatingToolbarVibrantColorsCached;
    private IconButtonColors defaultIconButtonColorsCached;
    private IconButtonColors defaultIconButtonVibrantColorsCached;
    private IconToggleButtonColors defaultIconToggleButtonColorsCached;
    private IconToggleButtonColors defaultIconToggleButtonVibrantColorsCached;
    private SelectableChipColors defaultInputChipColorsCached;
    private ListItemColors defaultListItemColorsCached;
    private MenuItemColors defaultMenuItemColorsCached;
    private MenuItemColors defaultMenuSelectableItemColorsCached;
    private MenuItemColors defaultMenuSelectableItemVibrantColorsCached;
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;
    private ButtonColors defaultOutlinedButtonColorsCached;
    private CardColors defaultOutlinedCardColorsCached;
    private IconButtonColors defaultOutlinedIconButtonColorsCached;
    private IconButtonColors defaultOutlinedIconButtonVibrantColorsCached;
    private IconToggleButtonColors defaultOutlinedIconToggleButtonColorsCached;
    private IconToggleButtonColors defaultOutlinedIconToggleButtonVibrantColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private ToggleButtonColors defaultOutlinedToggleButtonColorsCached;
    private RadioButtonColors defaultRadioButtonColorsCached;
    private RichTooltipColors defaultRichTooltipColorsCached;
    private ScrollFieldColors defaultScrollFieldColorsCached;
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;
    private ListItemColors defaultSegmentedListItemColorsCached;
    private NavigationItemColors defaultShortNavigationBarItemColorsCached;
    private SliderColors defaultSliderColorsCached;
    private ChipColors defaultSuggestionChipColorsCached;
    private SwitchColors defaultSwitchColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private TextFieldColors defaultTextFieldColorsCached;
    private TimePickerColors defaultTimePickerColorsCached;
    private ToggleButtonColors defaultToggleButtonColorsCached;
    private SelectableChipColors defaultTonalElevatedFilterChipColorsCached;
    private SelectableChipColors defaultTonalFilterChipColorsCached;
    private SelectableChipColors defaultTonalInputChipColorsCached;
    private ToggleButtonColors defaultTonalToggleButtonColorsCached;
    private TopAppBarColors defaultTopAppBarColorsCached;
    private DragHandleColors defaultVerticalDragHandleColorsCached;
    private NavigationItemColors defaultWideNavigationRailItemColorsCached;
    private WideNavigationRailColors defaultWideWideNavigationRailColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onPrimaryFixed;
    private final long onPrimaryFixedVariant;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSecondaryFixed;
    private final long onSecondaryFixedVariant;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long onTertiaryFixed;
    private final long onTertiaryFixedVariant;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long primaryFixed;
    private final long primaryFixedDim;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long secondaryFixed;
    private final long secondaryFixedDim;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;
    private final long tertiaryFixed;
    private final long tertiaryFixedDim;

    private ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49) {
        this.primary = j2;
        this.onPrimary = j3;
        this.primaryContainer = j4;
        this.onPrimaryContainer = j5;
        this.inversePrimary = j6;
        this.secondary = j7;
        this.onSecondary = j8;
        this.secondaryContainer = j9;
        this.onSecondaryContainer = j10;
        this.tertiary = j11;
        this.onTertiary = j12;
        this.tertiaryContainer = j13;
        this.onTertiaryContainer = j14;
        this.background = j15;
        this.onBackground = j16;
        this.surface = j17;
        this.onSurface = j18;
        this.surfaceVariant = j19;
        this.onSurfaceVariant = j20;
        this.surfaceTint = j21;
        this.inverseSurface = j22;
        this.inverseOnSurface = j23;
        this.error = j24;
        this.onError = j25;
        this.errorContainer = j26;
        this.onErrorContainer = j27;
        this.outline = j28;
        this.outlineVariant = j29;
        this.scrim = j30;
        this.surfaceBright = j31;
        this.surfaceDim = j32;
        this.surfaceContainer = j33;
        this.surfaceContainerHigh = j34;
        this.surfaceContainerHighest = j35;
        this.surfaceContainerLow = j36;
        this.surfaceContainerLowest = j37;
        this.primaryFixed = j38;
        this.primaryFixedDim = j39;
        this.onPrimaryFixed = j40;
        this.onPrimaryFixedVariant = j41;
        this.secondaryFixed = j42;
        this.secondaryFixedDim = j43;
        this.onSecondaryFixed = j44;
        this.onSecondaryFixedVariant = j45;
        this.tertiaryFixed = j46;
        this.tertiaryFixedDim = j47;
        this.onTertiaryFixed = j48;
        this.onTertiaryFixedVariant = j49;
    }

    /* renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4537copyCXl9yA$default(ColorScheme colorScheme, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i2, int i3, Object obj) {
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
        long j101;
        long j102;
        long j103;
        long j104;
        long j105;
        long j106;
        long j107;
        ColorScheme colorScheme2;
        long j108;
        long j109;
        long j110;
        long j111;
        long j112;
        long j113 = (i2 & 1) != 0 ? colorScheme.primary : j2;
        long j114 = (i2 & 2) != 0 ? colorScheme.onPrimary : j3;
        long j115 = (i2 & 4) != 0 ? colorScheme.primaryContainer : j4;
        long j116 = (i2 & 8) != 0 ? colorScheme.onPrimaryContainer : j5;
        long j117 = (i2 & 16) != 0 ? colorScheme.inversePrimary : j6;
        long j118 = (i2 & 32) != 0 ? colorScheme.secondary : j7;
        long j119 = (i2 & 64) != 0 ? colorScheme.onSecondary : j8;
        long j120 = j113;
        long j121 = (i2 & 128) != 0 ? colorScheme.secondaryContainer : j9;
        long j122 = (i2 & 256) != 0 ? colorScheme.onSecondaryContainer : j10;
        long j123 = (i2 & 512) != 0 ? colorScheme.tertiary : j11;
        long j124 = (i2 & 1024) != 0 ? colorScheme.onTertiary : j12;
        long j125 = (i2 & 2048) != 0 ? colorScheme.tertiaryContainer : j13;
        long j126 = (i2 & 4096) != 0 ? colorScheme.onTertiaryContainer : j14;
        long j127 = (i2 & 8192) != 0 ? colorScheme.background : j15;
        long j128 = (i2 & 16384) != 0 ? colorScheme.onBackground : j16;
        if ((i2 & 32768) != 0) {
            j38 = j128;
            j39 = colorScheme.surface;
        } else {
            j38 = j128;
            j39 = j17;
        }
        if ((i2 & 65536) != 0) {
            j40 = j39;
            j41 = colorScheme.onSurface;
        } else {
            j40 = j39;
            j41 = j18;
        }
        if ((i2 & 131072) != 0) {
            j42 = j41;
            j43 = colorScheme.surfaceVariant;
        } else {
            j42 = j41;
            j43 = j19;
        }
        if ((i2 & 262144) != 0) {
            j44 = j43;
            j45 = colorScheme.onSurfaceVariant;
        } else {
            j44 = j43;
            j45 = j20;
        }
        if ((i2 & 524288) != 0) {
            j46 = j45;
            j47 = colorScheme.surfaceTint;
        } else {
            j46 = j45;
            j47 = j21;
        }
        if ((i2 & 1048576) != 0) {
            j48 = j47;
            j49 = colorScheme.inverseSurface;
        } else {
            j48 = j47;
            j49 = j22;
        }
        if ((i2 & 2097152) != 0) {
            j50 = j49;
            j51 = colorScheme.inverseOnSurface;
        } else {
            j50 = j49;
            j51 = j23;
        }
        if ((i2 & 4194304) != 0) {
            j52 = j51;
            j53 = colorScheme.error;
        } else {
            j52 = j51;
            j53 = j24;
        }
        if ((i2 & 8388608) != 0) {
            j54 = j53;
            j55 = colorScheme.onError;
        } else {
            j54 = j53;
            j55 = j25;
        }
        if ((i2 & 16777216) != 0) {
            j56 = j55;
            j57 = colorScheme.errorContainer;
        } else {
            j56 = j55;
            j57 = j26;
        }
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            j58 = j57;
            j59 = colorScheme.onErrorContainer;
        } else {
            j58 = j57;
            j59 = j27;
        }
        if ((i2 & 67108864) != 0) {
            j60 = j59;
            j61 = colorScheme.outline;
        } else {
            j60 = j59;
            j61 = j28;
        }
        if ((i2 & 134217728) != 0) {
            j62 = j61;
            j63 = colorScheme.outlineVariant;
        } else {
            j62 = j61;
            j63 = j29;
        }
        if ((i2 & 268435456) != 0) {
            j64 = j63;
            j65 = colorScheme.scrim;
        } else {
            j64 = j63;
            j65 = j30;
        }
        if ((i2 & 536870912) != 0) {
            j66 = j65;
            j67 = colorScheme.surfaceBright;
        } else {
            j66 = j65;
            j67 = j31;
        }
        if ((i2 & 1073741824) != 0) {
            j68 = j67;
            j69 = colorScheme.surfaceDim;
        } else {
            j68 = j67;
            j69 = j32;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            j70 = j69;
            j71 = colorScheme.surfaceContainer;
        } else {
            j70 = j69;
            j71 = j33;
        }
        if ((i3 & 1) != 0) {
            j72 = j71;
            j73 = colorScheme.surfaceContainerHigh;
        } else {
            j72 = j71;
            j73 = j34;
        }
        if ((i3 & 2) != 0) {
            j74 = j73;
            j75 = colorScheme.surfaceContainerHighest;
        } else {
            j74 = j73;
            j75 = j35;
        }
        if ((i3 & 4) != 0) {
            j76 = j75;
            j77 = colorScheme.surfaceContainerLow;
        } else {
            j76 = j75;
            j77 = j36;
        }
        if ((i3 & 8) != 0) {
            j79 = j77;
            j78 = colorScheme.surfaceContainerLowest;
            j81 = j66;
            j82 = j68;
            j83 = j70;
            j84 = j72;
            j85 = j74;
            j86 = j76;
            j88 = j52;
            j89 = j54;
            j90 = j56;
            j91 = j58;
            j92 = j60;
            j93 = j62;
            j80 = j64;
            j95 = j38;
            j96 = j40;
            j97 = j42;
            j98 = j44;
            j99 = j46;
            j100 = j48;
            j87 = j50;
            j102 = j121;
            j103 = j122;
            j104 = j123;
            j105 = j124;
            j106 = j125;
            j107 = j126;
            j94 = j127;
            colorScheme2 = colorScheme;
            j108 = j114;
            j109 = j115;
            j110 = j116;
            j111 = j117;
            j112 = j118;
            j101 = j119;
        } else {
            j78 = j37;
            j79 = j77;
            j80 = j64;
            j81 = j66;
            j82 = j68;
            j83 = j70;
            j84 = j72;
            j85 = j74;
            j86 = j76;
            j87 = j50;
            j88 = j52;
            j89 = j54;
            j90 = j56;
            j91 = j58;
            j92 = j60;
            j93 = j62;
            j94 = j127;
            j95 = j38;
            j96 = j40;
            j97 = j42;
            j98 = j44;
            j99 = j46;
            j100 = j48;
            j101 = j119;
            j102 = j121;
            j103 = j122;
            j104 = j123;
            j105 = j124;
            j106 = j125;
            j107 = j126;
            colorScheme2 = colorScheme;
            j108 = j114;
            j109 = j115;
            j110 = j116;
            j111 = j117;
            j112 = j118;
        }
        return colorScheme2.m4540copyCXl9yA(j120, j108, j109, j110, j111, j112, j101, j102, j103, j104, j105, j106, j107, j94, j95, j96, j97, j98, j99, j100, j87, j88, j89, j90, j91, j92, j93, j80, j81, j82, j83, j84, j85, j86, j79, j78);
    }

    /* renamed from: copy-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4538copyG1PFcw$default(ColorScheme colorScheme, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i2, Object obj) {
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
        ColorScheme colorScheme2;
        long j80;
        long j81;
        long j82;
        long j83;
        long j84;
        long j85 = (i2 & 1) != 0 ? colorScheme.primary : j2;
        long j86 = (i2 & 2) != 0 ? colorScheme.onPrimary : j3;
        long j87 = (i2 & 4) != 0 ? colorScheme.primaryContainer : j4;
        long j88 = (i2 & 8) != 0 ? colorScheme.onPrimaryContainer : j5;
        long j89 = (i2 & 16) != 0 ? colorScheme.inversePrimary : j6;
        long j90 = (i2 & 32) != 0 ? colorScheme.secondary : j7;
        long j91 = (i2 & 64) != 0 ? colorScheme.onSecondary : j8;
        long j92 = j85;
        long j93 = (i2 & 128) != 0 ? colorScheme.secondaryContainer : j9;
        long j94 = (i2 & 256) != 0 ? colorScheme.onSecondaryContainer : j10;
        long j95 = (i2 & 512) != 0 ? colorScheme.tertiary : j11;
        long j96 = (i2 & 1024) != 0 ? colorScheme.onTertiary : j12;
        long j97 = (i2 & 2048) != 0 ? colorScheme.tertiaryContainer : j13;
        long j98 = (i2 & 4096) != 0 ? colorScheme.onTertiaryContainer : j14;
        long j99 = (i2 & 8192) != 0 ? colorScheme.background : j15;
        long j100 = (i2 & 16384) != 0 ? colorScheme.onBackground : j16;
        if ((i2 & 32768) != 0) {
            j31 = j100;
            j32 = colorScheme.surface;
        } else {
            j31 = j100;
            j32 = j17;
        }
        if ((i2 & 65536) != 0) {
            j33 = j32;
            j34 = colorScheme.onSurface;
        } else {
            j33 = j32;
            j34 = j18;
        }
        if ((i2 & 131072) != 0) {
            j35 = j34;
            j36 = colorScheme.surfaceVariant;
        } else {
            j35 = j34;
            j36 = j19;
        }
        if ((i2 & 262144) != 0) {
            j37 = j36;
            j38 = colorScheme.onSurfaceVariant;
        } else {
            j37 = j36;
            j38 = j20;
        }
        if ((i2 & 524288) != 0) {
            j39 = j38;
            j40 = colorScheme.surfaceTint;
        } else {
            j39 = j38;
            j40 = j21;
        }
        if ((i2 & 1048576) != 0) {
            j41 = j40;
            j42 = colorScheme.inverseSurface;
        } else {
            j41 = j40;
            j42 = j22;
        }
        if ((i2 & 2097152) != 0) {
            j43 = j42;
            j44 = colorScheme.inverseOnSurface;
        } else {
            j43 = j42;
            j44 = j23;
        }
        if ((i2 & 4194304) != 0) {
            j45 = j44;
            j46 = colorScheme.error;
        } else {
            j45 = j44;
            j46 = j24;
        }
        if ((i2 & 8388608) != 0) {
            j47 = j46;
            j48 = colorScheme.onError;
        } else {
            j47 = j46;
            j48 = j25;
        }
        if ((i2 & 16777216) != 0) {
            j49 = j48;
            j50 = colorScheme.errorContainer;
        } else {
            j49 = j48;
            j50 = j26;
        }
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            j51 = j50;
            j52 = colorScheme.onErrorContainer;
        } else {
            j51 = j50;
            j52 = j27;
        }
        if ((i2 & 67108864) != 0) {
            j53 = j52;
            j54 = colorScheme.outline;
        } else {
            j53 = j52;
            j54 = j28;
        }
        if ((i2 & 134217728) != 0) {
            j55 = j54;
            j56 = colorScheme.outlineVariant;
        } else {
            j55 = j54;
            j56 = j29;
        }
        if ((i2 & 268435456) != 0) {
            j58 = j56;
            j57 = colorScheme.scrim;
            j60 = j45;
            j61 = j47;
            j62 = j49;
            j63 = j51;
            j64 = j53;
            j65 = j55;
            j67 = j31;
            j68 = j33;
            j69 = j35;
            j70 = j37;
            j71 = j39;
            j72 = j41;
            j59 = j43;
            j74 = j93;
            j75 = j94;
            j76 = j95;
            j77 = j96;
            j78 = j97;
            j79 = j98;
            j66 = j99;
            colorScheme2 = colorScheme;
            j80 = j86;
            j81 = j87;
            j82 = j88;
            j83 = j89;
            j84 = j90;
            j73 = j91;
        } else {
            j57 = j30;
            j58 = j56;
            j59 = j43;
            j60 = j45;
            j61 = j47;
            j62 = j49;
            j63 = j51;
            j64 = j53;
            j65 = j55;
            j66 = j99;
            j67 = j31;
            j68 = j33;
            j69 = j35;
            j70 = j37;
            j71 = j39;
            j72 = j41;
            j73 = j91;
            j74 = j93;
            j75 = j94;
            j76 = j95;
            j77 = j96;
            j78 = j97;
            j79 = j98;
            colorScheme2 = colorScheme;
            j80 = j86;
            j81 = j87;
            j82 = j88;
            j83 = j89;
            j84 = j90;
        }
        return colorScheme2.m4541copyG1PFcw(j92, j80, j81, j82, j83, j84, j73, j74, j75, j76, j77, j78, j79, j66, j67, j68, j69, j70, j71, j72, j59, j60, j61, j62, j63, j64, j65, j58, j57);
    }

    /* renamed from: copy-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m4539copy_VG5OTI$default(ColorScheme colorScheme, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, int i2, int i3, Object obj) {
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
        long j101;
        long j102;
        long j103;
        long j104;
        long j105;
        long j106;
        long j107;
        long j108;
        long j109;
        long j110;
        long j111;
        long j112;
        long j113;
        long j114;
        long j115;
        long j116;
        long j117;
        long j118;
        long j119;
        long j120;
        long j121;
        long j122;
        long j123;
        long j124;
        long j125;
        long j126;
        long j127;
        long j128;
        long j129;
        long j130;
        long j131;
        long j132;
        long j133;
        long j134;
        long j135;
        long j136;
        long j137;
        long j138;
        long j139;
        long j140;
        long j141;
        long j142;
        long j143;
        long j144;
        long j145;
        long j146;
        long j147;
        long j148;
        long j149;
        long j150;
        long j151;
        long j152;
        long j153;
        long j154;
        long j155;
        long j156;
        long j157;
        long j158;
        ColorScheme colorScheme2;
        long j159;
        long j160;
        long j161 = (i2 & 1) != 0 ? colorScheme.primary : j2;
        long j162 = (i2 & 2) != 0 ? colorScheme.onPrimary : j3;
        long j163 = (i2 & 4) != 0 ? colorScheme.primaryContainer : j4;
        long j164 = (i2 & 8) != 0 ? colorScheme.onPrimaryContainer : j5;
        long j165 = (i2 & 16) != 0 ? colorScheme.inversePrimary : j6;
        long j166 = (i2 & 32) != 0 ? colorScheme.secondary : j7;
        if ((i2 & 64) != 0) {
            j50 = j161;
            j51 = colorScheme.onSecondary;
        } else {
            j50 = j161;
            j51 = j8;
        }
        long j167 = j51;
        long j168 = (i2 & 128) != 0 ? colorScheme.secondaryContainer : j9;
        long j169 = (i2 & 256) != 0 ? colorScheme.onSecondaryContainer : j10;
        long j170 = (i2 & 512) != 0 ? colorScheme.tertiary : j11;
        long j171 = (i2 & 1024) != 0 ? colorScheme.onTertiary : j12;
        long j172 = (i2 & 2048) != 0 ? colorScheme.tertiaryContainer : j13;
        long j173 = (i2 & 4096) != 0 ? colorScheme.onTertiaryContainer : j14;
        long j174 = (i2 & 8192) != 0 ? colorScheme.background : j15;
        long j175 = (i2 & 16384) != 0 ? colorScheme.onBackground : j16;
        if ((i2 & 32768) != 0) {
            j52 = j175;
            j53 = colorScheme.surface;
        } else {
            j52 = j175;
            j53 = j17;
        }
        if ((i2 & 65536) != 0) {
            j54 = j53;
            j55 = colorScheme.onSurface;
        } else {
            j54 = j53;
            j55 = j18;
        }
        if ((i2 & 131072) != 0) {
            j56 = j55;
            j57 = colorScheme.surfaceVariant;
        } else {
            j56 = j55;
            j57 = j19;
        }
        if ((i2 & 262144) != 0) {
            j58 = j57;
            j59 = colorScheme.onSurfaceVariant;
        } else {
            j58 = j57;
            j59 = j20;
        }
        if ((i2 & 524288) != 0) {
            j60 = j59;
            j61 = colorScheme.surfaceTint;
        } else {
            j60 = j59;
            j61 = j21;
        }
        if ((i2 & 1048576) != 0) {
            j62 = j61;
            j63 = colorScheme.inverseSurface;
        } else {
            j62 = j61;
            j63 = j22;
        }
        if ((i2 & 2097152) != 0) {
            j64 = j63;
            j65 = colorScheme.inverseOnSurface;
        } else {
            j64 = j63;
            j65 = j23;
        }
        if ((i2 & 4194304) != 0) {
            j66 = j65;
            j67 = colorScheme.error;
        } else {
            j66 = j65;
            j67 = j24;
        }
        if ((i2 & 8388608) != 0) {
            j68 = j67;
            j69 = colorScheme.onError;
        } else {
            j68 = j67;
            j69 = j25;
        }
        if ((i2 & 16777216) != 0) {
            j70 = j69;
            j71 = colorScheme.errorContainer;
        } else {
            j70 = j69;
            j71 = j26;
        }
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            j72 = j71;
            j73 = colorScheme.onErrorContainer;
        } else {
            j72 = j71;
            j73 = j27;
        }
        if ((i2 & 67108864) != 0) {
            j74 = j73;
            j75 = colorScheme.outline;
        } else {
            j74 = j73;
            j75 = j28;
        }
        if ((i2 & 134217728) != 0) {
            j76 = j75;
            j77 = colorScheme.outlineVariant;
        } else {
            j76 = j75;
            j77 = j29;
        }
        if ((i2 & 268435456) != 0) {
            j78 = j77;
            j79 = colorScheme.scrim;
        } else {
            j78 = j77;
            j79 = j30;
        }
        if ((i2 & 536870912) != 0) {
            j80 = j79;
            j81 = colorScheme.surfaceBright;
        } else {
            j80 = j79;
            j81 = j31;
        }
        if ((i2 & 1073741824) != 0) {
            j82 = j81;
            j83 = colorScheme.surfaceDim;
        } else {
            j82 = j81;
            j83 = j32;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            j84 = j83;
            j85 = colorScheme.surfaceContainer;
        } else {
            j84 = j83;
            j85 = j33;
        }
        if ((i3 & 1) != 0) {
            j86 = j85;
            j87 = colorScheme.surfaceContainerHigh;
        } else {
            j86 = j85;
            j87 = j34;
        }
        if ((i3 & 2) != 0) {
            j88 = j87;
            j89 = colorScheme.surfaceContainerHighest;
        } else {
            j88 = j87;
            j89 = j35;
        }
        if ((i3 & 4) != 0) {
            j90 = j89;
            j91 = colorScheme.surfaceContainerLow;
        } else {
            j90 = j89;
            j91 = j36;
        }
        if ((i3 & 8) != 0) {
            j92 = j91;
            j93 = colorScheme.surfaceContainerLowest;
        } else {
            j92 = j91;
            j93 = j37;
        }
        if ((i3 & 16) != 0) {
            j94 = j93;
            j95 = colorScheme.primaryFixed;
        } else {
            j94 = j93;
            j95 = j38;
        }
        if ((i3 & 32) != 0) {
            j96 = j95;
            j97 = colorScheme.primaryFixedDim;
        } else {
            j96 = j95;
            j97 = j39;
        }
        if ((i3 & 64) != 0) {
            j98 = j97;
            j99 = colorScheme.onPrimaryFixed;
        } else {
            j98 = j97;
            j99 = j40;
        }
        if ((i3 & 128) != 0) {
            j100 = j99;
            j101 = colorScheme.onPrimaryFixedVariant;
        } else {
            j100 = j99;
            j101 = j41;
        }
        if ((i3 & 256) != 0) {
            j102 = j101;
            j103 = colorScheme.secondaryFixed;
        } else {
            j102 = j101;
            j103 = j42;
        }
        if ((i3 & 512) != 0) {
            j104 = j103;
            j105 = colorScheme.secondaryFixedDim;
        } else {
            j104 = j103;
            j105 = j43;
        }
        if ((i3 & 1024) != 0) {
            j106 = j105;
            j107 = colorScheme.onSecondaryFixed;
        } else {
            j106 = j105;
            j107 = j44;
        }
        if ((i3 & 2048) != 0) {
            j108 = j107;
            j109 = colorScheme.onSecondaryFixedVariant;
        } else {
            j108 = j107;
            j109 = j45;
        }
        if ((i3 & 4096) != 0) {
            j110 = j109;
            j111 = colorScheme.tertiaryFixed;
        } else {
            j110 = j109;
            j111 = j46;
        }
        if ((i3 & 8192) != 0) {
            j112 = j111;
            j113 = colorScheme.tertiaryFixedDim;
        } else {
            j112 = j111;
            j113 = j47;
        }
        long j176 = (i3 & 16384) != 0 ? colorScheme.onTertiaryFixed : j48;
        if ((i3 & 32768) != 0) {
            j115 = j176;
            j114 = colorScheme.onTertiaryFixedVariant;
            j117 = j104;
            j118 = j106;
            j119 = j108;
            j120 = j110;
            j121 = j112;
            j122 = j113;
            j124 = j92;
            j125 = j94;
            j126 = j96;
            j127 = j98;
            j128 = j100;
            j116 = j102;
            j130 = j80;
            j131 = j82;
            j132 = j84;
            j133 = j86;
            j134 = j88;
            j123 = j90;
            j136 = j68;
            j137 = j70;
            j138 = j72;
            j139 = j74;
            j140 = j76;
            j129 = j78;
            j142 = j56;
            j143 = j58;
            j144 = j60;
            j145 = j62;
            j146 = j64;
            j135 = j66;
            j148 = j171;
            j149 = j172;
            j150 = j173;
            j151 = j174;
            j152 = j52;
            j141 = j54;
            j154 = j165;
            j155 = j166;
            j156 = j167;
            j157 = j168;
            j158 = j169;
            j147 = j170;
            colorScheme2 = colorScheme;
            j159 = j162;
            j160 = j163;
            j153 = j164;
        } else {
            j114 = j49;
            j115 = j176;
            j116 = j102;
            j117 = j104;
            j118 = j106;
            j119 = j108;
            j120 = j110;
            j121 = j112;
            j122 = j113;
            j123 = j90;
            j124 = j92;
            j125 = j94;
            j126 = j96;
            j127 = j98;
            j128 = j100;
            j129 = j78;
            j130 = j80;
            j131 = j82;
            j132 = j84;
            j133 = j86;
            j134 = j88;
            j135 = j66;
            j136 = j68;
            j137 = j70;
            j138 = j72;
            j139 = j74;
            j140 = j76;
            j141 = j54;
            j142 = j56;
            j143 = j58;
            j144 = j60;
            j145 = j62;
            j146 = j64;
            j147 = j170;
            j148 = j171;
            j149 = j172;
            j150 = j173;
            j151 = j174;
            j152 = j52;
            j153 = j164;
            j154 = j165;
            j155 = j166;
            j156 = j167;
            j157 = j168;
            j158 = j169;
            colorScheme2 = colorScheme;
            j159 = j162;
            j160 = j163;
        }
        return colorScheme2.m4542copy_VG5OTI(j50, j159, j160, j153, j154, j155, j156, j157, j158, j147, j148, j149, j150, j151, j152, j141, j142, j143, j144, j145, j146, j135, j136, j137, j138, j139, j140, j129, j130, j131, j132, j133, j134, j123, j124, j125, j126, j127, j128, j116, j117, j118, j119, j120, j121, j122, j115, j114);
    }

    /* renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final /* synthetic */ ColorScheme m4540copyCXl9yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return m4539copy_VG5OTI$default(this, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m4541copyG1PFcw(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        return m4539copy_VG5OTI$default(this, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: copy-_VG5OTI, reason: not valid java name */
    public final ColorScheme m4542copy_VG5OTI(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4543getBackground0d7_KjU() {
        return this.background;
    }

    public final ChipColors getDefaultAssistChipColorsCached$material3() {
        return this.defaultAssistChipColorsCached;
    }

    public final ButtonColors getDefaultButtonColorsCached$material3() {
        return this.defaultButtonColorsCached;
    }

    public final CardColors getDefaultCardColorsCached$material3() {
        return this.defaultCardColorsCached;
    }

    public final CheckboxColors getDefaultCheckboxColorsCached$material3() {
        return this.defaultCheckboxColorsCached;
    }

    public final DatePickerColors getDefaultDatePickerColorsCached$material3() {
        return this.defaultDatePickerColorsCached;
    }

    public final ChipColors getDefaultElevatedAssistChipColorsCached$material3() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    public final ButtonColors getDefaultElevatedButtonColorsCached$material3() {
        return this.defaultElevatedButtonColorsCached;
    }

    public final CardColors getDefaultElevatedCardColorsCached$material3() {
        return this.defaultElevatedCardColorsCached;
    }

    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached$material3() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    public final ChipColors getDefaultElevatedSuggestionChipColorsCached$material3() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    public final ToggleButtonColors getDefaultElevatedToggleButtonColorsCached$material3() {
        return this.defaultElevatedToggleButtonColorsCached;
    }

    public final IconButtonColors getDefaultFilledIconButtonColorsCached$material3() {
        return this.defaultFilledIconButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached$material3() {
        return this.defaultFilledIconToggleButtonColorsCached;
    }

    public final ButtonColors getDefaultFilledTonalButtonColorsCached$material3() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached$material3() {
        return this.defaultFilledTonalIconButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColorsCached$material3() {
        return this.defaultFilledTonalIconToggleButtonColorsCached;
    }

    public final SelectableChipColors getDefaultFilterChipColorsCached$material3() {
        return this.defaultFilterChipColorsCached;
    }

    public final FloatingToolbarColors getDefaultFloatingToolbarStandardColorsCached$material3() {
        return this.defaultFloatingToolbarStandardColorsCached;
    }

    public final FloatingToolbarColors getDefaultFloatingToolbarVibrantColorsCached$material3() {
        return this.defaultFloatingToolbarVibrantColorsCached;
    }

    public final IconButtonColors getDefaultIconButtonColorsCached$material3() {
        return this.defaultIconButtonColorsCached;
    }

    public final IconButtonColors getDefaultIconButtonVibrantColorsCached$material3() {
        return this.defaultIconButtonVibrantColorsCached;
    }

    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached$material3() {
        return this.defaultIconToggleButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultIconToggleButtonVibrantColorsCached$material3() {
        return this.defaultIconToggleButtonVibrantColorsCached;
    }

    public final SelectableChipColors getDefaultInputChipColorsCached$material3() {
        return this.defaultInputChipColorsCached;
    }

    public final ListItemColors getDefaultListItemColorsCached$material3() {
        return this.defaultListItemColorsCached;
    }

    public final MenuItemColors getDefaultMenuItemColorsCached$material3() {
        return this.defaultMenuItemColorsCached;
    }

    public final MenuItemColors getDefaultMenuSelectableItemColorsCached$material3() {
        return this.defaultMenuSelectableItemColorsCached;
    }

    public final MenuItemColors getDefaultMenuSelectableItemVibrantColorsCached$material3() {
        return this.defaultMenuSelectableItemVibrantColorsCached;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached$material3() {
        return this.defaultNavigationBarItemColorsCached;
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached$material3() {
        return this.defaultNavigationRailItemColorsCached;
    }

    public final ButtonColors getDefaultOutlinedButtonColorsCached$material3() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public final CardColors getDefaultOutlinedCardColorsCached$material3() {
        return this.defaultOutlinedCardColorsCached;
    }

    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached$material3() {
        return this.defaultOutlinedIconButtonColorsCached;
    }

    public final IconButtonColors getDefaultOutlinedIconButtonVibrantColorsCached$material3() {
        return this.defaultOutlinedIconButtonVibrantColorsCached;
    }

    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonColorsCached$material3() {
        return this.defaultOutlinedIconToggleButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonVibrantColorsCached$material3() {
        return this.defaultOutlinedIconToggleButtonVibrantColorsCached;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached$material3() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final ToggleButtonColors getDefaultOutlinedToggleButtonColorsCached$material3() {
        return this.defaultOutlinedToggleButtonColorsCached;
    }

    public final RadioButtonColors getDefaultRadioButtonColorsCached$material3() {
        return this.defaultRadioButtonColorsCached;
    }

    public final RichTooltipColors getDefaultRichTooltipColorsCached$material3() {
        return this.defaultRichTooltipColorsCached;
    }

    public final ScrollFieldColors getDefaultScrollFieldColorsCached$material3() {
        return this.defaultScrollFieldColorsCached;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached$material3() {
        return this.defaultSegmentedButtonColorsCached;
    }

    public final ListItemColors getDefaultSegmentedListItemColorsCached$material3() {
        return this.defaultSegmentedListItemColorsCached;
    }

    public final NavigationItemColors getDefaultShortNavigationBarItemColorsCached$material3() {
        return this.defaultShortNavigationBarItemColorsCached;
    }

    public final SliderColors getDefaultSliderColorsCached$material3() {
        return this.defaultSliderColorsCached;
    }

    public final ChipColors getDefaultSuggestionChipColorsCached$material3() {
        return this.defaultSuggestionChipColorsCached;
    }

    public final SwitchColors getDefaultSwitchColorsCached$material3() {
        return this.defaultSwitchColorsCached;
    }

    public final ButtonColors getDefaultTextButtonColorsCached$material3() {
        return this.defaultTextButtonColorsCached;
    }

    public final TextFieldColors getDefaultTextFieldColorsCached$material3() {
        return this.defaultTextFieldColorsCached;
    }

    public final TimePickerColors getDefaultTimePickerColorsCached$material3() {
        return this.defaultTimePickerColorsCached;
    }

    public final ToggleButtonColors getDefaultToggleButtonColorsCached$material3() {
        return this.defaultToggleButtonColorsCached;
    }

    public final SelectableChipColors getDefaultTonalElevatedFilterChipColorsCached$material3() {
        return this.defaultTonalElevatedFilterChipColorsCached;
    }

    public final SelectableChipColors getDefaultTonalFilterChipColorsCached$material3() {
        return this.defaultTonalFilterChipColorsCached;
    }

    public final SelectableChipColors getDefaultTonalInputChipColorsCached$material3() {
        return this.defaultTonalInputChipColorsCached;
    }

    public final ToggleButtonColors getDefaultTonalToggleButtonColorsCached$material3() {
        return this.defaultTonalToggleButtonColorsCached;
    }

    public final TopAppBarColors getDefaultTopAppBarColorsCached$material3() {
        return this.defaultTopAppBarColorsCached;
    }

    public final DragHandleColors getDefaultVerticalDragHandleColorsCached$material3() {
        return this.defaultVerticalDragHandleColorsCached;
    }

    public final NavigationItemColors getDefaultWideNavigationRailItemColorsCached$material3() {
        return this.defaultWideNavigationRailItemColorsCached;
    }

    public final WideNavigationRailColors getDefaultWideWideNavigationRailColorsCached$material3() {
        return this.defaultWideWideNavigationRailColorsCached;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m4544getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m4545getErrorContainer0d7_KjU() {
        return this.errorContainer;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m4546getInverseOnSurface0d7_KjU() {
        return this.inverseOnSurface;
    }

    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m4547getInversePrimary0d7_KjU() {
        return this.inversePrimary;
    }

    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m4548getInverseSurface0d7_KjU() {
        return this.inverseSurface;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m4549getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m4550getOnError0d7_KjU() {
        return this.onError;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m4551getOnErrorContainer0d7_KjU() {
        return this.onErrorContainer;
    }

    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m4552getOnPrimary0d7_KjU() {
        return this.onPrimary;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m4553getOnPrimaryContainer0d7_KjU() {
        return this.onPrimaryContainer;
    }

    /* renamed from: getOnPrimaryFixed-0d7_KjU, reason: not valid java name */
    public final long m4554getOnPrimaryFixed0d7_KjU() {
        return this.onPrimaryFixed;
    }

    /* renamed from: getOnPrimaryFixedVariant-0d7_KjU, reason: not valid java name */
    public final long m4555getOnPrimaryFixedVariant0d7_KjU() {
        return this.onPrimaryFixedVariant;
    }

    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m4556getOnSecondary0d7_KjU() {
        return this.onSecondary;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m4557getOnSecondaryContainer0d7_KjU() {
        return this.onSecondaryContainer;
    }

    /* renamed from: getOnSecondaryFixed-0d7_KjU, reason: not valid java name */
    public final long m4558getOnSecondaryFixed0d7_KjU() {
        return this.onSecondaryFixed;
    }

    /* renamed from: getOnSecondaryFixedVariant-0d7_KjU, reason: not valid java name */
    public final long m4559getOnSecondaryFixedVariant0d7_KjU() {
        return this.onSecondaryFixedVariant;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m4560getOnSurface0d7_KjU() {
        return this.onSurface;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m4561getOnSurfaceVariant0d7_KjU() {
        return this.onSurfaceVariant;
    }

    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m4562getOnTertiary0d7_KjU() {
        return this.onTertiary;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m4563getOnTertiaryContainer0d7_KjU() {
        return this.onTertiaryContainer;
    }

    /* renamed from: getOnTertiaryFixed-0d7_KjU, reason: not valid java name */
    public final long m4564getOnTertiaryFixed0d7_KjU() {
        return this.onTertiaryFixed;
    }

    /* renamed from: getOnTertiaryFixedVariant-0d7_KjU, reason: not valid java name */
    public final long m4565getOnTertiaryFixedVariant0d7_KjU() {
        return this.onTertiaryFixedVariant;
    }

    /* renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m4566getOutline0d7_KjU() {
        return this.outline;
    }

    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m4567getOutlineVariant0d7_KjU() {
        return this.outlineVariant;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m4568getPrimary0d7_KjU() {
        return this.primary;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m4569getPrimaryContainer0d7_KjU() {
        return this.primaryContainer;
    }

    /* renamed from: getPrimaryFixed-0d7_KjU, reason: not valid java name */
    public final long m4570getPrimaryFixed0d7_KjU() {
        return this.primaryFixed;
    }

    /* renamed from: getPrimaryFixedDim-0d7_KjU, reason: not valid java name */
    public final long m4571getPrimaryFixedDim0d7_KjU() {
        return this.primaryFixedDim;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m4572getScrim0d7_KjU() {
        return this.scrim;
    }

    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m4573getSecondary0d7_KjU() {
        return this.secondary;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m4574getSecondaryContainer0d7_KjU() {
        return this.secondaryContainer;
    }

    /* renamed from: getSecondaryFixed-0d7_KjU, reason: not valid java name */
    public final long m4575getSecondaryFixed0d7_KjU() {
        return this.secondaryFixed;
    }

    /* renamed from: getSecondaryFixedDim-0d7_KjU, reason: not valid java name */
    public final long m4576getSecondaryFixedDim0d7_KjU() {
        return this.secondaryFixedDim;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m4577getSurface0d7_KjU() {
        return this.surface;
    }

    /* renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name */
    public final long m4578getSurfaceBright0d7_KjU() {
        return this.surfaceBright;
    }

    /* renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name */
    public final long m4579getSurfaceContainer0d7_KjU() {
        return this.surfaceContainer;
    }

    /* renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name */
    public final long m4580getSurfaceContainerHigh0d7_KjU() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name */
    public final long m4581getSurfaceContainerHighest0d7_KjU() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name */
    public final long m4582getSurfaceContainerLow0d7_KjU() {
        return this.surfaceContainerLow;
    }

    /* renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name */
    public final long m4583getSurfaceContainerLowest0d7_KjU() {
        return this.surfaceContainerLowest;
    }

    /* renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name */
    public final long m4584getSurfaceDim0d7_KjU() {
        return this.surfaceDim;
    }

    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m4585getSurfaceTint0d7_KjU() {
        return this.surfaceTint;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m4586getSurfaceVariant0d7_KjU() {
        return this.surfaceVariant;
    }

    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m4587getTertiary0d7_KjU() {
        return this.tertiary;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m4588getTertiaryContainer0d7_KjU() {
        return this.tertiaryContainer;
    }

    /* renamed from: getTertiaryFixed-0d7_KjU, reason: not valid java name */
    public final long m4589getTertiaryFixed0d7_KjU() {
        return this.tertiaryFixed;
    }

    /* renamed from: getTertiaryFixedDim-0d7_KjU, reason: not valid java name */
    public final long m4590getTertiaryFixedDim0d7_KjU() {
        return this.tertiaryFixedDim;
    }

    public final void setDefaultAssistChipColorsCached$material3(ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    public final void setDefaultButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    public final void setDefaultCardColorsCached$material3(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    public final void setDefaultCheckboxColorsCached$material3(CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    public final void setDefaultDatePickerColorsCached$material3(DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3(ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    public final void setDefaultElevatedButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    public final void setDefaultElevatedCardColorsCached$material3(CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3(ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultElevatedToggleButtonColorsCached$material3(ToggleButtonColors toggleButtonColors) {
        this.defaultElevatedToggleButtonColorsCached = toggleButtonColors;
    }

    public final void setDefaultFilledIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultFilledIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    public final void setDefaultFilledTonalIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultFilledTonalIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledTonalIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledTonalIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilterChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultFloatingToolbarStandardColorsCached$material3(FloatingToolbarColors floatingToolbarColors) {
        this.defaultFloatingToolbarStandardColorsCached = floatingToolbarColors;
    }

    public final void setDefaultFloatingToolbarVibrantColorsCached$material3(FloatingToolbarColors floatingToolbarColors) {
        this.defaultFloatingToolbarVibrantColorsCached = floatingToolbarColors;
    }

    public final void setDefaultIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultIconButtonVibrantColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultIconButtonVibrantColorsCached = iconButtonColors;
    }

    public final void setDefaultIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultIconToggleButtonVibrantColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonVibrantColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultInputChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    public final void setDefaultListItemColorsCached$material3(ListItemColors listItemColors) {
        this.defaultListItemColorsCached = listItemColors;
    }

    public final void setDefaultMenuItemColorsCached$material3(MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    public final void setDefaultMenuSelectableItemColorsCached$material3(MenuItemColors menuItemColors) {
        this.defaultMenuSelectableItemColorsCached = menuItemColors;
    }

    public final void setDefaultMenuSelectableItemVibrantColorsCached$material3(MenuItemColors menuItemColors) {
        this.defaultMenuSelectableItemVibrantColorsCached = menuItemColors;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3(NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3(NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    public final void setDefaultOutlinedCardColorsCached$material3(CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    public final void setDefaultOutlinedIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultOutlinedIconButtonVibrantColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonVibrantColorsCached = iconButtonColors;
    }

    public final void setDefaultOutlinedIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultOutlinedIconToggleButtonVibrantColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonVibrantColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultOutlinedToggleButtonColorsCached$material3(ToggleButtonColors toggleButtonColors) {
        this.defaultOutlinedToggleButtonColorsCached = toggleButtonColors;
    }

    public final void setDefaultRadioButtonColorsCached$material3(RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    public final void setDefaultRichTooltipColorsCached$material3(RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public final void setDefaultScrollFieldColorsCached$material3(ScrollFieldColors scrollFieldColors) {
        this.defaultScrollFieldColorsCached = scrollFieldColors;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3(SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    public final void setDefaultSegmentedListItemColorsCached$material3(ListItemColors listItemColors) {
        this.defaultSegmentedListItemColorsCached = listItemColors;
    }

    public final void setDefaultShortNavigationBarItemColorsCached$material3(NavigationItemColors navigationItemColors) {
        this.defaultShortNavigationBarItemColorsCached = navigationItemColors;
    }

    public final void setDefaultSliderColorsCached$material3(SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    public final void setDefaultSuggestionChipColorsCached$material3(ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultSwitchColorsCached$material3(SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    public final void setDefaultTextButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    public final void setDefaultTextFieldColorsCached$material3(TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultTimePickerColorsCached$material3(TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    public final void setDefaultToggleButtonColorsCached$material3(ToggleButtonColors toggleButtonColors) {
        this.defaultToggleButtonColorsCached = toggleButtonColors;
    }

    public final void setDefaultTonalElevatedFilterChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultTonalElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultTonalFilterChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultTonalFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultTonalInputChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultTonalInputChipColorsCached = selectableChipColors;
    }

    public final void setDefaultTonalToggleButtonColorsCached$material3(ToggleButtonColors toggleButtonColors) {
        this.defaultTonalToggleButtonColorsCached = toggleButtonColors;
    }

    public final void setDefaultTopAppBarColorsCached$material3(TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultVerticalDragHandleColorsCached$material3(DragHandleColors dragHandleColors) {
        this.defaultVerticalDragHandleColorsCached = dragHandleColors;
    }

    public final void setDefaultWideNavigationRailItemColorsCached$material3(NavigationItemColors navigationItemColors) {
        this.defaultWideNavigationRailItemColorsCached = navigationItemColors;
    }

    public final void setDefaultWideWideNavigationRailColorsCached$material3(WideNavigationRailColors wideNavigationRailColors) {
        this.defaultWideWideNavigationRailColorsCached = wideNavigationRailColors;
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m8236toStringimpl(this.primary)) + "onPrimary=" + ((Object) Color.m8236toStringimpl(this.onPrimary)) + "primaryContainer=" + ((Object) Color.m8236toStringimpl(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) Color.m8236toStringimpl(this.onPrimaryContainer)) + "inversePrimary=" + ((Object) Color.m8236toStringimpl(this.inversePrimary)) + "secondary=" + ((Object) Color.m8236toStringimpl(this.secondary)) + "onSecondary=" + ((Object) Color.m8236toStringimpl(this.onSecondary)) + "secondaryContainer=" + ((Object) Color.m8236toStringimpl(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) Color.m8236toStringimpl(this.onSecondaryContainer)) + "tertiary=" + ((Object) Color.m8236toStringimpl(this.tertiary)) + "onTertiary=" + ((Object) Color.m8236toStringimpl(this.onTertiary)) + "tertiaryContainer=" + ((Object) Color.m8236toStringimpl(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) Color.m8236toStringimpl(this.onTertiaryContainer)) + "background=" + ((Object) Color.m8236toStringimpl(this.background)) + "onBackground=" + ((Object) Color.m8236toStringimpl(this.onBackground)) + "surface=" + ((Object) Color.m8236toStringimpl(this.surface)) + "onSurface=" + ((Object) Color.m8236toStringimpl(this.onSurface)) + "surfaceVariant=" + ((Object) Color.m8236toStringimpl(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) Color.m8236toStringimpl(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) Color.m8236toStringimpl(this.surfaceTint)) + "inverseSurface=" + ((Object) Color.m8236toStringimpl(this.inverseSurface)) + "inverseOnSurface=" + ((Object) Color.m8236toStringimpl(this.inverseOnSurface)) + "error=" + ((Object) Color.m8236toStringimpl(this.error)) + "onError=" + ((Object) Color.m8236toStringimpl(this.onError)) + "errorContainer=" + ((Object) Color.m8236toStringimpl(this.errorContainer)) + "onErrorContainer=" + ((Object) Color.m8236toStringimpl(this.onErrorContainer)) + "outline=" + ((Object) Color.m8236toStringimpl(this.outline)) + "outlineVariant=" + ((Object) Color.m8236toStringimpl(this.outlineVariant)) + "scrim=" + ((Object) Color.m8236toStringimpl(this.scrim)) + "surfaceBright=" + ((Object) Color.m8236toStringimpl(this.surfaceBright)) + "surfaceDim=" + ((Object) Color.m8236toStringimpl(this.surfaceDim)) + "surfaceContainer=" + ((Object) Color.m8236toStringimpl(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) Color.m8236toStringimpl(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) Color.m8236toStringimpl(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) Color.m8236toStringimpl(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) Color.m8236toStringimpl(this.surfaceContainerLowest)) + "primaryFixed=" + ((Object) Color.m8236toStringimpl(this.primaryFixed)) + "primaryFixedDim=" + ((Object) Color.m8236toStringimpl(this.primaryFixedDim)) + "onPrimaryFixed=" + ((Object) Color.m8236toStringimpl(this.onPrimaryContainer)) + "onPrimaryFixedVariant=" + ((Object) Color.m8236toStringimpl(this.onPrimaryFixedVariant)) + "secondaryFixed=" + ((Object) Color.m8236toStringimpl(this.secondaryFixed)) + "secondaryFixedDim=" + ((Object) Color.m8236toStringimpl(this.secondaryFixedDim)) + "onSecondaryFixed=" + ((Object) Color.m8236toStringimpl(this.onSecondaryFixed)) + "onSecondaryFixedVariant=" + ((Object) Color.m8236toStringimpl(this.onSecondaryFixedVariant)) + "tertiaryFixed=" + ((Object) Color.m8236toStringimpl(this.tertiaryFixed)) + "tertiaryFixedDim=" + ((Object) Color.m8236toStringimpl(this.tertiaryFixedDim)) + "onTertiaryFixed=" + ((Object) Color.m8236toStringimpl(this.onTertiaryFixed)) + "onTertiaryFixedVariant=" + ((Object) Color.m8236toStringimpl(this.onTertiaryFixedVariant)) + ')';
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultFloatingToolbarStandardColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultFloatingToolbarVibrantColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultScrollFieldColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3$annotations() {
    }

    public /* synthetic */ ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49);
    }

    public /* synthetic */ ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37);
    }

    public /* synthetic */ ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
    }

    private ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), null);
    }

    private ColorScheme(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), null);
    }
}
