package com.waze.uid.e;

import com.waze.tide.s;
import com.waze.uid.b.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class f implements com.waze.uid.b.h {
    private static int aaW;

    /* renamed from: b, reason: collision with root package name */
    protected final h f44484b;

    /* renamed from: c, reason: collision with root package name */
    protected final m f44485c;

    /* renamed from: d, reason: collision with root package name */
    protected final b f44486d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f44487e;

    public f(String str, b bVar, h hVar, m mVar) {
        this.f44484b = hVar;
        this.f44485c = mVar;
        this.f44486d = new b(bVar, str);
        this.f44487e = str;
    }

    public static int i() {
        return aaW;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void f(e eVar) {
        int i2 = aaW + 1;
        aaW = i2;
        com.waze.shared_infra.i.h.b("StateContainer", this.f44486d.a("(" + i2 + ") onEnterState " + String.valueOf(eVar)));
        m mVar = this.f44485c;
        if (mVar != null) {
            mVar.h(this);
        }
    }

    public boolean h(e eVar) {
        return true;
    }

    public boolean j() {
        h hVar = this.f44484b;
        if (hVar == null) {
            return false;
        }
        return hVar.b(this);
    }

    protected boolean k() {
        h hVar = this.f44484b;
        if (hVar == null) {
            return false;
        }
        return hVar.c(this);
    }

    @Override // com.waze.uid.b.h
    public void o(s sVar) {
        if (sVar instanceof com.waze.uid.b.c) {
            j();
        }
    }

    public final String toString() {
        return this.f44487e;
    }
}
