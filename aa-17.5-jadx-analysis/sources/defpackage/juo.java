package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.integratedoverlay.OverlayParameters;
import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class juo implements afdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ juo(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [afec, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz, qsa {
        switch (this.c) {
            case 0:
                return jup.b(this.b, this.a);
            case 1:
                return jup.b(this.b, this.a);
            case 2:
                return jup.b(this.b, this.a);
            case 3:
                return jup.b(this.b, this.a);
            case 4:
                return jup.b(this.b, this.a);
            case 5:
                return jup.b(this.b, this.a);
            case 6:
                lgt lgtVar = lgu.a;
                mki.a.g();
                rjr rjrVarX = ols.x(kio.b().e(), CarDisplayId.a);
                ((rox) rjrVarX.b).g(new rcu(rjrVarX, yfq.q(new OverlayParameters(1, (Rect) this.b, this.a)), 12, null));
                return afak.a;
            case 7:
                return new tkd(new tkb((Context) this.b, new tjw(0), Integer.valueOf(this.a)));
            case 8:
                return new meo((Context) this.b, this.a);
            case 9:
                ((uk) this.b).a = this.a;
                return afak.a;
            case 10:
                int i = this.a;
                Object obj = this.b;
                try {
                    ((ajlc) obj).t.e(i, 9);
                    synchronized (obj) {
                        ((ajlc) obj).v.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return afak.a;
            case 11:
                int i2 = this.a;
                Object obj2 = this.b;
                try {
                    ((ajlc) obj2).t.e(i2, 9);
                    synchronized (obj2) {
                        ((ajlc) obj2).v.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return afak.a;
            default:
                int i3 = this.a;
                Object obj3 = this.b;
                synchronized (obj3) {
                    ((ajlc) obj3).v.remove(Integer.valueOf(i3));
                }
                return afak.a;
        }
    }
}
