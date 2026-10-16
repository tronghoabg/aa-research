package androidx.compose.foundation.text.input;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Visible = 0;
    private static final int RevealLastTyped = 1;
    private static final int Hidden = 2;
    private static final int System = 3;

    private /* synthetic */ TextObfuscationMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextObfuscationMode m3499boximpl(int i2) {
        return new TextObfuscationMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3501equalsimpl(int i2, Object obj) {
        return (obj instanceof TextObfuscationMode) && i2 == ((TextObfuscationMode) obj).m3505unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3502equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3504toStringimpl(int i2) {
        return "TextObfuscationMode(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3501equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m3504toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3505unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m3506getHiddenvTwcZD0() {
            return TextObfuscationMode.Hidden;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m3507getRevealLastTypedvTwcZD0() {
            return TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getSystem-vTwcZD0, reason: not valid java name */
        public final int m3508getSystemvTwcZD0() {
            return TextObfuscationMode.System;
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m3509getVisiblevTwcZD0() {
            return TextObfuscationMode.Visible;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3500constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3503hashCodeimpl(int i2) {
        return i2;
    }
}
