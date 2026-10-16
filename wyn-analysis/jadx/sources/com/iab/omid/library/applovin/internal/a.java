package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f27853f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f27854a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f27855b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27856c;

    /* renamed from: d, reason: collision with root package name */
    private d f27857d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27858e;

    private a(d dVar) {
        this.f27857d = dVar;
    }

    public static a a() {
        return f27853f;
    }

    private void c() {
        if (!this.f27856c || this.f27855b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f27855b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f27854a.a();
        Date date = this.f27855b;
        if (date == null || dateA.after(date)) {
            this.f27855b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f27856c) {
            return;
        }
        this.f27857d.a(context);
        this.f27857d.a(this);
        this.f27857d.e();
        this.f27858e = this.f27857d.c();
        this.f27856c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z2) {
        if (!this.f27858e && z2) {
            d();
        }
        this.f27858e = z2;
    }
}
