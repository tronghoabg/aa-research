package io.flutter.view;

import android.view.View;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f37309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37310b;

    public n(View view, int i5) {
        this.f37309a = view;
        this.f37310b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f37310b == nVar.f37310b && this.f37309a.equals(nVar.f37309a);
    }

    public final int hashCode() {
        return ((this.f37309a.hashCode() + 31) * 31) + this.f37310b;
    }
}
