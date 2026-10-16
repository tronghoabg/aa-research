package e.a;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public static final b f46253a = b.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: b, reason: collision with root package name */
    public static final b f46254b = b.a("io.grpc.EquivalentAddressGroup.LOCALITY");

    /* renamed from: c, reason: collision with root package name */
    static final b f46255c = b.a("io.grpc.EquivalentAddressGroup.BACKEND_SERVICE");

    /* renamed from: d, reason: collision with root package name */
    static final b f46256d = b.a("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");

    /* renamed from: e, reason: collision with root package name */
    private final List f46257e;

    /* renamed from: f, reason: collision with root package name */
    private final c f46258f;

    /* renamed from: g, reason: collision with root package name */
    private final int f46259g;

    public ai(List list, c cVar) {
        com.google.d.b.an.m(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f46257e = listUnmodifiableList;
        com.google.d.b.an.C(cVar, "attrs");
        this.f46258f = cVar;
        this.f46259g = listUnmodifiableList.hashCode();
    }

    public final c a() {
        return this.f46258f;
    }

    public final List b() {
        return this.f46257e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        List list = this.f46257e;
        int size = list.size();
        List list2 = aiVar.f46257e;
        if (size != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((SocketAddress) list.get(i2)).equals(list2.get(i2))) {
                return false;
            }
        }
        return this.f46258f.equals(aiVar.f46258f);
    }

    public final int hashCode() {
        return this.f46259g;
    }

    public final String toString() {
        c cVar = this.f46258f;
        return "[" + String.valueOf(this.f46257e) + DomExceptionUtils.SEPARATOR + cVar.toString() + "]";
    }

    public ai(SocketAddress socketAddress, c cVar) {
        this(Collections.singletonList(socketAddress), cVar);
    }

    public ai(SocketAddress socketAddress) {
        this(socketAddress, c.f46513a);
    }
}
