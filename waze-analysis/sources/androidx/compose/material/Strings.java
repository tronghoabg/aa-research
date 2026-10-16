package androidx.compose.material;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Strings {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = 0;
    private static final int CloseDrawer = 1;
    private static final int CloseSheet = 2;
    private static final int DefaultErrorMessage = 3;
    private static final int ExposedDropdownMenu = 4;
    private static final int SliderRangeStart = 5;
    private static final int SliderRangeEnd = 6;
    private static final int SnackbarPaneTitle = 7;

    private /* synthetic */ Strings(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Strings m4200boximpl(int i2) {
        return new Strings(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4202equalsimpl(int i2, Object obj) {
        return (obj instanceof Strings) && i2 == ((Strings) obj).m4206unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4203equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4205toStringimpl(int i2) {
        return "Strings(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m4202equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m4205toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4206unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCloseDrawer-UdPEhr4, reason: not valid java name */
        public final int m4207getCloseDrawerUdPEhr4() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-UdPEhr4, reason: not valid java name */
        public final int m4208getCloseSheetUdPEhr4() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-UdPEhr4, reason: not valid java name */
        public final int m4209getDefaultErrorMessageUdPEhr4() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getExposedDropdownMenu-UdPEhr4, reason: not valid java name */
        public final int m4210getExposedDropdownMenuUdPEhr4() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getNavigationMenu-UdPEhr4, reason: not valid java name */
        public final int m4211getNavigationMenuUdPEhr4() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-UdPEhr4, reason: not valid java name */
        public final int m4212getSliderRangeEndUdPEhr4() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-UdPEhr4, reason: not valid java name */
        public final int m4213getSliderRangeStartUdPEhr4() {
            return Strings.SliderRangeStart;
        }

        /* renamed from: getSnackbarPaneTitle-UdPEhr4, reason: not valid java name */
        public final int m4214getSnackbarPaneTitleUdPEhr4() {
            return Strings.SnackbarPaneTitle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4201constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4204hashCodeimpl(int i2) {
        return i2;
    }
}
