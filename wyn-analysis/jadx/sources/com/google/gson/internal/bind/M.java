package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class M extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException, NumberFormatException {
        int iW;
        int i5 = 0;
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        c3962a.b();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (c3962a.e0() != 4) {
            String strY = c3962a.Y();
            iW = c3962a.W();
            strY.getClass();
            switch (strY) {
                case "dayOfMonth":
                    i11 = iW;
                    break;
                case "minute":
                    i13 = iW;
                    break;
                case "second":
                    i14 = iW;
                    break;
                case "year":
                    i5 = iW;
                    break;
                case "month":
                    i10 = iW;
                    break;
                case "hourOfDay":
                    i12 = iW;
                    break;
            }
        }
        c3962a.o();
        return new GregorianCalendar(i5, i10, i11, i12, i13, i14);
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c3963b.z();
            return;
        }
        c3963b.d();
        c3963b.w("year");
        c3963b.V(r4.get(1));
        c3963b.w("month");
        c3963b.V(r4.get(2));
        c3963b.w("dayOfMonth");
        c3963b.V(r4.get(5));
        c3963b.w("hourOfDay");
        c3963b.V(r4.get(11));
        c3963b.w("minute");
        c3963b.V(r4.get(12));
        c3963b.w("second");
        c3963b.V(r4.get(13));
        c3963b.o();
    }
}
