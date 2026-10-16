package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qxn extends defpackage.ijw implements android.os.IInterface {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn(defpackage.qsr qsrVar, int i) {
        super("com.google.android.gms.car.ICarMediaBrowserEventListener");
        this.a = i;
        this.b = new java.lang.ref.WeakReference(qsrVar);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        int i2 = this.a;
        if (i2 == 0) {
            if (i == 1) {
                java.lang.String string = parcel.readString();
                int i3 = parcel.readInt();
                boolean zJ = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                defpackage.qsr qsrVar = (defpackage.qsr) ((java.lang.ref.WeakReference) this.b).get();
                if (qsrVar == null) {
                    return true;
                }
                android.os.Handler handler = (android.os.Handler) qsrVar.b;
                handler.sendMessage(handler.obtainMessage(2, i3, zJ ? 1 : 0, string));
                return true;
            }
            if (i != 2) {
                return false;
            }
            java.lang.String string2 = parcel.readString();
            int i4 = parcel.readInt();
            defpackage.ijx.d(parcel);
            defpackage.qsr qsrVar2 = (defpackage.qsr) ((java.lang.ref.WeakReference) this.b).get();
            if (qsrVar2 == null) {
                return true;
            }
            android.os.Handler handler2 = (android.os.Handler) qsrVar2.b;
            handler2.sendMessage(handler2.obtainMessage(1, i4, 0, string2));
            return true;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i != 2) {
                    return false;
                }
                ((sno) this.b).b(new sxx(0));
                return true;
            }
            if (i != 2) {
                return false;
            }
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable samplerDecisionParcelableA = defpackage.ijx.a(parcel, com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable.CREATOR);
            defpackage.ijx.d(parcel);
            boolean zC = status.c();
            java.lang.Object obj = this.b;
            if (zC) {
                ((defpackage.lhe) obj).d(samplerDecisionParcelableA);
                return true;
            }
            ((defpackage.lhe) obj).c(defpackage.sqs.aC(status));
            return true;
        }
        switch (i) {
            case 1:
                com.google.android.gearhead.sdk.assistant.CarAssistantEvent carAssistantEventA = defpackage.ijx.a(parcel, com.google.android.gearhead.sdk.assistant.CarAssistantEvent.CREATOR);
                defpackage.ijx.d(parcel);
                carAssistantEventA.getClass();
                ((defpackage.wyz) this.b).p(carAssistantEventA);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.wyz) this.b).q();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.gearhead.sdk.assistant.VoiceSessionResult voiceSessionResultA = defpackage.ijx.a(parcel, com.google.android.gearhead.sdk.assistant.VoiceSessionResult.CREATOR);
                defpackage.ijx.d(parcel);
                voiceSessionResultA.getClass();
                boolean zS = ((defpackage.wyz) this.b).s(voiceSessionResultA);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.yqj) defpackage.szw.a.g()).u("Unexpected call to onFocusLost");
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArrH = ((defpackage.wyz) this.b).o().h();
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrH);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, null);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean zJ2 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                defpackage.abor aborVarN = otz.a.n();
                aborVarN.t();
                otz otzVar = aborVarN.b;
                otzVar.b |= 1;
                otzVar.c = zJ2;
                otz otzVarQ = aborVarN.q();
                otzVarQ.getClass();
                defpackage.wyz.t(otzVarQ);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                boolean zJ3 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                defpackage.abor aborVarN2 = otz.a.n();
                aborVarN2.t();
                otz otzVar2 = aborVarN2.b;
                otzVar2.b |= 2;
                otzVar2.d = zJ3;
                otz otzVarQ2 = aborVarN2.q();
                otzVarQ2.getClass();
                defpackage.wyz.t(otzVarQ2);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn(defpackage.lhe lheVar, int i) {
        super("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
        this.a = i;
        this.b = lheVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn(sno snoVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = snoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn(defpackage.wyz wyzVar, int i) {
        super("com.google.android.gearhead.sdk.assistant.ICarAssistantClientCallbacks");
        this.a = i;
        this.b = wyzVar;
    }
}
