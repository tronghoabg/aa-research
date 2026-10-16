package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rft implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rft(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [afdk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, rne] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, rfx] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, rfy] */
    /* JADX WARN: Type inference failed for: r1v50, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        byte[] bArr = null;
        int i2 = 3;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.b;
                defpackage.oup oupVar = (defpackage.oup) obj;
                defpackage.out outVar = oupVar.c;
                if (outVar == null) {
                    outVar = defpackage.out.a;
                }
                defpackage.ouq ouqVar = oupVar.f;
                if (ouqVar == null) {
                    ouqVar = defpackage.ouq.a;
                }
                defpackage.abqv abqvVar = ouqVar.c;
                if (abqvVar == null) {
                    abqvVar = defpackage.abqv.a;
                }
                java.lang.Object obj2 = this.a;
                defpackage.saf safVar = (defpackage.saf) obj2;
                safVar.l();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append('{');
                qsp.v("session_id", outVar.c, sb);
                defpackage.ous ousVarB = defpackage.ous.b(outVar.d);
                if (ousVarB == null) {
                    ousVarB = defpackage.ous.AUDIO_CODEC_TYPE_UNSPECIFIED;
                }
                qsp.w("codec_type", qsp.q(ousVarB), sb);
                defpackage.ove oveVarB = defpackage.ove.b(outVar.e);
                if (oveVarB == null) {
                    oveVarB = defpackage.ove.AUDIO_STREAM_TYPE_UNSPECIFIED;
                }
                qsp.w("stream_type", qsp.q(oveVarB), sb);
                defpackage.saf safVarA = safVar.a("unique_id", qsp.t(sb)).a("previous_diagnostics_message_count", java.lang.Integer.valueOf(oupVar.d));
                defpackage.ouo ouoVarB = defpackage.ouo.b(oupVar.e);
                if (ouoVarB == null) {
                    ouoVarB = defpackage.ouo.AUDIO_STREAMING_STATUS_UNSPECIFIED;
                }
                safVarA.a("current_status", qsp.q(ouoVarB)).b("stats", new defpackage.rft(obj2, obj, 2)).a("events count", java.lang.Integer.valueOf(oupVar.g.size())).a("events dropped", java.lang.Integer.valueOf(oupVar.h)).d("events", oupVar.g, new rfu(safVar, abqvVar, 1));
                return;
            case 1:
                if (((defpackage.rex) this.a).e(true)) {
                    defpackage.rbw rbwVar = (defpackage.rbw) ((defpackage.ren) this.b).a;
                    if (rbwVar.i()) {
                        rbwVar.a.sendEmptyMessage(1);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                ((defpackage.saf) obj4).f("AudioStreamStats", new defpackage.rft(obj4, obj3, i2));
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ouq ouqVar2 = ((defpackage.oup) this.b).f;
                if (ouqVar2 == null) {
                    ouqVar2 = defpackage.ouq.a;
                }
                int i3 = ouqVar2.f;
                if ((ouqVar2.b & 4096) != 0) {
                    ouw ouwVar = ouqVar2.o;
                    if (ouwVar == null) {
                        ouwVar = ouw.a;
                    }
                    i = ouwVar.c;
                } else {
                    i = 0;
                }
                defpackage.abqv abqvVar2 = ouqVar2.c;
                if (abqvVar2 == null) {
                    abqvVar2 = defpackage.abqv.a;
                }
                defpackage.saf safVar2 = (defpackage.saf) this.a;
                safVar2.l();
                defpackage.saf safVarA2 = safVar2.a("start_time", defpackage.abrx.f(abqvVar2));
                defpackage.abqv abqvVar3 = ouqVar2.d;
                if (abqvVar3 == null) {
                    abqvVar3 = defpackage.abqv.a;
                }
                safVarA2.a("end_time", qsp.s(abqvVar3, abqvVar2)).a("bytes_sent", java.lang.Integer.valueOf(ouqVar2.e)).a("frames_sent", java.lang.Integer.valueOf(i3));
                if (i3 > 0) {
                    safVar2.a("frame size", java.lang.Integer.valueOf(ouqVar2.e / i3)).c("frames acked", "%d (%.2f%%)", java.lang.Integer.valueOf(i), java.lang.Float.valueOf((i * 100.0f) / i3));
                } else {
                    safVar2.a("frames acked", java.lang.Integer.valueOf(i));
                }
                safVar2.a("acks_dropped", java.lang.Integer.valueOf(ouqVar2.g)).a("max_unacked_frames", java.lang.Integer.valueOf(ouqVar2.h)).a("media_underflows", java.lang.Integer.valueOf(ouqVar2.i));
                if ((ouqVar2.b & 512) != 0) {
                    ouw ouwVar2 = ouqVar2.l;
                    if (ouwVar2 == null) {
                        ouwVar2 = ouw.a;
                    }
                    safVar2.a("encoding_time_stats", qsp.p(ouwVar2));
                }
                if ((ouqVar2.b & 4096) != 0) {
                    ouw ouwVar3 = ouqVar2.o;
                    if (ouwVar3 == null) {
                        ouwVar3 = ouw.a;
                    }
                    safVar2.a("ack_latency_stats", qsp.p(ouwVar3));
                }
                if ((ouqVar2.b & 2048) != 0) {
                    ouw ouwVar4 = ouqVar2.n;
                    if (ouwVar4 == null) {
                        ouwVar4 = ouw.a;
                    }
                    safVar2.a("queue_time_stats", qsp.p(ouwVar4));
                }
                if ((ouqVar2.b & 32768) != 0) {
                    oux ouxVar = ouqVar2.q;
                    if (ouxVar == null) {
                        ouxVar = oux.a;
                    }
                    safVar2.a("available_frame_count_stats", qsp.r(ouxVar));
                }
                safVar2.d("dropped_frames_entries", ouqVar2.r, new rfu(safVar2, abqvVar2, 0));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.a.a((defpackage.oup) this.b);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.a.a((ouy) this.b);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj5 = this.b;
                ouy ouyVar = (ouy) obj5;
                ovb ovbVar = ouyVar.f;
                if (ovbVar == null) {
                    ovbVar = ovb.a;
                }
                defpackage.abqv abqvVar4 = ovbVar.c;
                if (abqvVar4 == null) {
                    abqvVar4 = defpackage.abqv.a;
                }
                java.lang.Object obj6 = this.a;
                defpackage.saf safVar3 = (defpackage.saf) obj6;
                safVar3.l();
                safVar3.a("session_id", java.lang.Integer.valueOf(ouyVar.c)).a("previous_diagnostics_message_count", java.lang.Integer.valueOf(ouyVar.d)).a("num_active_services", java.lang.Integer.valueOf(ouyVar.e)).b("stats", new defpackage.rft(obj6, obj5, 7)).a("events count", java.lang.Integer.valueOf(ouyVar.g.size())).a("events dropped", java.lang.Integer.valueOf(ouyVar.h)).d("events", ouyVar.g, new rfu(safVar3, abqvVar4, 2));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ovb ovbVar2 = ((ouy) this.b).f;
                if (ovbVar2 == null) {
                    ovbVar2 = ovb.a;
                }
                java.lang.Object obj7 = this.a;
                ((defpackage.saf) obj7).f("MicrophoneSessionStats", new defpackage.rft(obj7, ovbVar2, 9));
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ovb ovbVar3 = (ovb) this.b;
                defpackage.abnv abnvVar = ovbVar3.j;
                if (abnvVar.B()) {
                    return;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(abnvVar.d());
                abnr it = abnvVar.iterator();
                while (it.hasNext()) {
                    byte bByteValue = ((java.lang.Byte) it.next()).byteValue();
                    if (bByteValue == -128) {
                        sb2.append('.');
                    } else {
                        double dFloor = java.lang.Math.floor((((double) (bByteValue + 127)) * 4.5d) / 127.0d);
                        defpackage.ysr.bj(dFloor >= 0.0d);
                        defpackage.ysr.bj(dFloor <= 9.0d);
                        sb2.append(java.lang.Character.forDigit((int) dFloor, 10));
                    }
                }
                defpackage.saf safVar4 = (defpackage.saf) this.a;
                safVar4.l();
                safVar4.c("histogram", "[%s]", sb2).c("histogram raw bytes", "[%s]", new defpackage.xyj(", ").b(abnvVar));
                int i4 = ovbVar3.k;
                if (i4 > 0) {
                    safVar4.a("frames dropped from the histogram", java.lang.Integer.valueOf(i4));
                    return;
                }
                return;
            case 9:
                java.lang.Object obj8 = this.b;
                ovb ovbVar4 = (ovb) obj8;
                defpackage.abqv abqvVar5 = ovbVar4.c;
                if (abqvVar5 == null) {
                    abqvVar5 = defpackage.abqv.a;
                }
                java.lang.Object obj9 = this.a;
                defpackage.saf safVar5 = (defpackage.saf) obj9;
                safVar5.l();
                defpackage.saf safVarA3 = safVar5.a("start_time", defpackage.abrx.f(abqvVar5));
                defpackage.abqv abqvVar6 = ovbVar4.d;
                if (abqvVar6 == null) {
                    abqvVar6 = defpackage.abqv.a;
                }
                safVarA3.a("end_time", qsp.s(abqvVar6, abqvVar5)).a("bytes_received", java.lang.Integer.valueOf(ovbVar4.f)).a("frames_received", java.lang.Integer.valueOf(ovbVar4.e)).a("empty_frames_received", java.lang.Integer.valueOf(ovbVar4.i));
                int i5 = ovbVar4.e;
                if (i5 > 0) {
                    safVar5.c("empty frames percentage", "%.2f%%", java.lang.Float.valueOf((ovbVar4.i * 100.0f) / i5)).a("frame size", java.lang.Integer.valueOf(ovbVar4.f / ovbVar4.e));
                }
                if ((ovbVar4.b & 16) != 0) {
                    ouw ouwVar5 = ovbVar4.g;
                    if (ouwVar5 == null) {
                        ouwVar5 = ouw.a;
                    }
                    safVar5.a("frame latency stats", qsp.p(ouwVar5));
                }
                if ((ovbVar4.b & 32) != 0) {
                    oux ouxVar2 = ovbVar4.h;
                    if (ouxVar2 == null) {
                        ouxVar2 = oux.a;
                    }
                    safVar5.a("frame volume stats", qsp.r(ouxVar2));
                }
                safVar5.b("frame volume info", new defpackage.rft(obj9, obj8, 10)).d("dropped_frames_entries", ovbVar4.l, new rfu(safVar5, abqvVar5, 3));
                return;
            case 10:
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.a;
                ((defpackage.saf) obj11).e(new defpackage.rft(obj10, obj11, 8, bArr));
                return;
            case 11:
                defpackage.rib.a.l().ai(8184).u("mProfileUtil initialized");
                ((defpackage.xei) this.b).w(((defpackage.rib) this.a).o);
                return;
            case 12:
                java.lang.Object obj12 = this.a;
                obj12.getClass();
                ((defpackage.eqp) ((ajnd) this.b).a).m(obj12);
                return;
            case 13:
                java.lang.Object obj13 = this.a;
                obj13.getClass();
                ((kkn) ((ajnd) this.b).a).a(kkm.a((com.google.android.gms.car.control.CarPropertyState) obj13));
                return;
            case 14:
                this.b.getClass();
                ((rjn) this.a).a.a.w(new defpackage.afaw(defpackage.afbk.a));
                return;
            case 15:
                java.lang.Object obj14 = this.a;
                if (((rmx) obj14).a) {
                    if (defpackage.omv.c("CAR.CLIENT.IME", 3)) {
                        defpackage.rrx.a("CAR.CLIENT.IME", null, "CarEditableListener#onUpdateSelection");
                    }
                    ((rmv) this.b).d();
                    return;
                } else {
                    if (defpackage.omv.c("CAR.CLIENT.IME", 3)) {
                        defpackage.rrx.d(3, "CAR.CLIENT.IME", null, "This listener (%s) is not valid.", obj14);
                        return;
                    }
                    return;
                }
            case 16:
                ((rmv) this.b).b = this.a;
                return;
            case 17:
                try {
                    ((rng) this.b).b = ((java.lang.Boolean) this.a.call()).booleanValue();
                    return;
                } catch (java.lang.Exception e) {
                    ((rng) this.b).b = false;
                    throw new java.lang.RuntimeException("Input connection action failed", e);
                }
            case 18:
                android.util.SparseArray sparseArray = defpackage.ror.a;
                defpackage.rpm rpmVar = ((defpackage.ror) this.a).k;
                if (rpmVar != null) {
                    rpmVar.w(((com.google.android.gms.car.CarWindowManagerLayoutParams) this.b).a);
                    return;
                }
                return;
            case 19:
                android.util.SparseArray sparseArray2 = defpackage.ror.a;
                defpackage.qrd qrdVar = ((defpackage.ror) this.a).I;
                if (qrdVar != 0) {
                    qrdVar.s(this.b);
                    return;
                }
                return;
            default:
                android.util.SparseArray sparseArray3 = defpackage.ror.a;
                java.lang.Object obj15 = this.a;
                defpackage.ror rorVar = (defpackage.ror) obj15;
                if (rorVar.y() && rorVar.I != null) {
                    if (rorVar.F == 5) {
                        rorVar.n(4, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (rorVar.F == 4 || rorVar.F == 3) {
                        rorVar.I.e((android.content.Intent) this.b);
                        defpackage.oml omlVar = rorVar.K;
                    } else {
                        defpackage.rrx.d(6, "CAR.PROJECTION.CAHI", null, "%s onNewIntent not sent, activity is in state: %s", rorVar.t, defpackage.ror.a.get(rorVar.F));
                    }
                    if (z) {
                        rorVar.n(5, false);
                    }
                    try {
                        defpackage.qyu qyuVar = ((defpackage.ror) obj15).i;
                        if (qyuVar != null) {
                            qyuVar.m();
                            return;
                        }
                        return;
                    } catch (android.os.RemoteException unused) {
                        rorVar.t();
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ rft(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public rft(rng rngVar, java.util.concurrent.Callable callable, int i) {
        this.c = i;
        this.a = callable;
        this.b = rngVar;
    }
}
