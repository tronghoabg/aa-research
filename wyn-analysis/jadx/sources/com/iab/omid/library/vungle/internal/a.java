package com.iab.omid.library.vungle.internal;

import android.content.Context;
import com.iab.omid.library.vungle.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f28138f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.vungle.utils.f f28139a = new com.iab.omid.library.vungle.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f28140b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28141c;

    /* renamed from: d, reason: collision with root package name */
    private d f28142d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28143e;

    private a(d dVar) {
        this.f28142d = dVar;
    }

    public static a a() {
        return f28138f;
    }

    private void c() throws JSONException {
        if (!this.f28141c || this.f28140b == null) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f28140b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f28139a.a();
        Date date = this.f28140b;
        if (date == null || dateA.after(date)) {
            this.f28140b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f28141c) {
            return;
        }
        this.f28142d.a(context);
        this.f28142d.a(this);
        this.f28142d.e();
        this.f28143e = this.f28142d.c();
        this.f28141c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z2) throws JSONException {
        if (!this.f28143e && z2) {
            d();
        }
        this.f28143e = z2;
    }
}
