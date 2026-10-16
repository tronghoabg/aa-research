package defpackage;

import android.content.Intent;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class qhm implements kix {
    public final /* synthetic */ qrn a;
    public final /* synthetic */ qpi b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Intent d;
    private final /* synthetic */ int e;

    public /* synthetic */ qhm(qrn qrnVar, qpi qpiVar, boolean z, Intent intent, int i) {
        this.e = i;
        this.a = qrnVar;
        this.b = qpiVar;
        this.c = z;
        this.d = intent;
    }

    @Override // defpackage.kix
    public final Object a() throws qrz {
        qhn qhnVarF;
        List listJ;
        List listI;
        int i = this.e;
        boolean z = this.c;
        if (i != 0) {
            qpi qpiVar = this.b;
            qrn qrnVar = this.a;
            Intent intent = this.d;
            qhnVarF = qho.f(qrnVar, qpiVar);
            try {
                if (z) {
                    qho.e();
                    listI = qrnVar.a().k(intent, qpiVar.ordinal());
                } else {
                    qho.e();
                    listI = qrnVar.a().i(intent, qpiVar.ordinal());
                }
                if (qhnVarF != null) {
                    qhnVarF.close();
                }
                return listI;
            } finally {
            }
        }
        qpi qpiVar2 = this.b;
        qrn qrnVar2 = this.a;
        Intent intent2 = this.d;
        qhnVarF = qho.f(qrnVar2, qpiVar2);
        try {
            if (z) {
                qho.e();
                listJ = qrnVar2.a().l(intent2, qpiVar2.ordinal());
            } else {
                qho.e();
                listJ = qrnVar2.a().j(intent2, qpiVar2.ordinal());
            }
            if (qhnVarF != null) {
                qhnVarF.close();
            }
            return listJ;
        } finally {
        }
    }
}
