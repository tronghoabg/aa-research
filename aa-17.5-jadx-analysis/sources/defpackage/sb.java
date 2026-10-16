package defpackage;

import android.view.MotionEvent;
import androidx.car.app.hardware.common.CarValue;

/* loaded from: classes2.dex */
public final class sb {
    public Object a;
    public Object b;
    public Object c;

    public sb() {
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        this.a = carValue;
        this.b = CarValue.UNKNOWN_INTEGER;
        this.c = carValue;
    }

    private final void r() {
        zkt.n(this.a, "Event has been recycled.");
    }

    public final boolean a() {
        return this.b != null;
    }

    public final ucz b() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 == null || (obj = this.c) == null) {
            throw new IllegalStateException();
        }
        return new ucz((abih) obj2, (byte[]) obj, (String) this.b);
    }

    public final void c(abih abihVar) {
        abihVar.getClass();
        this.a = abihVar;
    }

    public final void d(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    public final float e() {
        if (this.c == null) {
            float fG = g(0);
            float fI = i(0);
            this.c = Float.valueOf((float) Math.atan2(g(k() - 1) - fG, i(k() - 1) - fI));
        }
        return ((Float) this.c).floatValue();
    }

    public final float f() {
        if (this.b == null) {
            float fG = g(0) - g(k() - 1);
            float fI = i(0) - i(k() - 1);
            this.b = Float.valueOf((float) Math.sqrt((fG * fG) + (fI * fI)));
        }
        return ((Float) this.b).floatValue();
    }

    public final float g(int i) {
        r();
        return ((MotionEvent) this.a).getX(i);
    }

    public final float h() {
        r();
        return zkt.l;
    }

    public final float i(int i) {
        r();
        return ((MotionEvent) this.a).getY(i);
    }

    public final float j() {
        r();
        return zkt.m;
    }

    public final int k() {
        r();
        return ((MotionEvent) this.a).getPointerCount();
    }

    public final long l() {
        r();
        return ((MotionEvent) this.a).getEventTime();
    }

    public final void m() {
        r();
        ((MotionEvent) this.a).recycle();
        this.a = null;
    }

    public final whn n() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 != null && (obj = this.b) != null && (obj2 = this.a) != null) {
            return new whn((String) obj3, (String) obj, (who) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" sessionId");
        }
        if (this.b == null) {
            sb.append(" triggerId");
        }
        if (this.a == null) {
            sb.append(" surveyStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.c = str;
    }

    public final void p(who whoVar) {
        if (whoVar == null) {
            throw new NullPointerException("Null surveyStyle");
        }
        this.a = whoVar;
    }

    public final void q(String str) {
        if (str == null) {
            throw new NullPointerException("Null triggerId");
        }
        this.b = str;
    }

    public sb(byte[] bArr) {
    }

    public sb(char[] cArr) {
        this.a = null;
        this.c = uop.OK;
        this.b = null;
    }

    public sb(MotionEvent motionEvent) {
        zkt.m(motionEvent);
        this.a = motionEvent;
    }
}
