package com.google.l.b.a;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bn extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    private final List f12262a;

    bn(String... strArr) {
        this.f12262a = Arrays.asList(strArr);
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        bVar.j();
        List list = this.f12262a;
        long[] jArr = new long[list.size()];
        while (bVar.r() != 4) {
            int iIndexOf = list.indexOf(bVar.g());
            if (iIndexOf >= 0) {
                jArr[iIndexOf] = bVar.c();
            } else {
                bVar.o();
            }
        }
        bVar.l();
        return new GregorianCalendar(bo.a(jArr[0]), bo.a(jArr[1]), bo.a(jArr[2]), bo.a(jArr[3]), bo.a(jArr[4]), bo.a(jArr[5]));
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.g();
            return;
        }
        cVar.c();
        Calendar calendar = (Calendar) obj;
        int i2 = 0;
        long[] jArr = {calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
        while (true) {
            List list = this.f12262a;
            if (i2 >= list.size()) {
                cVar.e();
                return;
            } else {
                cVar.f((String) list.get(i2));
                cVar.i(jArr[i2]);
                i2++;
            }
        }
    }
}
