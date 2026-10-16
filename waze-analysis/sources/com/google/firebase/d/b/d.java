package com.google.firebase.d.b;

import com.google.firebase.d.c.g;
import com.google.firebase.d.h;
import com.google.firebase.d.i;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements com.google.firebase.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9823a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.f f9824b;

    /* renamed from: c, reason: collision with root package name */
    private static final h f9825c;

    /* renamed from: d, reason: collision with root package name */
    private static final h f9826d;

    /* renamed from: e, reason: collision with root package name */
    private static final c f9827e = new c();

    /* renamed from: f, reason: collision with root package name */
    private final Map f9828f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map f9829g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.d.f f9830h = f9824b;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9831i = false;

    static {
        final int i2 = 1;
        f9824b = new g(i2);
        f9825c = new h() { // from class: com.google.firebase.d.b.a
            @Override // com.google.firebase.d.b
            public final void a(Object obj, Object obj2) {
                if (i2 == 0) {
                    int i3 = d.f9823a;
                    ((i) obj2).g(((Boolean) obj).booleanValue());
                } else {
                    int i4 = d.f9823a;
                    ((i) obj2).f((String) obj);
                }
            }
        };
        final int i3 = 0;
        f9826d = new h() { // from class: com.google.firebase.d.b.a
            @Override // com.google.firebase.d.b
            public final void a(Object obj, Object obj2) {
                if (i3 == 0) {
                    int i32 = d.f9823a;
                    ((i) obj2).g(((Boolean) obj).booleanValue());
                } else {
                    int i4 = d.f9823a;
                    ((i) obj2).f((String) obj);
                }
            }
        };
    }

    public d() {
        i(String.class, f9825c);
        i(Boolean.class, f9826d);
        i(Date.class, f9827e);
    }

    @Override // com.google.firebase.d.a.b
    public final /* bridge */ /* synthetic */ void a(Class cls, com.google.firebase.d.f fVar) {
        this.f9828f.put(cls, fVar);
        this.f9829g.remove(cls);
    }

    public final com.google.firebase.d.a b() {
        return new b(this);
    }

    public final void g(com.google.firebase.d.a.a aVar) {
        aVar.a(this);
    }

    public final void h() {
        this.f9831i = true;
    }

    public final void i(Class cls, h hVar) {
        this.f9829g.put(cls, hVar);
        this.f9828f.remove(cls);
    }
}
