package com.google.android.libraries.e.b;

import com.google.b.d.b.ai;
import com.google.b.d.b.aj;
import com.google.d.m.a.af;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u implements af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f5906a;

    /* renamed from: b, reason: collision with root package name */
    private List f5907b;

    /* synthetic */ u(x xVar) {
        Objects.requireNonNull(xVar);
        this.f5906a = xVar;
    }

    public static /* synthetic */ void b(u uVar) {
        synchronized (uVar.f5906a.f5917f) {
            uVar.f5907b = null;
        }
    }

    @Override // com.google.d.m.a.af
    public final bm a() {
        x xVar = this.f5906a;
        com.google.b.d.b.p pVarD = ai.d("Initialize ".concat(String.valueOf(xVar.f5912a)), aj.f7088a);
        try {
            synchronized (xVar.f5917f) {
                if (this.f5907b == null) {
                    this.f5907b = xVar.f5918g;
                    xVar.f5918g = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.f5907b.size());
            w wVar = new w(this.f5906a);
            Iterator it = this.f5907b.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((ag) it.next()).apply(wVar));
                } catch (Exception e2) {
                    arrayList.add(bd.g(e2));
                }
            }
            bm bmVarA = bd.c(arrayList).a(new Callable() { // from class: com.google.android.libraries.e.b.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    u.b(this.f5905a);
                    return null;
                }
            }, cf.y());
            pVarD.a(bmVarA);
            pVarD.close();
            return bmVarA;
        } catch (Throwable th) {
            try {
                pVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
