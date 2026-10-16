package com.google.v;

import com.google.v.fi;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ds<ContainingType extends fi, Type> extends dc<ContainingType, Type> {

    /* renamed from: a, reason: collision with root package name */
    final fi f12875a;

    /* renamed from: b, reason: collision with root package name */
    final Object f12876b;

    /* renamed from: c, reason: collision with root package name */
    final fi f12877c;

    /* renamed from: d, reason: collision with root package name */
    final dr f12878d;

    ds(fi fiVar, Object obj, fi fiVar2, dr drVar) {
        if (fiVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (drVar.f12872c == gm.MESSAGE && fiVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f12875a = fiVar;
        this.f12876b = obj;
        this.f12877c = fiVar2;
        this.f12878d = drVar;
    }

    public final gm A() {
        return this.f12878d.f12872c;
    }

    final Object B(Object obj) {
        dr drVar = this.f12878d;
        if (drVar.c() != gn.f13029h) {
            return obj;
        }
        return drVar.f12870a.findValueByNumber(((Integer) obj).intValue());
    }

    final Object C(Object obj) {
        return this.f12878d.c() == gn.f13029h ? Integer.valueOf(((eg) obj).getNumber()) : obj;
    }

    public final boolean D() {
        return this.f12878d.f12873d;
    }

    public final int z() {
        return this.f12878d.f12871b;
    }
}
