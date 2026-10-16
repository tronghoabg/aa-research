package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class sqq implements sqv {
    private final /* synthetic */ int a;

    public sqq(int i) {
        this.a = i;
    }

    @Override // defpackage.sqv
    public final squ a(Context context, String str, sqt sqtVar) throws sqs {
        int iB;
        int i = -1;
        if (this.a != 0) {
            squ squVar = new squ();
            int iB2 = sqtVar.b(context, str, true);
            squVar.b = iB2;
            if (iB2 != 0) {
                squVar.c = 1;
                return squVar;
            }
            int iA = sqtVar.a(context, str);
            squVar.a = iA;
            if (iA != 0) {
                squVar.c = -1;
            }
            return squVar;
        }
        squ squVar2 = new squ();
        int iA2 = sqtVar.a(context, str);
        squVar2.a = iA2;
        int i2 = 0;
        if (iA2 != 0) {
            iB = sqtVar.b(context, str, false);
            squVar2.b = iB;
        } else {
            iB = sqtVar.b(context, str, true);
            squVar2.b = iB;
        }
        int i3 = squVar2.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            squVar2.c = i;
            return squVar2;
        }
        i2 = i3;
        if (i2 < iB) {
            i = 1;
        }
        squVar2.c = i;
        return squVar2;
    }
}
