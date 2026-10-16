package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class an implements com.google.d.m.a.ag {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6060c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f6061d;

    public /* synthetic */ an(z zVar, String str, com.google.android.libraries.phenotype.client.h hVar, int i2) {
        this.f6061d = i2;
        this.f6058a = zVar;
        this.f6059b = str;
        this.f6060c = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.d.m.a.bm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.d.m.a.ag, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.d.m.a.bm, java.lang.Object, java.util.concurrent.Executor] */
    @Override // com.google.d.m.a.ag
    public final bm apply(Object obj) {
        String string;
        int i2 = this.f6061d;
        if (i2 != 0) {
            ?? r2 = this.f6059b;
            if (i2 != 1) {
                return ((com.google.android.libraries.e.b.x) this.f6060c).f5919h.m(this.f6058a, r2);
            }
            return com.google.android.libraries.e.b.r.g((com.google.android.libraries.e.b.r) this.f6060c, this.f6058a, r2, obj);
        }
        List listQ = (List) obj;
        z zVar = (z) this.f6058a;
        if (!zVar.c()) {
            listQ = bn.q("");
        }
        int i3 = bn.f7456d;
        bi biVar = new bi();
        Iterator it = listQ.iterator();
        while (true) {
            Object obj2 = this.f6060c;
            if (!it.hasNext()) {
                return com.google.d.m.a.bd.a(biVar.f()).a(new bg(1), ((com.google.android.libraries.phenotype.client.h) obj2).j());
            }
            Object obj3 = this.f6059b;
            String str = (String) it.next();
            com.google.firebase.messaging.l lVar = aq.f6070a;
            if (lVar == null || !lVar.b((String) obj3, str)) {
                com.google.android.libraries.phenotype.client.h hVar = (com.google.android.libraries.phenotype.client.h) obj2;
                ay ayVar = new ay(hVar, (String) obj3, str, zVar.d());
                if (zVar.f()) {
                    Context contextA = hVar.a();
                    string = al.a(contextA).getString(zVar.a(), "");
                } else {
                    string = str;
                }
                bm bmVarB = ayVar.b(string);
                com.google.d.m.a.be beVarZ = com.google.d.m.a.be.z(bmVarB);
                Objects.requireNonNull(ayVar);
                biVar.g(beVarZ.B(new am(ayVar, 0), hVar.j()).B(new ap(hVar, bmVarB, zVar, str, 1), hVar.j()));
            }
        }
    }

    public /* synthetic */ an(Object obj, Object obj2, Object obj3, int i2) {
        this.f6061d = i2;
        this.f6060c = obj;
        this.f6058a = obj2;
        this.f6059b = obj3;
    }
}
