package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adxy {
    public java.util.List a;
    public int b = 0;
    private final boolean c;

    public adxy(java.util.List list, boolean z) {
        this.c = z;
        d(list);
    }

    private static final java.util.List h(java.util.List list, java.util.List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
        for (int i = 0; i < java.lang.Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((defpackage.aecg) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((defpackage.aecg) list2.get(i));
            }
        }
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final java.net.SocketAddress b() {
        if (f()) {
            return (java.net.SocketAddress) ((defpackage.aecg) this.a.get(this.b)).b;
        }
        throw new java.lang.IllegalStateException("Index is past the end of the address group list");
    }

    public final void c() {
        this.b = 0;
    }

    public final void d(java.util.List list) {
        java.util.List listH;
        list.getClass();
        if (this.c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.Boolean bool = null;
            for (int i = 0; i < list.size(); i++) {
                defpackage.adkw adkwVar = (defpackage.adkw) list.get(i);
                int i2 = 0;
                while (true) {
                    java.util.List list2 = adkwVar.e;
                    if (i2 < list2.size()) {
                        java.net.SocketAddress socketAddress = (java.net.SocketAddress) list2.get(i2);
                        if ((socketAddress instanceof java.net.InetSocketAddress) && (((java.net.InetSocketAddress) socketAddress).getAddress() instanceof java.net.Inet4Address)) {
                            if (bool == null) {
                                bool = java.lang.Boolean.FALSE;
                            }
                            arrayList.add(new defpackage.aecg(adkwVar.f, socketAddress));
                        } else {
                            if (bool == null) {
                                bool = java.lang.Boolean.TRUE;
                            }
                            arrayList2.add(new defpackage.aecg(adkwVar.f, socketAddress));
                        }
                        i2++;
                    }
                }
            }
            listH = (bool == null || !bool.booleanValue()) ? h(arrayList, arrayList2) : h(arrayList2, arrayList);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                defpackage.adkw adkwVar2 = (defpackage.adkw) list.get(i3);
                int i4 = 0;
                while (true) {
                    java.util.List list3 = adkwVar2.e;
                    if (i4 < list3.size()) {
                        arrayList3.add(new defpackage.aecg(adkwVar2.f, (java.net.SocketAddress) list3.get(i4)));
                        i4++;
                    }
                }
            }
            listH = arrayList3;
        }
        this.a = listH;
        c();
    }

    public final boolean e() {
        if (!f()) {
            return false;
        }
        this.b++;
        return f();
    }

    public final boolean f() {
        return this.b < this.a.size();
    }

    public final boolean g(java.net.SocketAddress socketAddress) {
        socketAddress.getClass();
        for (int i = 0; i < this.a.size(); i++) {
            if (((defpackage.aecg) this.a.get(i)).b.equals(socketAddress)) {
                this.b = i;
                return true;
            }
        }
        return false;
    }
}
