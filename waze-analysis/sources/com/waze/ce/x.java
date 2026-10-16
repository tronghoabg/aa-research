package com.waze.ce;

import e.a.cn;
import e.a.cp;
import e.a.cq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f22166a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cq f22167b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile cq f22168c;

    private x() {
    }

    public static cq a() {
        cq cqVarA;
        cq cqVar = f22166a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (x.class) {
            cqVarA = f22166a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.voice.proto.VoiceService", "generateInstructionVoiceAssets"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(b.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(g.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f22166a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq b() {
        cq cqVarA;
        cq cqVar = f22168c;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (x.class) {
            cqVarA = f22168c;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.voice.proto.VoiceService", "generateNotificationVoiceAsset"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(j.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(l.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f22168c = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq c() {
        cq cqVarA;
        cq cqVar = f22167b;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (x.class) {
            cqVarA = f22167b;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.voice.proto.VoiceService", "generateTextVoiceAsset"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(n.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(p.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f22167b = cqVarA;
            }
        }
        return cqVarA;
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c d(q qVar) {
        h.g.b.x.f(qVar, "builder");
        return new com.waze.shared_infra.s.c(qVar);
    }

    public static final boolean e() {
        int i2 = okhttp3.internal.g.g.f56288b;
        return g();
    }

    public static final List f(List list) {
        h.g.b.x.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((aj) obj) != aj.f55873a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((aj) it.next()).toString());
        }
        return arrayList3;
    }

    public static final boolean g() {
        return h.g.b.x.n("Dalvik", System.getProperty("java.vm.name"));
    }

    public static final int h(int i2, int i3, int i4) throws IOException {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
    }

    public static final okhttp3.internal.f.b i(int i2) {
        for (okhttp3.internal.f.b bVar : okhttp3.internal.f.b.values()) {
            if (bVar.a() == i2) {
                return bVar;
            }
        }
        return null;
    }
}
