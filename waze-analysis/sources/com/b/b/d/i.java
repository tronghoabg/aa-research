package com.b.b.d;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import j$.util.Objects;

/* compiled from: WazeSource */
@JsonDeserialize(using = com.b.b.c.b.a.class)
@JsonSerialize(using = com.b.b.c.b.b.class)
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2642a;

    public i(String str) {
        this.f2642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2642a, ((i) obj).f2642a);
    }

    public final int hashCode() {
        return Objects.hash(this.f2642a);
    }

    public final String toString() {
        return "ImageId{" + this.f2642a + "'}";
    }

    private i() {
        this(null);
    }
}
