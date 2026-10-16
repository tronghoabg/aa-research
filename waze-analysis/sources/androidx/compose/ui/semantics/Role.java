package androidx.compose.ui.semantics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = 0;
    private static final int Checkbox = 1;
    private static final int Switch = 2;
    private static final int RadioButton = 3;
    private static final int Tab = 4;
    private static final int Image = 5;
    private static final int DropdownList = 6;
    private static final int ValuePicker = 7;
    private static final int Carousel = 8;

    private /* synthetic */ Role(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m10309boximpl(int i2) {
        return new Role(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10311equalsimpl(int i2, Object obj) {
        return (obj instanceof Role) && i2 == ((Role) obj).m10315unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10312equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10314toStringimpl(int i2) {
        return m10312equalsimpl0(i2, Button) ? "Button" : m10312equalsimpl0(i2, Checkbox) ? "Checkbox" : m10312equalsimpl0(i2, Switch) ? "Switch" : m10312equalsimpl0(i2, RadioButton) ? "RadioButton" : m10312equalsimpl0(i2, Tab) ? "Tab" : m10312equalsimpl0(i2, Image) ? "Image" : m10312equalsimpl0(i2, DropdownList) ? "DropdownList" : m10312equalsimpl0(i2, ValuePicker) ? "Picker" : m10312equalsimpl0(i2, Carousel) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m10311equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10314toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10315unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m10316getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m10317getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m10318getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m10319getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m10320getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m10321getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m10322getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m10323getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m10324getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10310constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10313hashCodeimpl(int i2) {
        return i2;
    }
}
