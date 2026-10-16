package E4;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class G implements h, InterfaceC0438g {

    /* renamed from: a, reason: collision with root package name */
    public final i f2855a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2856b;

    /* renamed from: c, reason: collision with root package name */
    public int f2857c;

    /* renamed from: d, reason: collision with root package name */
    public C0436e f2858d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2859e;

    /* renamed from: f, reason: collision with root package name */
    public volatile I4.o f2860f;

    /* renamed from: g, reason: collision with root package name */
    public C0437f f2861g;

    public G(i iVar, k kVar) {
        this.f2855a = iVar;
        this.f2856b = kVar;
    }

    @Override // E4.InterfaceC0438g
    public final void a(B4.d dVar, Object obj, C4.e eVar, int i5, B4.d dVar2) {
        this.f2856b.a(dVar, obj, eVar, this.f2860f.f5355c.d(), dVar);
    }

    @Override // E4.InterfaceC0438g
    public final void b(B4.d dVar, Exception exc, C4.e eVar, int i5) {
        this.f2856b.b(dVar, exc, eVar, this.f2860f.f5355c.d());
    }

    @Override // E4.h
    public final void cancel() {
        I4.o oVar = this.f2860f;
        if (oVar != null) {
            oVar.f5355c.cancel();
        }
    }

    @Override // E4.h
    public final boolean d() {
        Object obj = this.f2859e;
        if (obj != null) {
            this.f2859e = null;
            int i5 = Y4.i.f16694b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                B4.b bVarD = this.f2855a.d(obj);
                G9.e eVar = new G9.e(bVarD, obj, this.f2855a.f2887i, 3);
                B4.d dVar = this.f2860f.f5353a;
                i iVar = this.f2855a;
                this.f2861g = new C0437f(dVar, iVar.f2891n);
                iVar.f2886h.a().f(this.f2861g, eVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f2861g + ", data: " + obj + ", encoder: " + bVarD + ", duration: " + Y4.i.a(jElapsedRealtimeNanos));
                }
                this.f2860f.f5355c.a();
                this.f2858d = new C0436e(Collections.singletonList(this.f2860f.f5353a), this.f2855a, this);
            } catch (Throwable th) {
                this.f2860f.f5355c.a();
                throw th;
            }
        }
        C0436e c0436e = this.f2858d;
        if (c0436e != null && c0436e.d()) {
            return true;
        }
        this.f2858d = null;
        this.f2860f = null;
        boolean z2 = false;
        while (!z2 && this.f2857c < this.f2855a.b().size()) {
            ArrayList arrayListB = this.f2855a.b();
            int i10 = this.f2857c;
            this.f2857c = i10 + 1;
            this.f2860f = (I4.o) arrayListB.get(i10);
            if (this.f2860f != null && (this.f2855a.f2893p.a(this.f2860f.f5355c.d()) || this.f2855a.c(this.f2860f.f5355c.b()) != null)) {
                this.f2860f.f5355c.e(this.f2855a.f2892o, new S3.e(4, this, this.f2860f));
                z2 = true;
            }
        }
        return z2;
    }
}
