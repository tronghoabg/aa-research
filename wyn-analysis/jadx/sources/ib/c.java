package ib;

import com.applovin.shadow.okhttp3.HttpUrl;
import hb.P;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class c implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f36933a;

    public c(Type type) {
        this.f36933a = f.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && P.b(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f36933a;
    }

    public final int hashCode() {
        return this.f36933a.hashCode();
    }

    public final String toString() {
        return f.k(this.f36933a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
