package com.waze.sharedrive.a;

import e.a.cn;
import e.a.cp;
import e.a.cq;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f38018a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cq f38019b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile cq f38020c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile cq f38021d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile cq f38022e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile cq f38023f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile cq f38024g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile cq f38025h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile cq f38026i;

    private s() {
    }

    public static cq a() {
        cq cqVarA;
        cq cqVar = f38023f;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38023f;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "ChangeRoleInSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(b.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(d.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38023f = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq b() {
        cq cqVarA;
        cq cqVar = f38018a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38018a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "CreateSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(f.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(com.waze.sharedrive.f.a.ai.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38018a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq c() {
        cq cqVarA;
        cq cqVar = f38020c;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38020c;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "JoinSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(h.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(com.waze.sharedrive.f.a.ai.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38020c = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq d() {
        cq cqVarA;
        cq cqVar = f38021d;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38021d;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "LeaveSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(j.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(l.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38021d = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq e() {
        cq cqVarA;
        cq cqVar = f38019b;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38019b;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "PreviewSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(n.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(com.waze.sharedrive.f.a.ai.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38019b = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq f() {
        cq cqVarA;
        cq cqVar = f38024g;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38024g;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "ReportDriverArrivedInSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(p.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(r.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38024g = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq g() {
        cq cqVarA;
        cq cqVar = f38025h;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38025h;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "UpdateLocationInSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(ae.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(ag.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38025h = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq h() {
        cq cqVarA;
        cq cqVar = f38026i;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38026i;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "UpdateRouteInSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(ai.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(ak.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38026i = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq i() {
        cq cqVarA;
        cq cqVar = f38022e;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (s.class) {
            cqVarA = f38022e;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.sharedrive.api.ShareDriveExternalService", "ViewSharedDrive"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(am.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(com.waze.sharedrive.f.a.ai.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f38022e = cqVarA;
            }
        }
        return cqVarA;
    }

    public static com.waze.sharedrive.c.a.l j(com.waze.sharedrive.c.a.k kVar, String str, com.waze.sharedrive.c.a.e eVar, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(kVar, "role");
        return new com.waze.sharedrive.c.a.l("", str, eVar, cVar, new com.waze.sharedrive.c.a.o(kVar), true);
    }

    public static Float k(ByteBuffer byteBuffer, com.waze.h.c.b bVar) {
        h.g.b.x.f(byteBuffer, "buffer");
        h.g.b.x.f(bVar, "format");
        com.waze.h.c.b bVar2 = com.waze.h.c.b.f24340a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            throw new h.i();
        }
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        h.g.b.x.e(shortBufferAsShortBuffer, "asShortBuffer(...)");
        int iRemaining = shortBufferAsShortBuffer.remaining();
        if (iRemaining <= 0) {
            return null;
        }
        long j2 = 0;
        while (shortBufferAsShortBuffer.hasRemaining()) {
            long j3 = shortBufferAsShortBuffer.get();
            j2 += j3 * j3;
        }
        return Float.valueOf(h.k.n.g((float) (Math.sqrt(j2 / iRemaining) / 32767.0d), 0.0f, 1.0f));
    }

    public /* synthetic */ s(byte[] bArr, byte[] bArr2) {
    }
}
