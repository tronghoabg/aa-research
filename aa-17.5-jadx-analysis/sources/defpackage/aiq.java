package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;

/* loaded from: classes.dex */
public final class aiq extends afde implements afeg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(air airVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = airVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.b) {
            case 0:
                return new aiq((air) this.a, afckVar, 0);
            case 1:
                return new aiq((air) this.a, afckVar, 1, (byte[]) null);
            case 2:
                return new aiq((apl) this.a, afckVar, 2);
            case 3:
                return new aiq((apl) this.a, afckVar, 3, (byte[]) null);
            case 4:
                return new aiq((apl) this.a, afckVar, 4, (char[]) null);
            case 5:
                return new aiq((apl) this.a, afckVar, 5, (short[]) null);
            case 6:
                return new aiq((apl) this.a, afckVar, 6, (int[]) null);
            case 7:
                return new aiq((apl) this.a, afckVar, 7, (boolean[]) null);
            case 8:
                return new aiq((apl) this.a, afckVar, 8, (float[]) null);
            case 9:
                return new aiq((apl) this.a, afckVar, 9, (byte[][]) null);
            default:
                return new aiq((bke) this.a, afckVar, 10);
        }
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        String str;
        switch (this.b) {
            case 0:
                woy.dF(obj);
                Object obj2 = this.a;
                air airVar = (air) obj2;
                asa asaVar = airVar.f;
                if (asaVar != null) {
                    asb asbVar = new asb(asaVar);
                    asf asfVar = airVar.a;
                    if (asfVar != null) {
                        ahnc.d(((cfx) obj2).N(), null, 0, new ain(asfVar, asbVar, (afck) null, 0), 3);
                    }
                    airVar.f = null;
                }
                return afak.a;
            case 1:
                woy.dF(obj);
                Object obj3 = this.a;
                air airVar2 = (air) obj3;
                if (airVar2.f == null) {
                    asa asaVar2 = new asa();
                    asf asfVar2 = airVar2.a;
                    if (asfVar2 != null) {
                        ahnc.d(((cfx) obj3).N(), null, 0, new ain(asfVar2, asaVar2, (afck) null, 1), 3);
                    }
                    airVar2.f = asaVar2;
                }
                return afak.a;
            case 2:
                woy.dF(obj);
                ((apl) this.a).p();
                return afak.a;
            case 3:
                woy.dF(obj);
                ((apl) this.a).q();
                return afak.a;
            case 4:
                woy.dF(obj);
                ((apl) this.a).q();
                return afak.a;
            case 5:
                woy.dF(obj);
                ((apl) this.a).p();
                return afak.a;
            case 6:
                woy.dF(obj);
                ((apl) this.a).q();
                return afak.a;
            case 7:
                woy.dF(obj);
                ((apl) this.a).q();
                return afak.a;
            case 8:
                woy.dF(obj);
                ((apl) this.a).p();
                return afak.a;
            case 9:
                woy.dF(obj);
                ((apl) this.a).q();
                return afak.a;
            default:
                woy.dF(obj);
                bke bkeVar = (bke) this.a;
                Context context = bkeVar.a;
                bki bkiVar = bkeVar.b;
                TextClassificationManager textClassificationManagerM10m = a$$ExternalSyntheticApiModelOutline0.m10m(context.getSystemService(a$$ExternalSyntheticApiModelOutline0.m14m()));
                int iOrdinal = bkiVar.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        throw new aezs();
                    }
                    str = "textview";
                }
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManagerM10m.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                bkeVar.c = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 8:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 9:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((aiq) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(air airVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = airVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i, float[] fArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i, int[] iArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i, short[] sArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i, boolean[] zArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(apl aplVar, afck afckVar, int i, byte[][] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aplVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiq(bke bkeVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = bkeVar;
    }
}
