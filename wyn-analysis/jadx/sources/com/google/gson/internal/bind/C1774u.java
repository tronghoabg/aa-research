package com.google.gson.internal.bind;

import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import java.lang.reflect.Type;
import la.InterfaceC3449A;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1774u extends AbstractC1773t {

    /* renamed from: a, reason: collision with root package name */
    public final la.n f27494a;

    /* renamed from: b, reason: collision with root package name */
    public final la.l f27495b;

    /* renamed from: c, reason: collision with root package name */
    public final C3883a f27496c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3449A f27497d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27498e;

    /* renamed from: f, reason: collision with root package name */
    public volatile la.z f27499f;

    public C1774u(la.n nVar, la.l lVar, C3883a c3883a, InterfaceC3449A interfaceC3449A, boolean z2) {
        this.f27494a = nVar;
        this.f27495b = lVar;
        this.f27496c = c3883a;
        this.f27497d = interfaceC3449A;
        this.f27498e = z2;
    }

    public static InterfaceC3449A e(final C3883a c3883a, final ScheduleMode.Deserializer deserializer) {
        final boolean z2 = c3883a.f44184b == c3883a.f44183a;
        return new InterfaceC3449A(deserializer, c3883a, z2) { // from class: com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory

            /* renamed from: a, reason: collision with root package name */
            public final C3883a f27404a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f27405b;

            /* renamed from: c, reason: collision with root package name */
            public final la.n f27406c;

            {
                this.f27406c = deserializer;
                this.f27404a = c3883a;
                this.f27405b = z2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
            
                if (r0.f44184b == r11.f44183a) goto L12;
             */
            @Override // la.InterfaceC3449A
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final la.z create(la.l r10, qa.C3883a r11) {
                /*
                    r9 = this;
                    qa.a r0 = r9.f27404a
                    r1 = 0
                    if (r0 == 0) goto L23
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L17
                    boolean r2 = r9.f27405b
                    if (r2 == 0) goto L16
                    java.lang.Class r2 = r11.f44183a
                    java.lang.reflect.Type r0 = r0.f44184b
                    if (r0 != r2) goto L16
                    goto L17
                L16:
                    return r1
                L17:
                    com.google.gson.internal.bind.u r3 = new com.google.gson.internal.bind.u
                    r8 = 1
                    la.n r4 = r9.f27406c
                    r7 = r9
                    r5 = r10
                    r6 = r11
                    r3.<init>(r4, r5, r6, r7, r8)
                    return r3
                L23:
                    r6 = r11
                    java.lang.Class r10 = r6.f44183a
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory.create(la.l, qa.a):la.z");
            }
        };
    }

    @Override // la.z
    public final Object b(C3962a c3962a) {
        if (this.f27494a == null) {
            la.z zVarD = this.f27499f;
            if (zVarD == null) {
                zVarD = this.f27495b.d(this.f27497d, this.f27496c);
                this.f27499f = zVarD;
            }
            return zVarD.b(c3962a);
        }
        la.o oVarI = na.d.i(c3962a);
        if (this.f27498e) {
            oVarI.getClass();
            if (oVarI instanceof la.q) {
                return null;
            }
        }
        Type type = this.f27496c.f44184b;
        try {
            return ScheduleMode.valueOf(oVarI.c());
        } catch (Exception unused) {
            return oVarI.a() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) {
        la.z zVarD = this.f27499f;
        if (zVarD == null) {
            zVarD = this.f27495b.d(this.f27497d, this.f27496c);
            this.f27499f = zVarD;
        }
        zVarD.c(c3963b, obj);
    }

    @Override // com.google.gson.internal.bind.AbstractC1773t
    public final la.z d() {
        la.z zVar = this.f27499f;
        if (zVar != null) {
            return zVar;
        }
        la.z zVarD = this.f27495b.d(this.f27497d, this.f27496c);
        this.f27499f = zVarD;
        return zVarD;
    }
}
