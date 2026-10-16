package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class sya implements sxs {
    @Override // defpackage.sxs
    public final void a(qnk qnkVar) {
        int iAu = a.au(qnkVar.f);
        if ((iAu != 0 && iAu == 6 && Log.isLoggable("AppDoctorLogger", 6)) || Log.isLoggable("AppDoctorLogger", 4)) {
            StringBuilder sb = new StringBuilder("AppDoctorEvent<");
            if ((qnkVar.b & 1) != 0) {
                sb.append("package_name='");
                sb.append(qnkVar.c);
                sb.append("' ");
            }
            if ((qnkVar.b & 2) != 0) {
                sb.append("process_name='");
                sb.append(qnkVar.d);
                sb.append("' ");
            }
            sb.append("fix='");
            qnl qnlVarB = qnl.b(qnkVar.e);
            if (qnlVarB == null) {
                qnlVarB = qnl.UNRECOGNIZED;
            }
            sb.append(qnlVarB.a());
            sb.append("' status='");
            int iAu2 = a.au(qnkVar.f);
            if (iAu2 == 0) {
                iAu2 = 1;
            }
            int i = iAu2 - 2;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(aclh.e(iAu2)) : "IN_PROGRESS" : "FAILED" : "SKIPPED" : "COMPLETED" : "PROPOSED" : "UNSPECIFIED");
            sb.append("' entryPoint='");
            int i2 = qnkVar.g;
            qnj qnjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : qnj.TELEDOCTOR : qnj.STARTUP : qnj.UNKNOWN;
            if (qnjVar == null) {
                qnjVar = qnj.UNRECOGNIZED;
            }
            sb.append(qnjVar.a());
            sb.append("'>");
            int iAu3 = a.au(qnkVar.f);
            if (iAu3 != 0 && iAu3 == 6) {
                Log.e("AppDoctorLogger", sb.toString());
            } else {
                Log.i("AppDoctorLogger", sb.toString());
            }
        }
    }
}
