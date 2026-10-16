package com.waze.c.e;

import android.content.Context;
import android.widget.Toast;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ak extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f18513a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18514b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(bi biVar, al alVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18515c = i2;
        this.f18513a = biVar;
        this.f18514b = alVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18515c;
        if (i2 == 0) {
            return new ak((bi) this.f18513a, (al) this.f18514b, eVar, 0);
        }
        Object obj2 = this.f18513a;
        if (i2 != 1) {
            return new ak((String) obj2, (Context) this.f18514b, eVar, 2);
        }
        return new ak((bi) obj2, (al) this.f18514b, eVar, 1, null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18515c;
        return i2 != 0 ? i2 != 1 ? ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f18515c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            boolean zB = ((bi) this.f18513a).c().b();
            Object obj2 = this.f18514b;
            if (zB) {
                ((al) obj2).c().g();
            } else {
                ((al) obj2).c().h();
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            Object obj3 = this.f18513a;
            if (obj3 != null) {
                Toast.makeText((Context) this.f18514b, (CharSequence) obj3, 1).show();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean zB2 = ((bi) this.f18513a).c().b();
        Object obj4 = this.f18514b;
        if (zB2) {
            ((al) obj4).d().b();
        } else {
            al alVar = (al) obj4;
            if (alVar.c().j()) {
                alVar.d().d(false);
            } else {
                alVar.d().d(true);
            }
            alVar.d().c();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(bi biVar, al alVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18515c = i2;
        this.f18513a = biVar;
        this.f18514b = alVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(String str, Context context, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18515c = i2;
        this.f18513a = str;
        this.f18514b = context;
    }
}
