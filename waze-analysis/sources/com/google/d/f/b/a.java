package com.google.d.f.b;

import java.util.Calendar;
import java.util.Date;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.d.f.e.c {

    /* renamed from: a, reason: collision with root package name */
    protected final Object[] f7693a;

    /* renamed from: b, reason: collision with root package name */
    protected final StringBuilder f7694b;

    /* renamed from: c, reason: collision with root package name */
    private int f7695c;

    protected a(ag agVar, Object[] objArr, StringBuilder sb) {
        super(agVar);
        this.f7695c = 0;
        this.f7693a = objArr;
        this.f7694b = sb;
    }

    public static void g(f fVar, StringBuilder sb) {
        if (fVar.k() == null) {
            sb.append(i.a(fVar.l()));
            return;
        }
        a aVar = new a(fVar.k(), fVar.s(), sb);
        StringBuilder sb2 = (StringBuilder) aVar.j();
        if (fVar.s().length > aVar.h()) {
            sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
        }
    }

    private static void m(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(i.a(obj));
        sb.append("]");
    }

    @Override // com.google.d.f.e.c
    public final /* bridge */ /* synthetic */ Object a() {
        com.google.d.f.e.d dVarI = i();
        String strK = k();
        int i2 = this.f7695c;
        int length = k().length();
        StringBuilder sb = this.f7694b;
        dVarI.d(sb, strK, i2, length);
        return sb;
    }

    @Override // com.google.d.f.e.c
    public final void b(int i2, int i3, com.google.d.f.d.c cVar) {
        i().d(this.f7694b, k(), this.f7695c, i2);
        cVar.e(this, this.f7693a);
        this.f7695c = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r7, com.google.d.f.b.b r8, com.google.d.f.b.c r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.b.a.c(java.lang.Object, com.google.d.f.b.b, com.google.d.f.b.c):void");
    }

    public final void d(Object obj, com.google.d.f.d.a aVar, c cVar) {
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            cVar.k(sb);
            sb.append(true != cVar.i() ? 't' : 'T');
            sb.append(aVar.a());
            this.f7694b.append(String.format(i.f7770a, sb.toString(), obj));
            return;
        }
        m(this.f7694b, obj, "%t" + aVar.a());
    }

    public final void e() {
        this.f7694b.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    public final void f() {
        this.f7694b.append("null");
    }
}
