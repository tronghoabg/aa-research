package defpackage;

import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ezb extends afey implements afeg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i) {
        super(2, obj, ezd.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        this.a = i;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) throws JSONException {
        boolean zB;
        switch (this.a) {
            case 0:
                return ezd.b((ezc) this.receiver, (afec) obj, (afck) obj2);
            case 1:
                cis cisVar = (cis) obj;
                cis cisVar2 = (cis) obj2;
                dmp dmpVar = (dmp) this.receiver;
                if (dmpVar.A && (zB = cisVar2.b()) != cisVar.b()) {
                    azp azpVar = null;
                    if (zB) {
                        azp azpVarB = dmpVar.b();
                        if (azpVarB != null) {
                            azpVarB.d();
                            azpVar = azpVarB;
                        }
                        dmpVar.a = azpVar;
                    } else {
                        azp azpVar2 = dmpVar.a;
                        if (azpVar2 != null) {
                            azpVar2.a();
                        }
                        dmpVar.a = null;
                    }
                }
                return afak.a;
            case 2:
                return ezd.b((ezc) this.receiver, (afec) obj, (afck) obj2);
            case 3:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                gzr gzrVar = (gzr) this.receiver;
                gzrVar.c = iIntValue;
                gzrVar.d = iIntValue2;
                return afak.a;
            case 4:
                ((ges) this.receiver).a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return afak.a;
            case 5:
                ((ges) this.receiver).d(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return afak.a;
            case 6:
                ((ges) this.receiver).b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return afak.a;
            case 7:
                llu lluVar = (llu) obj;
                htm htmVar = (htm) obj2;
                lluVar.getClass();
                htmVar.getClass();
                ((lke) this.receiver).l(lluVar, htmVar);
                return afak.a;
            case 8:
                llu lluVar2 = (llu) obj;
                htm htmVar2 = (htm) obj2;
                lluVar2.getClass();
                htmVar2.getClass();
                ((lke) this.receiver).l(lluVar2, htmVar2);
                return afak.a;
            case 9:
                llu lluVar3 = (llu) obj;
                htm htmVar3 = (htm) obj2;
                lluVar3.getClass();
                htmVar3.getClass();
                ((lke) this.receiver).l(lluVar3, htmVar3);
                return afak.a;
            case 10:
                llu lluVar4 = (llu) obj;
                htm htmVar4 = (htm) obj2;
                lluVar4.getClass();
                htmVar4.getClass();
                ((lke) this.receiver).l(lluVar4, htmVar4);
                return afak.a;
            case 11:
                kkf kkfVar = (kkf) obj;
                kkf kkfVar2 = (kkf) obj2;
                kkfVar.getClass();
                kkfVar2.getClass();
                boolean z = kkfVar instanceof kkc;
                if (z && (kkfVar2 instanceof kkc)) {
                    return new kkc(((Boolean) ((kkc) kkfVar2).a).booleanValue() ? noq.c : ((Boolean) ((kkc) kkfVar).a).booleanValue() ? noq.b : noq.a);
                }
                if (z) {
                    return new kkc(((Boolean) ((kkc) kkfVar).a).booleanValue() ? noq.b : noq.a);
                }
                return ((kkfVar2 instanceof kkd) || (kkfVar instanceof kkd)) ? kkd.a : kke.a;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                opr oprVarA = opr.a.a();
                oqa oqaVar = oprVarA.g;
                if (iIntValue3 >= 0) {
                    tcv tcvVar = oqaVar.a;
                    if (iIntValue3 < tcvVar.b() && iIntValue4 >= 0 && iIntValue4 < tcvVar.b()) {
                        tcvVar.add(iIntValue4, (oqb) tcvVar.c(iIntValue3));
                    }
                }
                oprVarA.i();
                return afak.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, byte[] bArr) {
        super(2, obj, dmp.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, float[] fArr) {
        super(2, obj, ges.class, "onFling", "onFling(FF)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, int[] iArr) {
        super(2, obj, ges.class, "onClick", "onClick(FF)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, short[] sArr) {
        super(2, obj, gzr.class, "updateFilterChipScrollPosition", "updateFilterChipScrollPosition(II)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, boolean[] zArr) {
        super(2, obj, ges.class, "onScroll", "onScroll(FF)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, byte[][] bArr) {
        super(2, obj, lke.class, "showChildScreen", "showChildScreen(Lcom/google/android/apps/auto/components/media/compat/AaMediaBrowser$AaMediaItem;Lcom/google/android/apps/auto/components/media/app/items/StyleConfig;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, float[][] fArr) {
        super(2, obj, oqc.class, "moveWidget", "moveWidget(II)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(Object obj, int i, boolean[][] zArr) {
        super(2, obj, nop.class, "combineAcSettings", "combineAcSettings(Lcom/google/android/apps/auto/components/carcontrol/CarPropertyState;Lcom/google/android/apps/auto/components/carcontrol/CarPropertyState;)Lcom/google/android/apps/auto/components/carcontrol/CarPropertyState;", 0);
        this.a = i;
    }
}
