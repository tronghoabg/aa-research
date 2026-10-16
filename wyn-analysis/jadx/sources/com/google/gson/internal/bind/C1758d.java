package com.google.gson.internal.bind;

import j$.util.Objects;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import la.InterfaceC3449A;
import oa.AbstractC3660a;
import org.apache.tika.utils.StringUtils;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1758d extends la.z {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC3449A f27448c = new InterfaceC3449A() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter$1
        @Override // la.InterfaceC3449A
        public final la.z create(la.l lVar, C3883a c3883a) {
            if (c3883a.f44183a == Date.class) {
                return new C1758d(AbstractC1757c.f27447a);
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1757c f27449a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27450b;

    public C1758d(AbstractC1757c abstractC1757c) {
        ArrayList arrayList = new ArrayList();
        this.f27450b = arrayList;
        Objects.requireNonNull(abstractC1757c);
        this.f27449a = abstractC1757c;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (na.g.f40971a >= 9) {
            arrayList.add(new SimpleDateFormat(N0.a.g("MMM d, yyyy", StringUtils.SPACE, "h:mm:ss a"), locale));
        }
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        Date dateB;
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        String strC0 = c3962a.c0();
        synchronized (this.f27450b) {
            try {
                Iterator it = this.f27450b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = AbstractC3660a.b(strC0, new ParsePosition(0));
                            break;
                        } catch (ParseException e7) {
                            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Failed parsing '", strC0, "' as Date; at path ");
                            sbW.append(c3962a.B());
                            throw new la.p(sbW.toString(), e7, 13);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strC0);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f27449a.a(dateB);
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c3963b.z();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f27450b.get(0);
        synchronized (this.f27450b) {
            str = dateFormat.format(date);
        }
        c3963b.Y(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f27450b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
