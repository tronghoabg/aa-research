package W3;

import Fe.c;
import J3.r;
import S3.g;
import S3.i;
import S3.l;
import S3.p;
import S3.s;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import ff.o;
import java.util.ArrayList;
import java.util.Iterator;
import k3.C3185q;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15147a;

    static {
        String strF = r.f("DiagnosticsWrkr");
        AbstractC3340k.d(strF, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f15147a = strF;
    }

    public static final String a(l lVar, s sVar, i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g gVarC = iVar.c(c.s(pVar));
            Integer numValueOf = gVarC != null ? Integer.valueOf(gVarC.f10959c) : null;
            lVar.getClass();
            C3185q c3185qD = C3185q.d(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = pVar.f10977a;
            if (str2 == null) {
                c3185qD.N(1);
            } else {
                c3185qD.x(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f10967a;
            workDatabase_Impl.b();
            Cursor cursorL = workDatabase_Impl.l(c3185qD);
            try {
                ArrayList arrayList2 = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    arrayList2.add(cursorL.isNull(0) ? null : cursorL.getString(0));
                }
                cursorL.close();
                c3185qD.h();
                String strW0 = o.w0(arrayList2, ",", null, null, null, 62);
                String strW02 = o.w0(sVar.r(str2), ",", null, null, null, 62);
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("\n", str2, "\t ");
                sbW.append(pVar.f10979c);
                sbW.append("\t ");
                sbW.append(numValueOf);
                sbW.append("\t ");
                switch (pVar.f10978b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbW.append(str);
                sbW.append("\t ");
                sbW.append(strW0);
                sbW.append("\t ");
                sbW.append(strW02);
                sbW.append('\t');
                sb2.append(sbW.toString());
            } catch (Throwable th) {
                cursorL.close();
                c3185qD.h();
                throw th;
            }
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
