package S3;

import A.AbstractC0221n;
import A.InterfaceC0222o;
import A.InterfaceC0228v;
import A.c0;
import A.e0;
import Cd.s0;
import Ef.E;
import Ef.H;
import android.os.SystemClock;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3437s;
import u1.AbstractC4228q;
import u1.C4225n;

/* loaded from: classes.dex */
public final class n implements c0, H6.h {

    /* renamed from: a, reason: collision with root package name */
    public Object f10970a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10971b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10972c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10973d;

    public /* synthetic */ n(String str, String str2, Map map, byte[] bArr) {
        this.f10970a = str;
        this.f10971b = str2;
        this.f10972c = map;
        this.f10973d = bArr;
    }

    public static void c(long j8, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j8) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            map.remove(arrayList.get(i5));
        }
    }

    public ArrayList a(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f10970a;
        c(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f10971b;
        c(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            Y1.b bVar = (Y1.b) list.get(i5);
            if (!map.containsKey(bVar.f16307b) && !map2.containsKey(Integer.valueOf(bVar.f16308c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void b(AbstractC4228q abstractC4228q) throws Throwable {
        Object objC = ((Gf.e) this.f10972c).c(abstractC4228q);
        if (objC instanceof Gf.j) {
            Gf.j jVar = objC instanceof Gf.j ? (Gf.j) objC : null;
            Throwable th = jVar != null ? jVar.f4825a : null;
            if (th != null) {
                throw th;
            }
            throw new s0("Channel was closed normally", 3);
        }
        if (objC instanceof Gf.k) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f10973d).getAndIncrement() == 0) {
            H.D((E) this.f10970a, null, new C4225n(this, null), 3);
        }
    }

    public Y1.b d(List list) {
        Y1.b bVar;
        ArrayList arrayListA = a(list);
        if (arrayListA.size() < 2) {
            return (Y1.b) AbstractC3437s.i(arrayListA, null);
        }
        Collections.sort(arrayListA, new A0.f(6));
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i10 = ((Y1.b) arrayListA.get(0)).f16308c;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayListA.size()) {
                break;
            }
            Y1.b bVar2 = (Y1.b) arrayListA.get(i11);
            if (i10 == bVar2.f16308c) {
                arrayList.add(new Pair(bVar2.f16307b, Integer.valueOf(bVar2.f16309d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (Y1.b) arrayListA.get(0);
            }
        }
        HashMap map = (HashMap) this.f10972c;
        Y1.b bVar3 = (Y1.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < listSubList.size(); i13++) {
            i12 += ((Y1.b) listSubList.get(i13)).f16309d;
        }
        int iNextInt = ((Random) this.f10973d).nextInt(i12);
        int i14 = 0;
        while (true) {
            if (i5 >= listSubList.size()) {
                bVar = (Y1.b) AbstractC3437s.j(listSubList);
                break;
            }
            bVar = (Y1.b) listSubList.get(i5);
            i14 += bVar.f16309d;
            if (iNextInt < i14) {
                break;
            }
            i5++;
        }
        map.put(arrayList, bVar);
        return bVar;
    }

    @Override // A.c0
    public AbstractC0221n f(long j8, AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        if (((AbstractC0221n) this.f10972c) == null) {
            this.f10972c = initialVelocity.c();
        }
        AbstractC0221n abstractC0221n = (AbstractC0221n) this.f10972c;
        if (abstractC0221n == null) {
            AbstractC3340k.m("velocityVector");
            throw null;
        }
        int iB = abstractC0221n.b();
        for (int i5 = 0; i5 < iB; i5++) {
            AbstractC0221n abstractC0221n2 = (AbstractC0221n) this.f10972c;
            if (abstractC0221n2 == null) {
                AbstractC3340k.m("velocityVector");
                throw null;
            }
            abstractC0221n2.e(((InterfaceC0222o) this.f10970a).get(i5).j(j8, initialValue.a(i5), targetValue.a(i5), initialVelocity.a(i5)), i5);
        }
        AbstractC0221n abstractC0221n3 = (AbstractC0221n) this.f10972c;
        if (abstractC0221n3 != null) {
            return abstractC0221n3;
        }
        AbstractC3340k.m("velocityVector");
        throw null;
    }

    @Override // A.c0
    public AbstractC0221n h(long j8, AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        if (((AbstractC0221n) this.f10971b) == null) {
            this.f10971b = initialValue.c();
        }
        AbstractC0221n abstractC0221n = (AbstractC0221n) this.f10971b;
        if (abstractC0221n == null) {
            AbstractC3340k.m("valueVector");
            throw null;
        }
        int iB = abstractC0221n.b();
        for (int i5 = 0; i5 < iB; i5++) {
            AbstractC0221n abstractC0221n2 = (AbstractC0221n) this.f10971b;
            if (abstractC0221n2 == null) {
                AbstractC3340k.m("valueVector");
                throw null;
            }
            abstractC0221n2.e(((InterfaceC0222o) this.f10970a).get(i5).d(j8, initialValue.a(i5), targetValue.a(i5), initialVelocity.a(i5)), i5);
        }
        AbstractC0221n abstractC0221n3 = (AbstractC0221n) this.f10971b;
        if (abstractC0221n3 != null) {
            return abstractC0221n3;
        }
        AbstractC3340k.m("valueVector");
        throw null;
    }

    @Override // A.c0
    public long i(AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        Iterator it = android.support.v4.media.session.b.u0(0, initialValue.b()).iterator();
        long jMax = 0;
        while (((zf.f) it).f48505c) {
            int iA = ((zf.f) it).a();
            jMax = Math.max(jMax, ((InterfaceC0222o) this.f10970a).get(iA).k(initialValue.a(iA), targetValue.a(iA), initialVelocity.a(iA)));
        }
        return jMax;
    }

    @Override // A.c0
    public AbstractC0221n n(AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        if (((AbstractC0221n) this.f10973d) == null) {
            this.f10973d = initialVelocity.c();
        }
        AbstractC0221n abstractC0221n = (AbstractC0221n) this.f10973d;
        if (abstractC0221n == null) {
            AbstractC3340k.m("endVelocityVector");
            throw null;
        }
        int iB = abstractC0221n.b();
        for (int i5 = 0; i5 < iB; i5++) {
            AbstractC0221n abstractC0221n2 = (AbstractC0221n) this.f10973d;
            if (abstractC0221n2 == null) {
                AbstractC3340k.m("endVelocityVector");
                throw null;
            }
            abstractC0221n2.e(((InterfaceC0222o) this.f10970a).get(i5).c(initialValue.a(i5), targetValue.a(i5), initialVelocity.a(i5)), i5);
        }
        AbstractC0221n abstractC0221n3 = (AbstractC0221n) this.f10973d;
        if (abstractC0221n3 != null) {
            return abstractC0221n3;
        }
        AbstractC3340k.m("endVelocityVector");
        throw null;
    }

    @Override // H6.h
    public void o(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f10970a);
        jsonWriter.name("verb").value((String) this.f10971b);
        jsonWriter.endObject();
        H6.i.d(jsonWriter, (Map) this.f10972c);
        byte[] bArr = (byte[]) this.f10973d;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    @Override // A.c0
    public /* synthetic */ boolean p() {
        return false;
    }

    public n(InterfaceC0228v interfaceC0228v) {
        this.f10970a = new e0(interfaceC0228v, 0);
    }
}
