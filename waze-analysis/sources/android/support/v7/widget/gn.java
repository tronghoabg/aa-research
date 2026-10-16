package android.support.v7.widget;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gn {

    /* renamed from: a, reason: collision with root package name */
    int f1576a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f1577b;

    /* renamed from: c, reason: collision with root package name */
    int f1578c;

    /* renamed from: d, reason: collision with root package name */
    int f1579d;

    /* renamed from: e, reason: collision with root package name */
    int f1580e;

    gn() {
    }

    static final int e(int i2, int i3) {
        if (i2 > i3) {
            return 1;
        }
        return i2 == i3 ? 2 : 4;
    }

    final void a(int i2) {
        this.f1576a = i2 | this.f1576a;
    }

    final void b() {
        this.f1576a = 0;
    }

    final void c(int i2, int i3, int i4, int i5) {
        this.f1577b = i2;
        this.f1578c = i3;
        this.f1579d = i4;
        this.f1580e = i5;
    }

    final boolean d() {
        int i2 = this.f1576a;
        if ((i2 & 7) != 0 && (e(this.f1579d, this.f1577b) & i2) == 0) {
            return false;
        }
        if ((i2 & 112) != 0 && ((e(this.f1579d, this.f1578c) << 4) & i2) == 0) {
            return false;
        }
        if ((i2 & DisplayStrings.DS_BEACONS_TURN_ON_BLUETOOTH_TITLE) == 0 || ((e(this.f1580e, this.f1577b) << 8) & i2) != 0) {
            return (i2 & 28672) == 0 || ((e(this.f1580e, this.f1578c) << 12) & i2) != 0;
        }
        return false;
    }
}
