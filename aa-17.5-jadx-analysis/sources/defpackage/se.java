package defpackage;

import androidx.car.app.hardware.common.CarValue;

/* loaded from: classes2.dex */
public final class se {
    public Object a;
    public Object b;
    public Object c;

    public se() {
        CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
        this.a = carValue;
        this.b = carValue;
        this.c = CarValue.UNKNOWN_INTEGER;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final olu a() {
        ?? r1;
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (r1 = this.b) != 0 && (obj = this.c) != null) {
            return new olu((olv) obj2, r1, (onm) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" icon");
        }
        if (this.b == null) {
            sb.append(" onClickListener");
        }
        if (this.c == null) {
            sb.append(" style");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public se(byte[] bArr) {
    }
}
