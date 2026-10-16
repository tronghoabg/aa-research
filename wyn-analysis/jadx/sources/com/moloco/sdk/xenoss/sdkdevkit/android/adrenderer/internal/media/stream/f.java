package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final File f30331a;

    /* renamed from: b, reason: collision with root package name */
    public final g f30332b;

    public f(File file, g progress) {
        AbstractC3340k.e(file, "file");
        AbstractC3340k.e(progress, "progress");
        this.f30331a = file;
        this.f30332b = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC3340k.a(this.f30331a, fVar.f30331a) && AbstractC3340k.a(this.f30332b, fVar.f30332b);
    }

    public final int hashCode() {
        return this.f30332b.hashCode() + (this.f30331a.hashCode() * 31);
    }

    public final String toString() {
        return "InProgress(file=" + this.f30331a + ", progress=" + this.f30332b + ')';
    }
}
