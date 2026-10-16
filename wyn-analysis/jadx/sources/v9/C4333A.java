package v9;

import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import ka.AbstractC3230e0;
import ka.C3242i0;
import ka.C3251l0;
import md.c0;
import w9.C4386e;
import w9.EnumC4385d;

/* renamed from: v9.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4333A extends AbstractC4335b {

    /* renamed from: s, reason: collision with root package name */
    public static final ByteString f47035s = ByteString.EMPTY;

    /* renamed from: r, reason: collision with root package name */
    public final o f47036r;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4333A(m mVar, C4386e c4386e, o oVar, p pVar) {
        F6.r rVarD = AbstractC3230e0.f39405e;
        if (rVarD == null) {
            synchronized (AbstractC3230e0.class) {
                try {
                    rVarD = AbstractC3230e0.f39405e;
                    if (rVarD == null) {
                        M.y yVarD = F6.r.d();
                        yVarD.f7229d = c0.f40630c;
                        yVarD.f7230e = F6.r.a("google.firestore.v1.Firestore", "Listen");
                        yVarD.f7226a = true;
                        C3242i0 c3242i0F = C3242i0.f();
                        ExtensionRegistryLite extensionRegistryLite = td.c.f46039a;
                        yVarD.f7227b = new td.b(c3242i0F);
                        yVarD.f7228c = new td.b(C3251l0.b());
                        rVarD = yVarD.d();
                        AbstractC3230e0.f39405e = rVarD;
                    }
                } finally {
                }
            }
        }
        super(mVar, rVarD, c4386e, EnumC4385d.f47418b, EnumC4385d.f47417a, pVar);
        this.f47036r = oVar;
    }

    @Override // v9.AbstractC4335b
    public final void e(MessageLite messageLite) {
        f((C3251l0) messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04dc  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.protobuf.Internal$IntList, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    @Override // v9.AbstractC4335b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(ka.C3251l0 r34) {
        /*
            Method dump skipped, instructions count: 2023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.C4333A.f(ka.l0):void");
    }
}
