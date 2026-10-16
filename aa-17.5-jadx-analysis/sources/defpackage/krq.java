package defpackage;

import android.app.WallpaperColors;
import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final /* synthetic */ class krq implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ krq(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ksj ksjVar = (ksj) obj;
                krr krrVar = krr.a;
                ksjVar.getClass();
                return ksjVar.s();
            case 1:
                ksj ksjVar2 = (ksj) obj;
                krr krrVar2 = krr.a;
                ksjVar2.getClass();
                return ksjVar2.N();
            case 2:
                WallpaperColors wallpaperColorsM = cgn$$ExternalSyntheticApiModelOutline0.m(obj);
                kru kruVar = ksa.a;
                wallpaperColorsM.getClass();
                return Integer.valueOf(wallpaperColorsM.getPrimaryColor().toArgb());
            case 3:
                ((krz) obj).a.c();
                ContentResolver contentResolver = mki.a.c.getContentResolver();
                Uri uri = tcw.a;
                contentResolver.notifyChange(tcw.a, null);
                return obj;
            case 4:
                krt krtVar = (krt) obj;
                ksd ksdVar = ksd.a;
                krtVar.getClass();
                return krtVar.a;
            case 5:
                krt krtVar2 = (krt) obj;
                ksd ksdVar2 = ksd.a;
                krtVar2.getClass();
                return krtVar2.b;
            case 6:
                krt krtVar3 = (krt) obj;
                ksd ksdVar3 = ksd.a;
                krtVar3.getClass();
                return krtVar3.c;
            case 7:
                krt krtVar4 = (krt) obj;
                ksd ksdVar4 = ksd.a;
                krtVar4.getClass();
                return krtVar4.d;
            case 8:
                krt krtVar5 = (krt) obj;
                ksd ksdVar5 = ksd.a;
                krtVar5.getClass();
                return krtVar5.e;
            case 9:
                ksd ksdVar6 = ksd.a;
                ((krt) obj).getClass();
                abzz abzzVar = ksg.a;
                abzz abzzVar2 = ksg.a;
                abzzVar2.getClass();
                return abzzVar2;
            case 10:
                ksd ksdVar7 = ksd.a;
                ((krt) obj).getClass();
                abzz abzzVar3 = ksg.a;
                abzz abzzVar4 = ksg.b;
                abzzVar4.getClass();
                return abzzVar4;
            case 11:
                ksd ksdVar8 = ksd.a;
                ((krt) obj).getClass();
                abzz abzzVar5 = ksg.a;
                abzz abzzVar6 = ksg.c;
                abzzVar6.getClass();
                return abzzVar6;
            case 12:
                ksd ksdVar9 = ksd.a;
                ((krt) obj).getClass();
                abzz abzzVar7 = ksg.a;
                abzz abzzVar8 = ksg.d;
                abzzVar8.getClass();
                return abzzVar8;
            case 13:
                osx osxVar = (osx) obj;
                yph yphVar = kyw.a;
                if (osxVar != osx.LIVE_ACTIVE && osxVar != osx.LIVE_HOLD) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                qrn qrnVar = (qrn) obj;
                ldy ldyVar = ldz.a;
                qrnVar.getClass();
                return Boolean.valueOf(((lds) khc.t(new wci("GH.CieloFlags", yzz.SYSTEM_UI, yzy.oN, "Cannot access car", new Object[0]), new kur(qrnVar, 13))).f());
            case 15:
                loz lozVar = (loz) obj;
                yph yphVar2 = lpq.a;
                if (lozVar.b) {
                    if (!kmo.c(acsx.k(), lozVar.a.getPackageName())) {
                        return null;
                    }
                }
                return lozVar;
            case 16:
                loz lozVar2 = (loz) obj;
                lru lruVar = lrw.a;
                lozVar2.getClass();
                return loy.j().e(lozVar2);
            case 17:
                lru lruVar2 = lrw.a;
                return roc.as((lol) obj);
            case 18:
                lod lodVar = (lod) obj;
                lru lruVar3 = lrw.a;
                lodVar.getClass();
                return lodVar.e;
            case 19:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                lru lruVar4 = lrw.a;
                aaPlaybackState.getClass();
                return Boolean.valueOf(aaPlaybackState.Q() == 1);
            default:
                loz lozVar3 = (loz) obj;
                lru lruVar5 = lrw.a;
                lozVar3.getClass();
                return Boolean.valueOf(lozVar3.b && !affa.f(lozVar3.a, mkn.F));
        }
    }
}
