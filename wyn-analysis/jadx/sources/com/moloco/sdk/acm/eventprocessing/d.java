package com.moloco.sdk.acm.eventprocessing;

import Ef.E;
import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f28383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S3.i f28385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.db.b f28386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f28387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, S3.i iVar, com.moloco.sdk.acm.db.b bVar, long j8, ArrayList arrayList, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28384b = str;
        this.f28385c = iVar;
        this.f28386d = bVar;
        this.f28387e = j8;
        this.f28388f = arrayList;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        ArrayList arrayList = this.f28388f;
        return new d(this.f28384b, this.f28385c, this.f28386d, this.f28387e, arrayList, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r2.k(r16) == r0) goto L22;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            kf.a r0 = kf.a.f39711a
            int r2 = r1.f28383a
            java.lang.String r3 = "EventProcessor"
            r4 = 2
            r5 = 1
            S3.i r6 = r1.f28385c
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1b
            Fe.e.U(r17)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            goto L94
        L17:
            r0 = move-exception
            goto L65
        L19:
            r0 = move-exception
            goto L7d
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L23:
            Fe.e.U(r17)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            goto L58
        L27:
            Fe.e.U(r17)
            com.moloco.sdk.acm.db.a r7 = new com.moloco.sdk.acm.db.a     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.lang.String r10 = r1.f28384b     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.lang.Object r2 = r6.f10962b     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            com.moloco.sdk.acm.db.b r13 = r1.f28386d     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            long r8 = r1.f28387e     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.lang.Long r14 = new java.lang.Long     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            r14.<init>(r8)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.util.ArrayList r15 = r1.f28388f     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            r8 = 0
            r7.<init>(r8, r10, r11, r13, r14, r15)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.lang.Object r2 = r6.f10961a     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            com.moloco.sdk.acm.db.e r2 = (com.moloco.sdk.acm.db.e) r2     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            r2.a(r7)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.lang.Object r2 = r6.f10963c     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            C6.l r2 = (C6.l) r2     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            r1.f28383a = r5     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.lang.Object r2 = r2.m(r1)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            if (r2 != r0) goto L58
            goto L64
        L58:
            java.lang.Object r2 = r6.f10964d     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            b7.k r2 = (b7.k) r2     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            r1.f28383a = r4     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            java.lang.Object r2 = r2.k(r1)     // Catch: java.lang.Exception -> L17 android.database.sqlite.SQLiteException -> L19
            if (r2 != r0) goto L94
        L64:
            return r0
        L65:
            Kd.a r2 = com.moloco.sdk.acm.services.e.f28472a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected error while processing event: "
            r2.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.moloco.sdk.acm.services.e.c(r3, r0)
            goto L94
        L7d:
            Kd.a r2 = com.moloco.sdk.acm.services.e.f28472a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Database error: "
            r2.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.moloco.sdk.acm.services.e.c(r3, r0)
        L94:
            ef.C r0 = ef.C2515C.f34653a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
