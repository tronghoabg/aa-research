package e.a.d;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gz {

    /* renamed from: a, reason: collision with root package name */
    private List f47065a;

    /* renamed from: b, reason: collision with root package name */
    private int f47066b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f47067c;

    gz(List list, boolean z) {
        this.f47067c = z;
        f(list);
    }

    private static final List j(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i2 = 0; i2 < Math.max(list.size(), list2.size()); i2++) {
            if (i2 < list.size()) {
                arrayList.add((gy) list.get(i2));
            }
            if (i2 < list2.size()) {
                arrayList.add((gy) list2.get(i2));
            }
        }
        return arrayList;
    }

    public final int a() {
        return this.f47065a.size();
    }

    public final e.a.c b() {
        if (h()) {
            return ((gy) this.f47065a.get(this.f47066b)).f47063a;
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public final SocketAddress c() {
        if (h()) {
            return ((gy) this.f47065a.get(this.f47066b)).f47064b;
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final List d() {
        if (h()) {
            return Collections.singletonList(gy.b((gy) this.f47065a.get(this.f47066b)));
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void e() {
        this.f47066b = 0;
    }

    public final void f(List list) {
        List listJ;
        com.google.d.b.an.C(list, "newGroups");
        if (this.f47067c) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i2 = 0; i2 < list.size(); i2++) {
                e.a.ai aiVar = (e.a.ai) list.get(i2);
                for (int i3 = 0; i3 < aiVar.b().size(); i3++) {
                    SocketAddress socketAddress = (SocketAddress) aiVar.b().get(i3);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = false;
                        }
                        arrayList.add(new gy(aiVar.a(), socketAddress));
                    } else {
                        if (bool == null) {
                            bool = true;
                        }
                        arrayList2.add(new gy(aiVar.a(), socketAddress));
                    }
                }
            }
            listJ = (bool == null || !bool.booleanValue()) ? j(arrayList, arrayList2) : j(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                e.a.ai aiVar2 = (e.a.ai) list.get(i4);
                for (int i5 = 0; i5 < aiVar2.b().size(); i5++) {
                    arrayList3.add(new gy(aiVar2.a(), (SocketAddress) aiVar2.b().get(i5)));
                }
            }
            listJ = arrayList3;
        }
        this.f47065a = listJ;
        e();
    }

    public final boolean g() {
        if (!h()) {
            return false;
        }
        this.f47066b++;
        return h();
    }

    public final boolean h() {
        return this.f47066b < this.f47065a.size();
    }

    public final boolean i(SocketAddress socketAddress) {
        com.google.d.b.an.C(socketAddress, "needle");
        for (int i2 = 0; i2 < this.f47065a.size(); i2++) {
            if (((gy) this.f47065a.get(i2)).f47064b.equals(socketAddress)) {
                this.f47066b = i2;
                return true;
            }
        }
        return false;
    }
}
