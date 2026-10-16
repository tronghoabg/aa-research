package r9;

import A7.AbstractC0279p0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f44588a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.v f44589b;

    public N(SQLiteDatabase sQLiteDatabase, a2.v vVar) {
        this.f44588a = sQLiteDatabase;
        this.f44589b = vVar;
    }

    public final void a() {
        M m10 = new M(this, 0);
        Cursor cursorRawQuery = this.f44588a.rawQuery("SELECT target_id, target_proto FROM targets", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                m10.accept(cursorRawQuery);
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorRawQuery.close();
    }

    public final void b(String[] strArr, Runnable runnable) {
        String strC = wg.b.c(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z2 = false;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            String str = strArr[i5];
            boolean zE = e(str);
            if (i5 == 0) {
                z2 = zE;
            } else if (zE != z2) {
                String strL = AbstractC0279p0.l("Expected all of ", strC, " to either exist or not, but ");
                throw new IllegalStateException(z2 ? AbstractC3256n.h(N0.a.j(strL), strArr[0], " exists and ", str, " does not") : AbstractC3256n.h(N0.a.j(strL), strArr[0], " does not exist and ", str, " does"));
            }
        }
        if (z2) {
            Ba.c.p("SQLiteSchema", AbstractC0279p0.l("Skipping migration because all of ", strC, " already exist"), 1, new Object[0]);
        } else {
            runnable.run();
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r13v3 ??, r13v4 ??, r13v6 ??, r13v5 ??, r13v8 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:695)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public final void c(int r24) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.N.c(int):void");
    }

    public final boolean d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f44588a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex(MediationMetaData.KEY_NAME);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList.indexOf(str2) != -1;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final boolean e(String str) {
        Cursor cursorRawQueryWithFactory = this.f44588a.rawQueryWithFactory(new jb.c(new Object[]{str}, 2), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
        try {
            boolean z2 = !cursorRawQueryWithFactory.moveToFirst();
            cursorRawQueryWithFactory.close();
            return !z2;
        } catch (Throwable th) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
