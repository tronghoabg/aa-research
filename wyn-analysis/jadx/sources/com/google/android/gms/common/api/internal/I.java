package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final C1688b f26466a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.d f26467b;

    public /* synthetic */ I(C1688b c1688b, d7.d dVar) {
        this.f26466a = c1688b;
        this.f26467b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof I)) {
            I i5 = (I) obj;
            if (AbstractC1732v.m(this.f26466a, i5.f26466a) && AbstractC1732v.m(this.f26467b, i5.f26467b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26466a, this.f26467b});
    }

    public final String toString() {
        Y2.B b5 = new Y2.B(this);
        b5.g(this.f26466a, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        b5.g(this.f26467b, "feature");
        return b5.toString();
    }
}
