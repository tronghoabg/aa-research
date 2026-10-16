package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class fnv implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fnv(String str, int i) {
        this.c = i;
        this.a = "DELETE FROM SystemIdInfo where work_spec_id=?";
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) throws Exception {
        fbk fbkVarA;
        cxd cxdVar;
        float f;
        char c;
        float f2;
        int i;
        long j;
        float f3;
        float f4;
        switch (this.c) {
            case 0:
                return sx.p((String) this.a, (String) this.b, (fca) obj);
            case 1:
                fca fcaVar = (fca) obj;
                fcaVar.getClass();
                ((fnx) this.b).b.c(fcaVar, this.a);
                return afak.a;
            case 2:
                return sx.m((String) this.a, (String) this.b, (fca) obj);
            case 3:
                return sx.p((String) this.a, (String) this.b, (fca) obj);
            case 4:
                return Integer.valueOf(sx.n((String) this.a, (String) this.b, (fca) obj));
            case 5:
                return sx.p((String) this.a, (String) this.b, (fca) obj);
            case 6:
                fca fcaVar2 = (fca) obj;
                fcaVar2.getClass();
                fbkVarA = fcaVar2.a((String) this.a);
                try {
                    fbkVarA.h(1, (String) this.b);
                    ArrayList arrayList = new ArrayList();
                    while (fbkVarA.k()) {
                        byte[] bArrL = fbkVarA.l(0);
                        fjc fjcVar = fjc.a;
                        arrayList.add(dsr.m(bArrL));
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                return Integer.valueOf(sx.n((String) this.a, (String) this.b, (fca) obj));
            case 8:
                return Boolean.valueOf(sx.q((String) this.a, (String) this.b, (fca) obj));
            case 9:
                return Integer.valueOf(sx.n((String) this.a, (String) this.b, (fca) obj));
            case 10:
                fca fcaVar3 = (fca) obj;
                fcaVar3.getClass();
                fbkVarA = fcaVar3.a((String) this.a);
                try {
                    fbkVarA.h(1, (String) this.b);
                    fju fjuVarF = null;
                    if (fbkVarA.k()) {
                        Integer numValueOf = fbkVarA.j(0) ? null : Integer.valueOf((int) fbkVarA.b(0));
                        if (numValueOf != null) {
                            fjuVarF = dtb.f(numValueOf.intValue());
                        }
                    }
                    return fjuVarF;
                } finally {
                }
            case 11:
                fca fcaVar4 = (fca) obj;
                fcaVar4.getClass();
                ((fom) this.b).a.c(fcaVar4, this.a);
                return afak.a;
            case 12:
                return sx.m((String) this.a, (String) this.b, (fca) obj);
            case 13:
                fca fcaVar5 = (fca) obj;
                fcaVar5.getClass();
                ((fop) this.b).b.c(fcaVar5, this.a);
                return afak.a;
            case 14:
                fpw fpwVar = (fpw) obj;
                fpwVar.getClass();
                ((ynz) ((ynz) gbf.a.h().o(ypi.a, "CarApp.H.LazyIcon")).p(fpwVar.a.c).ai(32)).y("Failed to render image for model: %s", this.b);
                this.a.b(Boolean.valueOf(true));
                return afak.a;
            case 15:
                String str = (String) obj;
                if (affa.f(str, this.a)) {
                    return afak.a;
                }
                this.b.invoke(str);
                return afak.a;
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                int length = str2.length();
                long jT = czz.t(length, length);
                long j2 = dfv.a;
                this.a.b(new djv(str2, jT, 4));
                ((gbv) this.b).e.invoke(str2);
                return afak.a;
            case 17:
                cxd cxdVar2 = (cxd) obj;
                cxdVar2.getClass();
                cxdVar2.q();
                long jO = cxdVar2.o() & 4294967295L;
                ?? r7 = this.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) jO);
                boolean zBooleanValue = ((Boolean) r7.invoke()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) this.b.invoke()).booleanValue();
                float f5 = 0.05f * fIntBitsToFloat;
                float f6 = 0.95f * fIntBitsToFloat;
                if (zBooleanValue) {
                    j = 4294967295L;
                    cjs cjsVarO = cjn.o(woy.bi(new cjv(cjv.h(-72057594037927936L, 0.55f)), new cjv(-72057594037927936L)), BitmapDescriptorFactory.HUE_RED, f5);
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cxdVar2.o() >> 32))) << 32);
                    cxdVar = cxdVar2;
                    f = fIntBitsToFloat;
                    f3 = f6;
                    f2 = BitmapDescriptorFactory.HUE_RED;
                    f4 = 0.55f;
                    c = 0;
                    i = 2;
                    czz.aK(cxdVar, cjsVarO, 0L, jFloatToRawIntBits, null, 6, 58);
                } else {
                    cxdVar = cxdVar2;
                    f = fIntBitsToFloat;
                    c = 0;
                    f2 = 0.0f;
                    i = 2;
                    j = 4294967295L;
                    f3 = f6;
                    f4 = 0.55f;
                }
                if (zBooleanValue2) {
                    cjv[] cjvVarArr = new cjv[i];
                    cjvVarArr[c] = new cjv(-72057594037927936L);
                    cjvVarArr[1] = new cjv(cjv.h(-72057594037927936L, f4));
                    czz.aK(cxdVar, cjn.o(woy.bi(cjvVarArr), f3, f), (Float.floatToRawIntBits(f3) & j) | (Float.floatToRawIntBits(f2) << 32), 0L, null, 6, 60);
                }
                return afak.a;
            case 18:
                ((geu) this.a).t().b(gnk.K, new aia(this.b, ((Integer) obj).intValue(), 7));
                return afak.a;
            case 19:
                ((geu) this.a).t().b(gnk.L, new aia(this.b, ((Integer) obj).intValue(), 6));
                return afak.a;
            default:
                ((geu) this.a).t().b(gnk.M, new aia(this.b, ((Integer) obj).intValue(), 13));
                return afak.a;
        }
    }

    public /* synthetic */ fnv(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ fnv(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ fnv(String str, int i, byte[] bArr) {
        this.c = i;
        this.a = "SELECT name FROM workname WHERE work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, char[] cArr) {
        this.c = i;
        this.a = "DELETE from WorkProgress where work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, float[] fArr) {
        this.c = i;
        this.a = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, int[] iArr) {
        this.c = i;
        this.a = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, short[] sArr) {
        this.c = i;
        this.a = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, boolean[] zArr) {
        this.c = i;
        this.a = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, byte[][] bArr) {
        this.c = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, char[][] cArr) {
        this.c = i;
        this.a = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, int[][] iArr) {
        this.c = i;
        this.a = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ fnv(String str, int i, short[][] sArr) {
        this.c = i;
        this.a = "SELECT state FROM workspec WHERE id=?";
        this.b = str;
    }
}
