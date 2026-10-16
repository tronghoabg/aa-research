package com.waze.planned_drive;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bz extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final int f33293a;

    public bz() {
        super(null);
        this.f33293a = R.string.PLEASE_WAIT___;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        int i2 = ((bz) obj).f33293a;
        return true;
    }

    public final int hashCode() {
        return R.string.PLEASE_WAIT___;
    }

    public final String toString() {
        return "Calculating(msg=2131888516)";
    }
}
