package H5;

import k3.C3184p;
import o3.InterfaceC3644a;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4892a;

    /* renamed from: b, reason: collision with root package name */
    public int f4893b;

    public /* synthetic */ a(int i5) {
        this.f4892a = i5;
    }

    public static String e(int i5) {
        return "" + ((char) ((i5 >> 24) & 255)) + ((char) ((i5 >> 16) & 255)) + ((char) ((i5 >> 8) & 255)) + ((char) (i5 & 255));
    }

    public static String f(int i5) {
        return "" + ((char) ((i5 >> 24) & 255)) + ((char) ((i5 >> 16) & 255)) + ((char) ((i5 >> 8) & 255)) + ((char) (i5 & 255));
    }

    public static int n(int i5) {
        return (i5 >> 24) & 255;
    }

    public void b(int i5) {
        switch (this.f4892a) {
            case 0:
                this.f4893b = i5 | this.f4893b;
                break;
            default:
                this.f4893b = i5 | this.f4893b;
                break;
        }
    }

    public abstract void c(InterfaceC3644a interfaceC3644a);

    public abstract void d(InterfaceC3644a interfaceC3644a);

    public boolean h(int i5) {
        switch (this.f4892a) {
            case 0:
                if ((this.f4893b & i5) == i5) {
                }
                break;
            default:
                if ((this.f4893b & i5) == i5) {
                }
                break;
        }
        return false;
    }

    public abstract void i(InterfaceC3644a interfaceC3644a);

    public abstract void j(InterfaceC3644a interfaceC3644a);

    public abstract void l(InterfaceC3644a interfaceC3644a);

    public abstract C3184p m(InterfaceC3644a interfaceC3644a);

    public String toString() {
        switch (this.f4892a) {
            case 1:
                return f(this.f4893b);
            case 2:
                return e(this.f4893b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i5, int i10) {
        this.f4892a = i10;
        this.f4893b = i5;
    }
}
