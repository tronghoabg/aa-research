package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.StrictMode;
import android.view.View;
import android.widget.EditText;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class wox {
    private static aabn a;
    private static aabn b;

    public wox(byte[] bArr, byte[] bArr2) {
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int A(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 7;
        }
        return 6;
    }

    public static int B(int i) {
        switch (i) {
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
            case 18:
            default:
                return 0;
            case 16:
                return 17;
            case 17:
                return 18;
            case 19:
                return 20;
        }
    }

    public static int C(int i) {
        switch (i) {
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
            case 31:
            default:
                return 0;
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
        }
    }

    public static int D(int i) {
        switch (i) {
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
            default:
                switch (i) {
                    case 100:
                        return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        return 102;
                    case 102:
                        return 103;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 32769:
                return "CAR_CONTROL_SET_CAR_PROPERTY_VALUE_REQUEST";
            case 32770:
                return "CAR_CONTROL_SET_CAR_PROPERTY_VALUE_RESPONSE";
            case 32771:
                return "CAR_CONTROL_REGISTER_CAR_PROPERTY_LISTENERS_REQUEST";
            case 32772:
                return "CAR_CONTROL_REGISTER_CAR_PROPERTY_LISTENERS_RESPONSE";
            case 32773:
                return "CAR_CONTROL_CAR_PROPERTY_CHANGE_EVENT";
            case 32774:
                return "CAR_CONTROL_CAR_ACTION_NOTIFICATION";
            default:
                return "CAR_CONTROL_CAR_CONTROL_GROUP_UPDATE";
        }
    }

    public static int F(int i) {
        switch (i) {
            case 32769:
                return 32769;
            case 32770:
                return 32770;
            case 32771:
                return 32771;
            case 32772:
                return 32772;
            case 32773:
                return 32773;
            case 32774:
                return 32774;
            case 32775:
                return 32775;
            default:
                return 0;
        }
    }

    public static /* synthetic */ xio G(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (xio) abnvVarN;
    }

    public static void H(xgi xgiVar, abnp abnpVar) {
        abnpVar.t();
        xio xioVar = (xio) abnpVar.b;
        xio xioVar2 = xio.a;
        xioVar.c = xgiVar;
        xioVar.b |= 1;
    }

    public static void I(xkr xkrVar, abnp abnpVar) {
        abnpVar.t();
        xio xioVar = (xio) abnpVar.b;
        xio xioVar2 = xio.a;
        xioVar.d = xkrVar.I;
        xioVar.b |= 2;
    }

    public static /* synthetic */ xgi J(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (xgi) abnvVarN;
    }

    public static void K(xgj xgjVar, abnp abnpVar) {
        abnpVar.t();
        xgi xgiVar = (xgi) abnpVar.b;
        xgi xgiVar2 = xgi.a;
        xgiVar.d = xgjVar;
        xgiVar.b |= 2;
    }

    public static void L(xgm xgmVar, abnp abnpVar) {
        abnpVar.t();
        xgi xgiVar = (xgi) abnpVar.b;
        xgi xgiVar2 = xgi.a;
        xgiVar.c = xgmVar.a();
        xgiVar.b |= 1;
    }

    public static /* synthetic */ xgl M(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (xgl) abnvVarN;
    }

    public static void N(xga xgaVar, abnp abnpVar) {
        abnpVar.t();
        xgl xglVar = (xgl) abnpVar.b;
        xgl xglVar2 = xgl.a;
        xglVar.d = xgaVar;
        xglVar.b |= 2;
    }

    public static void O(xgi xgiVar, abnp abnpVar) {
        abnpVar.t();
        xgl xglVar = (xgl) abnpVar.b;
        xgl xglVar2 = xgl.a;
        xglVar.e = xgiVar;
        xglVar.b |= 4;
    }

    public static void P(xgi xgiVar, abnp abnpVar) {
        abnpVar.t();
        xgl xglVar = (xgl) abnpVar.b;
        xgl xglVar2 = xgl.a;
        xglVar.c = xgiVar;
        xglVar.b |= 1;
    }

    public static /* synthetic */ xin Q(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (xin) abnvVarN;
    }

    public static void R(xgi xgiVar, abnp abnpVar) {
        abnpVar.t();
        xin xinVar = (xin) abnpVar.b;
        xin xinVar2 = xin.a;
        xinVar.c = xgiVar;
        xinVar.b |= 1;
    }

    public static void S(xgq xgqVar, abnp abnpVar) {
        abnpVar.t();
        xin xinVar = (xin) abnpVar.b;
        xin xinVar2 = xin.a;
        xinVar.d = xgqVar;
        xinVar.b |= 2;
    }

    public static void T(abnp abnpVar) {
        abnpVar.t();
        xin xinVar = (xin) abnpVar.b;
        xin xinVar2 = xin.a;
        xinVar.b |= 4;
        xinVar.e = 1;
    }

    public static /* synthetic */ xgj U(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (xgj) abnvVarN;
    }

    public static /* synthetic */ void V(abnp abnpVar) {
        new abof(((xgj) abnpVar.b).i, xgj.a);
    }

    public static /* synthetic */ void W(abnp abnpVar) {
        new abof(((xgj) abnpVar.b).j, xgj.b);
    }

    public static void X(abnp abnpVar) {
        abnpVar.t();
        xgj xgjVar = (xgj) abnpVar.b;
        aboe aboeVar = xgj.a;
        xgjVar.h = 0;
        xgjVar.g |= 1;
    }

    public static int Y(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ oct Z(abnp abnpVar) {
        abnpVar.getClass();
        return new oct(abnpVar);
    }

    static void a(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static /* synthetic */ oct aa(abnp abnpVar) {
        abnpVar.getClass();
        return new oct(abnpVar);
    }

    public static int ab(int i) {
        if (i != 0) {
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ac(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    public static int ad(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ String ae(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "DISABLE";
            case 3:
                return "WHITELIST";
            case 4:
                return "BLACKLIST";
            case 5:
                return "ENABLE_ALL";
            case 6:
                return "ALLOWLIST";
            default:
                return "DENYLIST";
        }
    }

    public static /* synthetic */ long af(long j, long j2) {
        boolean z = (j ^ j2) >= 0;
        long j3 = j - j2;
        if (z || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static abpt ag(Instant instant) {
        return abqu.c(instant.getEpochSecond(), instant.getNano());
    }

    public static Duration ah(abnf abnfVar) {
        return Duration.ofSeconds(abqs.d(abnfVar.b, abnfVar.c).b, r4.c);
    }

    public static Instant ai(abpt abptVar) {
        return Instant.ofEpochSecond(abqu.c(abptVar.b, abptVar.c).b, r4.c);
    }

    public static /* synthetic */ long aj(long j) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(1000L) + Long.numberOfLeadingZeros(-1001L);
        if (iNumberOfLeadingZeros > 65) {
            return j * 1000;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j2 = j * 1000;
            if (j == 0 || j2 / j == 1000) {
                return j2;
            }
        }
        throw new ArithmeticException();
    }

    public static abow ak(Parcel parcel, abow abowVar, abnj abnjVar) throws abon {
        return al((ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR), abowVar, abnjVar);
    }

    public static abow al(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, abow abowVar, abnj abnjVar) throws abon {
        abow abowVarS = abowVar.s();
        if (protoParsers$InternalDontUse.b == null) {
            protoParsers$InternalDontUse.b = abowVarS.K().h(protoParsers$InternalDontUse.a, abnjVar).q();
        }
        return protoParsers$InternalDontUse.b;
    }

    public static void am(Parcel parcel, abow abowVar) {
        parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, abowVar), 0);
    }

    public static void an(abms abmsVar, ArrayDeque arrayDeque) {
        if (!abmsVar.q()) {
            if (!(abmsVar instanceof abpk)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(abmsVar.getClass()))));
            }
            abpk abpkVar = (abpk) abmsVar;
            int[] iArr = abpk.a;
            an(abpkVar.c, arrayDeque);
            an(abpkVar.e, arrayDeque);
            return;
        }
        int iAy = ay(abmsVar.d());
        int iO = abpk.o(iAy + 1);
        if (arrayDeque.isEmpty() || ((abms) arrayDeque.peek()).d() >= iO) {
            arrayDeque.push(abmsVar);
            return;
        }
        int iO2 = abpk.o(iAy);
        abms abpkVar2 = (abms) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((abms) arrayDeque.peek()).d() < iO2) {
            abpkVar2 = new abpk((abms) arrayDeque.pop(), abpkVar2);
        }
        abpk abpkVar3 = new abpk(abpkVar2, abmsVar);
        while (!arrayDeque.isEmpty()) {
            if (((abms) arrayDeque.peek()).d() >= abpk.o(ay(abpkVar3.b) + 1)) {
                break;
            } else {
                abpkVar3 = new abpk((abms) arrayDeque.pop(), abpkVar3);
            }
        }
        arrayDeque.push(abpkVar3);
    }

    public static int ao(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 10) {
            return 11;
        }
        if (i == 35) {
            return 36;
        }
        if (i == 40) {
            return 41;
        }
        if (i == 21) {
            return 22;
        }
        if (i == 22) {
            return 23;
        }
        if (i == 37) {
            return 38;
        }
        if (i == 38) {
            return 39;
        }
        switch (i) {
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            default:
                return 0;
        }
    }

    public static int ap(int i) {
        switch (i) {
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
            default:
                return 0;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
        }
    }

    public static int aq(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static int ar(int i) {
        switch (i) {
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
            default:
                return 0;
        }
    }

    public static String as(acht achtVar) {
        if (achtVar == null) {
            return "null";
        }
        zsa zsaVarA = zsa.a(achtVar);
        zsaVarA.c("latitude", aahr.b(achtVar.c));
        zsaVarA.c("longitude", aahr.b(achtVar.d));
        return zsaVarA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String at(acir acirVar) {
        String string;
        String string2 = "null";
        if (acirVar == null) {
            return "null";
        }
        zsa zsaVarA = zsa.a(acirVar);
        if ((acirVar.b & 1) != 0) {
            zsaVarA.b("pano_id", acirVar.c);
        }
        if ((acirVar.b & 2) != 0) {
            acht achtVar = acirVar.d;
            if (achtVar == null) {
                achtVar = acht.a;
            }
            zsaVarA.b("lat_lon", as(achtVar));
        }
        if ((acirVar.b & 4) != 0) {
            zsaVarA.e("search_radius_meters", acirVar.e);
        }
        if ((acirVar.b & 8) != 0) {
            acil acilVarB = acil.b(acirVar.f);
            if (acilVarB == null) {
                acilVarB = acil.UNKNOWN_SEARCH_FILTER;
            }
            zsaVarA.b("search_filter", acilVarB);
        }
        if ((acirVar.b & 16) != 0) {
            zsaVarA.e("link_skip", acirVar.g);
        }
        if ((acirVar.b & 32) != 0) {
            acij acijVar = acirVar.h;
            if (acijVar == null) {
                acijVar = acij.a;
            }
            if (acijVar == null) {
                string = "null";
            } else {
                zsa zsaVarA2 = zsa.a(acijVar);
                if ((acijVar.b & 1) != 0) {
                    zsaVarA2.g("needs_link_street_range", acijVar.c);
                }
                if ((acijVar.b & 2) != 0) {
                    zsaVarA2.g("fetch_depth_map", acijVar.d);
                }
                if ((acijVar.b & 4) != 0) {
                    zsaVarA2.g("fetch_pano_map", acijVar.e);
                }
                string = zsaVarA2.toString();
            }
            zsaVarA.b("Metadata", string);
        }
        if ((acirVar.b & 64) != 0) {
            acim acimVar = acirVar.i;
            if (acimVar == null) {
                acimVar = acim.a;
            }
            zsaVarA.b("SuperTile", acimVar);
        }
        if ((acirVar.b & 128) != 0) {
            aciq aciqVar = acirVar.j;
            if (aciqVar == null) {
                aciqVar = aciq.a;
            }
            if (aciqVar != null) {
                zsa zsaVarA3 = zsa.a(aciqVar);
                acho achoVar = aciqVar.c;
                if (achoVar == null) {
                    achoVar = acho.a;
                }
                if (achoVar != null) {
                    zsa zsaVarA4 = zsa.a(achoVar);
                    if ((achoVar.b & 1) != 0) {
                        zsaVarA4.e("max_image_width", achoVar.c);
                    }
                    if ((achoVar.b & 2) != 0) {
                        zsaVarA4.e("max_image_height", achoVar.d);
                    }
                    if ((achoVar.b & 4) != 0) {
                        zsaVarA4.e("available_image_memory", achoVar.e);
                    }
                    for (int i = 0; i < achoVar.f.size(); i++) {
                        String strBp = a.bp(i, "preferred_image_format$");
                        achn achnVarB = achn.b(achoVar.f.e(i));
                        if (achnVarB == null) {
                            achnVarB = achn.PNG;
                        }
                        zsaVarA4.b(strBp, achnVarB);
                    }
                    if ((achoVar.b & 8) != 0) {
                        zsaVarA4.g("html_body_only", achoVar.g);
                    }
                    if ((achoVar.b & 16) != 0) {
                        zsaVarA4.g("embed_images", achoVar.h);
                    }
                    string2 = zsaVarA4.toString();
                }
                zsaVarA3.b("client_capabilities", string2);
                zsaVarA3.e("tile_size", aciqVar.d);
                zsaVarA3.e("zoom", aciqVar.e);
                for (int i2 = 0; i2 < aciqVar.f.size(); i2++) {
                    acip acipVar = (acip) aciqVar.f.get(i2);
                    zsa zsaVarA5 = zsa.a(acipVar);
                    zsaVarA5.e("tile_xindex", acipVar.c);
                    zsaVarA5.e("tile_yindex", acipVar.d);
                    if ((acipVar.b & 4) != 0) {
                        acii aciiVarB = acii.b(acipVar.e);
                        if (aciiVarB == null) {
                            aciiVarB = acii.FRONT;
                        }
                        zsaVarA5.b("face", aciiVarB);
                    }
                    zsaVarA3.b(a.bp(i2, "Index$"), zsaVarA5.toString());
                }
                string2 = zsaVarA3.toString();
            }
            zsaVarA.b("Tiles", string2);
        }
        if ((acirVar.b & 256) != 0) {
            acio acioVar = acirVar.k;
            if (acioVar == null) {
                acioVar = acio.a;
            }
            zsa zsaVarA6 = zsa.a(acioVar);
            zsaVarA6.e("width", acioVar.c);
            zsaVarA6.e("height", acioVar.d);
            if ((acioVar.b & 4) != 0) {
                acin acinVarB = acin.b(acioVar.e);
                if (acinVarB == null) {
                    acinVarB = acin.DEFAULT_THUMBNAIL;
                }
                zsaVarA6.b("thumbnail_type", acinVarB);
            }
            zsaVarA.b("Thumbnail", zsaVarA6.toString());
        }
        if ((acirVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            zsaVarA.g("request_signature", acirVar.l);
        }
        if ((acirVar.b & 1024) != 0) {
            zsaVarA.g("is_prefetch", acirVar.m);
        }
        if ((acirVar.b & 2048) != 0) {
            zsaVarA.g("client_side_throttling_supported", acirVar.n);
        }
        if ((acirVar.b & 4096) != 0) {
            zsaVarA.e("cbk_version", acirVar.o);
        }
        for (int i3 = 0; i3 < acirVar.p.size(); i3++) {
            String strBp2 = a.bp(i3, "renderer$");
            acik acikVarB = acik.b(acirVar.p.e(i3));
            if (acikVarB == null) {
                acikVarB = acik.SPHERICAL;
            }
            zsaVarA.b(strBp2, acikVarB);
        }
        return zsaVarA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String au(aciy aciyVar) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5 = "null";
        if (aciyVar == null) {
            return "null";
        }
        zsa zsaVarA = zsa.a(aciyVar);
        if ((aciyVar.b & 1) != 0) {
            zsaVarA.b("pano_id", aciyVar.c);
        }
        if ((aciyVar.b & 2) != 0) {
            acih acihVar = aciyVar.d;
            if (acihVar == null) {
                acihVar = acih.a;
            }
            if (acihVar == null) {
                string4 = "null";
            } else {
                zsa zsaVarA2 = zsa.a(acihVar);
                acia aciaVar = acihVar.c;
                if (aciaVar == null) {
                    aciaVar = acia.a;
                }
                if (aciaVar == null) {
                    string = "null";
                } else {
                    zsa zsaVarA3 = zsa.a(aciaVar);
                    zsaVarA3.b("pano_id", aciaVar.j);
                    zsaVarA3.e("image_width", aciaVar.f);
                    zsaVarA3.e("image_height", aciaVar.g);
                    acht achtVar = aciaVar.l;
                    if (achtVar == null) {
                        achtVar = acht.a;
                    }
                    zsaVarA3.b("lat_lon", as(achtVar));
                    zsaVarA3.e("max_zoom_level", aciaVar.p);
                    zsaVarA3.e("radius", aciaVar.q);
                    if ((aciaVar.b & 1) != 0) {
                        zsaVarA3.g("disabled", aciaVar.c);
                    }
                    if ((aciaVar.b & 2) != 0) {
                        zsaVarA3.e("info_level ", aciaVar.d);
                    }
                    if ((aciaVar.b & 4) != 0) {
                        zsaVarA3.e("info_value", aciaVar.e);
                    }
                    if ((aciaVar.b & 32) != 0) {
                        zsaVarA3.e("tile_width", aciaVar.h);
                    }
                    if ((aciaVar.b & 64) != 0) {
                        zsaVarA3.e("tile_height", aciaVar.i);
                    }
                    if ((aciaVar.b & 256) != 0) {
                        zsaVarA3.e("num_zoom_levels", aciaVar.k);
                    }
                    if ((aciaVar.b & 1024) != 0) {
                        zsaVarA3.b("copyright", aciaVar.m);
                    }
                    if ((aciaVar.b & 2048) != 0) {
                        zsaVarA3.b("text", aciaVar.n);
                    }
                    if ((aciaVar.b & 4096) != 0) {
                        zsaVarA3.b("street_range", aciaVar.o);
                    }
                    if ((aciaVar.b & 32768) != 0) {
                        acib acibVarB = acib.b(aciaVar.r);
                        if (acibVarB == null) {
                            acibVarB = acib.GOOGLE;
                        }
                        zsaVarA3.b("image_source", acibVarB);
                    }
                    if ((aciaVar.b & 65536) != 0) {
                        acig acigVarB = acig.b(aciaVar.s);
                        if (acigVarB == null) {
                            acigVarB = acig.OUTDOOR;
                        }
                        zsaVarA3.b("scene", acigVarB);
                    }
                    string = zsaVarA3.toString();
                }
                zsaVarA2.b("DataProperties", string);
                acie acieVar = acihVar.d;
                if (acieVar == null) {
                    acieVar = acie.a;
                }
                if (acieVar == null) {
                    string2 = "null";
                } else {
                    zsa zsaVarA4 = zsa.a(acieVar);
                    if ((acieVar.b & 1) != 0) {
                        zsaVarA4.c("pano_yaw_degree", aahr.b(acieVar.c));
                    }
                    if ((acieVar.b & 2) != 0) {
                        zsaVarA4.c("tilt_yaw_degree", aahr.b(acieVar.d));
                    }
                    if ((acieVar.b & 4) != 0) {
                        zsaVarA4.c("tilt_pitch_degree", aahr.b(acieVar.e));
                    }
                    if ((acieVar.b & 8) != 0) {
                        zsaVarA4.c("camera_pitch_degree", aahr.b(acieVar.f));
                    }
                    if ((acieVar.b & 16) != 0) {
                        acif acifVarB = acif.b(acieVar.g);
                        if (acifVarB == null) {
                            acifVarB = acif.SPHERICAL;
                        }
                        zsaVarA4.b("projection_type", acifVarB);
                    }
                    if ((acieVar.b & 32) != 0) {
                        zsaVarA4.c("horizontal_fov", aahr.b(acieVar.h));
                    }
                    if ((acieVar.b & 64) != 0) {
                        zsaVarA4.c("min_visible_pitch", aahr.b(acieVar.i));
                    }
                    if ((acieVar.b & 128) != 0) {
                        zsaVarA4.c("max_visible_pitch", aahr.b(acieVar.j));
                    }
                    string2 = zsaVarA4.toString();
                }
                zsaVarA2.b("ProjectionProperties", string2);
                achz achzVar = acihVar.e;
                if (achzVar == null) {
                    achzVar = achz.a;
                }
                if (achzVar == null) {
                    string3 = "null";
                } else {
                    zsa zsaVarA5 = zsa.a(achzVar);
                    if ((achzVar.b & 1) != 0) {
                        zsaVarA5.c("horizon_height_fraction", aahr.b(achzVar.c));
                    }
                    if ((achzVar.b & 2) != 0) {
                        zsaVarA5.c("annotation_height_fraction", aahr.b(achzVar.d));
                    }
                    for (int i = 0; i < achzVar.e.size(); i++) {
                        achy achyVar = (achy) achzVar.e.get(i);
                        zsa zsaVarA6 = zsa.a(achyVar);
                        zsaVarA6.b("pano_if", achyVar.d);
                        if ((achyVar.b & 1) != 0) {
                            zsaVarA6.c("yaw_degree", aahr.b(achyVar.c));
                        }
                        if ((achyVar.b & 4) != 0) {
                            zsaVarA6.e("road_argb", achyVar.e);
                        }
                        if ((achyVar.b & 8) != 0) {
                            zsaVarA6.b("link_text", achyVar.f);
                        }
                        if ((achyVar.b & 16) != 0) {
                            zsaVarA6.b("link_street_range", achyVar.g);
                        }
                        if ((achyVar.b & 32) != 0) {
                            acig acigVarB2 = acig.b(achyVar.h);
                            if (acigVarB2 == null) {
                                acigVarB2 = acig.OUTDOOR;
                            }
                            zsaVarA6.b("scene", acigVarB2);
                        }
                        zsaVarA5.b(a.bp(i, "Link$"), zsaVarA6.toString());
                    }
                    string3 = zsaVarA5.toString();
                }
                zsaVarA2.b("AnnotationProperties", string3);
                for (int i2 = 0; i2 < acihVar.f.size(); i2++) {
                    acic acicVar = (acic) acihVar.f.get(i2);
                    zsa zsaVarA7 = zsa.a(acicVar);
                    if ((acicVar.b & 1) != 0) {
                        zsaVarA7.b("pano_id", acicVar.c);
                    }
                    if ((acicVar.b & 2) != 0) {
                        zsaVarA7.b("level_id", acicVar.d);
                    }
                    if ((acicVar.b & 4) != 0) {
                        zsaVarA7.d("ordinal", acicVar.e);
                    }
                    if ((acicVar.b & 8) != 0) {
                        zsaVarA7.b("text", acicVar.f);
                    }
                    if ((acicVar.b & 16) != 0) {
                        zsaVarA7.b("abbreviation", acicVar.g);
                    }
                    zsaVarA2.b(a.bp(i2, "Level$"), zsaVarA7.toString());
                }
                if ((acihVar.b & 8) != 0) {
                    acid acidVar = acihVar.g;
                    if (acidVar == null) {
                        acidVar = acid.a;
                    }
                    zsa zsaVarA8 = zsa.a(acidVar);
                    if ((acidVar.b & 1) != 0) {
                        zsaVarA8.e("#depth_map", acidVar.c.D().length);
                    }
                    if ((acidVar.b & 2) != 0) {
                        zsaVarA8.e("#pano_map", acidVar.d.D().length);
                    }
                    zsaVarA2.b("Model", zsaVarA8.toString());
                }
                string4 = zsaVarA2.toString();
            }
            zsaVarA.b("metadata", string4);
        }
        if ((aciyVar.b & 4) != 0) {
            aciu aciuVar = aciyVar.e;
            if (aciuVar == null) {
                aciuVar = aciu.a;
            }
            zsaVarA.e("#super_tile_data", aciuVar.b.D().length);
        }
        if ((aciyVar.b & 8) != 0) {
            acix acixVar = aciyVar.f;
            if (acixVar == null) {
                acixVar = acix.a;
            }
            if (acixVar != null) {
                zsa zsaVarA9 = zsa.a(acixVar);
                zsaVarA9.e("zoom", acixVar.b);
                zsaVarA9.e("num_horizontal_tiles", acixVar.c);
                zsaVarA9.e("num_vertical_tiles", acixVar.d);
                for (int i3 = 0; i3 < acixVar.e.size(); i3++) {
                    aciw aciwVar = (aciw) acixVar.e.get(i3);
                    zsa zsaVarA10 = zsa.a(aciwVar);
                    zsaVarA10.e("tile_xindex", aciwVar.c);
                    zsaVarA10.e("tile_yindex", aciwVar.d);
                    zsaVarA10.e("#tile_data", aciwVar.f.D().length);
                    if ((aciwVar.b & 4) != 0) {
                        acis acisVarB = acis.b(aciwVar.e);
                        if (acisVarB == null) {
                            acisVarB = acis.FRONT;
                        }
                        zsaVarA10.b("face", acisVarB);
                    }
                    zsaVarA9.b(a.bp(i3, "Tile$"), zsaVarA10.toString());
                }
                string5 = zsaVarA9.toString();
            }
            zsaVarA.b("tiles", string5);
        }
        if ((aciyVar.b & 16) != 0) {
            aciv acivVar = aciyVar.g;
            if (acivVar == null) {
                acivVar = aciv.a;
            }
            zsa zsaVarA11 = zsa.a(acivVar);
            zsaVarA11.e("width", acivVar.b);
            zsaVarA11.e("height", acivVar.c);
            zsaVarA11.e("#thumbnail_data", acivVar.d.D().length);
            zsaVarA.b("Thumbnail", zsaVarA11.toString());
        }
        if ((aciyVar.b & 32) != 0) {
            acit acitVar = aciyVar.h;
            if (acitVar == null) {
                acitVar = acit.a;
            }
            zsa zsaVarA12 = zsa.a(acitVar);
            zsaVarA12.e("width", acitVar.b);
            zsaVarA12.e("height", acitVar.c);
            zsaVarA12.e("#image_data", acitVar.d.D().length);
            zsaVarA.b("NavigationImage", zsaVarA12.toString());
        }
        if ((aciyVar.b & 64) != 0) {
            zsaVarA.b("signature", aciyVar.i);
        }
        if ((aciyVar.b & 128) != 0) {
            zsaVarA.g("throttled", aciyVar.j);
        }
        return zsaVarA.toString();
    }

    public static synchronized aabn av() {
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Collection] */
    public static yvv aw(aacq aacqVar, String str) {
        abnp abnpVarN = yvp.a.n();
        ?? r7 = aacqVar.a;
        ackh ackhVar = (ackh) r7.get(str);
        boolean z = false;
        if (ackhVar != null) {
            yfq yfqVarO = yfq.o(ackhVar.b.values());
            int size = yfqVarO.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                boolean z2 = ((zwg) yfqVarO.get(i)).c;
                i++;
                if (z2) {
                    z = true;
                    break;
                }
            }
        }
        abnpVarN.t();
        yvp yvpVar = (yvp) abnpVarN.b;
        yvpVar.b = 1 | yvpVar.b;
        yvpVar.c = z;
        ackh ackhVar2 = (ackh) r7.get(str);
        Iterable iterableN = ackhVar2 == null ? yly.a : ygr.n(ackhVar2.a);
        abnpVarN.t();
        yvp yvpVar2 = (yvp) abnpVarN.b;
        abod abodVar = yvpVar2.e;
        if (!abodVar.c()) {
            yvpVar2.e = abnv.G(abodVar);
        }
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            yvpVar2.e.g(((yvo) it.next()).k);
        }
        abnp abnpVarN2 = yvv.a.n();
        abnpVarN2.t();
        yvv yvvVar = (yvv) abnpVarN2.b;
        yvp yvpVar3 = (yvp) abnpVarN.q();
        yvpVar3.getClass();
        yvvVar.c = yvpVar3;
        yvvVar.b = 5;
        return (yvv) abnpVarN2.q();
    }

    public static synchronized aabn ax(gjt gjtVar, aabc aabcVar, zxh zxhVar) {
        if (b == null) {
            az(gjtVar, aabcVar, zxhVar);
        }
        return b;
    }

    private static int ay(int i) {
        int iBinarySearch = Arrays.binarySearch(abpk.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [ackk, java.lang.Object] */
    private static synchronized void az(gjt gjtVar, aabc aabcVar, zxh zxhVar) {
        zrr zrrVar = zrr.a;
        StrictMode.ThreadPolicy threadPolicyC = zrrVar.c();
        ajds ajdsVar = new ajds(gjtVar, aabcVar, zxhVar);
        acku ackuVar = aabe.a;
        aabn aabnVar = new aabn(ajdsVar);
        a = aabnVar;
        b = aabnVar;
        if (addm.a.gu().g()) {
            zrn.a(4, "MapGlobalStatePhoenix initializing Flogger", new Object[0]);
            Object obj = gjtVar.a;
            zwh zwhVar = new zwh();
            zwhVar.b = (byte) (zwhVar.b | 1);
            zwhVar.b(false);
            zwhVar.b = (byte) (zwhVar.b | 28);
            zwhVar.b(true);
            if (zwhVar.b != 31) {
                throw new IllegalStateException();
            }
            uyu uyuVar = new uyu(zwhVar.a);
            AtomicBoolean atomicBoolean = uyv.a;
            xxh xxhVarH = xxh.h(obj);
            if (!uyv.a.getAndSet(true)) {
                int i = uyr.a;
                ackr ackrVarB = acks.b(uyuVar);
                acku ackuVarC = ackq.c(new uqa(new uyq(ackw.b(new uqa(ackrVarB, 13)), 0), 12));
                acks.b(xxhVarH);
                aacq aacqVar = (aacq) ackq.c(new uqa(ackw.b(new uza(ackrVarB, ackuVarC, 1)), 11)).a();
                if (!((AtomicBoolean) aacqVar.a).getAndSet(true)) {
                    yqt yqtVar = (yqt) aacqVar.b.a();
                    yqu.b();
                    yqu.a(yqtVar);
                    yqz.a.c();
                }
            }
        }
        zrrVar.d(threadPolicyC);
    }

    public static void b(float f, float[] fArr) {
        float f2 = f + f;
        if (f <= 0.5f) {
            fArr[0] = 1.0f - f2;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = f2 - 1.0f;
        }
    }

    public static double c(int i, double d, Map map) {
        Integer numValueOf = Integer.valueOf(i);
        if (map.get(numValueOf) == null) {
            map.put(numValueOf, Double.valueOf(wnh.a(d, 200.0d, i).b));
        }
        return ((Double) map.get(numValueOf)).doubleValue();
    }

    public static boolean d(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static RectF e(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.w || !(view instanceof wwi)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        wwi wwiVar = (wwi) view;
        View[] viewArr = {wwiVar.a, wwiVar.b, wwiVar.c};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view2.getLeft()) : view2.getLeft();
                iMax = z ? Math.max(iMax, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i2 = iMax - iMin;
        View[] viewArr2 = {wwiVar.a, wwiVar.b, wwiVar.c};
        int iMax2 = 0;
        int iMin2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                iMin2 = z2 ? Math.min(iMin2, view3.getTop()) : view3.getTop();
                iMax2 = z2 ? Math.max(iMax2, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i4 = iMax2 - iMin2;
        int iE = (int) woy.E(wwiVar.getContext(), 24);
        if (i2 < iE) {
            i2 = iE;
        }
        int left = (wwiVar.getLeft() + wwiVar.getRight()) / 2;
        int top = (wwiVar.getTop() + wwiVar.getBottom()) / 2;
        int i5 = i2 / 2;
        return new RectF(left - i5, top - (i4 / 2), left + i5, (left / 2) + top);
    }

    public static boolean g(float f, float f2) {
        return Math.abs(f) > Math.abs(f2);
    }

    public static double h(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    public static double[] i(int i) {
        double[][] dArr = wng.a;
        double dV = a.v((i >> 16) & 255);
        double dV2 = a.v((i >> 8) & 255);
        double dV3 = a.v(i & 255);
        double[][] dArr2 = wng.a;
        double[] dArr3 = dArr2[0];
        double d = dArr3[0] * dV;
        double d2 = dArr3[1] * dV2;
        double d3 = dArr3[2] * dV3;
        double[] dArr4 = dArr2[1];
        double d4 = dArr4[0] * dV;
        double d5 = dArr4[1] * dV2;
        double d6 = dArr4[2] * dV3;
        double[] dArr5 = dArr2[2];
        double d7 = dArr5[0] * dV;
        double d8 = dArr5[1] * dV2;
        double d9 = dArr5[2] * dV3;
        double[] dArr6 = wng.c;
        double d10 = ((d + d2) + d3) / dArr6[0];
        double d11 = ((d4 + d5) + d6) / dArr6[1];
        double d12 = ((d7 + d8) + d9) / dArr6[2];
        double dT = a.t(d10);
        double dT2 = a.t(d11);
        double[] dArr7 = {(116.0d * dT2) - 16.0d, (dT - dT2) * 500.0d, (dT2 - a.t(d12)) * 200.0d};
        return new double[]{dArr7[0], dArr7[1], dArr7[2]};
    }

    public static int j(acab acabVar, int[] iArr) {
        int i = acabVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acabVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acabVar.f;
        int i7 = iArr[i5 + i6];
        int i8 = acabVar.e;
        int i9 = i7 - iArr[i5 + i8];
        int i10 = acabVar.c;
        int i11 = i10 << 5;
        int i12 = i2 + i11 + i10;
        int i13 = (i9 - iArr[i12 + i6]) + iArr[i12 + i8];
        int i14 = acabVar.a;
        int i15 = (i14 << 10) + (i14 << 6) + i14;
        int i16 = i4 + i15 + i3;
        int i17 = i15 + i11 + i10;
        return (((i13 - iArr[i16 + i6]) + iArr[i16 + i8]) + iArr[i6 + i17]) - iArr[i17 + i8];
    }

    static int k(acab acabVar, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i - 1;
        if (i4 == 0) {
            int i5 = acabVar.a;
            int i6 = acabVar.d;
            int i7 = acabVar.f;
            int i8 = (i5 << 10) + (i5 << 6) + i5;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = -iArr[i9 + i7];
            int i11 = acabVar.e;
            int i12 = i10 + iArr[i9 + i11];
            int i13 = acabVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i2 = i12 + iArr[i7 + i14];
            i3 = iArr[i14 + i11];
        } else if (i4 != 1) {
            int i15 = acabVar.b;
            int i16 = acabVar.d;
            int i17 = acabVar.e;
            int i18 = i16 << 5;
            int i19 = (i15 << 10) + (i15 << 6) + i15;
            int i20 = -iArr[i19 + i18 + i16 + i17];
            int i21 = acabVar.c;
            int i22 = i21 << 5;
            int i23 = i20 + iArr[i19 + i22 + i21 + i17];
            int i24 = acabVar.a;
            int i25 = (i24 << 10) + (i24 << 6) + i24;
            i2 = i23 + iArr[i18 + i25 + i16 + i17];
            i3 = iArr[i25 + i22 + i21 + i17];
        } else {
            int i26 = acabVar.b;
            int i27 = acabVar.c;
            int i28 = acabVar.f;
            int i29 = i27 << 5;
            int i30 = (i26 << 10) + (i26 << 6) + i26 + i29 + i27;
            int i31 = -iArr[i30 + i28];
            int i32 = acabVar.e;
            int i33 = i31 + iArr[i30 + i32];
            int i34 = acabVar.a;
            int i35 = (i34 << 10) + (i34 << 6) + i34 + i29 + i27;
            i2 = i33 + iArr[i28 + i35];
            i3 = iArr[i35 + i32];
        }
        return i2 - i3;
    }

    static int l(acab acabVar, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        if (i5 == 0) {
            int i6 = acabVar.d;
            int i7 = acabVar.f;
            int i8 = (i2 << 10) + (i2 << 6) + i2;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = iArr[i9 + i7];
            int i11 = acabVar.e;
            int i12 = i10 - iArr[i9 + i11];
            int i13 = acabVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i3 = i12 - iArr[i7 + i14];
            i4 = iArr[i14 + i11];
        } else if (i5 != 1) {
            int i15 = acabVar.b;
            int i16 = acabVar.d;
            int i17 = i16 << 5;
            int i18 = (i15 << 10) + (i15 << 6) + i15;
            int i19 = iArr[i18 + i17 + i16 + i2];
            int i20 = acabVar.c;
            int i21 = i20 << 5;
            int i22 = i19 - iArr[((i18 + i21) + i20) + i2];
            int i23 = acabVar.a;
            int i24 = (i23 << 10) + (i23 << 6) + i23;
            i3 = i22 - iArr[((i17 + i24) + i16) + i2];
            i4 = iArr[i24 + i21 + i20 + i2];
        } else {
            int i25 = acabVar.b;
            int i26 = acabVar.f;
            int i27 = i2 << 5;
            int i28 = (i25 << 10) + (i25 << 6) + i25 + i27 + i2;
            int i29 = iArr[i28 + i26];
            int i30 = acabVar.e;
            int i31 = i29 - iArr[i28 + i30];
            int i32 = acabVar.a;
            int i33 = (i32 << 10) + (i32 << 6) + i32 + i27 + i2;
            i3 = i31 - iArr[i26 + i33];
            i4 = iArr[i33 + i30];
        }
        return i3 + i4;
    }

    public static acac m(acab acabVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        acab acabVar2 = acabVar;
        int i8 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int iK = k(acabVar2, i8, iArr6);
        int iK2 = k(acabVar2, i8, iArr3);
        int iK3 = k(acabVar2, i8, iArr4);
        int iK4 = k(acabVar2, i8, iArr5);
        double d = 0.0d;
        int i9 = -1;
        int i10 = i2;
        while (i10 < i3) {
            int iL = l(acabVar2, i8, i10, iArr6) + iK;
            int iL2 = iK2 + l(acabVar2, i8, i10, iArr3);
            int iL3 = iK3 + l(acabVar2, i8, i10, iArr4);
            int iL4 = iK4 + l(acabVar2, i8, i10, iArr5);
            if (iL4 != 0) {
                int i11 = iL * iL;
                int i12 = iL2 * iL2;
                int i13 = iL3 * iL3;
                int i14 = i4 - iL;
                int i15 = i5 - iL2;
                int i16 = i6 - iL3;
                int i17 = i7 - iL4;
                if (i17 != 0) {
                    double d2 = (((i11 + i12) + i13) / iL4) + ((((i14 * i14) + (i15 * i15)) + (i16 * i16)) / i17);
                    if (d2 > d) {
                        d = d2;
                        i9 = i10;
                    }
                }
            }
            i10++;
            acabVar2 = acabVar;
            i8 = i;
            iArr5 = iArr;
            iArr6 = iArr2;
        }
        return new acac(i9, d);
    }

    public static double n(acab acabVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double[] dArr) {
        int iJ = j(acabVar, iArr2);
        int iJ2 = j(acabVar, iArr3);
        int iJ3 = j(acabVar, iArr4);
        int i = acabVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acabVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acabVar.f;
        double d = dArr[i5 + i6];
        int i7 = acabVar.e;
        double d2 = d - dArr[i5 + i7];
        int i8 = acabVar.c;
        int i9 = i8 << 5;
        int i10 = i2 + i9 + i8;
        double d3 = (d2 - dArr[i10 + i6]) + dArr[i10 + i7];
        int i11 = acabVar.a;
        int i12 = (i11 << 10) + (i11 << 6) + i11;
        int i13 = i4 + i12 + i3;
        int i14 = i12 + i9 + i8;
        return ((((d3 - dArr[i13 + i6]) + dArr[i13 + i7]) + dArr[i6 + i14]) - dArr[i14 + i7]) - ((((iJ * iJ) + (iJ2 * iJ2)) + (iJ3 * iJ3)) / j(acabVar, iArr));
    }

    public static int o(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static void p(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q(int r7, defpackage.abyn r8, com.google.android.libraries.surveys.internal.model.Answer r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wox.q(int, abyn, com.google.android.libraries.surveys.internal.model.Answer):boolean");
    }

    public static boolean r(boolean z, abyn abynVar, Answer answer) {
        wox woxVar = wia.c;
        Context context = wia.b;
        return wia.b(true) && z && !q(0, abynVar, answer);
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? "CONNECTION_REJECTION_REASON_INVALID_SETUP_TOKEN" : "CONNECTION_REJECTION_REASON_MOBILE_DEVICE_ID_NOT_FOUND" : "CONNECTION_REJECTION_REASON_UNKNOWN";
    }

    public static /* synthetic */ xoe t(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (xoe) abnvVarN;
    }

    public static void u(int i, abnp abnpVar) {
        abnpVar.t();
        xoe xoeVar = (xoe) abnpVar.b;
        xoe xoeVar2 = xoe.a;
        xoeVar.b |= 8;
        xoeVar.f = i;
    }

    public static void v(xgi xgiVar, abnp abnpVar) {
        abnpVar.t();
        xoe xoeVar = (xoe) abnpVar.b;
        xoe xoeVar2 = xoe.a;
        xoeVar.c = xgiVar;
        xoeVar.b |= 1;
    }

    public static void w(String str, abnp abnpVar) {
        abnpVar.t();
        xoe xoeVar = (xoe) abnpVar.b;
        xoe xoeVar2 = xoe.a;
        xoeVar.b |= 4;
        xoeVar.e = str;
    }

    public static void x(xkr xkrVar, abnp abnpVar) {
        abnpVar.t();
        xoe xoeVar = (xoe) abnpVar.b;
        xoe xoeVar2 = xoe.a;
        xoeVar.d = xkrVar.I;
        xoeVar.b |= 2;
    }

    public static /* synthetic */ xgo y(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (xgo) abnvVarN;
    }

    public void f(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFE = e(tabLayout, view);
        RectF rectFE2 = e(tabLayout, view2);
        drawable.setBounds(wkn.b((int) rectFE.left, (int) rectFE2.left, f), drawable.getBounds().top, wkn.b((int) rectFE.right, (int) rectFE2.right, f), drawable.getBounds().bottom);
    }

    public wox(byte[] bArr) {
    }

    private wox() {
    }
}
