package o;

import U8.v0;
import java.util.ArrayList;
import q.o1;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3629j extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41235a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41236b;

    /* renamed from: c, reason: collision with root package name */
    public int f41237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41238d;

    public C3629j(mc.b bVar) {
        this.f41235a = 0;
        this.f41238d = bVar;
        this.f41236b = false;
        this.f41237c = 0;
    }

    @Override // U8.v0, k1.Y
    public void c() {
        switch (this.f41235a) {
            case 1:
                this.f41236b = true;
                break;
        }
    }

    @Override // U8.v0, k1.Y
    public final void d() {
        switch (this.f41235a) {
            case 0:
                if (!this.f41236b) {
                    this.f41236b = true;
                    v0 v0Var = (v0) ((mc.b) this.f41238d).f40526e;
                    if (v0Var != null) {
                        v0Var.d();
                        break;
                    }
                }
                break;
            default:
                ((o1) this.f41238d).f43850a.setVisibility(0);
                break;
        }
    }

    @Override // k1.Y
    public final void e() {
        switch (this.f41235a) {
            case 0:
                int i5 = this.f41237c + 1;
                this.f41237c = i5;
                mc.b bVar = (mc.b) this.f41238d;
                if (i5 == ((ArrayList) bVar.f40524c).size()) {
                    v0 v0Var = (v0) bVar.f40526e;
                    if (v0Var != null) {
                        v0Var.e();
                    }
                    this.f41237c = 0;
                    this.f41236b = false;
                    bVar.f40523b = false;
                    break;
                }
                break;
            default:
                if (!this.f41236b) {
                    ((o1) this.f41238d).f43850a.setVisibility(this.f41237c);
                    break;
                }
                break;
        }
    }

    public C3629j(o1 o1Var, int i5) {
        this.f41235a = 1;
        this.f41238d = o1Var;
        this.f41237c = i5;
        this.f41236b = false;
    }
}
