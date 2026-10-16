package defpackage;

import android.net.Uri;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final /* synthetic */ class lfn implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ lfn(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hsq hsqVar = (hsq) obj;
                hsqVar.getClass();
                return hsqVar;
            case 1:
                abqw abqwVar = (abqw) obj;
                abqwVar.getClass();
                abnp abnpVarK = abqwVar.K();
                abnpVarK.getClass();
                Instant instantNow = Instant.now();
                instantNow.getClass();
                abzi.o(abzi.q(instantNow), abnpVarK);
                return abzi.n(abnpVarK);
            case 2:
                return afak.a;
            case 3:
                loj lojVar = (loj) obj;
                lojVar.getClass();
                if (lojVar instanceof lnr) {
                    return (lnr) lojVar;
                }
                return null;
            case 4:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                boolean z = false;
                if (aaPlaybackState != null && aaPlaybackState.Q() == 3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                lmd lmdVar = (lmd) obj;
                if (lmdVar != null) {
                    return lmdVar.h().i();
                }
                return null;
            case 6:
                return afak.a;
            case 7:
                loj lojVar2 = (loj) obj;
                if (lojVar2 instanceof lnr) {
                    return (lnr) lojVar2;
                }
                return null;
            case 8:
                return roc.as((lol) obj);
            case 9:
                lod lodVar = (lod) obj;
                if (lodVar == null) {
                    return null;
                }
                return eqy.b(lodVar.f, new lfn(5));
            case 10:
                lod lodVar2 = (lod) obj;
                if (lodVar2 == null) {
                    return null;
                }
                return eqy.b(lodVar2.e, new lfn(4));
            case 11:
                lnr lnrVar = (lnr) obj;
                lnrVar.getClass();
                eqj eqjVarC = lnrVar.c();
                eqjVarC.getClass();
                return eqjVarC;
            case 12:
                return afak.a;
            case 13:
                Uri uri = (Uri) obj;
                uri.getClass();
                return uri;
            case 14:
                lod lodVar3 = (lod) obj;
                lodVar3.getClass();
                return lodVar3.e;
            case 15:
                AaPlaybackState aaPlaybackState2 = (AaPlaybackState) obj;
                aaPlaybackState2.getClass();
                return Integer.valueOf(aaPlaybackState2.Q());
            case 16:
                lol lolVar = (lol) obj;
                lolVar.getClass();
                if (lolVar instanceof lod) {
                    return (lod) lolVar;
                }
                return null;
            case 17:
                lod lodVar4 = (lod) obj;
                lodVar4.getClass();
                return tby.d(lodVar4.e, lodVar4.f, new kuu(7));
            case 18:
                loj lojVar3 = (loj) obj;
                lojVar3.getClass();
                return Boolean.valueOf(lojVar3 instanceof lor);
            case 19:
                lol lolVar2 = (lol) obj;
                lolVar2.getClass();
                if (lolVar2 instanceof lod) {
                    return (lod) lolVar2;
                }
                return null;
            default:
                lod lodVar5 = (lod) obj;
                lodVar5.getClass();
                ljx ljxVar = lodVar5.c;
                if (ljxVar != null) {
                    return Integer.valueOf(ljxVar.h);
                }
                return null;
        }
    }
}
