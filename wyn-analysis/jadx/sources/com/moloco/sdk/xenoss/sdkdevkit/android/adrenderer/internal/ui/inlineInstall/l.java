package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import Ef.H0;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30903a = false;

    /* renamed from: b, reason: collision with root package name */
    public final f f30904b;

    /* renamed from: c, reason: collision with root package name */
    public final H0 f30905c;

    /* renamed from: d, reason: collision with root package name */
    public final H0 f30906d;

    public l(f fVar, H0 h02, H0 h03) {
        this.f30904b = fVar;
        this.f30905c = h02;
        this.f30906d = h03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f30903a == lVar.f30903a && this.f30904b.equals(lVar.f30904b) && this.f30905c.equals(lVar.f30905c) && this.f30906d.equals(lVar.f30906d);
    }

    public final int hashCode() {
        return this.f30906d.hashCode() + ((this.f30905c.hashCode() + ((this.f30904b.hashCode() + ((this.f30903a ? 1231 : 1237) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LaunchState(backgroundedSinceLaunch=" + this.f30903a + ", onOutcome=" + this.f30904b + ", timeoutJob=" + this.f30905c + ", fgJob=" + this.f30906d + ')';
    }
}
