package com.moloco.sdk.internal.ortb;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28675a;

    public b(ArrayList fields) {
        AbstractC3340k.e(fields, "fields");
        this.f28675a = fields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && AbstractC3340k.a(this.f28675a, ((b) obj).f28675a);
    }

    public final int hashCode() {
        return this.f28675a.hashCode();
    }

    public final String toString() {
        return "MissingRequiredFields(fields=" + this.f28675a + ')';
    }
}
