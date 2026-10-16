package com.google.b.d.b;

import androidx.collection.SimpleArrayMap;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    static final r f7113a;

    /* renamed from: b, reason: collision with root package name */
    static final r f7114b;

    static {
        r rVarC = new q(null, new SimpleArrayMap(0)).c();
        f7113a = rVarC;
        q qVar = new q(rVarC, new SimpleArrayMap());
        ai aiVar = r.f7115d;
        an.v(!((r) qVar).f7118c, "Can't mutate after handing to trace");
        an.v(true ^ qVar.h(aiVar), "Key already present");
        ((r) qVar).f7117b.put(aiVar, true);
        f7114b = qVar.c();
    }

    /* synthetic */ q(SimpleArrayMap simpleArrayMap) {
        super(null, simpleArrayMap);
    }
}
