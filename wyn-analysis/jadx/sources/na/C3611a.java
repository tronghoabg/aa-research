package na;

import com.applovin.shadow.okhttp3.HttpUrl;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: na.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3611a implements GenericArrayType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f40956a;

    public C3611a(Type type) {
        Objects.requireNonNull(type);
        this.f40956a = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f40956a;
    }

    public final int hashCode() {
        return this.f40956a.hashCode();
    }

    public final String toString() {
        return d.l(this.f40956a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
