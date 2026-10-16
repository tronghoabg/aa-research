package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sg {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;

    public sg() {
        androidx.car.app.hardware.common.CarValue<java.lang.String> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_STRING;
        this.a = carValue;
        this.b = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
        this.c = carValue;
    }

    private final void r() {
        defpackage.zlv.n(this.a, "Event has been recycled.");
    }

    public final boolean a() {
        return this.b != null;
    }

    public final defpackage.udw b() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.a;
        if (obj2 == null || (obj = this.c) == null) {
            throw new java.lang.IllegalStateException();
        }
        return new defpackage.udw((defpackage.abjk) obj2, (byte[]) obj, (java.lang.String) this.b);
    }

    public final void c(defpackage.abjk abjkVar) {
        abjkVar.getClass();
        this.a = abjkVar;
    }

    public final void d(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    public final float e() {
        if (this.c == null) {
            this.c = java.lang.Float.valueOf((float) java.lang.Math.atan2(g(k() - 1) - g(0), i(k() - 1) - i(0)));
        }
        return ((java.lang.Float) this.c).floatValue();
    }

    public final float f() {
        if (this.b == null) {
            float fG = g(0) - g(k() - 1);
            float fI = i(0) - i(k() - 1);
            this.b = java.lang.Float.valueOf((float) java.lang.Math.sqrt((fG * fG) + (fI * fI)));
        }
        return ((java.lang.Float) this.b).floatValue();
    }

    public final float g(int i) {
        r();
        return ((android.view.MotionEvent) this.a).getX(i);
    }

    public final float h() {
        r();
        return defpackage.zlv.l;
    }

    public final float i(int i) {
        r();
        return ((android.view.MotionEvent) this.a).getY(i);
    }

    public final float j() {
        r();
        return defpackage.zlv.m;
    }

    public final int k() {
        r();
        return ((android.view.MotionEvent) this.a).getPointerCount();
    }

    public final long l() {
        r();
        return ((android.view.MotionEvent) this.a).getEventTime();
    }

    public final void m() {
        r();
        ((android.view.MotionEvent) this.a).recycle();
        this.a = null;
    }

    public final defpackage.wim n() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = this.c;
        if (obj3 != null && (obj = this.b) != null && (obj2 = this.a) != null) {
            return new defpackage.wim((java.lang.String) obj3, (java.lang.String) obj, (defpackage.win) obj2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" sessionId");
        }
        if (this.b == null) {
            sb.append(" triggerId");
        }
        if (this.a == null) {
            sb.append(" surveyStyle");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void o(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sessionId");
        }
        this.c = str;
    }

    public final void p(defpackage.win winVar) {
        if (winVar == null) {
            throw new java.lang.NullPointerException("Null surveyStyle");
        }
        this.a = winVar;
    }

    public final void q(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null triggerId");
        }
        this.b = str;
    }

    public sg(byte[] bArr) {
    }

    public sg(char[] cArr) {
        this.a = null;
        this.c = defpackage.upo.OK;
        this.b = null;
    }

    public sg(android.view.MotionEvent motionEvent) {
        defpackage.zlv.m(motionEvent);
        this.a = motionEvent;
    }
}
