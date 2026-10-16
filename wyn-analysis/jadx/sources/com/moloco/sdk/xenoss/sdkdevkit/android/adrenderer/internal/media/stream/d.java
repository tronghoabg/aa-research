package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final File f30329a;

    public d(File file) {
        this.f30329a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC3340k.a(this.f30329a, ((d) obj).f30329a);
    }

    public final int hashCode() {
        return this.f30329a.hashCode();
    }

    public final String toString() {
        return "Complete(file=" + this.f30329a + ')';
    }
}
