package com.google.l.b.c;

import com.google.l.u;
import com.google.l.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends u {

    /* renamed from: a, reason: collision with root package name */
    static final v f12353a = new b(2);

    /* renamed from: b, reason: collision with root package name */
    private final u f12354b;

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) {
        Date date = (Date) this.f12354b.b(bVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) {
        this.f12354b.d(cVar, (Timestamp) obj);
    }
}
