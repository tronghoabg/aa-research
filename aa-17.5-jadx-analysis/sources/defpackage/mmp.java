package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mmp implements ui {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v27, types: [afec, java.lang.Object] */
    @Override // defpackage.ui
    public final void a(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            nfp nfpVar = (nfp) nfp.d.get(i);
            ype ypeVar = (ype) mmq.f.l().ai(5068);
            Integer numValueOf = Integer.valueOf(i);
            mmq mmqVar = (mmq) this.a;
            ypeVar.R("onSettingSelected(%d): %s -> %s", numValueOf, mmqVar.g, nfpVar);
            mmqVar.g = nfpVar;
            nfo.b().c(nfpVar, yzz.SETTINGS_CAR_SCREEN_UI, kio.b().e());
            return;
        }
        if (i2 == 1) {
            mma mmaVar = mma.values()[i];
            mmo mmoVar = (mmo) this.a;
            if (mmoVar.g == mmaVar) {
                ((ype) mmo.f.l().ai((char) 5064)).y("onSettingSelected(%s): ignoring because unchanged", mmaVar);
                return;
            }
            ((ype) mmo.f.l().ai(5063)).R("onSettingSelected(%d): %s -> %s", Integer.valueOf(i), mmoVar.g, mmaVar);
            mmoVar.g = mmaVar;
            mmc.c().d(mmaVar);
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, mmaVar.e).l());
            nso nsoVarB = nsr.c().b();
            kio.b().e();
            nsoVarB.O();
            return;
        }
        if (i2 == 2) {
            if (kio.b().r()) {
                Object obj = this.a;
                jey jeyVar = jey.values()[i];
                mmr mmrVar = (mmr) obj;
                if (mmrVar.g == jeyVar) {
                    ((ype) mmr.f.l().ai((char) 5073)).y("onSettingSelected(%s): ignoring because unchanged", jeyVar);
                    return;
                }
                ((ype) mmr.f.l().ai(5072)).R("onSettingSelected(%d): %s -> %s", Integer.valueOf(i), mmrVar.g, jeyVar);
                mmrVar.g = jeyVar;
                mmc.c().e(kio.b().e(), jeyVar);
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, jeyVar.f).l());
                obs.a().f(((qw) obj).a, mkn.v, R.string.settings_takes_effect_on_restart, 1);
                return;
            }
            return;
        }
        if (i2 == 3) {
            jez jezVar = (jez) jez.d.get(i);
            ((ype) mmu.f.l().ai(5087)).R("onSettingSelected(%d): %s -> %s", Integer.valueOf(i), ((mmu) this.a).g, jezVar);
            nrc.b().c(jezVar, yzz.SETTINGS_CAR_SCREEN_UI, kio.b().e());
            return;
        }
        if (i2 != 4) {
            if (i2 != 5) {
                this.a.invoke(Integer.valueOf(i));
                return;
            }
            nfp nfpVar2 = (nfp) nfp.e.get(i);
            yop yopVarL = mmx.f.l();
            Integer numValueOf2 = Integer.valueOf(i);
            Object obj2 = this.a;
            mmx mmxVar = (mmx) obj2;
            nfp nfpVar3 = mmxVar.g;
            if (nfpVar3 == null) {
                affa.d("currentlyDisplayedSetting");
                nfpVar3 = null;
            }
            yopVarL.R("onSettingSelected(%d): %s -> %s", numValueOf2, nfpVar3, nfpVar2);
            mmxVar.g = nfpVar2;
            ((qw) obj2).j();
            nfo.b().c(nfpVar2, yzz.SETTINGS_CAR_SCREEN_UI, kio.b().e());
            return;
        }
        Object obj3 = this.a;
        mmw mmwVar = (mmw) obj3;
        if (mmwVar.h != i) {
            mmwVar.h = i;
            mme mmeVarB = mme.b();
            qrn qrnVarE = kio.b().e();
            jfd jfdVar = (jfd) jfd.d.get(i);
            yzz yzzVar = yzz.SETTINGS_CAR_SCREEN_UI;
            int iOrdinal = jfdVar.ordinal();
            if (iOrdinal == 0) {
                mmeVarB.e(qrnVarE, jfc.ON, yzzVar);
                mmeVarB.d(qrnVarE, jfb.ON, yzzVar);
            } else if (iOrdinal == 1) {
                mmeVarB.e(qrnVarE, jfc.BATTERY_OPTIMIZED, yzzVar);
                mmeVarB.d(qrnVarE, jfb.BATTERY_OPTIMIZED, yzzVar);
            } else if (iOrdinal == 2) {
                mmeVarB.e(qrnVarE, jfc.OFF, yzzVar);
                mmeVarB.d(qrnVarE, jfb.OFF, yzzVar);
            }
            qw qwVar = (qw) obj3;
            qwVar.j();
            obs.a().f(qwVar.a, mkn.v, R.string.settings_takes_effect_on_restart, 1);
        }
    }
}
