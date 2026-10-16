package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class cpr {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cpr) && this.a == ((defpackage.cpr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (defpackage.a.X(i, 16)) {
            return "Confirm";
        }
        if (defpackage.a.X(i, 6)) {
            return "ContextClick";
        }
        if (defpackage.a.X(i, 13)) {
            return "GestureEnd";
        }
        if (defpackage.a.X(i, 23)) {
            return "GestureThresholdActivate";
        }
        if (defpackage.a.X(i, 3)) {
            return "KeyboardTap";
        }
        if (defpackage.a.X(i, 0)) {
            return "LongPress";
        }
        if (defpackage.a.X(i, 17)) {
            return "Reject";
        }
        if (defpackage.a.X(i, 27)) {
            return "SegmentFrequentTick";
        }
        if (defpackage.a.X(i, 26)) {
            return "SegmentTick";
        }
        if (defpackage.a.X(i, 9)) {
            return "TextHandleMove";
        }
        if (defpackage.a.X(i, 22)) {
            return "ToggleOff";
        }
        if (defpackage.a.X(i, 21)) {
            return "ToggleOn";
        }
        return defpackage.a.X(i, 1) ? "VirtualKey" : "Invalid";
    }
}
