package com.google.l.b.c;

import com.google.l.u;
import com.google.l.v;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f12350a;

    b(int i2) {
        this.f12350a = i2;
    }

    @Override // com.google.l.v
    public final u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        int i2 = this.f12350a;
        if (i2 == 0) {
            if (aVar.c() == Time.class) {
                return new c();
            }
            return null;
        }
        if (i2 != 1) {
            if (aVar.c() == Timestamp.class) {
                return new d(dVar.b(Date.class));
            }
            return null;
        }
        if (aVar.c() == java.sql.Date.class) {
            return new a();
        }
        return null;
    }
}
