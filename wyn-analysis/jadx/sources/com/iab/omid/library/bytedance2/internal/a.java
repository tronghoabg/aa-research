package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f27986f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f27987a = new com.iab.omid.library.bytedance2.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f27988b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27989c;

    /* renamed from: d, reason: collision with root package name */
    private d f27990d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27991e;

    private a(d dVar) {
        this.f27990d = dVar;
    }

    public static a a() {
        return f27986f;
    }

    private void c() throws JSONException {
        if (!this.f27989c || this.f27988b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f27988b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f27987a.a();
        Date date = this.f27988b;
        if (date == null || dateA.after(date)) {
            this.f27988b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f27989c) {
            return;
        }
        this.f27990d.a(context);
        this.f27990d.a(this);
        this.f27990d.e();
        this.f27991e = this.f27990d.c();
        this.f27989c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z2) throws JSONException {
        if (!this.f27991e && z2) {
            d();
        }
        this.f27991e = z2;
    }
}
