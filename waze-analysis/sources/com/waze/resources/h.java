package com.waze.resources;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.waze.R;
import com.waze.alerters.a.k;
import com.waze.asks.as;
import com.waze.reports_v2.b.ab;
import com.waze.reports_v2.b.ac;
import com.waze.reports_v2.b.ad;
import com.waze.reports_v2.b.ae;
import com.waze.reports_v2.b.at;
import com.waze.reports_v2.b.q;
import com.waze.reports_v2.b.s;
import com.waze.reports_v2.c.aq;
import com.waze.reports_v2.c.ar;
import com.waze.reports_v2.c.ck;
import com.waze.reports_v2.c.cl;
import com.waze.reports_v2.c.dm;
import com.waze.reports_v2.c.dn;
import h.g.b.x;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l.a.bny;
import l.a.boa;
import l.a.bob;
import l.a.bro;
import l.a.brp;
import l.a.brq;
import l.a.brs;
import l.a.brt;
import l.a.bry;
import l.a.brz;
import l.a.xp;
import l.a.yk;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.nio.channels.FileChannel] */
    static void a(String str, String str2) throws Throwable {
        Throwable th;
        FileChannel fileChannel;
        IOException iOException;
        FileNotFoundException fileNotFoundException;
        FileChannel fileChannel2;
        FileChannel fileChannel3;
        FileChannel fileChannel4;
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            Log.e("CopyDir", "Source does not exist!");
            return;
        }
        ?? IsDirectory = file.isDirectory();
        if (IsDirectory != 0) {
            file2.mkdirs();
            String[] list = file.list();
            if (list != null) {
                for (String str3 : list) {
                    a(str + DomExceptionUtils.SEPARATOR + str3, str2 + DomExceptionUtils.SEPARATOR + str3);
                }
                return;
            }
            return;
        }
        FileChannel fileChannel5 = null;
        try {
            try {
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(str).getChannel());
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary2 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(str2).getChannel());
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary2.transferFrom(fileChannelConvertMaybeLegacyFileChannelFromLibrary, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary2 != null) {
                            fileChannelConvertMaybeLegacyFileChannelFromLibrary2.close();
                        }
                    } catch (FileNotFoundException e3) {
                        fileNotFoundException = e3;
                        fileChannel4 = fileChannelConvertMaybeLegacyFileChannelFromLibrary2;
                        fileChannel5 = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                        IsDirectory = fileChannel4;
                        Log.i("CopyFile", "File not found " + fileNotFoundException.getMessage());
                        fileNotFoundException.printStackTrace();
                        if (fileChannel5 != null) {
                            try {
                                fileChannel5.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (IsDirectory != 0) {
                            IsDirectory.close();
                        }
                    } catch (IOException e5) {
                        iOException = e5;
                        fileChannel3 = fileChannelConvertMaybeLegacyFileChannelFromLibrary2;
                        fileChannel5 = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                        IsDirectory = fileChannel3;
                        Log.i("CopyFile", "Transfer data error " + iOException.getMessage());
                        iOException.printStackTrace();
                        if (fileChannel5 != null) {
                            try {
                                fileChannel5.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                return;
                            }
                        }
                        if (IsDirectory != 0) {
                            IsDirectory.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel2 = fileChannelConvertMaybeLegacyFileChannelFromLibrary2;
                        fileChannel5 = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                        fileChannel = fileChannel2;
                        if (fileChannel5 != null) {
                            try {
                                fileChannel5.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                throw th;
                            }
                        }
                        if (fileChannel == null) {
                            throw th;
                        }
                        fileChannel.close();
                        throw th;
                    }
                } catch (FileNotFoundException e8) {
                    fileNotFoundException = e8;
                    fileChannel4 = null;
                } catch (IOException e9) {
                    iOException = e9;
                    fileChannel3 = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileChannel = IsDirectory;
            }
        } catch (FileNotFoundException e10) {
            fileNotFoundException = e10;
            IsDirectory = 0;
        } catch (IOException e11) {
            iOException = e11;
            IsDirectory = 0;
        } catch (Throwable th5) {
            th = th5;
            fileChannel = null;
        }
    }

    static void b(String str) {
        c(str, false, null);
    }

    static void c(String str, boolean z, g[] gVarArr) {
        ArrayList arrayList = gVarArr != null ? new ArrayList(Arrays.asList(gVarArr)) : null;
        File file = new File(str);
        if (!z) {
            q(file, arrayList);
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                q(file2, arrayList);
            }
        }
    }

    public static final String d(Context context) {
        x.f(context, "context");
        return String.valueOf(context.getFilesDir().getParent()).concat("/waze/");
    }

    public static final String e(Context context, String str) {
        x.f(context, "context");
        x.f(str, "fileName");
        return d(context) + "sound/common/" + str + ".mp3";
    }

    public static final String f(Context context) {
        x.f(context, "context");
        return d(context).concat("skins/default/");
    }

    public static final int g(String str) {
        x.f(str, "aResName");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            Field field = R.drawable.class.getField(str);
            x.e(field, "getField(...)");
            return field.getInt(null);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Error generating resource id for resource: ".concat(String.valueOf(str)), e2);
            return 0;
        }
    }

    public static final /* synthetic */ xp h(ab abVar) {
        ac acVar = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar2 = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        int iOrdinal = abVar.ordinal();
        if (iOrdinal == 0) {
            return xp.GAMING_REWARD_SOURCE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return xp.REPORT;
        }
        if (iOrdinal == 2) {
            return xp.FEEDBACK;
        }
        throw new h.i();
    }

    public static final /* synthetic */ yk i(ac acVar) {
        ac acVar2 = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        int iOrdinal = acVar.ordinal();
        if (iOrdinal == 0) {
            return yk.GENDER_MALE;
        }
        if (iOrdinal == 1) {
            return yk.GENDER_FEMALE;
        }
        throw new h.i();
    }

    public static final /* synthetic */ bny j(com.waze.reports_v2.d.h hVar) {
        ac acVar = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar2 = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            return bny.LEVEL_1;
        }
        if (iOrdinal == 1) {
            return bny.LEVEL_2;
        }
        throw new h.i();
    }

    public static final /* synthetic */ boa l(cl clVar) {
        if (clVar.a() == null) {
            return clVar.b() != null ? r(clVar.b()) : boa.UGC_SUBTYPE_UNSPECIFIED;
        }
        ae aeVarA = clVar.a();
        ac acVar = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        switch (aeVarA.ordinal()) {
            case 0:
                return boa.MAP_CHAT_DEFAULT;
            case 1:
                return boa.CLOSURE_DEFAULT;
            case 2:
                return boa.CLOSURE_HAZARD;
            case 3:
                return boa.CLOSURE_CONSTRUCTION;
            case 4:
                return boa.CLOSURE_EVENT;
            case 5:
                return boa.MAP_ISSUE_DEFAULT;
            case 6:
                return boa.MAP_ISSUE_ISSUE;
            case 7:
                return boa.ROADSIDE_HELP_DEFAULT;
            case 8:
                return boa.ROADSIDE_HELP_EMPTY_TANK;
            case 9:
                return boa.ROADSIDE_HELP_FLAT_TIRE;
            case 10:
                return boa.ROADSIDE_HELP_BATTERY_ISSUE;
            case 11:
                return boa.ROADSIDE_HELP_MEDICAL_ISSUE;
            default:
                throw new h.i();
        }
    }

    public static final /* synthetic */ bob n(ck ckVar) {
        if (ckVar.a() != null) {
            return s(ckVar.a());
        }
        if (ckVar.b() == null) {
            return bob.UGC_TYPE_UNSPECIFIED;
        }
        ad adVarB = ckVar.b();
        ac acVar = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        switch (adVarB.ordinal()) {
            case 0:
                return bob.MAP_ISSUE;
            case 1:
                return bob.ROADSIDE_HELP;
            case 2:
                return bob.GAS;
            case 3:
                return bob.CLOSURE;
            case 4:
                return bob.MAP_CHAT;
            case 5:
                return bob.DEBUG;
            case 6:
                return bob.ADD_PLACE;
            default:
                throw new h.i();
        }
    }

    public static final /* synthetic */ brz p(as asVar) {
        brp brpVar;
        bro broVarNewBuilder = brz.newBuilder();
        broVarNewBuilder.f(asVar.g());
        broVarNewBuilder.g(bry.ENRICH_ALERT);
        broVarNewBuilder.b(asVar.a());
        com.waze.asks.e eVarC = asVar.c();
        ac acVar = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        int iOrdinal = eVarC.ordinal();
        if (iOrdinal == 0) {
            brpVar = brp.ENRICH_ALERT_WHAT_DO_YOU_SEE;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            brpVar = brp.ENRICH_CONSTRUCTION_ALERT_ARE_LANES_BLOCKED;
        }
        broVarNewBuilder.e(brpVar);
        broVarNewBuilder.d(k.b(asVar.b()));
        Iterator it = asVar.h().iterator();
        while (it.hasNext()) {
            broVarNewBuilder.a(t((com.waze.asks.d) it.next()));
        }
        brz brzVarBuild = broVarNewBuilder.build();
        x.e(brzVarBuild, "build(...)");
        return brzVarBuild;
    }

    private static void q(File file, ArrayList arrayList) {
        File[] fileArrListFiles;
        try {
            if (!file.exists()) {
                Log.e("Delete", "Source does not exist! " + file.getAbsolutePath());
                return;
            }
            String name = file.getName();
            if (arrayList == null || arrayList.indexOf(new g(name, 4, 0)) == -1) {
                if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        q(file2, arrayList);
                    }
                }
                file.delete();
            }
        } catch (Exception e2) {
            Log.e("Delete", "Delete failed for: " + file.getAbsolutePath() + " " + e2.getMessage());
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boa r(at atVar) {
        ac acVar = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        switch (atVar.ordinal()) {
            case 0:
                return boa.TRAFFIC_DEFAULT;
            case 1:
                return boa.TRAFFIC_STANDSTILL;
            case 2:
                return boa.POLICE_DEFAULT;
            case 3:
                return boa.POLICE_HIDDEN;
            case 4:
                return boa.POLICE_MOBILE_CAMERA;
            case 5:
                return boa.POLICE_OTHER_SIDE;
            case 6:
                return boa.CRASH_DEFAULT;
            case 7:
                return boa.CRASH_PILE_UP;
            case 8:
                return boa.CRASH_OTHER_SIDE;
            case 9:
                return boa.HAZARD_DEFAULT;
            case 10:
                return boa.HAZARD_BROKEN_TRAFFIC_LIGHT;
            case 11:
                return boa.HAZARD_POTHOLE;
            case 12:
                return boa.HAZARD_OBJECT_ON_ROAD;
            case 13:
                return boa.HAZARD_VEHICLE_STOPPED;
            case 14:
                return boa.HAZARD_CONSTRUCTION;
            case 15:
                return boa.WEATHER_DEFAULT;
            case 16:
                return boa.WEATHER_FLOOD;
            case 17:
                return boa.WEATHER_SLIPPERY_ROAD;
            case 18:
                return boa.WEATHER_UNPLOWED_ROAD;
            case 19:
                return boa.WEATHER_ICY_ROAD;
            case 20:
                return boa.WEATHER_FOG;
            case 21:
                return boa.BLOCKED_LANE_DEFAULT;
            case 22:
                return boa.BLOCKED_LANE_LEFT;
            case 23:
                return boa.BLOCKED_LANE_CENTER;
            case 24:
                return boa.BLOCKED_LANE_RIGHT;
            case 25:
                return boa.WEATHER_HAIL;
            case 26:
                return boa.HAZARD_ANIMALS;
            case 27:
                return boa.HAZARD_MISSING_SIGN;
            case 28:
                return boa.HAZARD_ROAD_KILL;
            case 29:
                return boa.HAZARD_SHOULDER_VEHICLE_STOPPED;
            case 30:
                return boa.CRASH_MAJOR;
            case 31:
                return boa.CRASH_MINOR;
            case 32:
                return boa.TRAFFIC_MODERATE;
            case 33:
                return boa.TRAFFIC_HEAVY;
            case 34:
                return boa.CLOSURE_DEFAULT;
            case 35:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 36:
                return boa.MAP_ISSUE_INCORRECT_TURN;
            case 37:
                return boa.MAP_ISSUE_INCORRECT_ADDRESS;
            case 38:
                return boa.MAP_ISSUE_INCORRECT_ROUTE;
            case 39:
                return boa.MAP_ISSUE_MISSING_ROUNDABOUT;
            case 40:
                return boa.MAP_ISSUE_MISSING_ROAD;
            case 41:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 42:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 43:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 44:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 45:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 46:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 47:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 48:
                return boa.MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 49:
                return boa.PERSONAL_SAFETY_DEFAULT;
            case 50:
                return boa.ANIMAL_DEFAULT;
            case 51:
                return boa.ANIMAL_IN_LANE;
            case 52:
                return boa.ANIMAL_ON_SHOULDER;
            default:
                throw new h.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bob s(q qVar) {
        ac acVar = ac.f34014a;
        Parcelable.Creator<at> creator = at.CREATOR;
        com.waze.reports_v2.d.a aVar = com.waze.reports_v2.d.a.f34553a;
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34567a;
        com.waze.reports_v2.d.f fVar = com.waze.reports_v2.d.f.f34579a;
        com.waze.reports_v2.d.d dVar = com.waze.reports_v2.d.d.f34563a;
        ae aeVar = ae.f34025a;
        ad adVar = ad.f34017a;
        Parcelable.Creator<q> creator2 = q.CREATOR;
        ab abVar = ab.f34009a;
        com.waze.reports_v2.d.g gVar = com.waze.reports_v2.d.g.f34582a;
        dn dnVar = dn.f34431a;
        com.waze.reports_v2.d.h hVar = com.waze.reports_v2.d.h.f34589a;
        dm dmVar = dm.f34427a;
        s sVar = s.f34126a;
        com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
        ar arVar = ar.f34210a;
        aq aqVar = aq.f34202a;
        switch (qVar.ordinal()) {
            case 0:
                return bob.TRAFFIC;
            case 1:
                return bob.POLICE;
            case 2:
                return bob.CRASH;
            case 3:
                return bob.HAZARD;
            case 4:
                return bob.WEATHER;
            case 5:
                return bob.BLOCKED_LANE;
            case 6:
                return bob.MAP_ISSUE;
            case 7:
                return bob.DEBUG;
            case 8:
                return bob.CLOSURE;
            case 9:
                return bob.PERSONAL_SAFETY;
            case 10:
                return bob.ANIMAL;
            default:
                throw new h.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final brt t(com.waze.asks.d dVar) {
        boolean z = dVar instanceof com.waze.asks.b;
        brs brsVarNewBuilder = brt.newBuilder();
        if (z) {
            brsVarNewBuilder.b(r(((com.waze.asks.b) dVar).b()));
        } else if (dVar instanceof com.waze.asks.c) {
            brsVarNewBuilder.c(brq.VALIDATION_THUMBS_DOWN);
        } else {
            if (!(dVar instanceof com.waze.asks.a)) {
                throw new h.i();
            }
            brsVarNewBuilder.b(r(((com.waze.asks.a) dVar).b()));
        }
        brt brtVarBuild = brsVarNewBuilder.build();
        x.e(brtVarBuild, "build(...)");
        return brtVarBuild;
    }
}
