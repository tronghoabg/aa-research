package defpackage;

import android.content.Context;
import android.os.Parcelable;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zkt {
    public static volatile admf a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static volatile boolean i;
    public static volatile int j;
    public static volatile float k;
    public static volatile float l;
    public static volatile float m;
    public static volatile String n;
    public static volatile zkt o;
    private static Boolean p;
    private static Exception q;

    private zkt() {
    }

    public static int a(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return 29;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return 34;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return 35;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return 36;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return 37;
            case 37:
                return 38;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return 39;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return 40;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return 41;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return 42;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return 43;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return 44;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return 45;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return 46;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return 47;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return 48;
            case 48:
                return 49;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return 50;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return 124;
            case 124:
                return 125;
            case 125:
                return 126;
            case 126:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 175:
            case 235:
            case 244:
            case 266:
            case 276:
            case 280:
            default:
                return 0;
            case 165:
                return 166;
            case 173:
                return 174;
            case 174:
                return 175;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
            case 228:
                return 229;
            case 229:
                return 230;
            case 230:
                return 231;
            case 231:
                return 232;
            case 232:
                return 233;
            case 233:
                return 234;
            case 234:
                return 235;
            case 236:
                return 237;
            case 237:
                return 238;
            case 238:
                return 239;
            case 239:
                return 240;
            case 240:
                return 241;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 245:
                return 246;
            case 246:
                return 247;
            case 247:
                return 248;
            case 248:
                return 249;
            case 249:
                return 250;
            case 250:
                return 251;
            case 251:
                return 252;
            case 252:
                return 253;
            case 253:
                return 254;
            case 254:
                return 255;
            case 255:
                return 256;
            case 256:
                return 257;
            case 257:
                return 258;
            case 258:
                return 259;
            case 259:
                return 260;
            case 260:
                return 261;
            case 261:
                return 262;
            case 262:
                return 263;
            case 263:
                return 264;
            case 264:
                return 265;
            case 265:
                return 266;
            case 267:
                return 268;
            case 268:
                return 269;
            case 269:
                return 270;
            case 270:
                return 271;
            case 271:
                return 272;
            case 272:
                return 273;
            case 273:
                return 274;
            case 274:
                return 275;
            case 275:
                return 276;
            case 277:
                return 278;
            case 278:
                return 279;
            case 279:
                return 280;
            case 281:
                return 282;
            case 282:
                return 283;
            case 283:
                return 284;
            case 284:
                return 285;
            case 285:
                return 286;
            case 286:
                return 287;
            case 287:
                return 288;
            case 288:
                return 289;
            case 289:
                return 290;
            case 290:
                return 291;
            case 291:
                return 292;
            case 292:
                return 293;
            case 293:
                return 294;
            case 294:
                return 295;
            case 295:
                return 296;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[EDGE_INSN: B:78:0x00a4->B:45:0x00a4 BREAK  A[LOOP:1: B:30:0x0078->B:36:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(java.lang.CharSequence r7, defpackage.zok r8) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkt.b(java.lang.CharSequence, zok):int");
    }

    public static String c(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void h(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void i(float f2, Object obj) {
        if (f2 < -90.0f || f2 > 90.0f) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void j(int i2, int i3, int i4, Object obj) {
        if (i3 > i4) {
            throw new IllegalStateException(a.bB(i4, i3, "Invalid interval [", ",", "]"));
        }
        if (i2 < i3 || i4 < i2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void k(double d2, Object obj) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void l(float f2, Object obj) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void n(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void o(double d2, Object obj) {
        if (d2 == 0.0d) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static boolean p() throws Exception {
        Boolean bool = p;
        if (bool != null) {
            return bool.booleanValue();
        }
        Exception exc = q;
        if (exc != null) {
            throw exc;
        }
        try {
            Class<?> cls = Class.forName("android.os.Build");
            Field field = cls.getField("HARDWARE");
            field.setAccessible(true);
            Boolean boolValueOf = Boolean.valueOf(Objects.equals((String) field.get(cls), "goldfish"));
            p = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | RuntimeException e2) {
            q = e2;
            throw e2;
        }
    }

    public static int q(double d2) {
        return (int) Math.round(d2 * k);
    }

    public static boolean r() {
        return h || c;
    }

    public static int s(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 5) {
            return 6;
        }
        if (i2 != 10) {
            return i2 != 20 ? 0 : 21;
        }
        return 11;
    }

    public static int t(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 7:
            default:
                return 0;
            case 6:
                return 7;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
        }
    }

    public static final ziz u(String str, Parcelable.Creator creator) {
        adpu adpuVar = new adpu(creator, false);
        int i2 = adlx.d;
        String strConcat = str.concat("-bin");
        adly adlyVar = new adly(strConcat, adpuVar);
        Logger logger = adjq.c;
        return new ziz(adlyVar, new adjn("REQ-".concat(strConcat)), new adjn("RESH-".concat(strConcat)), new adjn("REST-".concat(strConcat)));
    }

    public static final ziz v(String str, Parcelable.Creator creator) {
        creator.getClass();
        return u(str, creator);
    }

    public static final void w(ziz zizVar, Parcelable parcelable, admc admcVar) {
        zizVar.getClass();
        parcelable.getClass();
        admcVar.f(zizVar.a, parcelable);
    }

    public static void x(admf admfVar, Class cls, boolean z) throws adnr {
        Class<?> cls2;
        boolean z2;
        try {
            cls2 = ((aect) (z ? admfVar.d : admfVar.e)).a.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        String str = true != z ? "response" : "request";
        String str2 = admfVar.b;
        throw new adnr(adnq.l.e("AsyncClientInterceptor: The " + str + " message type of method " + str2 + " (" + cls2.getName() + (true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller") + ") must be a subclass of " + cls.toString()));
    }

    @Deprecated
    public static adom y(Context context, ygr ygrVar) {
        return new zhx(context.getPackageManager(), ygrVar, skn.a(context));
    }
}
