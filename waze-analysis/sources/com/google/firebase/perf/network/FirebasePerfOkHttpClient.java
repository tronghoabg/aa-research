package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import java.io.IOException;
import okhttp3.ae;
import okhttp3.al;
import okhttp3.aq;
import okhttp3.at;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void a(aq aqVar, com.google.firebase.perf.metrics.f fVar, long j2, long j3) {
        al alVarI = aqVar.i();
        fVar.p(alVarI.g().j().toString());
        fVar.f(alVarI.c());
        if (alVarI.h() != null) {
            long jA = alVarI.h().a();
            if (jA != -1) {
                fVar.i(jA);
            }
        }
        at atVarM = aqVar.m();
        if (atVarM != null) {
            long jA2 = atVarM.a();
            if (jA2 != -1) {
                fVar.l(jA2);
            }
            ae aeVarB = atVarM.b();
            if (aeVarB != null) {
                fVar.k(aeVarB.toString());
            }
        }
        fVar.g(aqVar.a());
        fVar.j(j2);
        fVar.n(j3);
        fVar.e();
    }

    public static void enqueue(okhttp3.f fVar, okhttp3.g gVar) {
        m mVar = new m();
        fVar.d(new g(gVar, com.google.firebase.perf.d.f.a(), mVar, mVar.d()));
    }

    public static aq execute(okhttp3.f fVar) throws IOException {
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        m mVar = new m();
        long jD = mVar.d();
        try {
            aq aqVarB = fVar.b();
            a(aqVarB, fVarB, jD, mVar.b());
            return aqVarB;
        } catch (IOException e2) {
            al alVarA = fVar.a();
            if (alVarA != null) {
                fVarB.p(alVarA.g().j().toString());
                if (alVarA.c() != null) {
                    fVarB.f(alVarA.c());
                }
            }
            fVarB.j(jD);
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }
}
