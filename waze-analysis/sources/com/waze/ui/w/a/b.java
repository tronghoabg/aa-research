package com.waze.ui.w.a;

import com.waze.sharedui.profile.UserProfile;
import com.waze.uid.o;
import h.g.b.x;
import l.a.aub;
import l.a.auc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b {
    public /* synthetic */ b(byte[] bArr) {
    }

    public static com.waze.uid.f.c a(UserProfile userProfile) {
        x.f(userProfile, "profile");
        return new com.waze.uid.f.c(userProfile.getUserId(), userProfile.getSocialInfo().getImageUrl(), userProfile.getSocialInfo().getMoodId(), userProfile.getBasicInfo().getUserName(), userProfile.getBasicInfo().getFirstName(), userProfile.getBasicInfo().getLastName(), userProfile.getBasicInfo().getAnonymous(), userProfile.getStatistics().getLastLoginSec(), userProfile.getBasicInfo().getPoints(), userProfile.getPlaces().getNumFavorites());
    }

    public static auc b() {
        o oVar = (o) o.f44544b.getValue();
        aub aubVarNewBuilder = auc.newBuilder();
        aubVarNewBuilder.a(oVar.d());
        aubVarNewBuilder.b(oVar.e());
        aubVarNewBuilder.c(oVar.f());
        if (oVar.i()) {
            aubVarNewBuilder.d(oVar.h());
        }
        auc aucVarBuild = aubVarNewBuilder.build();
        x.e(aucVarBuild, "build(...)");
        return aucVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.compose.ui.Modifier r25, com.waze.ui.d.s r26, h.g.a.a r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.w.a.b.c(androidx.compose.ui.Modifier, com.waze.ui.d.s, h.g.a.a, androidx.compose.runtime.Composer, int):void");
    }

    private b() {
        throw null;
    }
}
