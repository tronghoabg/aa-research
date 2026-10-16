package com.waze.bq.c;

import android.content.Context;
import android.widget.Toast;
import com.waze.t.b.aj;
import com.waze.t.b.ar;
import com.waze.t.b.bb;
import h.a.i;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17242a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17243b;

    public c(com.waze.shared_infra.i.e eVar, Context context) {
        x.f(eVar, "logger");
        x.f(context, "context");
        this.f17242a = eVar;
        this.f17243b = context;
    }

    @Override // com.waze.t.b.aj
    public final /* bridge */ /* synthetic */ bb a(Object obj) {
        x.f((com.waze.bq.b.a) obj, "action");
        return bb.f40720h;
    }

    @Override // com.waze.t.b.aj
    public final /* bridge */ /* synthetic */ Object b(Object obj, ar arVar, h.c.e eVar) {
        com.waze.bq.b.a aVar = (com.waze.bq.b.a) obj;
        Objects.toString(aVar);
        this.f17242a.a("handle: action=".concat(aVar.toString()));
        Objects.toString(aVar);
        Toast.makeText(this.f17243b, "handle: action=".concat(aVar.toString()), 0).show();
        return new com.waze.bq.b.b(i.i("Stub Result 1", "Stub Result 2"));
    }
}
