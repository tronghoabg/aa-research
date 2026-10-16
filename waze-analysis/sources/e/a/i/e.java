package e.a.i;

import com.google.d.d.bc;
import com.google.d.d.fo;
import e.a.ai;
import e.a.bk;
import e.a.bl;
import e.a.bn;
import e.a.bp;
import e.a.bt;
import e.a.bv;
import e.a.d.hl;
import e.a.da;
import e.a.ee;
import e.a.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class e extends bt {

    /* renamed from: i, reason: collision with root package name */
    private static final Logger f47819i = Logger.getLogger(e.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static final int f47820j = new Random().nextInt();

    /* renamed from: f, reason: collision with root package name */
    protected boolean f47821f;

    /* renamed from: h, reason: collision with root package name */
    protected w f47823h;

    /* renamed from: l, reason: collision with root package name */
    private final bl f47825l;

    /* renamed from: k, reason: collision with root package name */
    private List f47824k = new ArrayList(0);

    /* renamed from: g, reason: collision with root package name */
    protected final bv f47822g = new hl();

    protected e(bl blVar) {
        this.f47825l = blVar;
        f47819i.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // e.a.bt
    public final ee a(bp bpVar) {
        ee eeVarG;
        f47819i.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", bpVar);
        try {
            this.f47821f = true;
            LinkedHashMap linkedHashMapZ = fo.z(bpVar.c().size());
            for (ai aiVar : bpVar.c()) {
                da daVarE = bpVar.e();
                daVarE.f(Collections.singletonList(aiVar));
                e.a.a aVarA = e.a.c.a();
                aVarA.c(f46507e, true);
                daVarE.g(aVarA.a());
                daVarE.h(null);
                linkedHashMapZ.put(new d(aiVar), daVarE.e());
            }
            if (linkedHashMapZ.isEmpty()) {
                eeVarG = ee.f47411k.g("NameResolver returned no usable address. " + bpVar.toString());
                b(eeVarG);
            } else {
                LinkedHashMap linkedHashMapZ2 = fo.z(this.f47824k.size());
                for (c cVar : this.f47824k) {
                    linkedHashMapZ2.put(cVar.g(), cVar);
                }
                ee eeVar = ee.f47401a;
                ArrayList arrayList = new ArrayList(linkedHashMapZ.size());
                for (Map.Entry entry : linkedHashMapZ.entrySet()) {
                    c cVarG = (c) linkedHashMapZ2.remove(entry.getKey());
                    if (cVarG == null) {
                        cVarG = g(entry.getKey());
                    }
                    arrayList.add(cVarG);
                }
                int iA = arrayList.isEmpty() ? 0 : (int) (com.google.d.l.j.a(f47820j) % com.google.d.l.j.a(arrayList.size()));
                for (c cVar2 : bc.a(fo.O(arrayList, iA), fo.N(arrayList, iA))) {
                    bp bpVar2 = (bp) linkedHashMapZ.get(cVar2.g());
                    if (bpVar2 != null) {
                        ee eeVarA = cVar2.f47814c.a(bpVar2);
                        if (!eeVarA.l()) {
                            eeVar = eeVarA;
                        }
                    }
                }
                this.f47824k = arrayList;
                k();
                Iterator it = linkedHashMapZ2.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).j();
                }
                eeVarG = eeVar;
            }
            return eeVarG;
        } finally {
            this.f47821f = false;
        }
    }

    @Override // e.a.bt
    public final void b(ee eeVar) {
        if (this.f47823h != w.f47852b) {
            this.f47825l.f(w.f47853c, new bk(bn.b(eeVar)));
        }
    }

    @Override // e.a.bt
    public final void d() {
        f47819i.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.f47824k.iterator();
        while (it.hasNext()) {
            ((c) it.next()).j();
        }
        this.f47824k.clear();
    }

    protected final bl f() {
        return this.f47825l;
    }

    protected c g(Object obj) {
        throw null;
    }

    public final Collection h() {
        return this.f47824k;
    }

    protected final List i() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f47824k) {
            if (cVar.b() == w.f47852b) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    protected abstract void k();
}
