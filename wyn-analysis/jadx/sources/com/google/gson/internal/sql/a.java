package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;
import la.InterfaceC3449A;
import la.l;
import la.z;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class a extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3449A f27504b = new InterfaceC3449A() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter$1
        @Override // la.InterfaceC3449A
        public final z create(l lVar, C3883a c3883a) {
            if (c3883a.f44183a != Timestamp.class) {
                return null;
            }
            lVar.getClass();
            return new a(lVar.c(new C3883a(Date.class)));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final z f27505a;

    public a(z zVar) {
        this.f27505a = zVar;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) {
        Date date = (Date) this.f27505a.b(c3962a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) {
        this.f27505a.c(c3963b, (Timestamp) obj);
    }
}
