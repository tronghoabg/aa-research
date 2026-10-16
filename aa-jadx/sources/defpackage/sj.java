package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sj {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;

    public sj() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT;
        this.a = carValue;
        this.b = carValue;
        this.c = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final defpackage.omn a() {
        ?? r1;
        java.lang.Object obj;
        java.lang.Object obj2 = this.a;
        if (obj2 != null && (r1 = this.b) != 0 && (obj = this.c) != null) {
            return new defpackage.omn((defpackage.omo) obj2, r1, (defpackage.ooe) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" icon");
        }
        if (this.b == null) {
            sb.append(" onClickListener");
        }
        if (this.c == null) {
            sb.append(" style");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public sj(byte[] bArr) {
    }
}
