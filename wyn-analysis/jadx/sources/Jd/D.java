package Jd;

import Va.M6;
import com.unity3d.services.core.network.model.HttpRequest;
import ff.AbstractC2641B;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class D implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final D f6018c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f6019d;

    /* renamed from: a, reason: collision with root package name */
    public final String f6020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6021b;

    static {
        D d3 = new D("http", 80);
        f6018c = d3;
        List listD = AbstractC3935e.D(d3, new D(HttpRequest.DEFAULT_SCHEME, 443), new D("ws", 80), new D("wss", 443), new D("socks", 1080));
        int iD = AbstractC2641B.D(ff.p.a0(listD, 10));
        if (iD < 16) {
            iD = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
        for (Object obj : listD) {
            linkedHashMap.put(((D) obj).f6020a, obj);
        }
        f6019d = linkedHashMap;
    }

    public D(String name, int i5) {
        AbstractC3340k.e(name, "name");
        this.f6020a = name;
        this.f6021b = i5;
        for (int i10 = 0; i10 < name.length(); i10++) {
            char cCharAt = name.charAt(i10);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d3 = (D) obj;
        return AbstractC3340k.a(this.f6020a, d3.f6020a) && this.f6021b == d3.f6021b;
    }

    public final int hashCode() {
        return (this.f6020a.hashCode() * 31) + this.f6021b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.f6020a);
        sb2.append(", defaultPort=");
        return M6.r(sb2, this.f6021b, ')');
    }
}
