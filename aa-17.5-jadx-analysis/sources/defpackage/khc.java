package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.apps.auto.components.calendar.model.CalendarReminder;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class khc {
    public static String a(long j, long j2, boolean z, boolean z2) {
        ZoneId zoneIdSystemDefault;
        boolean z3;
        Context context = mki.a.c;
        String string = z ? z2 ? "" : context.getString(R.string.agenda_item_all_day) : DateUtils.formatDateTime(context, j, 1);
        if (z) {
            zoneIdSystemDefault = ZoneOffset.UTC;
            z3 = true;
        } else {
            zoneIdSystemDefault = ZoneId.systemDefault();
            z3 = false;
        }
        long epochDay = Instant.ofEpochMilli(j).atZone(zoneIdSystemDefault).toLocalDate().toEpochDay();
        long epochDay2 = Instant.ofEpochMilli(j2).atZone(zoneIdSystemDefault).toLocalDate().toEpochDay();
        if (z3) {
            epochDay2--;
        }
        oit.a();
        long epochDay3 = Instant.now().atZone(zoneIdSystemDefault).toLocalDate().toEpochDay() - epochDay;
        long j3 = (epochDay2 - epochDay) + 1;
        if (j3 <= 1) {
            return string;
        }
        long j4 = epochDay3 + 1;
        return string.isEmpty() ? context.getString(R.string.multiday_timestamp_progress_format, Long.valueOf(j4), Long.valueOf(j3)) : context.getString(R.string.multiday_timestamp_format, string, Long.valueOf(j4), Long.valueOf(j3));
    }

    public static final String b(CalendarReminder calendarReminder) {
        return a(calendarReminder.e(), calendarReminder.c(), false, false);
    }

    public static void c() {
    }

    public static final avp d(ksy ksyVar, int i, boolean z) {
        ksyVar.getClass();
        return i <= 1 ? asl.K(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3) : !z ? asl.K(ksyVar.m, BitmapDescriptorFactory.HUE_RED, 2) : asl.L(ksyVar.l, BitmapDescriptorFactory.HUE_RED, ksyVar.m, BitmapDescriptorFactory.HUE_RED, 10);
    }

    public static final bpc e(long j) {
        return new bpc(j, new blx(0.08f, 0.12f));
    }

    public static final void f(cmw cmwVar, deu deuVar, ksy ksyVar, Map map, bux buxVar, int i, int i2) {
        int i3;
        Map map2;
        ksy ksyVar2 = ksyVar;
        Map map3 = map;
        ksyVar2.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1077190806);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(deuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(ksyVar2) : buxVarC.E(ksyVar2)) ? 128 : 256;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? buxVarC.C(map3) : buxVarC.E(map3)) ? 1024 : 2048;
        }
        int i6 = i3;
        if (buxVarC.I((i6 & 1171) != 1170, i6 & 1)) {
            if (i5 != 0) {
                map3 = afbf.a;
            }
            Map map4 = map3;
            if (deuVar != null) {
                buxVarC.v(-1404152783);
                if (cmwVar != null) {
                    buxVarC.v(-1404132788);
                    float f = ksyVar2.k;
                    boc.a(cmwVar, null, new awc(f, f, f, f, true), 0L, buxVarC, (i6 & 14) | 56, 8);
                    float f2 = ksyVar2.n;
                    asl.A(new awc(f2, f2, f2, f2, true), buxVarC);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(-1403979028);
                    ((bvv) buxVarC).Y(false);
                }
                brp.c(deuVar, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, map4, null, null, buxVarC, (i6 >> 3) & 14, ((i6 << 9) & 3670016) | 24960, 438270);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
                ksyVar2 = ksyVar;
            } else {
                buxVarC.v(-1403867211);
                cmwVar.getClass();
                ksyVar2 = ksyVar;
                float f3 = ksyVar2.i;
                dlj dljVar = ksyVar2.j;
                float f4 = dljVar != null ? dljVar.a : f3;
                boc.a(cmwVar, null, new awc(f4, f3, f4, f3, true), 0L, buxVarC, 56, 8);
                ((bvv) buxVarC).Y(false);
            }
            map2 = map4;
        } else {
            buxVarC.s();
            map2 = map3;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmv(cmwVar, deuVar, ksyVar2, map2, i, i2, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.cmw r35, defpackage.deu r36, defpackage.afdr r37, defpackage.cfy r38, defpackage.ksy r39, boolean r40, boolean r41, defpackage.ckv r42, defpackage.ckv r43, defpackage.ktf r44, defpackage.bmr r45, defpackage.asf r46, defpackage.ajh r47, java.util.Map r48, defpackage.bux r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.g(cmw, deu, afdr, cfy, ksy, boolean, boolean, ckv, ckv, ktf, bmr, asf, ajh, java.util.Map, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.cmw r30, defpackage.deu r31, defpackage.afdr r32, defpackage.cfy r33, defpackage.ksy r34, boolean r35, boolean r36, defpackage.ckv r37, defpackage.ckv r38, defpackage.ktf r39, defpackage.bmr r40, defpackage.asf r41, defpackage.ajh r42, java.util.Map r43, defpackage.bux r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.h(cmw, deu, afdr, cfy, ksy, boolean, boolean, ckv, ckv, ktf, bmr, asf, ajh, java.util.Map, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.cmw r27, defpackage.afdr r28, defpackage.cfy r29, defpackage.ksy r30, boolean r31, boolean r32, defpackage.ckv r33, defpackage.ckv r34, defpackage.ktf r35, defpackage.bmr r36, defpackage.asf r37, defpackage.ajh r38, defpackage.bux r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.i(cmw, afdr, cfy, ksy, boolean, boolean, ckv, ckv, ktf, bmr, asf, ajh, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final defpackage.afdr r35, defpackage.cfy r36, defpackage.ksy r37, boolean r38, boolean r39, defpackage.ckv r40, defpackage.ckv r41, defpackage.ktf r42, defpackage.bmr r43, defpackage.ajh r44, defpackage.avp r45, defpackage.asf r46, boolean r47, final defpackage.afeh r48, defpackage.bux r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.j(afdr, cfy, ksy, boolean, boolean, ckv, ckv, ktf, bmr, ajh, avp, asf, boolean, afeh, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.cmw r22, java.lang.String r23, defpackage.afdr r24, defpackage.cfy r25, defpackage.ksy r26, boolean r27, defpackage.ckv r28, defpackage.ktf r29, defpackage.bmr r30, defpackage.asf r31, defpackage.bux r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.k(cmw, java.lang.String, afdr, cfy, ksy, boolean, ckv, ktf, bmr, asf, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.cmw r23, final defpackage.afdr r24, defpackage.cfy r25, defpackage.ksy r26, boolean r27, defpackage.ckv r28, defpackage.ktf r29, defpackage.bmr r30, defpackage.asf r31, defpackage.bux r32, final int r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.l(cmw, afdr, cfy, ksy, boolean, ckv, ktf, bmr, asf, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final defpackage.cmw r29, final defpackage.deu r30, final defpackage.afdr r31, defpackage.cfy r32, defpackage.ksy r33, boolean r34, defpackage.ckv r35, defpackage.ktf r36, defpackage.bmr r37, defpackage.asf r38, defpackage.ajh r39, java.util.Map r40, defpackage.bux r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.m(cmw, deu, afdr, cfy, ksy, boolean, ckv, ktf, bmr, asf, ajh, java.util.Map, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final defpackage.cmw r20, final java.lang.String r21, final defpackage.afdr r22, defpackage.cfy r23, defpackage.ksy r24, boolean r25, defpackage.ckv r26, defpackage.ktf r27, defpackage.bmr r28, defpackage.asf r29, defpackage.ajh r30, defpackage.bux r31, final int r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.n(cmw, java.lang.String, afdr, cfy, ksy, boolean, ckv, ktf, bmr, asf, ajh, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.cmw r23, defpackage.afdr r24, defpackage.cfy r25, defpackage.ksy r26, boolean r27, defpackage.ckv r28, defpackage.ktf r29, defpackage.bmr r30, defpackage.asf r31, defpackage.ajh r32, defpackage.bux r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.o(cmw, afdr, cfy, ksy, boolean, ckv, ktf, bmr, asf, ajh, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final defpackage.cmw r29, final defpackage.deu r30, final defpackage.afdr r31, defpackage.cfy r32, defpackage.ksy r33, boolean r34, boolean r35, defpackage.ckv r36, defpackage.ckv r37, defpackage.ktf r38, defpackage.bmr r39, defpackage.asf r40, java.util.Map r41, defpackage.bux r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.p(cmw, deu, afdr, cfy, ksy, boolean, boolean, ckv, ckv, ktf, bmr, asf, java.util.Map, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.cmw r26, java.lang.String r27, defpackage.afdr r28, defpackage.cfy r29, defpackage.ksy r30, boolean r31, boolean r32, defpackage.ckv r33, defpackage.ckv r34, defpackage.ktf r35, defpackage.bmr r36, defpackage.asf r37, defpackage.bux r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.q(cmw, java.lang.String, afdr, cfy, ksy, boolean, boolean, ckv, ckv, ktf, bmr, asf, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final defpackage.cmw r25, final defpackage.afdr r26, defpackage.cfy r27, defpackage.ksy r28, boolean r29, boolean r30, defpackage.ckv r31, defpackage.ckv r32, defpackage.ktf r33, defpackage.bmr r34, defpackage.asf r35, defpackage.bux r36, final int r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khc.r(cmw, afdr, cfy, ksy, boolean, boolean, ckv, ckv, ktf, bmr, asf, bux, int, int, int):void");
    }

    public static final ckv s(bux buxVar) {
        return czz.au(buxVar).b;
    }

    public static final Object t(wci wciVar, afdr afdrVar) {
        kiz kizVar = new kiz(afdrVar, 0);
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) wciVar.a, 0);
        String str = (String) wciVar.c;
        yzy yzyVar = (yzy) wciVar.b;
        return kgq.c(kizVar, (String) wciVar.e, (yzz) wciVar.d, yzyVar, true, str, objArrCopyOf);
    }

    public static final Object u(wci wciVar, afdr afdrVar) {
        kja kjaVar = new kja(afdrVar, 0);
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) wciVar.a, 0);
        String str = (String) wciVar.c;
        yzy yzyVar = (yzy) wciVar.b;
        return kgq.c(kjaVar, (String) wciVar.e, (yzz) wciVar.d, yzyVar, false, str, objArrCopyOf);
    }
}
