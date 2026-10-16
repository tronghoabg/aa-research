package defpackage;

import android.graphics.Bitmap;
import android.opengl.Matrix;
import android.os.Binder;
import android.os.IBinder;
import android.view.MotionEvent;
import android.widget.ListView;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aagd {
    public final int a;
    public final Object b;
    public final Object c;

    public aagd(cng cngVar, List list) {
        Object obj;
        this.b = cngVar;
        this.c = list;
        if (list.isEmpty()) {
            obj = null;
        } else {
            obj = list.get(0);
            int iA = ((ahl) ((sx) obj).a).a();
            int iBh = woy.bh(list);
            if (iBh > 0) {
                int i = 1;
                while (true) {
                    Object obj2 = list.get(i);
                    int iA2 = ((ahl) ((sx) obj2).a).a();
                    int i2 = iA < iA2 ? iA2 : iA;
                    obj = iA < iA2 ? obj2 : obj;
                    if (i == iBh) {
                        break;
                    }
                    i++;
                    iA = i2;
                }
            }
        }
        sx sxVar = (sx) obj;
        this.a = sxVar != null ? ((ahl) sxVar.a).a() : 0;
    }

    public final ListView a() {
        return ((lk) this.c).e;
    }

    public aagd(int i, ubf ubfVar, ubf ubfVar2) {
        this.a = i;
        this.b = ubfVar;
        this.c = ubfVar2;
    }

    public aagd(Bitmap bitmap, Map map, int i) {
        this.b = bitmap;
        this.c = map;
        this.a = i;
    }

    public aagd(String str, int i, String str2) {
        this.b = str;
        this.a = i;
        this.c = str2;
    }

    public aagd(ln lnVar, hg hgVar, int i) {
        this.c = lnVar;
        this.b = hgVar;
        this.a = i;
    }

    public aagd(aago aagoVar, String str, int i, float[] fArr) {
        zkt.n(aagoVar, "label");
        zkt.n(str, "fullText");
        this.a = i;
        zkt.e(i != 0, "glTextureHandle");
        zkt.n(fArr, "model2worldMatrix");
        this.b = fArr;
        int length = fArr.length;
        zkt.e(length == 16, String.format("model2worldMatrix.length:%s", Integer.valueOf(length)));
        float[] fArr2 = new float[16];
        this.c = fArr2;
        Matrix.setIdentityM(fArr2, 0);
    }

    public aagd(int i, ubf ubfVar) {
        this.a = i;
        this.b = ubfVar;
        this.c = null;
    }

    public aagd(qwg qwgVar, IBinder.DeathRecipient deathRecipient) {
        this.c = qwgVar;
        this.b = deathRecipient;
        this.a = Binder.getCallingPid();
    }

    public aagd(List list, int i, MotionEvent motionEvent) {
        this.c = list;
        this.a = i;
        this.b = motionEvent;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }
}
