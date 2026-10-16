package zg;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class X implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f48608a;

    public X(Type type) {
        this.f48608a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && a0.c(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f48608a;
    }

    public final int hashCode() {
        return this.f48608a.hashCode();
    }

    public final String toString() {
        return a0.p(this.f48608a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
