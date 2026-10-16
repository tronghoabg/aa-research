package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import Va.M6;

/* loaded from: classes4.dex */
public final class w extends y {

    /* renamed from: a, reason: collision with root package name */
    public final int f31526a;

    public w(int i5) {
        this.f31526a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f31526a == ((w) obj).f31526a;
    }

    public final int hashCode() {
        return this.f31526a;
    }

    public final String toString() {
        return M6.r(new StringBuilder("Percents(percents="), this.f31526a, ')');
    }
}
