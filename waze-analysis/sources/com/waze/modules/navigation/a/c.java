package com.waze.modules.navigation.a;

import com.waze.modules.navigation.j;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30269a;

    public c(boolean z) {
        super(null, null);
        this.f30269a = z;
    }

    public final boolean c() {
        return this.f30269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f30269a == ((c) obj).f30269a;
    }

    public final int hashCode() {
        return a.a.a(this.f30269a);
    }

    public final String toString() {
        return "NewDrive(fromTimer=" + this.f30269a + ")";
    }
}
