package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aahg {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public aahg(defpackage.cno cnoVar, java.util.List list) {
        java.lang.Object obj;
        this.b = cnoVar;
        this.c = list;
        if (!list.isEmpty()) {
            obj = list.get(0);
            int iA = ((defpackage.ahr) ((defpackage.tc) obj).a).a();
            int iAb = defpackage.afga.ab(list);
            if (iAb > 0) {
                int i = 1;
                while (true) {
                    java.lang.Object obj2 = list.get(i);
                    int iA2 = ((defpackage.ahr) ((defpackage.tc) obj2).a).a();
                    int i2 = iA < iA2 ? iA2 : iA;
                    obj = iA < iA2 ? obj2 : obj;
                    if (i == iAb) {
                        break;
                    }
                    i++;
                    iA = i2;
                }
            }
        } else {
            obj = null;
        }
        defpackage.tc tcVar = (defpackage.tc) obj;
        this.a = tcVar != null ? ((defpackage.ahr) tcVar.a).a() : 0;
    }

    public final android.widget.ListView a() {
        return ((defpackage.ll) this.c).e;
    }

    public aahg(int i, defpackage.ucc uccVar, defpackage.ucc uccVar2) {
        this.a = i;
        this.b = uccVar;
        this.c = uccVar2;
    }

    public aahg(android.graphics.Bitmap bitmap, java.util.Map map, int i) {
        this.b = bitmap;
        this.c = map;
        this.a = i;
    }

    public aahg(java.lang.String str, int i, java.lang.String str2) {
        this.b = str;
        this.a = i;
        this.c = str2;
    }

    public aahg(defpackage.lo loVar, defpackage.hh hhVar, int i) {
        this.c = loVar;
        this.b = hhVar;
        this.a = i;
    }

    public aahg(defpackage.aahr aahrVar, java.lang.String str, int i, float[] fArr) {
        defpackage.zlv.n(aahrVar, "label");
        defpackage.zlv.n(str, "fullText");
        this.a = i;
        defpackage.zlv.e(i != 0, "glTextureHandle");
        defpackage.zlv.n(fArr, "model2worldMatrix");
        this.b = fArr;
        int length = fArr.length;
        defpackage.zlv.e(length == 16, java.lang.String.format("model2worldMatrix.length:%s", java.lang.Integer.valueOf(length)));
        float[] fArr2 = new float[16];
        this.c = fArr2;
        android.opengl.Matrix.setIdentityM(fArr2, 0);
    }

    public aahg(int i, defpackage.ucc uccVar) {
        this.a = i;
        this.b = uccVar;
        this.c = null;
    }

    public aahg(defpackage.qxc qxcVar, android.os.IBinder.DeathRecipient deathRecipient) {
        this.c = qxcVar;
        this.b = deathRecipient;
        this.a = android.os.Binder.getCallingPid();
    }

    public aahg(java.util.List list, int i, android.view.MotionEvent motionEvent) {
        this.b = list;
        this.a = i;
        this.c = motionEvent;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("changes cannot be empty");
        }
    }

    public aahg(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration, android.content.res.Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }
}
