package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class crg extends cxt<crm> {
    private final Object a;
    private final Object b;
    private final Object[] c = null;
    private final PointerInputEventHandler d;

    public crg(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new crm(this.a, this.b, this.d);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        crm crmVar = (crm) cfxVar;
        Object obj = crmVar.a;
        Object obj2 = this.a;
        boolean z = !affa.f(obj, obj2);
        crmVar.a = obj2;
        Object obj3 = crmVar.b;
        Object obj4 = this.b;
        boolean z2 = !affa.f(obj3, obj4);
        crmVar.b = obj4;
        Class<?> cls = crmVar.c.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls != pointerInputEventHandler.getClass() || (z | z2)) {
            crmVar.u();
        }
        crmVar.c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crg)) {
            return false;
        }
        crg crgVar = (crg) obj;
        if (!affa.f(this.a, crgVar.a) || !affa.f(this.b, crgVar.b)) {
            return false;
        }
        Object[] objArr = crgVar.c;
        return this.d == crgVar.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (((iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 961) + this.d.hashCode();
    }
}
