package od;

import java.net.SocketAddress;
import java.util.List;
import md.C3552u;

/* renamed from: od.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3702l0 {

    /* renamed from: a, reason: collision with root package name */
    public List f42004a;

    /* renamed from: b, reason: collision with root package name */
    public int f42005b;

    /* renamed from: c, reason: collision with root package name */
    public int f42006c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((C3552u) this.f42004a.get(this.f42005b)).f40728a.get(this.f42006c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public boolean b() {
        if (c()) {
            C3552u c3552u = (C3552u) this.f42004a.get(this.f42005b);
            int i5 = this.f42006c + 1;
            this.f42006c = i5;
            if (i5 >= c3552u.f40728a.size()) {
                int i10 = this.f42005b + 1;
                this.f42005b = i10;
                this.f42006c = 0;
                if (i10 < this.f42004a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f42005b < this.f42004a.size();
    }

    public void d() {
        this.f42005b = 0;
        this.f42006c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i5 = 0; i5 < this.f42004a.size(); i5++) {
            int iIndexOf = ((C3552u) this.f42004a.get(i5)).f40728a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f42005b = i5;
                this.f42006c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
