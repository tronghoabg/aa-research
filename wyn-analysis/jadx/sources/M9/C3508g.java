package m9;

import com.google.protobuf.ByteString;
import w9.AbstractC4397p;

/* renamed from: m9.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3508g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f40481a;

    public C3508g(ByteString byteString) {
        this.f40481a = byteString;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC4397p.c(this.f40481a, ((C3508g) obj).f40481a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3508g) {
            return this.f40481a.equals(((C3508g) obj).f40481a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40481a.hashCode();
    }

    public final String toString() {
        return "Blob { bytes=" + AbstractC4397p.i(this.f40481a) + " }";
    }
}
