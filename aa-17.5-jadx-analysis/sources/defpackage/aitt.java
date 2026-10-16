package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class aitt implements afec {
    private final /* synthetic */ int a;

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.a;
        if (i == 0) {
            afcm afcmVar = (afcm) obj;
            if (afcmVar instanceof aitu) {
                return (aitu) afcmVar;
            }
            return null;
        }
        if (i == 1) {
            ((tdk) obj).getClass();
            return new ArrayList();
        }
        afcm afcmVar2 = (afcm) obj;
        if (afcmVar2 instanceof aiuz) {
            return (aiuz) afcmVar2;
        }
        return null;
    }
}
