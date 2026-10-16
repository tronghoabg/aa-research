package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ n7(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cb, code lost:
    
        r2 = new java.lang.String(r4, "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d1, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d3, code lost:
    
        com.carstream.tech.mirror.MirrorServer.h0(r0, r2);
        r2 = com.carstream.tech.mirror.MirrorServer.g0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        if (((java.lang.String) r2.get(java.lang.Integer.valueOf(r0))) != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e4, code lost:
    
        r2 = "launcher";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e7, code lost:
    
        r2 = (java.lang.String) r2.get(java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f1, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("o " + r0 + " -> " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        if (r0 != 78) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0213, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.B(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0217, code lost:
    
        if (r0 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0219, code lost:
    
        if (r0 >= 4000000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021b, code lost:
    
        r2 = new byte[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021e, code lost:
    
        if (r4 >= r0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0220, code lost:
    
        r5 = r9.read(r2, r4, r0 - r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0226, code lost:
    
        if (r5 >= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0229, code lost:
    
        r4 = r4 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022b, code lost:
    
        if (r4 != r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022d, code lost:
    
        r2 = android.graphics.BitmapFactory.decodeByteArray(r2, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0232, code lost:
    
        if (r2 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0234, code lost:
    
        r1.s = r2;
        r1.u = java.lang.System.currentTimeMillis();
        r1.v = false;
        com.carstream.tech.mirror.MirrorServer.J("banner thong bao (" + r0 + " byte)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0259, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("banner: giai ma hong");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0262, code lost:
    
        if (r0 != 83) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0264, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.B(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0268, code lost:
    
        if (r0 <= 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026c, code lost:
    
        if (r0 >= 512) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026e, code lost:
    
        r2 = new byte[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0271, code lost:
    
        if (r4 >= r0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0273, code lost:
    
        r5 = r9.read(r2, r4, r0 - r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0279, code lost:
    
        if (r5 >= 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027c, code lost:
    
        r4 = r4 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027e, code lost:
    
        if (r4 != r0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0280, code lost:
    
        r0 = new java.lang.String(r2, "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0286, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0288, code lost:
    
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x028c, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.k0 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x028e, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("dang ngu -> bo qua lenh 'S' (" + r0 + ")");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a7, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a9, code lost:
    
        r2 = com.carstream.tech.mirror.MirrorServer.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ab, code lost:
    
        if (r2 <= 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02af, code lost:
    
        if (r2 == com.carstream.tech.mirror.MirrorServer.b) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b3, code lost:
    
        if (r2 != com.carstream.tech.mirror.MirrorServer.i) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02b8, code lost:
    
        r2 = com.carstream.tech.mirror.MirrorServer.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02bb, code lost:
    
        com.carstream.tech.mirror.MirrorServer.I0 = false;
        com.carstream.tech.mirror.MirrorServer.J0 = java.lang.System.currentTimeMillis();
        new java.lang.Thread(new defpackage.q7(r2, r0), "mo-cai-dat").start();
        com.carstream.tech.mirror.MirrorServer.J("mo cai dat he thong '" + r0 + "' tren o " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02f2, code lost:
    
        if (r0 != 88) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f4, code lost:
    
        com.carstream.tech.mirror.MirrorServer.R("app bao da ngat ket noi");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02fb, code lost:
    
        if (r0 != 113) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fd, code lost:
    
        com.carstream.tech.mirror.MirrorServer.P0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0305, code lost:
    
        if (r0 != 81) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0307, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.B(1, r3);
        r2 = com.carstream.tech.mirror.MirrorServer.B(5, r3);
        r4 = com.carstream.tech.mirror.MirrorServer.B(9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0313, code lost:
    
        if (r0 >= 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0317, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.I0 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0319, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031f, code lost:
    
        com.carstream.tech.mirror.MirrorServer.I0 = false;
        com.carstream.tech.mirror.MirrorServer.J("Cai dat nhanh: dong");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032a, code lost:
    
        com.carstream.tech.mirror.MirrorServer.K0 = r0;
        com.carstream.tech.mirror.MirrorServer.L0 = (r2 >>> 16) & androidx.core.internal.view.SupportMenu.USER_MASK;
        com.carstream.tech.mirror.MirrorServer.O0 = r2 & androidx.core.internal.view.SupportMenu.USER_MASK;
        com.carstream.tech.mirror.MirrorServer.M0 = (r4 >>> 16) & androidx.core.internal.view.SupportMenu.USER_MASK;
        com.carstream.tech.mirror.MirrorServer.N0 = r4 & androidx.core.internal.view.SupportMenu.USER_MASK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0343, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.I0 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0345, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034b, code lost:
    
        com.carstream.tech.mirror.MirrorServer.I0 = true;
        com.carstream.tech.mirror.MirrorServer.J("Cai dat nhanh: " + com.carstream.tech.mirror.MirrorServer.M0 + "x" + com.carstream.tech.mirror.MirrorServer.N0 + " tai " + com.carstream.tech.mirror.MirrorServer.K0 + "," + com.carstream.tech.mirror.MirrorServer.L0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0383, code lost:
    
        if (r0 != 76) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0385, code lost:
    
        r1.A = java.lang.Math.max(25, java.lang.Math.min(100, com.carstream.tech.mirror.MirrorServer.B(1, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0399, code lost:
    
        if (r0 != 72) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x039b, code lost:
    
        com.carstream.tech.mirror.MirrorServer.d(com.carstream.tech.mirror.MirrorServer.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a2, code lost:
    
        if (r0 != 68) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a6, code lost:
    
        if (r0 != 115) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03a8, code lost:
    
        com.carstream.tech.mirror.MirrorServer.o(0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03af, code lost:
    
        if (r0 == 60) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b3, code lost:
    
        if (r0 != 62) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03b9, code lost:
    
        if (r0 != 102) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03bb, code lost:
    
        com.carstream.tech.mirror.MirrorServer.c0(-1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03c4, code lost:
    
        if (r0 != 98) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03c6, code lost:
    
        com.carstream.tech.mirror.MirrorServer.v("input -d " + com.carstream.tech.mirror.MirrorServer.b + " keyevent 4");
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03e5, code lost:
    
        if (r0 != 97) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03e7, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03e9, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03eb, code lost:
    
        com.carstream.tech.mirror.MirrorServer.v(defpackage.y2.AM_START_DISPLAY.a() + com.carstream.tech.mirror.MirrorServer.b + com.carstream.tech.mirror.MirrorServer.j() + " -n " + r0);
        com.carstream.tech.mirror.MirrorServer.h0(com.carstream.tech.mirror.MirrorServer.b, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x041d, code lost:
    
        if (r0 != 103) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x041f, code lost:
    
        com.carstream.tech.mirror.MirrorServer.v("am force-stop com.google.android.projection.gearhead");
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0428, code lost:
    
        if (r0 != 114) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x042a, code lost:
    
        new java.lang.Thread(new defpackage.n7(0), "bt-reset").start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x043e, code lost:
    
        if (r0 != 122) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0440, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.B(1, r3);
        r2 = com.carstream.tech.mirror.MirrorServer.B(5, r3);
        r4 = com.carstream.tech.mirror.MirrorServer.B(9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x044c, code lost:
    
        if (r0 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x044e, code lost:
    
        if (r2 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0452, code lost:
    
        if (r0 != com.carstream.tech.mirror.MirrorServer.o) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0456, code lost:
    
        if (r2 != com.carstream.tech.mirror.MirrorServer.p) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0458, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("co man xe van la " + r0 + "x" + r2 + " — khong doi gi");
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0479, code lost:
    
        com.carstream.tech.mirror.MirrorServer.u = r0;
        com.carstream.tech.mirror.MirrorServer.v = r2;
        com.carstream.tech.mirror.MirrorServer.w = r4;
        com.carstream.tech.mirror.MirrorServer.J("app bao co man xe " + r0 + "x" + r2 + "@" + r4 + " (dang la " + com.carstream.tech.mirror.MirrorServer.o + "x" + com.carstream.tech.mirror.MirrorServer.p + ") -> xep cho luong GL");
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04bc, code lost:
    
        if (r0 == 116) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04c0, code lost:
    
        com.carstream.tech.mirror.MirrorServer.D(com.carstream.tech.mirror.MirrorServer.B(1, r3), com.carstream.tech.mirror.MirrorServer.B(5, r3), com.carstream.tech.mirror.MirrorServer.B(9, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04d3, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.j <= 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04d5, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04d8, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.o / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04dc, code lost:
    
        r2 = java.lang.Math.round(com.carstream.tech.mirror.MirrorServer.o * 0.1f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ed, code lost:
    
        if (r3[0] != 62) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04f0, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04f1, code lost:
    
        com.carstream.tech.mirror.MirrorServer.c0((r0 + r2) / com.carstream.tech.mirror.MirrorServer.o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04fc, code lost:
    
        if (r0 != 110) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04fe, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0500, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0501, code lost:
    
        com.carstream.tech.mirror.MirrorServer.W(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0508, code lost:
    
        if (r3[0] != 111) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x050a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x050c, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x050d, code lost:
    
        com.carstream.tech.mirror.MirrorServer.i0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0511, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.i0 == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0513, code lost:
    
        com.carstream.tech.mirror.MirrorServer.w0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0517, code lost:
    
        com.carstream.tech.mirror.MirrorServer.w0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r10 >= r2) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r0 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r0 == 116) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("nhan lenh '" + ((char) r0) + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.k0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r0 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r0 == 87) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r0 == 116) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r0 != 107) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        com.carstream.tech.mirror.MirrorServer.o0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        if (r3[0] != 87) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.k0 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        r0 = " (thuc day hong?)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("app bao vao o Ung dung" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        if (com.carstream.tech.mirror.MirrorServer.k0 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        r0 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        if (r0 == 72) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        if (r0 == 97) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r0 == 98) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r0 == 111) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r0 == 113) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r0 == 115) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        if (r0 == 102) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        if (r0 == 68) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if (r0 == 60) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        if (r0 != 62) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("dang ngu -> bo qua lenh '" + ((char) r0) + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
    
        r0 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e9, code lost:
    
        if (r0 != 107) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
    
        r0 = new android.os.Bundle();
        r0.putInt("request-sync", 0);
        com.carstream.tech.mirror.MirrorServer.c.setParameters(r0);
        com.carstream.tech.mirror.MirrorServer.J("keyframe theo yeu cau");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("keyframe loi: " + java.lang.String.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        if (r0 == 111) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0121, code lost:
    
        if (r0 != 110) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012f, code lost:
    
        if (r0 != 66) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0131, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.B(1, r3);
        r2 = com.carstream.tech.mirror.MirrorServer.B(5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        if (r2 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013b, code lost:
    
        if (r2 >= 4000000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013d, code lost:
    
        r4 = new byte[r2];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
    
        if (r6 >= r2) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0142, code lost:
    
        r7 = r9.read(r4, r6, r2 - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0148, code lost:
    
        if (r7 >= 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
    
        r6 = r6 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014d, code lost:
    
        if (r6 != r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014f, code lost:
    
        r2 = android.graphics.BitmapFactory.decodeByteArray(r4, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0154, code lost:
    
        if (r2 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0156, code lost:
    
        r2.recycle();
        com.carstream.tech.mirror.MirrorServer.J("nhan hinh thanh #" + r0 + " (" + r2.getWidth() + "x" + r2.getHeight() + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0188, code lost:
    
        com.carstream.tech.mirror.MirrorServer.J("hinh thanh #" + r0 + ": giai ma hong");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        if (r0 != 80) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
    
        r0 = com.carstream.tech.mirror.MirrorServer.B(1, r3);
        r2 = com.carstream.tech.mirror.MirrorServer.B(5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b3, code lost:
    
        if (r2 <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b7, code lost:
    
        if (r2 >= 4096) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
    
        r4 = new byte[r2];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
    
        if (r5 >= r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01be, code lost:
    
        r6 = r9.read(r4, r5, r2 - r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c4, code lost:
    
        if (r6 >= 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c7, code lost:
    
        r5 = r5 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c9, code lost:
    
        if (r5 != r2) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0315 A[Catch: all -> 0x026b, TryCatch #7 {all -> 0x026b, blocks: (B:151:0x0237, B:153:0x024b, B:158:0x026e, B:159:0x0283, B:164:0x0292, B:163:0x028c, B:171:0x02b4, B:173:0x02ba, B:177:0x02cb, B:192:0x030b, B:193:0x0311, B:195:0x0315, B:198:0x0326, B:199:0x0329, B:201:0x0333, B:206:0x0342, B:189:0x0301, B:191:0x0308, B:168:0x029d), top: B:342:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:354:? -> B:184:0x02f9). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7.run():void");
    }
}
