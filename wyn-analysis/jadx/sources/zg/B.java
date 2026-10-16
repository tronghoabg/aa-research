package zg;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class B extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48519c;

    /* renamed from: d, reason: collision with root package name */
    public final C4662a f48520d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48521e;

    public B(int i5, String str, boolean z2) {
        this.f48518b = i5;
        switch (i5) {
            case 1:
                C4662a c4662a = C4662a.f48614b;
                Objects.requireNonNull(str, "name == null");
                this.f48519c = str;
                this.f48520d = c4662a;
                this.f48521e = z2;
                break;
            default:
                C4662a c4662a2 = C4662a.f48614b;
                Objects.requireNonNull(str, "name == null");
                this.f48519c = str;
                this.f48520d = c4662a2;
                this.f48521e = z2;
                break;
        }
    }

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        switch (this.f48518b) {
            case 0:
                if (obj != null) {
                    this.f48520d.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        n10.a(this.f48519c, string, this.f48521e);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f48520d.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        n10.d(this.f48519c, string2, this.f48521e);
                        break;
                    }
                }
                break;
        }
    }
}
