package k.a;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.p;
import h.g.b.am;
import h.g.b.ap;
import h.g.b.aq;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.n.o;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class k {
    public static final long a(long j2) {
        return (j2 / 10000) - 11644473600000L;
    }

    static final ab b(am amVar, long j2, ap apVar, k.j jVar, ap apVar2, ap apVar3, aq aqVar, aq aqVar2, aq aqVar3, int i2, long j3) throws IOException {
        if (i2 != 1) {
            if (i2 == 10) {
                if (j3 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                jVar.Q(4L);
                l(jVar, (int) (j3 - 4), new com.waze.reports_v2.presentation.g(aqVar, jVar, aqVar2, aqVar3, 3));
            }
        } else {
            if (amVar.f48101a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            amVar.f48101a = true;
            if (j3 < j2) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jP = apVar.f48104a;
            if (jP == MuxerUtil.UNSIGNED_INT_MAX_VALUE) {
                jP = jVar.p();
            }
            apVar.f48104a = jP;
            apVar2.f48104a = apVar2.f48104a == MuxerUtil.UNSIGNED_INT_MAX_VALUE ? jVar.p() : 0L;
            apVar3.f48104a = apVar3.f48104a == MuxerUtil.UNSIGNED_INT_MAX_VALUE ? jVar.p() : 0L;
        }
        return ab.f48028a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x028e, code lost:
    
        if (r30 > r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x029c, code lost:
    
        throw new java.io.IOException("bad zip: zip64 extra required but absent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x029d, code lost:
    
        r41 = new k.a.i(k.aq.c(androidx.credentials.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false).k(r8), h.n.o.l(r8, androidx.credentials.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false), r33.w(r10), r5 & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE, r5.f48104a, r6.f48104a, r8, r11.f48104a, r6, r5, (java.lang.Long) r36.f48105a, (java.lang.Long) r37.f48105a, (java.lang.Long) r38.f48105a, 57344);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e2, code lost:
    
        if (r41.c() < r64) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ee, code lost:
    
        if (((java.lang.Boolean) r69.invoke(r41)).booleanValue() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        r15 = r11;
        r11 = (char) r13.M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f0, code lost:
    
        r40.add(r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f7, code lost:
    
        r9 = r60 + 1;
        r0 = r33;
        r5 = r39;
        r6 = r40;
        r11 = r62;
        r13 = r64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0311, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0319, code lost:
    
        throw new java.io.IOException("bad zip: filename contains 0x00");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0329, code lost:
    
        throw new java.io.IOException("unsupported zip: general purpose bit flag=".concat(j(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0350, code lost:
    
        throw new java.io.IOException("bad zip: expected " + j(33639248) + " but was " + j(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (r11 != ((char) r13.M())) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0351, code lost:
    
        r39 = r5;
        r40 = r6;
        r1 = h.ab.f48028a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0357, code lost:
    
        r39.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x035b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x035c, code lost:
    
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x035f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0361, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0362, code lost:
    
        r39 = r5;
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0366, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (r0 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0367, code lost:
    
        r39.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x036a, code lost:
    
        r18 = r1;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0371, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0372, code lost:
    
        e.a.h.ad.c(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0376, code lost:
    
        if (r18 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0378, code lost:
    
        r1 = r1;
        r42 = k.aq.c(androidx.credentials.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false);
        r0 = h.a.r.m(new h.k(r42, new k.a.i(r42, true, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, 65532)));
        r1 = h.a.i.al(r40, new com.waze.car_lib.r.d.k(14)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03cd, code lost:
    
        r2 = (k.a.i) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03dd, code lost:
    
        if (((k.a.i) r0.put(r2.i(), r2)) == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r7 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03df, code lost:
    
        r3 = r2.i().i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03e7, code lost:
    
        if (r3 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03e9, code lost:
    
        r4 = (k.a.i) r0.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03ef, code lost:
    
        if (r4 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03f1, code lost:
    
        r4.h().add(r2.i());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03ff, code lost:
    
        r17 = new k.a.i(r3, true, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, 65532);
        r0.put(r3, r17);
        r17.h().add(r2.i());
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0437, code lost:
    
        r1 = new k.ap(r67, r68, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0440, code lost:
    
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0443, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0444, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x044c, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x044d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r13.Q(4);
        r9 = r13.f();
        r13.w((char) r13.M());
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0477, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x047a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r13 = r9 & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        r9 = r17 - 20;
        r16 = r5;
        r25 = r6;
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r9 <= r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        r6 = k.y.c(r5.d(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r0.f() != 117853008) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        r9 = r0.f();
        r9 = r0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        if (r0.f() != 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        if (r9 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
    
        r6 = k.y.c(r5.d(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        r0 = r6;
        r9 = r0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        if (r9 != 101075792) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
    
        r0.Q(12);
        r9 = r0.f();
        r10 = r0.f();
        r29 = r0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
    
        if (r29 != r0.p()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
    
        if (r9 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
    
        if (r10 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        r0.Q(8);
        r8 = r0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        r10 = h.ab.f48028a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011a, code lost:
    
        r13 = r8;
        r11 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0146, code lost:
    
        throw new java.io.IOException("bad zip: expected " + j(101075792) + " but was " + j(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0147, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0148, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
    
        r0 = r8;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0151, code lost:
    
        e.a.h.ad.c(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0157, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0161, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0163, code lost:
    
        r6 = h.ab.f48028a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        r28.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        r28.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0176, code lost:
    
        r0 = r6;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        e.a.h.ad.c(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017f, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0184, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
    
        r6 = new java.util.ArrayList();
        r5 = k.y.c(r5.d(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        r0 = r5;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        h.g.b.x.f(r0, "<this>");
        r8 = r0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ac, code lost:
    
        r39 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b1, code lost:
    
        if (r8 == 33639248) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b3, code lost:
    
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b7, code lost:
    
        r0.Q(4);
        r8 = (char) r0.M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if ((r8 & 1) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
    
        r8 = (char) r0.M();
        r5 = (char) r0.M();
        r6 = (char) r0.M();
        r5 = r0.f();
        r5 = new h.g.b.ap();
        r60 = r9;
        r5.f48104a = r0.f() & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        r6 = new h.g.b.ap();
        r6.f48104a = r0.f() & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        r8 = (char) r0.M();
        r9 = (char) r0.M();
        r10 = (char) r0.M();
        r62 = r11;
        r0.Q(8);
        r11 = new h.g.b.ap();
        r64 = r13;
        r11.f48104a = r0.f() & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        r8 = r0.w(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0230, code lost:
    
        if (h.n.o.O(r8, 0) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0236, code lost:
    
        if (r6.f48104a == androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0238, code lost:
    
        r28 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x023b, code lost:
    
        r28 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0241, code lost:
    
        if (r5.f48104a == androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0243, code lost:
    
        r26 = 8;
        r12 = r28 + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0248, code lost:
    
        r26 = 8;
        r12 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0254, code lost:
    
        if (r11.f48104a == androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0256, code lost:
    
        r12 = r12 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0258, code lost:
    
        r30 = r12;
        r36 = new h.g.b.aq();
        r37 = new h.g.b.aq();
        r38 = new h.g.b.aq();
        r29 = new h.g.b.am();
        r33 = r0;
        l(r33, r9, new k.a.j(r29, r30, r6, r33, r5, r11, r36, r37, r38));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        r0 = (char) r13.M();
        r7 = (char) r13.M();
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0378 A[Catch: all -> 0x0494, TryCatch #10 {all -> 0x0494, blocks: (B:20:0x00a3, B:73:0x0181, B:76:0x0187, B:135:0x0378, B:136:0x03c7, B:138:0x03cd, B:140:0x03df, B:142:0x03e9, B:144:0x03f1, B:145:0x03ff, B:146:0x0437, B:149:0x0444, B:133:0x0372, B:74:0x0184, B:71:0x017b, B:163:0x0477, B:164:0x047a, B:156:0x0458, B:159:0x046c, B:160:0x0473, B:165:0x047b, B:166:0x0493, B:130:0x0367, B:68:0x0173), top: B:196:0x002d, inners: #8, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0444 A[Catch: all -> 0x0494, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x0494, blocks: (B:20:0x00a3, B:73:0x0181, B:76:0x0187, B:135:0x0378, B:136:0x03c7, B:138:0x03cd, B:140:0x03df, B:142:0x03e9, B:144:0x03f1, B:145:0x03ff, B:146:0x0437, B:149:0x0444, B:133:0x0372, B:74:0x0184, B:71:0x017b, B:163:0x0477, B:164:0x047a, B:156:0x0458, B:159:0x046c, B:160:0x0473, B:165:0x047b, B:166:0x0493, B:130:0x0367, B:68:0x0173), top: B:196:0x002d, inners: #8, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157 A[Catch: all -> 0x016d, TryCatch #5 {all -> 0x016d, blocks: (B:27:0x00cf, B:53:0x0157, B:58:0x0163, B:54:0x015a, B:51:0x0151, B:55:0x015b, B:56:0x0160, B:48:0x0149), top: B:187:0x00b8, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: all -> 0x016d, TryCatch #5 {all -> 0x016d, blocks: (B:27:0x00cf, B:53:0x0157, B:58:0x0163, B:54:0x015a, B:51:0x0151, B:55:0x015b, B:56:0x0160, B:48:0x0149), top: B:187:0x00b8, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181 A[Catch: all -> 0x0494, TryCatch #10 {all -> 0x0494, blocks: (B:20:0x00a3, B:73:0x0181, B:76:0x0187, B:135:0x0378, B:136:0x03c7, B:138:0x03cd, B:140:0x03df, B:142:0x03e9, B:144:0x03f1, B:145:0x03ff, B:146:0x0437, B:149:0x0444, B:133:0x0372, B:74:0x0184, B:71:0x017b, B:163:0x0477, B:164:0x047a, B:156:0x0458, B:159:0x046c, B:160:0x0473, B:165:0x047b, B:166:0x0493, B:130:0x0367, B:68:0x0173), top: B:196:0x002d, inners: #8, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184 A[Catch: all -> 0x0494, TryCatch #10 {all -> 0x0494, blocks: (B:20:0x00a3, B:73:0x0181, B:76:0x0187, B:135:0x0378, B:136:0x03c7, B:138:0x03cd, B:140:0x03df, B:142:0x03e9, B:144:0x03f1, B:145:0x03ff, B:146:0x0437, B:149:0x0444, B:133:0x0372, B:74:0x0184, B:71:0x017b, B:163:0x0477, B:164:0x047a, B:156:0x0458, B:159:0x046c, B:160:0x0473, B:165:0x047b, B:166:0x0493, B:130:0x0367, B:68:0x0173), top: B:196:0x002d, inners: #8, #14 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final k.ap c(k.ab r67, k.p r68, h.g.a.l r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a.k.c(k.ab, k.p, h.g.a.l):k.ap");
    }

    public static final i d(k.j jVar, i iVar) throws IOException {
        x.f(jVar, "<this>");
        x.f(iVar, "centralDirectoryZipEntry");
        i iVarK = k(jVar, iVar);
        x.c(iVarK);
        return iVarK;
    }

    public static final void e(k.j jVar) throws IOException {
        x.f(jVar, "<this>");
        k(jVar, null);
    }

    public static final /* synthetic */ boolean f(k.ab abVar) {
        return !o.l(abVar.d(), ".class", true);
    }

    public static final Application g(org.a.d.k.b bVar) throws org.a.a.a.a {
        x.f(bVar, "<this>");
        try {
            int i2 = ar.f48106a;
            return (Application) bVar.a(new m(Application.class), null, null);
        } catch (Exception unused) {
            throw new org.a.a.a.a("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    public static final Context h(org.a.d.k.b bVar) {
        x.f(bVar, "<this>");
        try {
            int i2 = ar.f48106a;
            return (Context) bVar.a(new m(Context.class), null, null);
        } catch (Exception unused) {
            throw new org.a.a.a.a("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    public static final org.a.d.a i(ComponentCallbacks componentCallbacks) {
        x.f(componentCallbacks, "<this>");
        return componentCallbacks instanceof org.a.d.a.a ? ((org.a.d.a.a) componentCallbacks).getKoin() : org.a.d.b.a.a();
    }

    private static final String j(int i2) {
        h.m.k.y(16);
        String string = Integer.toString(i2, 16);
        x.e(string, "toString(...)");
        return "0x".concat(String.valueOf(string));
    }

    private static final i k(k.j jVar, i iVar) throws IOException {
        int iF = jVar.f();
        if (iF != 67324752) {
            throw new IOException("bad zip: expected " + j(67324752) + " but was " + j(iF));
        }
        jVar.Q(2L);
        char cM = (char) jVar.M();
        if ((cM & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=".concat(j(cM)));
        }
        jVar.Q(18L);
        long jM = jVar.M();
        char cM2 = (char) jVar.M();
        jVar.Q(jM & 65535);
        if (iVar == null) {
            jVar.Q(cM2);
            return null;
        }
        aq aqVar = new aq();
        aq aqVar2 = new aq();
        aq aqVar3 = new aq();
        l(jVar, cM2, new com.waze.reports_v2.presentation.g(jVar, aqVar, aqVar2, aqVar3, 4));
        return iVar.j((Integer) aqVar.f48105a, (Integer) aqVar2.f48105a, (Integer) aqVar3.f48105a);
    }

    private static final void l(k.j jVar, int i2, p pVar) throws IOException {
        long j2 = i2;
        while (j2 != 0) {
            if (j2 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            char cM = (char) jVar.M();
            long j3 = j2 - 4;
            long jM = jVar.M() & 65535;
            if (j3 < jM) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            jVar.O(jM);
            long jQ = jVar.B().q();
            pVar.invoke(Integer.valueOf(cM), Long.valueOf(jM));
            long jQ2 = (jVar.B().q() + jM) - jQ;
            if (jQ2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + ((int) cM));
            }
            if (jQ2 > 0) {
                jVar.B().Q(jQ2);
            }
            j2 = j3 - jM;
        }
    }
}
