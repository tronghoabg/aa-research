package com.waze.crash;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements com.waze.shared_infra.i.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f23235a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23236b;

    /* renamed from: c, reason: collision with root package name */
    private final c f23237c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f23238d;

    public /* synthetic */ k(String str, com.waze.shared_infra.i.e eVar, c cVar, com.waze.shared_infra.i.b bVar) {
        this.f23235a = str;
        this.f23236b = eVar;
        this.f23237c = cVar;
        this.f23238d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        String str2 = this.f23235a;
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        this.f23237c.g(sb.toString());
        if (th != null) {
            this.f23238d.a(th, str2);
        }
    }

    @Override // com.waze.shared_infra.i.e
    public final void a(CharSequence charSequence) {
        this.f23236b.a(charSequence);
        k(String.valueOf(charSequence), null);
    }

    @Override // com.waze.shared_infra.i.e
    public final void b(CharSequence charSequence) {
        this.f23236b.b(charSequence);
        k(String.valueOf(charSequence), null);
    }

    @Override // com.waze.shared_infra.i.e
    public final void c(String str, Throwable th) {
        this.f23236b.c(str, th);
        k(str, th);
    }

    @Override // com.waze.shared_infra.i.e
    public final void d(CharSequence charSequence) {
        this.f23236b.d(charSequence);
        k(String.valueOf(charSequence), null);
    }

    @Override // com.waze.shared_infra.i.e
    public final void e(CharSequence charSequence) {
        this.f23236b.e(charSequence);
        k(String.valueOf(charSequence), null);
    }

    @Override // com.waze.shared_infra.i.e
    public final /* synthetic */ void f(CharSequence charSequence) {
    }

    @Override // com.waze.shared_infra.i.e
    public final void g(CharSequence charSequence) {
        this.f23236b.g(charSequence);
        k(charSequence.toString(), null);
    }

    @Override // com.waze.shared_infra.i.e
    public final /* synthetic */ void h(String str, Throwable th) {
        com.waze.settings.tree.c.f.f(this, str, th);
    }

    @Override // com.waze.shared_infra.i.e
    public final void i(Throwable th) {
        this.f23236b.i(th);
        k("Could not register receiver", th);
    }
}
