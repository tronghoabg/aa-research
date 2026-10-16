package A7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x.C4408a;
import x.C4409b;
import x.C4412e;

/* loaded from: classes4.dex */
public final class W1 extends G1 {

    /* renamed from: d, reason: collision with root package name */
    public String f736d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f737e;

    /* renamed from: f, reason: collision with root package name */
    public C4412e f738f;

    /* renamed from: g, reason: collision with root package name */
    public Long f739g;

    /* renamed from: h, reason: collision with root package name */
    public Long f740h;

    @Override // A7.G1
    public final boolean j0() {
        return false;
    }

    public final X1 k0(Integer num) {
        if (this.f738f.containsKey(num)) {
            return (X1) this.f738f.get(num);
        }
        X1 x12 = new X1(this, this.f736d);
        this.f738f.put(num, x12);
        return x12;
    }

    public final ArrayList l0(String str, List list, List list2, Long l10, Long l11) {
        return m0(str, list, list2, l10, l11, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8 A[Catch: all -> 0x01c0, SQLiteException -> 0x01c4, TRY_LEAVE, TryCatch #1 {all -> 0x01c0, blocks: (B:73:0x01b2, B:75:0x01b8, B:82:0x01c8, B:83:0x01ce, B:84:0x01d7, B:85:0x01e9, B:90:0x0209, B:87:0x01f4, B:89:0x01fe, B:100:0x0222), top: B:258:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c8 A[Catch: all -> 0x01c0, SQLiteException -> 0x01c4, TRY_ENTER, TryCatch #1 {all -> 0x01c0, blocks: (B:73:0x01b2, B:75:0x01b8, B:82:0x01c8, B:83:0x01ce, B:84:0x01d7, B:85:0x01e9, B:90:0x0209, B:87:0x01f4, B:89:0x01fe, B:100:0x0222), top: B:258:0x01b2 }] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m0(java.lang.String r28, java.util.List r29, java.util.List r30, java.lang.Long r31, java.lang.Long r32, boolean r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.W1.m0(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08a1 A[LOOP:2: B:180:0x042a->B:375:0x08a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(java.util.List r45, boolean r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.W1.n0(java.util.List, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x041f, code lost:
    
        r0 = zzj();
        r3 = A7.N.h0(r24.f736d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x042d, code lost:
    
        if (r11.zzi() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x042f, code lost:
    
        r5 = java.lang.Integer.valueOf(r11.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0438, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0439, code lost:
    
        r0.f608i.b(r3, "Invalid property filter ID. appId, id", java.lang.String.valueOf(r5));
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dd, code lost:
    
        r18 = r0;
        r21 = r4;
        r22 = r5;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0407 A[LOOP:3: B:49:0x0123->B:172:0x0407, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(java.util.List r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.W1.o0(java.util.List):void");
    }

    public final ArrayList p0() {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2 = new ArrayList();
        C4409b c4409b = (C4409b) this.f738f.keySet();
        c4409b.removeAll(this.f737e);
        Iterator it = c4409b.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            X1 x12 = (X1) this.f738f.get(num);
            AbstractC1732v.i(x12);
            zzfy.zzd.zza zzaVarZzb = zzfy.zzd.zzb();
            zzaVarZzb.zza(iIntValue);
            zzaVarZzb.zza(x12.f749b);
            zzfy.zzm zzmVar = x12.f750c;
            if (zzmVar != null) {
                zzaVarZzb.zza(zzmVar);
            }
            zzfy.zzm.zza zzaVarZzd = zzfy.zzm.zze().zzb(S1.w0(x12.f751d)).zzd(S1.w0(x12.f752e));
            C4412e c4412e = x12.f753f;
            if (c4412e == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(c4412e.f47563c);
                Iterator it2 = ((C4409b) c4412e.keySet()).iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) it2.next();
                    int iIntValue2 = num2.intValue();
                    Long l10 = (Long) c4412e.get(num2);
                    if (l10 != null) {
                        arrayList.add((zzfy.zze) ((zzjt) zzfy.zze.zzc().zza(iIntValue2).zza(l10.longValue()).zzai()));
                    }
                }
            }
            if (arrayList != null) {
                zzaVarZzd.zza(arrayList);
            }
            C4412e c4412e2 = x12.f754g;
            if (c4412e2 == null) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList3 = new ArrayList(c4412e2.f47563c);
                Iterator it3 = ((C4409b) c4412e2.keySet()).iterator();
                while (true) {
                    C4408a c4408a = (C4408a) it3;
                    if (!c4408a.hasNext()) {
                        break;
                    }
                    Integer num3 = (Integer) c4408a.next();
                    zzfy.zzn.zza zzaVarZza = zzfy.zzn.zzc().zza(num3.intValue());
                    List list2 = (List) c4412e2.get(num3);
                    if (list2 != null) {
                        Collections.sort(list2);
                        zzaVarZza.zza(list2);
                    }
                    arrayList3.add((zzfy.zzn) ((zzjt) zzaVarZza.zzai()));
                }
                list = arrayList3;
            }
            zzaVarZzd.zzc(list);
            zzaVarZzb.zza(zzaVarZzd);
            zzfy.zzd zzdVar = (zzfy.zzd) ((zzjt) zzaVarZzb.zzai());
            arrayList2.add(zzdVar);
            C0257i c0257iF0 = f0();
            String str = this.f736d;
            zzfy.zzm zzmVarZzd = zzdVar.zzd();
            c0257iF0.h0();
            c0257iF0.c0();
            AbstractC1732v.f(str);
            AbstractC1732v.i(zzmVarZzd);
            byte[] bArrZzca = zzmVarZzd.zzca();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrZzca);
            try {
                if (c0257iF0.l0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    c0257iF0.zzj().f605f.d("Failed to insert filter results (got -1). appId", N.h0(str));
                }
            } catch (SQLiteException e7) {
                c0257iF0.zzj().f605f.b(N.h0(str), "Error storing filter results. appId", e7);
            }
        }
        return arrayList2;
    }
}
