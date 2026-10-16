package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cpi {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof cpi) && this.a == ((cpi) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a.Y(i, 16) ? "Confirm" : a.Y(i, 6) ? "ContextClick" : a.Y(i, 13) ? "GestureEnd" : a.Y(i, 23) ? "GestureThresholdActivate" : a.Y(i, 3) ? "KeyboardTap" : a.Y(i, 0) ? "LongPress" : a.Y(i, 17) ? "Reject" : a.Y(i, 27) ? "SegmentFrequentTick" : a.Y(i, 26) ? "SegmentTick" : a.Y(i, 9) ? "TextHandleMove" : a.Y(i, 22) ? "ToggleOff" : a.Y(i, 21) ? "ToggleOn" : a.Y(i, 1) ? "VirtualKey" : "Invalid";
    }
}
