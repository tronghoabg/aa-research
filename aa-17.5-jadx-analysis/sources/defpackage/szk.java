package defpackage;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class szk {
    private static final yph a = yph.c("NotificationConverter");

    public static final tbe a(MessagingInfo messagingInfo) {
        tbf tbfVar;
        String string;
        messagingInfo.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StatusBarNotification statusBarNotification = messagingInfo.a;
        if (statusBarNotification != null) {
            abnp abnpVarN = tbf.a.n();
            abnpVarN.getClass();
            String packageName = statusBarNotification.getPackageName();
            if (packageName != null) {
                abnpVarN.t();
                tbf tbfVar2 = (tbf) abnpVarN.b;
                tbfVar2.b |= 1;
                tbfVar2.c = packageName;
            }
            long postTime = statusBarNotification.getPostTime();
            abnpVarN.t();
            tbf tbfVar3 = (tbf) abnpVarN.b;
            tbfVar3.b |= 2;
            tbfVar3.d = postTime;
            String key = statusBarNotification.getKey();
            if (key != null) {
                abnpVarN.t();
                tbf tbfVar4 = (tbf) abnpVarN.b;
                tbfVar4.b |= 4;
                tbfVar4.e = key;
            }
            boolean z = (statusBarNotification.getNotification().flags & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0;
            abnpVarN.t();
            tbf tbfVar5 = (tbf) abnpVarN.b;
            tbfVar5.b |= 8;
            tbfVar5.f = z;
            String str = statusBarNotification.getNotification().category;
            if (str != null) {
                abnpVarN.t();
                tbf tbfVar6 = (tbf) abnpVarN.b;
                tbfVar6.b |= 16;
                tbfVar6.g = str;
            }
            String strB = b(linkedHashMap, statusBarNotification.getNotification().getLargeIcon());
            if (strB != null) {
                abnpVarN.t();
                tbf tbfVar7 = (tbf) abnpVarN.b;
                tbfVar7.b |= 32;
                tbfVar7.h = strB;
            }
            String group = statusBarNotification.getNotification().getGroup();
            if (group != null) {
                abnpVarN.t();
                tbf tbfVar8 = (tbf) abnpVarN.b;
                tbfVar8.b |= 64;
                tbfVar8.i = group;
            }
            int groupAlertBehavior = statusBarNotification.getNotification().getGroupAlertBehavior();
            abnpVarN.t();
            tbf tbfVar9 = (tbf) abnpVarN.b;
            tbfVar9.b |= 128;
            tbfVar9.j = groupAlertBehavior;
            byte[] byteArray = statusBarNotification.getNotification().extras.getByteArray("opaque_token");
            if (byteArray != null) {
                abms abmsVarV = abms.v(byteArray);
                abmsVarV.getClass();
                abnpVarN.t();
                tbf tbfVar10 = (tbf) abnpVarN.b;
                tbfVar10.b |= 256;
                tbfVar10.k = abmsVarV;
            }
            String string2 = statusBarNotification.getNotification().extras.getString("grouping_key");
            if (string2 != null) {
                abnpVarN.t();
                tbf tbfVar11 = (tbf) abnpVarN.b;
                tbfVar11.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                tbfVar11.l = string2;
            }
            dtm dtmVarF = dtm.f(statusBarNotification.getNotification());
            if (dtmVarF != null) {
                abnp abnpVarN2 = tba.a.n();
                abnpVarN2.getClass();
                CharSequence charSequence = dtmVarF.c;
                if (charSequence != null) {
                    String string3 = charSequence.toString();
                    abnpVarN2.t();
                    tba tbaVar = (tba) abnpVarN2.b;
                    tbaVar.b |= 1;
                    tbaVar.c = string3;
                }
                boolean zG = dtmVarF.g();
                abnpVarN2.t();
                tba tbaVar2 = (tba) abnpVarN2.b;
                tbaVar2.b |= 2;
                tbaVar2.d = zG;
                CharSequence charSequence2 = dtmVarF.b.a;
                if (charSequence2 != null) {
                    String string4 = charSequence2.toString();
                    abnpVarN2.t();
                    tba tbaVar3 = (tba) abnpVarN2.b;
                    tbaVar3.b |= 4;
                    tbaVar3.e = string4;
                }
                for (dtl dtlVar : dtmVarF.a) {
                    DesugarCollections.unmodifiableList(((tba) abnpVarN2.b).f).getClass();
                    dtlVar.getClass();
                    abnp abnpVarN3 = tbb.a.n();
                    abnpVarN3.getClass();
                    abnpVarN3.t();
                    tbb tbbVar = (tbb) abnpVarN3.b;
                    tbbVar.b |= 1;
                    duk dukVar = dtlVar.c;
                    tbbVar.c = dukVar != null;
                    if (dukVar != null) {
                        CharSequence charSequence3 = dukVar.a;
                        if (charSequence3 != null) {
                            String string5 = charSequence3.toString();
                            abnpVarN3.t();
                            tbb tbbVar2 = (tbb) abnpVarN3.b;
                            tbbVar2.b |= 2;
                            tbbVar2.d = string5;
                        }
                    } else {
                        dukVar = null;
                    }
                    String strC = c(linkedHashMap, dukVar != null ? dukVar.b : null);
                    if (strC != null) {
                        abnpVarN3.t();
                        tbb tbbVar3 = (tbb) abnpVarN3.b;
                        tbbVar3.b |= 4;
                        tbbVar3.e = strC;
                    }
                    CharSequence charSequence4 = dtlVar.a;
                    if (charSequence4 != null) {
                        String string6 = charSequence4.toString();
                        abnpVarN3.t();
                        tbb tbbVar4 = (tbb) abnpVarN3.b;
                        tbbVar4.b |= 8;
                        tbbVar4.f = string6;
                    }
                    long j = dtlVar.b;
                    abnpVarN3.t();
                    tbb tbbVar5 = (tbb) abnpVarN3.b;
                    tbbVar5.b |= 16;
                    tbbVar5.g = j;
                    String str2 = dtlVar.d;
                    if (str2 != null) {
                        abnpVarN3.t();
                        tbb tbbVar6 = (tbb) abnpVarN3.b;
                        tbbVar6.b |= 64;
                        tbbVar6.i = str2;
                    }
                    Uri uri = dtlVar.e;
                    if (uri != null && (string = uri.toString()) != null) {
                        abnpVarN3.t();
                        tbb tbbVar7 = (tbb) abnpVarN3.b;
                        tbbVar7.b |= 32;
                        tbbVar7.h = string;
                    }
                    abnv abnvVarQ = abnpVarN3.q();
                    abnvVarQ.getClass();
                    tbb tbbVar8 = (tbb) abnvVarQ;
                    abnpVarN2.t();
                    tba tbaVar4 = (tba) abnpVarN2.b;
                    aboh abohVar = tbaVar4.f;
                    if (!abohVar.c()) {
                        tbaVar4.f = abnv.I(abohVar);
                    }
                    tbaVar4.f.add(tbbVar8);
                }
                abnv abnvVarQ2 = abnpVarN2.q();
                abnvVarQ2.getClass();
                abnpVarN.t();
                tbf tbfVar12 = (tbf) abnpVarN.b;
                tbfVar12.m = (tba) abnvVarQ2;
                tbfVar12.b |= 1024;
            }
            int i = statusBarNotification.getNotification().visibility;
            abnpVarN.t();
            tbf tbfVar13 = (tbf) abnpVarN.b;
            tbfVar13.b |= 2048;
            tbfVar13.n = i;
            abnv abnvVarQ3 = abnpVarN.q();
            abnvVarQ3.getClass();
            tbfVar = (tbf) abnvVarQ3;
        } else {
            tbfVar = null;
        }
        abnp abnpVarN4 = tbc.a.n();
        abnpVarN4.getClass();
        String str3 = messagingInfo.k;
        if (str3 != null) {
            abnpVarN4.t();
            tbc tbcVar = (tbc) abnpVarN4.b;
            tbcVar.b |= 4;
            tbcVar.g = str3;
        }
        boolean z2 = messagingInfo.m;
        abnpVarN4.t();
        tbc tbcVar2 = (tbc) abnpVarN4.b;
        tbcVar2.b |= 8;
        tbcVar2.h = z2;
        String str4 = messagingInfo.f;
        if (str4 != null) {
            abnpVarN4.t();
            tbc tbcVar3 = (tbc) abnpVarN4.b;
            tbcVar3.b |= 16;
            tbcVar3.i = str4;
        }
        if (tbfVar != null) {
            abnpVarN4.t();
            tbc tbcVar4 = (tbc) abnpVarN4.b;
            tbcVar4.c = tbfVar;
            tbcVar4.b |= 1;
        }
        List<byte[]> list = messagingInfo.b;
        if (list == null) {
            list = afbe.a;
        }
        for (byte[] bArr : list) {
            DesugarCollections.unmodifiableList(((tbc) abnpVarN4.b).d).getClass();
            abms abmsVarV2 = abms.v(bArr);
            abmsVarV2.getClass();
            abnpVarN4.t();
            tbc tbcVar5 = (tbc) abnpVarN4.b;
            aboh abohVar2 = tbcVar5.d;
            if (!abohVar2.c()) {
                tbcVar5.d = abnv.I(abohVar2);
            }
            tbcVar5.d.add(abmsVarV2);
        }
        String strB2 = b(linkedHashMap, messagingInfo.l);
        if (strB2 != null) {
            abnpVarN4.t();
            tbc tbcVar6 = (tbc) abnpVarN4.b;
            tbcVar6.b |= 2;
            tbcVar6.e = strB2;
        }
        List<qjl> list2 = messagingInfo.e;
        if (list2 == null) {
            list2 = afbe.a;
        }
        for (qjl qjlVar : list2) {
            DesugarCollections.unmodifiableList(((tbc) abnpVarN4.b).f).getClass();
            abnp abnpVarN5 = taz.a.n();
            abnpVarN5.getClass();
            String str5 = qjlVar.c;
            if (str5 != null) {
                abnpVarN5.t();
                taz tazVar = (taz) abnpVarN5.b;
                tazVar.b |= 1;
                tazVar.c = str5;
            }
            String str6 = qjlVar.a;
            if (str6 != null) {
                abnpVarN5.t();
                taz tazVar2 = (taz) abnpVarN5.b;
                tazVar2.b |= 2;
                tazVar2.d = str6;
            }
            String str7 = qjlVar.e;
            if (str7 != null) {
                abnpVarN5.t();
                taz tazVar3 = (taz) abnpVarN5.b;
                tazVar3.b |= 16;
                tazVar3.g = str7;
            }
            Uri uri2 = qjlVar.f;
            if (uri2 != null) {
                String string7 = uri2.toString();
                string7.getClass();
                abnpVarN5.t();
                taz tazVar4 = (taz) abnpVarN5.b;
                tazVar4.b |= 32;
                tazVar4.h = string7;
            }
            long j2 = qjlVar.d;
            abnpVarN5.t();
            taz tazVar5 = (taz) abnpVarN5.b;
            tazVar5.b |= 4;
            tazVar5.e = j2;
            String str8 = qjlVar.b;
            if (str8 != null) {
                abnpVarN5.t();
                taz tazVar6 = (taz) abnpVarN5.b;
                tazVar6.b |= 8;
                tazVar6.f = str8;
            }
            abnv abnvVarQ4 = abnpVarN5.q();
            abnvVarQ4.getClass();
            taz tazVar7 = (taz) abnvVarQ4;
            abnpVarN4.t();
            tbc tbcVar7 = (tbc) abnpVarN4.b;
            aboh abohVar3 = tbcVar7.f;
            if (!abohVar3.c()) {
                tbcVar7.f = abnv.I(abohVar3);
            }
            tbcVar7.f.add(tazVar7);
        }
        String str9 = messagingInfo.n;
        if (str9 != null) {
            abnpVarN4.t();
            tbc tbcVar8 = (tbc) abnpVarN4.b;
            tbcVar8.b |= 32;
            tbcVar8.j = str9;
        }
        String str10 = messagingInfo.c;
        if (str10 != null) {
            abnpVarN4.t();
            tbc tbcVar9 = (tbc) abnpVarN4.b;
            tbcVar9.b |= 64;
            tbcVar9.k = str10;
        }
        abnv abnvVarQ5 = abnpVarN4.q();
        abnvVarQ5.getClass();
        tbc tbcVar10 = (tbc) abnvVarQ5;
        PendingIntent pendingIntent = messagingInfo.g;
        PendingIntent pendingIntent2 = null;
        PendingIntent pendingIntent3 = messagingInfo.i;
        PendingIntent pendingIntent4 = messagingInfo.h;
        int i2 = 0;
        RemoteInput remoteInput = messagingInfo.j;
        StatusBarNotification statusBarNotification2 = messagingInfo.a;
        if (statusBarNotification2 != null) {
            int iJ = dsr.j(statusBarNotification2.getNotification());
            while (true) {
                if (i2 >= iJ) {
                    break;
                }
                dst dstVarK = dsr.k(statusBarNotification2.getNotification(), i2);
                if (dstVarK.e == 2) {
                    pendingIntent2 = dstVarK.k;
                    break;
                }
                i2++;
            }
        }
        return new tbe(tbcVar10, new NotificationInfoParcelables(pendingIntent, pendingIntent3, pendingIntent4, remoteInput, pendingIntent2, linkedHashMap));
    }

    private static final String b(Map map, Icon icon) {
        if (icon != null) {
            return c(map, dtj.d(icon));
        }
        return null;
    }

    private static final String c(Map map, IconCompat iconCompat) {
        if (iconCompat != null) {
            try {
                IconCompat.h(iconCompat.g());
                afgr afgrVar = afgs.a;
                String strValueOf = String.valueOf(afgs.b.b());
                map.put(strValueOf, iconCompat);
                return strValueOf;
            } catch (Exception unused) {
                ((ype) a.g()).u("Error converting icon to Bundle and back");
            }
        }
        return null;
    }
}
