package com.waze.uid.e;

import com.waze.uid.b.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class g extends f implements h {

    /* renamed from: a, reason: collision with root package name */
    protected int f44488a;

    /* renamed from: f, reason: collision with root package name */
    private List f44489f;

    public g(String str, b bVar, h hVar, m mVar) {
        super(str, bVar, hVar, mVar);
        this.f44489f = new ArrayList();
        this.f44488a = -1;
    }

    protected final f a() {
        int i2 = this.f44488a;
        if (i2 < 0 || i2 >= this.f44489f.size()) {
            return null;
        }
        return (f) this.f44489f.get(this.f44488a);
    }

    @Override // com.waze.uid.e.h
    public final boolean b(f fVar) {
        if (m()) {
            return true;
        }
        return j();
    }

    @Override // com.waze.uid.e.h
    public boolean c(f fVar) {
        if (l()) {
            return true;
        }
        return k();
    }

    @Override // com.waze.uid.e.f
    public final boolean d() {
        f fVarA = a();
        if (fVarA == null || !fVarA.d()) {
            return m();
        }
        return true;
    }

    @Override // com.waze.uid.e.f
    public final boolean e() {
        f fVarA = a();
        if (fVarA == null || !fVarA.e()) {
            return l();
        }
        return true;
    }

    @Override // com.waze.uid.e.f
    public final void f(e eVar) {
        super.f(eVar);
        f fVarA = a();
        if (fVarA != null && fVarA.h(eVar)) {
            fVarA.f(eVar);
        } else if (eVar == e.f44481a) {
            e();
        } else {
            d();
        }
    }

    protected final void g(f... fVarArr) {
        this.f44489f = Arrays.asList(fVarArr);
    }

    public final boolean l() {
        f fVar;
        int i2 = this.f44488a;
        while (true) {
            if (i2 >= this.f44489f.size() - 1) {
                fVar = null;
                break;
            }
            i2++;
            fVar = (f) this.f44489f.get(i2);
            if (fVar.h(e.f44481a)) {
                this.f44488a = i2;
                break;
            }
        }
        if (fVar == null) {
            return false;
        }
        fVar.f(e.f44481a);
        return true;
    }

    public final boolean m() {
        return n(e.f44482b);
    }

    public final boolean n(e eVar) {
        f fVar;
        int i2 = this.f44488a;
        while (true) {
            if (i2 <= 0) {
                this.f44488a = -1;
                fVar = null;
                break;
            }
            i2--;
            fVar = (f) this.f44489f.get(i2);
            if (fVar.h(e.f44482b)) {
                this.f44488a = i2;
                break;
            }
        }
        if (fVar == null) {
            return false;
        }
        fVar.f(eVar);
        return true;
    }
}
