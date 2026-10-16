package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.time.Duration;

/* loaded from: classes.dex */
public final /* synthetic */ class lta implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ lta(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lod lodVar = (lod) obj;
                return lodVar != null ? lodVar.e : tby.b;
            case 1:
                lru lruVar = lrw.a;
                return obj;
            case 2:
                lte lteVar = (lte) obj;
                lteVar.getClass();
                return lteVar.a;
            case 3:
                lte lteVar2 = (lte) obj;
                lteVar2.getClass();
                return lteVar2.b;
            case 4:
                lte lteVar3 = (lte) obj;
                return lteVar3 != null ? lteVar3.c : afbe.a;
            case 5:
                loz lozVar = (loz) obj;
                Duration duration = lto.a;
                lozVar.getClass();
                return loy.j().e(lozVar);
            case 6:
                loz lozVar2 = (loz) obj;
                Duration duration2 = lto.a;
                lozVar2.getClass();
                return lozVar2.a;
            case 7:
                ComponentName componentName = (ComponentName) obj;
                Duration duration3 = lto.a;
                componentName.getClass();
                return tby.B(lpq.i().f(), new lpx(componentName, 13));
            case 8:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                aaPlaybackState.getClass();
                boolean z = false;
                if (aaPlaybackState.Q() != 1 && aaPlaybackState.Q() != 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                AaPlaybackState aaPlaybackState2 = (AaPlaybackState) obj;
                aaPlaybackState2.getClass();
                return Long.valueOf(aaPlaybackState2.R());
            case 10:
                lod lodVar2 = (lod) obj;
                lodVar2.getClass();
                return lodVar2.f;
            case 11:
                lod lodVar3 = (lod) obj;
                lodVar3.getClass();
                return lodVar3.h;
            case 12:
                lol lolVar = (lol) obj;
                lolVar.getClass();
                return lolVar.e();
            case 13:
                lmd lmdVar = (lmd) obj;
                lmdVar.getClass();
                return wub.al(lmdVar.O("android.media.metadata.DURATION"));
            case 14:
                lod lodVar4 = (lod) obj;
                lodVar4.getClass();
                return lodVar4.e;
            case 15:
                lod lodVar5 = (lod) obj;
                lodVar5.getClass();
                return lodVar5.c;
            case 16:
                return roc.as((lol) obj);
            case 17:
                ljx ljxVar = (ljx) obj;
                return Integer.valueOf(ljxVar != null ? ljxVar.h : -1);
            case 18:
                ltp ltpVar = (ltp) obj;
                ltpVar.getClass();
                return ltpVar.g();
            case 19:
                ltp ltpVar2 = (ltp) obj;
                ltpVar2.getClass();
                return ltpVar2.a();
            default:
                ltp ltpVar3 = (ltp) obj;
                ltpVar3.getClass();
                return ltpVar3.c();
        }
    }
}
