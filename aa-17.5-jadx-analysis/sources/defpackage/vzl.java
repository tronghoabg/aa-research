package defpackage;

import android.content.ContentResolver;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vzl implements vyv {
    private final boolean a;
    private final boolean b;
    private final pie c;

    public vzl(ContentResolver contentResolver, boolean z, boolean z2) {
        this.c = new pie(contentResolver, "primes." + Process.myPid() + "." + System.currentTimeMillis());
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.vyv
    public final /* synthetic */ vyu a() {
        return vyu.a;
    }

    @Override // defpackage.vyv
    public final zgp b(ajgu ajguVar) {
        String str;
        ajguVar.getClass();
        acks acksVar = new acks(ajguVar);
        ygr<vzk> ygrVarT = ygr.t((vzk) ackq.c(new vrc(acksVar, 0)).a(), (vzk) ackq.c(new vrc(acksVar, 10)).a(), (vzk) ackq.c(new vrc(acksVar, 11)).a(), (vzk) ackq.c(new vrc(acksVar, 12)).a(), (vzk) ackq.c(new vrc(acksVar, 14)).a(), (vzk) ackq.c(new vrc(acksVar, 16)).a(), (vzk) ackq.c(new vrc(acksVar, 17)).a(), (vzk) ackq.c(new vrc(acksVar, 18)).a());
        nsy nsyVar = new nsy((byte[]) null);
        for (vzk vzkVar : ygrVarT) {
            nsy nsyVar2 = new nsy((byte[]) null);
            String strB = vzkVar.b();
            vzkVar.a(new rju(nsyVar2, strB, this.a));
            if (!nsyVar2.d()) {
                if (!TextUtils.isEmpty(strB)) {
                    if (this.b) {
                        nsyVar2.f("metadata:tag", "evt=".concat(String.valueOf(strB)));
                    }
                    nsyVar2.f("CEN", strB);
                }
                Object obj = nsyVar.a;
                aboh abohVar = nsyVar2.c(-1L).d;
                abnp abnpVar = (abnp) obj;
                abnpVar.t();
                abzn abznVar = (abzn) abnpVar.b;
                abznVar.b();
                abmc.i(abohVar, abznVar.d);
            }
        }
        if (!nsyVar.d()) {
            pie pieVar = this.c;
            if ((ajguVar.b & 4194304) != 0) {
                ajgc ajgcVar = ajguVar.z;
                if (ajgcVar == null) {
                    ajgcVar = ajgc.a;
                }
                if ((ajgcVar.b & 1) != 0) {
                    ajgc ajgcVar2 = ajguVar.z;
                    if (ajgcVar2 == null) {
                        ajgcVar2 = ajgc.a;
                    }
                    str = ajgcVar2.c;
                } else {
                    str = null;
                }
                ajfe ajfeVar = ajguVar.f;
                if (ajfeVar == null) {
                    ajfeVar = ajfe.a;
                }
                ajfx ajfxVar = ajfeVar.d;
                if (ajfxVar == null) {
                    ajfxVar = ajfx.a;
                }
                ajfw ajfwVar = ajfxVar.c;
                if (ajfwVar == null) {
                    ajfwVar = ajfw.a;
                }
                strB = (ajfwVar.b & 8) != 0 ? vqs.b(str, ajfwVar.f) : null;
                if (strB == null) {
                    ajgc ajgcVar3 = ajguVar.z;
                    if (((ajgcVar3 == null ? ajgc.a : ajgcVar3).b & 16) != 0) {
                        if (ajgcVar3 == null) {
                            ajgcVar3 = ajgc.a;
                        }
                        strB = ajgcVar3.g;
                    } else if (str != null) {
                        strB = str;
                    }
                }
            }
            if (strB != null) {
                nsyVar.f("metadata:tag", "process=".concat(strB));
            }
            nsyVar.f("metadata:tag", "sdk=" + Build.VERSION.SDK_INT);
            nsyVar.f("metadata:tag", "model=".concat(String.valueOf(Build.MODEL.replace(' ', '_'))));
            nsyVar.f("metadata:tag", "source=Primes");
            long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            Long.valueOf(micros).getClass();
            pieVar.a(nsyVar, micros);
        }
        return zgl.a;
    }
}
