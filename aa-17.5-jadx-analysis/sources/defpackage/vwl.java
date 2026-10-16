package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vwl extends vzk {
    public vwl(ajgu ajguVar) {
        super(ajguVar);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        ajfm ajfmVar;
        ajfm ajfmVar2;
        ajgu ajguVar = this.b;
        ajfk ajfkVar = ajguVar.m;
        if (ajfkVar == null) {
            ajfkVar = ajfk.a;
        }
        ajfn ajfnVar = ajfkVar.e;
        if (ajfnVar == null) {
            ajfnVar = ajfn.a;
        }
        if (ajfnVar.h <= 0) {
            return;
        }
        ajfk ajfkVar2 = ajguVar.m;
        if (ajfkVar2 == null) {
            ajfkVar2 = ajfk.a;
        }
        ajfn ajfnVar2 = ajfkVar2.e;
        if (ajfnVar2 == null) {
            ajfnVar2 = ajfn.a;
        }
        boolean z = ajfnVar2.j;
        long j = ajfnVar2.e;
        long j2 = z ? j : ajfnVar2.g;
        if (z) {
            if ((ajfnVar2.b & 16) == 0 || j2 < 0) {
                return;
            }
        } else if ((ajfnVar2.b & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 || j2 < 0) {
            return;
        }
        long j3 = ajfnVar2.c;
        boolean z2 = z && (ajfnVar2.b & 2) != 0 && j3 >= 0;
        if (z2 && j3 <= j) {
            rjuVar.y("CSU", vzk.a.matcher("AppClassLoadedFromProcessCreation").replaceAll(""), Long.valueOf(j - j3));
        }
        long j4 = ajfnVar2.h;
        String str = true != z ? "Warm startup" : "Cold startup";
        Pattern pattern = vzk.a;
        boolean z3 = z2;
        rjuVar.y("DMS", pattern.matcher(str).replaceAll(""), Long.valueOf(j4 - j2));
        if (z) {
            ajfm ajfmVar3 = ajfnVar2.k;
            if (ajfmVar3 == null) {
                ajfmVar3 = ajfm.a;
            }
            if ((ajfmVar3.b & 8) != 0) {
                long j5 = (ajfnVar2.b & 4) != 0 ? ajfnVar2.d : j2;
                String strReplaceAll = pattern.matcher("ColdLaunch").replaceAll("");
                long j6 = j5;
                ajfm ajfmVar4 = ajfnVar2.k;
                if (ajfmVar4 == null) {
                    ajfmVar4 = ajfm.a;
                }
                rjuVar.y("DMS", strReplaceAll, Long.valueOf(ajfmVar4.e - j6));
            }
        }
        if (z3 && j3 <= j4) {
            rjuVar.y("CSU", pattern.matcher("FromProcessCreation").replaceAll(""), Long.valueOf(j4 - j3));
        }
        long j7 = ajfnVar2.i;
        boolean z4 = j7 < ajfnVar2.h;
        rjuVar.y("DMS", pattern.matcher(z4 ? true != z ? "Warm startup interactive before onDraw" : "Cold startup interactive before onDraw" : true != z ? "Warm startup interactive" : "Cold startup interactive").replaceAll(""), Long.valueOf(j7 - j2));
        if (z3 && j3 <= j7) {
            rjuVar.y("CSU", pattern.matcher(true != z4 ? "InteractiveFromProcessCreation" : "InteractiveFromProcessCreationBeforeOnDraw").replaceAll(""), Long.valueOf(j7 - j3));
        }
        if (!z) {
            ajfm ajfmVar5 = ajfnVar2.l;
            if (ajfmVar5 == null) {
                ajfmVar5 = ajfm.a;
            }
            if ((ajfmVar5.b & 4) != 0) {
                ajfmVar2 = ajfnVar2.l;
                if (ajfmVar2 == null) {
                    ajfmVar2 = ajfm.a;
                }
            } else {
                ajfmVar2 = ajfnVar2.k;
                if (ajfmVar2 == null) {
                    ajfmVar2 = ajfm.a;
                }
            }
            if ((ajfmVar2.b & 4) != 0) {
                rjuVar.y("DMS", pattern.matcher("Warm startup activity onStart").replaceAll(""), Long.valueOf(ajfnVar2.h - ajfmVar2.d));
            }
        }
        long j8 = ajfnVar2.f;
        if (z && (ajfnVar2.b & 128) != 0 && j <= j8) {
            rjuVar.y("DMS", pattern.matcher("Cold startup AppLoad, App#onCreate").replaceAll(""), Long.valueOf(j8 - j));
        }
        long j9 = ajfnVar2.g;
        if (z && (ajfnVar2.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 && j8 <= j9) {
            rjuVar.y("DMS", pattern.matcher("Cold startup App#onCreate, Activity Initialization").replaceAll(""), Long.valueOf(j9 - j8));
        }
        ajfm ajfmVar6 = ajfnVar2.l;
        if (ajfmVar6 == null) {
            ajfmVar6 = ajfm.a;
        }
        if ((ajfmVar6.b & 2) != 0) {
            ajfmVar = ajfnVar2.l;
            if (ajfmVar == null) {
                ajfmVar = ajfm.a;
            }
        } else {
            ajfmVar = ajfnVar2.k;
            if (ajfmVar == null) {
                ajfmVar = ajfm.a;
            }
        }
        String str2 = true != z ? "Warm startup" : "Cold startup";
        long j10 = ajfmVar.c;
        if ((ajfmVar.b & 2) != 0 && j8 <= j10) {
            rjuVar.y("DMS", pattern.matcher(str2.concat("App#onCreate, Activity#onCreate")).replaceAll(""), Long.valueOf(j10 - j8));
        }
        long j11 = ajfmVar.d;
        if ((ajfmVar.b & 4) != 0 && j10 <= j11) {
            rjuVar.y("DMS", pattern.matcher(str2.concat("Activity#onCreate, Activity#onStart")).replaceAll(""), Long.valueOf(j11 - j10));
        }
        long j12 = ajfmVar.e;
        if ((ajfmVar.b & 8) != 0 && j11 <= j12) {
            rjuVar.y("DMS", pattern.matcher(str2.concat("Activity#onStart, Activity#onResume")).replaceAll(""), Long.valueOf(j12 - j11));
        }
        long j13 = ajfnVar2.h;
        if (j12 <= j13) {
            rjuVar.y("DMS", pattern.matcher(str2.concat("Activity#onResume, Activity#onDraw")).replaceAll(""), Long.valueOf(j13 - j12));
        }
    }
}
