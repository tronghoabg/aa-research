package com.waze.g;

import android.os.Build;
import com.b.b.a.u;
import com.waze.system.SystemNativeManager;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final SystemNativeManager f23995a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f23996b;

    public e(SystemNativeManager systemNativeManager) {
        x.f(systemNativeManager, "systemNativeManager");
        this.f23995a = systemNativeManager;
        this.f23996b = ck.b(new c(u.d().d(), null, false));
    }

    @Override // com.waze.g.d
    public final a a() {
        String strB = com.waze.stats.storage.h.b();
        x.e(strB, "getModel(...)");
        String str = Build.MANUFACTURER;
        x.e(str, "getManufacturer(...)");
        return new a(strB, str);
    }

    @Override // com.waze.g.d
    public final b b() {
        return new b(u.d().c().a(), u.d().c().b());
    }

    @Override // com.waze.g.d
    public final String c() {
        return this.f23995a.getSystemLocale();
    }

    @Override // com.waze.g.d
    public final String d() {
        return "5.20.90.901";
    }

    @Override // com.waze.g.d
    public final ch e() {
        return ai.U(this.f23996b);
    }

    @Override // com.waze.g.d
    public final void f(String str) {
        bn bnVar;
        Object objD;
        com.waze.shared_infra.i.h.a("updating session id: ".concat(String.valueOf(str)));
        do {
            bnVar = this.f23996b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, c.d((c) objD, str, false, 5)));
    }

    @Override // com.waze.g.d
    public final void g() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f23996b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, c.d((c) objD, null, true, 3)));
    }
}
