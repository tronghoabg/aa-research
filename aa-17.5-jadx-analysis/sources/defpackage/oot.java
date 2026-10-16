package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class oot implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ oot(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [bym, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        long jC;
        ajlj[] ajljVarArr;
        ajks ajksVar;
        int iMin;
        int i;
        int i2 = this.c;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        switch (i2) {
            case 0:
                mlq.l(this.a).invoke(false);
                mlq.m(this.b).invoke(fValueOf);
                return afak.a;
            case 1:
                mlq.l(this.a).invoke(false);
                mlq.m(this.b).invoke(fValueOf);
                return afak.a;
            case 2:
                this.a.b(Boolean.valueOf(false));
                ((byb) this.b).h(BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 3:
                this.a.b(Boolean.valueOf(false));
                ((byb) this.b).h(BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 4:
                ((kwp) this.b).q(0);
                this.a.b(Boolean.valueOf(true));
                return afak.a;
            case 5:
                Object obj = this.a;
                if (obj != null) {
                    this.b.invoke(obj);
                }
                return afak.a;
            case 6:
                this.b.invoke(((opt) this.a).c);
                return afak.a;
            case 7:
                ((kwp) this.b).q(0);
                this.a.b(Boolean.valueOf(true));
                return afak.a;
            case 8:
                this.b.invoke(((opt) this.a).c);
                return afak.a;
            case 9:
                return ((aisp) this.b).g(this.a);
            case 10:
                Object obj2 = this.b;
                Object obj3 = this.a;
                try {
                    ((ajlc) obj3).b.b((ajlj) obj2);
                } catch (IOException e) {
                    ajly.c.d("Http2Connection.Listener failure for ".concat(String.valueOf(((ajlc) obj3).d)), 4, e);
                    try {
                        ((ajlj) obj2).l(2, e);
                    } catch (IOException unused) {
                    }
                }
                return afak.a;
            case 11:
                affv affvVar = new affv();
                ajlc ajlcVar = ((ajlb) this.a).a;
                Object obj4 = this.b;
                synchronized (ajlcVar.t) {
                    synchronized (ajlcVar) {
                        ajlp ajlpVar = ajlcVar.r;
                        ajlp ajlpVar2 = new ajlp();
                        ajlpVar2.e(ajlpVar);
                        ajlpVar2.e((ajlp) obj4);
                        affvVar.a = ajlpVar2;
                        jC = ((ajlp) affvVar.a).c() - ajlpVar.c();
                        byte[] bArr = null;
                        if (jC != 0) {
                            Map map = ajlcVar.c;
                            ajljVarArr = map.isEmpty() ? null : (ajlj[]) map.values().toArray(new ajlj[0]);
                        } else {
                            ajljVarArr = null;
                            jC = 0;
                        }
                        ajlp ajlpVar3 = (ajlp) affvVar.a;
                        ajlpVar3.getClass();
                        ajlcVar.r = ajlpVar3;
                        ajlcVar.k.e(a.bK(ajlcVar.d, " onSettings"), new oot(ajlcVar, affvVar, 12, bArr));
                    }
                    try {
                        ajlk ajlkVar = ajlcVar.t;
                        ajlp ajlpVar4 = (ajlp) affvVar.a;
                        ajlpVar4.getClass();
                        synchronized (ajlkVar) {
                            if (ajlkVar.e) {
                                throw new IOException("closed");
                            }
                            int i3 = ajlkVar.d;
                            if ((ajlpVar4.a & 32) != 0) {
                                i3 = ((int[]) ajlpVar4.b)[5];
                            }
                            ajlkVar.d = i3;
                            if (ajlpVar4.b() != -1 && (i = (ajksVar = ajlkVar.f).d) != (iMin = Math.min(ajlpVar4.b(), 16384))) {
                                if (iMin < i) {
                                    ajksVar.b = Math.min(ajksVar.b, iMin);
                                }
                                ajksVar.c = true;
                                ajksVar.d = iMin;
                                int i4 = ajksVar.h;
                                if (iMin < i4) {
                                    if (iMin == 0) {
                                        ajksVar.a();
                                    } else {
                                        ajksVar.e(i4 - iMin);
                                    }
                                }
                            }
                            ajlkVar.c(0, 0, 4, 1);
                            ajlkVar.b.flush();
                        }
                    } catch (IOException e2) {
                        ajlcVar.c(e2);
                    }
                }
                if (ajljVarArr != null) {
                    for (ajlj ajljVar : ajljVarArr) {
                        synchronized (ajljVar) {
                            ajljVar.c(jC);
                        }
                    }
                }
                return afak.a;
            default:
                ((ajlc) this.b).b.j((ajlp) ((affv) this.a).a);
                return afak.a;
        }
    }

    public /* synthetic */ oot(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
