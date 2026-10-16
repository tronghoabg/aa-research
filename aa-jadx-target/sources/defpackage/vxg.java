package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxg extends defpackage.wag {
    public vxg(ajht ajhtVar) {
        super(ajhtVar);
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        java.lang.String str;
        ajgl ajglVar;
        ajgl ajglVar2;
        ajht ajhtVar = this.b;
        ajgj ajgjVar = ajhtVar.m;
        if (ajgjVar == null) {
            ajgjVar = ajgj.a;
        }
        ajgm ajgmVar = ajgjVar.e;
        if (ajgmVar == null) {
            ajgmVar = ajgm.a;
        }
        if (ajgmVar.h <= 0) {
            return;
        }
        ajgj ajgjVar2 = ajhtVar.m;
        if (ajgjVar2 == null) {
            ajgjVar2 = ajgj.a;
        }
        ajgm ajgmVar2 = ajgjVar2.e;
        if (ajgmVar2 == null) {
            ajgmVar2 = ajgm.a;
        }
        boolean z = ajgmVar2.j;
        long j = ajgmVar2.e;
        long j2 = z ? j : ajgmVar2.g;
        if (z) {
            if ((ajgmVar2.b & 16) == 0 || j2 < 0) {
                return;
            }
        } else if ((ajgmVar2.b & 512) == 0 || j2 < 0) {
            return;
        }
        long j3 = ajgmVar2.c;
        boolean z2 = z && (ajgmVar2.b & 2) != 0 && j3 >= 0;
        if (z2 && j3 <= j) {
            rkqVar.y("CSU", defpackage.wag.a.matcher("AppClassLoadedFromProcessCreation").replaceAll(""), java.lang.Long.valueOf(j - j3));
        }
        long j4 = ajgmVar2.h;
        java.lang.CharSequence charSequence = true != z ? "Warm startup" : "Cold startup";
        java.util.regex.Pattern pattern = defpackage.wag.a;
        boolean z3 = z2;
        rkqVar.y("DMS", pattern.matcher(charSequence).replaceAll(""), java.lang.Long.valueOf(j4 - j2));
        if (z) {
            ajgl ajglVar3 = ajgmVar2.k;
            if (ajglVar3 == null) {
                ajglVar3 = ajgl.a;
            }
            if ((ajglVar3.b & 8) != 0) {
                long j5 = (ajgmVar2.b & 4) != 0 ? ajgmVar2.d : j2;
                java.lang.String strReplaceAll = pattern.matcher("ColdLaunch").replaceAll("");
                long j6 = j5;
                ajgl ajglVar4 = ajgmVar2.k;
                if (ajglVar4 == null) {
                    ajglVar4 = ajgl.a;
                }
                rkqVar.y("DMS", strReplaceAll, java.lang.Long.valueOf(ajglVar4.e - j6));
            }
        }
        if (z3 && j3 <= j4) {
            rkqVar.y("CSU", pattern.matcher("FromProcessCreation").replaceAll(""), java.lang.Long.valueOf(j4 - j3));
        }
        long j7 = ajgmVar2.i;
        boolean z4 = j7 < ajgmVar2.h;
        if (z4) {
            str = true != z ? "Warm startup interactive before onDraw" : "Cold startup interactive before onDraw";
        } else {
            str = true != z ? "Warm startup interactive" : "Cold startup interactive";
        }
        rkqVar.y("DMS", pattern.matcher(str).replaceAll(""), java.lang.Long.valueOf(j7 - j2));
        if (z3 && j3 <= j7) {
            rkqVar.y("CSU", pattern.matcher(true != z4 ? "InteractiveFromProcessCreation" : "InteractiveFromProcessCreationBeforeOnDraw").replaceAll(""), java.lang.Long.valueOf(j7 - j3));
        }
        if (!z) {
            ajgl ajglVar5 = ajgmVar2.l;
            if (ajglVar5 == null) {
                ajglVar5 = ajgl.a;
            }
            if ((ajglVar5.b & 4) != 0) {
                ajglVar2 = ajgmVar2.l;
                if (ajglVar2 == null) {
                    ajglVar2 = ajgl.a;
                }
            } else {
                ajglVar2 = ajgmVar2.k;
                if (ajglVar2 == null) {
                    ajglVar2 = ajgl.a;
                }
            }
            if ((ajglVar2.b & 4) != 0) {
                rkqVar.y("DMS", pattern.matcher("Warm startup activity onStart").replaceAll(""), java.lang.Long.valueOf(ajgmVar2.h - ajglVar2.d));
            }
        }
        long j8 = ajgmVar2.f;
        if (z && (ajgmVar2.b & 128) != 0 && j <= j8) {
            rkqVar.y("DMS", pattern.matcher("Cold startup AppLoad, App#onCreate").replaceAll(""), java.lang.Long.valueOf(j8 - j));
        }
        long j9 = ajgmVar2.g;
        if (z && (ajgmVar2.b & 512) != 0 && j8 <= j9) {
            rkqVar.y("DMS", pattern.matcher("Cold startup App#onCreate, Activity Initialization").replaceAll(""), java.lang.Long.valueOf(j9 - j8));
        }
        ajgl ajglVar6 = ajgmVar2.l;
        if (ajglVar6 == null) {
            ajglVar6 = ajgl.a;
        }
        if ((ajglVar6.b & 2) != 0) {
            ajglVar = ajgmVar2.l;
            if (ajglVar == null) {
                ajglVar = ajgl.a;
            }
        } else {
            ajglVar = ajgmVar2.k;
            if (ajglVar == null) {
                ajglVar = ajgl.a;
            }
        }
        java.lang.String str2 = true != z ? "Warm startup" : "Cold startup";
        long j10 = ajglVar.c;
        if ((ajglVar.b & 2) != 0 && j8 <= j10) {
            rkqVar.y("DMS", pattern.matcher(str2.concat("App#onCreate, Activity#onCreate")).replaceAll(""), java.lang.Long.valueOf(j10 - j8));
        }
        long j11 = ajglVar.d;
        if ((ajglVar.b & 4) != 0 && j10 <= j11) {
            rkqVar.y("DMS", pattern.matcher(str2.concat("Activity#onCreate, Activity#onStart")).replaceAll(""), java.lang.Long.valueOf(j11 - j10));
        }
        long j12 = ajglVar.e;
        if ((ajglVar.b & 8) != 0 && j11 <= j12) {
            rkqVar.y("DMS", pattern.matcher(str2.concat("Activity#onStart, Activity#onResume")).replaceAll(""), java.lang.Long.valueOf(j12 - j11));
        }
        long j13 = ajgmVar2.h;
        if (j12 <= j13) {
            rkqVar.y("DMS", pattern.matcher(str2.concat("Activity#onResume, Activity#onDraw")).replaceAll(""), java.lang.Long.valueOf(j13 - j12));
        }
    }
}
