package v9;

import E5.n0;
import ad.L;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Timestamp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.AbstractC3230e0;
import ka.I1;
import ka.K1;
import ka.N1;
import md.c0;
import r9.C3955l;
import w9.C4386e;
import w9.EnumC4385d;

/* loaded from: classes4.dex */
public final class B extends AbstractC4335b {

    /* renamed from: u, reason: collision with root package name */
    public static final ByteString f47037u = ByteString.EMPTY;

    /* renamed from: r, reason: collision with root package name */
    public final o f47038r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f47039s;

    /* renamed from: t, reason: collision with root package name */
    public ByteString f47040t;

    /* JADX WARN: Illegal instructions before constructor call */
    public B(m mVar, C4386e c4386e, o oVar, q qVar) {
        F6.r rVarD = AbstractC3230e0.f39404d;
        if (rVarD == null) {
            synchronized (AbstractC3230e0.class) {
                try {
                    rVarD = AbstractC3230e0.f39404d;
                    if (rVarD == null) {
                        M.y yVarD = F6.r.d();
                        yVarD.f7229d = c0.f40630c;
                        yVarD.f7230e = F6.r.a("google.firestore.v1.Firestore", "Write");
                        yVarD.f7226a = true;
                        K1 k1E = K1.e();
                        ExtensionRegistryLite extensionRegistryLite = td.c.f46039a;
                        yVarD.f7227b = new td.b(k1E);
                        yVarD.f7228c = new td.b(N1.c());
                        rVarD = yVarD.d();
                        AbstractC3230e0.f39404d = rVarD;
                    }
                } finally {
                }
            }
        }
        super(mVar, rVarD, c4386e, EnumC4385d.f47420d, EnumC4385d.f47419c, qVar);
        this.f47039s = false;
        this.f47040t = f47037u;
        this.f47038r = oVar;
    }

    @Override // v9.AbstractC4335b
    public final void e(MessageLite messageLite) {
        this.f47040t = ((N1) messageLite).d();
        this.f47039s = true;
        n0 n0Var = ((q) this.f47058l).f47104a;
        B b5 = (B) n0Var.f3476f;
        ByteString byteString = b5.f47040t;
        C3955l c3955l = (C3955l) n0Var.f3473c;
        c3955l.f44631a.P("Set stream token", new ng.a(12, c3955l, byteString));
        Iterator it = ((ArrayDeque) n0Var.f3482m).iterator();
        while (it.hasNext()) {
            b5.j(((t9.i) it.next()).f45957d);
        }
    }

    @Override // v9.AbstractC4335b
    public final void f(MessageLite messageLite) {
        N1 n12 = (N1) messageLite;
        this.f47040t = n12.d();
        this.k.f47452f = 0L;
        Timestamp timestampB = n12.b();
        this.f47038r.getClass();
        s9.o oVarF = o.f(timestampB);
        int iF = n12.f();
        ArrayList arrayList = new ArrayList(iF);
        for (int i5 = 0; i5 < iF; i5++) {
            arrayList.add(o.d(n12.e(i5), oVarF));
        }
        n0 n0Var = ((q) this.f47058l).f47104a;
        t9.i iVar = (t9.i) ((ArrayDeque) n0Var.f3482m).poll();
        ByteString byteString = ((B) n0Var.f3476f).f47040t;
        boolean z2 = iVar.f45957d.size() == arrayList.size();
        List list = iVar.f45957d;
        A6.c.z(z2, "Mutations sent %d must equal results received %d", Integer.valueOf(list.size()), Integer.valueOf(arrayList.size()));
        c9.c cVarG = s9.g.f45372a;
        for (int i10 = 0; i10 < list.size(); i10++) {
            cVarG = cVarG.g(((t9.h) list.get(i10)).f45951a, ((t9.j) arrayList.get(i10)).f45958a);
        }
        C8.i iVar2 = new C8.i(iVar, oVarF, arrayList, byteString, cVarG, 17);
        p9.z zVarE = ((p9.s) ((L) n0Var.f3472b).f17515b).e();
        zVarE.a("handleSuccessfulWrite");
        t9.i iVar3 = (t9.i) iVar2.f1939b;
        zVarE.f(iVar3.f45954a, null);
        zVarE.j(iVar3.f45954a);
        C3955l c3955l = zVarE.f43431a;
        zVarE.b((c9.c) c3955l.f44631a.O("Acknowledge batch", new aa.f(20, c3955l, iVar2)), null);
        n0Var.i();
    }

    @Override // v9.AbstractC4335b
    public final void g() {
        this.f47039s = false;
        super.g();
    }

    @Override // v9.AbstractC4335b
    public final void h() {
        if (this.f47039s) {
            j(Collections.EMPTY_LIST);
        }
    }

    public final void j(List list) {
        A6.c.z(c(), "Writing mutations requires an opened stream", new Object[0]);
        A6.c.z(this.f47039s, "Handshake must be complete before writing mutations", new Object[0]);
        I1 i1F = K1.f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i1F.a(this.f47038r.i((t9.h) it.next()));
        }
        i1F.c(this.f47040t);
        i((K1) i1F.build());
    }
}
