package Oa;

import Ma.j;
import j$.util.DesugarCollections;
import java.util.Date;
import java.util.Iterator;
import wa.C4398a;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8923f;

    /* renamed from: a, reason: collision with root package name */
    public C4398a f8924a;

    /* renamed from: b, reason: collision with root package name */
    public Date f8925b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8926c;

    /* renamed from: d, reason: collision with root package name */
    public e f8927d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8928e;

    static {
        e eVar = new e();
        a aVar = new a();
        aVar.f8924a = new C4398a(26);
        aVar.f8927d = eVar;
        f8923f = aVar;
    }

    @Override // Oa.d
    public final void a(boolean z2) {
        if (!this.f8928e && z2) {
            this.f8924a.getClass();
            Date date = new Date();
            Date date2 = this.f8925b;
            if (date2 == null || date.after(date2)) {
                this.f8925b = date;
                if (this.f8926c) {
                    Iterator it = DesugarCollections.unmodifiableCollection(c.f8930c.f8932b).iterator();
                    while (it.hasNext()) {
                        Qa.a aVar = ((j) it.next()).f7610e;
                        Date date3 = this.f8925b;
                        aVar.c(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f8928e = z2;
    }
}
