package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class syy implements defpackage.syq {
    @Override // defpackage.syq
    public final void a(qog qogVar) {
        java.lang.String string;
        defpackage.qof qofVar;
        int iAt = defpackage.a.at(qogVar.f);
        if ((iAt != 0 && iAt == 6 && android.util.Log.isLoggable("AppDoctorLogger", 6)) || android.util.Log.isLoggable("AppDoctorLogger", 4)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppDoctorEvent<");
            if ((qogVar.b & 1) != 0) {
                sb.append("package_name='");
                sb.append(qogVar.c);
                sb.append("' ");
            }
            if ((qogVar.b & 2) != 0) {
                sb.append("process_name='");
                sb.append(qogVar.d);
                sb.append("' ");
            }
            sb.append("fix='");
            qoh qohVarB = qoh.b(qogVar.e);
            if (qohVarB == null) {
                qohVarB = qoh.p;
            }
            sb.append(qohVarB.a());
            sb.append("' status='");
            int iAt2 = defpackage.a.at(qogVar.f);
            if (iAt2 == 0) {
                iAt2 = 1;
            }
            int i = iAt2 - 2;
            if (i == 0) {
                string = "UNSPECIFIED";
            } else if (i == 1) {
                string = "PROPOSED";
            } else if (i == 2) {
                string = "COMPLETED";
            } else if (i == 3) {
                string = "SKIPPED";
            } else if (i != 4) {
                string = i != 5 ? java.lang.Integer.toString(defpackage.adrq.z(iAt2)) : "IN_PROGRESS";
            } else {
                string = "FAILED";
            }
            sb.append(string);
            sb.append("' entryPoint='");
            int i2 = qogVar.g;
            if (i2 == 0) {
                qofVar = defpackage.qof.UNKNOWN;
            } else if (i2 != 1) {
                qofVar = i2 != 2 ? null : defpackage.qof.TELEDOCTOR;
            } else {
                qofVar = defpackage.qof.STARTUP;
            }
            if (qofVar == null) {
                qofVar = defpackage.qof.UNRECOGNIZED;
            }
            sb.append(qofVar.a());
            sb.append("'>");
            int iAt3 = defpackage.a.at(qogVar.f);
            if (iAt3 != 0 && iAt3 == 6) {
                android.util.Log.e("AppDoctorLogger", sb.toString());
            } else {
                android.util.Log.i("AppDoctorLogger", sb.toString());
            }
        }
    }
}
