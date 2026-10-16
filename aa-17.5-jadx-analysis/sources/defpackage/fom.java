package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fom implements foe {
    public final eyn a = new fol();
    private final ezc b;

    public fom(ezc ezcVar) {
        this.b = ezcVar;
    }

    @Override // defpackage.foe
    public final int a() {
        return ((Number) ckf.m(this.b, true, false, new ewm(12, (short[]) null))).intValue();
    }

    @Override // defpackage.foe
    public final fju b(String str) {
        str.getClass();
        return (fju) ckf.m(this.b, true, false, new fnv(str, 10, (short[][]) null));
    }

    @Override // defpackage.foe
    public final fod c(final String str) {
        str.getClass();
        return (fod) ckf.m(this.b, true, false, new afec() { // from class: foi
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE id=?";

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r35v0, types: [fod] */
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                fca fcaVar = (fca) obj;
                fcaVar.getClass();
                fbk fbkVarA = fcaVar.a(this.a);
                try {
                    fbkVarA.h(1, str);
                    int iJ = ckf.j(fbkVarA, "id");
                    int iJ2 = ckf.j(fbkVarA, "state");
                    int iJ3 = ckf.j(fbkVarA, "worker_class_name");
                    int iJ4 = ckf.j(fbkVarA, "input_merger_class_name");
                    int iJ5 = ckf.j(fbkVarA, "input");
                    int iJ6 = ckf.j(fbkVarA, "output");
                    int iJ7 = ckf.j(fbkVarA, "initial_delay");
                    int iJ8 = ckf.j(fbkVarA, "interval_duration");
                    int iJ9 = ckf.j(fbkVarA, "flex_duration");
                    int iJ10 = ckf.j(fbkVarA, "run_attempt_count");
                    int iJ11 = ckf.j(fbkVarA, "backoff_policy");
                    int iJ12 = ckf.j(fbkVarA, "backoff_delay_duration");
                    int iJ13 = ckf.j(fbkVarA, "last_enqueue_time");
                    int iJ14 = ckf.j(fbkVarA, "minimum_retention_duration");
                    int iJ15 = ckf.j(fbkVarA, "schedule_requested_at");
                    int iJ16 = ckf.j(fbkVarA, "run_in_foreground");
                    int iJ17 = ckf.j(fbkVarA, "out_of_quota_policy");
                    int iJ18 = ckf.j(fbkVarA, "period_count");
                    int iJ19 = ckf.j(fbkVarA, "generation");
                    int iJ20 = ckf.j(fbkVarA, "next_schedule_time_override");
                    int iJ21 = ckf.j(fbkVarA, "next_schedule_time_override_generation");
                    int iJ22 = ckf.j(fbkVarA, "stop_reason");
                    int iJ23 = ckf.j(fbkVarA, "trace_tag");
                    int iJ24 = ckf.j(fbkVarA, "backoff_on_system_interruptions");
                    int iJ25 = ckf.j(fbkVarA, "required_network_type");
                    int iJ26 = ckf.j(fbkVarA, "required_network_request");
                    int iJ27 = ckf.j(fbkVarA, "requires_charging");
                    int iJ28 = ckf.j(fbkVarA, "requires_device_idle");
                    int iJ29 = ckf.j(fbkVarA, "requires_battery_not_low");
                    int iJ30 = ckf.j(fbkVarA, "requires_storage_not_low");
                    int iJ31 = ckf.j(fbkVarA, "trigger_content_update_delay");
                    int iJ32 = ckf.j(fbkVarA, "trigger_max_content_delay");
                    int iJ33 = ckf.j(fbkVarA, "content_uri_triggers");
                    Boolean fodVar = null;
                    if (fbkVarA.k()) {
                        String strD = fbkVarA.d(iJ);
                        fju fjuVarF = dtb.f((int) fbkVarA.b(iJ2));
                        String strD2 = fbkVarA.d(iJ3);
                        String strD3 = fbkVarA.d(iJ4);
                        byte[] bArrL = fbkVarA.l(iJ5);
                        fjc fjcVar = fjc.a;
                        fjc fjcVarM = dsr.m(bArrL);
                        fjc fjcVarM2 = dsr.m(fbkVarA.l(iJ6));
                        long jB = fbkVarA.b(iJ7);
                        long jB2 = fbkVarA.b(iJ8);
                        long jB3 = fbkVarA.b(iJ9);
                        int iB = (int) fbkVarA.b(iJ10);
                        int i = dtb.i((int) fbkVarA.b(iJ11));
                        long jB4 = fbkVarA.b(iJ12);
                        long jB5 = fbkVarA.b(iJ13);
                        long jB6 = fbkVarA.b(iJ14);
                        long jB7 = fbkVarA.b(iJ15);
                        boolean z = ((int) fbkVarA.b(iJ16)) != 0;
                        int iK = dtb.k((int) fbkVarA.b(iJ17));
                        int iB2 = (int) fbkVarA.b(iJ18);
                        int iB3 = (int) fbkVarA.b(iJ19);
                        long jB8 = fbkVarA.b(iJ20);
                        int iB4 = (int) fbkVarA.b(iJ21);
                        int iB5 = (int) fbkVarA.b(iJ22);
                        String strD4 = fbkVarA.j(iJ23) ? null : fbkVarA.d(iJ23);
                        Integer numValueOf = fbkVarA.j(iJ24) ? null : Integer.valueOf((int) fbkVarA.b(iJ24));
                        if (numValueOf != null) {
                            fodVar = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        fodVar = new fod(strD, fjuVarF, strD2, strD3, fjcVarM, fjcVarM2, jB, jB2, jB3, new fja(dtb.g(fbkVarA.l(iJ26)), dtb.j((int) fbkVarA.b(iJ25)), ((int) fbkVarA.b(iJ27)) != 0, ((int) fbkVarA.b(iJ28)) != 0, ((int) fbkVarA.b(iJ29)) != 0, ((int) fbkVarA.b(iJ30)) != 0, fbkVarA.b(iJ31), fbkVarA.b(iJ32), dtb.h(fbkVarA.l(iJ33))), iB, i, jB4, jB5, jB6, jB7, z, iK, iB2, iB3, jB8, iB4, iB5, strD4, fodVar);
                    }
                    return fodVar;
                } finally {
                    fbkVarA.close();
                }
            }
        });
    }

    @Override // defpackage.foe
    public final List d() {
        return (List) ckf.m(this.b, true, false, new ewm(16, (byte[][]) null));
    }

    @Override // defpackage.foe
    public final List e(String str) {
        return (List) ckf.m(this.b, true, false, new fnv(str, 6, (boolean[]) null));
    }

    @Override // defpackage.foe
    public final List f(final long j) {
        return (List) ckf.m(this.b, true, false, new afec() { // from class: foh
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";

            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                int i;
                Integer numValueOf;
                fca fcaVar = (fca) obj;
                fcaVar.getClass();
                fbk fbkVarA = fcaVar.a(this.a);
                try {
                    fbkVarA.f(1, j);
                    int iJ = ckf.j(fbkVarA, "id");
                    int iJ2 = ckf.j(fbkVarA, "state");
                    int iJ3 = ckf.j(fbkVarA, "worker_class_name");
                    int iJ4 = ckf.j(fbkVarA, "input_merger_class_name");
                    int iJ5 = ckf.j(fbkVarA, "input");
                    int iJ6 = ckf.j(fbkVarA, "output");
                    int iJ7 = ckf.j(fbkVarA, "initial_delay");
                    int iJ8 = ckf.j(fbkVarA, "interval_duration");
                    int iJ9 = ckf.j(fbkVarA, "flex_duration");
                    int iJ10 = ckf.j(fbkVarA, "run_attempt_count");
                    int iJ11 = ckf.j(fbkVarA, "backoff_policy");
                    int iJ12 = ckf.j(fbkVarA, "backoff_delay_duration");
                    int iJ13 = ckf.j(fbkVarA, "last_enqueue_time");
                    int iJ14 = ckf.j(fbkVarA, "minimum_retention_duration");
                    int iJ15 = ckf.j(fbkVarA, "schedule_requested_at");
                    int iJ16 = ckf.j(fbkVarA, "run_in_foreground");
                    int iJ17 = ckf.j(fbkVarA, "out_of_quota_policy");
                    int iJ18 = ckf.j(fbkVarA, "period_count");
                    int iJ19 = ckf.j(fbkVarA, "generation");
                    int iJ20 = ckf.j(fbkVarA, "next_schedule_time_override");
                    int iJ21 = ckf.j(fbkVarA, "next_schedule_time_override_generation");
                    int iJ22 = ckf.j(fbkVarA, "stop_reason");
                    int iJ23 = ckf.j(fbkVarA, "trace_tag");
                    int iJ24 = ckf.j(fbkVarA, "backoff_on_system_interruptions");
                    int iJ25 = ckf.j(fbkVarA, "required_network_type");
                    int iJ26 = ckf.j(fbkVarA, "required_network_request");
                    int iJ27 = ckf.j(fbkVarA, "requires_charging");
                    int iJ28 = ckf.j(fbkVarA, "requires_device_idle");
                    int iJ29 = ckf.j(fbkVarA, "requires_battery_not_low");
                    int iJ30 = ckf.j(fbkVarA, "requires_storage_not_low");
                    int iJ31 = ckf.j(fbkVarA, "trigger_content_update_delay");
                    int iJ32 = ckf.j(fbkVarA, "trigger_max_content_delay");
                    int iJ33 = ckf.j(fbkVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (fbkVarA.k()) {
                        String strD = fbkVarA.d(iJ);
                        int i2 = iJ13;
                        int i3 = iJ14;
                        fju fjuVarF = dtb.f((int) fbkVarA.b(iJ2));
                        String strD2 = fbkVarA.d(iJ3);
                        String strD3 = fbkVarA.d(iJ4);
                        byte[] bArrL = fbkVarA.l(iJ5);
                        fjc fjcVar = fjc.a;
                        fjc fjcVarM = dsr.m(bArrL);
                        fjc fjcVarM2 = dsr.m(fbkVarA.l(iJ6));
                        long jB = fbkVarA.b(iJ7);
                        long jB2 = fbkVarA.b(iJ8);
                        long jB3 = fbkVarA.b(iJ9);
                        int iB = (int) fbkVarA.b(iJ10);
                        int i4 = iJ;
                        int i5 = iJ2;
                        int i6 = dtb.i((int) fbkVarA.b(iJ11));
                        long jB4 = fbkVarA.b(iJ12);
                        long jB5 = fbkVarA.b(i2);
                        long jB6 = fbkVarA.b(i3);
                        int i7 = iJ15;
                        long jB7 = fbkVarA.b(i7);
                        iJ15 = i7;
                        int i8 = iJ16;
                        int i9 = iJ3;
                        boolean z = ((int) fbkVarA.b(i8)) != 0;
                        int i10 = iJ17;
                        int i11 = iJ4;
                        int iK = dtb.k((int) fbkVarA.b(i10));
                        int i12 = iJ18;
                        int iB2 = (int) fbkVarA.b(i12);
                        int i13 = iJ19;
                        int iB3 = (int) fbkVarA.b(i13);
                        int i14 = iJ20;
                        long jB8 = fbkVarA.b(i14);
                        int i15 = iJ21;
                        int iB4 = (int) fbkVarA.b(i15);
                        iJ21 = i15;
                        int i16 = iJ22;
                        int iB5 = (int) fbkVarA.b(i16);
                        int i17 = iJ23;
                        Boolean boolValueOf = null;
                        String strD4 = fbkVarA.j(i17) ? null : fbkVarA.d(i17);
                        int i18 = iJ24;
                        if (fbkVarA.j(i18)) {
                            i = i17;
                            iJ22 = i16;
                            numValueOf = null;
                        } else {
                            i = i17;
                            iJ22 = i16;
                            numValueOf = Integer.valueOf((int) fbkVarA.b(i18));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i19 = iJ25;
                        int iJ34 = dtb.j((int) fbkVarA.b(i19));
                        int i20 = iJ26;
                        Cfor cforG = dtb.g(fbkVarA.l(i20));
                        int i21 = iJ27;
                        boolean z2 = ((int) fbkVarA.b(i21)) != 0;
                        int i22 = iJ28;
                        boolean z3 = ((int) fbkVarA.b(i22)) != 0;
                        int i23 = iJ29;
                        boolean z4 = ((int) fbkVarA.b(i23)) != 0;
                        iJ29 = i23;
                        int i24 = iJ30;
                        int i25 = iJ31;
                        int i26 = iJ32;
                        iJ31 = i25;
                        int i27 = iJ33;
                        arrayList.add(new fod(strD, fjuVarF, strD2, strD3, fjcVarM, fjcVarM2, jB, jB2, jB3, new fja(cforG, iJ34, z2, z3, z4, ((int) fbkVarA.b(i24)) != 0, fbkVarA.b(i25), fbkVarA.b(i26), dtb.h(fbkVarA.l(i27))), iB, i6, jB4, jB5, jB6, jB7, z, iK, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                        iJ28 = i22;
                        iJ4 = i11;
                        iJ17 = i10;
                        iJ18 = i12;
                        iJ19 = i13;
                        iJ20 = i14;
                        iJ23 = i;
                        iJ24 = i18;
                        iJ25 = i19;
                        iJ26 = i20;
                        iJ27 = i21;
                        iJ33 = i27;
                        iJ32 = i26;
                        iJ30 = i24;
                        iJ = i4;
                        iJ3 = i9;
                        iJ13 = i2;
                        iJ14 = i3;
                        iJ2 = i5;
                        iJ16 = i8;
                    }
                    return arrayList;
                } finally {
                    fbkVarA.close();
                }
            }
        });
    }

    @Override // defpackage.foe
    public final List g() {
        return (List) ckf.m(this.b, true, false, new ewm(15, (float[]) null));
    }

    @Override // defpackage.foe
    public final List h() {
        return (List) ckf.m(this.b, true, false, new ewm(11, (char[]) null));
    }

    @Override // defpackage.foe
    public final aiyk i() {
        ewm ewmVar = new ewm(13, (int[]) null);
        ezc ezcVar = this.b;
        eys eysVarB = ezcVar.b();
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
        strArr.getClass();
        ezv ezvVar = eysVarB.b;
        afce afceVar = new afce();
        for (String str : strArr) {
            Map map = ezvVar.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                afceVar.addAll(set);
            } else {
                afceVar.add(str);
            }
        }
        String[] strArr2 = (String[]) woy.aN(afceVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map2 = ezvVar.d;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        aezu aezuVar = new aezu(strArr2, iArr);
        String[] strArr3 = (String[]) aezuVar.a;
        int[] iArr2 = (int[]) aezuVar.b;
        strArr3.getClass();
        iArr2.getClass();
        aiyb aiybVar = new aiyb(new ezo(ezvVar, iArr2, strArr3, (afck) null, 0));
        ecx ecxVar = eysVarB.i;
        return new ezz(aimv.b(new hcg(new hcg((afeg) new dxi(eysVarB, (afck) null, 7), (aiyk) aiybVar, 11), new eyq(eysVarB, (afck) null, 0), 10), -1), ezcVar, ewmVar);
    }

    @Override // defpackage.foe
    public final void j(String str) {
        ckf.m(this.b, false, true, new fnv(str, 5, (int[]) null));
    }

    @Override // defpackage.foe
    public final void k(fod fodVar) {
        ckf.m(this.b, false, true, new fnv(this, fodVar, 11));
    }

    @Override // defpackage.foe
    public final void l(String str, int i) {
        ckf.m(this.b, false, true, new fof(str, i, 2, (byte[]) null));
    }

    @Override // defpackage.foe
    public final void m(String str, long j) {
        str.getClass();
        ckf.m(this.b, false, true, new fok(j, str, 0));
    }

    @Override // defpackage.foe
    public final void n(String str, fjc fjcVar) {
        ckf.m(this.b, false, true, new cib(fjcVar, str, 6));
    }

    @Override // defpackage.foe
    public final void o(String str, int i) {
        ckf.m(this.b, false, true, new fof(i, str, 0));
    }

    @Override // defpackage.foe
    public final boolean p(String str) {
        return ((Boolean) ckf.m(this.b, true, false, new fnv(str, 8, (byte[][]) null))).booleanValue();
    }

    @Override // defpackage.foe
    public final List q() {
        return (List) ckf.m(this.b, true, false, new afec() { // from class: fog
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";

            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                int i;
                Integer numValueOf;
                fca fcaVar = (fca) obj;
                fcaVar.getClass();
                fbk fbkVarA = fcaVar.a(this.a);
                try {
                    fbkVarA.f(1, 200L);
                    int iJ = ckf.j(fbkVarA, "id");
                    int iJ2 = ckf.j(fbkVarA, "state");
                    int iJ3 = ckf.j(fbkVarA, "worker_class_name");
                    int iJ4 = ckf.j(fbkVarA, "input_merger_class_name");
                    int iJ5 = ckf.j(fbkVarA, "input");
                    int iJ6 = ckf.j(fbkVarA, "output");
                    int iJ7 = ckf.j(fbkVarA, "initial_delay");
                    int iJ8 = ckf.j(fbkVarA, "interval_duration");
                    int iJ9 = ckf.j(fbkVarA, "flex_duration");
                    int iJ10 = ckf.j(fbkVarA, "run_attempt_count");
                    int iJ11 = ckf.j(fbkVarA, "backoff_policy");
                    int iJ12 = ckf.j(fbkVarA, "backoff_delay_duration");
                    int iJ13 = ckf.j(fbkVarA, "last_enqueue_time");
                    int iJ14 = ckf.j(fbkVarA, "minimum_retention_duration");
                    int iJ15 = ckf.j(fbkVarA, "schedule_requested_at");
                    int iJ16 = ckf.j(fbkVarA, "run_in_foreground");
                    int iJ17 = ckf.j(fbkVarA, "out_of_quota_policy");
                    int iJ18 = ckf.j(fbkVarA, "period_count");
                    int iJ19 = ckf.j(fbkVarA, "generation");
                    int iJ20 = ckf.j(fbkVarA, "next_schedule_time_override");
                    int iJ21 = ckf.j(fbkVarA, "next_schedule_time_override_generation");
                    int iJ22 = ckf.j(fbkVarA, "stop_reason");
                    int iJ23 = ckf.j(fbkVarA, "trace_tag");
                    int iJ24 = ckf.j(fbkVarA, "backoff_on_system_interruptions");
                    int iJ25 = ckf.j(fbkVarA, "required_network_type");
                    int iJ26 = ckf.j(fbkVarA, "required_network_request");
                    int iJ27 = ckf.j(fbkVarA, "requires_charging");
                    int iJ28 = ckf.j(fbkVarA, "requires_device_idle");
                    int iJ29 = ckf.j(fbkVarA, "requires_battery_not_low");
                    int iJ30 = ckf.j(fbkVarA, "requires_storage_not_low");
                    int iJ31 = ckf.j(fbkVarA, "trigger_content_update_delay");
                    int iJ32 = ckf.j(fbkVarA, "trigger_max_content_delay");
                    int iJ33 = ckf.j(fbkVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (fbkVarA.k()) {
                        String strD = fbkVarA.d(iJ);
                        int i2 = iJ13;
                        int i3 = iJ14;
                        fju fjuVarF = dtb.f((int) fbkVarA.b(iJ2));
                        String strD2 = fbkVarA.d(iJ3);
                        String strD3 = fbkVarA.d(iJ4);
                        byte[] bArrL = fbkVarA.l(iJ5);
                        fjc fjcVar = fjc.a;
                        fjc fjcVarM = dsr.m(bArrL);
                        fjc fjcVarM2 = dsr.m(fbkVarA.l(iJ6));
                        long jB = fbkVarA.b(iJ7);
                        long jB2 = fbkVarA.b(iJ8);
                        long jB3 = fbkVarA.b(iJ9);
                        int iB = (int) fbkVarA.b(iJ10);
                        int i4 = iJ;
                        int i5 = iJ2;
                        int i6 = dtb.i((int) fbkVarA.b(iJ11));
                        long jB4 = fbkVarA.b(iJ12);
                        long jB5 = fbkVarA.b(i2);
                        long jB6 = fbkVarA.b(i3);
                        int i7 = iJ15;
                        long jB7 = fbkVarA.b(i7);
                        iJ15 = i7;
                        int i8 = iJ16;
                        int i9 = iJ3;
                        boolean z = ((int) fbkVarA.b(i8)) != 0;
                        int i10 = iJ17;
                        int i11 = iJ4;
                        int iK = dtb.k((int) fbkVarA.b(i10));
                        int i12 = iJ18;
                        int iB2 = (int) fbkVarA.b(i12);
                        int i13 = iJ19;
                        int iB3 = (int) fbkVarA.b(i13);
                        int i14 = iJ20;
                        long jB8 = fbkVarA.b(i14);
                        int i15 = iJ21;
                        int iB4 = (int) fbkVarA.b(i15);
                        iJ21 = i15;
                        int i16 = iJ22;
                        int iB5 = (int) fbkVarA.b(i16);
                        int i17 = iJ23;
                        Boolean boolValueOf = null;
                        String strD4 = fbkVarA.j(i17) ? null : fbkVarA.d(i17);
                        int i18 = iJ24;
                        if (fbkVarA.j(i18)) {
                            i = i17;
                            iJ22 = i16;
                            numValueOf = null;
                        } else {
                            i = i17;
                            iJ22 = i16;
                            numValueOf = Integer.valueOf((int) fbkVarA.b(i18));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i19 = iJ25;
                        int iJ34 = dtb.j((int) fbkVarA.b(i19));
                        int i20 = iJ26;
                        Cfor cforG = dtb.g(fbkVarA.l(i20));
                        int i21 = iJ27;
                        boolean z2 = ((int) fbkVarA.b(i21)) != 0;
                        int i22 = iJ28;
                        boolean z3 = ((int) fbkVarA.b(i22)) != 0;
                        int i23 = iJ29;
                        boolean z4 = ((int) fbkVarA.b(i23)) != 0;
                        iJ29 = i23;
                        int i24 = iJ30;
                        int i25 = iJ31;
                        int i26 = iJ32;
                        iJ31 = i25;
                        int i27 = iJ33;
                        arrayList.add(new fod(strD, fjuVarF, strD2, strD3, fjcVarM, fjcVarM2, jB, jB2, jB3, new fja(cforG, iJ34, z2, z3, z4, ((int) fbkVarA.b(i24)) != 0, fbkVarA.b(i25), fbkVarA.b(i26), dtb.h(fbkVarA.l(i27))), iB, i6, jB4, jB5, jB6, jB7, z, iK, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                        iJ28 = i22;
                        iJ4 = i11;
                        iJ17 = i10;
                        iJ18 = i12;
                        iJ19 = i13;
                        iJ20 = i14;
                        iJ23 = i;
                        iJ24 = i18;
                        iJ25 = i19;
                        iJ26 = i20;
                        iJ27 = i21;
                        iJ33 = i27;
                        iJ32 = i26;
                        iJ30 = i24;
                        iJ = i4;
                        iJ3 = i9;
                        iJ13 = i2;
                        iJ14 = i3;
                        iJ2 = i5;
                        iJ16 = i8;
                    }
                    return arrayList;
                } finally {
                    fbkVarA.close();
                }
            }
        });
    }

    @Override // defpackage.foe
    public final void r(String str) {
        ((Number) ckf.m(this.b, false, true, new fnv(str, 9, (char[][]) null))).intValue();
    }

    @Override // defpackage.foe
    public final void s(String str, long j) {
        str.getClass();
        ((Number) ckf.m(this.b, false, true, new fok(j, str, 1, null))).intValue();
    }

    @Override // defpackage.foe
    public final void t() {
        ((Number) ckf.m(this.b, false, true, new ewm(14, (boolean[]) null))).intValue();
    }

    @Override // defpackage.foe
    public final void u(String str) {
        ((Number) ckf.m(this.b, false, true, new fnv(str, 4, (short[]) null))).intValue();
    }

    @Override // defpackage.foe
    public final void v(String str) {
        str.getClass();
        ((Number) ckf.m(this.b, false, true, new fnv(str, 7, (float[]) null))).intValue();
    }

    @Override // defpackage.foe
    public final void w(fju fjuVar, String str) {
        str.getClass();
        ((Number) ckf.m(this.b, false, true, new cib(fjuVar, str, 7))).intValue();
    }

    @Override // defpackage.foe
    public final List x() {
        return (List) ckf.m(this.b, true, false, new afec() { // from class: foj
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";

            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                int i;
                Integer numValueOf;
                fca fcaVar = (fca) obj;
                fcaVar.getClass();
                fbk fbkVarA = fcaVar.a(this.a);
                try {
                    fbkVarA.f(1, 20L);
                    int iJ = ckf.j(fbkVarA, "id");
                    int iJ2 = ckf.j(fbkVarA, "state");
                    int iJ3 = ckf.j(fbkVarA, "worker_class_name");
                    int iJ4 = ckf.j(fbkVarA, "input_merger_class_name");
                    int iJ5 = ckf.j(fbkVarA, "input");
                    int iJ6 = ckf.j(fbkVarA, "output");
                    int iJ7 = ckf.j(fbkVarA, "initial_delay");
                    int iJ8 = ckf.j(fbkVarA, "interval_duration");
                    int iJ9 = ckf.j(fbkVarA, "flex_duration");
                    int iJ10 = ckf.j(fbkVarA, "run_attempt_count");
                    int iJ11 = ckf.j(fbkVarA, "backoff_policy");
                    int iJ12 = ckf.j(fbkVarA, "backoff_delay_duration");
                    int iJ13 = ckf.j(fbkVarA, "last_enqueue_time");
                    int iJ14 = ckf.j(fbkVarA, "minimum_retention_duration");
                    int iJ15 = ckf.j(fbkVarA, "schedule_requested_at");
                    int iJ16 = ckf.j(fbkVarA, "run_in_foreground");
                    int iJ17 = ckf.j(fbkVarA, "out_of_quota_policy");
                    int iJ18 = ckf.j(fbkVarA, "period_count");
                    int iJ19 = ckf.j(fbkVarA, "generation");
                    int iJ20 = ckf.j(fbkVarA, "next_schedule_time_override");
                    int iJ21 = ckf.j(fbkVarA, "next_schedule_time_override_generation");
                    int iJ22 = ckf.j(fbkVarA, "stop_reason");
                    int iJ23 = ckf.j(fbkVarA, "trace_tag");
                    int iJ24 = ckf.j(fbkVarA, "backoff_on_system_interruptions");
                    int iJ25 = ckf.j(fbkVarA, "required_network_type");
                    int iJ26 = ckf.j(fbkVarA, "required_network_request");
                    int iJ27 = ckf.j(fbkVarA, "requires_charging");
                    int iJ28 = ckf.j(fbkVarA, "requires_device_idle");
                    int iJ29 = ckf.j(fbkVarA, "requires_battery_not_low");
                    int iJ30 = ckf.j(fbkVarA, "requires_storage_not_low");
                    int iJ31 = ckf.j(fbkVarA, "trigger_content_update_delay");
                    int iJ32 = ckf.j(fbkVarA, "trigger_max_content_delay");
                    int iJ33 = ckf.j(fbkVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (fbkVarA.k()) {
                        String strD = fbkVarA.d(iJ);
                        int i2 = iJ13;
                        int i3 = iJ14;
                        fju fjuVarF = dtb.f((int) fbkVarA.b(iJ2));
                        String strD2 = fbkVarA.d(iJ3);
                        String strD3 = fbkVarA.d(iJ4);
                        byte[] bArrL = fbkVarA.l(iJ5);
                        fjc fjcVar = fjc.a;
                        fjc fjcVarM = dsr.m(bArrL);
                        fjc fjcVarM2 = dsr.m(fbkVarA.l(iJ6));
                        long jB = fbkVarA.b(iJ7);
                        long jB2 = fbkVarA.b(iJ8);
                        long jB3 = fbkVarA.b(iJ9);
                        int iB = (int) fbkVarA.b(iJ10);
                        int i4 = iJ;
                        int i5 = iJ2;
                        int i6 = dtb.i((int) fbkVarA.b(iJ11));
                        long jB4 = fbkVarA.b(iJ12);
                        long jB5 = fbkVarA.b(i2);
                        long jB6 = fbkVarA.b(i3);
                        int i7 = iJ15;
                        long jB7 = fbkVarA.b(i7);
                        iJ15 = i7;
                        int i8 = iJ16;
                        int i9 = iJ3;
                        boolean z = ((int) fbkVarA.b(i8)) != 0;
                        int i10 = iJ17;
                        int i11 = iJ4;
                        int iK = dtb.k((int) fbkVarA.b(i10));
                        int i12 = iJ18;
                        int iB2 = (int) fbkVarA.b(i12);
                        int i13 = iJ19;
                        int iB3 = (int) fbkVarA.b(i13);
                        int i14 = iJ20;
                        long jB8 = fbkVarA.b(i14);
                        int i15 = iJ21;
                        int iB4 = (int) fbkVarA.b(i15);
                        iJ21 = i15;
                        int i16 = iJ22;
                        int iB5 = (int) fbkVarA.b(i16);
                        int i17 = iJ23;
                        Boolean boolValueOf = null;
                        String strD4 = fbkVarA.j(i17) ? null : fbkVarA.d(i17);
                        int i18 = iJ24;
                        if (fbkVarA.j(i18)) {
                            i = i17;
                            iJ22 = i16;
                            numValueOf = null;
                        } else {
                            i = i17;
                            iJ22 = i16;
                            numValueOf = Integer.valueOf((int) fbkVarA.b(i18));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i19 = iJ25;
                        int iJ34 = dtb.j((int) fbkVarA.b(i19));
                        int i20 = iJ26;
                        Cfor cforG = dtb.g(fbkVarA.l(i20));
                        int i21 = iJ27;
                        boolean z2 = ((int) fbkVarA.b(i21)) != 0;
                        int i22 = iJ28;
                        boolean z3 = ((int) fbkVarA.b(i22)) != 0;
                        int i23 = iJ29;
                        boolean z4 = ((int) fbkVarA.b(i23)) != 0;
                        iJ29 = i23;
                        int i24 = iJ30;
                        int i25 = iJ31;
                        int i26 = iJ32;
                        iJ31 = i25;
                        int i27 = iJ33;
                        arrayList.add(new fod(strD, fjuVarF, strD2, strD3, fjcVarM, fjcVarM2, jB, jB2, jB3, new fja(cforG, iJ34, z2, z3, z4, ((int) fbkVarA.b(i24)) != 0, fbkVarA.b(i25), fbkVarA.b(i26), dtb.h(fbkVarA.l(i27))), iB, i6, jB4, jB5, jB6, jB7, z, iK, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                        iJ28 = i22;
                        iJ4 = i11;
                        iJ17 = i10;
                        iJ18 = i12;
                        iJ19 = i13;
                        iJ20 = i14;
                        iJ23 = i;
                        iJ24 = i18;
                        iJ25 = i19;
                        iJ26 = i20;
                        iJ27 = i21;
                        iJ33 = i27;
                        iJ32 = i26;
                        iJ30 = i24;
                        iJ = i4;
                        iJ3 = i9;
                        iJ13 = i2;
                        iJ14 = i3;
                        iJ2 = i5;
                        iJ16 = i8;
                    }
                    return arrayList;
                } finally {
                    fbkVarA.close();
                }
            }
        });
    }
}
