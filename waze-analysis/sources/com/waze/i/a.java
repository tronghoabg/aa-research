package com.waze.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.SpannableStringBuilder;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.navigation.model.Lane;
import androidx.car.app.navigation.model.LaneDirection;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.navigation.model.Step;
import androidx.car.app.notification.CarAppExtender;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.car_lib.r.cb;
import com.waze.car_lib.r.cc;
import com.waze.car_lib.r.cd;
import com.waze.car_lib.r.ce;
import com.waze.n.aq;
import e.a.cn;
import e.a.cp;
import e.a.cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f24413a;

    private a() {
    }

    public static cq b() {
        cq cqVarA;
        cq cqVar = f24413a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (a.class) {
            cqVarA = f24413a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("com.waze.auth.AuthService", "getToken"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(s.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(u.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f24413a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static int c(com.waze.h.c.b bVar) {
        h.g.b.x.f(bVar, "<this>");
        com.waze.h.c.b bVar2 = com.waze.h.c.b.f24340a;
        com.waze.h.c.c cVar = com.waze.h.c.c.f24346a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            throw new IllegalArgumentException(String.valueOf(bVar.name()).concat(" is a container format and does not have a direct Android media encoding constant"));
        }
        if (iOrdinal != 2) {
            throw new h.i();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return 20;
        }
        throw new UnsupportedOperationException(String.valueOf(bVar.name()).concat(" encoding is only supported on Android R (API 30) and above"));
    }

    public static /* synthetic */ NotificationCompat.Builder d(Context context, String str, String str2, CharSequence charSequence, Bitmap bitmap, Integer num, boolean z, int i2, int i3) {
        List listH = (i3 & 128) != 0 ? h.a.i.h() : null;
        String str3 = (i3 & 256) != 0 ? "navigation" : null;
        if ((i3 & 512) != 0) {
            i2 = 4;
        }
        h.g.b.x.f(context, "context");
        h.g.b.x.f(str, "channelId");
        h.g.b.x.f(str2, "contentTitle");
        h.g.b.x.f(listH, "actions");
        h.g.b.x.f(str3, "category");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str);
        builder.setContentTitle(str2);
        builder.setContentText(charSequence);
        builder.setLargeIcon(bitmap);
        if (num != null) {
            builder.setSmallIcon(num.intValue());
        }
        builder.setCategory(str3);
        builder.setOngoing(z);
        Iterator it = listH.iterator();
        if (it.hasNext()) {
            throw null;
        }
        builder.extend(e(str2, charSequence, bitmap, num, listH, i2));
        builder.setChannelId(str);
        builder.setPriority(i2);
        return builder;
    }

    public static CarAppExtender e(String str, CharSequence charSequence, Bitmap bitmap, Integer num, List list, int i2) {
        h.g.b.x.f(str, "contentTitle");
        h.g.b.x.f(list, "actions");
        CarAppExtender.Builder builder = new CarAppExtender.Builder();
        builder.setContentTitle(str);
        if (charSequence != null) {
            builder.setContentText(charSequence);
        }
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
        builder.setImportance(i2);
        if (num != null) {
            builder.setSmallIcon(num.intValue());
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        CarAppExtender carAppExtenderBuild = builder.build();
        h.g.b.x.e(carAppExtenderBuild, "build(...)");
        return carAppExtenderBuild;
    }

    public static Step f(ce ceVar, Context context) {
        SpannableStringBuilder spannableStringBuilderC;
        h.g.b.x.f(ceVar, "<this>");
        h.g.b.x.f(context, "carContext");
        if (ceVar.g().isEmpty()) {
            spannableStringBuilderC = ceVar.c();
        } else {
            Collection<cb> collectionG = ceVar.g();
            ArrayList arrayList = new ArrayList(h.a.i.q(collectionG, 10));
            for (cb cbVar : collectionG) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cbVar.b());
                spannableStringBuilder.setSpan(CarIconSpan.create(new CarIcon.Builder(IconCompat.createWithBitmap(cbVar.a())).build()), 0, spannableStringBuilder.length(), 17);
                arrayList.add(spannableStringBuilder);
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = ((SpannableStringBuilder) next).append((CharSequence) " ").append((CharSequence) it.next());
                h.g.b.x.e(next, "append(...)");
            }
            SpannableStringBuilder spannableStringBuilderAppend = ((SpannableStringBuilder) next).append((CharSequence) " • ").append((CharSequence) ceVar.c());
            h.g.b.x.e(spannableStringBuilderAppend, "append(...)");
            spannableStringBuilderC = spannableStringBuilderAppend;
        }
        Step.Builder builder = new Step.Builder(spannableStringBuilderC);
        Maneuver.Builder builder2 = new Maneuver.Builder(ceVar.a());
        aq aqVarH = ceVar.h();
        if (aqVarH instanceof cc) {
            builder2.setIcon(new CarIcon.Builder(IconCompat.createWithResource(context, ((cc) ceVar.h()).b())).build());
        } else if (aqVarH instanceof cd) {
            builder2.setIcon(new CarIcon.Builder(IconCompat.createWithBitmap(((cd) ceVar.h()).b())).build());
        } else if (aqVarH != null) {
            throw new h.i();
        }
        Integer numD = ceVar.d();
        if (numD != null) {
            builder2.setRoundaboutExitNumber(numD.intValue());
        }
        builder.setManeuver(builder2.build());
        String strF = ceVar.f();
        if (strF != null) {
            builder.setRoad(strF);
        }
        if (ceVar.b() != null) {
            builder.setLanesImage(new CarIcon.Builder(IconCompat.createWithBitmap(ceVar.b())).build());
            Lane.Builder builder3 = new Lane.Builder();
            builder3.addDirection(LaneDirection.create(6, true));
            builder.addLane(builder3.build());
        }
        Step stepBuild = builder.build();
        h.g.b.x.e(stepBuild, "build(...)");
        return stepBuild;
    }

    public /* synthetic */ a(short[] sArr) {
    }
}
